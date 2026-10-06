package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kze implements kyx {

    /* JADX INFO: renamed from: a */
    public final Object f37768a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile laa f37769b = null;

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        laa laaVarMo15085b = this.f37769b;
        if (laaVarMo15085b == null) {
            synchronized (this.f37768a) {
                laaVarMo15085b = this.f37769b;
                if (laaVarMo15085b == null) {
                    laaVarMo15085b = mo15085b();
                    this.f37769b = laaVarMo15085b;
                }
            }
        }
        return laaVarMo15085b;
    }

    /* JADX INFO: renamed from: b */
    protected abstract laa mo15085b();

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        laa laaVar = this.f37769b;
        if (laaVar == null) {
            synchronized (this.f37768a) {
                laaVar = this.f37769b;
                if (laaVar == null) {
                    mo15086cn();
                    laaVar = kzz.f37797a;
                    this.f37769b = laaVar;
                }
            }
        }
        lqi.m15868m(laaVar);
    }

    /* JADX INFO: renamed from: cn */
    protected abstract void mo15086cn();
}
