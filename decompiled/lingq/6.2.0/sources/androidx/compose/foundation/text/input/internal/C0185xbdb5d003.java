package androidx.compose.foundation.text.input.internal;

import androidx.compose.p002ui.platform.AbstractC0410v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tw4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", m4291f = "LegacyAdaptingPlatformTextInputModifierNode.kt", m4292l = {137}, m4293m = "invokeSuspend", m4294v = 1)
final class C0185xbdb5d003 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw4 f2937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f2938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185xbdb5d003(tw4 tw4Var, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2937b = tw4Var;
        this.f2938c = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0185xbdb5d003(this.f2937b, this.f2938c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0185xbdb5d003) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2936a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f2936a = 1;
            if (AbstractC0410v.m1820a(this.f2937b, this.f2938c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
