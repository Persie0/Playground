package androidx.room;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", m4291f = "InvalidationTracker.kt", m4292l = {394}, m4293m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0750h f6780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f6781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(C0750h c0750h, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f6780b = c0750h;
        this.f6781c = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this.f6780b, this.f6781c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$refreshInvalidationAsync$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6779a;
        ui3 ui3Var = this.f6781c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0750h c0750h = this.f6780b;
                this.f6779a = 1;
                obj = C0750h.m2853b(c0750h, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ui3Var.mo0a();
            return xfa.f68157a;
        } catch (Throwable th) {
            ui3Var.mo0a();
            throw th;
        }
    }
}
