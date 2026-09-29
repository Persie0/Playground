package androidx.compose.material3;

import androidx.compose.animation.core.AbstractC0063e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0809bg;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.a62;
import p000.bj3;
import p000.c32;
import p000.rw1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.DrawerState$animateTo$3", m4291f = "NavigationDrawer.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 1)
final class DrawerState$animateTo$3 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f3168a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0809bg f3169b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ a62 f3170c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ DrawerValue f3171d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0253l f3172e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f3173f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0025an f3174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(C0253l c0253l, float f, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(4, continuation);
        this.f3172e = c0253l;
        this.f3173f = f;
        this.f3174g = interfaceC0025an;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.f3173f;
        InterfaceC0025an interfaceC0025an = this.f3174g;
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.f3172e, f, interfaceC0025an, (Continuation) obj4);
        drawerState$animateTo$3.f3169b = (C0809bg) obj;
        drawerState$animateTo$3.f3170c = (a62) obj2;
        drawerState$animateTo$3.f3171d = (DrawerValue) obj3;
        return drawerState$animateTo$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3168a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0809bg c0809bg = this.f3169b;
            float fM133f = this.f3170c.m133f(this.f3171d);
            if (!Float.isNaN(fM133f)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                C0253l c0253l = this.f3172e;
                float fM19861h = Float.isNaN(c0253l.f3552b.f2241j.m19861h()) ? 0.0f : c0253l.f3552b.f2241j.m19861h();
                ref$FloatRef.f47715a = fM19861h;
                rw1 rw1Var = new rw1(7, c0809bg, ref$FloatRef);
                this.f3169b = null;
                this.f3170c = null;
                this.f3168a = 1;
                if (AbstractC0063e.m754a(fM19861h, fM133f, this.f3173f, this.f3174g, rw1Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
