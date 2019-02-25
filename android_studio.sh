# Installing JVM
cd
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer

# Installing android studio in system
wget https://dl.google.com/dl/android/studio/ide-zips/3.3.1.0/android-studio-ide-182.5264788-linux.zip
sudo unzip android-studio-ide-182.5264788-linux.zip -d /opt

# Adding that directory to path
export PATH=$PATH:/opt/android-studio/bin
source ~/.profile

reboot