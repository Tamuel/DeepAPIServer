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


class ClientService:

    def __init__(self):
        self.host = '127.0.0.1'
        self.port = 10380
        print(self.port)
        self.buffer_size = 1024
        self.client_socket = socket(AF_INET, SOCK_STREAM)

        try:
            self.client_socket.connect((self.host, self.port))
            while True:
                time.sleep(3)
                print('Send to server!')
                self.client_socket.send(bytes("Hello, Server!\n", 'UTF-8'))
                print('Recv :', self.client_socket.recv(self.buffer_size).decode())
            self.client_socket.close()
        except Exception as e:
            print('ERROR:', e)

if __name__ == '__main__':
    print(__name__)
    service = ClientService()