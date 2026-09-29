package p000;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ol9 {

    /* JADX INFO: renamed from: a */
    public final int f54551a;

    /* JADX INFO: renamed from: b */
    public Object f54552b;

    /* JADX INFO: renamed from: c */
    public int f54553c;

    /* JADX INFO: renamed from: d */
    public int f54554d;

    /* JADX INFO: renamed from: e */
    public boolean f54555e;

    /* JADX INFO: renamed from: f */
    public long f54556f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ n16 f54557g;

    public ol9(n16 n16Var, int i) {
        this.f54557g = n16Var;
        this.f54551a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m18106a() {
        long jM14718n;
        n16 n16Var = this.f54557g;
        x0a x0aVar = (x0a) n16Var.f52176d;
        qp9 qp9Var = (qp9) n16Var.f52177e;
        jw2 jw2Var = (jw2) n16Var.f52173a;
        z0a z0aVarM14716l = jw2Var.m14716l();
        Object objMo17287l = z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo17287l(jw2Var.m14713i());
        int iM14710f = jw2Var.m14710f();
        int iM14711g = jw2Var.m14711g();
        long jM14714j = jw2Var.m14714j();
        if (objMo17287l == null || iM14710f != -1) {
            jM14718n = iM14710f != -1 ? jw2Var.m14718n() : -9223372036854775807L;
        } else {
            z0aVarM14716l.mo23250g(objMo17287l, x0aVar);
            jM14714j -= uma.m22805J(x0aVar.f67603e);
            jM14718n = uma.m22805J(x0aVar.f67602d);
        }
        boolean zM14722s = jw2Var.m14722s();
        if (!zM14722s || jM14718n == -9223372036854775807L || jM14714j < jM14718n) {
            qp9Var.m20099d(3);
            if (zM14722s && jM14718n != -9223372036854775807L) {
                qp9Var.f58033a.sendEmptyMessageDelayed(3, (int) Math.ceil((jM14718n - jM14714j) / jw2Var.m14720p().f52510a));
            }
            this.f54555e = false;
            return;
        }
        ((mp9) n16Var.f52175c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f54555e;
        int i = this.f54551a;
        if (z && Objects.equals(objMo17287l, this.f54552b) && iM14710f == this.f54553c && iM14711g == this.f54554d) {
            if (jElapsedRealtime - this.f54556f >= i) {
                ((ew2) n16Var.f52174b).f37985a.m14700F(ExoPlaybackException.m2528e(new StuckPlayerException(3, i), 1003));
                return;
            }
            return;
        }
        this.f54555e = true;
        this.f54556f = jElapsedRealtime;
        this.f54552b = objMo17287l;
        this.f54553c = iM14710f;
        this.f54554d = iM14711g;
        qp9Var.m20099d(3);
        qp9Var.f58033a.sendEmptyMessageDelayed(3, i);
    }
}
