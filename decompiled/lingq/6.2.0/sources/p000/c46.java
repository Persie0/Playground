package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c46 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final float f9479a;

    /* JADX INFO: renamed from: b */
    public final b46 f9480b;

    /* JADX INFO: renamed from: c */
    public final b46 f9481c;

    public c46(float f, b46 b46Var, b46 b46Var2) {
        this.f9479a = f;
        this.f9480b = b46Var;
        this.f9481c = b46Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c46)) {
            return false;
        }
        c46 c46Var = (c46) obj;
        return Float.compare(this.f9479a, c46Var.f9479a) == 0 && Objects.equals(this.f9480b, c46Var.f9480b) && Objects.equals(this.f9481c, c46Var.f9481c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f9479a) * 31;
        b46 b46Var = this.f9480b;
        int iHashCode2 = (iHashCode + (b46Var != null ? b46Var.hashCode() : 0)) * 31;
        b46 b46Var2 = this.f9481c;
        return iHashCode2 + (b46Var2 != null ? b46Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f9479a + ", field 1=" + this.f9480b + ", field 2=" + this.f9481c;
    }
}
