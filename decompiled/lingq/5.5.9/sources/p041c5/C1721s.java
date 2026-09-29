package p041c5;

import androidx.work.C1243a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p214k5.C6617s;
import p214k5.InterfaceC6618t;

/* JADX INFO: renamed from: c5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1721s {

    /* JADX INFO: renamed from: a */
    public static final String f9552a = AbstractC1314g.m4868f("Schedulers");

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m5463a(C1243a c1243a, WorkDatabase workDatabase, List<InterfaceC1720r> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC6618t interfaceC6618tMo4718z = workDatabase.mo4718z();
        workDatabase.m4552c();
        try {
            ArrayList arrayListMo13229g = interfaceC6618tMo4718z.mo13229g(c1243a.f7817h);
            ArrayList arrayListMo13224b = interfaceC6618tMo4718z.mo13224b();
            if (arrayListMo13229g != null && arrayListMo13229g.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListMo13229g.iterator();
                while (it.hasNext()) {
                    interfaceC6618tMo4718z.mo13226d(((C6617s) it.next()).f37524a, jCurrentTimeMillis);
                }
            }
            workDatabase.m4568s();
            workDatabase.m4563n();
            if (arrayListMo13229g != null && arrayListMo13229g.size() > 0) {
                C6617s[] c6617sArr = (C6617s[]) arrayListMo13229g.toArray(new C6617s[arrayListMo13229g.size()]);
                for (InterfaceC1720r interfaceC1720r : list) {
                    if (interfaceC1720r.mo5461b()) {
                        interfaceC1720r.mo5460a(c6617sArr);
                    }
                }
            }
            if (arrayListMo13224b != null && arrayListMo13224b.size() > 0) {
                C6617s[] c6617sArr2 = (C6617s[]) arrayListMo13224b.toArray(new C6617s[arrayListMo13224b.size()]);
                Iterator<InterfaceC1720r> it2 = list.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        InterfaceC1720r next = it2.next();
                        if (!next.mo5461b()) {
                            next.mo5460a(c6617sArr2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.m4563n();
            throw th2;
        }
    }
}
