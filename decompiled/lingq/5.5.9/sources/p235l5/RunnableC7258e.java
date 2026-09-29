package p235l5;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1318k;
import p026b5.InterfaceC1316i;
import p041c5.C1699a0;
import p041c5.C1716n;
import p041c5.C1721s;
import p041c5.C1723u;
import p214k5.C6599a;
import p214k5.C6611m;
import p214k5.C6617s;
import p214k5.InterfaceC6600b;
import p214k5.InterfaceC6612n;
import p214k5.InterfaceC6618t;
import p214k5.InterfaceC6621w;

/* JADX INFO: renamed from: l5.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7258e implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final String f40749c = AbstractC1314g.m4868f("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public final C1723u f40750a;

    /* JADX INFO: renamed from: b */
    public final C1716n f40751b;

    public RunnableC7258e(C1723u c1723u) {
        C1716n c1716n = new C1716n();
        this.f40750a = c1723u;
        this.f40751b = c1716n;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    /* JADX INFO: renamed from: a */
    public static boolean m14604a(C1723u c1723u) {
        boolean zM14604a;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Iterator<? extends AbstractC1318k> it;
        List<C1723u> list = c1723u.f9561g;
        String str = f40749c;
        if (list != null) {
            zM14604a = false;
            for (C1723u c1723u2 : list) {
                if (c1723u2.f9562h) {
                    AbstractC1314g.m4867d().mo4873g(str, "Already enqueued work ids (" + TextUtils.join(", ", c1723u2.f9559e) + ")");
                } else {
                    zM14604a |= m14604a(c1723u2);
                }
            }
        } else {
            zM14604a = false;
        }
        String[] strArr = (String[]) C1723u.m5465m0(c1723u).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1699a0 c1699a0 = c1723u.f9555a;
        WorkDatabase workDatabase = c1699a0.f9477c;
        boolean z18 = strArr != null && strArr.length > 0;
        if (z18) {
            int length = strArr.length;
            int i10 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            while (true) {
                if (i10 < length) {
                    String str2 = strArr[i10];
                    C6617s c6617sMo13237o = workDatabase.mo4718z().mo13237o(str2);
                    if (c6617sMo13237o == null) {
                        AbstractC1314g.m4867d().mo4870b(str, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        WorkInfo$State workInfo$State = c6617sMo13237o.f37525b;
                        z10 &= workInfo$State == WorkInfo$State.SUCCEEDED;
                        if (workInfo$State == WorkInfo$State.FAILED) {
                            z12 = true;
                        } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                z13 = zM14604a;
                z17 = true;
                z16 = false;
                c1723u.f9562h = z17;
                return z13 | z16;
            }
        }
        z10 = true;
        z11 = false;
        z12 = false;
        String str3 = c1723u.f9556b;
        boolean z19 = !TextUtils.isEmpty(str3);
        if (z19 && !z18) {
            ArrayList arrayListMo13227e = workDatabase.mo4718z().mo13227e(str3);
            if (arrayListMo13227e.isEmpty()) {
                z13 = zM14604a;
                z14 = z18;
            } else {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.APPEND;
                ExistingWorkPolicy existingWorkPolicy2 = c1723u.f9557c;
                if (existingWorkPolicy2 == existingWorkPolicy || existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    InterfaceC6600b interfaceC6600bMo4713u = workDatabase.mo4713u();
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = arrayListMo13227e.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        C6617s.a aVar = (C6617s.a) it2.next();
                        boolean z20 = zM14604a;
                        if (!interfaceC6600bMo4713u.mo13205c(aVar.f37544a)) {
                            WorkInfo$State workInfo$State2 = WorkInfo$State.SUCCEEDED;
                            WorkInfo$State workInfo$State3 = aVar.f37545b;
                            boolean z21 = (workInfo$State3 == workInfo$State2) & z10;
                            if (workInfo$State3 == WorkInfo$State.FAILED) {
                                z12 = true;
                            } else if (workInfo$State3 == WorkInfo$State.CANCELLED) {
                                z11 = true;
                            }
                            arrayList.add(aVar.f37544a);
                            z10 = z21;
                        }
                        interfaceC6600bMo4713u = interfaceC6600bMo4713u;
                        it2 = it3;
                        zM14604a = z20;
                    }
                    z13 = zM14604a;
                    List listEmptyList = arrayList;
                    listEmptyList = arrayList;
                    if (existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE && (z11 || z12)) {
                        InterfaceC6618t interfaceC6618tMo4718z = workDatabase.mo4718z();
                        Iterator it4 = interfaceC6618tMo4718z.mo13227e(str3).iterator();
                        while (it4.hasNext()) {
                            interfaceC6618tMo4718z.mo13223a(((C6617s.a) it4.next()).f37544a);
                        }
                        z11 = false;
                        z12 = false;
                        listEmptyList = Collections.emptyList();
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z14 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy2 == ExistingWorkPolicy.KEEP) {
                        Iterator it5 = arrayListMo13227e.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                WorkInfo$State workInfo$State4 = ((C6617s.a) it5.next()).f37545b;
                                boolean z22 = z18;
                                if (workInfo$State4 == WorkInfo$State.ENQUEUED || workInfo$State4 == WorkInfo$State.RUNNING) {
                                    z13 = zM14604a;
                                    z17 = true;
                                    z16 = false;
                                    c1723u.f9562h = z17;
                                    return z13 | z16;
                                }
                                z18 = z22;
                            }
                        }
                    }
                    boolean z23 = z18;
                    new C7256c(c1699a0, str3).run();
                    InterfaceC6618t interfaceC6618tMo4718z2 = workDatabase.mo4718z();
                    Iterator it6 = arrayListMo13227e.iterator();
                    while (it6.hasNext()) {
                        interfaceC6618tMo4718z2.mo13223a(((C6617s.a) it6.next()).f37544a);
                    }
                    z13 = zM14604a;
                    z14 = z23;
                    z15 = true;
                }
            }
            z15 = false;
        } else {
            z13 = zM14604a;
            z14 = z18;
            z15 = false;
        }
        Iterator<? extends AbstractC1318k> it7 = c1723u.f9558d.iterator();
        while (it7.hasNext()) {
            AbstractC1318k next = it7.next();
            C6617s c6617s = next.f8067b;
            if (!z14 || z10) {
                it = it7;
                c6617s.f37537n = jCurrentTimeMillis;
            } else if (z12) {
                it = it7;
                c6617s.f37525b = WorkInfo$State.FAILED;
            } else {
                it = it7;
                if (z11) {
                    c6617s.f37525b = WorkInfo$State.CANCELLED;
                } else {
                    c6617s.f37525b = WorkInfo$State.BLOCKED;
                }
            }
            long j10 = jCurrentTimeMillis;
            if (c6617s.f37525b == WorkInfo$State.ENQUEUED) {
                z15 = true;
            }
            InterfaceC6618t interfaceC6618tMo4718z3 = workDatabase.mo4718z();
            C5207g.m11111f(c1699a0.f9479e, "schedulers");
            interfaceC6618tMo4718z3.mo13242t(c6617s);
            UUID uuid = next.f8066a;
            if (z14) {
                int length2 = strArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = length2;
                    String str4 = strArr[i11];
                    C1699a0 c1699a1 = c1699a0;
                    String string = uuid.toString();
                    C5207g.m11110e(string, "id.toString()");
                    workDatabase.mo4713u().mo13206d(new C6599a(string, str4));
                    i11++;
                    length2 = i12;
                    strArr = strArr;
                    c1699a0 = c1699a1;
                }
            }
            String[] strArr2 = strArr;
            C1699a0 c1699a2 = c1699a0;
            InterfaceC6621w interfaceC6621wMo4712A = workDatabase.mo4712A();
            String string2 = uuid.toString();
            C5207g.m11110e(string2, "id.toString()");
            interfaceC6621wMo4712A.mo13245b(string2, next.f8068c);
            if (z19) {
                InterfaceC6612n interfaceC6612nMo4716x = workDatabase.mo4716x();
                String string3 = uuid.toString();
                C5207g.m11110e(string3, "id.toString()");
                interfaceC6612nMo4716x.mo13216a(new C6611m(str3, string3));
            }
            it7 = it;
            jCurrentTimeMillis = j10;
            strArr = strArr2;
            c1699a0 = c1699a2;
        }
        z16 = z15;
        z17 = true;
        c1723u.f9562h = z17;
        return z13 | z16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1716n c1716n = this.f40751b;
        C1723u c1723u = this.f40750a;
        try {
            c1723u.getClass();
            C1699a0 c1699a0 = c1723u.f9555a;
            if (C1723u.m5464l0(c1723u, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c1723u + ")");
            }
            WorkDatabase workDatabase = c1699a0.f9477c;
            workDatabase.m4552c();
            try {
                boolean zM14604a = m14604a(c1723u);
                workDatabase.m4568s();
                workDatabase.m4563n();
                if (zM14604a) {
                    C7267n.m14658a(c1699a0.f9475a, RescheduleReceiver.class, true);
                    C1721s.m5463a(c1699a0.f9476b, c1699a0.f9477c, c1699a0.f9479e);
                }
                c1716n.m5452a(InterfaceC1316i.f8063a);
            } catch (Throwable th2) {
                workDatabase.m4563n();
                throw th2;
            }
        } catch (Throwable th3) {
            c1716n.m5452a(new InterfaceC1316i.a.C10595a(th3));
        }
    }
}
