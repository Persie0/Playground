package com.lingq.feature.challenges.cup;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.gm5;
import p000.jt1;
import p000.kt1;
import p000.lda;
import p000.lt1;
import p000.mt1;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CupDailyPrizeScreenKt$CupDailyPrizeRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        mt1 mt1Var = (mt1) obj;
        mt1Var.getClass();
        C1977d c1977d = (C1977d) this.f47704b;
        c1977d.getClass();
        if (mt1Var.equals(jt1.f46101a)) {
            wfb.m23926u(lda.m16103C(c1977d), null, null, new CupDailyPrizeViewModel$claim$1(c1977d, null), 3);
        } else if (mt1Var.equals(kt1.f48404a)) {
            C3244l c3244l = c1977d.f24688f;
            do {
                value2 = c3244l.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l.m15570h(value2, Boolean.FALSE));
        } else {
            if (!mt1Var.equals(lt1.f50095a)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l2 = c1977d.f24689g;
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, null));
        }
        return xfa.f68157a;
    }
}
