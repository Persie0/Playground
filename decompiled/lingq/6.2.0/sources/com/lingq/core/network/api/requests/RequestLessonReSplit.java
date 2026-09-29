package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLessonReSplit {
    public static final C1565d0 Companion = new C1565d0();

    /* JADX INFO: renamed from: a */
    public final String f20393a;

    public /* synthetic */ RequestLessonReSplit(int i, String str) {
        if ((i & 1) == 0) {
            this.f20393a = null;
        } else {
            this.f20393a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestLessonReSplit) && fa4.m11650l(this.f20393a, ((RequestLessonReSplit) obj).f20393a);
    }

    public final int hashCode() {
        String str = this.f20393a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestLessonReSplit(method=", this.f20393a, ")");
    }
}
