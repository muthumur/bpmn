
package com.migrationwar;

import java.util.logging.Logger;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication(name = "TestWorkflow")
public class CamundaProcessApplication extends ServletProcessApplication {
	public final static Logger LOGGER = Logger.getLogger(CamundaProcessApplication.class.getName());

	@PostDeploy
	public void startProcessInstance(ProcessEngine processEngine) {

		LOGGER.info("MARKER:SpringBootWarMigration Deployed Successfully............");
		System.out.println("MARKER:SpringBootWarMigration Deployed Successfully............");
		//processEngine.getRuntimeService().startProcessInstanceByKey("TestWorkflow");

	}

}
