package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CourseForImportEntity {
    public static final C1340i Companion = new C1340i();

    /* JADX INFO: renamed from: a */
    public final String f17128a;

    /* JADX INFO: renamed from: b */
    public final int f17129b;

    /* JADX INFO: renamed from: c */
    public final String f17130c;

    /* JADX INFO: renamed from: d */
    public final int f17131d;

    public /* synthetic */ CourseForImportEntity(String str, int i, String str2, int i2, int i3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CourseForImportEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17128a = str;
        this.f17129b = i2;
        this.f17130c = str2;
        if ((i & 8) == 0) {
            this.f17131d = 0;
        } else {
            this.f17131d = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7588a() {
        return this.f17128a;
    }

    /* JADX INFO: renamed from: b */
    public final int m7589b() {
        return this.f17131d;
    }

    /* JADX INFO: renamed from: c */
    public final int m7590c() {
        return this.f17129b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7591d() {
        return this.f17130c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseForImportEntity)) {
            return false;
        }
        CourseForImportEntity courseForImportEntity = (CourseForImportEntity) obj;
        return fa4.m11650l(this.f17128a, courseForImportEntity.f17128a) && this.f17129b == courseForImportEntity.f17129b && fa4.m11650l(this.f17130c, courseForImportEntity.f17130c) && this.f17131d == courseForImportEntity.f17131d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17131d) + ux5.m22980c(wq1.m24106b(this.f17129b, this.f17128a.hashCode() * 31, 31), this.f17130c, 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f17129b, "CourseForImportEntity(language=", this.f17128a, ", pk=", ", title=");
        sbM17741p.append(this.f17130c);
        sbM17741p.append(", order=");
        sbM17741p.append(this.f17131d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public CourseForImportEntity(String str, int i, String str2, int i2) {
        str.getClass();
        this.f17128a = str;
        this.f17129b = i;
        this.f17130c = str2;
        this.f17131d = i2;
    }
}
