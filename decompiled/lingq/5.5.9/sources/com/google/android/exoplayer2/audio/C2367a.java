package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.InterfaceC2409f;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2367a implements InterfaceC2409f {

    /* JADX INFO: renamed from: g */
    public static final C2367a f11937g = new C2367a(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: a */
    public final int f11938a;

    /* JADX INFO: renamed from: b */
    public final int f11939b;

    /* JADX INFO: renamed from: c */
    public final int f11940c;

    /* JADX INFO: renamed from: d */
    public final int f11941d;

    /* JADX INFO: renamed from: e */
    public final int f11942e;

    /* JADX INFO: renamed from: f */
    public c f11943f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m6839a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static void m6840a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f11944a;

        public c(C2367a c2367a) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2367a.f11938a).setFlags(c2367a.f11939b).setUsage(c2367a.f11940c);
            int i10 = C10134c0.f51354a;
            if (i10 >= 29) {
                a.m6839a(usage, c2367a.f11941d);
            }
            if (i10 >= 32) {
                b.m6840a(usage, c2367a.f11942e);
            }
            this.f11944a = usage.build();
        }
    }

    static {
        C10134c0.m19021F(0);
        C10134c0.m19021F(1);
        C10134c0.m19021F(2);
        C10134c0.m19021F(3);
        C10134c0.m19021F(4);
    }

    public C2367a(int i10, int i11, int i12, int i13, int i14) {
        this.f11938a = i10;
        this.f11939b = i11;
        this.f11940c = i12;
        this.f11941d = i13;
        this.f11942e = i14;
    }

    /* JADX INFO: renamed from: a */
    public final c m6838a() {
        if (this.f11943f == null) {
            this.f11943f = new c(this);
        }
        return this.f11943f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2367a.class == obj.getClass()) {
            C2367a c2367a = (C2367a) obj;
            return this.f11938a == c2367a.f11938a && this.f11939b == c2367a.f11939b && this.f11940c == c2367a.f11940c && this.f11941d == c2367a.f11941d && this.f11942e == c2367a.f11942e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f11938a) * 31) + this.f11939b) * 31) + this.f11940c) * 31) + this.f11941d) * 31) + this.f11942e;
    }
}
