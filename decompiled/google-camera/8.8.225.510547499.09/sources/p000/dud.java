package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dud extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f12583a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kgg f12584b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ due f12585c;

    public dud(due dueVar, key keyVar, kgg kggVar) {
        this.f12585c = dueVar;
        this.f12583a = keyVar;
        this.f12584b = kggVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bb */
    public final void mo4006bb() {
        this.f12583a.close();
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        try {
            kay kayVarM3566d = this.f12585c.f12587b.m3566d();
            kpp kppVarMo7042c = this.f12583a.mo7042c();
            int i = kayVarM3566d.f35503e;
            if (kppVarMo7042c != null) {
                new gsr(kppVarMo7042c, i, this.f12585c.f12586a);
                kfd kfdVarMo7041b = this.f12583a.mo7041b();
                kpw kpwVarMo7043d = this.f12583a.mo7043d(this.f12584b);
                if (kfdVarMo7041b != null && kpwVarMo7043d != null) {
                    try {
                        fya fyaVar = this.f12585c.f12588c;
                        ((dvg) fyaVar.f23858b).m6774g(kfdVarMo7041b.f35811b, ((bkn) fyaVar.f23857a).m2560I(kpwVarMo7043d));
                    } catch (Throwable th) {
                        try {
                            kpwVarMo7043d.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                }
                if (kpwVarMo7043d != null) {
                    kpwVarMo7043d.close();
                }
            }
            this.f12583a.close();
        } catch (Throwable th3) {
            this.f12583a.close();
            throw th3;
        }
    }
}
