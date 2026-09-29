package p000;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ml9 {

    /* JADX INFO: renamed from: a */
    public final int f51488a;

    /* JADX INFO: renamed from: b */
    public Object f51489b;

    /* JADX INFO: renamed from: c */
    public int f51490c;

    /* JADX INFO: renamed from: d */
    public int f51491d;

    /* JADX INFO: renamed from: e */
    public long f51492e;

    /* JADX INFO: renamed from: f */
    public long f51493f;

    /* JADX INFO: renamed from: g */
    public boolean f51494g;

    /* JADX INFO: renamed from: h */
    public long f51495h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ n16 f51496i;

    public ml9(n16 n16Var, int i) {
        this.f51496i = n16Var;
        this.f51488a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m16918a() {
        int i = this.f51488a;
        n16 n16Var = this.f51496i;
        if (((jw2) n16Var.f52173a).m14721q() == 2 && ((jw2) n16Var.f52173a).m14719o()) {
            jw2 jw2Var = (jw2) n16Var.f52173a;
            jw2Var.m14705K();
            if (jw2Var.f46281a0.f46906n == 0) {
                z0a z0aVarM14716l = ((jw2) n16Var.f52173a).m14716l();
                Object objMo17287l = z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo17287l(((jw2) n16Var.f52173a).m14713i());
                int iM14710f = ((jw2) n16Var.f52173a).m14710f();
                int iM14711g = ((jw2) n16Var.f52173a).m14711g();
                long jM14708d = ((jw2) n16Var.f52173a).m14708d();
                long jMax = Math.max(0L, jM14708d - ((jw2) n16Var.f52173a).m14714j());
                jw2 jw2Var2 = (jw2) n16Var.f52173a;
                jw2Var2.m14705K();
                long jMax2 = Math.max(0L, uma.m22805J(jw2Var2.f46281a0.f46910r) - jMax);
                if (objMo17287l != null && iM14710f == -1) {
                    jM14708d -= uma.m22805J(z0aVarM14716l.mo23250g(objMo17287l, (x0a) n16Var.f52176d).f67603e);
                }
                ((mp9) n16Var.f52175c).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f51494g && Objects.equals(objMo17287l, this.f51489b) && iM14710f == this.f51490c && iM14711g == this.f51491d && jM14708d == this.f51492e && jMax2 == this.f51493f) {
                    if (jElapsedRealtime - this.f51495h >= i) {
                        ((ew2) n16Var.f52174b).f37985a.m14700F(ExoPlaybackException.m2528e(new StuckPlayerException(1, i), 1003));
                        return;
                    }
                    return;
                }
                this.f51494g = true;
                this.f51495h = jElapsedRealtime;
                this.f51489b = objMo17287l;
                this.f51490c = iM14710f;
                this.f51491d = iM14711g;
                this.f51492e = jM14708d;
                this.f51493f = jMax2;
                ((qp9) n16Var.f52177e).m20099d(1);
                ((qp9) n16Var.f52177e).f58033a.sendEmptyMessageDelayed(1, i);
                return;
            }
        }
        if (this.f51494g) {
            ((qp9) n16Var.f52177e).m20099d(1);
        }
        this.f51494g = false;
    }
}
