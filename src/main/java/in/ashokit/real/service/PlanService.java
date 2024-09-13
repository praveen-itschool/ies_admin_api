package in.ashokit.real.service;

import java.util.List;

import in.ashokit.real.binding.PlanForm;

public interface PlanService {
	public boolean createPlan(PlanForm planForm);

	public List<PlanForm> getPlans();

	public PlanForm getEditPlanById(Integer Id);

	public String changePlanStatus(Integer planId, String status);
}
