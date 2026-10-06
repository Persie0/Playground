package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ffd extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Executor f21603a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ aea f21604b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ key f21605c;

    public ffd(Executor executor, aea aeaVar, key keyVar) {
        this.f21603a = executor;
        this.f21604b = aeaVar;
        this.f21605c = keyVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        this.f21603a.execute(new ewo(this.f21604b, this.f21605c, 6));
    }
}
