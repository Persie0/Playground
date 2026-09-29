package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class um8 {

    /* JADX INFO: renamed from: a */
    public static final String f64079a = oj5.m18041h("Schedulers");

    /* JADX INFO: renamed from: a */
    public static void m22794a(u8b u8bVar, gr7 gr7Var, List list) {
        if (list.size() > 0) {
            gr7Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u8bVar.m22571g(((p8b) it.next()).f55772a, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m22795b(hh1 hh1Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        u8b u8bVarMo2909z = workDatabase.mo2909z();
        workDatabase.m2830c();
        try {
            AbstractC0746d abstractC0746d = u8bVarMo2909z.f63598a;
            AbstractC0746d abstractC0746d2 = u8bVarMo2909z.f63598a;
            List list2 = (List) AbstractC0758a.m2859b(abstractC0746d, true, false, new foa(15));
            m22794a(u8bVarMo2909z, hh1Var.f42350d, list2);
            List list3 = (List) AbstractC0758a.m2859b(abstractC0746d2, true, false, new y91(hh1Var.f42357k, 3));
            m22794a(u8bVarMo2909z, hh1Var.f42350d, list3);
            list3.addAll(list2);
            List list4 = (List) AbstractC0758a.m2859b(abstractC0746d2, true, false, new foa(17));
            workDatabase.m2846s();
            workDatabase.m2835h();
            if (list3.size() > 0) {
                p8b[] p8bVarArr = (p8b[]) list3.toArray(new p8b[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sm8 sm8Var = (sm8) it.next();
                    if (sm8Var.mo21480c()) {
                        sm8Var.mo21482e(p8bVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                p8b[] p8bVarArr2 = (p8b[]) list4.toArray(new p8b[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    sm8 sm8Var2 = (sm8) it2.next();
                    if (!sm8Var2.mo21480c()) {
                        sm8Var2.mo21482e(p8bVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m2835h();
            throw th;
        }
    }
}
