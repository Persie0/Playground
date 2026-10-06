package p000;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpr extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gps f26012a;

    public gpr(gps gpsVar) {
        this.f26012a = gpsVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f26012a.f26015c.execute(new gpn(this, 5));
    }
}
