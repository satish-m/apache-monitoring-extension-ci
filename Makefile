DOCKER_COMPOSE=docker-compose
DOCKER_RUN=$(DOCKER_COMPOSE) up -d
DOCKER_STOP=$(DOCKER_COMPOSE) down
dockerRun: ## Run MA in docker
    @echo Build artifact /repository/download/BUILD_TYPE_EXT_ID/.lastFinished/ApacheMonitor-*.zip
	@echo starting container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
	${DOCKER_RUN}
	@echo started container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
