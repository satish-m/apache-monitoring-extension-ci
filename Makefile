dockerRun: ## Run MA in docker
	@echo starting container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
	docker run -d \
        -e APPDYNAMICS_CONTROLLER_HOST_NAME=192.168.1.8 \
        -e APPDYNAMICS_CONTROLLER_PORT=8090 \
        -e APPDYNAMICS_CONTROLLER_SSL_ENABLED=false \
        -e APPDYNAMICS_AGENT_ACCOUNT_NAME=customer1 \
        -e APPDYNAMICS_AGENT_ACCOUNT_ACCESS_KEY=65d3e1cb-d305-4876-95f8-3b67a92371f2 \
        -e MACHINE_AGENT_PROPERTIES="-Dappdynamics.sim.enabled=true -Dappdynamics.docker.enabled=true" \
        -v /:/hostroot:ro -v /var/run/docker.sock:/var/run/docker.sock \
        appdynamics/machine:4.4
	@echo started container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&