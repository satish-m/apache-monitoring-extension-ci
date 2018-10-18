DOCKER_COMPOSE=docker-compose
DOCKER_RUN=$(DOCKER_COMPOSE) up -d
DOCKER_STOP=$(DOCKER_COMPOSE) down
dockerRun: ## Run MA in docker
	@echo Build artifact /repository/download/ApacheMonitoringExtensionCi_Compile_Test_Java8/.lastFinished/ApacheMonitor-*.zip
	@echo starting container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
	${DOCKER_RUN}
	@echo started container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
