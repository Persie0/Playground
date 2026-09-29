package p235l5;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import p026b5.AbstractC1314g;
import p026b5.InterfaceC1316i;
import p041c5.C1699a0;
import p041c5.C1716n;
import p041c5.C1719q;
import p041c5.InterfaceC1720r;
import p041c5.RunnableC1707e0;
import p214k5.InterfaceC6600b;
import p214k5.InterfaceC6618t;

/* JADX INFO: renamed from: l5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC7257d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C1716n f40748a = new C1716n();

    /* JADX INFO: renamed from: a */
    public static void m14603a(C1699a0 c1699a0, String str) {
        RunnableC1707e0 runnableC1707e0;
        boolean z10;
        WorkDatabase workDatabase = c1699a0.f9477c;
        InterfaceC6618t interfaceC6618tMo4718z = workDatabase.mo4718z();
        InterfaceC6600b interfaceC6600bMo4713u = workDatabase.mo4713u();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo$State workInfo$StateMo13236n = interfaceC6618tMo4718z.mo13236n(str2);
            if (workInfo$StateMo13236n != WorkInfo$State.SUCCEEDED && workInfo$StateMo13236n != WorkInfo$State.FAILED) {
                interfaceC6618tMo4718z.mo13230h(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC6600bMo4713u.mo13203a(str2));
        }
        C1719q c1719q = c1699a0.f9480f;
        synchronized (c1719q.f9548l) {
            try {
                AbstractC1314g.m4867d().mo4869a(C1719q.f9536H, "Processor cancelling " + str);
                c1719q.f9546j.add(str);
                runnableC1707e0 = (RunnableC1707e0) c1719q.f9542f.remove(str);
                z10 = runnableC1707e0 != null;
                if (runnableC1707e0 == null) {
                    runnableC1707e0 = (RunnableC1707e0) c1719q.f9543g.remove(str);
                }
                if (runnableC1707e0 != null) {
                    c1719q.f9544h.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C1719q.m5453b(runnableC1707e0, str);
        if (z10) {
            c1719q.m5459h();
        }
        Iterator<InterfaceC1720r> it = c1699a0.f9479e.iterator();
        while (it.hasNext()) {
            it.next().mo5462c(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo14602b();

    @Override // java.lang.Runnable
    public final void run() {
        C1716n c1716n = this.f40748a;
        try {
            mo14602b();
            c1716n.m5452a(InterfaceC1316i.f8063a);
        } catch (Throwable th2) {
            c1716n.m5452a(new InterfaceC1316i.a.C10595a(th2));
        }
    }
}
