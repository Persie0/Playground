package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bgc {

    /* JADX INFO: renamed from: a */
    public int f3154a = 0;

    public bgc() {
    }

    public bgc(int i) throws bfc {
        m2380b(i);
        m2383g(i);
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo2375a();

    /* JADX INFO: renamed from: e */
    protected void mo2381e(int i) {
    }

    public final boolean equals(Object obj) {
        return this.f3154a == ((bgc) obj).f3154a;
    }

    /* JADX INFO: renamed from: f */
    public final void m2382f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.f3154a;
        } else {
            i2 = (i ^ (-1)) & this.f3154a;
        }
        this.f3154a = i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2383g(int i) throws bfc {
        m2380b(i);
        this.f3154a = i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2384h(int i) {
        return (i & this.f3154a) != 0;
    }

    public final int hashCode() {
        return this.f3154a;
    }

    public final String toString() {
        return "0x".concat(String.valueOf(Integer.toHexString(this.f3154a)));
    }

    /* JADX INFO: renamed from: b */
    private final void m2380b(int i) throws bfc {
        int iMo2375a = (mo2375a() ^ (-1)) & i;
        if (iMo2375a == 0) {
            mo2381e(i);
            return;
        }
        throw new bfc("The option bit(s) 0x" + Integer.toHexString(iMo2375a) + " are invalid!", 103);
    }
}
