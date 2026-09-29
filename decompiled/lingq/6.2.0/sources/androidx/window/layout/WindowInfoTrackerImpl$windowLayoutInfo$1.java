package androidx.window.layout;

import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC3212b;
import p000.C3386nv;
import p000.ExecutorC3014fu;
import p000.c32;
import p000.gd3;
import p000.ll7;
import p000.uw9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m4291f = "WindowInfoTrackerImpl.kt", m4292l = {52}, m4293m = "invokeSuspend")
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7133a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0768a f7135c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f7136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(C0768a c0768a, Context context, Continuation continuation) {
        super(2, continuation);
        this.f7135c = c0768a;
        this.f7136d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.f7135c, this.f7136d, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.f7134b = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7133a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ll7 ll7Var = (ll7) this.f7134b;
            gd3 gd3Var = new gd3(ll7Var, 2);
            C0768a c0768a = this.f7135c;
            c0768a.f7137b.mo163b(this.f7136d, new ExecutorC3014fu(1), gd3Var);
            uw9 uw9Var = new uw9(c0768a, gd3Var);
            this.f7133a = 1;
            if (AbstractC3212b.m15484a(ll7Var, uw9Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
