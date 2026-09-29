package androidx.compose.material3;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", m4291f = "FloatingActionButton.kt", m4292l = {1308}, m4293m = "invokeSuspend", m4294v = 1)
final class FloatingActionButtonElevation$animateElevation$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3186a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v56 f3188c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0256o f3189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(v56 v56Var, C0256o c0256o, Continuation continuation) {
        super(2, continuation);
        this.f3188c = v56Var;
        this.f3189d = c0256o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.f3188c, this.f3189d, continuation);
        floatingActionButtonElevation$animateElevation$2$1.f3187b = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3186a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f3187b;
            ArrayList arrayList = new ArrayList();
            C3229i c3229i = this.f3188c.f64886a;
            C0255n c0255n = new C0255n(arrayList, un1Var, this.f3189d);
            this.f3186a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, c0255n, this) == coroutineSingletons) {
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
