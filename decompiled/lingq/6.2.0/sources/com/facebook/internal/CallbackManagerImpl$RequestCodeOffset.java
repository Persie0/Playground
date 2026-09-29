package com.facebook.internal;

import p000.eda;
import p000.sy2;

/* JADX INFO: loaded from: classes2.dex */
public enum CallbackManagerImpl$RequestCodeOffset {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15),
    TournamentJoinDialog(16);

    private final int offset;

    CallbackManagerImpl$RequestCodeOffset(int i) {
        this.offset = i;
    }

    public final int toRequestCode() {
        sy2 sy2Var = sy2.f61585a;
        eda.m11074g();
        return sy2.f61595k + this.offset;
    }
}
