package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyf {

    /* JADX INFO: renamed from: a */
    private int f35146a;

    /* JADX INFO: renamed from: b */
    private int f35147b;

    /* JADX INFO: renamed from: c */
    private int f35148c;

    /* JADX INFO: renamed from: d */
    private int f35149d;

    /* JADX INFO: renamed from: e */
    private int f35150e;

    /* JADX INFO: renamed from: f */
    private int f35151f;

    /* JADX INFO: renamed from: g */
    private int f35152g;

    /* JADX INFO: renamed from: h */
    private int f35153h;

    /* JADX INFO: renamed from: i */
    private int f35154i;

    /* JADX INFO: renamed from: j */
    private int f35155j;

    /* JADX INFO: renamed from: k */
    private int f35156k;

    /* JADX INFO: renamed from: l */
    private int f35157l;

    /* JADX INFO: renamed from: m */
    private int f35158m;

    /* JADX INFO: renamed from: n */
    private short f35159n;

    /* JADX INFO: renamed from: a */
    public final jyg m13701a() {
        if (this.f35159n == 8191) {
            return new jyg(this.f35146a, this.f35147b, this.f35148c, this.f35149d, this.f35150e, this.f35151f, this.f35152g, this.f35153h, this.f35154i, this.f35155j, this.f35156k, this.f35157l, this.f35158m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f35159n & 1) == 0) {
            sb.append(" audioBitRate");
        }
        if ((this.f35159n & 2) == 0) {
            sb.append(" audioChannels");
        }
        if ((this.f35159n & 4) == 0) {
            sb.append(" audioCodec");
        }
        if ((this.f35159n & 8) == 0) {
            sb.append(" audioSampleRate");
        }
        if ((this.f35159n & 16) == 0) {
            sb.append(EArqVBjecl.biGvCZyRpfiRdw);
        }
        if ((this.f35159n & 32) == 0) {
            sb.append(" quality");
        }
        if ((this.f35159n & 64) == 0) {
            sb.append(" videoBitRate");
        }
        if ((this.f35159n & 128) == 0) {
            sb.append(" videoCodec");
        }
        if ((this.f35159n & 256) == 0) {
            sb.append(" videoCodecProfile");
        }
        if ((this.f35159n & 512) == 0) {
            sb.append(" videoCodecLevel");
        }
        if ((this.f35159n & 1024) == 0) {
            sb.append(" videoFrameHeight");
        }
        if ((this.f35159n & 2048) == 0) {
            sb.append(" videoFrameRate");
        }
        if ((this.f35159n & 4096) == 0) {
            sb.append(" videoFrameWidth");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m13702b(int i) {
        this.f35146a = i;
        this.f35159n = (short) (this.f35159n | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m13703c(int i) {
        this.f35147b = i;
        this.f35159n = (short) (this.f35159n | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m13704d(int i) {
        this.f35148c = i;
        this.f35159n = (short) (this.f35159n | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m13705e(int i) {
        this.f35149d = i;
        this.f35159n = (short) (this.f35159n | 8);
    }

    /* JADX INFO: renamed from: f */
    public final void m13706f(int i) {
        this.f35150e = i;
        this.f35159n = (short) (this.f35159n | 16);
    }

    /* JADX INFO: renamed from: g */
    public final void m13707g(int i) {
        this.f35151f = i;
        this.f35159n = (short) (this.f35159n | 32);
    }

    /* JADX INFO: renamed from: h */
    public final void m13708h(int i) {
        this.f35152g = i;
        this.f35159n = (short) (this.f35159n | 64);
    }

    /* JADX INFO: renamed from: i */
    public final void m13709i(int i) {
        this.f35153h = i;
        this.f35159n = (short) (this.f35159n | 128);
    }

    /* JADX INFO: renamed from: j */
    public final void m13710j(int i) {
        this.f35155j = i;
        this.f35159n = (short) (this.f35159n | 512);
    }

    /* JADX INFO: renamed from: k */
    public final void m13711k(int i) {
        this.f35154i = i;
        this.f35159n = (short) (this.f35159n | 256);
    }

    /* JADX INFO: renamed from: l */
    public final void m13712l(int i) {
        this.f35156k = i;
        this.f35159n = (short) (this.f35159n | 1024);
    }

    /* JADX INFO: renamed from: m */
    public final void m13713m(int i) {
        this.f35157l = i;
        this.f35159n = (short) (this.f35159n | 2048);
    }

    /* JADX INFO: renamed from: n */
    public final void m13714n(int i) {
        this.f35158m = i;
        this.f35159n = (short) (this.f35159n | 4096);
    }
}
