import requests

print('Ch1 for screen, Ch2 for camera')
curlstring = input('cURL (bash): ')
splited = curlstring.split("'")
url = splited[1]
header = {}
for i in range(3, len(splited)):
    if i % 2 == 0: continue
    t = splited[i].split(': ')
    header[t[0]] = t[1]
filename = splited[1].split('?')[0].split('/')[-1]

header['Range'] = 'bytes=' + '0' + '-'
response = requests.get(url, headers=header)

f = open(filename, 'wb')
f.write(response.content)
f.close()