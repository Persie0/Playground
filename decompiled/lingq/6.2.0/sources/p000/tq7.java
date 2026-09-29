package p000;

import android.content.Context;
import com.google.firebase.perf.p010v1.SessionVerbosity;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class tq7 {

    /* JADX INFO: renamed from: a */
    public final dh1 f62734a;

    /* JADX INFO: renamed from: b */
    public final double f62735b;

    /* JADX INFO: renamed from: c */
    public final double f62736c;

    /* JADX INFO: renamed from: d */
    public final sq7 f62737d;

    /* JADX INFO: renamed from: e */
    public final sq7 f62738e;

    public tq7(Context context, r52 r52Var) {
        s46 s46Var = new s46(8);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        dh1 dh1VarM10376e = dh1.m10376e();
        this.f62737d = null;
        this.f62738e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            C3386nv.m17626m("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            C3386nv.m17626m("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.f62735b = dNextDouble;
        this.f62736c = dNextDouble2;
        this.f62734a = dh1VarM10376e;
        this.f62737d = new sq7(r52Var, s46Var, dh1VarM10376e, "Trace");
        this.f62738e = new sq7(r52Var, s46Var, dh1VarM10376e, "Network");
        kaa.m15042d(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22267a(m94 m94Var) {
        return m94Var.size() > 0 && ((c77) m94Var.get(0)).m4393v() > 0 && ((c77) m94Var.get(0)).m4392u() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }
}
