package com.lingq.core.domain.model.milestones;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Badge {
    public static final C1472a Companion = new C1472a();

    /* JADX INFO: renamed from: a */
    public final String f19507a;

    /* JADX INFO: renamed from: b */
    public final String f19508b;

    /* JADX INFO: renamed from: c */
    public final String f19509c;

    /* JADX INFO: renamed from: d */
    public final String f19510d;

    /* JADX INFO: renamed from: e */
    public final int f19511e;

    /* JADX INFO: renamed from: f */
    public final String f19512f;

    /* JADX INFO: renamed from: g */
    public final String f19513g;

    public /* synthetic */ Badge(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (47 != (i & 47)) {
            n3c.m17204b(i, 47, Badge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19507a = str;
        this.f19508b = str2;
        this.f19509c = str3;
        this.f19510d = str4;
        this.f19511e = (i & 16) == 0 ? 0 : i2;
        this.f19512f = str5;
        if ((i & 64) == 0) {
            this.f19513g = null;
        } else {
            this.f19513g = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Badge m8096a(Badge badge, String str) {
        String str2 = badge.f19507a;
        String str3 = badge.f19508b;
        String str4 = badge.f19509c;
        String str5 = badge.f19510d;
        int i = badge.f19511e;
        String str6 = badge.f19513g;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new Badge(i, str2, str3, str4, str5, str, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return fa4.m11650l(this.f19507a, badge.f19507a) && fa4.m11650l(this.f19508b, badge.f19508b) && fa4.m11650l(this.f19509c, badge.f19509c) && fa4.m11650l(this.f19510d, badge.f19510d) && this.f19511e == badge.f19511e && fa4.m11650l(this.f19512f, badge.f19512f) && fa4.m11650l(this.f19513g, badge.f19513g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f19511e, ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f19507a.hashCode() * 31, this.f19508b, 31), this.f19509c, 31), this.f19510d, 31), 31), this.f19512f, 31);
        String str = this.f19513g;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("Badge(languageAndSlug=", this.f19507a, ", language=", this.f19508b, ", slug=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19509c, ", name=", this.f19510d, ", goal=");
        hn1.m13361k(this.f19511e, ", gainedAt=", this.f19512f, ", imageUrl=", sbM23000w);
        return AbstractC3393o1.m17738m(sbM23000w, this.f19513g, ")");
    }

    public Badge(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f19507a = str;
        this.f19508b = str2;
        this.f19509c = str3;
        this.f19510d = str4;
        this.f19511e = i;
        this.f19512f = str5;
        this.f19513g = str6;
    }
}
