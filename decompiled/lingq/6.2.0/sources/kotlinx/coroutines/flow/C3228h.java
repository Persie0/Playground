package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.aj3;
import p000.c83;
import p000.e83;
import p000.x50;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3228h implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c83 f48057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f48058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f48059c;

    public C3228h(c83 c83Var, c83 c83Var2, aj3 aj3Var) {
        this.f48057a = c83Var;
        this.f48058b = c83Var2;
        this.f48059c = aj3Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Object objM15568a = AbstractC3238h.m15568a(e83Var, x50.f67767d, new FlowKt__ZipKt$combine$1$1(this.f48059c, null), continuation, new c83[]{this.f48057a, this.f48058b});
        return objM15568a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a : xfa.f68157a;
    }
}
