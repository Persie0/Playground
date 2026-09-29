package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobState;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u72 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63505b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63506c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f63507d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f63508e;

    public /* synthetic */ u72(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f63504a = i;
        this.f63505b = obj;
        this.f63506c = obj2;
        this.f63507d = obj3;
        this.f63508e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63504a) {
            case 0:
                w72 w72Var = (w72) this.f63505b;
                q50 q50Var = (q50) this.f63506c;
                String str = q50Var.f57279a;
                oba obaVar = (oba) this.f63507d;
                l40 l40Var = (l40) this.f63508e;
                w72Var.getClass();
                Logger logger = w72.f66462f;
                try {
                    eba ebaVarM12245a = w72Var.f66465c.m12245a(str);
                    if (ebaVarM12245a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        obaVar.mo17902b(new IllegalArgumentException(str2));
                    } else {
                        w72Var.f66467e.m13317p(new ah1(w72Var, q50Var, ((mo0) ebaVarM12245a).m16948a(l40Var)));
                        obaVar.mo17902b(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    obaVar.mo17902b(e);
                    return;
                }
            default:
                bd4 bd4Var = (bd4) this.f63505b;
                ie4 ie4Var = (ie4) this.f63506c;
                JobState jobState = (JobState) this.f63507d;
                C3309ls c3309ls = (C3309ls) this.f63508e;
                synchronized (bd4.f8367p) {
                    try {
                        tr9 tr9Var = bd4Var.f8379l;
                        if (tr9Var != null && tr9Var.m22279d()) {
                            bd4Var.f8382o = new Pair(ie4Var, jobState);
                            return;
                        }
                        if (bd4Var.f8378k == jobState) {
                            bd4Var.f8378k = JobState.Running;
                            bd4Var.m3638d(c3309ls, ie4Var, true);
                            return;
                        }
                        bd4Var.f8373f.m21555D("updateJobFromState failed, job not in the matching from state. current state = " + bd4Var.f8378k + " from state = " + jobState);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
