package com.google.android.exoplayer2;

/* JADX INFO: renamed from: com.google.android.exoplayer2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2410g implements InterfaceC2464o {

    /* JADX INFO: renamed from: a */
    public final long f12243a;

    /* JADX INFO: renamed from: b */
    public final long f12244b;

    /* JADX INFO: renamed from: c */
    public final float f12245c;

    /* JADX INFO: renamed from: d */
    public long f12246d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f12247e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f12249g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f12250h = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f12253k = 0.97f;

    /* JADX INFO: renamed from: j */
    public float f12252j = 1.03f;

    /* JADX INFO: renamed from: l */
    public float f12254l = 1.0f;

    /* JADX INFO: renamed from: m */
    public long f12255m = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f12248f = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f12251i = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f12256n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public long f12257o = -9223372036854775807L;

    public C2410g(long j10, long j11, float f3) {
        this.f12243a = j10;
        this.f12244b = j11;
        this.f12245c = f3;
    }

    /* JADX INFO: renamed from: a */
    public final void m7015a() {
        long j10 = this.f12246d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f12247e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f12249g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f12250h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f12248f == j10) {
            return;
        }
        this.f12248f = j10;
        this.f12251i = j10;
        this.f12256n = -9223372036854775807L;
        this.f12257o = -9223372036854775807L;
        this.f12255m = -9223372036854775807L;
    }
}
