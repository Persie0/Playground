package com.lingq.feature.challenges.cup;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.du1;
import p000.fa4;
import p000.gm5;
import p000.hm5;
import p000.mu1;
import p000.ns1;
import p000.s21;
import p000.t21;
import p000.u21;
import p000.un1;
import p000.v21;
import p000.vqb;
import p000.w21;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$claim$1", m4291f = "CupViewModel.kt", m4292l = {204}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$claim$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$claim$1(C1980g c1980g, Continuation continuation) {
        super(2, continuation);
        this.f24644b = c1980g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$claim$1(this.f24644b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$claim$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24643a;
        C1980g c1980g = this.f24644b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vqb vqbVar = c1980g.f24711g;
            this.f24643a = 1;
            obj = ((C1291g) ((mu1) vqbVar.f65802b)).m7188a(this);
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
        w21 w21Var = (w21) obj;
        if (w21Var instanceof s21) {
            ns1 ns1Var = c1980g.f24713i;
            boolean z = ((s21) w21Var).f60173a;
            hm5 hm5Var = ns1Var.f53179a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_new", z);
            ((C1240a) hm5Var).m7025f("Cup prize claimed", bundle);
            if (z) {
                C3244l c3244l = c1980g.f24716l;
                do {
                    value2 = c3244l.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l.m15570h(value2, Boolean.TRUE));
            }
        } else if (fa4.m11650l(w21Var, v21.f64719a)) {
            c1980g.m8844X2();
        } else if (!fa4.m11650l(w21Var, u21.f63263a)) {
            if (!fa4.m11650l(w21Var, t21.f61762a)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l2 = c1980g.f24717m;
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, du1.f36235a));
        }
        return xfa.f68157a;
    }
}
