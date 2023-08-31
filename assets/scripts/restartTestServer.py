import requests
import os
from dotenv import load_dotenv

load_dotenv()

SERVER_IP=os.getenv('SERVER_IP')
SERVER_HTTP_PORT=os.getenv('SERVER_HTTP_PORT')

r = requests.post(f'http://{SERVER_IP}:{SERVER_HTTP_PORT}/restart')

print(r.text)