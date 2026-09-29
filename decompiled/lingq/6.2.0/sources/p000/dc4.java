package p000;

import android.graphics.Rect;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dc4 {

    /* JADX INFO: renamed from: a */
    public String f35385a;

    /* JADX INFO: renamed from: b */
    public final Rect f35386b;

    /* JADX INFO: renamed from: c */
    public final double f35387c;

    /* JADX INFO: renamed from: d */
    public final hg0 f35388d;

    public dc4(String str, Rect rect, double d, hg0 hg0Var) {
        this.f35385a = str;
        this.f35386b = rect;
        this.f35387c = d;
        this.f35388d = hg0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc4)) {
            return false;
        }
        dc4 dc4Var = (dc4) obj;
        return Objects.equals(this.f35385a, dc4Var.f35385a) && this.f35386b.equals(dc4Var.f35386b) && this.f35387c == dc4Var.f35387c;
    }

    public final int hashCode() {
        return Objects.hash(this.f35385a, this.f35386b, Double.valueOf(this.f35387c));
    }
}
