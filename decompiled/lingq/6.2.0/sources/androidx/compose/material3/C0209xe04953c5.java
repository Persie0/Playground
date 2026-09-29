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
import p000.k7a;
import p000.l7a;
import p000.o89;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1", m4291f = "AppBar.kt", m4292l = {2829}, m4293m = "invokeSuspend", m4294v = 1)
final class C0209xe04953c5 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f3162a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f3163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o89 f3164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209xe04953c5(o89 o89Var, Continuation continuation) {
        super(3, continuation);
        this.f3164c = o89Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0209xe04953c5 c0209xe04953c5 = new C0209xe04953c5(this.f3164c, (Continuation) obj3);
        c0209xe04953c5.f3163b = fFloatValue;
        return c0209xe04953c5.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k7a k7aVar = this.f3164c.f54014l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3162a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            float f = this.f3163b;
            l7a state = k7aVar.getState();
            f32 f32VarMo14943a = k7aVar.mo14943a();
            InterfaceC0025an interfaceC0025anMo14944b = k7aVar.mo14944b();
            this.f3162a = 1;
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
