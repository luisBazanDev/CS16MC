import ftplib
import os
from dotenv import load_dotenv

load_dotenv()

FTP_HOST=os.getenv('FTP_HOST')
FTP_PORT=int(os.getenv('FTP_PORT'))
FTP_USER=os.getenv('FTP_USER')
FTP_PASSWORD=os.getenv('FTP_PASSWORD')

pluginName = "CS16MC-1.0.jar"

# Conenct to server
ftp = ftplib.FTP()
ftp.connect(FTP_HOST, FTP_PORT)
print (ftp.getwelcome())

file=open("target/"+pluginName, "rb")

# Upload file
try:
  print ("Logging in...")
  ftp.login(FTP_USER, FTP_PASSWORD)
  print("Logged. Uploading file...")
  ftp.storbinary(f'STOR /plugins/'+pluginName, file)
  print('File Uploaded!')
  ftp.quit()
except:
  "failed to login"