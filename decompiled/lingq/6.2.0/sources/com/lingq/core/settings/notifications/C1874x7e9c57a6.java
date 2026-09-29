package com.lingq.core.settings.notifications;

import com.lingq.core.settings.ViewKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.gm5;
import p000.lda;
import p000.nn1;
import p000.rn6;
import p000.sn6;
import p000.tn6;
import p000.un6;
import p000.v91;
import p000.vi3;
import p000.vn6;
import p000.vz1;
import p000.wfb;
import p000.wn6;
import p000.xfa;
import p000.xu8;
import p000.y29;
import p000.yn6;

/* JADX INFO: renamed from: com.lingq.core.settings.notifications.NotificationsDailyLingqsScreenKt$NotificationSettingsDailyLingqsRoute$1$1 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C1874x7e9c57a6 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        ArrayList arrayList;
        wn6 wn6Var = (wn6) obj;
        wn6Var.getClass();
        C1876b c1876b = (C1876b) this.f47704b;
        C3244l c3244l = c1876b.f23017i;
        nn1 nn1Var = c1876b.f23014f;
        if (wn6Var instanceof tn6) {
            wfb.m23926u(lda.m16103C(c1876b), nn1Var, null, new NotificationsDailyLingqsViewModel$handleAction$1(c1876b, wn6Var, null), 2);
        } else if (wn6Var instanceof un6) {
            wfb.m23926u(lda.m16103C(c1876b), nn1Var, null, new NotificationsDailyLingqsViewModel$handleAction$2(c1876b, wn6Var, null), 2);
        } else if (wn6Var instanceof vn6) {
            do {
                value3 = c3244l.getValue();
                Integer num = ((yn6) ((C3244l) c1876b.f23018j.f9311a).getValue()).f70106b;
                List listM23605K = vz1.m23605K(25, 50, 75, 100, 200);
                arrayList = new ArrayList(v91.m23189q0(listM23605K, 10));
                Iterator it = listM23605K.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    arrayList.add(new y29(0, 112, ViewKeys.DailyLingQ, String.valueOf(iIntValue), String.valueOf(iIntValue), num != null && iIntValue == num.intValue(), false, false));
                }
            } while (!c3244l.m15570h(value3, new xu8(null, arrayList, false, 9)));
        } else if (wn6Var instanceof sn6) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, new xu8(null, null, false, 15)));
            wfb.m23926u(lda.m16103C(c1876b), nn1Var, null, new NotificationsDailyLingqsViewModel$handleAction$5(c1876b, wn6Var, null), 2);
        } else {
            if (!(wn6Var instanceof rn6)) {
                gm5.m12750e();
                return null;
            }
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new xu8(null, null, false, 15)));
        }
        return xfa.f68157a;
    }
}
