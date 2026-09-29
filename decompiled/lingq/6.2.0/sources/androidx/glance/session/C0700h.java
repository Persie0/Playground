package androidx.glance.session;

import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p000.AbstractC0830c0;
import p000.kn1;
import p000.s46;
import p000.wfb;

/* JADX INFO: renamed from: androidx.glance.session.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0700h extends AbstractC0830c0 implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0701i f6275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0696d f6276c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f6277d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0700h(C0701i c0701i, AbstractC0696d abstractC0696d, Context context) {
        s46 s46Var = s46.f60287b;
        this.f6275b = c0701i;
        this.f6276c = abstractC0696d;
        this.f6277d = context;
        super(s46Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* JADX INFO: renamed from: p */
    public final void mo1248p(kn1 kn1Var, Throwable th) {
        Context context = this.f6277d;
        AbstractC0696d abstractC0696d = this.f6276c;
        C0701i c0701i = this.f6275b;
        wfb.m23926u(c0701i, null, null, new SessionWorkerKt$runSession$effectExceptionHandler$1$1(abstractC0696d, context, th, c0701i, null), 3);
    }
}
