package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fdb implements ebx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fdc f21393a;

    public fdb(fdc fdcVar) {
        this.f21393a = fdcVar;
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7090a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo7092c() {
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: b */
    public final void mo7091b(boolean z) {
        hew hewVar;
        hew hewVar2;
        if (z) {
            fdc fdcVar = this.f21393a;
            if (!fdcVar.f21400g) {
                fdcVar.f21400g = true;
                int iM13089Y = fdcVar.f21403j.m13089Y("astro_smarts_chip");
                if (iM13089Y < 9) {
                    fdcVar.f21403j.m13092ab("astro_smarts_chip", iM13089Y + 1);
                    if (iM13089Y % 3 == 0) {
                        fdc fdcVar2 = this.f21393a;
                        if (!fdcVar2.f21394a.compareAndSet(false, true) || (hewVar2 = fdcVar2.f21395b) == null) {
                            return;
                        }
                        hewVar2.mo10131b(fdcVar2.f21396c);
                        return;
                    }
                }
            }
        }
        fdc fdcVar3 = this.f21393a;
        if (!fdcVar3.f21394a.compareAndSet(true, false) || (hewVar = fdcVar3.f21395b) == null) {
            return;
        }
        fdcVar3.f21401h = fdcVar3.f21398e.schedule(new evu(hewVar, 19), 2000L, TimeUnit.MILLISECONDS);
    }
}
