package com.lingq.core.domain.model.lesson;

import java.util.Date;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonUserCompleted {
    public static final C1453r Companion = new C1453r();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f19307c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b25(12))};

    /* JADX INFO: renamed from: a */
    public final String f19308a;

    /* JADX INFO: renamed from: b */
    public final Date f19309b;

    public /* synthetic */ LessonUserCompleted(int i, String str, Date date) {
        if ((i & 1) == 0) {
            this.f19308a = null;
        } else {
            this.f19308a = str;
        }
        if ((i & 2) == 0) {
            this.f19309b = null;
        } else {
            this.f19309b = date;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Date m8069a() {
        return this.f19309b;
    }

    /* JADX INFO: renamed from: b */
    public final String m8070b() {
        return this.f19308a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonUserCompleted)) {
            return false;
        }
        LessonUserCompleted lessonUserCompleted = (LessonUserCompleted) obj;
        return fa4.m11650l(this.f19308a, lessonUserCompleted.f19308a) && fa4.m11650l(this.f19309b, lessonUserCompleted.f19309b);
    }

    public final int hashCode() {
        String str = this.f19308a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f19309b;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "LessonUserCompleted(username=" + this.f19308a + ", completed=" + this.f19309b + ")";
    }

    public LessonUserCompleted(String str, Date date) {
        this.f19308a = str;
        this.f19309b = date;
    }
}
