package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fer {

    /* JADX INFO: renamed from: a */
    public int f21551a;

    /* JADX INFO: renamed from: b */
    public String f21552b;

    /* JADX INFO: renamed from: c */
    public short f21553c;

    /* JADX INFO: renamed from: d */
    private int f21554d;

    /* JADX INFO: renamed from: e */
    private int f21555e;

    /* JADX INFO: renamed from: f */
    private int f21556f;

    /* JADX INFO: renamed from: g */
    private boolean f21557g;

    /* JADX INFO: renamed from: h */
    private boolean f21558h;

    /* JADX INFO: renamed from: i */
    private boolean f21559i;

    /* JADX INFO: renamed from: j */
    private boolean f21560j;

    /* JADX INFO: renamed from: k */
    private boolean f21561k;

    /* JADX INFO: renamed from: a */
    public final fes m8303a() {
        if (this.f21553c == 4095 && this.f21552b != null) {
            return new fes(this.f21551a, this.f21554d, this.f21555e, this.f21552b, this.f21556f, this.f21557g, this.f21558h, this.f21559i, this.f21560j, this.f21561k);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f21553c & 1) == 0) {
            sb.append(" burstSize");
        }
        if ((this.f21553c & 2) == 0) {
            sb.append(" videoCaptureFramerate");
        }
        if ((this.f21553c & 4) == 0) {
            sb.append(" videoHeight");
        }
        if (this.f21552b == null) {
            sb.append(" videoOrientation");
        }
        if ((this.f21553c & 8) == 0) {
            sb.append(" videoWidth");
        }
        if ((this.f21553c & 16) == 0) {
            sb.append(" hasBurstData");
        }
        if ((this.f21553c & 32) == 0) {
            sb.append(" portrait");
        }
        if ((this.f21553c & 64) == 0) {
            sb.append(" loaded");
        }
        if ((this.f21553c & 128) == 0) {
            sb.append(" panorama");
        }
        if ((this.f21553c & 256) == 0) {
            sb.append(" panorama360");
        }
        if ((this.f21553c & 512) == 0) {
            sb.append(" usePanoramaViewer");
        }
        if ((this.f21553c & 1024) == 0) {
            sb.append(" photosphere");
        }
        if ((this.f21553c & 2048) == 0) {
            sb.append(" timelapse");
        }
        throw new IllegalStateException(hsSUWRJfoeC.crdAhYmcOKXUKZ.concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m8304b(boolean z) {
        this.f21557g = z;
        this.f21553c = (short) (this.f21553c | 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m8305c(boolean z) {
        this.f21558h = z;
        this.f21553c = (short) (this.f21553c | 128);
    }

    /* JADX INFO: renamed from: d */
    public final void m8306d(boolean z) {
        this.f21559i = z;
        this.f21553c = (short) (this.f21553c | 256);
    }

    /* JADX INFO: renamed from: e */
    public final void m8307e(boolean z) {
        this.f21561k = z;
        this.f21553c = (short) (this.f21553c | 1024);
    }

    /* JADX INFO: renamed from: f */
    public final void m8308f(boolean z) {
        this.f21560j = z;
        this.f21553c = (short) (this.f21553c | 512);
    }

    /* JADX INFO: renamed from: g */
    public final void m8309g(int i) {
        this.f21554d = i;
        this.f21553c = (short) (this.f21553c | 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m8310h(int i) {
        this.f21555e = i;
        this.f21553c = (short) (this.f21553c | 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m8311i(int i) {
        this.f21556f = i;
        this.f21553c = (short) (this.f21553c | 8);
    }
}
