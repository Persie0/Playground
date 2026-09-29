package p000;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pf3 extends ge3 {

    /* JADX INFO: renamed from: f */
    public static final C3723wi f56052f = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f56053a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final s46 f56054b;

    /* JADX INFO: renamed from: c */
    public final mba f56055c;

    /* JADX INFO: renamed from: d */
    public final C3659us f56056d;

    /* JADX INFO: renamed from: e */
    public final ug3 f56057e;

    public pf3(s46 s46Var, mba mbaVar, C3659us c3659us, ug3 ug3Var) {
        this.f56054b = s46Var;
        this.f56055c = mbaVar;
        this.f56056d = c3659us;
        this.f56057e = ug3Var;
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: b */
    public final void mo12508b(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        mz6 mz6Var;
        Object[] objArr = {abstractComponentCallbacksC0635c.getClass().getSimpleName()};
        C3723wi c3723wi = f56052f;
        c3723wi.m23972b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f56053a;
        if (!weakHashMap.containsKey(abstractComponentCallbacksC0635c)) {
            c3723wi.m23976g("FragmentMonitor: missed a fragment trace from %s", abstractComponentCallbacksC0635c.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(abstractComponentCallbacksC0635c);
        weakHashMap.remove(abstractComponentCallbacksC0635c);
        ug3 ug3Var = this.f56057e;
        HashMap map = ug3Var.f63884c;
        C3723wi c3723wi2 = ug3.f63881e;
        if (!ug3Var.f63885d) {
            c3723wi2.m23971a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            mz6Var = new mz6();
        } else if (map.containsKey(abstractComponentCallbacksC0635c)) {
            tg3 tg3Var = (tg3) map.remove(abstractComponentCallbacksC0635c);
            mz6 mz6VarM22725a = ug3Var.m22725a();
            if (mz6VarM22725a.m17160b()) {
                tg3 tg3Var2 = (tg3) mz6VarM22725a.m17159a();
                mz6Var = new mz6(new tg3(tg3Var2.f62252a - tg3Var.f62252a, tg3Var2.f62253b - tg3Var.f62253b, tg3Var2.f62254c - tg3Var.f62254c));
            } else {
                c3723wi2.m23972b("stopFragment(%s): snapshot() failed", abstractComponentCallbacksC0635c.getClass().getSimpleName());
                mz6Var = new mz6();
            }
        } else {
            c3723wi2.m23972b("Sub-recording associated with key %s was not started or does not exist", abstractComponentCallbacksC0635c.getClass().getSimpleName());
            mz6Var = new mz6();
        }
        if (!mz6Var.m17160b()) {
            c3723wi.m23976g("onFragmentPaused: recorder failed to trace %s", abstractComponentCallbacksC0635c.getClass().getSimpleName());
        } else {
            dn8.m10498a(trace, (tg3) mz6Var.m17159a());
            trace.stop();
        }
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: c */
    public final void mo12509c(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
        f56052f.m23972b("FragmentMonitor %s.onFragmentResumed", abstractComponentCallbacksC0635c.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(abstractComponentCallbacksC0635c.getClass().getSimpleName()), this.f56055c, this.f56054b, this.f56056d);
        trace.start();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c.f5677S;
        trace.putAttribute("Parent_fragment", abstractComponentCallbacksC0635c2 == null ? "No parent" : abstractComponentCallbacksC0635c2.getClass().getSimpleName());
        if (abstractComponentCallbacksC0635c.m2105g() != null) {
            trace.putAttribute("Hosting_activity", abstractComponentCallbacksC0635c.m2105g().getClass().getSimpleName());
        }
        this.f56053a.put(abstractComponentCallbacksC0635c, trace);
        ug3 ug3Var = this.f56057e;
        HashMap map = ug3Var.f63884c;
        C3723wi c3723wi = ug3.f63881e;
        if (!ug3Var.f63885d) {
            c3723wi.m23971a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(abstractComponentCallbacksC0635c)) {
            c3723wi.m23972b("Cannot start sub-recording because one is already ongoing with the key %s", abstractComponentCallbacksC0635c.getClass().getSimpleName());
            return;
        }
        mz6 mz6VarM22725a = ug3Var.m22725a();
        if (mz6VarM22725a.m17160b()) {
            map.put(abstractComponentCallbacksC0635c, (tg3) mz6VarM22725a.m17159a());
        } else {
            c3723wi.m23972b("startFragment(%s): snapshot() failed", abstractComponentCallbacksC0635c.getClass().getSimpleName());
        }
    }
}
