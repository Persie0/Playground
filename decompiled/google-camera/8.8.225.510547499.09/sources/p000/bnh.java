package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnh extends bnu {

    /* JADX INFO: renamed from: a */
    public static final boo f3875a = new boo("AndCamAgntImp");

    /* JADX INFO: renamed from: h */
    private static final boh f3876h = new bmw();

    /* JADX INFO: renamed from: b */
    public boc f3877b;

    /* JADX INFO: renamed from: c */
    public bni f3878c;

    /* JADX INFO: renamed from: d */
    public final bnc f3879d;

    /* JADX INFO: renamed from: e */
    public final boj f3880e;

    /* JADX INFO: renamed from: f */
    public final bok f3881f;

    /* JADX INFO: renamed from: g */
    public boh f3882g;

    /* JADX INFO: renamed from: j */
    private final HandlerThread f3883j;

    public bnh() {
        this.f3882g = f3876h;
        HandlerThread handlerThread = new HandlerThread("Camera Handler Thread");
        this.f3883j = handlerThread;
        handlerThread.start();
        bnc bncVar = new bnc(this, this, handlerThread.getLooper());
        this.f3879d = bncVar;
        this.f3882g = new boh(bncVar);
        this.f3880e = new boj();
        bok bokVar = new bok(bncVar, handlerThread);
        this.f3881f = bokVar;
        bokVar.start();
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: a */
    public final Handler mo2742a() {
        return this.f3879d;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: b */
    public final bod mo2743b() {
        return bmy.m2760c();
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: c */
    public final boh mo2744c() {
        return this.f3882g;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: d */
    protected final boj mo2745d() {
        return this.f3880e;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: e */
    public final bok mo2746e() {
        return this.f3881f;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: f */
    public final void mo2747f(boh bohVar) {
        this.f3882g = bohVar;
    }
}
