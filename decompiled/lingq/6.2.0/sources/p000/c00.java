package p000;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class c00 {

    /* JADX INFO: renamed from: A */
    public boolean f9217A;

    /* JADX INFO: renamed from: B */
    public long f9218B;

    /* JADX INFO: renamed from: a */
    public final ck6 f9219a;

    /* JADX INFO: renamed from: b */
    public final mp9 f9220b;

    /* JADX INFO: renamed from: c */
    public final long[] f9221c;

    /* JADX INFO: renamed from: d */
    public final AudioTrack f9222d;

    /* JADX INFO: renamed from: e */
    public final int f9223e;

    /* JADX INFO: renamed from: f */
    public final long f9224f;

    /* JADX INFO: renamed from: g */
    public final boolean f9225g;

    /* JADX INFO: renamed from: h */
    public final C3666uz f9226h;

    /* JADX INFO: renamed from: i */
    public float f9227i;

    /* JADX INFO: renamed from: j */
    public long f9228j;

    /* JADX INFO: renamed from: k */
    public long f9229k;

    /* JADX INFO: renamed from: l */
    public long f9230l;

    /* JADX INFO: renamed from: m */
    public Method f9231m;

    /* JADX INFO: renamed from: n */
    public long f9232n;

    /* JADX INFO: renamed from: o */
    public long f9233o;

    /* JADX INFO: renamed from: p */
    public long f9234p;

    /* JADX INFO: renamed from: q */
    public long f9235q;

    /* JADX INFO: renamed from: r */
    public long f9236r;

    /* JADX INFO: renamed from: s */
    public int f9237s;

    /* JADX INFO: renamed from: t */
    public int f9238t;

    /* JADX INFO: renamed from: u */
    public long f9239u;

    /* JADX INFO: renamed from: v */
    public long f9240v;

    /* JADX INFO: renamed from: w */
    public long f9241w;

    /* JADX INFO: renamed from: x */
    public long f9242x;

    /* JADX INFO: renamed from: y */
    public long f9243y;

    /* JADX INFO: renamed from: z */
    public long f9244z;

    public c00(ck6 ck6Var, mp9 mp9Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.f9219a = ck6Var;
        this.f9220b = mp9Var;
        this.f9222d = audioTrack;
        try {
            this.f9231m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f9221c = new long[10];
        this.f9244z = -9223372036854775807L;
        this.f9243y = -9223372036854775807L;
        this.f9226h = new C3666uz(audioTrack, ck6Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f9223e = sampleRate;
        boolean zM22830y = uma.m22830y(i);
        this.f9225g = zM22830y;
        this.f9224f = zM22830y ? uma.m22801F(sampleRate, i3 / i2) : -9223372036854775807L;
        this.f9235q = 0L;
        this.f9236r = 0L;
        this.f9217A = false;
        this.f9218B = 0L;
        this.f9239u = -9223372036854775807L;
        this.f9240v = -9223372036854775807L;
        this.f9233o = 0L;
        this.f9232n = 0L;
        this.f9227i = 1.0f;
        this.f9228j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX INFO: renamed from: a */
    public final long m4243a() {
        long j;
        if (this.f9239u != -9223372036854775807L) {
            return Math.min(this.f9242x, m4245c());
        }
        this.f9220b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f9234p >= 5) {
            AudioTrack audioTrack = this.f9222d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.f9235q;
                    if (j > playbackHeadPosition) {
                        if (this.f9217A) {
                            this.f9218B += j;
                            this.f9217A = false;
                        } else {
                            this.f9236r++;
                        }
                    }
                    this.f9235q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f9235q <= 0 || playState != 3) {
                    this.f9240v = -9223372036854775807L;
                    j = this.f9235q;
                    if (j > playbackHeadPosition) {
                        if (this.f9217A) {
                            this.f9218B += j;
                            this.f9217A = false;
                        } else {
                            this.f9236r++;
                        }
                    }
                    this.f9235q = playbackHeadPosition;
                } else if (this.f9240v == -9223372036854775807L) {
                    this.f9240v = jElapsedRealtime;
                }
            }
            this.f9234p = jElapsedRealtime;
        }
        return this.f9235q + this.f9218B + (this.f9236r << 32);
    }

    /* JADX INFO: renamed from: b */
    public final long m4244b(long j) {
        long jM22824s;
        int i = this.f9238t;
        int i2 = this.f9223e;
        if (i == 0) {
            jM22824s = this.f9239u != -9223372036854775807L ? uma.m22801F(i2, m4245c()) : uma.m22801F(i2, m4243a());
        } else {
            jM22824s = uma.m22824s(this.f9227i, j + this.f9229k);
        }
        long jMax = Math.max(0L, jM22824s - this.f9232n);
        return this.f9239u != -9223372036854775807L ? Math.min(uma.m22801F(i2, this.f9242x), jMax) : jMax;
    }

    /* JADX INFO: renamed from: c */
    public final long m4245c() {
        if (this.f9222d.getPlayState() == 2) {
            return this.f9241w;
        }
        this.f9220b.getClass();
        return this.f9241w + uma.m22803H(uma.m22824s(this.f9227i, uma.m22797B(SystemClock.elapsedRealtime()) - this.f9239u), this.f9223e, 1000000L, RoundingMode.UP);
    }

    /* JADX INFO: renamed from: d */
    public final void m4246d(long j) {
        long j2 = this.f9228j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jRound = j - j2;
        float f = this.f9227i;
        String str = uma.f64080a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / ((double) f));
        }
        this.f9220b.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis() - uma.m22805J(jRound);
        this.f9228j = -9223372036854775807L;
        vg5 vg5Var = ((C3851zz) this.f9219a.f10194b).f72410j;
        vg5Var.getClass();
        if (Thread.currentThread() == vg5Var.f65345a) {
            vg5Var.m23271d(-1, new sg5() { // from class: wz
                @Override // p000.sg5
                public final void invoke(Object obj) {
                    cc4 cc4Var;
                    n52 n52Var = (n52) obj;
                    s52 s52Var = n52Var.f52359b;
                    if (n52Var == s52Var.f60352j && (cc4Var = s52Var.f60356n) != null) {
                        tt5 tt5Var = (tt5) cc4Var.f9881a;
                        tt5Var.f62857o1 = true;
                        C3165jz c3165jz = tt5Var.f62846d1;
                        Handler handler = c3165jz.f46413a;
                        if (handler != null) {
                            handler.post(new RunnableC3019fz(c3165jz, jCurrentTimeMillis));
                        }
                    }
                }
            });
        }
    }
}
