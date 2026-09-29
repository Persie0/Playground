package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.aj3;
import p000.c32;
import p000.f32;
import p000.ida;
import p000.k7a;
import p000.l7a;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1", m4291f = "AppBar.kt", m4292l = {3065}, m4293m = "invokeSuspend", m4294v = 1)
final class C0210xfd8dbae5 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f3165a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f3166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ida f3167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210xfd8dbae5(ida idaVar, Continuation continuation) {
        super(3, continuation);
        this.f3167c = idaVar;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0210xfd8dbae5 c0210xfd8dbae5 = new C0210xfd8dbae5(this.f3167c, (Continuation) obj3);
        c0210xfd8dbae5.f3166b = fFloatValue;
        return c0210xfd8dbae5.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k7a k7aVar = this.f3167c.f44004r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3165a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            float f = this.f3166b;
            l7a state = k7aVar.getState();
            f32 f32VarMo14943a = k7aVar.mo14943a();
            InterfaceC0025an interfaceC0025anMo14944b = k7aVar.mo14944b();
            this.f3165a = 1;
            if (AbstractC0218a.m1128h(state, f, f32VarMo14943a, interfaceC0025anMo14944b, this) == coroutineSingletons) {
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
