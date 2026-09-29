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
public final class LessonUserLiked {
    public static final C1454s Companion = new C1454s();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f19310c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b25(13))};

    /* JADX INFO: renamed from: a */
    public final String f19311a;

    /* JADX INFO: renamed from: b */
    public final Date f19312b;

    public /* synthetic */ LessonUserLiked(int i, String str, Date date) {
        if ((i & 1) == 0) {
            this.f19311a = null;
        } else {
            this.f19311a = str;
        }
        if ((i & 2) == 0) {
            this.f19312b = null;
        } else {
            this.f19312b = date;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Date m8071a() {
        return this.f19312b;
    }

    /* JADX INFO: renamed from: b */
    public final String m8072b() {
        return this.f19311a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonUserLiked)) {
            return false;
        }
        LessonUserLiked lessonUserLiked = (LessonUserLiked) obj;
        return fa4.m11650l(this.f19311a, lessonUserLiked.f19311a) && fa4.m11650l(this.f19312b, lessonUserLiked.f19312b);
    }

    public final int hashCode() {
        String str = this.f19311a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f19312b;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "LessonUserLiked(username=" + this.f19311a + ", liked=" + this.f19312b + ")";
    }

    public LessonUserLiked(String str, Date date) {
        this.f19311a = str;
        this.f19312b = date;
    }
}
