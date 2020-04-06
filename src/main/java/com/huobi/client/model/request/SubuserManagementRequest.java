package com.huobi.client.model.request;

import com.huobi.client.model.enums.SubuserManagementAction;

public class SubuserManagementRequest {

    private Long subUid;
    private SubuserManagementAction action;

    private SubuserManagementRequest() {
    }

    public SubuserManagementRequest(Long subUid, SubuserManagementAction action) {
        this.subUid = subUid;
        this.action = action;
    }

    public static SubuserManagementRequest lock(Long subUid) {
        return new SubuserManagementRequest(subUid, SubuserManagementAction.LOCK);
    }

    public static SubuserManagementRequest unlock(Long subUid) {
        return new SubuserManagementRequest(subUid, SubuserManagementAction.UNLOCK);
    }

    public Long getSubUid() {
        return subUid;
    }

    public SubuserManagementAction getAction() {
        return action;
    }
}
