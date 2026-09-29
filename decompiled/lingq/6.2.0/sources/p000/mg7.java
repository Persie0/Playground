package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mg7 {

    /* JADX INFO: renamed from: a */
    public final long f51291a;

    /* JADX INFO: renamed from: b */
    public final long f51292b;

    /* JADX INFO: renamed from: c */
    public final long f51293c;

    /* JADX INFO: renamed from: d */
    public final long f51294d;

    /* JADX INFO: renamed from: e */
    public final boolean f51295e;

    /* JADX INFO: renamed from: f */
    public final float f51296f;

    /* JADX INFO: renamed from: g */
    public final int f51297g;

    /* JADX INFO: renamed from: h */
    public final boolean f51298h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f51299i;

    /* JADX INFO: renamed from: j */
    public final long f51300j;

    /* JADX INFO: renamed from: k */
    public final float f51301k;

    /* JADX INFO: renamed from: l */
    public final long f51302l;

    /* JADX INFO: renamed from: m */
    public final long f51303m;

    public mg7(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f51291a = j;
        this.f51292b = j2;
        this.f51293c = j3;
        this.f51294d = j4;
        this.f51295e = z;
        this.f51296f = f;
        this.f51297g = i;
        this.f51298h = z2;
        this.f51299i = arrayList;
        this.f51300j = j5;
        this.f51301k = f2;
        this.f51302l = j6;
        this.f51303m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg7)) {
            return false;
        }
        mg7 mg7Var = (mg7) obj;
        return pk9.m19371i(this.f51291a, mg7Var.f51291a) && this.f51292b == mg7Var.f51292b && gq6.m12821b(this.f51293c, mg7Var.f51293c) && gq6.m12821b(this.f51294d, mg7Var.f51294d) && this.f51295e == mg7Var.f51295e && Float.compare(this.f51296f, mg7Var.f51296f) == 0 && this.f51297g == mg7Var.f51297g && this.f51298h == mg7Var.f51298h && this.f51299i.equals(mg7Var.f51299i) && gq6.m12821b(this.f51300j, mg7Var.f51300j) && Float.compare(this.f51301k, mg7Var.f51301k) == 0 && gq6.m12821b(this.f51302l, mg7Var.f51302l) && gq6.m12821b(this.f51303m, mg7Var.f51303m);
    }

    public final int hashCode() {
        return Long.hashCode(this.f51303m) + ux5.m22981d(this.f51302l, wq1.m24105a(ux5.m22981d(this.f51300j, (this.f51299i.hashCode() + g9a.m12428e(wq1.m24106b(this.f51297g, wq1.m24105a(g9a.m12428e(ux5.m22981d(this.f51294d, ux5.m22981d(this.f51293c, ux5.m22981d(this.f51292b, Long.hashCode(this.f51291a) * 31, 31), 31), 31), 31, this.f51295e), this.f51296f, 31), 31), 31, this.f51298h)) * 31, 31), this.f51301k, 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) pk9.m19382y(this.f51291a)) + ", uptime=" + this.f51292b + ", positionOnScreen=" + ((Object) gq6.m12827h(this.f51293c)) + ", position=" + ((Object) gq6.m12827h(this.f51294d)) + ", down=" + this.f51295e + ", pressure=" + this.f51296f + ", type=" + ((Object) rg7.m20659a(this.f51297g)) + ", activeHover=" + this.f51298h + ", historical=" + this.f51299i + ", scrollDelta=" + ((Object) gq6.m12827h(this.f51300j)) + ", scaleGestureFactor=" + this.f51301k + ", panGestureOffset=" + ((Object) gq6.m12827h(this.f51302l)) + ", originalEventPosition=" + ((Object) gq6.m12827h(this.f51303m)) + ')';
    }
}
