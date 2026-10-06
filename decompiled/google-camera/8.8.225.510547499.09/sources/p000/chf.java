package p000;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chf implements kba {

    /* JADX INFO: renamed from: a */
    private bnu f5728a;

    public chf(Context context) {
        this.f5728a = bnv.m2780a(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized bod m3668a() {
        bnu bnuVar;
        bnuVar = this.f5728a;
        bnuVar.getClass();
        return bnuVar.mo2743b();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3669b(Handler handler, int i, bnm bnmVar) {
        bnu bnuVar = this.f5728a;
        bnuVar.getClass();
        try {
            bnuVar.mo2746e().m2806a(new eqa(bnuVar, i, handler, bnmVar, 1));
        } catch (RuntimeException e) {
            bnuVar.mo2744c().mo2759c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3670c(boh bohVar) {
        bnu bnuVar = this.f5728a;
        bnuVar.getClass();
        bnuVar.mo2747f(bohVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5728a = null;
        bnv.m2781b();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3671d(boolean z) {
        bnu bnuVar = this.f5728a;
        bnuVar.getClass();
        bnuVar.m2779g(z);
    }
}
