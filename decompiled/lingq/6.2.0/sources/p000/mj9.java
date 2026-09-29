package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mj9 {

    /* JADX INFO: renamed from: a */
    public final String f51407a;

    /* JADX INFO: renamed from: b */
    public final String f51408b;

    /* JADX INFO: renamed from: c */
    public final int f51409c;

    /* JADX INFO: renamed from: d */
    public final int f51410d;

    /* JADX INFO: renamed from: e */
    public final int f51411e;

    public mj9(String str, int i, String str2, int i2, int i3) {
        str.getClass();
        this.f51407a = str;
        this.f51408b = str2;
        this.f51409c = i;
        this.f51410d = i2;
        this.f51411e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj9)) {
            return false;
        }
        mj9 mj9Var = (mj9) obj;
        return fa4.m11650l(this.f51407a, mj9Var.f51407a) && this.f51408b.equals(mj9Var.f51408b) && this.f51409c == mj9Var.f51409c && this.f51410d == mj9Var.f51410d && this.f51411e == mj9Var.f51411e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51411e) + wq1.m24106b(this.f51410d, wq1.m24106b(this.f51409c, ux5.m22980c(this.f51407a.hashCode() * 31, this.f51408b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("StreakEntry(title=", this.f51407a, ", date=", this.f51408b, ", lingqsCreated=");
        hn1.m13360j(this.f51409c, this.f51410d, ", dailyGoal=", ", activityLevelId=", sbM23000w);
        return wq1.m24123s(sbM23000w, this.f51411e, ")");
    }
}
