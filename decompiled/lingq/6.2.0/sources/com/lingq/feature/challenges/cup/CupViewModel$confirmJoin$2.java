package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cu1;
import p000.dm3;
import p000.eu1;
import p000.fa4;
import p000.fu1;
import p000.gm5;
import p000.gu1;
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
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$confirmJoin$2", m4291f = "CupViewModel.kt", m4292l = {262}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$confirmJoin$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24647c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f24648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$confirmJoin$2(C1980g c1980g, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f24646b = c1980g;
        this.f24647c = str;
        this.f24648d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$confirmJoin$2(this.f24646b, this.f24647c, this.f24648d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$confirmJoin$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        vv1 vv1Var;
        Object value2;
        vv1 vv1Var2;
        Object value3;
        Object value4;
        vv1 vv1Var3;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24645a;
        String str = this.f24647c;
        C1980g c1980g = this.f24646b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = c1980g.f24714j;
            do {
                value = c3244l.getValue();
                vv1Var = (vv1) value;
            } while (!c3244l.m15570h(value, vv1Var != null ? vv1.m23553a(vv1Var, null, 0, false, false, false, true, 767) : null));
            dm3 dm3Var = c1980g.f24712h;
            this.f24645a = 1;
            obj = ((C1291g) dm3Var.f35822a).m7193f(str, this.f24648d, this);
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
        ze4 ze4Var = (ze4) obj;
        if (ze4Var instanceof xe4) {
            c1980g.f24713i.m17610a(str);
            C3244l c3244l2 = c1980g.f24714j;
            do {
                value8 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value8, null));
            C3244l c3244l3 = c1980g.f24717m;
            do {
                value9 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value9, new fu1(str)));
        } else if (ze4Var instanceof ve4) {
            C3244l c3244l4 = c1980g.f24714j;
            do {
                value6 = c3244l4.getValue();
            } while (!c3244l4.m15570h(value6, null));
            C3244l c3244l5 = c1980g.f24717m;
            do {
                value7 = c3244l5.getValue();
            } while (!c3244l5.m15570h(value7, cu1.f34535a));
        } else if (fa4.m11650l(ze4Var, ye4.f69728a)) {
            C3244l c3244l6 = c1980g.f24714j;
            do {
                value4 = c3244l6.getValue();
                vv1Var3 = (vv1) value4;
            } while (!c3244l6.m15570h(value4, vv1Var3 != null ? vv1.m23553a(vv1Var3, null, 0, false, false, false, false, 703) : null));
            C3244l c3244l7 = c1980g.f24717m;
            do {
                value5 = c3244l7.getValue();
            } while (!c3244l7.m15570h(value5, gu1.f41321a));
        } else {
            if (!fa4.m11650l(ze4Var, we4.f66721a)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l8 = c1980g.f24714j;
            do {
                value2 = c3244l8.getValue();
                vv1Var2 = (vv1) value2;
            } while (!c3244l8.m15570h(value2, vv1Var2 != null ? vv1.m23553a(vv1Var2, null, 0, false, false, false, false, 703) : null));
            C3244l c3244l9 = c1980g.f24717m;
            do {
                value3 = c3244l9.getValue();
            } while (!c3244l9.m15570h(value3, eu1.f37854a));
        }
        return xfa.f68157a;
    }
}
