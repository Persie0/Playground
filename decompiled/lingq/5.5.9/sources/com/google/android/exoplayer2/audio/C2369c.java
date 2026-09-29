package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p195j9.C6433j;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2369c {

    /* JADX INFO: renamed from: A */
    public long f11947A;

    /* JADX INFO: renamed from: B */
    public long f11948B;

    /* JADX INFO: renamed from: C */
    public long f11949C;

    /* JADX INFO: renamed from: D */
    public long f11950D;

    /* JADX INFO: renamed from: E */
    public boolean f11951E;

    /* JADX INFO: renamed from: F */
    public long f11952F;

    /* JADX INFO: renamed from: G */
    public long f11953G;

    /* JADX INFO: renamed from: a */
    public final a f11954a;

    /* JADX INFO: renamed from: b */
    public final long[] f11955b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f11956c;

    /* JADX INFO: renamed from: d */
    public int f11957d;

    /* JADX INFO: renamed from: e */
    public int f11958e;

    /* JADX INFO: renamed from: f */
    public C6433j f11959f;

    /* JADX INFO: renamed from: g */
    public int f11960g;

    /* JADX INFO: renamed from: h */
    public boolean f11961h;

    /* JADX INFO: renamed from: i */
    public long f11962i;

    /* JADX INFO: renamed from: j */
    public float f11963j;

    /* JADX INFO: renamed from: k */
    public boolean f11964k;

    /* JADX INFO: renamed from: l */
    public long f11965l;

    /* JADX INFO: renamed from: m */
    public long f11966m;

    /* JADX INFO: renamed from: n */
    public Method f11967n;

    /* JADX INFO: renamed from: o */
    public long f11968o;

    /* JADX INFO: renamed from: p */
    public boolean f11969p;

    /* JADX INFO: renamed from: q */
    public boolean f11970q;

    /* JADX INFO: renamed from: r */
    public long f11971r;

    /* JADX INFO: renamed from: s */
    public long f11972s;

    /* JADX INFO: renamed from: t */
    public long f11973t;

    /* JADX INFO: renamed from: u */
    public long f11974u;

    /* JADX INFO: renamed from: v */
    public long f11975v;

    /* JADX INFO: renamed from: w */
    public int f11976w;

    /* JADX INFO: renamed from: x */
    public int f11977x;

    /* JADX INFO: renamed from: y */
    public long f11978y;

    /* JADX INFO: renamed from: z */
    public long f11979z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6833a(long j10);

        /* JADX INFO: renamed from: b */
        void mo6834b(int i10, long j10);

        /* JADX INFO: renamed from: c */
        void mo6835c(long j10);

        /* JADX INFO: renamed from: d */
        void mo6836d(long j10, long j11, long j12, long j13);

        /* JADX INFO: renamed from: e */
        void mo6837e(long j10, long j11, long j12, long j13);
    }

    public C2369c(DefaultAudioSink.C2365j c2365j) {
        this.f11954a = c2365j;
        if (C10134c0.f51354a >= 18) {
            try {
                this.f11967n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11955b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX INFO: renamed from: a */
    public final long m6852a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f11978y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.f11948B, this.f11947A + ((C10134c0.m19053t(this.f11963j, (jElapsedRealtime * 1000) - j10) * ((long) this.f11960g)) / 1000000));
        }
        if (jElapsedRealtime - this.f11972s >= 5) {
            AudioTrack audioTrack = this.f11956c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f11961h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f11975v = this.f11973t;
                    }
                    playbackHeadPosition += this.f11975v;
                }
                if (C10134c0.f51354a > 29) {
                    if (this.f11973t > playbackHeadPosition) {
                        this.f11974u++;
                    }
                    this.f11973t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f11973t <= 0 || playState != 3) {
                    this.f11979z = -9223372036854775807L;
                    if (this.f11973t > playbackHeadPosition) {
                        this.f11974u++;
                    }
                    this.f11973t = playbackHeadPosition;
                } else if (this.f11979z == -9223372036854775807L) {
                    this.f11979z = jElapsedRealtime;
                }
            }
            this.f11972s = jElapsedRealtime;
        }
        return this.f11973t + (this.f11974u << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX INFO: renamed from: b */
    public final boolean m6853b(long j10) {
        boolean z10;
        if (j10 > m6852a()) {
            return true;
        }
        if (this.f11961h) {
            AudioTrack audioTrack = this.f11956c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m6852a() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m6854c() {
        this.f11965l = 0L;
        this.f11977x = 0;
        this.f11976w = 0;
        this.f11966m = 0L;
        this.f11950D = 0L;
        this.f11953G = 0L;
        this.f11964k = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX INFO: renamed from: d */
    public final void m6855d(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        boolean z11;
        this.f11956c = audioTrack;
        this.f11957d = i11;
        this.f11958e = i12;
        this.f11959f = new C6433j(audioTrack);
        this.f11960g = audioTrack.getSampleRate();
        if (z10) {
            z11 = true;
            if (!(C10134c0.f51354a < 23 && (i10 == 5 || i10 == 6))) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f11961h = z11;
        boolean zM19022G = C10134c0.m19022G(i10);
        this.f11970q = zM19022G;
        this.f11962i = zM19022G ? (((long) (i12 / i11)) * 1000000) / ((long) this.f11960g) : -9223372036854775807L;
        this.f11973t = 0L;
        this.f11974u = 0L;
        this.f11975v = 0L;
        this.f11969p = false;
        this.f11978y = -9223372036854775807L;
        this.f11979z = -9223372036854775807L;
        this.f11971r = 0L;
        this.f11968o = 0L;
        this.f11963j = 1.0f;
    }
}
