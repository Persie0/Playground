package com.lingq.core.domain.model.milestones;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Milestone {
    public static final C1480i Companion = new C1480i();

    /* JADX INFO: renamed from: a */
    public String f19532a;

    /* JADX INFO: renamed from: b */
    public String f19533b;

    /* JADX INFO: renamed from: c */
    public int f19534c;

    /* JADX INFO: renamed from: d */
    public String f19535d;

    /* JADX INFO: renamed from: e */
    public String f19536e;

    public Milestone(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f19532a = str;
        this.f19533b = str2;
        this.f19534c = i;
        this.f19535d = str3;
        this.f19536e = str4;
    }

    /* JADX INFO: renamed from: a */
    public final int m8100a() {
        return this.f19534c;
    }

    /* JADX INFO: renamed from: b */
    public final String m8101b() {
        return this.f19532a;
    }

    /* JADX INFO: renamed from: c */
    public final String m8102c() {
        return this.f19533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Milestone)) {
            return false;
        }
        Milestone milestone = (Milestone) obj;
        return fa4.m11650l(this.f19532a, milestone.f19532a) && fa4.m11650l(this.f19533b, milestone.f19533b) && this.f19534c == milestone.f19534c && fa4.m11650l(this.f19535d, milestone.f19535d) && fa4.m11650l(this.f19536e, milestone.f19536e);
    }

    public final int hashCode() {
        return this.f19536e.hashCode() + ux5.m22980c(wq1.m24106b(this.f19534c, ux5.m22980c(this.f19532a.hashCode() * 31, this.f19533b, 31), 31), this.f19535d, 31);
    }

    public final String toString() {
        String str = this.f19532a;
        String str2 = this.f19533b;
        int i = this.f19534c;
        String str3 = this.f19535d;
        String str4 = this.f19536e;
        StringBuilder sbM23000w = ux5.m23000w("Milestone(language=", str, ", slug=", str2, ", goal=");
        hn1.m13361k(i, ", stat=", str3, ", name=", sbM23000w);
        return AbstractC3393o1.m17738m(sbM23000w, str4, ")");
    }
}
