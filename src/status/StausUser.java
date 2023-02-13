/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
class StausUser {
    public void statusDetail(String code) {
        UserStatus status = null;
        switch (code.toUpperCase()) {
            default:
                System.out.println("NOT VALID CODE");
                return;
            case "ONE":
                status = UserStatus.PENDING;
                break;
            case "TWO":
                status = UserStatus.PROCESSING;
                break;
            case "THREE":
                status = UserStatus.APPROVED;
                break;
            case "ZERO":
                status = UserStatus.REJECTED;
                break;
        }
        System.out.println(status);
    }
}
