package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.dm3;
import p000.fa4;
import p000.gm5;
import p000.un1;
import p000.ve4;
import p000.vv1;
import p000.we4;
import p000.xe4;
import p000.xfa;
import p000.ye4;
import p000.ze4;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupSignupViewModel$confirmJoin$3", m4291f = "CupSignupViewModel.kt", m4292l = {138}, m4293m = "invokeSuspend", m4294v = 2)
final class CupSignupViewModel$confirmJoin$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1978e f24620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f24622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupSignupViewModel$confirmJoin$3(C1978e c1978e, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f24620b = c1978e;
        this.f24621c = str;
        this.f24622d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupSignupViewModel$confirmJoin$3(this.f24620b, this.f24621c, this.f24622d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupSignupViewModel$confirmJoin$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        vv1 vv1Var;
        Object objM7193f;
        Object value2;
        vv1 vv1Var2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        C1978e c1978e = this.f24620b;
        C3244l c3244l = c1978e.f24698i;
        C3244l c3244l2 = c1978e.f24696g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24619a;
        String str = this.f24621c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l2.getValue();
                vv1Var = (vv1) value;
            } while (!c3244l2.m15570h(value, vv1Var != null ? vv1.m23553a(vv1Var, null, 0, false, false, false, true, 767) : null));
            dm3 dm3Var = c1978e.f24693d;
            this.f24619a = 1;
            objM7193f = ((C1291g) dm3Var.f35822a).m7193f(str, this.f24622d, this);
            if (objM7193f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7193f = obj;
        }
        ze4 ze4Var = (ze4) objM7193f;
        if (ze4Var instanceof xe4) {
            c1978e.f24694e.m17610a(str);
            do {
                value5 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value5, null));
            do {
                value6 = c3244l.getValue();
                ((Boolean) value6).getClass();
            } while (!c3244l.m15570h(value6, Boolean.TRUE));
        } else if (ze4Var instanceof ve4) {
            do {
                value3 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value3, null));
            do {
                value4 = c3244l.getValue();
                ((Boolean) value4).getClass();
            } while (!c3244l.m15570h(value4, Boolean.TRUE));
        } else {
            if (!fa4.m11650l(ze4Var, ye4.f69728a) && !fa4.m11650l(ze4Var, we4.f66721a)) {
                gm5.m12750e();
                return null;
            }
            do {
                value2 = c3244l2.getValue();
                vv1Var2 = (vv1) value2;
            } while (!c3244l2.m15570h(value2, vv1Var2 != null ? vv1.m23553a(vv1Var2, null, 0, false, false, false, false, 703) : null));
        }
        return xfa.f68157a;
    }
}
