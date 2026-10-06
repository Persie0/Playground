package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eum implements ebx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eus f20122a;

    public eum(eus eusVar) {
        this.f20122a = eusVar;
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: a */
    public final void mo7090a(boolean z, boolean z2, boolean z3, boolean z4) {
        fmd fmdVar = this.f20122a.f20156R;
        if (fmdVar == null) {
            return;
        }
        boolean z5 = false;
        if (z4 && ((Boolean) fmdVar.m8568b().mo3831be()).booleanValue()) {
            z5 = true;
        }
        if (z3 && z5) {
            this.f20122a.f20188f.execute(new euj(this, 5));
            return;
        }
        if (z && !z4) {
            this.f20122a.f20188f.execute(new euj(this, 6));
            return;
        }
        if (z && z5) {
            this.f20122a.f20188f.execute(new euj(this, 7));
        } else {
            if (z || !z5) {
                return;
            }
            this.f20122a.f20188f.execute(new bnp(this, z2, 10));
        }
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7091b(boolean z) {
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: c */
    public final void mo7092c() {
        this.f20122a.f20188f.execute(new euj(this, 4));
    }
}
