package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class r04 {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f58438a;

    /* JADX INFO: renamed from: b */
    public final int f58439b;

    public r04(Resources.Theme theme, int i) {
        this.f58438a = theme;
        this.f58439b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r04)) {
            return false;
        }
        r04 r04Var = (r04) obj;
        return fa4.m11650l(this.f58438a, r04Var.f58438a) && this.f58439b == r04Var.f58439b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58439b) + (this.f58438a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f58438a);
        sb.append(", id=");
        return wq1.m24122r(sb, this.f58439b, ')');
    }
}
