package com.lingq.core.network.api.requests;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.tx5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLessonUpdateTimestamps {
    public static final C1574g0 Companion = new C1574g0();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f20399c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(26))};

    /* JADX INFO: renamed from: a */
    public final Integer f20400a;

    /* JADX INFO: renamed from: b */
    public final List f20401b;

    public /* synthetic */ RequestLessonUpdateTimestamps(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f20400a = null;
        } else {
            this.f20400a = num;
        }
        if ((i & 2) == 0) {
            this.f20401b = null;
        } else {
            this.f20401b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLessonUpdateTimestamps)) {
            return false;
        }
        RequestLessonUpdateTimestamps requestLessonUpdateTimestamps = (RequestLessonUpdateTimestamps) obj;
        return fa4.m11650l(this.f20400a, requestLessonUpdateTimestamps.f20400a) && fa4.m11650l(this.f20401b, requestLessonUpdateTimestamps.f20401b);
    }

    public final int hashCode() {
        Integer num = this.f20400a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f20401b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RequestLessonUpdateTimestamps(index=" + this.f20400a + ", timestamp=" + this.f20401b + ")";
    }
}
