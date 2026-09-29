package com.lingq.core.network.api.result;

import java.util.Date;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonUserCompleted {
    public static final C1675j2 Companion = new C1675j2();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21205c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(19))};

    /* JADX INFO: renamed from: a */
    public final String f21206a;

    /* JADX INFO: renamed from: b */
    public final Date f21207b;

    public /* synthetic */ ResultLessonUserCompleted(int i, String str, Date date) {
        if ((i & 1) == 0) {
            this.f21206a = null;
        } else {
            this.f21206a = str;
        }
        if ((i & 2) == 0) {
            this.f21207b = null;
        } else {
            this.f21207b = date;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonUserCompleted)) {
            return false;
        }
        ResultLessonUserCompleted resultLessonUserCompleted = (ResultLessonUserCompleted) obj;
        return fa4.m11650l(this.f21206a, resultLessonUserCompleted.f21206a) && fa4.m11650l(this.f21207b, resultLessonUserCompleted.f21207b);
    }

    public final int hashCode() {
        String str = this.f21206a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f21207b;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "ResultLessonUserCompleted(username=" + this.f21206a + ", completed=" + this.f21207b + ")";
    }
}
