package p000;

import android.media.MediaCodecList;
import android.os.Process;
import android.os.Trace;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cik implements Runnable {

    /* JADX INFO: renamed from: s */
    private final /* synthetic */ int f5811s;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cik f5810r = new cik(19);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ cik f5809q = new cik(18);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ cik f5808p = new cik(17);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ cik f5807o = new cik(16);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ cik f5806n = new cik(15);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ cik f5805m = new cik(14);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cik f5804l = new cik(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cik f5803k = new cik(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ cik f5802j = new cik(10);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cik f5801i = new cik(9);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ cik f5800h = new cik(8);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cik f5799g = new cik(7);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cik f5798f = new cik(6);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cik f5797e = new cik(5);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cik f5796d = new cik(4);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cik f5795c = new cik(3);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cik f5794b = new cik(2);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cik f5793a = new cik(0);

    public /* synthetic */ cik(int i) {
        this.f5811s = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5811s) {
            case 0:
                nbh nbhVar = ciq.f5815a;
                break;
            case 2:
                Process.setThreadPriority(-10);
                break;
            case 7:
                DynamicDepthUtils.savePdCacheImpl();
                break;
            case 17:
                int i = esq.f15502a;
                Trace.beginSection("preloadMediaCodecList");
                new MediaCodecList(0);
                Trace.endSection();
                break;
            case 18:
                int i2 = esq.f15502a;
                Trace.beginSection("loadJniLibraries");
                kbi.m13938a((Class) enl.f14762a.get(0));
                enc.m7546b();
                Trace.endSection();
                break;
            case 19:
                nbh nbhVar2 = fgh.f21843a;
                boolean z = fhc.f21954a;
                boolean z2 = fhc.f21954a;
                break;
        }
    }
}
