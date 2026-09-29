package androidx.work;

import androidx.concurrent.futures.C0464b;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gm0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m4291f = "ListenableFuture.kt", m4292l = {42}, m4293m = "invokeSuspend")
final class ListenableFutureKt$launchFuture$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7160a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f7162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0464b f7163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$launchFuture$1$2(zi3 zi3Var, C0464b c0464b, Continuation continuation) {
        super(2, continuation);
        this.f7162c = zi3Var;
        this.f7163d = c0464b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.f7162c, this.f7163d, continuation);
        listenableFutureKt$launchFuture$1$2.f7161b = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ListenableFutureKt$launchFuture$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7160a;
        C0464b c0464b = this.f7163d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f7161b;
                zi3 zi3Var = this.f7162c;
                this.f7160a = 1;
                obj = zi3Var.invoke(un1Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            c0464b.m1908a(obj);
        } catch (CancellationException unused) {
            c0464b.f5331d = true;
            gm0 gm0Var = c0464b.f5329b;
            if (gm0Var != null && gm0Var.f40990b.cancel(true)) {
                c0464b.f5328a = null;
                c0464b.f5329b = null;
                c0464b.f5330c = null;
            }
        } catch (Throwable th) {
            c0464b.m1909b(th);
        }
        return xfa.f68157a;
    }
}
