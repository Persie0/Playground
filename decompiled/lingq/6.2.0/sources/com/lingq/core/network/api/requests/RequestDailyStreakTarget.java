package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestDailyStreakTarget {
    public static final C1588n Companion = new C1588n();

    /* JADX INFO: renamed from: a */
    public final String f20342a;

    /* JADX INFO: renamed from: b */
    public final Integer f20343b;

    public /* synthetic */ RequestDailyStreakTarget(int i, Integer num, String str) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, RequestDailyStreakTarget$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20342a = str;
        if ((i & 2) == 0) {
            this.f20343b = null;
        } else {
            this.f20343b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestDailyStreakTarget)) {
            return false;
        }
        RequestDailyStreakTarget requestDailyStreakTarget = (RequestDailyStreakTarget) obj;
        return fa4.m11650l(this.f20342a, requestDailyStreakTarget.f20342a) && fa4.m11650l(this.f20343b, requestDailyStreakTarget.f20343b);
    }

    public final int hashCode() {
        int iHashCode = this.f20342a.hashCode() * 31;
        Integer num = this.f20343b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RequestDailyStreakTarget(intense=" + this.f20342a + ", streakGoal=" + this.f20343b + ")";
    }

    public RequestDailyStreakTarget(Integer num, String str) {
        str.getClass();
        this.f20342a = str;
        this.f20343b = num;
    }
}
