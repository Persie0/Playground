package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byn {

    /* JADX INFO: renamed from: a */
    public final bpz f4759a;

    /* JADX INFO: renamed from: b */
    public final List f4760b;

    /* JADX INFO: renamed from: c */
    public final bpp f4761c;

    /* JADX INFO: renamed from: d */
    public boolean f4762d;

    /* JADX INFO: renamed from: e */
    public byl f4763e;

    /* JADX INFO: renamed from: f */
    public boolean f4764f;

    /* JADX INFO: renamed from: g */
    public byl f4765g;

    /* JADX INFO: renamed from: h */
    public Bitmap f4766h;

    /* JADX INFO: renamed from: i */
    public byl f4767i;

    /* JADX INFO: renamed from: j */
    public int f4768j;

    /* JADX INFO: renamed from: k */
    public int f4769k;

    /* JADX INFO: renamed from: l */
    public int f4770l;

    /* JADX INFO: renamed from: m */
    private final Handler f4771m;

    /* JADX INFO: renamed from: n */
    private final bti f4772n;

    /* JADX INFO: renamed from: o */
    private boolean f4773o;

    /* JADX INFO: renamed from: p */
    private bpn f4774p;

    public byn(box boxVar, bpz bpzVar, int i, int i2, bqv bqvVar, Bitmap bitmap) {
        bti btiVar = boxVar.f4032a;
        bpp bppVarM2827c = box.m2827c(boxVar.m2830a());
        bpn bpnVarM2849b = box.m2827c(boxVar.m2830a()).m2862b().mo2855h(((cab) ((cab) cab.m3347c(bsk.f4331a).m3303M()).m3302L()).m3315u(i, i2));
        this.f4760b = new ArrayList();
        this.f4761c = bppVarM2827c;
        Handler handler = new Handler(Looper.getMainLooper(), new jhl(this, 1));
        this.f4772n = btiVar;
        this.f4771m = handler;
        this.f4774p = bpnVarM2849b;
        this.f4759a = bpzVar;
        m3197e(bqvVar, bitmap);
    }

    /* JADX INFO: renamed from: a */
    final int m3193a() {
        return ((bqd) this.f4759a).f4166f.f4146c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3194b() {
        int i;
        if (!this.f4762d || this.f4773o) {
            return;
        }
        byl bylVar = this.f4767i;
        if (bylVar != null) {
            this.f4767i = null;
            m3195c(bylVar);
            return;
        }
        this.f4773o = true;
        bqd bqdVar = (bqd) this.f4759a;
        bqb bqbVar = bqdVar.f4166f;
        int i2 = bqbVar.f4146c;
        int i3 = 0;
        if (i2 > 0 && (i = bqdVar.f4165e) >= 0) {
            i3 = i < i2 ? ((bqa) bqbVar.f4148e.get(i)).f4141i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i3);
        this.f4759a.mo2904b();
        this.f4765g = new byl(this.f4771m, ((bqd) this.f4759a).f4165e, jUptimeMillis);
        this.f4774p.mo2855h((cab) new cab().m3320z(new cat(Double.valueOf(Math.random())))).m2853f(this.f4759a).m2859l(this.f4765g);
    }

    /* JADX INFO: renamed from: c */
    public final void m3195c(byl bylVar) {
        this.f4773o = false;
        if (this.f4764f) {
            this.f4771m.obtainMessage(2, bylVar).sendToTarget();
            return;
        }
        if (!this.f4762d) {
            this.f4767i = bylVar;
            return;
        }
        if (bylVar.f4756b != null) {
            m3196d();
            byl bylVar2 = this.f4763e;
            this.f4763e = bylVar;
            for (int size = this.f4760b.size() - 1; size >= 0; size--) {
                ((bym) this.f4760b.get(size)).mo3190c();
            }
            if (bylVar2 != null) {
                this.f4771m.obtainMessage(2, bylVar2).sendToTarget();
            }
        }
        m3194b();
    }

    /* JADX INFO: renamed from: d */
    public final void m3196d() {
        Bitmap bitmap = this.f4766h;
        if (bitmap != null) {
            this.f4772n.mo3045d(bitmap);
            this.f4766h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m3197e(bqv bqvVar, Bitmap bitmap) {
        bzq.m3278r(bqvVar);
        bzq.m3278r(bitmap);
        this.f4766h = bitmap;
        this.f4774p = this.f4774p.mo2855h(new cab().m3292B(bqvVar));
        this.f4768j = cbi.m3380a(bitmap);
        this.f4769k = bitmap.getWidth();
        this.f4770l = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: f */
    public final void m3198f() {
        this.f4762d = false;
    }
}
