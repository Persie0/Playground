package com.lingq.core.domain.model.language;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CourseForImport {
    public static final C1422b Companion = new C1422b();

    /* JADX INFO: renamed from: a */
    public final String f19005a;

    /* JADX INFO: renamed from: b */
    public final int f19006b;

    /* JADX INFO: renamed from: c */
    public final String f19007c;

    public /* synthetic */ CourseForImport(String str, int i, int i2, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CourseForImport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19005a = str;
        this.f19006b = i2;
        this.f19007c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseForImport)) {
            return false;
        }
        CourseForImport courseForImport = (CourseForImport) obj;
        return fa4.m11650l(this.f19005a, courseForImport.f19005a) && this.f19006b == courseForImport.f19006b && fa4.m11650l(this.f19007c, courseForImport.f19007c);
    }

    public final int hashCode() {
        return this.f19007c.hashCode() + wq1.m24106b(this.f19006b, this.f19005a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f19006b, "CourseForImport(language=", this.f19005a, ", pk=", ", title="), this.f19007c, ")");
    }

    public CourseForImport(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f19005a = str;
        this.f19006b = i;
        this.f19007c = str2;
    }
}
