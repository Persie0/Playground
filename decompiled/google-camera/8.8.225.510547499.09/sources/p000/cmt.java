package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cmt implements cna {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Executor f6320a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Set f6321b;

    public cmt(Executor executor, Set set) {
        this.f6320a = executor;
        this.f6321b = set;
    }

    @Override // p000.cna
    /* JADX INFO: renamed from: f */
    public final void mo3953f(ikw ikwVar) {
        this.f6320a.execute(new cgl(this.f6321b, ikwVar, 10));
    }
}
