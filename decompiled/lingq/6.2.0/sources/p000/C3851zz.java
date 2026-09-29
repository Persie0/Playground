package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: zz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3851zz {

    /* JADX INFO: renamed from: q */
    public static final Object f72398q = new Object();

    /* JADX INFO: renamed from: r */
    public static ScheduledExecutorService f72399r;

    /* JADX INFO: renamed from: s */
    public static int f72400s;

    /* JADX INFO: renamed from: a */
    public final AudioTrack f72401a;

    /* JADX INFO: renamed from: b */
    public final C3776xy f72402b;

    /* JADX INFO: renamed from: c */
    public final float f72403c;

    /* JADX INFO: renamed from: d */
    public final qn3 f72404d;

    /* JADX INFO: renamed from: e */
    public C3329mb f72405e;

    /* JADX INFO: renamed from: f */
    public final c00 f72406f;

    /* JADX INFO: renamed from: g */
    public final boolean f72407g;

    /* JADX INFO: renamed from: h */
    public final int f72408h;

    /* JADX INFO: renamed from: i */
    public final gv5 f72409i;

    /* JADX INFO: renamed from: j */
    public final vg5 f72410j = new vg5(Thread.currentThread());

    /* JADX INFO: renamed from: k */
    public boolean f72411k;

    /* JADX INFO: renamed from: l */
    public long f72412l;

    /* JADX INFO: renamed from: m */
    public long f72413m;

    /* JADX INFO: renamed from: n */
    public long f72414n;

    /* JADX INFO: renamed from: o */
    public int f72415o;

    /* JADX INFO: renamed from: p */
    public int f72416p;

    public C3851zz(AudioTrack audioTrack, C3776xy c3776xy, qn3 qn3Var, float f, mp9 mp9Var) {
        this.f72401a = audioTrack;
        this.f72402b = c3776xy;
        this.f72403c = f;
        this.f72404d = qn3Var;
        boolean zM22830y = uma.m22830y(c3776xy.f68936a);
        this.f72407g = zM22830y;
        if (zM22830y) {
            this.f72408h = uma.m22819n(c3776xy.f68936a) * Integer.bitCount(c3776xy.f68938c);
        } else {
            this.f72408h = -1;
        }
        this.f72406f = new c00(new ck6(this, 3), mp9Var, audioTrack, c3776xy.f68936a, this.f72408h, c3776xy.f68941f);
        if (qn3Var != null) {
            this.f72405e = new C3329mb(audioTrack, qn3Var);
        }
        this.f72409i = audioTrack.isOffloadedPlayback() ? new gv5(this) : null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25877b(C3776xy c3776xy, C3776xy c3776xy2) {
        return c3776xy2.equals(c3776xy);
    }

    /* JADX INFO: renamed from: a */
    public final void m25878a(n52 n52Var) {
        this.f72410j.m23268a(n52Var);
    }

    /* JADX INFO: renamed from: c */
    public final int m25879c() {
        return this.f72401a.getAudioSessionId();
    }

    /* JADX INFO: renamed from: d */
    public final long m25880d() {
        return this.f72401a.getBufferSizeInFrames();
    }

    /* JADX INFO: renamed from: e */
    public final n97 m25881e() {
        PlaybackParams playbackParams = this.f72401a.getPlaybackParams();
        return new n97(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x0327  */
    /* JADX WARN: Code duplicated, block: B:125:0x0331  */
    /* JADX WARN: Code duplicated, block: B:128:0x033f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0374  */
    /* JADX WARN: Code duplicated, block: B:136:0x0377  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[PHI: r17
      0x00ff: PHI (r17v5 long) = (r17v6 long), (r17v7 long) binds: [B:46:0x00fd, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0299  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a8  */
    /* JADX INFO: renamed from: f */
    public final long m25882f() {
        AudioTrack audioTrack;
        long j;
        boolean z;
        long jNanoTime;
        boolean z2;
        c00 c00Var;
        long jM4244b;
        long jM22813h;
        int playState;
        long j2;
        long j3;
        long jM22824s;
        long j4;
        int i;
        long j5;
        float f;
        boolean z3;
        AudioTimestamp audioTimestamp;
        C3629tz c3629tz;
        int i2;
        Method method;
        Method method2;
        c00 c00Var2 = this.f72406f;
        mp9 mp9Var = c00Var2.f9220b;
        C3666uz c3666uz = c00Var2.f9226h;
        AudioTrack audioTrack2 = c00Var2.f9222d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = c00Var2.f9221c;
            mp9Var.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - c00Var2.f9230l >= 30000) {
                j = 1000;
                long jM22801F = uma.m22801F(c00Var2.f9223e, c00Var2.m4243a());
                if (jM22801F != 0) {
                    int i3 = c00Var2.f9237s;
                    float f2 = c00Var2.f9227i;
                    if (f2 != 1.0f) {
                        jM22801F = Math.round(jM22801F / ((double) f2));
                    }
                    jArr[i3] = jM22801F - jNanoTime2;
                    c00Var2.f9237s = (c00Var2.f9237s + 1) % 10;
                    int i4 = c00Var2.f9238t;
                    if (i4 < 10) {
                        c00Var2.f9238t = i4 + 1;
                    }
                    c00Var2.f9230l = jNanoTime2;
                    c00Var2.f9229k = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = c00Var2.f9238t;
                        if (i5 >= i6) {
                            break;
                        }
                        c00Var2.f9229k = (jArr[i5] / ((long) i6)) + c00Var2.f9229k;
                        i5++;
                    }
                } else {
                    c00Var2 = c00Var2;
                    mp9Var = mp9Var;
                    audioTrack = audioTrack2;
                }
            } else {
                j = 1000;
            }
            long j6 = c00Var2.f9232n;
            if (!c00Var2.f9225g || (method = c00Var2.f9231m) == null) {
                j5 = 500000;
            } else {
                j5 = 500000;
                if (jNanoTime2 - c00Var2.f9233o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str = uma.f64080a;
                        try {
                            long jIntValue = (((long) num.intValue()) * j) - c00Var2.f9224f;
                            c00Var2.f9232n = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            c00Var2.f9232n = jMax;
                            if (jMax > 10000000) {
                                ss5.m21707d0("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                                c00Var2.f9232n = 0L;
                            }
                        } catch (Exception unused) {
                            method2 = null;
                            c00Var2.f9231m = method2;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                    }
                    c00Var2.f9233o = jNanoTime2;
                }
            }
            boolean z4 = j6 != c00Var2.f9232n;
            float f3 = c00Var2.f9227i;
            long jM4244b2 = c00Var2.m4244b(jNanoTime2);
            C3629tz c3629tz2 = c3666uz.f64549a;
            C3629tz c3629tz3 = c3666uz.f64549a;
            int i7 = c3666uz.f64550b;
            if (z4 || jNanoTime2 - c3666uz.f64555g >= c3666uz.f64554f) {
                c3666uz.f64555g = jNanoTime2;
                AudioTrack audioTrack3 = c3629tz2.f63106a;
                AudioTimestamp audioTimestamp2 = c3629tz2.f63107b;
                boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j7 = audioTimestamp2.framePosition;
                    long j8 = c3629tz2.f63109d;
                    if (j8 > j7) {
                        if (c3629tz2.f63111f) {
                            c3629tz2.f63112g += j8;
                            c3629tz2.f63111f = false;
                        } else {
                            c3629tz2.f63108c++;
                        }
                    }
                    c3629tz2.f63109d = j7;
                    c3629tz2.f63110e = j7 + c3629tz2.f63112g + (c3629tz2.f63108c << 32);
                }
                if (timestamp) {
                    ck6 ck6Var = c3666uz.f64551c;
                    long j9 = audioTimestamp2.nanoTime / j;
                    z3 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    long jM22824s2 = uma.m22824s(f3, jNanoTime2 - (c3629tz3.f63107b.nanoTime / j)) + uma.m22801F(i7, c3629tz3.f63110e);
                    if (Math.abs(j9 - jNanoTime2) > 5000000) {
                        long j10 = c3629tz2.f63110e;
                        ck6Var.getClass();
                        ss5.m21707d0("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j9 + ", " + jNanoTime2 + ", " + jM4244b2 + ", " + ((C3851zz) ck6Var.f10194b).m25884h());
                        i2 = 4;
                        c3666uz.m23015a(4);
                        audioTrack = audioTrack2;
                        f = f3;
                        c3629tz = c3629tz3;
                    } else if (Math.abs(jM22824s2 - jM4244b2) > 5000000) {
                        f = f3;
                        long j11 = c3629tz2.f63110e;
                        ck6Var.getClass();
                        audioTrack = audioTrack2;
                        c3629tz = c3629tz3;
                        ss5.m21707d0("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j9 + ", " + jNanoTime2 + ", " + jM4244b2 + ", " + ((C3851zz) ck6Var.f10194b).m25884h());
                        i2 = 4;
                        c3666uz.m23015a(4);
                    } else {
                        audioTrack = audioTrack2;
                        f = f3;
                        c3629tz = c3629tz3;
                        i2 = 4;
                        if (c3666uz.f64552d == 4) {
                            c3666uz.m23015a(0);
                        }
                    }
                } else {
                    audioTrack = audioTrack2;
                    f = f3;
                    z3 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    c3629tz = c3629tz3;
                    i2 = 4;
                }
                int i8 = c3666uz.f64552d;
                if (i8 == 0) {
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    z = false;
                    if (z3) {
                        long j12 = audioTimestamp3.nanoTime;
                        if (j12 / j >= c3666uz.f64553e) {
                            c3666uz.f64556h = c3629tz2.f63110e;
                            c3666uz.f64557i = j12 / j;
                            c3666uz.m23015a(1);
                        }
                    } else if (jNanoTime2 - c3666uz.f64553e > j5) {
                        c3666uz.m23015a(3);
                    }
                } else if (i8 == 1) {
                    AudioTimestamp audioTimestamp4 = audioTimestamp;
                    if (z3) {
                        long j13 = c3629tz2.f63110e;
                        long j14 = c3666uz.f64556h;
                        if (j13 > j14) {
                            float f4 = f;
                            C3629tz c3629tz4 = c3629tz;
                            if (Math.abs((uma.m22824s(f4, jNanoTime2 - (c3629tz4.f63107b.nanoTime / j)) + uma.m22801F(i7, c3629tz4.f63110e)) - (uma.m22824s(f4, jNanoTime2 - c3666uz.f64557i) + uma.m22801F(i7, j14))) < j) {
                                c3666uz.m23015a(2);
                            } else if (jNanoTime2 - c3666uz.f64553e > 2000000) {
                                c3666uz.m23015a(3);
                            } else {
                                c3666uz.f64556h = c3629tz2.f63110e;
                                c3666uz.f64557i = audioTimestamp4.nanoTime / j;
                            }
                        } else if (jNanoTime2 - c3666uz.f64553e > 2000000) {
                            c3666uz.m23015a(3);
                        } else {
                            c3666uz.f64556h = c3629tz2.f63110e;
                            c3666uz.f64557i = audioTimestamp4.nanoTime / j;
                        }
                    } else {
                        z = false;
                        c3666uz.m23015a(0);
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != i2) {
                            uk9.m22770c();
                            return 0L;
                        }
                    } else if (z3) {
                        z = false;
                        c3666uz.m23015a(0);
                    }
                } else if (!z3) {
                    c3666uz.m23015a(0);
                }
                mp9Var.getClass();
                jNanoTime = System.nanoTime() / j;
                if (c3666uz.f64552d == 2) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c00Var = c00Var2;
                    float f5 = c00Var.f9227i;
                    C3629tz c3629tz5 = c3666uz.f64549a;
                    jM4244b = uma.m22824s(f5, jNanoTime - (c3629tz5.f63107b.nanoTime / j)) + uma.m22801F(c3666uz.f64550b, c3629tz5.f63110e);
                } else {
                    c00Var = c00Var2;
                    jM4244b = c00Var.m4244b(jNanoTime);
                }
                jM22813h = jM4244b;
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (z2 || ((i = c3666uz.f64552d) != 0 && i != 1)) {
                        c00Var.m4246d(jM22813h);
                    }
                    j2 = c00Var.f9244z;
                    if (j2 != -9223372036854775807L) {
                        j3 = jM22813h - c00Var.f9243y;
                        jM22824s = uma.m22824s(c00Var.f9227i, jNanoTime - j2);
                        j4 = c00Var.f9243y + jM22824s;
                        long jAbs = Math.abs(j4 - jM22813h);
                        if (j3 != 0 && jAbs < 1000000) {
                            long j15 = (jM22824s * 10) / 100;
                            jM22813h = uma.m22813h(jM22813h, j4 - j15, j4 + j15);
                        }
                    }
                    c00Var.f9244z = jNanoTime;
                    c00Var.f9243y = jM22813h;
                } else if (playState == 1) {
                    c00Var.m4246d(jM22813h);
                }
                return jM22813h;
            }
            c00Var2 = c00Var2;
            mp9Var = mp9Var;
            audioTrack = audioTrack2;
        } else {
            c00Var2 = c00Var2;
            mp9Var = mp9Var;
            audioTrack = audioTrack2;
            j = 1000;
        }
        z = false;
        mp9Var.getClass();
        jNanoTime = System.nanoTime() / j;
        if (c3666uz.f64552d == 2) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            c00Var = c00Var2;
            float f6 = c00Var.f9227i;
            C3629tz c3629tz6 = c3666uz.f64549a;
            jM4244b = uma.m22824s(f6, jNanoTime - (c3629tz6.f63107b.nanoTime / j)) + uma.m22801F(c3666uz.f64550b, c3629tz6.f63110e);
        } else {
            c00Var = c00Var2;
            jM4244b = c00Var.m4244b(jNanoTime);
        }
        jM22813h = jM4244b;
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z2) {
                c00Var.m4246d(jM22813h);
            } else {
                c00Var.m4246d(jM22813h);
            }
            j2 = c00Var.f9244z;
            if (j2 != -9223372036854775807L) {
                j3 = jM22813h - c00Var.f9243y;
                jM22824s = uma.m22824s(c00Var.f9227i, jNanoTime - j2);
                j4 = c00Var.f9243y + jM22824s;
                long jAbs2 = Math.abs(j4 - jM22813h);
                if (j3 != 0) {
                    long j16 = (jM22824s * 10) / 100;
                    jM22813h = uma.m22813h(jM22813h, j4 - j16, j4 + j16);
                }
            }
            c00Var.f9244z = jNanoTime;
            c00Var.f9243y = jM22813h;
        } else if (playState == 1) {
            c00Var.m4246d(jM22813h);
        }
        return jM22813h;
    }

    /* JADX INFO: renamed from: g */
    public final int m25883g() {
        return this.f72401a.getSampleRate();
    }

    /* JADX INFO: renamed from: h */
    public final long m25884h() {
        if (!this.f72407g) {
            return this.f72413m;
        }
        long j = this.f72412l;
        long j2 = this.f72408h;
        String str = uma.f64080a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25885i() {
        return this.f72401a.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m25886j() {
        long jM25884h = m25884h();
        c00 c00Var = this.f72406f;
        if (c00Var.f9240v == -9223372036854775807L || jM25884h <= 0) {
            return false;
        }
        c00Var.f9220b.getClass();
        return SystemClock.elapsedRealtime() - c00Var.f9240v >= 200;
    }

    /* JADX INFO: renamed from: k */
    public final void m25887k() {
        c00 c00Var = this.f72406f;
        c00Var.f9229k = 0L;
        c00Var.f9238t = 0;
        c00Var.f9237s = 0;
        c00Var.f9230l = 0L;
        c00Var.f9243y = -9223372036854775807L;
        c00Var.f9244z = -9223372036854775807L;
        if (c00Var.f9239u == -9223372036854775807L) {
            c00Var.f9226h.m23015a(0);
        }
        c00Var.f9241w = c00Var.m4243a();
        boolean z = this.f72411k;
        AudioTrack audioTrack = this.f72401a;
        if (!z || audioTrack.isOffloadedPlayback()) {
            audioTrack.pause();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25888l() {
        c00 c00Var = this.f72406f;
        if (c00Var.f9239u != -9223372036854775807L) {
            c00Var.f9220b.getClass();
            c00Var.f9239u = uma.m22797B(SystemClock.elapsedRealtime());
        }
        c00Var.f9228j = uma.m22801F(c00Var.f9223e, c00Var.m4243a());
        c00Var.f9226h.m23015a(0);
        boolean z = this.f72411k;
        AudioTrack audioTrack = this.f72401a;
        if (!z || audioTrack.isOffloadedPlayback()) {
            audioTrack.play();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25889m() {
        if (this.f72406f.f9222d.getPlayState() == 3) {
            this.f72401a.pause();
        }
        if (this.f72401a.isOffloadedPlayback()) {
            gv5 gv5Var = this.f72409i;
            gv5Var.getClass();
            ((C3851zz) gv5Var.f41394d).f72401a.unregisterStreamEventCallback((C3814yz) gv5Var.f41393c);
            ((Handler) gv5Var.f41392b).removeCallbacksAndMessages(null);
        }
        C3329mb c3329mb = this.f72405e;
        if (c3329mb != null) {
            AudioTrack audioTrack = (AudioTrack) c3329mb.f50860b;
            C3703vz c3703vz = (C3703vz) c3329mb.f50863e;
            c3703vz.getClass();
            audioTrack.removeOnRoutingChangedListener(c3703vz);
            c3329mb.f50863e = null;
            this.f72405e = null;
        }
        AudioTrack audioTrack2 = this.f72401a;
        vg5 vg5Var = this.f72410j;
        Handler handlerM22816k = uma.m22816k(null);
        synchronized (f72398q) {
            try {
                if (f72399r == null) {
                    f72399r = Executors.newSingleThreadScheduledExecutor(new rma());
                }
                f72400s++;
                f72399r.schedule(new RunnableC3725wk(audioTrack2, handlerM22816k, vg5Var, 2), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m25890n(int i, int i2) {
        this.f72401a.setOffloadDelayPadding(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public final void m25891o() {
        AudioTrack audioTrack = this.f72401a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        c00 c00Var = this.f72406f;
        c00Var.f9217A = true;
        c00Var.f9226h.f64549a.f63111f = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m25892p(n97 n97Var) {
        AudioTrack audioTrack = this.f72401a;
        try {
            audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(uma.m22811f(n97Var.f52510a, 0.1f, this.f72403c)).setPitch(uma.m22811f(n97Var.f52511b, 0.1f, 8.0f)).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e) {
            ss5.m21709e0("AudioTrackAudioOutput", "Failed to set playback params", e);
        }
        float speed = audioTrack.getPlaybackParams().getSpeed();
        c00 c00Var = this.f72406f;
        c00Var.f9227i = speed;
        c00Var.f9226h.m23015a(0);
        c00Var.f9229k = 0L;
        c00Var.f9238t = 0;
        c00Var.f9237s = 0;
        c00Var.f9230l = 0L;
        c00Var.f9243y = -9223372036854775807L;
        c00Var.f9244z = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: q */
    public final void m25893q(xb7 xb7Var) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdM24439a = xb7Var.m24439a();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionIdM24439a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f72401a.setLogSessionId(logSessionIdM24439a);
    }

    /* JADX INFO: renamed from: r */
    public final void m25894r(AudioDeviceInfo audioDeviceInfo) {
        this.f72401a.setPreferredDevice(audioDeviceInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m25895s(float f) {
        this.f72401a.setVolume(f);
    }

    /* JADX INFO: renamed from: t */
    public final void m25896t() {
        if (this.f72411k) {
            return;
        }
        this.f72411k = true;
        long jM25884h = m25884h();
        c00 c00Var = this.f72406f;
        c00Var.f9241w = c00Var.m4243a();
        c00Var.f9220b.getClass();
        c00Var.f9239u = uma.m22797B(SystemClock.elapsedRealtime());
        c00Var.f9242x = jM25884h;
        this.f72401a.stop();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m25897u(int i, long j, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        qn3 qn3Var;
        b00 b00Var;
        C3738wx c3738wx;
        C3776xy c3776xy = this.f72402b;
        boolean z2 = this.f72407g;
        if (!z2 && this.f72415o == 0) {
            this.f72415o = s52.m21081i(c3776xy.f68936a, byteBuffer);
        }
        vg5 vg5Var = this.f72410j;
        vg5Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = vg5Var.f65345a;
        AudioTrack audioTrack = this.f72401a;
        if (threadCurrentThread == thread) {
            m25884h();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.f72416p;
            this.f72416p = underrunCount;
            if (z3) {
                vg5Var.m23271d(-1, new hm2(1));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (c3776xy.f68939d) {
            if (j == Long.MIN_VALUE) {
                j = this.f72414n;
            } else {
                this.f72414n = j;
            }
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.f72412l += (long) iWrite;
                return z;
            }
            if (z) {
                this.f72413m = (((long) this.f72415o) * ((long) i)) + this.f72413m;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (qn3Var = this.f72404d) != null && (c3738wx = (b00Var = (b00) qn3Var.f57974a).f7714i) != null) {
            C3627tx c3627tx = C3627tx.f63029f;
            b00Var.f7713h = c3627tx;
            c3738wx.m24186b(c3627tx);
        }
        throw new AudioOutput$WriteException(iWrite, z);
    }
}
