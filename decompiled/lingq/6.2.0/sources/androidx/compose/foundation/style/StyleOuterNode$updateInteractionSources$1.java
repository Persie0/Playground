package androidx.compose.foundation.style;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C0006a4;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v56;
import p000.v66;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.style.StyleOuterNode$updateInteractionSources$1", m4291f = "StyleModifier.kt", m4292l = {741}, m4293m = "invokeSuspend", m4294v = 1)
final class StyleOuterNode$updateInteractionSources$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0159d f2736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v56 f2737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleOuterNode$updateInteractionSources$1(C0159d c0159d, v56 v56Var, Continuation continuation) {
        super(2, continuation);
        this.f2736b = c0159d;
        this.f2737c = v56Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyleOuterNode$updateInteractionSources$1(this.f2736b, this.f2737c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StyleOuterNode$updateInteractionSources$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2735a;
        Object obj3 = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj3;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        v66 v66Var = this.f2736b.f2759T;
        this.f2735a = 1;
        C0006a4 c0006a4 = new C0006a4();
        C0006a4 c0006a5 = new C0006a4();
        C0006a4 c0006a6 = new C0006a4();
        v66Var.m23151c(false);
        v66Var.m23150b(false);
        v66Var.m23149a(false);
        C3229i c3229i = this.f2737c.f64886a;
        C0156a c0156a = new C0156a(c0006a4, v66Var, c0006a5, c0006a6);
        c3229i.getClass();
        Object objM15548j = C3229i.m15548j(c3229i, c0156a, this);
        if (objM15548j != obj2) {
            objM15548j = obj3;
        }
        return objM15548j == obj2 ? obj2 : obj3;
    }
}
