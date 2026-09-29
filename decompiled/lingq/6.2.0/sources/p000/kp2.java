package p000;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class kp2 {

    /* JADX INFO: renamed from: a */
    public final String f48276a;

    /* JADX INFO: renamed from: b */
    public final long f48277b;

    /* JADX INFO: renamed from: c */
    public int f48278c = 0;

    /* JADX INFO: renamed from: d */
    public float f48279d = 0.0f;

    /* JADX INFO: renamed from: e */
    public Date f48280e = null;

    public kp2(String str, long j) {
        this.f48276a = str;
        this.f48277b = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m15634a() {
        return this.f48278c;
    }

    /* JADX INFO: renamed from: b */
    public final float m15635b() {
        return this.f48279d;
    }

    /* JADX INFO: renamed from: c */
    public final String m15636c() {
        return this.f48276a;
    }

    /* JADX INFO: renamed from: d */
    public final long m15637d() {
        return this.f48277b;
    }

    /* JADX INFO: renamed from: e */
    public final Date m15638e() {
        return this.f48280e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp2)) {
            return false;
        }
        kp2 kp2Var = (kp2) obj;
        return this.f48276a.equals(kp2Var.f48276a) && this.f48277b == kp2Var.f48277b && this.f48278c == kp2Var.f48278c && Float.compare(this.f48279d, kp2Var.f48279d) == 0 && fa4.m11650l(this.f48280e, kp2Var.f48280e);
    }

    /* JADX INFO: renamed from: f */
    public final void m15639f(int i) {
        this.f48278c = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m15640g(float f) {
        this.f48279d = f;
    }

    /* JADX INFO: renamed from: h */
    public final void m15641h(Date date) {
        this.f48280e = date;
    }

    public final int hashCode() {
        int iM24105a = wq1.m24105a(wq1.m24106b(this.f48278c, ux5.m22981d(this.f48277b, this.f48276a.hashCode() * 31, 31), 31), this.f48279d, 31);
        Date date = this.f48280e;
        return iM24105a + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "EmbeddedImpressionData(messageId=" + this.f48276a + ", placementId=" + this.f48277b + ", displayCount=" + this.f48278c + ", duration=" + this.f48279d + ", start=" + this.f48280e + ")";
    }
}
