package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bns implements bnr {

    /* JADX INFO: renamed from: a */
    public final bnr f3892a;

    /* JADX INFO: renamed from: b */
    private final Handler f3893b;

    public bns(Handler handler, bnr bnrVar) {
        this.f3893b = handler;
        this.f3892a = bnrVar;
    }

    @Override // p000.bnr
    /* JADX INFO: renamed from: a */
    public final void mo2777a() {
        this.f3893b.post(new baa(this, 8));
    }
}
