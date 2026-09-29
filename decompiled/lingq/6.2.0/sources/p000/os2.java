package p000;

import android.text.TextUtils;
import androidx.room.util.AbstractC0758a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class os2 {

    /* JADX INFO: renamed from: a */
    public static final String f54929a = oj5.m18041h("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public static void m18458a(w7b w7bVar) {
        boolean z;
        C0773b c0773b = w7bVar.f66496a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(w7bVar.f66500e);
        HashSet hashSetM23804b = w7b.m23804b(w7bVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(w7bVar.f66500e);
                z = false;
                break;
            } else if (hashSetM23804b.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            v63.m23148z("WorkContinuation has cycles (", w7bVar, ")");
            return;
        }
        WorkDatabase workDatabase = c0773b.f7206c;
        hh1 hh1Var = c0773b.f7205b;
        workDatabase.m2830c();
        try {
            kcd.m15121a(workDatabase, hh1Var, w7bVar);
            boolean zM18459b = m18459b(w7bVar);
            workDatabase.m2846s();
            workDatabase.m2835h();
            if (zM18459b) {
                um8.m22795b(hh1Var, c0773b.f7206c, c0773b.f7208e);
            }
        } catch (Throwable th) {
            workDatabase.m2835h();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0198  */
    /* JADX INFO: renamed from: b */
    public static boolean m18459b(w7b w7bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        HashSet hashSetM23804b = w7b.m23804b(w7bVar);
        C0773b c0773b = w7bVar.f66496a;
        List list2 = w7bVar.f66499d;
        String[] strArr = (String[]) hashSetM23804b.toArray(new String[0]);
        String str = w7bVar.f66497b;
        ExistingWorkPolicy existingWorkPolicy = w7bVar.f66498c;
        c0773b.f7205b.f42350d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = c0773b.f7206c;
        boolean z8 = strArr != null && strArr.length > 0;
        if (z8) {
            int length = strArr.length;
            int i = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    p8b p8bVarM22569e = workDatabase2.mo2909z().m22569e(str2);
                    if (p8bVarM22569e == null) {
                        oj5.m18040f().m18043c(f54929a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        WorkInfo$State workInfo$State = p8bVarM22569e.f55773b;
                        z &= workInfo$State == WorkInfo$State.SUCCEEDED;
                        if (workInfo$State == WorkInfo$State.FAILED) {
                            z3 = true;
                        } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                z7 = false;
                z6 = true;
                w7bVar.f66502g = z6;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z8) {
            list = list2;
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
        } else {
            List<n8b> listM22570f = workDatabase2.mo2909z().m22570f(str);
            if (listM22570f.isEmpty()) {
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                rb2 rb2VarMo2904u = workDatabase2.mo2904u();
                ArrayList arrayList = new ArrayList();
                for (n8b n8bVar : listM22570f) {
                    List list3 = list2;
                    String str3 = n8bVar.f52497a;
                    rb2VarMo2904u.getClass();
                    str3.getClass();
                    boolean z9 = zIsEmpty;
                    WorkDatabase workDatabase3 = workDatabase2;
                    rb2 rb2Var = rb2VarMo2904u;
                    if (!((Boolean) AbstractC0758a.m2859b(rb2VarMo2904u.f59016a, true, false, new t70(str3, 20))).booleanValue()) {
                        WorkInfo$State workInfo$State2 = n8bVar.f52498b;
                        boolean z10 = (workInfo$State2 == WorkInfo$State.SUCCEEDED) & z;
                        if (workInfo$State2 == WorkInfo$State.FAILED) {
                            z3 = true;
                        } else if (workInfo$State2 == WorkInfo$State.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(n8bVar.f52497a);
                        z = z10;
                    }
                    list2 = list3;
                    zIsEmpty = z9;
                    workDatabase2 = workDatabase3;
                    rb2VarMo2904u = rb2Var;
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                List list4 = arrayList;
                list4 = arrayList;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                    u8b u8bVarMo2909z = workDatabase.mo2909z();
                    Iterator it = u8bVarMo2909z.m22570f(str).iterator();
                    while (it.hasNext()) {
                        u8bVarMo2909z.m22567c(((n8b) it.next()).f52497a);
                    }
                    z2 = false;
                    z3 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z8 = strArr.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator it2 = listM22570f.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            WorkInfo$State workInfo$State3 = ((n8b) it2.next()).f52498b;
                            if (workInfo$State3 == WorkInfo$State.ENQUEUED || workInfo$State3 == WorkInfo$State.RUNNING) {
                                z7 = false;
                                z6 = true;
                                w7bVar.f66502g = z6;
                                return z7;
                            }
                        }
                    }
                }
                workDatabase2.getClass();
                workDatabase2.m2845r(new hz4(new RunnableC3725wk(workDatabase2, str, c0773b, 4), 29));
                u8b u8bVarMo2909z2 = workDatabase2.mo2909z();
                Iterator it3 = listM22570f.iterator();
                while (it3.hasNext()) {
                    u8bVarMo2909z2.m22567c(((n8b) it3.next()).f52497a);
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = true;
            }
            z5 = false;
        }
        Iterator it4 = list.iterator();
        boolean z11 = z5;
        while (it4.hasNext()) {
            l8b l8bVar = (l8b) it4.next();
            p8b p8bVar = l8bVar.f49310b;
            UUID uuid = l8bVar.f49309a;
            if (!z8 || z) {
                p8bVar.f55785n = jCurrentTimeMillis;
            } else if (z3) {
                p8bVar.f55773b = WorkInfo$State.FAILED;
            } else if (z2) {
                p8bVar.f55773b = WorkInfo$State.CANCELLED;
            } else {
                p8bVar.f55773b = WorkInfo$State.BLOCKED;
            }
            if (p8bVar.f55773b == WorkInfo$State.ENQUEUED) {
                z11 = true;
            }
            u8b u8bVarMo2909z3 = workDatabase.mo2909z();
            p8b p8bVarM15122b = kcd.m15122b(c0773b.f7208e, p8bVar);
            u8bVarMo2909z3.getClass();
            C0773b c0773b2 = c0773b;
            Iterator it5 = it4;
            AbstractC0758a.m2859b(u8bVarMo2909z3.f63598a, false, true, new s8b(u8bVarMo2909z3, p8bVarM15122b, 0));
            if (z8) {
                int i2 = 0;
                for (int length2 = strArr.length; i2 < length2; length2 = length2) {
                    String str4 = strArr[i2];
                    String string = uuid.toString();
                    string.getClass();
                    kb2 kb2Var = new kb2(string, str4);
                    rb2 rb2VarMo2904u2 = workDatabase.mo2904u();
                    rb2VarMo2904u2.getClass();
                    AbstractC0758a.m2859b(rb2VarMo2904u2.f59016a, false, true, new s70(29, rb2VarMo2904u2, kb2Var));
                    i2++;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            w8b w8bVarMo2903A = workDatabase.mo2903A();
            String string2 = uuid.toString();
            string2.getClass();
            w8bVarMo2903A.m23814a(string2, l8bVar.f49311c);
            if (!z4) {
                g8b g8bVarMo2907x = workDatabase.mo2907x();
                String string3 = uuid.toString();
                string3.getClass();
                f8b f8bVar = new f8b(str, string3);
                g8bVarMo2907x.getClass();
                AbstractC0758a.m2859b(g8bVarMo2907x.f40403a, false, true, new r3a(18, g8bVarMo2907x, f8bVar));
            }
            c0773b = c0773b2;
            it4 = it5;
            strArr = strArr2;
        }
        z6 = true;
        z7 = z11;
        w7bVar.f66502g = z6;
        return z7;
    }
}
