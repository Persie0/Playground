package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kld implements kba {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kle f36461a;

    /* JADX INFO: renamed from: b */
    private boolean f36462b = false;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f36463c;

    public kld(kle kleVar, int i) {
        this.f36463c = i;
        this.f36461a = kleVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.f36463c) {
            case 0:
                synchronized (this) {
                    if (this.f36462b) {
                        z = false;
                    } else {
                        this.f36462b = true;
                        z = true;
                    }
                    break;
                }
                if (z) {
                    kle kleVar = this.f36461a;
                    synchronized (kleVar) {
                        lku.m15657k(kleVar.f36465b > 0);
                        int i = kleVar.f36465b - 1;
                        kleVar.f36465b = i;
                        if (i == 0 && kleVar.f36464a == 0) {
                            kleVar.f36466c = true;
                            z3 = true;
                        }
                        break;
                    }
                    if (z3) {
                        kleVar.f36467d.close();
                    }
                    kleVar.m14480c();
                    return;
                }
                return;
            default:
                synchronized (this) {
                    if (this.f36462b) {
                        z2 = false;
                    } else {
                        this.f36462b = true;
                        z2 = true;
                    }
                    break;
                }
                if (z2) {
                    kle kleVar2 = this.f36461a;
                    synchronized (kleVar2) {
                        lku.m15657k(kleVar2.f36464a > 0);
                        int i2 = kleVar2.f36464a - 1;
                        kleVar2.f36464a = i2;
                        if (i2 == 0 && kleVar2.f36465b == 0) {
                            kleVar2.f36466c = true;
                            z3 = true;
                        }
                        break;
                    }
                    if (z3) {
                        kleVar2.f36467d.close();
                    }
                    kleVar2.m14480c();
                    return;
                }
                return;
        }
    }
}
