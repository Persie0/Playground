package p000;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npk {

    /* JADX INFO: renamed from: a */
    public final boolean f44027a;

    /* JADX INFO: renamed from: b */
    public final Object f44028b;

    public npk() {
        gzl gzlVar = gzl.OFF;
        throw null;
    }

    public npk(Context context, dhv dhvVar) {
        this.f44028b = (Vibrator) context.getSystemService("vibrator");
        this.f44027a = dhvVar.mo6184l(dib.f11342bw);
    }

    public npk(gzl gzlVar, boolean z) {
        this.f44028b = gzlVar;
        this.f44027a = z;
    }

    public npk(boolean z, String str) {
        this.f44027a = z;
        this.f44028b = str;
    }

    public npk(boolean z, mws mwsVar) {
        this.f44027a = z;
        this.f44028b = mwsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m17603e(Context context) {
        if (((cdp) context).mo3499a().mo6184l(dib.f11342bw)) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(VibrationEffect.createPredefined(2));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m17604h(View view) {
        view.performHapticFeedback(6);
    }

    /* JADX INFO: renamed from: a */
    public final nps m17605a(Callable callable, Executor executor) {
        return new nos((mwj) this.f44028b, this.f44027a, executor, callable);
    }

    /* JADX INFO: renamed from: b */
    public final nps m17606b(nol nolVar, Executor executor) {
        return new nos((mwj) this.f44028b, this.f44027a, executor, nolVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m17607c(Runnable runnable, Executor executor) {
        m17605a(new bpr(runnable, 4), executor);
    }

    /* JADX INFO: renamed from: d */
    public final void m17608d() {
        if (this.f44027a) {
            m17610g(VibrationEffect.createPredefined(2));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17609f(int i) {
        m17610g(VibrationEffect.createPredefined(i));
    }

    /* JADX INFO: renamed from: g */
    public final void m17610g(VibrationEffect vibrationEffect) {
        if (((Vibrator) this.f44028b).hasVibrator()) {
            ((Vibrator) this.f44028b).vibrate(vibrationEffect);
        }
    }
}
