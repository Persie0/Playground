package p000;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class cuj extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cuk f9639a;

    public cuj(cuk cukVar) {
        this.f9639a = cukVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        cuk cukVar = this.f9639a;
        if (cukVar.f9643d.f41535a) {
            cukVar.f9642c.execute(new cui(this, 0));
        }
    }
}
