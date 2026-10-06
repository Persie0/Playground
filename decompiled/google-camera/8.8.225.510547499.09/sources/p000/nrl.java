package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrl {

    /* JADX INFO: renamed from: a */
    public static final nrl f44232a = new nrl();

    /* JADX INFO: renamed from: b */
    public static final nrl f44233b = new nrl(aJFPpVSaoDO.HwUkZDHSFYQy);

    /* JADX INFO: renamed from: c */
    public static final nrl f44234c = new nrl("kCritical");

    /* JADX INFO: renamed from: d */
    public static final nrl f44235d = new nrl("kFatal");

    /* JADX INFO: renamed from: e */
    public static final nrl f44236e = new nrl("kUnknown");

    /* JADX INFO: renamed from: f */
    public static final nrl f44237f = new nrl("kCold");

    /* JADX INFO: renamed from: g */
    public static final nrl f44238g = new nrl("kLight");

    /* JADX INFO: renamed from: h */
    public static final nrl f44239h = new nrl("kModerate");

    /* JADX INFO: renamed from: i */
    public static final nrl f44240i = new nrl("kShutdown");

    /* JADX INFO: renamed from: k */
    private static int f44241k = 0;

    /* JADX INFO: renamed from: j */
    public final int f44242j;

    /* JADX INFO: renamed from: l */
    private final String f44243l;

    private nrl() {
        this.f44243l = "kNormal";
        this.f44242j = 0;
        f44241k = 1;
    }

    private nrl(String str) {
        this.f44243l = str;
        int i = f44241k;
        f44241k = i + 1;
        this.f44242j = i;
    }

    public final String toString() {
        return this.f44243l;
    }
}
