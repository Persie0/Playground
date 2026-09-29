package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonTagEntity {
    public static final C1364w Companion = new C1364w();

    /* JADX INFO: renamed from: a */
    public final String f17353a;

    public /* synthetic */ LessonTagEntity(int i, String str) {
        if (1 == (i & 1)) {
            this.f17353a = str;
        } else {
            n3c.m17204b(i, 1, LessonTagEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7756a() {
        return this.f17353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LessonTagEntity) && fa4.m11650l(this.f17353a, ((LessonTagEntity) obj).f17353a);
    }

    public final int hashCode() {
        return this.f17353a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LessonTagEntity(title=", this.f17353a, ")");
    }

    public LessonTagEntity(String str) {
        this.f17353a = str;
    }
}
