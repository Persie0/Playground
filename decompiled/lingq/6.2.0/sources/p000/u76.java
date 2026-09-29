package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class u76 {

    /* JADX INFO: renamed from: a */
    public final int f63517a;

    /* JADX INFO: renamed from: b */
    public wd6 f63518b = null;

    /* JADX INFO: renamed from: c */
    public Bundle f63519c = null;

    public u76(int i) {
        this.f63517a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u76)) {
            return false;
        }
        u76 u76Var = (u76) obj;
        if (this.f63517a != u76Var.f63517a || !fa4.m11650l(this.f63518b, u76Var.f63518b)) {
            return false;
        }
        Bundle bundle = this.f63519c;
        Bundle bundle2 = u76Var.f63519c;
        if (fa4.m11650l(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !bq1.m4051a0(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f63517a) * 31;
        wd6 wd6Var = this.f63518b;
        int iHashCode2 = iHashCode + (wd6Var != null ? wd6Var.hashCode() : 0);
        Bundle bundle = this.f63519c;
        if (bundle != null) {
            return bq1.m4052b0(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u76.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f63517a));
        sb.append(")");
        if (this.f63518b != null) {
            sb.append(" navOptions=");
            sb.append(this.f63518b);
        }
        return sb.toString();
    }
}
