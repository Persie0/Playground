package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w07 {

    /* JADX INFO: renamed from: a */
    public final long f66180a;

    /* JADX INFO: renamed from: b */
    public final x17 f66181b;

    public w07() {
        long jM10037f = d32.m10037f(4284900966L);
        x17 x17VarM21622e = AbstractC3584sr.m21622e(0.0f, 0.0f, 3);
        this.f66180a = jM10037f;
        this.f66181b = x17VarM21622e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w07.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        w07 w07Var = (w07) obj;
        return aa1.m199c(this.f66180a, w07Var.f66180a) && fa4.m11650l(this.f66181b, w07Var.f66181b);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return this.f66181b.hashCode() + (Long.hashCode(this.f66180a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        ux5.m23002y(this.f66180a, ", drawPadding=", sb);
        sb.append(this.f66181b);
        sb.append(')');
        return sb.toString();
    }
}
