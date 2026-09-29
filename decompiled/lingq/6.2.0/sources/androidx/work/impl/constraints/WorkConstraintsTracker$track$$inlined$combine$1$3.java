package androidx.work.impl.constraints;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.fk1;
import p000.hk1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m4291f = "WorkConstraintsTracker.kt", m4292l = {288}, m4293m = "invokeSuspend")
public final class WorkConstraintsTracker$track$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f7227a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f7228b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f7229c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$3 = new WorkConstraintsTracker$track$$inlined$combine$1$3(3, (Continuation) obj3);
        workConstraintsTracker$track$$inlined$combine$1$3.f7228b = (e83) obj;
        workConstraintsTracker$track$$inlined$combine$1$3.f7229c = (Object[]) obj2;
        return workConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        hk1 hk1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7227a;
        hk1 hk1Var2 = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83 e83Var = this.f7228b;
            hk1[] hk1VarArr = (hk1[]) this.f7229c;
            int length = hk1VarArr.length;
            int i2 = 0;
            while (true) {
                hk1Var = fk1.f39219a;
                if (i2 >= length) {
                    break;
                }
                hk1 hk1Var3 = hk1VarArr[i2];
                if (!fa4.m11650l(hk1Var3, hk1Var)) {
                    hk1Var2 = hk1Var3;
                    break;
                }
                i2++;
            }
            if (hk1Var2 != null) {
                hk1Var = hk1Var2;
            }
            this.f7227a = 1;
            if (e83Var.emit(hk1Var, this) == coroutineSingletons) {
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
