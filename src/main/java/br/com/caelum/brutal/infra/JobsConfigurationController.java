package br.com.caelum.brutal.infra;

import org.quartz.SchedulerException;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.quartzjob.QuartzController;

@Resource
public class JobsConfigurationController {
	static final String CONFIG_PATH = "/configureJobs";
	
	private final QuartzController controller;

	private final Result result;

	public JobsConfigurationController(QuartzController controller, Result result) {
		this.controller = controller;
		this.result = result;
	}
	

	@Get(CONFIG_PATH)
	public void configure() throws SchedulerException {
		controller.config();
		result.nothing();
	}
	

}