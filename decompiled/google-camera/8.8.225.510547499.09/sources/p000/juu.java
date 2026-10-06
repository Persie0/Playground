package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class juu implements kbg {

    /* JADX INFO: renamed from: a */
    public final kbg f34862a;

    /* JADX INFO: renamed from: b */
    private final Executor f34863b;

    public juu(kbg kbgVar, Executor executor) {
        this.f34862a = kbgVar;
        this.f34863b = executor;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        this.f34863b.execute(new jpm(this, obj, 5));
    }
}
