package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgg extends kze implements lgb {

    /* JADX INFO: renamed from: c */
    public final lgf f38206c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f38207d = new AtomicBoolean(true);

    public lgg(lgb lgbVar) {
        this.f38206c = new lgf(lgbVar);
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    protected final laa mo15085b() {
        this.f38207d.set(false);
        lgf lgfVar = this.f38206c;
        int iDecrementAndGet = lgfVar.f38203a.decrementAndGet();
        if (iDecrementAndGet == 0) {
            boolean z = lgfVar.f38205c;
            return lgfVar.f38204b.mo15079a();
        }
        if (iDecrementAndGet >= 0) {
            return kzz.f37797a;
        }
        throw new IllegalStateException("Reference count dropped below zero");
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: c */
    public final Object mo15294c() {
        if (this.f38207d.get()) {
            return this.f38206c.f38204b.mo15294c();
        }
        throw new lgd();
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: cm */
    public final Object mo15295cm() {
        throw null;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: cn */
    protected final void mo15086cn() {
        this.f38207d.set(false);
        lgf lgfVar = this.f38206c;
        int iDecrementAndGet = lgfVar.f38203a.decrementAndGet();
        if (iDecrementAndGet == 0) {
            boolean z = lgfVar.f38205c;
            lgfVar.f38204b.close();
        } else if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Reference count dropped below zero");
        }
    }

    public final String toString() {
        return "ref-counted[" + this.f38206c.f38204b.toString() + "]";
    }

    public lgg(lgf lgfVar) {
        this.f38206c = lgfVar;
    }
}
