package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonComplete {
    public static final C1779x1 Companion = new C1779x1();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21022b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(13))};

    /* JADX INFO: renamed from: a */
    public final List f21023a;

    public /* synthetic */ ResultLessonComplete(int i, List list) {
        if ((i & 1) == 0) {
            this.f21023a = null;
        } else {
            this.f21023a = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8366a() {
        return this.f21023a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultLessonComplete) && fa4.m11650l(this.f21023a, ((ResultLessonComplete) obj).f21023a);
    }

    public final int hashCode() {
        List list = this.f21023a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultLessonComplete(moreLessons=", ")", this.f21023a);
    }
}
