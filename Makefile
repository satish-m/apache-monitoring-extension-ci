DOCKER_COMPOSE=docker-compose
DOCKER_RUN=$(DOCKER_COMPOSE) up -d --build
DOCKER_STOP=$(DOCKER_COMPOSE) down
dockerRun: ## Run MA in docker
	@echo Build artifact ${BUILD_FILE}
	@echo starting container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
	${DOCKER_RUN}
	@echo started container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&