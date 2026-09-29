package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.z93;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$1", m4291f = "NavigationDrawer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class NavigationDrawerKt$ModalNavigationDrawer$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0253l f3222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z93 f3223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$1(C0253l c0253l, z93 z93Var, Continuation continuation) {
        super(2, continuation);
        this.f3222a = c0253l;
        this.f3223b = z93Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationDrawerKt$ModalNavigationDrawer$2$1(this.f3222a, this.f3223b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        NavigationDrawerKt$ModalNavigationDrawer$2$1 navigationDrawerKt$ModalNavigationDrawer$2$1 = (NavigationDrawerKt$ModalNavigationDrawer$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        navigationDrawerKt$ModalNavigationDrawer$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f3222a.m1182c()) {
            z93.m25512a(this.f3223b);
        }
        return xfa.f68157a;
    }
}
