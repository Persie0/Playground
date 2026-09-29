package p000;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nl9 {

    /* JADX INFO: renamed from: a */
    public final int f52925a;

    /* JADX INFO: renamed from: b */
    public Object f52926b;

    /* JADX INFO: renamed from: c */
    public int f52927c;

    /* JADX INFO: renamed from: d */
    public int f52928d;

    /* JADX INFO: renamed from: e */
    public long f52929e;

    /* JADX INFO: renamed from: f */
    public boolean f52930f;

    /* JADX INFO: renamed from: g */
    public long f52931g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ n16 f52932h;

    public nl9(n16 n16Var, int i) {
        this.f52932h = n16Var;
        this.f52925a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m17491a() {
        n16 n16Var = this.f52932h;
        qp9 qp9Var = (qp9) n16Var.f52177e;
        jw2 jw2Var = (jw2) n16Var.f52173a;
        if (!jw2Var.m14722s()) {
            if (this.f52930f) {
                qp9Var.m20099d(2);
            }
            this.f52930f = false;
            return;
        }
        z0a z0aVarM14716l = jw2Var.m14716l();
        Object objMo17287l = z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo17287l(jw2Var.m14713i());
        int iM14710f = jw2Var.m14710f();
        int iM14711g = jw2Var.m14711g();
        long jM14714j = jw2Var.m14714j();
        if (objMo17287l != null && iM14710f == -1) {
            jM14714j -= uma.m22805J(z0aVarM14716l.mo23250g(objMo17287l, (x0a) n16Var.f52176d).f67603e);
        }
        ((mp9) n16Var.f52175c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f52930f;
        int i = this.f52925a;
        if (z && Objects.equals(objMo17287l, this.f52926b) && iM14710f == this.f52927c && iM14711g == this.f52928d && jM14714j == this.f52929e) {
            if (jElapsedRealtime - this.f52931g >= i) {
                ((ew2) n16Var.f52174b).f37985a.m14700F(ExoPlaybackException.m2528e(new StuckPlayerException(2, i), 1003));
                return;
            }
            return;
        }
        this.f52930f = true;
        this.f52931g = jElapsedRealtime;
        this.f52926b = objMo17287l;
        this.f52927c = iM14710f;
        this.f52928d = iM14711g;
        this.f52929e = jM14714j;
        qp9Var.m20099d(2);
        qp9Var.f58033a.sendEmptyMessageDelayed(2, i);
    }
}
