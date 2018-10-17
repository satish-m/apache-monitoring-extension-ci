DOCKER_COMPOSE=docker-compose
DOCKER_RUN=$(DOCKER_COMPOSE) uo -d
DOCKER_STOP=$(DOCKER_COMPOSE) down
dockerRun: ## Run MA in docker
	@echo starting container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&
	${DOCKER_RUN}
	@echo started container ##################%%%%%%%%%%%%%%%%%%%&&&&&&&&&&&&&&&&&&&&&&