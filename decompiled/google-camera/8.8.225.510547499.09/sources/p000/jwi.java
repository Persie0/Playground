package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwi implements kbg {

    /* JADX INFO: renamed from: a */
    Object f34948a = null;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Executor f34949b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kbg f34950c;

    public jwi(Executor executor, kbg kbgVar) {
        this.f34949b = executor;
        this.f34950c = kbgVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        if (mpw.m16768g(this.f34948a, obj)) {
            return;
        }
        this.f34948a = obj;
        this.f34949b.execute(new jpm(this.f34950c, obj, 10));
    }
}
