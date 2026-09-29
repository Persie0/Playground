package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.C3575si;
import p000.c32;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", m4291f = "Button.kt", m4292l = {1715}, m4293m = "invokeSuspend", m4294v = 1)
final class ButtonElevation$animateElevation$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f3136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SnapshotStateList f3137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$1$1(v56 v56Var, SnapshotStateList snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.f3136b = v56Var;
        this.f3137c = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonElevation$animateElevation$1$1(this.f3136b, this.f3137c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3135a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3229i c3229i = this.f3136b.f64886a;
            C3575si c3575si = new C3575si(this.f3137c, 1);
            this.f3135a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, c3575si, this) == coroutineSingletons) {
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
