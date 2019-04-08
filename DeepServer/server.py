from multiprocessing.pool import ThreadPool
from socket import *
from select import select
import sys
import time


def get_open_port():
    s = socket(AF_INET, SOCK_STREAM)
    s.bind(('', 0))
    s.listen(1)
    port = s.getsockname()
    s.close()
    return port


class ServerService:

    def __init__(self):
        self.host = '127.0.0.1'
        self.port = 10380  # get_open_port()[1]
        print(self.port)
        self.buffer_size = 1024
        self.server_socket = socket(AF_INET, SOCK_STREAM)

        try:
            self.server_socket.bind((self.host, self.port))
            self.server_socket.listen()
            self.server_socket.accept()
            while True:
                time.sleep(3)
                print('Send to client!')
                self.server_socket.sendall(bytes("Hello, Client!\n", 'UTF-8'))
                print('Recv :', self.server_socket.recv(self.buffer_size).decode())
            self.server_socket.close()
        except Exception as e:
            print('ERROR:', e)

if __name__ == '__main__':
    print(__name__)
    service = ServerService()


