package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultProfileMessage {
    public static final C1682k3 Companion = new C1682k3();

    /* JADX INFO: renamed from: a */
    public final MessageProfile f21469a;

    /* JADX INFO: renamed from: b */
    public final String f21470b;

    public /* synthetic */ ResultProfileMessage(int i, MessageProfile messageProfile, String str) {
        if ((i & 1) == 0) {
            this.f21469a = null;
        } else {
            this.f21469a = messageProfile;
        }
        if ((i & 2) == 0) {
            this.f21470b = null;
        } else {
            this.f21470b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultProfileMessage)) {
            return false;
        }
        ResultProfileMessage resultProfileMessage = (ResultProfileMessage) obj;
        return fa4.m11650l(this.f21469a, resultProfileMessage.f21469a) && fa4.m11650l(this.f21470b, resultProfileMessage.f21470b);
    }

    public final int hashCode() {
        MessageProfile messageProfile = this.f21469a;
        int iHashCode = (messageProfile == null ? 0 : messageProfile.hashCode()) * 31;
        String str = this.f21470b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ResultProfileMessage(message=" + this.f21469a + ", type=" + this.f21470b + ")";
    }
}
