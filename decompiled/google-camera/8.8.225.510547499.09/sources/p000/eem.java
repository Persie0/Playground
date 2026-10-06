package p000;

import android.util.DisplayMetrics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eem {

    /* JADX INFO: renamed from: a */
    public static final nbh f13654a = nbh.m17259h("com/google/android/apps/camera/hdrplus/Shot");

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f13655b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final nsx f13659f;

    /* JADX INFO: renamed from: g */
    public final InterleavedU8ClientAllocator f13660g;

    /* JADX INFO: renamed from: h */
    public final nsq f13661h;

    /* JADX INFO: renamed from: i */
    public final InterleavedU8ClientAllocator f13662i;

    /* JADX INFO: renamed from: j */
    public final nsq f13663j;

    /* JADX INFO: renamed from: k */
    public final nsn f13664k;

    /* JADX INFO: renamed from: l */
    public final eeo f13665l;

    /* JADX INFO: renamed from: m */
    public final edk f13666m;

    /* JADX INFO: renamed from: n */
    public final boolean f13667n;

    /* JADX INFO: renamed from: o */
    public final kpp f13668o;

    /* JADX INFO: renamed from: p */
    public final egm f13669p;

    /* JADX INFO: renamed from: q */
    public final kmg f13670q;

    /* JADX INFO: renamed from: r */
    public final hnv f13671r;

    /* JADX INFO: renamed from: t */
    public final eel f13673t;

    /* JADX INFO: renamed from: u */
    public final mav f13674u;

    /* JADX INFO: renamed from: v */
    public final glk f13675v;

    /* JADX INFO: renamed from: w */
    private final ShotParams f13676w;

    /* JADX INFO: renamed from: s */
    public int f13672s = 1;

    /* JADX INFO: renamed from: c */
    public int f13656c = GcamModuleJNI.kInvalidShotId_get();

    /* JADX INFO: renamed from: d */
    public final List f13657d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List f13658e = new ArrayList();

    public eem(nsx nsxVar, eeo eeoVar, DisplayMetrics displayMetrics, glk glkVar, int i, ihk ihkVar, dja djaVar, dsx dsxVar, ShotParams shotParams, edk edkVar, boolean z, kpp kppVar, egm egmVar, kmg kmgVar, hnv hnvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13659f = nsxVar;
        this.f13674u = new mav(nsxVar);
        this.f13665l = eeoVar;
        this.f13675v = glkVar;
        this.f13676w = new ShotParams(shotParams);
        this.f13666m = edkVar;
        this.f13667n = z;
        this.f13668o = kppVar;
        this.f13669p = egmVar;
        this.f13670q = kmgVar;
        this.f13671r = hnvVar;
        this.f13673t = new eel(this, i, eeoVar, djaVar, dsxVar, ihkVar, null, null, null);
        if (eeoVar.m7234g().mo16813g()) {
            this.f13660g = new nsl(displayMetrics);
            this.f13661h = null;
        } else if (eeoVar.m7235h().mo16813g()) {
            this.f13660g = null;
            this.f13661h = new nsq();
        } else {
            if (eeoVar.m7233f().mo16813g()) {
                this.f13660g = new nsm(288L, 32L);
            } else {
                this.f13660g = null;
            }
            this.f13661h = null;
        }
        if (eeoVar.m7232e().mo16813g()) {
            this.f13664k = new nsn();
        } else {
            this.f13664k = null;
        }
        if (eeoVar.m7238k().mo16813g()) {
            this.f13662i = new nso();
            this.f13663j = null;
        } else if (eeoVar.m7239l().mo16813g()) {
            this.f13662i = new nsm(307L, 51L);
            this.f13663j = null;
        } else if (eeoVar.m7241n().mo16813g()) {
            this.f13663j = new nsq();
            this.f13662i = null;
        } else {
            this.f13662i = null;
            this.f13663j = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final nrl m7217d(hnv hnvVar) {
        hnv hnvVar2 = hnv.COLD;
        switch (hnvVar) {
            case COLD:
                return nrl.f44237f;
            case NORMAL:
                return nrl.f44232a;
            case HEAT_LIGHT:
                return nrl.f44238g;
            case HEAT_MODERATE:
                return nrl.f44239h;
            case HEAT_SEVERE:
                return nrl.f44233b;
            case HEAT_CRITICAL:
                return nrl.f44234c;
            case HEAT_EMERGENCY:
                return nrl.f44235d;
            case HEAT_SHUTDOWN:
                return nrl.f44240i;
            default:
                return nrl.f44236e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7218a() {
        lku.m15614I(this.f13656c != GcamModuleJNI.kInvalidShotId_get(), "setShotId() has not been called on this Shot.");
        return this.f13656c;
    }

    /* JADX INFO: renamed from: b */
    public final ShotParams m7219b() {
        return new ShotParams(this.f13676w);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7220c() {
        return this.f13666m == edk.LONG_EXPOSURE || this.f13667n;
    }
}
