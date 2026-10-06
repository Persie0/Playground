package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnn implements bnm {

    /* JADX INFO: renamed from: a */
    public final Handler f3887a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final bnm f3888b;

    private bnn(bnm bnmVar) {
        this.f3888b = bnmVar;
    }

    /* JADX INFO: renamed from: e */
    public static bnn m2773e(Handler handler, bnm bnmVar) {
        if (handler != null) {
            return new bnn(bnmVar);
        }
        return null;
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: a */
    public final void mo2769a(int i) {
        this.f3887a.post(new bbt(this, i, 2));
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: b */
    public final void mo2770b(bnq bnqVar) {
        this.f3887a.post(new bey(this, bnqVar, 8));
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: c */
    public final void mo2771c(int i, String str) {
        this.f3887a.post(new RunnableC0904pi(this, i, str, 6));
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: d */
    public final void mo2772d(int i, String str) {
        this.f3887a.post(new RunnableC0904pi(this, i, str, 7));
    }
}
