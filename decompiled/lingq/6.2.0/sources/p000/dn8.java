package p000;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants$CounterNames;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn8 {

    /* JADX INFO: renamed from: a */
    public static final C3723wi f35901a = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public static void m10498a(Trace trace, tg3 tg3Var) {
        int i = tg3Var.f62252a;
        int i2 = tg3Var.f62254c;
        int i3 = tg3Var.f62253b;
        if (i > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), i);
        }
        if (i3 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), i3);
        }
        if (i2 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), i2);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        AbstractC3393o1.m17748w(i, trace.f13775d, " _fr_tot:", " _fr_slo:", sb);
        sb.append(i3);
        sb.append(" _fr_fzn:");
        sb.append(i2);
        f35901a.m23971a(sb.toString());
    }
}
