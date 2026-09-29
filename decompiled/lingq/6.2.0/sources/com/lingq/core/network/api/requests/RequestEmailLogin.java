package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestEmailLogin {
    public static final C1596r Companion = new C1596r();

    /* JADX INFO: renamed from: a */
    public String f20357a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestEmailLogin) && fa4.m11650l(this.f20357a, ((RequestEmailLogin) obj).f20357a);
    }

    public final int hashCode() {
        String str = this.f20357a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestEmailLogin(email=", this.f20357a, ")");
    }
}
