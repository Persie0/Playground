package p195j9;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p479xa.C10134c0;

/* JADX INFO: renamed from: j9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6433j {

    /* JADX INFO: renamed from: a */
    public final a f36935a;

    /* JADX INFO: renamed from: b */
    public int f36936b;

    /* JADX INFO: renamed from: c */
    public long f36937c;

    /* JADX INFO: renamed from: d */
    public long f36938d;

    /* JADX INFO: renamed from: e */
    public long f36939e;

    /* JADX INFO: renamed from: f */
    public long f36940f;

    /* JADX INFO: renamed from: j9.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f36941a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f36942b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f36943c;

        /* JADX INFO: renamed from: d */
        public long f36944d;

        /* JADX INFO: renamed from: e */
        public long f36945e;

        public a(AudioTrack audioTrack) {
            this.f36941a = audioTrack;
        }
    }

    public C6433j(AudioTrack audioTrack) {
        if (C10134c0.f51354a >= 19) {
            this.f36935a = new a(audioTrack);
            m13056a();
        } else {
            this.f36935a = null;
            m13057b(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13056a() {
        if (this.f36935a != null) {
            m13057b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13057b(int i10) {
        this.f36936b = i10;
        if (i10 == 0) {
            this.f36939e = 0L;
            this.f36940f = -1L;
            this.f36937c = System.nanoTime() / 1000;
            this.f36938d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f36938d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f36938d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f36938d = 500000L;
        }
    }
}
