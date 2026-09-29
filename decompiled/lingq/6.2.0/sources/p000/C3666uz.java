package p000;

import android.media.AudioTrack;

/* JADX INFO: renamed from: uz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3666uz {

    /* JADX INFO: renamed from: a */
    public final C3629tz f64549a;

    /* JADX INFO: renamed from: b */
    public final int f64550b;

    /* JADX INFO: renamed from: c */
    public final ck6 f64551c;

    /* JADX INFO: renamed from: d */
    public int f64552d;

    /* JADX INFO: renamed from: e */
    public long f64553e;

    /* JADX INFO: renamed from: f */
    public long f64554f;

    /* JADX INFO: renamed from: g */
    public long f64555g;

    /* JADX INFO: renamed from: h */
    public long f64556h;

    /* JADX INFO: renamed from: i */
    public long f64557i;

    public C3666uz(AudioTrack audioTrack, ck6 ck6Var) {
        this.f64549a = new C3629tz(audioTrack);
        this.f64550b = audioTrack.getSampleRate();
        this.f64551c = ck6Var;
        m23015a(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m23015a(int i) {
        this.f64552d = i;
        if (i == 0) {
            this.f64555g = 0L;
            this.f64556h = -1L;
            this.f64557i = -9223372036854775807L;
            this.f64553e = System.nanoTime() / 1000;
            this.f64554f = 10000L;
            return;
        }
        if (i == 1) {
            this.f64554f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f64554f = 10000000L;
        } else if (i == 4) {
            this.f64554f = 500000L;
        } else {
            uk9.m22770c();
        }
    }
}
