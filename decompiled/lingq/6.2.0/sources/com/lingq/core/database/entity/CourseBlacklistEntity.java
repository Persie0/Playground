package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CourseBlacklistEntity {
    public static final C1338h Companion = new C1338h();

    /* JADX INFO: renamed from: a */
    public final int f17125a;

    /* JADX INFO: renamed from: b */
    public final String f17126b;

    /* JADX INFO: renamed from: c */
    public final String f17127c;

    public /* synthetic */ CourseBlacklistEntity(String str, int i, int i2, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CourseBlacklistEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17125a = i2;
        this.f17126b = str;
        this.f17127c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m7585a() {
        return this.f17125a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7586b() {
        return this.f17126b;
    }

    /* JADX INFO: renamed from: c */
    public final String m7587c() {
        return this.f17127c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseBlacklistEntity)) {
            return false;
        }
        CourseBlacklistEntity courseBlacklistEntity = (CourseBlacklistEntity) obj;
        return this.f17125a == courseBlacklistEntity.f17125a && fa4.m11650l(this.f17126b, courseBlacklistEntity.f17126b) && fa4.m11650l(this.f17127c, courseBlacklistEntity.f17127c);
    }

    public final int hashCode() {
        return this.f17127c.hashCode() + ux5.m22980c(Integer.hashCode(this.f17125a) * 31, this.f17126b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f17125a, "CourseBlacklistEntity(id=", ", language=", this.f17126b, ", title="), this.f17127c, ")");
    }

    public CourseBlacklistEntity(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f17125a = i;
        this.f17126b = str;
        this.f17127c = str2;
    }
}
