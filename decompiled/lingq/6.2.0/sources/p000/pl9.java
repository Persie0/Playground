package p000;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class pl9 {

    /* JADX INFO: renamed from: a */
    public final int f56419a;

    /* JADX INFO: renamed from: b */
    public int f56420b;

    /* JADX INFO: renamed from: c */
    public boolean f56421c;

    /* JADX INFO: renamed from: d */
    public long f56422d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ n16 f56423e;

    public pl9(n16 n16Var, int i) {
        this.f56423e = n16Var;
        this.f56419a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m19391a() {
        n16 n16Var = this.f56423e;
        qp9 qp9Var = (qp9) n16Var.f52177e;
        jw2 jw2Var = (jw2) n16Var.f52173a;
        jw2Var.m14705K();
        int i = jw2Var.f46281a0.f46906n;
        if (!jw2Var.m14719o() || jw2Var.m14721q() == 1 || jw2Var.m14721q() == 4 || i == 0 || i == 1) {
            if (this.f56421c) {
                qp9Var.m20099d(4);
            }
            this.f56421c = false;
            return;
        }
        ((mp9) n16Var.f52175c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f56421c;
        int i2 = this.f56419a;
        if (z && this.f56420b == i) {
            if (jElapsedRealtime - this.f56422d >= i2) {
                ((ew2) n16Var.f52174b).f37985a.m14700F(ExoPlaybackException.m2528e(new StuckPlayerException(4, i2), 1003));
                return;
            }
            return;
        }
        this.f56421c = true;
        this.f56422d = jElapsedRealtime;
        this.f56420b = i;
        qp9Var.m20099d(4);
        qp9Var.f58033a.sendEmptyMessageDelayed(4, i2);
    }
}
