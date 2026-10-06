package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggj implements kos {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Executor f24673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kbg f24674b;

    public ggj(Executor executor, kbg kbgVar) {
        this.f24673a = executor;
        this.f24674b = kbgVar;
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        this.f24673a.execute(new fro(this, kayVar, 11));
    }
}
