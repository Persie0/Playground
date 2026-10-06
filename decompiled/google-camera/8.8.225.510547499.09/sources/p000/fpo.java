package p000;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpo extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fpp f23117a;

    public fpo(fpp fppVar) {
        this.f23117a = fppVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f23117a.f23121d.execute(new fnx(this, 7));
    }
}
