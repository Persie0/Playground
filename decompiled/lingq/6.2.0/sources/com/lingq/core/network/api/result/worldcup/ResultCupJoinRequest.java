package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupJoinRequest {
    public static final C1764i Companion = new C1764i();

    /* JADX INFO: renamed from: a */
    public final String f21772a;

    /* JADX INFO: renamed from: b */
    public final boolean f21773b;

    public /* synthetic */ ResultCupJoinRequest(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, ResultCupJoinRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21772a = str;
        this.f21773b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupJoinRequest)) {
            return false;
        }
        ResultCupJoinRequest resultCupJoinRequest = (ResultCupJoinRequest) obj;
        return fa4.m11650l(this.f21772a, resultCupJoinRequest.f21772a) && this.f21773b == resultCupJoinRequest.f21773b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21773b) + (this.f21772a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultCupJoinRequest(language=" + this.f21772a + ", notifications=" + this.f21773b + ")";
    }

    public ResultCupJoinRequest(String str, boolean z) {
        str.getClass();
        this.f21772a = str;
        this.f21773b = z;
    }
}
