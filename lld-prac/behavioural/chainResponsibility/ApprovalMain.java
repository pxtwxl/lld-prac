package org.behavioural.chainResponsibility;

public class ApprovalMain {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver teamLead = new TeamLead();
        Approver director = new Director();

        int leaves = 2;

        if (leaves == 1) {
            teamLead.processLeaveRequest(leaves);
        } else if (leaves <= 3) {
            teamLead.setNextApprover(manager);
            manager.processLeaveRequest(leaves);
        } else {
            manager.setNextApprover(director);
            director.processLeaveRequest(leaves);
        }
    }
}
