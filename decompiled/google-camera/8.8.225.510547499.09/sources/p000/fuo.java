package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuo {

    /* JADX INFO: renamed from: a */
    public final gss f23595a;

    /* JADX INFO: renamed from: b */
    public final gst f23596b;

    /* JADX INFO: renamed from: c */
    public final float f23597c;

    /* JADX INFO: renamed from: d */
    public final mrm f23598d;

    /* JADX INFO: renamed from: e */
    public final int f23599e;

    /* JADX INFO: renamed from: f */
    public final int f23600f;

    public fuo(gss gssVar, gst gstVar, float f, mrm mrmVar, int i, int i2) {
        this.f23595a = gssVar;
        this.f23596b = gstVar;
        this.f23597c = f;
        this.f23598d = mrmVar;
        this.f23599e = i;
        this.f23600f = i2;
    }

    /* JADX INFO: renamed from: a */
    public static fuo m8813a() {
        return new fuo(gss.OFF, gst.INACTIVE, 0.0f, mqu.f41450a, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fuo)) {
            return false;
        }
        fuo fuoVar = (fuo) obj;
        boolean z = this.f23595a == fuoVar.f23595a && this.f23596b == fuoVar.f23596b && this.f23597c == fuoVar.f23597c && this.f23599e == fuoVar.f23599e && this.f23600f == fuoVar.f23600f;
        mrm mrmVar = this.f23598d;
        if (mrmVar.mo16813g() && fuoVar.f23598d.mo16813g()) {
            return z && ((fun) mrmVar.mo16809c()).equals(fuoVar.f23598d.mo16809c());
        }
        return z;
    }

    public final int hashCode() {
        return ((((this.f23595a.f26275h + 527) * 31) + this.f23596b.f26285h) * 31) + Float.floatToIntBits(this.f23597c);
    }

    public final String toString() {
        return "{controlAfMode=" + String.valueOf(this.f23595a) + ", controlAfState=" + String.valueOf(this.f23596b) + ", lensFocusDistance=" + this.f23597c + "}";
    }
}
