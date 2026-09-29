package p301oh;

import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: oh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8046e {

    /* JADX INFO: renamed from: a */
    public final String f43712a;

    /* JADX INFO: renamed from: b */
    public final float f43713b;

    /* JADX INFO: renamed from: c */
    public final float f43714c;

    public C8046e(String str, float f3, float f10) {
        C5207g.m11111f(str, "title");
        this.f43712a = str;
        this.f43713b = f3;
        this.f43714c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8046e)) {
            return false;
        }
        C8046e c8046e = (C8046e) obj;
        return C5207g.m11106a(this.f43712a, c8046e.f43712a) && Float.compare(this.f43713b, c8046e.f43713b) == 0 && Float.compare(this.f43714c, c8046e.f43714c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43714c) + C0204c.m846e(this.f43713b, this.f43712a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LineGraphCoordinates(title=" + this.f43712a + ", xCoordinate=" + this.f43713b + ", yCoordinate=" + this.f43714c + ")";
    }
}
