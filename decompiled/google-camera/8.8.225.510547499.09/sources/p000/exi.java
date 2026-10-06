package p000;

import android.os.AsyncTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class exi extends AsyncTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ exm f20738a;

    public exi(exm exmVar) {
        this.f20738a = exmVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bnq bnqVar;
        exm exmVar = this.f20738a;
        if (exmVar.f20777s && (bnqVar = exmVar.f20761c.f20688b) != null) {
            bnqVar.mo2731p(exmVar.f20751H, null);
            bnqVar.mo2730o(this.f20738a.f20751H, null);
            exm exmVar2 = this.f20738a;
            exmVar2.f20767i = (float) (Math.asin(-exmVar2.f20765g.m8046f()[6]) * 57.29577951308232d);
            exm exmVar3 = this.f20738a;
            if (exmVar3.f20772n == 0) {
                exmVar3.f20766h = exmVar3.f20767i;
            }
            double dAbs = Math.abs(exmVar3.f20767i - exmVar3.f20766h);
            if (this.f20738a.f20780v && (Math.abs(dAbs) > 8.0d || this.f20738a.f20750G)) {
                exm exmVar4 = this.f20738a;
                exmVar4.f20768j = false;
                exmVar4.f20769k = 0;
                exmVar4.f20770l.drainPermits();
                for (int i = 0; i < 3; i++) {
                    exm exmVar5 = this.f20738a;
                    if (exmVar5.f20768j) {
                        break;
                    }
                    bnqVar.mo2725j(exmVar5.f20751H, new exl(this, bnqVar, 1));
                    try {
                        this.f20738a.f20770l.acquire();
                    } catch (InterruptedException e) {
                    }
                }
            } else {
                this.f20738a.m8006d(bnqVar);
            }
        }
        return null;
    }
}
