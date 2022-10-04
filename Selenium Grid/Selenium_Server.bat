start java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hubconfig.json

start java -jar -Dwebdriver.chrome.driver="chromedriver.exe" -Dwebdriver.gecko.driver="geckodriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -id Node1 -nodeConfig nodeConfig_1.json
start java -jar -Dwebdriver.chrome.driver="chromedriver.exe" -Dwebdriver.gecko.driver="geckodriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -id Node2 -nodeConfig nodeConfig_2.json