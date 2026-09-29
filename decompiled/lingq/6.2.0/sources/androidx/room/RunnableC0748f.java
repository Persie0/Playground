package androidx.room;

import p000.jj5;
import p000.sm0;
import p000.wfb;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0748f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sm0 f6965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f6966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f6967c;

    public RunnableC0748f(sm0 sm0Var, AbstractC0746d abstractC0746d, zi3 zi3Var) {
        this.f6965a = sm0Var;
        this.f6966b = abstractC0746d;
        this.f6967c = zi3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sm0 sm0Var = this.f6965a;
        try {
            wfb.m23900B(sm0Var.f61016e.minusKey(jj5.f45612c), new C0732xcbe28c2e(this.f6966b, sm0Var, this.f6967c, null));
        } catch (Throwable th) {
            sm0Var.mo10141l(th);
        }
    }
}
