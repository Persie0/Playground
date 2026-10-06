package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmv extends kpt {

    /* JADX INFO: renamed from: a */
    private int f36569a;

    public kmv(kpw kpwVar) {
        this(kpwVar, 1);
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        m14586l();
    }

    /* JADX INFO: renamed from: k */
    public final kpw m14585k() {
        synchronized (this) {
            int i = this.f36569a;
            if (i <= 0) {
                return null;
            }
            this.f36569a = i + 1;
            return new kmw(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14586l() {
        synchronized (this) {
            int i = this.f36569a;
            if (i > 0) {
                int i2 = i - 1;
                this.f36569a = i2;
                if (i2 == 0) {
                    super.close();
                }
            }
        }
    }

    @Override // p000.kpt
    public final String toString() {
        String string;
        synchronized (this) {
            mrl mrlVarM16765d = mpw.m16765d(this);
            mrlVarM16765d.m16826e("refCount", this.f36569a);
            mrlVarM16765d.m16822a(super.toString());
            string = mrlVarM16765d.toString();
        }
        return string;
    }

    public kmv(kpw kpwVar, int i) {
        super(kpwVar);
        lku.m15670x(i > 0, "Initial reference count must be greater than zero!");
        this.f36569a = i;
    }
}
