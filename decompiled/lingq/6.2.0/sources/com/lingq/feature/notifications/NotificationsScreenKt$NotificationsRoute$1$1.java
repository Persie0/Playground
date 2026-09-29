package com.lingq.feature.notifications;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.gm5;
import p000.lda;
import p000.ln6;
import p000.mn6;
import p000.nn1;
import p000.nn6;
import p000.om6;
import p000.on6;
import p000.pn6;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class NotificationsScreenKt$NotificationsRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        pn6 pn6Var = (pn6) obj;
        pn6Var.getClass();
        C2168b c2168b = (C2168b) this.f47704b;
        c2168b.getClass();
        nn1 nn1Var = c2168b.f26885e;
        boolean zEquals = pn6Var.equals(on6.f54616a);
        xfa xfaVar = xfa.f68157a;
        if (zEquals) {
            wfb.m23926u(lda.m16103C(c2168b), nn1Var, null, new NotificationsViewModel$updateNotifications$1(true, c2168b, EmptyList.f47638a, null), 2);
            return xfaVar;
        }
        if (pn6Var.equals(nn6.f52999a)) {
            c2168b.m9101V2();
            return xfaVar;
        }
        if (pn6Var.equals(mn6.f51575a)) {
            if (!((Boolean) c2168b.f26887g.getValue()).booleanValue()) {
                c2168b.f26890j.mo4677k(xfaVar);
                return xfaVar;
            }
        } else {
            if (!(pn6Var instanceof ln6)) {
                gm5.m12750e();
                return null;
            }
            om6 om6Var = ((ln6) pn6Var).f49866a;
            if (om6Var.f54585g) {
                wfb.m23926u(lda.m16103C(c2168b), nn1Var, null, new NotificationsViewModel$updateNotifications$1(false, c2168b, vz1.m23604J(Integer.valueOf(om6Var.f54579a)), null), 2);
            }
        }
        return xfaVar;
    }
}
