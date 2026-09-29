package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLessonComplete {
    public static final C1559b0 Companion = new C1559b0();

    /* JADX INFO: renamed from: a */
    public final String f20380a;

    public /* synthetic */ RequestLessonComplete(int i, String str) {
        if ((i & 1) == 0) {
            this.f20380a = null;
        } else {
            this.f20380a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestLessonComplete) && fa4.m11650l(this.f20380a, ((RequestLessonComplete) obj).f20380a);
    }

    public final int hashCode() {
        String str = this.f20380a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestLessonComplete(creationDate=", this.f20380a, ")");
    }

    public RequestLessonComplete(String str) {
        this.f20380a = str;
    }
}
