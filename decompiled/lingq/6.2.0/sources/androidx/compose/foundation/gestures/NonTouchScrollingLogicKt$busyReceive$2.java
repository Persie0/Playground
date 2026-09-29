package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.cu0;
import p000.pg9;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", m4291f = "NonTouchScrollingLogic.kt", m4292l = {80}, m4293m = "invokeSuspend", m4294v = 1)
final class NonTouchScrollingLogicKt$busyReceive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2018a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2019b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cu0 f2020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2(cu0 cu0Var, Continuation continuation) {
        super(2, continuation);
        this.f2020c = cu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.f2020c, continuation);
        nonTouchScrollingLogicKt$busyReceive$2.f2019b = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogicKt$busyReceive$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        cd4 cd4Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2018a;
        if (i != 0) {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cd4Var = (cd4) this.f2019b;
            try {
                AbstractC3193b.m15359b(obj);
                cd4Var.mo4537a(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                cd4Var.mo4537a(null);
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        pg9 pg9VarM23926u = wfb.m23926u((un1) this.f2019b, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(2, null), 3);
        try {
            cu0 cu0Var = this.f2020c;
            this.f2019b = pg9VarM23926u;
            this.f2018a = 1;
            Object objMo9892o = cu0Var.mo9892o(this);
            if (objMo9892o == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objMo9892o;
            cd4Var = pg9VarM23926u;
            cd4Var.mo4537a(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            cd4Var = pg9VarM23926u;
            cd4Var.mo4537a(null);
            throw th;
        }
    }
}
