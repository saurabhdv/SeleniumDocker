# SeleniumDocker
#docker-selenium - test using docker selenium images 

pull and run chrome image - you can choose other options here https://github.com/SeleniumHQ/docker-selenium

docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-beta-1-prerelease-20201208


I prefer using #Zalenium Images which works well for grid and Kubernetes support 

    # Pull docker-selenium
    docker pull elgalu/selenium
    
    # Pull Zalenium
    docker pull dosel/zalenium
    
    # Run it!
    docker run --rm -ti --name zalenium -p 4444:4444 \
      -v /var/run/docker.sock:/var/run/docker.sock \
      -v /tmp/videos:/home/seluser/videos \
      --privileged dosel/zalenium start
      
    # Point your tests to http://localhost:4444/wd/hub and run them - here in my case i ad it running in VM so i access as  http://192.168.80.134:4444/wd/hub & http://192.168.80.134:4444/dashboard/#
    
to view live test run USE http://localhost:4444/grid/admin/live
