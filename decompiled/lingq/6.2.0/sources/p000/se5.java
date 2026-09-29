package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class se5 extends p28 {

    /* JADX INFO: renamed from: d */
    public final C3663uw f60762d;

    public se5(ve2 ve2Var) {
        re5 re5Var = new re5(this);
        qn3 qn3Var = new qn3(this);
        synchronized (bq1.f8852a) {
            try {
                if (bq1.f8853b == null) {
                    bq1.f8853b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3663uw c3663uw = new C3663uw(qn3Var, new b64(bq1.f8853b, ve2Var));
        this.f60762d = c3663uw;
        c3663uw.f64452d.add(re5Var);
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: a */
    public final int mo6133a() {
        return this.f60762d.f64454f.size();
    }

    /* JADX INFO: renamed from: k */
    public final Object m21308k(int i) {
        return this.f60762d.f64454f.get(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m21309l(List list) {
        C3663uw c3663uw = this.f60762d;
        qn3 qn3Var = c3663uw.f64449a;
        int i = c3663uw.f64455g + 1;
        c3663uw.f64455g = i;
        List list2 = c3663uw.f64453e;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            c3663uw.f64453e = null;
            c3663uw.f64454f = Collections.EMPTY_LIST;
            qn3Var.mo12584d(0, size);
            c3663uw.m22959a();
            return;
        }
        if (list2 != null) {
            ((Executor) c3663uw.f64450b.f8006a).execute(new RunnableC3626tw(c3663uw, list2, list, i));
            return;
        }
        c3663uw.f64453e = list;
        c3663uw.f64454f = Collections.unmodifiableList(list);
        qn3Var.mo12583c(0, list.size());
        c3663uw.m22959a();
    }
}
