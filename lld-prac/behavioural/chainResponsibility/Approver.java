package org.behavioural.chainResponsibility;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processLeaveRequest(int leaves);
}

class TeamLead extends Approver {
    @Override
    public void processLeaveRequest(int leaves) {
        if(leaves == 1) {
            System.out.println("Leave approved by team lead");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leaves);
        }
    }
}

class Manager extends Approver {
    @Override
    public void processLeaveRequest(int leaves) {
        if(leaves <= 3) {
            System.out.println("Leave approved by Manager");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leaves);
        }
    }
}

class Director extends Approver {
    @Override
    public void processLeaveRequest(int leaves) {
        if(leaves <= 10) {
            System.out.println("Leave approved by Director");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leaves);
        } else {
            System.out.println("Cannot approve request");
        }
    }
}
