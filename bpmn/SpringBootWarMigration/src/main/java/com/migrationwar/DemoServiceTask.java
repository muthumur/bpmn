package com.migrationwar;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DemoServiceTask implements JavaDelegate {

	public final static Logger LOGGER = Logger.getLogger(DemoServiceTask.class.getName());

	public void execute(DelegateExecution execution) throws Exception {

		//for debug
		System.out.println("MARKER:DemoServiceTask Delegate Called Successfully...");

		LOGGER.info("MARKER:DemoServiceTask Delegate Called Successfully...");

	}

}
