package p000;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hoi extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hoj f28575a;

    public hoi(hoj hojVar) {
        this.f28575a = hojVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        hoj hojVar = this.f28575a;
        hojVar.f28605o.set(hojVar.f28584H.f29162h);
    }
}
