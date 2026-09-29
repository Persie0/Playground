package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonTags {
    public static final C1651f2 Companion = new C1651f2();

    /* JADX INFO: renamed from: a */
    public final String f21119a;

    public /* synthetic */ ResultLessonTags(int i, String str) {
        if ((i & 1) == 0) {
            this.f21119a = null;
        } else {
            this.f21119a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultLessonTags) && fa4.m11650l(this.f21119a, ((ResultLessonTags) obj).f21119a);
    }

    public final int hashCode() {
        String str = this.f21119a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultLessonTags(title=", this.f21119a, ")");
    }
}
