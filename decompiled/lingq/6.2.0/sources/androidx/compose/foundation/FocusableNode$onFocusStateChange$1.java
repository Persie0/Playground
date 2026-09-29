package androidx.compose.foundation;

import androidx.compose.p002ui.relocation.AbstractC0415a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", m4291f = "Focusable.kt", m4292l = {225}, m4293m = "invokeSuspend", m4294v = 1)
final class FocusableNode$onFocusStateChange$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0121i f1676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusStateChange$1(C0121i c0121i, Continuation continuation) {
        super(2, continuation);
        this.f1676b = c0121i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FocusableNode$onFocusStateChange$1(this.f1676b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableNode$onFocusStateChange$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1675a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1675a = 1;
            if (AbstractC0415a.m1826a(this.f1676b, null, this) == coroutineSingletons) {
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
