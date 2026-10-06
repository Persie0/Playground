package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkh implements fcp {

    /* JADX INFO: renamed from: m */
    private static final nbh f28138m = nbh.m17259h("com/google/android/apps/camera/stats/UsageStatisticsImpl");

    /* JADX INFO: renamed from: B */
    private final djm f28140B;

    /* JADX INFO: renamed from: a */
    public final String f28141a;

    /* JADX INFO: renamed from: b */
    public final oju f28142b;

    /* JADX INFO: renamed from: c */
    public final long f28143c;

    /* JADX INFO: renamed from: d */
    public final String f28144d;

    /* JADX INFO: renamed from: e */
    public final String f28145e;

    /* JADX INFO: renamed from: f */
    public final dja f28146f;

    /* JADX INFO: renamed from: h */
    public final boolean f28148h;

    /* JADX INFO: renamed from: i */
    public final Context f28149i;

    /* JADX INFO: renamed from: k */
    public long f28151k;

    /* JADX INFO: renamed from: l */
    public final boolean f28152l;

    /* JADX INFO: renamed from: n */
    private long f28153n;

    /* JADX INFO: renamed from: p */
    private final fcx f28155p;

    /* JADX INFO: renamed from: u */
    private final Executor f28160u;

    /* JADX INFO: renamed from: w */
    private long f28162w;

    /* JADX INFO: renamed from: o */
    private final AtomicInteger f28154o = new AtomicInteger(0);

    /* JADX INFO: renamed from: q */
    private final List f28156q = new ArrayList();

    /* JADX INFO: renamed from: r */
    private long f28157r = 0;

    /* JADX INFO: renamed from: s */
    private boolean f28158s = true;

    /* JADX INFO: renamed from: t */
    private long f28159t = 0;

    /* JADX INFO: renamed from: x */
    private int f28163x = 1;

    /* JADX INFO: renamed from: v */
    private final LinkedHashMap f28161v = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Phaser f28147g = new Phaser(1);

    /* JADX INFO: renamed from: y */
    private int f28164y = 1;

    /* JADX INFO: renamed from: z */
    private int f28165z = 1;

    /* JADX INFO: renamed from: A */
    private int f28139A = 1;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f28150j = new AtomicBoolean(false);

    public hkh(fcx fcxVar, Context context, long j, String str, String str2, Executor executor, dja djaVar, boolean z, oju ojuVar, djm djmVar, String str3, boolean z2, byte[] bArr) {
        this.f28151k = -1L;
        this.f28155p = fcxVar;
        this.f28149i = context;
        this.f28143c = j;
        this.f28144d = str;
        this.f28145e = str2;
        this.f28160u = executor;
        this.f28146f = djaVar;
        this.f28148h = z;
        this.f28142b = ojuVar;
        this.f28140B = djmVar;
        this.f28141a = str3;
        this.f28151k = hcf.m10102b(context);
        this.f28152l = z2;
    }

    /* JADX INFO: renamed from: aH */
    private static void m10412aH(int i, String str, long j, nhm nhmVar) {
        Level level;
        String str2;
        switch (i) {
            case 4:
                level = Level.INFO;
                break;
            default:
                level = Level.WARNING;
                break;
        }
        nbe nbeVar = (nbe) f28138m.mo17250a(level).mo17276G(3721);
        int iM17403q = nea.m17403q(nhmVar.f42345b);
        if (iM17403q == 0) {
            iM17403q = 1;
        }
        dja djaVar = dja.ENG;
        kmq kmqVar = kmq.f36557a;
        gyw gywVar = gyw.UNKNOWN;
        nma nmaVar = nma.UNKNOWN;
        int i2 = iM17403q - 1;
        switch (i2) {
            case 0:
                str2 = "-UNKNOWN";
                break;
            case 1:
                str2 = "-API1_JPEG";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                str2 = "-UNKNOWN-" + i2;
                break;
            case 9:
                str2 = "-API2BETA_HDR_PLUS";
                break;
            case 10:
                str2 = "-API2_LEGACY";
                break;
            case 11:
                str2 = "-API2_AUTO_HDR_PLUS";
                break;
            case 12:
                str2 = "-API2_ZSL";
                break;
            case 13:
                str2 = "-API2_HDR_PLUS";
                break;
            case 14:
                str2 = "-API2_LIMITED";
                break;
        }
        nbeVar.mo17271B("%s%s %d", str, str2, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: aI */
    private final void m10413aI(final msi msiVar) {
        final int i = this.f28163x;
        final long j = this.f28153n;
        final int andIncrement = this.f28154o.getAndIncrement();
        this.f28147g.register();
        this.f28160u.execute(new Runnable() { // from class: hkf
            /* JADX WARN: Code duplicated, block: B:17:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x004b  */
            @Override // java.lang.Runnable
            public final void run() {
                hkh hkhVar = this.f28125a;
                msi msiVar2 = msiVar;
                long j2 = j;
                int i2 = andIncrement;
                int i3 = i;
                nxl nxlVar = (nxl) msiVar2.mo6051a();
                nhn nhnVarM17474b = nhn.m17474b(((nho) nxlVar.f44974b).f42470d);
                if (nhnVarM17474b == null) {
                    nhnVarM17474b = nhn.UNKNOWN_TYPE;
                }
                if (nhnVarM17474b == nhn.CAPTURE_DONE) {
                    String str = hkhVar.f28144d;
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    nho nhoVar = (nho) nxlVar.f44974b;
                    str.getClass();
                    nhoVar.f42445a |= 4;
                    nhoVar.f42471e = str;
                } else {
                    int i4 = ((nho) nxlVar.f44974b).f42470d;
                    nhn nhnVarM17474b2 = nhn.m17474b(i4);
                    if (nhnVarM17474b2 == null) {
                        nhnVarM17474b2 = nhn.UNKNOWN_TYPE;
                    }
                    if (nhnVarM17474b2 == nhn.CAPTURE_COMPUTE) {
                        String str2 = hkhVar.f28144d;
                        if (!nxlVar.f44974b.m18142ac()) {
                            nxlVar.mo18106p();
                        }
                        nho nhoVar2 = (nho) nxlVar.f44974b;
                        str2.getClass();
                        nhoVar2.f42445a |= 4;
                        nhoVar2.f42471e = str2;
                    } else {
                        nhn nhnVarM17474b3 = nhn.m17474b(i4);
                        if (nhnVarM17474b3 == null) {
                            nhnVarM17474b3 = nhn.UNKNOWN_TYPE;
                        }
                        if (nhnVarM17474b3 == nhn.FOREGROUND_EVENT) {
                            String str3 = hkhVar.f28144d;
                            if (!nxlVar.f44974b.m18142ac()) {
                                nxlVar.mo18106p();
                            }
                            nho nhoVar3 = (nho) nxlVar.f44974b;
                            str3.getClass();
                            nhoVar3.f42445a |= 4;
                            nhoVar3.f42471e = str3;
                        }
                    }
                }
                long j3 = hkhVar.f28151k;
                if (j3 != -1) {
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    nho nhoVar4 = (nho) nxlVar.f44974b;
                    nhoVar4.f42469c |= 4096;
                    nhoVar4.f42458am = j3;
                }
                int i5 = 1;
                if (hkhVar.f28152l) {
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    nho nhoVar5 = (nho) nxlVar.f44974b;
                    nhoVar5.f42469c |= 32768;
                    nhoVar5.f42461ap = true;
                }
                boolean z = hkhVar.f28148h;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nxq nxqVar = nxlVar.f44974b;
                nho nhoVar6 = (nho) nxqVar;
                nhoVar6.f42445a |= 536870912;
                nhoVar6.f42492z = z;
                long j4 = hkhVar.f28143c;
                if (!nxqVar.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nho nhoVar7 = (nho) nxlVar.f44974b;
                nhoVar7.f42468b |= 1048576;
                nhoVar7.f42436R = j4;
                dja djaVar = hkhVar.f28146f;
                kmq kmqVar = kmq.f36557a;
                gyw gywVar = gyw.UNKNOWN;
                nma nmaVar = nma.UNKNOWN;
                switch (djaVar) {
                    case FISHFOOD:
                        i5 = 2;
                        break;
                    case DOGFOOD:
                        i5 = 3;
                        break;
                    case RELEASE:
                        i5 = 4;
                        break;
                }
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nxq nxqVar2 = nxlVar.f44974b;
                nho nhoVar8 = (nho) nxqVar2;
                nhoVar8.f42491y = i5 - 1;
                nhoVar8.f42445a |= 268435456;
                String str4 = hkhVar.f28141a;
                if (!nxqVar2.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nxq nxqVar3 = nxlVar.f44974b;
                nho nhoVar9 = (nho) nxqVar3;
                str4.getClass();
                nhoVar9.f42468b = 4 | nhoVar9.f42468b;
                nhoVar9.f42421C = str4;
                if (!nxqVar3.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nxq nxqVar4 = nxlVar.f44974b;
                nho nhoVar10 = (nho) nxqVar4;
                nhoVar10.f42445a |= 134217728;
                nhoVar10.f42490x = j2;
                if (!nxqVar4.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nxq nxqVar5 = nxlVar.f44974b;
                nho nhoVar11 = (nho) nxqVar5;
                nhoVar11.f42445a |= 67108864;
                nhoVar11.f42489w = i2;
                if (!nxqVar5.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nho nhoVar12 = (nho) nxlVar.f44974b;
                int i6 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                nhoVar12.f42430L = i6;
                nhoVar12.f42468b |= 16384;
                ((fcq) hkhVar.f28142b.get()).mo4205a((nho) nxlVar.mo18103l());
                hkhVar.f28147g.arriveAndDeregister();
            }
        });
    }

    /* JADX INFO: renamed from: aJ */
    private static final nhl m10414aJ(kmq kmqVar) {
        if (kmqVar != null) {
            dja djaVar = dja.ENG;
            gyw gywVar = gyw.UNKNOWN;
            nma nmaVar = nma.UNKNOWN;
            switch (kmqVar) {
                case f36557a:
                    return nhl.FRONT;
                case BACK:
                    return nhl.BACK;
                case EXTERNAL:
                    return nhl.UNKNOWN_CAMERA_DIRECTION;
            }
        }
        return nhl.UNKNOWN_CAMERA_DIRECTION;
    }

    /* JADX INFO: renamed from: aK */
    private static final nmd m10415aK(PointF pointF) {
        nxl nxlVarM18137O = nmd.f43757d.m18137O();
        if (pointF != null) {
            float f = pointF.x;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmd nmdVar = (nmd) nxlVarM18137O.f44974b;
            nmdVar.f43759a |= 1;
            nmdVar.f43760b = f;
            float f2 = pointF.y;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmd nmdVar2 = (nmd) nxlVarM18137O.f44974b;
            nmdVar2.f43759a |= 2;
            nmdVar2.f43761c = f2;
        }
        return (nmd) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: aL */
    private final void m10416aL(int i, nlx nlxVar, nlo nloVar, nhf nhfVar, nmm nmmVar, nio nioVar) {
        nxl nxlVarM18137O = nii.f42702i.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nii niiVar = (nii) nxqVar;
        niiVar.f42705b = i - 1;
        niiVar.f42704a |= 1;
        int i2 = this.f28163x;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nii niiVar2 = (nii) nxqVar2;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        niiVar2.f42706c = i3;
        niiVar2.f42704a |= 2;
        if (nlxVar != null) {
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nii niiVar3 = (nii) nxlVarM18137O.f44974b;
            niiVar3.f42707d = nlxVar;
            niiVar3.f42704a |= 8;
        }
        if (nloVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nii niiVar4 = (nii) nxlVarM18137O.f44974b;
            niiVar4.f42708e = nloVar;
            niiVar4.f42704a |= 16;
        }
        if (nhfVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nii niiVar5 = (nii) nxlVarM18137O.f44974b;
            niiVar5.f42709f = nhfVar;
            niiVar5.f42704a |= 32;
        }
        if (nmmVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nii niiVar6 = (nii) nxlVarM18137O.f44974b;
            niiVar6.f42710g = nmmVar;
            niiVar6.f42704a |= 64;
        }
        if (nioVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nii niiVar7 = (nii) nxlVarM18137O.f44974b;
            niiVar7.f42711h = nioVar;
            niiVar7.f42704a |= 128;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CONTROL_USED;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar3;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nii niiVar8 = (nii) nxlVarM18137O.mo18103l();
        niiVar8.getClass();
        nhoVar2.f42477k = niiVar8;
        nhoVar2.f42445a |= 256;
        m10421aF(nxlVarM18137O2);
    }

    /* JADX INFO: renamed from: aM */
    private static final nif m10417aM(int i, int i2) {
        nxl nxlVarM18137O = nif.f42681d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nif nifVar = (nif) nxqVar;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        nifVar.f42684b = i3;
        nifVar.f42683a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nif nifVar2 = (nif) nxlVarM18137O.f44974b;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        nifVar2.f42685c = i4;
        nifVar2.f42683a |= 2;
        return (nif) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: aN */
    private static final int m10418aN(gyw gywVar) {
        dja djaVar = dja.ENG;
        kmq kmqVar = kmq.f36557a;
        gyw gywVar2 = gyw.UNKNOWN;
        nma nmaVar = nma.UNKNOWN;
        switch (gywVar.ordinal()) {
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 12;
            default:
                return 1;
        }
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: A */
    public final void mo8126A(boolean z) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!this.f28158s && z) {
            long j = this.f28159t;
            if (j != 0) {
                nxl nxlVarM18137O = nho.f42417av.m18137O();
                nhn nhnVar = nhn.BLOCK_SHOT;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nho nhoVar = (nho) nxlVarM18137O.f44974b;
                nhoVar.f42470d = nhnVar.f42416ar;
                nhoVar.f42445a |= 1;
                nxl nxlVarM18137O2 = nhi.f42320e.m18137O();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                nhi nhiVar = (nhi) nxqVar;
                nhiVar.f42322a |= 1;
                nhiVar.f42323b = j;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O2.f44974b;
                nhi nhiVar2 = (nhi) nxqVar2;
                nhiVar2.f42322a |= 2;
                nhiVar2.f42324c = jElapsedRealtimeNanos;
                int i = this.f28163x;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nhi nhiVar3 = (nhi) nxlVarM18137O2.f44974b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                nhiVar3.f42325d = i2;
                nhiVar3.f42322a |= 4;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
                nhi nhiVar4 = (nhi) nxlVarM18137O2.mo18103l();
                nhiVar4.getClass();
                nhoVar2.f42486t = nhiVar4;
                nhoVar2.f42445a |= 1048576;
                m10421aF(nxlVarM18137O);
            }
        }
        this.f28159t = jElapsedRealtimeNanos;
        this.f28158s = z;
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: B */
    public final void mo8127B(long j, List list) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.SLOW_PROCESSING_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nlq.f43570d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nlq nlqVar = (nlq) nxqVar;
        nlqVar.f43572a |= 1;
        nlqVar.f43573b = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nlq nlqVar2 = (nlq) nxlVarM18137O2.f44974b;
        nxy nxyVar = nlqVar2.f43574c;
        if (!nxyVar.mo17770c()) {
            nlqVar2.f43574c = nxq.m18127U(nxyVar);
        }
        nwb.m17749e(list, nlqVar2.f43574c);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nlq nlqVar3 = (nlq) nxlVarM18137O2.mo18103l();
        nlqVar3.getClass();
        nhoVar2.f42429K = nlqVar3;
        nhoVar2.f42468b |= 8192;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: C */
    public final void mo8128C(nlz nlzVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.THERMAL_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nlzVar.getClass();
        nhoVar2.f42424F = nlzVar;
        nhoVar2.f42468b |= 256;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: D */
    public final void mo8129D(Throwable th, int i) {
        int i2 = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        mo8147V(10, null, th, -1, -1, i, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: E */
    public final void mo8130E(String str, boolean z, gyw gywVar, String str2, int i) {
        nxl nxlVarM18137O = njx.f43103g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njx njxVar = (njx) nxqVar;
        str.getClass();
        njxVar.f43105a |= 1;
        njxVar.f43106b = str;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njx njxVar2 = (njx) nxlVarM18137O.f44974b;
        njxVar2.f43105a |= 2;
        njxVar2.f43107c = z;
        dja djaVar = dja.ENG;
        kmq kmqVar = kmq.f36557a;
        gyw gywVar2 = gyw.UNKNOWN;
        nma nmaVar = nma.UNKNOWN;
        switch (gywVar.ordinal()) {
            case 1:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar3 = (njx) nxlVarM18137O.f44974b;
                njxVar3.f43108d = 1;
                njxVar3.f43105a |= 4;
                break;
            case 2:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar4 = (njx) nxlVarM18137O.f44974b;
                njxVar4.f43108d = 2;
                njxVar4.f43105a |= 4;
                break;
            case 3:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar5 = (njx) nxlVarM18137O.f44974b;
                njxVar5.f43108d = 3;
                njxVar5.f43105a |= 4;
                break;
            case 4:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar6 = (njx) nxlVarM18137O.f44974b;
                njxVar6.f43108d = 31;
                njxVar6.f43105a |= 4;
                break;
            case 5:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar7 = (njx) nxlVarM18137O.f44974b;
                njxVar7.f43108d = 20;
                njxVar7.f43105a |= 4;
                break;
            case 6:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar8 = (njx) nxlVarM18137O.f44974b;
                njxVar8.f43108d = 20;
                njxVar8.f43105a |= 4;
                break;
            case 7:
            case 8:
            default:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar9 = (njx) nxlVarM18137O.f44974b;
                njxVar9.f43108d = 0;
                njxVar9.f43105a |= 4;
                break;
            case 9:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar10 = (njx) nxlVarM18137O.f44974b;
                njxVar10.f43108d = 10;
                njxVar10.f43105a |= 4;
                break;
            case 10:
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njx njxVar11 = (njx) nxlVarM18137O.f44974b;
                njxVar11.f43108d = 32;
                njxVar11.f43105a |= 4;
                break;
        }
        if (str2 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njx njxVar12 = (njx) nxlVarM18137O.f44974b;
            njxVar12.f43105a |= 8;
            njxVar12.f43109e = str2;
        }
        if (i != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njx njxVar13 = (njx) nxlVarM18137O.f44974b;
            njxVar13.f43105a |= 16;
            njxVar13.f43110f = i;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.LAUNCH_PHOTOS_REVIEW_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar2;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        njx njxVar14 = (njx) nxlVarM18137O.mo18103l();
        njxVar14.getClass();
        nhoVar2.f42420B = njxVar14;
        nhoVar2.f42468b |= 1;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: F */
    public final void mo8131F(nlf nlfVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PHOTOBOOTH_SESSION_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nlfVar.getClass();
        nhoVar2.f42425G = nlfVar;
        nhoVar2.f42468b |= 512;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: G */
    public final void mo8132G(nli nliVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PORTRAIT_SEGMENTER_INIT_FAILURE;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nliVar.getClass();
        nhoVar2.f42438T = nliVar;
        nhoVar2.f42468b |= 8388608;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: H */
    public final void mo8133H() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_PREWARM;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhv.f42556c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhv nhvVar = (nhv) nxlVarM18137O2.f44974b;
        nhvVar.f42559b = 1;
        nhvVar.f42558a = 1 | nhvVar.f42558a;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhv nhvVar2 = (nhv) nxlVarM18137O2.mo18103l();
        nhvVar2.getClass();
        nhoVar2.f42483q = nhvVar2;
        nhoVar2.f42445a |= 131072;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: I */
    public final void mo8134I() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_PREWARM;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhv.f42556c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhv nhvVar = (nhv) nxlVarM18137O2.f44974b;
        nhvVar.f42559b = 3;
        nhvVar.f42558a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhv nhvVar2 = (nhv) nxlVarM18137O2.mo18103l();
        nhvVar2.getClass();
        nhoVar2.f42483q = nhvVar2;
        nhoVar2.f42445a |= 131072;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: J */
    public final void mo8135J(nlm nlmVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PROCESS_GC_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nlmVar.getClass();
        nhoVar2.f42457al = nlmVar;
        nhoVar2.f42469c |= 2048;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: K */
    public final void mo8136K(nlv nlvVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.STATS_3A_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nlvVar.getClass();
        nhoVar2.f42452ag = nlvVar;
        nhoVar2.f42469c |= 32;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: L */
    public final void mo8137L(njg njgVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.FRAMING_HINT_SHOWN;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njgVar.getClass();
        nhoVar2.f42449ad = njgVar;
        nhoVar2.f42469c |= 4;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: M */
    public final void mo8138M(njh njhVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.f42373aa;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njhVar.getClass();
        nhoVar2.f42448ac = njhVar;
        nhoVar2.f42469c |= 2;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: N */
    public final void mo8139N(nmf nmfVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.VIDEO_SESSION_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nmfVar.getClass();
        nhoVar2.f42442X = nmfVar;
        nhoVar2.f42468b |= 268435456;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: O */
    public final void mo8140O(nml nmlVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.WEAR_SESSION_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nmlVar.getClass();
        nhoVar2.f42432N = nmlVar;
        nhoVar2.f42468b |= 65536;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: P */
    public final void mo8141P(int i, float f, float f2, kmq kmqVar) {
        int i2;
        nxl nxlVarM18137O = nmm.f43851e.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nmm nmmVar = (nmm) nxqVar;
        nmmVar.f43853a |= 1;
        nmmVar.f43854b = f;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmm nmmVar2 = (nmm) nxlVarM18137O.f44974b;
        nmmVar2.f43853a |= 2;
        nmmVar2.f43855c = f2;
        nhl nhlVarM10414aJ = m10414aJ(kmqVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmm nmmVar3 = (nmm) nxlVarM18137O.f44974b;
        nmmVar3.f43856d = nhlVarM10414aJ.f42341d;
        nmmVar3.f43853a |= 4;
        nmm nmmVar4 = (nmm) nxlVarM18137O.mo18103l();
        dja djaVar = dja.ENG;
        kmq kmqVar2 = kmq.f36557a;
        gyw gywVar = gyw.UNKNOWN;
        nma nmaVar = nma.UNKNOWN;
        switch (i - 1) {
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 10;
                break;
            case 3:
                i2 = 13;
                break;
            case 4:
                i2 = 14;
                break;
            case 5:
                i2 = 15;
                break;
            case 6:
                i2 = 16;
                break;
            case 7:
                i2 = 17;
                break;
            case 8:
                i2 = 18;
                break;
            case 9:
                i2 = 19;
                break;
            case 10:
                i2 = 20;
                break;
            default:
                i2 = 1;
                break;
        }
        m10416aL(i2, null, null, null, nmmVar4, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: Q */
    public final void mo8142Q() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_PREWARM;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhv.f42556c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhv nhvVar = (nhv) nxlVarM18137O2.f44974b;
        nhvVar.f42559b = 2;
        nhvVar.f42558a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhv nhvVar2 = (nhv) nxlVarM18137O2.mo18103l();
        nhvVar2.getClass();
        nhoVar2.f42483q = nhvVar2;
        nhoVar2.f42445a |= 131072;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: R */
    public final void mo8143R() {
        this.f28153n = UUID.randomUUID().getLeastSignificantBits();
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: S */
    public final void mo8144S(ili iliVar, boolean z) {
        nxl nxlVarM18137O = nlx.f43699d.m18137O();
        nxl nxlVarM18137O2 = nmc.f43750f.m18137O();
        float f = iliVar.f31433a;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nmc nmcVar = (nmc) nxqVar;
        nmcVar.f43752a |= 1;
        nmcVar.f43753b = f;
        float f2 = iliVar.f31434b;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nmc nmcVar2 = (nmc) nxqVar2;
        nmcVar2.f43752a |= 2;
        nmcVar2.f43754c = f2;
        float f3 = iliVar.f31435c;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O2.f44974b;
        nmc nmcVar3 = (nmc) nxqVar3;
        nmcVar3.f43752a |= 4;
        nmcVar3.f43755d = f3;
        float f4 = iliVar.f31436d;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nmc nmcVar4 = (nmc) nxlVarM18137O2.f44974b;
        nmcVar4.f43752a |= 8;
        nmcVar4.f43756e = f4;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlx nlxVar = (nlx) nxlVarM18137O.f44974b;
        nmc nmcVar5 = (nmc) nxlVarM18137O2.mo18103l();
        nmcVar5.getClass();
        nlxVar.f43702b = nmcVar5;
        nlxVar.f43701a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlx nlxVar2 = (nlx) nxlVarM18137O.f44974b;
        nlxVar2.f43701a |= 8;
        nlxVar2.f43703c = z;
        m10416aL(2, (nlx) nxlVarM18137O.mo18103l(), null, null, null, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: T */
    public final void mo8145T(kmq kmqVar, mrm mrmVar, nim nimVar, nma nmaVar, long j, long j2, boolean z, boolean z2, mwx mwxVar, mwx mwxVar2, mwx mwxVar3) {
        bkn bknVar = new bkn(11, kmqVar.equals(kmq.f36557a));
        bknVar.m2568R(z2);
        bknVar.m2565O(nimVar);
        nxl nxlVarM18137O = nmb.f43725x.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nmb nmbVar = (nmb) nxqVar;
        nmbVar.f43727a |= 1;
        nmbVar.f43728b = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nmb nmbVar2 = (nmb) nxqVar2;
        nmbVar2.f43727a |= 2;
        nmbVar2.f43729c = j2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nmb nmbVar3 = (nmb) nxqVar3;
        nmbVar3.f43730d = nmaVar.f43724h;
        nmbVar3.f43727a |= 4;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmb nmbVar4 = (nmb) nxlVarM18137O.f44974b;
        nmbVar4.f43727a |= 2097152;
        nmbVar4.f43749w = z;
        for (nma nmaVar2 : nma.values()) {
            if (mwxVar.containsKey(nmaVar2) && mwxVar2.containsKey(nmaVar2) && mwxVar3.containsKey(nmaVar2)) {
                dja djaVar = dja.ENG;
                gyw gywVar = gyw.UNKNOWN;
                switch (nmaVar2.ordinal()) {
                    case 1:
                        int iIntValue = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar5 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar5.f43727a |= 8;
                        nmbVar5.f43731e = iIntValue;
                        long jLongValue = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar6 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar6.f43727a |= 512;
                        nmbVar6.f43737k = jLongValue;
                        long jLongValue2 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar7 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar7.f43727a |= 32768;
                        nmbVar7.f43743q = jLongValue2;
                        break;
                    case 2:
                        int iIntValue2 = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar8 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar8.f43727a |= 16;
                        nmbVar8.f43732f = iIntValue2;
                        long jLongValue3 = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar9 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar9.f43727a |= 1024;
                        nmbVar9.f43738l = jLongValue3;
                        long jLongValue4 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar10 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar10.f43727a |= 65536;
                        nmbVar10.f43744r = jLongValue4;
                        break;
                    case 3:
                        int iIntValue3 = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar11 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar11.f43727a |= 32;
                        nmbVar11.f43733g = iIntValue3;
                        long jLongValue5 = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar12 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar12.f43727a |= 2048;
                        nmbVar12.f43739m = jLongValue5;
                        long jLongValue6 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar13 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar13.f43727a |= 131072;
                        nmbVar13.f43745s = jLongValue6;
                        break;
                    case 4:
                        int iIntValue4 = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar14 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar14.f43727a |= 64;
                        nmbVar14.f43734h = iIntValue4;
                        long jLongValue7 = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar15 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar15.f43727a |= 4096;
                        nmbVar15.f43740n = jLongValue7;
                        long jLongValue8 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar16 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar16.f43727a |= 262144;
                        nmbVar16.f43746t = jLongValue8;
                        break;
                    case 5:
                        int iIntValue5 = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar17 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar17.f43727a |= 128;
                        nmbVar17.f43735i = iIntValue5;
                        long jLongValue9 = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar18 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar18.f43727a |= 8192;
                        nmbVar18.f43741o = jLongValue9;
                        long jLongValue10 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar19 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar19.f43727a |= 524288;
                        nmbVar19.f43747u = jLongValue10;
                        break;
                    case 6:
                        int iIntValue6 = ((Integer) mwxVar.get(nmaVar2)).intValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar20 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar20.f43727a |= 256;
                        nmbVar20.f43736j = iIntValue6;
                        long jLongValue11 = ((Long) mwxVar2.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar21 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar21.f43727a |= 16384;
                        nmbVar21.f43742p = jLongValue11;
                        long jLongValue12 = ((Long) mwxVar3.get(nmaVar2)).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nmb nmbVar22 = (nmb) nxlVarM18137O.f44974b;
                        nmbVar22.f43727a |= 1048576;
                        nmbVar22.f43748v = jLongValue12;
                        break;
                }
            }
        }
        nmb nmbVar23 = (nmb) nxlVarM18137O.mo18103l();
        if (nmbVar23 != null) {
            nxl nxlVar = (nxl) bknVar.f3651a;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nhy nhyVar = (nhy) nxlVar.f44974b;
            nhy nhyVar2 = nhy.f42573Z;
            nhyVar.f42577C = nmbVar23;
            nhyVar.f42601b |= 16;
        }
        if (mrmVar.mo16813g()) {
            bknVar.m2569S((nkk) mrmVar.mo16809c());
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: V */
    public final void mo8147V(int i, String str, Throwable th, int i2, int i3, int i4, List list, List list2, kcl kclVar, boolean z) {
        nxl nxlVarM18137O = nhp.f42493m.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nhp nhpVar = (nhp) nxqVar;
        nhpVar.f42496b = i - 1;
        nhpVar.f42495a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nhp nhpVar2 = (nhp) nxqVar2;
        nhpVar2.f42495a |= 64;
        nhpVar2.f42501g = i4;
        String str2 = this.f28145e;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nhp nhpVar3 = (nhp) nxqVar3;
        str2.getClass();
        nhpVar3.f42495a |= 4;
        nhpVar3.f42498d = str2;
        if (str != null) {
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar4 = (nhp) nxlVarM18137O.f44974b;
            nhpVar4.f42495a |= 2;
            nhpVar4.f42497c = str;
        }
        if (i2 != -1) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar5 = (nhp) nxlVarM18137O.f44974b;
            nhpVar5.f42495a |= 8;
            nhpVar5.f42499e = i2;
        }
        if (i3 != -1) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar6 = (nhp) nxlVarM18137O.f44974b;
            nhpVar6.f42495a |= 16;
            nhpVar6.f42500f = i3;
        }
        if (th != null) {
            nxl nxlVarM18137O2 = nju.f43088b.m18137O();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                nxl nxlVarM18137O3 = njv.f43091d.m18137O();
                String simpleName = cause.getClass().getSimpleName();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                njv njvVar = (njv) nxlVarM18137O3.f44974b;
                simpleName.getClass();
                njvVar.f43093a |= 1;
                njvVar.f43094b = simpleName;
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    nxl nxlVarM18137O4 = njw.f43096f.m18137O();
                    String className = stackTraceElement.getClassName();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    njw njwVar = (njw) nxlVarM18137O4.f44974b;
                    className.getClass();
                    njwVar.f43098a |= 1;
                    njwVar.f43099b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    njw njwVar2 = (njw) nxlVarM18137O4.f44974b;
                    methodName.getClass();
                    njwVar2.f43098a |= 2;
                    njwVar2.f43100c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    njw njwVar3 = (njw) nxlVarM18137O4.f44974b;
                    njwVar3.f43098a |= 8;
                    njwVar3.f43102e = lineNumber;
                    String fileName = stackTraceElement.getFileName();
                    if (fileName != null) {
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        njw njwVar4 = (njw) nxlVarM18137O4.f44974b;
                        njwVar4.f43098a |= 4;
                        njwVar4.f43101d = fileName;
                    }
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    njv njvVar2 = (njv) nxlVarM18137O3.f44974b;
                    njw njwVar5 = (njw) nxlVarM18137O4.mo18103l();
                    njwVar5.getClass();
                    nxy nxyVar = njvVar2.f43095c;
                    if (!nxyVar.mo17770c()) {
                        njvVar2.f43095c = nxq.m18127U(nxyVar);
                    }
                    njvVar2.f43095c.add(njwVar5);
                }
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nju njuVar = (nju) nxlVarM18137O2.f44974b;
                njv njvVar3 = (njv) nxlVarM18137O3.mo18103l();
                njvVar3.getClass();
                nxy nxyVar2 = njuVar.f43090a;
                if (!nxyVar2.mo17770c()) {
                    njuVar.f43090a = nxq.m18127U(nxyVar2);
                }
                njuVar.f43090a.add(njvVar3);
            }
            nju njuVar2 = (nju) nxlVarM18137O2.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar7 = (nhp) nxlVarM18137O.f44974b;
            njuVar2.getClass();
            nhpVar7.f42502h = njuVar2;
            nhpVar7.f42495a |= 128;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m10414aJ((kmq) it.next()));
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhp nhpVar8 = (nhp) nxlVarM18137O.f44974b;
        nxw nxwVar = nhpVar8.f42503i;
        if (!nxwVar.mo17770c()) {
            nhpVar8.f42503i = nxq.m18125S(nxwVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nhpVar8.f42503i.mo18148g(((nhl) it2.next()).f42341d);
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhp nhpVar9 = (nhp) nxlVarM18137O.f44974b;
        nxy nxyVar3 = nhpVar9.f42506l;
        if (!nxyVar3.mo17770c()) {
            nhpVar9.f42506l = nxq.m18127U(nxyVar3);
        }
        nwb.m17749e(list2, nhpVar9.f42506l);
        if (kclVar != kcl.CAMERA_ERROR_CODE_UNKNOWN) {
            int i5 = kclVar.f35597u;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar10 = (nhp) nxlVarM18137O.f44974b;
            nhpVar10.f42495a |= 256;
            nhpVar10.f42504j = i5;
        }
        if (i == 3) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhp nhpVar11 = (nhp) nxlVarM18137O.f44974b;
            nhpVar11.f42495a |= 512;
            nhpVar11.f42505k = z;
        }
        nxl nxlVarM18137O5 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_FAILURE;
        if (!nxlVarM18137O5.f44974b.m18142ac()) {
            nxlVarM18137O5.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O5.f44974b;
        nho nhoVar = (nho) nxqVar4;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O5.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O5.f44974b;
        nhp nhpVar12 = (nhp) nxlVarM18137O.mo18103l();
        nhpVar12.getClass();
        nhoVar2.f42476j = nhpVar12;
        nhoVar2.f42445a |= 128;
        m10421aF(nxlVarM18137O5);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: W */
    public final void mo8148W(int i, int i2, int i3, kmq kmqVar, int i4) {
        nxl nxlVarM18137O = nhs.f42534g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nhs nhsVar = (nhs) nxqVar;
        nhsVar.f42537b = i - 1;
        nhsVar.f42536a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nhs nhsVar2 = (nhs) nxqVar2;
        nhsVar2.f42538c = i2 - 1;
        nhsVar2.f42536a |= 2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhs nhsVar3 = (nhs) nxlVarM18137O.f44974b;
        nhsVar3.f42539d = i3 - 1;
        nhsVar3.f42536a |= 4;
        if (kmqVar != null) {
            nhl nhlVarM10414aJ = m10414aJ(kmqVar);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhs nhsVar4 = (nhs) nxlVarM18137O.f44974b;
            nhsVar4.f42540e = nhlVarM10414aJ.f42341d;
            nhsVar4.f42536a |= 8;
        }
        if (i4 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhs nhsVar5 = (nhs) nxlVarM18137O.f44974b;
            nhsVar5.f42541f = i4 - 1;
            nhsVar5.f42536a |= 16;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_FATAL_ERROR_DIALOG;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nhs nhsVar6 = (nhs) nxlVarM18137O.mo18103l();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nhsVar6.getClass();
        nhoVar2.f42447ab = nhsVar6;
        nhoVar2.f42469c |= 1;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: X */
    public final void mo8149X(int i, nlb nlbVar, nle nleVar, nlr nlrVar, Long l) {
        this.f28157r = SystemClock.elapsedRealtime();
        nxl nxlVarM18137O = nhx.f42565g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nhx nhxVar = (nhx) nxqVar;
        nhxVar.f42568b = i - 1;
        nhxVar.f42567a |= 1;
        if (nlbVar != null) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhx nhxVar2 = (nhx) nxlVarM18137O.f44974b;
            nhxVar2.f42569c = nlbVar;
            nhxVar2.f42567a |= 4;
        }
        if (nleVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhx nhxVar3 = (nhx) nxlVarM18137O.f44974b;
            nhxVar3.f42570d = nleVar;
            nhxVar3.f42567a |= 16;
        }
        if (nlrVar != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhx nhxVar4 = (nhx) nxlVarM18137O.f44974b;
            nhxVar4.f42572f = nlrVar;
            nhxVar4.f42567a |= 64;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhx nhxVar5 = (nhx) nxlVarM18137O.f44974b;
            nhxVar5.f42567a |= 32;
            nhxVar5.f42571e = jLongValue;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_COMPUTE;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar2;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nhx nhxVar6 = (nhx) nxlVarM18137O.mo18103l();
        nhxVar6.getClass();
        nhoVar2.f42478l = nhxVar6;
        nhoVar2.f42445a |= 512;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: Y */
    public final void mo8150Y(int i, int i2, long j, long j2) {
        long j3 = this.f28157r;
        long j4 = this.f28162w;
        long jM13811N = jzn.m13811N(j4);
        long j5 = j - j4;
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CHANGE_CAMERA;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nih.f42693h.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nih nihVar = (nih) nxqVar;
        nihVar.f42696b = i - 1;
        nihVar.f42695a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nih nihVar2 = (nih) nxqVar2;
        nihVar2.f42697c = i2 - 1;
        nihVar2.f42695a |= 2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O2.f44974b;
        nih nihVar3 = (nih) nxqVar3;
        nihVar3.f42695a |= 4;
        nihVar3.f42698d = j;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O2.f44974b;
        nih nihVar4 = (nih) nxqVar4;
        nihVar4.f42695a |= 8;
        nihVar4.f42699e = j2;
        int i3 = this.f28165z;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O2.f44974b;
        nih nihVar5 = (nih) nxqVar5;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        nihVar5.f42700f = i4;
        nihVar5.f42695a |= 16;
        boolean z = false;
        if (j5 < 3000000000L && j3 < jM13811N) {
            z = true;
        }
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nih nihVar6 = (nih) nxlVarM18137O2.f44974b;
        nihVar6.f42695a |= 32;
        nihVar6.f42701g = z;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nih nihVar7 = (nih) nxlVarM18137O2.mo18103l();
        nihVar7.getClass();
        nhoVar2.f42485s = nihVar7;
        nhoVar2.f42445a |= 524288;
        m10421aF(nxlVarM18137O);
        this.f28165z = 1;
        this.f28162w = j2;
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: Z */
    public final void mo8151Z(int i, int i2) {
        mo8156aa(i, i2, 0L, 0L);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: a */
    public final long mo8152a() {
        return this.f28153n;
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aA */
    public final void mo8153aA(int i, int i2, float f) {
        nxl nxlVarM18137O = nlb.f43441f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nlb nlbVar = (nlb) nxqVar;
        nlbVar.f43443a |= 2;
        nlbVar.f43444b = i;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nlb nlbVar2 = (nlb) nxqVar2;
        nlbVar2.f43443a |= 4;
        nlbVar2.f43445c = i2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nlb nlbVar3 = (nlb) nxqVar3;
        nlbVar3.f43443a |= 8;
        nlbVar3.f43446d = f;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlb nlbVar4 = (nlb) nxlVarM18137O.f44974b;
        nlbVar4.f43447e = 3;
        nlbVar4.f43443a |= 16;
        mo8149X(6, (nlb) nxlVarM18137O.mo18103l(), null, null, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aB */
    public final void mo8154aB(Float f, kmq kmqVar) {
        nhl nhlVar;
        nxl nxlVarM18137O = nin.f42736f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nin ninVar = (nin) nxlVarM18137O.f44974b;
        ninVar.f42740c = 2;
        ninVar.f42738a = 2 | ninVar.f42738a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nin ninVar2 = (nin) nxlVarM18137O.f44974b;
        ninVar2.f42738a |= 1;
        ninVar2.f42739b = jElapsedRealtimeNanos;
        float fFloatValue = f.floatValue();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nin ninVar3 = (nin) nxlVarM18137O.f44974b;
        ninVar3.f42738a |= 4;
        ninVar3.f42741d = fFloatValue;
        if (kmqVar == null) {
            nhlVar = nhl.UNKNOWN_CAMERA_DIRECTION;
        } else {
            nhlVar = kmqVar == kmq.f36557a ? nhl.FRONT : nhl.BACK;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nin ninVar4 = (nin) nxlVarM18137O.f44974b;
        ninVar4.f42742e = nhlVar.f42341d;
        ninVar4.f42738a |= 8;
        this.f28156q.add((nin) nxlVarM18137O.mo18103l());
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aC */
    public final void mo8155aC() {
        this.f28165z = 2;
    }

    @Override // p000.kmj
    /* JADX INFO: renamed from: aD */
    public final void mo10419aD(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kmh kmhVar = (kmh) it.next();
            int i = mws.f41739d;
            mo8147V(11, null, null, 0, 0, 0, mzr.f41857a, mws.m17097l(kmhVar.f36543a), kcl.m13980b(kmhVar), false);
        }
    }

    @Override // p000.kdc
    /* JADX INFO: renamed from: aE */
    public final void mo10420aE(int i, kcl kclVar, String str, int i2) {
        int iM15006ax = kxk.m15006ax(i2 - 1);
        if (iM15006ax == 0) {
            iM15006ax = 1;
        }
        int iM15007ay = kxk.m15007ay(i - 1);
        if (iM15007ay == 0) {
            iM15007ay = 3;
        }
        nxl nxlVarM18137O = nkv.f43332f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nkv nkvVar = (nkv) nxqVar;
        nkvVar.f43335b = iM15007ay - 1;
        nkvVar.f43334a |= 1;
        int i3 = kclVar.f35597u;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nkv nkvVar2 = (nkv) nxqVar2;
        nkvVar2.f43334a |= 2;
        nkvVar2.f43336c = i3;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nkv nkvVar3 = (nkv) nxqVar3;
        nkvVar3.f43338e = iM15006ax - 1;
        nkvVar3.f43334a |= 8;
        if (str != null) {
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkv nkvVar4 = (nkv) nxlVarM18137O.f44974b;
            nkvVar4.f43334a |= 4;
            nkvVar4.f43337d = str;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.OPEN_DEVICE_RETRY;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar4;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nkv nkvVar5 = (nkv) nxlVarM18137O.mo18103l();
        nkvVar5.getClass();
        nhoVar2.f42484r = nkvVar5;
        nhoVar2.f42445a |= 262144;
        m10421aF(nxlVarM18137O2);
    }

    /* JADX INFO: renamed from: aF */
    public final void m10421aF(nxl nxlVar) {
        m10413aI(new dfg(nxlVar, 4));
    }

    /* JADX INFO: renamed from: aG */
    public final void m10422aG(bkn bknVar) {
        this.f28147g.register();
        this.f28160u.execute(new hea(this, bknVar, 15, null, null, null, null, null));
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aa */
    public final void mo8156aa(int i, int i2, long j, long j2) {
        int i3;
        nxl nxlVarM18137O = nkt.f43315h.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nkt nktVar = (nkt) nxqVar;
        nktVar.f43319c = i - 1;
        nktVar.f43317a |= 2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nkt nktVar2 = (nkt) nxqVar2;
        nktVar2.f43320d = i2 - 1;
        nktVar2.f43317a |= 4;
        int i4 = this.f28163x;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nkt nktVar3 = (nkt) nxqVar3;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        nktVar3.f43318b = i5;
        nktVar3.f43317a |= 1;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        nkt nktVar4 = (nkt) nxqVar4;
        nktVar4.f43317a |= 16;
        nktVar4.f43322f = j;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkt nktVar5 = (nkt) nxlVarM18137O.f44974b;
        nktVar5.f43317a |= 32;
        nktVar5.f43323g = j2;
        if (i == 3) {
            if (this.f28157r == 0 || !((i3 = this.f28163x) == 8 || i3 == 6 || i3 == 2 || i3 == 9 || i3 == 12)) {
                i = 3;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f28157r;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                float fM13806I = jzn.m13806I(jElapsedRealtime);
                nkt nktVar6 = (nkt) nxlVarM18137O.f44974b;
                nktVar6.f43317a |= 8;
                nktVar6.f43321e = fM13806I;
                i = 3;
            }
        }
        this.f28157r = 0L;
        int i6 = this.f28163x;
        if (i6 != 1 && i != 28 && i6 != i) {
            nxl nxlVarM18137O2 = nho.f42417av.m18137O();
            nhn nhnVar = nhn.NAVIGATION_CHANGE;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O2.f44974b;
            nho nhoVar = (nho) nxqVar5;
            nhoVar.f42470d = nhnVar.f42416ar;
            nhoVar.f42445a |= 1;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
            nkt nktVar7 = (nkt) nxlVarM18137O.mo18103l();
            nktVar7.getClass();
            nhoVar2.f42472f = nktVar7;
            nhoVar2.f42445a = 8 | nhoVar2.f42445a;
            m10421aF(nxlVarM18137O2);
        }
        this.f28163x = i;
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ab */
    public final void mo8157ab(int i, float f) {
        nxl nxlVarM18137O = nio.f42743g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nio nioVar = (nio) nxqVar;
        nioVar.f42746b = i - 1;
        nioVar.f42745a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nio nioVar2 = (nio) nxlVarM18137O.f44974b;
        nioVar2.f42745a |= 2;
        nioVar2.f42747c = f;
        m10416aL(9, null, null, null, null, (nio) nxlVarM18137O.mo18103l());
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ac */
    public final void mo8158ac(int i, String str, String str2) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.MODE_SWITCH_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nkn.f43244e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nkn nknVar = (nkn) nxqVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nknVar.f43247b = i2;
        nknVar.f43246a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nkn nknVar2 = (nkn) nxqVar2;
        str.getClass();
        nknVar2.f43246a |= 4;
        nknVar2.f43249d = str;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nkn nknVar3 = (nkn) nxlVarM18137O2.f44974b;
        str2.getClass();
        nknVar3.f43246a |= 2;
        nknVar3.f43248c = str2;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nkn nknVar4 = (nkn) nxlVarM18137O2.mo18103l();
        nknVar4.getClass();
        nhoVar2.f42426H = nknVar4;
        nhoVar2.f42468b |= 1024;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ad */
    public final void mo8159ad(boolean z, float f, ikw ikwVar, int i) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CATSHARK_TOGGLE_CHANGE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nig.f42686f.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nig nigVar = (nig) nxqVar;
        nigVar.f42688a |= 1;
        nigVar.f42689b = z;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nig nigVar2 = (nig) nxlVarM18137O2.f44974b;
        nigVar2.f42688a |= 2;
        nigVar2.f42690c = f;
        int iM11411e = iku.m11411e(ikwVar);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nig nigVar3 = (nig) nxqVar2;
        nigVar3.f42691d = iM11411e - 1;
        nigVar3.f42688a |= 4;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nig nigVar4 = (nig) nxlVarM18137O2.f44974b;
        nigVar4.f42692e = i - 1;
        nigVar4.f42688a |= 8;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nig nigVar5 = (nig) nxlVarM18137O2.mo18103l();
        nigVar5.getClass();
        nhoVar2.f42450ae = nigVar5;
        nhoVar2.f42469c |= 8;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ae */
    public final void mo8160ae(int i, String str) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_SMARTS_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhw.f42560d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nhw nhwVar = (nhw) nxqVar;
        nhwVar.f42563b = i - 1;
        nhwVar.f42562a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhw nhwVar2 = (nhw) nxlVarM18137O2.f44974b;
        str.getClass();
        nhwVar2.f42562a |= 2;
        nhwVar2.f42564c = str;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhw nhwVar3 = (nhw) nxlVarM18137O2.mo18103l();
        nhwVar3.getClass();
        nhoVar2.f42431M = nhwVar3;
        nhoVar2.f42468b |= 32768;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: af */
    public final void mo8161af(long j, gyw gywVar, int i, int i2, Throwable th) {
        nxl nxlVarM18137O = nhm.f42342c.m18137O();
        int iM10418aN = m10418aN(gywVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhm nhmVar = (nhm) nxlVarM18137O.f44974b;
        nhmVar.f42345b = iM10418aN - 1;
        nhmVar.f42344a |= 2;
        nhm nhmVar2 = (nhm) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_PROFILE_ABORTED;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O3 = nhz.f42626f.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhz nhzVar = (nhz) nxlVarM18137O3.f44974b;
        nhzVar.f42628a |= 2;
        nhzVar.f42630c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O3.f44974b;
        nhz nhzVar2 = (nhz) nxqVar;
        nhzVar2.f42628a |= 4;
        nhzVar2.f42631d = jElapsedRealtimeNanos;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhz nhzVar3 = (nhz) nxlVarM18137O3.f44974b;
        nhmVar2.getClass();
        nhzVar3.f42629b = nhmVar2;
        nhzVar3.f42628a |= 1;
        nif nifVarM10417aM = m10417aM(i, i2);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhz nhzVar4 = (nhz) nxlVarM18137O3.f44974b;
        nifVarM10417aM.getClass();
        nhzVar4.f42632e = nifVarM10417aM;
        nhzVar4.f42628a |= 8;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nhz nhzVar5 = (nhz) nxlVarM18137O3.mo18103l();
        nhzVar5.getClass();
        nhoVar2.f42482p = nhzVar5;
        nhoVar2.f42445a |= 65536;
        m10421aF(nxlVarM18137O2);
        m10412aH(5, "onCaptureCanceled", j, nhmVar2);
        this.f28140B.m6227a(th instanceof doq ? (doq) th : new doq(th));
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ag */
    public final void mo8162ag(long j, gyw gywVar, int i, int i2, Throwable th) {
        nxl nxlVarM18137O = nhm.f42342c.m18137O();
        int iM10418aN = m10418aN(gywVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhm nhmVar = (nhm) nxlVarM18137O.f44974b;
        nhmVar.f42345b = iM10418aN - 1;
        nhmVar.f42344a |= 2;
        nhm nhmVar2 = (nhm) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_PROFILE_FAILED;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O3 = nib.f42643f.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nib nibVar = (nib) nxlVarM18137O3.f44974b;
        nibVar.f42645a |= 2;
        nibVar.f42647c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O3.f44974b;
        nib nibVar2 = (nib) nxqVar;
        nibVar2.f42645a |= 4;
        nibVar2.f42648d = jElapsedRealtimeNanos;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nib nibVar3 = (nib) nxlVarM18137O3.f44974b;
        nhmVar2.getClass();
        nibVar3.f42646b = nhmVar2;
        nibVar3.f42645a |= 1;
        nif nifVarM10417aM = m10417aM(i, i2);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nib nibVar4 = (nib) nxlVarM18137O3.f44974b;
        nifVarM10417aM.getClass();
        nibVar4.f42649e = nifVarM10417aM;
        nibVar4.f42645a |= 8;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nib nibVar5 = (nib) nxlVarM18137O3.mo18103l();
        nibVar5.getClass();
        nhoVar2.f42487u = nibVar5;
        nhoVar2.f42445a |= 2097152;
        m10421aF(nxlVarM18137O2);
        m10412aH(5, "onCaptureFailed", j, nhmVar2);
        this.f28140B.m6227a(th instanceof dos ? (dos) th : new dos(th));
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ah */
    public final void mo8163ah(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, List list, long j11, gyw gywVar, int i, int i2) {
        nxl nxlVarM18137O = nhm.f42342c.m18137O();
        int iM10418aN = m10418aN(gywVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhm nhmVar = (nhm) nxlVarM18137O.f44974b;
        nhmVar.f42345b = iM10418aN - 1;
        nhmVar.f42344a |= 2;
        nhm nhmVar2 = (nhm) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nie.f42666n.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nie nieVar = (nie) nxqVar;
        nieVar.f42668a |= 1;
        nieVar.f42669b = j3;
        if (j4 > 0) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar2 = (nie) nxlVarM18137O2.f44974b;
            nieVar2.f42668a |= 2;
            nieVar2.f42670c = j4;
        }
        if (j5 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar3 = (nie) nxlVarM18137O2.f44974b;
            nieVar3.f42668a |= 4;
            nieVar3.f42671d = j5;
        }
        if (j6 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar4 = (nie) nxlVarM18137O2.f44974b;
            nieVar4.f42668a |= 32768;
            nieVar4.f42680m = j6;
        }
        if (j7 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar5 = (nie) nxlVarM18137O2.f44974b;
            nieVar5.f42668a |= 512;
            nieVar5.f42674g = j7;
        }
        if (j8 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar6 = (nie) nxlVarM18137O2.f44974b;
            nieVar6.f42668a |= 1024;
            nieVar6.f42675h = j8;
        }
        if (j11 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar7 = (nie) nxlVarM18137O2.f44974b;
            nieVar7.f42668a |= 4096;
            nieVar7.f42676i = j11;
        }
        if (j9 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar8 = (nie) nxlVarM18137O2.f44974b;
            nieVar8.f42668a |= 32;
            nieVar8.f42672e = j9;
        }
        if (j10 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar9 = (nie) nxlVarM18137O2.f44974b;
            nieVar9.f42668a |= 64;
            nieVar9.f42673f = j10;
        }
        if (j > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar10 = (nie) nxlVarM18137O2.f44974b;
            nieVar10.f42668a |= 8192;
            nieVar10.f42678k = j;
        }
        if (j2 > 0) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar11 = (nie) nxlVarM18137O2.f44974b;
            nieVar11.f42668a |= 16384;
            nieVar11.f42679l = j2;
        }
        if (list != null) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nie nieVar12 = (nie) nxlVarM18137O2.f44974b;
            nxy nxyVar = nieVar12.f42677j;
            if (!nxyVar.mo17770c()) {
                nieVar12.f42677j = nxq.m18127U(nxyVar);
            }
            nwb.m17749e(list, nieVar12.f42677j);
        }
        nxl nxlVarM18137O3 = nia.f42637e.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nia niaVar = (nia) nxlVarM18137O3.f44974b;
        nie nieVar13 = (nie) nxlVarM18137O2.mo18103l();
        nieVar13.getClass();
        niaVar.f42641c = nieVar13;
        niaVar.f42639a |= 2;
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nia niaVar2 = (nia) nxlVarM18137O3.f44974b;
        nhmVar2.getClass();
        niaVar2.f42640b = nhmVar2;
        niaVar2.f42639a |= 1;
        nif nifVarM10417aM = m10417aM(i, i2);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nia niaVar3 = (nia) nxlVarM18137O3.f44974b;
        nifVarM10417aM.getClass();
        niaVar3.f42642d = nifVarM10417aM;
        niaVar3.f42639a |= 4;
        nia niaVar4 = (nia) nxlVarM18137O3.mo18103l();
        nxl nxlVarM18137O4 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_PROFILE;
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O4.f44974b;
        nho nhoVar = (nho) nxqVar2;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O4.f44974b;
        niaVar4.getClass();
        nhoVar2.f42481o = niaVar4;
        nhoVar2.f42445a |= 32768;
        m10421aF(nxlVarM18137O4);
        m10412aH(4, "onCapturePersisted", j3, nhmVar2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ai */
    public final void mo8164ai(long j, gyw gywVar, int i, int i2) {
        nxl nxlVarM18137O = nhm.f42342c.m18137O();
        int iM10418aN = m10418aN(gywVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhm nhmVar = (nhm) nxlVarM18137O.f44974b;
        nhmVar.f42345b = iM10418aN - 1;
        nhmVar.f42344a |= 2;
        nhm nhmVar2 = (nhm) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_PROFILE_START_COMMITTED;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O3 = nic.f42650f.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nic nicVar = (nic) nxlVarM18137O3.f44974b;
        nicVar.f42652a |= 2;
        nicVar.f42654c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O3.f44974b;
        nic nicVar2 = (nic) nxqVar;
        nicVar2.f42652a |= 4;
        nicVar2.f42655d = jElapsedRealtimeNanos;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nic nicVar3 = (nic) nxlVarM18137O3.f44974b;
        nhmVar2.getClass();
        nicVar3.f42653b = nhmVar2;
        nicVar3.f42652a |= 1;
        nif nifVarM10417aM = m10417aM(i, i2);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nic nicVar4 = (nic) nxlVarM18137O3.f44974b;
        nifVarM10417aM.getClass();
        nicVar4.f42656e = nifVarM10417aM;
        nicVar4.f42652a |= 8;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nic nicVar5 = (nic) nxlVarM18137O3.mo18103l();
        nicVar5.getClass();
        nhoVar2.f42488v = nicVar5;
        nhoVar2.f42445a |= 4194304;
        m10421aF(nxlVarM18137O2);
        m10412aH(4, "onCaptureStartCommitted", j, nhmVar2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aj */
    public final void mo8165aj(int i) {
        if (i == 3) {
            this.f28164y = 3;
            return;
        }
        int i2 = this.f28164y;
        if (i2 != 1) {
            i = i2;
        }
        this.f28164y = 1;
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ENTER_STORAGE_PREFERENCE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nir.f42764c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nir nirVar = (nir) nxlVarM18137O2.f44974b;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        nirVar.f42767b = i3;
        nirVar.f42766a |= 1;
        nir nirVar2 = (nir) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nirVar2.getClass();
        nhoVar2.f42451af = nirVar2;
        nhoVar2.f42469c |= 16;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ak */
    public final void mo8166ak(long j, long j2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        nxl nxlVarM18137O = njl.f43018l.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njl njlVar = (njl) nxqVar;
        njlVar.f43020a |= 1;
        njlVar.f43021b = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njl njlVar2 = (njl) nxqVar2;
        njlVar2.f43020a |= 2;
        njlVar2.f43022c = j2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njl njlVar3 = (njl) nxqVar3;
        njlVar3.f43020a |= 4;
        njlVar3.f43023d = z;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        njl njlVar4 = (njl) nxqVar4;
        njlVar4.f43020a |= 8;
        njlVar4.f43024e = i;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        njl njlVar5 = (njl) nxqVar5;
        njlVar5.f43020a |= 16;
        njlVar5.f43025f = i2;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O.f44974b;
        njl njlVar6 = (njl) nxqVar6;
        njlVar6.f43020a |= 32;
        njlVar6.f43026g = i3;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar7 = nxlVarM18137O.f44974b;
        njl njlVar7 = (njl) nxqVar7;
        njlVar7.f43020a |= 64;
        njlVar7.f43027h = i4;
        if (!nxqVar7.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar8 = nxlVarM18137O.f44974b;
        njl njlVar8 = (njl) nxqVar8;
        njlVar8.f43020a |= 256;
        njlVar8.f43029j = i6;
        if (!nxqVar8.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar9 = nxlVarM18137O.f44974b;
        njl njlVar9 = (njl) nxqVar9;
        njlVar9.f43020a |= 512;
        njlVar9.f43030k = i7;
        if (i5 != 0) {
            if (!nxqVar9.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njl njlVar10 = (njl) nxlVarM18137O.f44974b;
            njlVar10.f43028i = i5 - 1;
            njlVar10.f43020a |= 128;
        }
        if (z) {
            this.f28151k = hcf.m10102b(this.f28149i);
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.HAL_UPDATE_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar10 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar10;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar10.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        njl njlVar11 = (njl) nxlVarM18137O.mo18103l();
        njlVar11.getClass();
        nhoVar2.f42456ak = njlVar11;
        nhoVar2.f42469c |= 1024;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: al */
    public final void mo8167al(int i, long j, long j2, int i2, int i3) {
        nxl nxlVarM18137O = njo.f43047g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njo njoVar = (njo) nxqVar;
        njoVar.f43050b = i - 1;
        njoVar.f43049a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njo njoVar2 = (njo) nxqVar2;
        njoVar2.f43049a |= 2;
        njoVar2.f43051c = j;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njo njoVar3 = (njo) nxqVar3;
        njoVar3.f43049a |= 4;
        njoVar3.f43052d = j2;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        njo njoVar4 = (njo) nxqVar4;
        njoVar4.f43049a |= 16;
        njoVar4.f43054f = i3;
        if (i2 != 0) {
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            njo njoVar5 = (njo) nxlVarM18137O.f44974b;
            njoVar5.f43053e = i2 - 1;
            njoVar5.f43049a |= 8;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.IN_APP_UPDATE_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar5;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        njo njoVar6 = (njo) nxlVarM18137O.mo18103l();
        njoVar6.getClass();
        nhoVar2.f42453ah = njoVar6;
        nhoVar2.f42469c |= 128;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: am */
    public final void mo8168am(int i, float f, ikw ikwVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CUTTLEFISH_BONE_OPTION_CHANGE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nij.f42712e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nij nijVar = (nij) nxqVar;
        nijVar.f42715b = i - 1;
        nijVar.f42714a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nij nijVar2 = (nij) nxlVarM18137O2.f44974b;
        nijVar2.f42714a |= 2;
        nijVar2.f42716c = f;
        int iM11411e = iku.m11411e(ikwVar);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nij nijVar3 = (nij) nxlVarM18137O2.f44974b;
        nijVar3.f42717d = iM11411e - 1;
        nijVar3.f42714a |= 4;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nij nijVar4 = (nij) nxlVarM18137O2.mo18103l();
        nijVar4.getClass();
        nhoVar2.f42462aq = nijVar4;
        nhoVar2.f42469c |= 65536;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: an */
    public final void mo8169an(int i, long j) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ZOOM_LOCK_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nmn.f43857d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nmn nmnVar = (nmn) nxqVar;
        nmnVar.f43860b = i - 1;
        nmnVar.f43859a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nmn nmnVar2 = (nmn) nxlVarM18137O2.f44974b;
        nmnVar2.f43859a |= 2;
        nmnVar2.f43861c = j;
        nmn nmnVar3 = (nmn) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nmnVar3.getClass();
        nhoVar2.f42454ai = nmnVar3;
        nhoVar2.f42469c |= 256;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ao */
    public final void mo8170ao(int i) {
        this.f28139A = i;
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ap */
    public final void mo8171ap(int i, boolean z, int i2) {
        nxl nxlVarM18137O = nlw.f43692f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nlw nlwVar = (nlw) nxqVar;
        nlwVar.f43695b = 1;
        nlwVar.f43694a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nlw nlwVar2 = (nlw) nxqVar2;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        nlwVar2.f43696c = i3;
        nlwVar2.f43694a |= 2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nlw nlwVar3 = (nlw) nxqVar3;
        nlwVar3.f43694a |= 4;
        nlwVar3.f43697d = i2;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlw nlwVar4 = (nlw) nxlVarM18137O.f44974b;
        nlwVar4.f43694a |= 8;
        nlwVar4.f43698e = z;
        nlw nlwVar5 = (nlw) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.SYSTEM_SERVICE_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar4;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nlwVar5.getClass();
        nhoVar2.f42446aa = nlwVar5;
        nhoVar2.f42468b |= Integer.MIN_VALUE;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aq */
    public final void mo8172aq(int i, int i2, float f, kmq kmqVar) {
        nxl nxlVarM18137O = nhf.f42299f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nhf nhfVar = (nhf) nxqVar;
        nhfVar.f42302b = i - 1;
        nhfVar.f42301a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nhf nhfVar2 = (nhf) nxqVar2;
        nhfVar2.f42303c = i2 - 1;
        nhfVar2.f42301a |= 2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhf nhfVar3 = (nhf) nxlVarM18137O.f44974b;
        nhfVar3.f42301a |= 4;
        nhfVar3.f42304d = f;
        nhl nhlVarM10414aJ = m10414aJ(kmqVar);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhf nhfVar4 = (nhf) nxlVarM18137O.f44974b;
        nhfVar4.f42305e = nhlVarM10414aJ.f42341d;
        nhfVar4.f42301a |= 16;
        m10416aL(12, null, null, (nhf) nxlVarM18137O.mo18103l(), null, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ar */
    public final void mo8173ar(int i, boolean z) {
        nxl nxlVarM18137O = nlo.f43558d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nlo nloVar = (nlo) nxqVar;
        nloVar.f43561b = i - 1;
        nloVar.f43560a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlo nloVar2 = (nlo) nxlVarM18137O.f44974b;
        nloVar2.f43560a |= 2;
        nloVar2.f43562c = z;
        m10416aL(8, null, (nlo) nxlVarM18137O.mo18103l(), null, null, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: as */
    public final void mo8174as(int i, kmq kmqVar, boolean z, boolean z2, nmi nmiVar, int i2, boolean z3, mrm mrmVar, nim nimVar) {
        this.f28157r = SystemClock.elapsedRealtime();
        bkn bknVar = new bkn(i, kmqVar == kmq.f36557a);
        bknVar.m2574X(true != z ? 2 : 4);
        bknVar.m2567Q(z2);
        bknVar.m2571U(nmiVar);
        bknVar.m2575Y(i2);
        bknVar.m2568R(z3);
        bknVar.m2565O(nimVar);
        if (mrmVar.mo16813g()) {
            bknVar.m2569S((nkk) mrmVar.mo16809c());
        }
        int i3 = this.f28139A;
        if (i3 != 1) {
            bknVar.m2573W(i3);
            this.f28139A = 1;
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: at */
    public final void mo8175at(final int i, final int i2, final int i3, final boolean z, final boolean z2, final boolean z3) {
        final long jLongValue = Long.valueOf(SystemClock.uptimeMillis() - Process.getStartUptimeMillis()).longValue();
        m10413aI(new msi() { // from class: hkg
            @Override // p000.msi
            /* JADX INFO: renamed from: a */
            public final Object mo6051a() {
                hkh hkhVar = this.f28130a;
                int i4 = i;
                int i5 = i3;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                long j = jLongValue;
                int i6 = i2;
                nxl nxlVarM18137O = njd.f42878l.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                njd njdVar = (njd) nxqVar;
                njdVar.f42881b = i4 - 1;
                njdVar.f42880a |= 1;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                njd njdVar2 = (njd) nxqVar2;
                njdVar2.f42882c = i5 - 1;
                njdVar2.f42880a |= 32;
                String str = hkhVar.f28145e;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar3 = nxlVarM18137O.f44974b;
                njd njdVar3 = (njd) nxqVar3;
                str.getClass();
                njdVar3.f42880a |= 64;
                njdVar3.f42883d = str;
                if (!nxqVar3.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar4 = nxlVarM18137O.f44974b;
                njd njdVar4 = (njd) nxqVar4;
                njdVar4.f42880a |= 128;
                njdVar4.f42884e = z4;
                if (!nxqVar4.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar5 = nxlVarM18137O.f44974b;
                njd njdVar5 = (njd) nxqVar5;
                njdVar5.f42880a |= 256;
                njdVar5.f42885f = z5;
                if (!nxqVar5.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar6 = nxlVarM18137O.f44974b;
                njd njdVar6 = (njd) nxqVar6;
                njdVar6.f42880a |= 512;
                njdVar6.f42886g = z6;
                if (!nxqVar6.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar7 = nxlVarM18137O.f44974b;
                njd njdVar7 = (njd) nxqVar7;
                njdVar7.f42880a |= 1024;
                njdVar7.f42887h = 0L;
                if (!nxqVar7.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar8 = nxlVarM18137O.f44974b;
                njd njdVar8 = (njd) nxqVar8;
                njdVar8.f42880a |= 8192;
                njdVar8.f42890k = j;
                if (!nxqVar8.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njd njdVar9 = (njd) nxlVarM18137O.f44974b;
                njdVar9.f42888i = i6 - 1;
                njdVar9.f42880a |= 2048;
                if (!hkhVar.f28150j.getAndSet(true)) {
                    nhc nhcVar = null;
                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) hkhVar.f28149i.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(null, 0, 1);
                    if (!historicalProcessExitReasons.isEmpty()) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
                        long startUptimeMillis = (Process.getStartUptimeMillis() + (System.currentTimeMillis() - SystemClock.uptimeMillis())) - applicationExitInfo.getTimestamp();
                        nxl nxlVarM18137O2 = nhc.f42281h.m18137O();
                        int importance = applicationExitInfo.getImportance();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nhc nhcVar2 = (nhc) nxlVarM18137O2.f44974b;
                        nhcVar2.f42283a |= 4;
                        nhcVar2.f42286d = importance;
                        long pss = applicationExitInfo.getPss();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nhc nhcVar3 = (nhc) nxlVarM18137O2.f44974b;
                        nhcVar3.f42283a |= 8;
                        nhcVar3.f42287e = pss;
                        long rss = applicationExitInfo.getRss();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar9 = nxlVarM18137O2.f44974b;
                        nhc nhcVar4 = (nhc) nxqVar9;
                        nhcVar4.f42283a |= 16;
                        nhcVar4.f42288f = rss;
                        if (!nxqVar9.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nhc nhcVar5 = (nhc) nxlVarM18137O2.f44974b;
                        nhcVar5.f42283a |= 32;
                        nhcVar5.f42289g = startUptimeMillis;
                        int iM17404r = nea.m17404r(applicationExitInfo.getReason());
                        if (iM17404r != 0) {
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nhc nhcVar6 = (nhc) nxlVarM18137O2.f44974b;
                            nhcVar6.f42284b = iM17404r - 1;
                            nhcVar6.f42283a |= 1;
                        } else {
                            int reason = applicationExitInfo.getReason();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nhc nhcVar7 = (nhc) nxlVarM18137O2.f44974b;
                            nhcVar7.f42283a |= 2;
                            nhcVar7.f42285c = reason;
                        }
                        nhcVar = (nhc) nxlVarM18137O2.mo18103l();
                    }
                    if (nhcVar != null) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        njd njdVar10 = (njd) nxlVarM18137O.f44974b;
                        njdVar10.f42889j = nhcVar;
                        njdVar10.f42880a |= 4096;
                    }
                }
                nxl nxlVarM18137O3 = nho.f42417av.m18137O();
                nhn nhnVar = nhn.FOREGROUND_EVENT;
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar10 = nxlVarM18137O3.f44974b;
                nho nhoVar = (nho) nxqVar10;
                nhoVar.f42470d = nhnVar.f42416ar;
                nhoVar.f42445a |= 1;
                if (!nxqVar10.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nho nhoVar2 = (nho) nxlVarM18137O3.f44974b;
                njd njdVar11 = (njd) nxlVarM18137O.mo18103l();
                njdVar11.getClass();
                nhoVar2.f42475i = njdVar11;
                nhoVar2.f42445a |= 64;
                return nxlVarM18137O3;
            }
        });
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: au */
    public final void mo8176au(int i, int i2, float f, float f2) {
        bkn bknVar = new bkn(i, false);
        bknVar.m2572V(1.0f);
        bknVar.m2570T(f);
        if (i == 12) {
            nxl nxlVarM18137O = nkz.f43429d.m18137O();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nkz nkzVar = (nkz) nxqVar;
            nkzVar.f43432b = i2 - 1;
            nkzVar.f43431a |= 1;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkz nkzVar2 = (nkz) nxlVarM18137O.f44974b;
            nkzVar2.f43431a |= 2;
            nkzVar2.f43433c = f2;
            nkz nkzVar3 = (nkz) nxlVarM18137O.mo18103l();
            if (nkzVar3 != null) {
                nxl nxlVar = (nxl) bknVar.f3651a;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nhy nhyVar = (nhy) nxlVar.f44974b;
                nhy nhyVar2 = nhy.f42573Z;
                nhyVar.f42615p = nkzVar3;
                nhyVar.f42600a |= 65536;
            }
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: av */
    public final void mo8177av(int i, fcw fcwVar, ExifInterface exifInterface, boolean z, Float f, List list, nki nkiVar, int i2, fcy fcyVar, Long l, Integer num, nkm nkmVar, niw niwVar, nil nilVar, nlg nlgVar, nhd nhdVar, niv nivVar, Long l2, Long l3, boolean z2, boolean z3, nmo nmoVar, nhg nhgVar, nhe nheVar, niz nizVar, nkr nkrVar, nku nkuVar, boolean z4, boolean z5) {
        int i3;
        List list2 = list;
        this.f28157r = SystemClock.elapsedRealtime();
        nxl nxlVarM18137O = nla.f43436d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nla nlaVar = (nla) nxlVarM18137O.f44974b;
        nlaVar.f43438a |= 2;
        nlaVar.f43439b = z;
        if (l2 == null) {
            ((nbe) ((nbe) f28138m.m17252c()).mo17276G((char) 3722)).mo17290o("Submitting log event with zero file size");
        }
        long jLongValue = l2 != null ? l2.longValue() / 1024 : 0L;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nla nlaVar2 = (nla) nxlVarM18137O.f44974b;
        nlaVar2.f43438a |= 4;
        nlaVar2.f43440c = jLongValue;
        bkn bknVar = new bkn(i, fcwVar.f21313a);
        bknVar.m2566P(exifInterface);
        bknVar.m2572V(fcwVar.f21314b);
        String str = fcwVar.f21315c;
        if (str != null) {
            if (str.equals("off")) {
                i3 = 2;
            } else if (str.equals("auto")) {
                i3 = 3;
            } else {
                i3 = (str.equals("on") || str.equals("torch")) ? 4 : 1;
            }
            nxl nxlVar = (nxl) bknVar.f3651a;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nhy nhyVar = (nhy) nxlVar.f44974b;
            nhy nhyVar2 = nhy.f42573Z;
            nhyVar.f42609j = i3 - 1;
            nhyVar.f42600a |= 256;
        }
        boolean z6 = fcwVar.f21316d;
        nxl nxlVar2 = (nxl) bknVar.f3651a;
        if (!nxlVar2.f44974b.m18142ac()) {
            nxlVar2.mo18106p();
        }
        nhy nhyVar3 = (nhy) nxlVar2.f44974b;
        nhy nhyVar4 = nhy.f42573Z;
        nhyVar3.f42601b |= 268435456;
        nhyVar3.f42599Y = z6;
        bknVar.m2567Q(fcwVar.f21317e);
        boolean z7 = fcwVar.f21318f;
        nxl nxlVar3 = (nxl) bknVar.f3651a;
        if (!nxlVar3.f44974b.m18142ac()) {
            nxlVar3.mo18106p();
        }
        nhy nhyVar5 = (nhy) nxlVar3.f44974b;
        nhyVar5.f42601b |= 64;
        nhyVar5.f42579E = z7;
        float f2 = fcwVar.f21319g;
        nxl nxlVar4 = (nxl) bknVar.f3651a;
        if (!nxlVar4.f44974b.m18142ac()) {
            nxlVar4.mo18106p();
        }
        nhy nhyVar6 = (nhy) nxlVar4.f44974b;
        nhyVar6.f42600a |= 128;
        nhyVar6.f42608i = f2;
        nla nlaVar3 = (nla) nxlVarM18137O.mo18103l();
        if (nlaVar3 != null) {
            nxl nxlVar5 = (nxl) bknVar.f3651a;
            if (!nxlVar5.f44974b.m18142ac()) {
                nxlVar5.mo18106p();
            }
            nhy nhyVar7 = (nhy) nxlVar5.f44974b;
            nhyVar7.f42612m = nlaVar3;
            nhyVar7.f42600a |= 4096;
        }
        bknVar.m2570T(f.floatValue());
        boolean zBooleanValue = fcwVar.f21320h.booleanValue();
        nxl nxlVar6 = (nxl) bknVar.f3651a;
        if (!nxlVar6.f44974b.m18142ac()) {
            nxlVar6.mo18106p();
        }
        nhy nhyVar8 = (nhy) nxlVar6.f44974b;
        nhyVar8.f42600a |= 512;
        nhyVar8.f42610k = zBooleanValue;
        nxl nxlVar7 = (nxl) bknVar.f3651a;
        if (!nxlVar7.f44974b.m18142ac()) {
            nxlVar7.mo18106p();
        }
        nhy nhyVar9 = (nhy) nxlVar7.f44974b;
        nhyVar9.f42619t = i2 - 1;
        nhyVar9.f42600a |= 67108864;
        boolean zBooleanValue2 = fcwVar.f21323k.booleanValue();
        nxl nxlVar8 = (nxl) bknVar.f3651a;
        if (!nxlVar8.f44974b.m18142ac()) {
            nxlVar8.mo18106p();
        }
        nhy nhyVar10 = (nhy) nxlVar8.f44974b;
        nhyVar10.f42601b |= 4;
        nhyVar10.f42575A = zBooleanValue2;
        int i4 = fcwVar.f21332t;
        nxl nxlVar9 = (nxl) bknVar.f3651a;
        if (!nxlVar9.f44974b.m18142ac()) {
            nxlVar9.mo18106p();
        }
        nhy nhyVar11 = (nhy) nxlVar9.f44974b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        nhyVar11.f42576B = i5;
        nhyVar11.f42601b |= 8;
        nip nipVar = fcwVar.f21324l;
        nxl nxlVar10 = (nxl) bknVar.f3651a;
        if (!nxlVar10.f44974b.m18142ac()) {
            nxlVar10.mo18106p();
        }
        nhy nhyVar12 = (nhy) nxlVar10.f44974b;
        nipVar.getClass();
        nhyVar12.f42580F = nipVar;
        nhyVar12.f42601b |= 128;
        nxl nxlVar11 = (nxl) bknVar.f3651a;
        if (!nxlVar11.f44974b.m18142ac()) {
            nxlVar11.mo18106p();
        }
        nhy nhyVar13 = (nhy) nxlVar11.f44974b;
        nhyVar13.f42601b |= 256;
        nhyVar13.f42581G = z2;
        nxl nxlVar12 = (nxl) bknVar.f3651a;
        if (!nxlVar12.f44974b.m18142ac()) {
            nxlVar12.mo18106p();
        }
        nhy nhyVar14 = (nhy) nxlVar12.f44974b;
        nhyVar14.f42601b |= 512;
        nhyVar14.f42582H = z3;
        nji njiVar = fcwVar.f21326n;
        nxl nxlVar13 = (nxl) bknVar.f3651a;
        if (!nxlVar13.f44974b.m18142ac()) {
            nxlVar13.mo18106p();
        }
        nhy nhyVar15 = (nhy) nxlVar13.f44974b;
        njiVar.getClass();
        nhyVar15.f42584J = njiVar;
        nhyVar15.f42601b |= 2048;
        bknVar.m2568R(z4);
        nxl nxlVar14 = (nxl) bknVar.f3651a;
        if (!nxlVar14.f44974b.m18142ac()) {
            nxlVar14.mo18106p();
        }
        nhy nhyVar16 = (nhy) nxlVar14.f44974b;
        nhyVar16.f42601b |= 4194304;
        nhyVar16.f42593S = z5;
        bknVar.m2565O(fcwVar.f21328p);
        boolean z8 = fcwVar.f21329q;
        nxl nxlVar15 = (nxl) bknVar.f3651a;
        if (!nxlVar15.f44974b.m18142ac()) {
            nxlVar15.mo18106p();
        }
        nhy nhyVar17 = (nhy) nxlVar15.f44974b;
        nhyVar17.f42601b |= 33554432;
        nhyVar17.f42596V = z8;
        if (fcwVar.f21325m.mo16813g()) {
            bknVar.m2569S((nkk) fcwVar.f21325m.mo16809c());
        }
        if (nkiVar != null) {
            nxl nxlVar16 = (nxl) bknVar.f3651a;
            if (!nxlVar16.f44974b.m18142ac()) {
                nxlVar16.mo18106p();
            }
            nhy nhyVar18 = (nhy) nxlVar16.f44974b;
            nhyVar18.f42617r = nkiVar;
            nhyVar18.f42600a |= 2097152;
        }
        if (list2 != null) {
            Rect rect = fcwVar.f21321i;
            nxl nxlVar17 = (nxl) bknVar.f3651a;
            if (!nxlVar17.f44974b.m18142ac()) {
                nxlVar17.mo18106p();
            }
            ((nhy) nxlVar17.f44974b).f42611l = nzg.f45063b;
            int iMin = Math.min(5, list.size());
            int i6 = 0;
            while (i6 < iMin) {
                Object obj = bknVar.f3651a;
                kpe kpeVar = ((kpm) list2.get(i6)).f36801a;
                Rect rect2 = kpeVar.f36797c;
                nxl nxlVarM18137O2 = niu.f42792i.m18137O();
                int i7 = iMin;
                float f3 = rect2.left;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                niu niuVar = (niu) nxlVarM18137O2.f44974b;
                niuVar.f42794a |= 1;
                niuVar.f42795b = f3;
                float f4 = rect2.top;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                niu niuVar2 = (niu) nxlVarM18137O2.f44974b;
                niuVar2.f42794a |= 4;
                niuVar2.f42797d = f4;
                float f5 = rect2.right;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                niu niuVar3 = (niu) nxlVarM18137O2.f44974b;
                niuVar3.f42794a |= 2;
                niuVar3.f42796c = f5;
                float f6 = rect2.bottom;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                niu niuVar4 = (niu) nxqVar;
                niuVar4.f42794a |= 8;
                niuVar4.f42798e = f6;
                float f7 = kpeVar.f36796b;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                niu niuVar5 = (niu) nxlVarM18137O2.f44974b;
                niuVar5.f42794a |= 64;
                niuVar5.f42801h = f7;
                if (rect != null) {
                    float f8 = rect.right;
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    niu niuVar6 = (niu) nxlVarM18137O2.f44974b;
                    niuVar6.f42794a |= 16;
                    niuVar6.f42799f = f8;
                    float f9 = rect.bottom;
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    niu niuVar7 = (niu) nxlVarM18137O2.f44974b;
                    niuVar7.f42794a |= 32;
                    niuVar7.f42800g = f9;
                }
                niu niuVar8 = (niu) nxlVarM18137O2.mo18103l();
                nxl nxlVar18 = (nxl) obj;
                if (!nxlVar18.f44974b.m18142ac()) {
                    nxlVar18.mo18106p();
                }
                nhy nhyVar19 = (nhy) nxlVar18.f44974b;
                niuVar8.getClass();
                nxy nxyVar = nhyVar19.f42611l;
                if (!nxyVar.mo17770c()) {
                    nhyVar19.f42611l = nxq.m18127U(nxyVar);
                }
                nhyVar19.f42611l.add(niuVar8);
                i6++;
                iMin = i7;
                list2 = list;
            }
        }
        if (fcyVar != null) {
            Object obj2 = bknVar.f3651a;
            njk njkVar = ((ebp) fcyVar).f13274a;
            nxl nxlVar19 = (nxl) obj2;
            if (!nxlVar19.f44974b.m18142ac()) {
                nxlVar19.mo18106p();
            }
            nhy nhyVar20 = (nhy) nxlVar19.f44974b;
            njkVar.getClass();
            nhyVar20.f42614o = njkVar;
            nhyVar20.f42600a |= 16384;
        }
        if (l != null) {
            nxl nxlVarM18137O3 = nmi.f43795D.m18137O();
            long jLongValue2 = l.longValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nmi nmiVar = (nmi) nxlVarM18137O3.f44974b;
            nmiVar.f43800a |= 2;
            nmiVar.f43802c = jLongValue2;
            bknVar.m2571U((nmi) nxlVarM18137O3.mo18103l());
        }
        if (num != null) {
            int iIntValue = num.intValue();
            nxl nxlVar20 = (nxl) bknVar.f3651a;
            if (!nxlVar20.f44974b.m18142ac()) {
                nxlVar20.mo18106p();
            }
            nhy nhyVar21 = (nhy) nxlVar20.f44974b;
            nhyVar21.f42600a |= 33554432;
            nhyVar21.f42618s = iIntValue;
        }
        if (nkmVar != null) {
            nxl nxlVar21 = (nxl) bknVar.f3651a;
            if (!nxlVar21.f44974b.m18142ac()) {
                nxlVar21.mo18106p();
            }
            nhy nhyVar22 = (nhy) nxlVar21.f44974b;
            nhyVar22.f42620u = nkmVar;
            nhyVar22.f42600a |= 134217728;
        }
        if (niwVar != null) {
            nxl nxlVar22 = (nxl) bknVar.f3651a;
            if (!nxlVar22.f44974b.m18142ac()) {
                nxlVar22.mo18106p();
            }
            nhy nhyVar23 = (nhy) nxlVar22.f44974b;
            nhyVar23.f42621v = niwVar;
            nhyVar23.f42600a |= 268435456;
        }
        if (nilVar != null) {
            nxl nxlVar23 = (nxl) bknVar.f3651a;
            if (!nxlVar23.f44974b.m18142ac()) {
                nxlVar23.mo18106p();
            }
            nhy nhyVar24 = (nhy) nxlVar23.f44974b;
            nhyVar24.f42591Q = nilVar;
            nhyVar24.f42601b |= 524288;
        }
        if (nlgVar != null) {
            nxl nxlVar24 = (nxl) bknVar.f3651a;
            if (!nxlVar24.f44974b.m18142ac()) {
                nxlVar24.mo18106p();
            }
            nhy nhyVar25 = (nhy) nxlVar24.f44974b;
            nhyVar25.f42622w = nlgVar;
            nhyVar25.f42600a |= 536870912;
        }
        if (nivVar != null) {
            nxl nxlVar25 = (nxl) bknVar.f3651a;
            if (!nxlVar25.f44974b.m18142ac()) {
                nxlVar25.mo18106p();
            }
            nhy nhyVar26 = (nhy) nxlVar25.f44974b;
            nhyVar26.f42624y = nivVar;
            nhyVar26.f42600a |= Integer.MIN_VALUE;
        }
        if (nhdVar != null) {
            nxl nxlVar26 = (nxl) bknVar.f3651a;
            if (!nxlVar26.f44974b.m18142ac()) {
                nxlVar26.mo18106p();
            }
            nhy nhyVar27 = (nhy) nxlVar26.f44974b;
            nhyVar27.f42578D = nhdVar;
            nhyVar27.f42601b |= 32;
        }
        if (nhgVar != null) {
            nxl nxlVar27 = (nxl) bknVar.f3651a;
            if (!nxlVar27.f44974b.m18142ac()) {
                nxlVar27.mo18106p();
            }
            nhy nhyVar28 = (nhy) nxlVar27.f44974b;
            nhyVar28.f42587M = nhgVar;
            nhyVar28.f42601b |= 32768;
        }
        if (nheVar != null) {
            nxl nxlVar28 = (nxl) bknVar.f3651a;
            if (!nxlVar28.f44974b.m18142ac()) {
                nxlVar28.mo18106p();
            }
            nhy nhyVar29 = (nhy) nxlVar28.f44974b;
            nhyVar29.f42588N = nheVar;
            nhyVar29.f42601b |= 65536;
        }
        if (nizVar != null) {
            nxl nxlVar29 = (nxl) bknVar.f3651a;
            if (!nxlVar29.f44974b.m18142ac()) {
                nxlVar29.mo18106p();
            }
            nhy nhyVar30 = (nhy) nxlVar29.f44974b;
            nhyVar30.f42590P = nizVar;
            nhyVar30.f42601b |= 262144;
        }
        if (nkrVar != null) {
            nxl nxlVar30 = (nxl) bknVar.f3651a;
            if (!nxlVar30.f44974b.m18142ac()) {
                nxlVar30.mo18106p();
            }
            nhy nhyVar31 = (nhy) nxlVar30.f44974b;
            nhyVar31.f42592R = nkrVar;
            nhyVar31.f42601b |= 2097152;
        }
        if (nkuVar != null) {
            nxl nxlVar31 = (nxl) bknVar.f3651a;
            if (!nxlVar31.f44974b.m18142ac()) {
                nxlVar31.mo18106p();
            }
            nhy nhyVar32 = (nhy) nxlVar31.f44974b;
            nhyVar32.f42598X = nkuVar;
            nhyVar32.f42601b = 134217728 | nhyVar32.f42601b;
        }
        int i8 = this.f28139A;
        if (i8 != 1) {
            bknVar.m2573W(i8);
            this.f28139A = 1;
        }
        if (l3 != null) {
            nxl nxlVarM18137O4 = nie.f42666n.m18137O();
            long jLongValue3 = l3.longValue();
            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                nxlVarM18137O4.mo18106p();
            }
            nie nieVar = (nie) nxlVarM18137O4.f44974b;
            nieVar.f42668a |= 1;
            nieVar.f42669b = jLongValue3;
            nie nieVar2 = (nie) nxlVarM18137O4.mo18103l();
            nxl nxlVar32 = (nxl) bknVar.f3651a;
            if (!nxlVar32.f44974b.m18142ac()) {
                nxlVar32.mo18106p();
            }
            nhy nhyVar33 = (nhy) nxlVar32.f44974b;
            nieVar2.getClass();
            nhyVar33.f42616q = nieVar2;
            nhyVar33.f42600a = 524288 | nhyVar33.f42600a;
        }
        if (nmoVar != null) {
            nxl nxlVar33 = (nxl) bknVar.f3651a;
            if (!nxlVar33.f44974b.m18142ac()) {
                nxlVar33.mo18106p();
            }
            nhy nhyVar34 = (nhy) nxlVar33.f44974b;
            nhyVar34.f42586L = nmoVar;
            nhyVar34.f42601b |= 8192;
        }
        if (fcwVar.f21330r.mo16813g()) {
            njm njmVar = (njm) fcwVar.f21330r.mo16809c();
            nxl nxlVar34 = (nxl) bknVar.f3651a;
            if (!nxlVar34.f44974b.m18142ac()) {
                nxlVar34.mo18106p();
            }
            nhy nhyVar35 = (nhy) nxlVar34.f44974b;
            nhyVar35.f42597W = njmVar;
            nhyVar35.f42601b |= 67108864;
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: aw */
    public final void mo8178aw(int i, kmq kmqVar, keg kegVar, float f, boolean z, float f2, nmj nmjVar, int i2, boolean z2) {
        this.f28157r = SystemClock.elapsedRealtime();
        bkn bknVar = new bkn(i, kmqVar == kmq.f36557a);
        bknVar.m2572V(f);
        bknVar.m2574X(true != z ? 2 : 4);
        bknVar.m2570T(f2);
        bknVar.m2575Y(i2);
        nxl nxlVar = (nxl) bknVar.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nmjVar.getClass();
        nhyVar.f42583I = nmjVar;
        nhyVar.f42601b |= 1024;
        bknVar.m2568R(z2);
        if (kegVar != null) {
            bknVar.m2566P(kegVar);
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ax */
    public final void mo8179ax() {
        m10416aL(6, null, null, null, null, null);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: ay */
    public final void mo8180ay(int i, long j, long j2, float f, boolean z) {
        bkn bknVar = new bkn(23, false);
        bknVar.m2572V(1.0f);
        nxl nxlVarM18137O = njn.f43038h.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njn njnVar = (njn) nxqVar;
        njnVar.f43041b = i - 1;
        njnVar.f43040a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njn njnVar2 = (njn) nxqVar2;
        njnVar2.f43040a |= 256;
        njnVar2.f43045f = j;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njn njnVar3 = (njn) nxqVar3;
        njnVar3.f43040a |= 512;
        njnVar3.f43046g = j2;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        njn njnVar4 = (njn) nxqVar4;
        njnVar4.f43040a |= 64;
        njnVar4.f43043d = z;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        njn njnVar5 = (njn) nxqVar5;
        njnVar5.f43044e = 2;
        njnVar5.f43040a |= 128;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njn njnVar6 = (njn) nxlVarM18137O.f44974b;
        njnVar6.f43040a |= 32;
        njnVar6.f43042c = f;
        njn njnVar7 = (njn) nxlVarM18137O.mo18103l();
        if (njnVar7 != null) {
            nxl nxlVar = (nxl) bknVar.f3651a;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nhy nhyVar = (nhy) nxlVar.f44974b;
            nhy nhyVar2 = nhy.f42573Z;
            nhyVar.f42623x = njnVar7;
            nhyVar.f42600a |= 1073741824;
        }
        m10422aG(bknVar);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: az */
    public final void mo8181az() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.EDUCATION_TOAST_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nme.f43762c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nme nmeVar = (nme) nxlVarM18137O2.f44974b;
        nmeVar.f43765b = 1;
        nmeVar.f43764a = 1 | nmeVar.f43764a;
        nme nmeVar2 = (nme) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nmeVar2.getClass();
        nhoVar2.f42443Y = nmeVar2;
        nhoVar2.f42468b |= 536870912;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: b */
    public final void mo8182b(String str, List list, long j) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ACTIVE_CAMERA_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = ngz.f42267e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        ngz ngzVar = (ngz) nxqVar;
        str.getClass();
        ngzVar.f42269a |= 1;
        ngzVar.f42270b = str;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ngz ngzVar2 = (ngz) nxlVarM18137O2.f44974b;
        nxy nxyVar = ngzVar2.f42271c;
        if (!nxyVar.mo17770c()) {
            ngzVar2.f42271c = nxq.m18127U(nxyVar);
        }
        nwb.m17749e(list, ngzVar2.f42271c);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ngz ngzVar3 = (ngz) nxlVarM18137O2.f44974b;
        ngzVar3.f42269a |= 2;
        ngzVar3.f42272d = j;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        ngz ngzVar4 = (ngz) nxlVarM18137O2.mo18103l();
        ngzVar4.getClass();
        nhoVar2.f42465at = ngzVar4;
        nhoVar2.f42469c |= 262144;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.gfe
    /* JADX INFO: renamed from: bM */
    public final void mo9116bM(gfc gfcVar, gev gevVar, int i) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.OPTIONBAR_OPTION_CHANGE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        int i2 = 1;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nky.f43423e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nky nkyVar = (nky) nxlVarM18137O2.f44974b;
        nkyVar.f43427c = i - 1;
        nkyVar.f43425a |= 2;
        nkx nkxVar = (nkx) Map.EL.getOrDefault(hke.f28123a.f28124b, gfcVar, nkx.UNKNOWN);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nky nkyVar2 = (nky) nxlVarM18137O2.f44974b;
        nkyVar2.f43426b = nkxVar.f43422aD;
        nkyVar2.f43425a |= 1;
        switch (gevVar) {
            case SWISS:
                i2 = 31;
                break;
            case FLOUNDER:
                i2 = 3;
                break;
            case MOTION_BLUR_TRAIL:
                i2 = 4;
                break;
            case ASTRO:
                i2 = 5;
                break;
            case PHOTO_SPHERE:
                i2 = 6;
                break;
            case BACK_PHOTO_FLASH:
                i2 = 7;
                break;
            case FRONT_PHOTO_FLASH:
                i2 = 8;
                break;
            case NIGHT_FRONT_PHOTO_FLASH:
                i2 = 9;
                break;
            case BACK_VIDEO_FLASH:
                i2 = 10;
                break;
            case FRONT_VIDEO_FLASH:
                i2 = 11;
                break;
            case HDR:
                i2 = 12;
                break;
            case f24452l:
                i2 = 13;
                break;
            case VIDEO_RESOLUTION:
                i2 = 14;
                break;
            case BEAUTIFICATION:
                i2 = 15;
                break;
            case MAKEUP:
                i2 = 16;
                break;
            case MICROVIDEO:
                i2 = 17;
                break;
            case TAXI:
                i2 = 18;
                break;
            case TIMER:
                i2 = 19;
                break;
            case FPS:
                i2 = 20;
                break;
            case AMETHYST:
                i2 = 21;
                break;
            case MICROPHONE:
                i2 = 22;
                break;
            case IMAX_AUDIO:
                i2 = 23;
                break;
            case f24463w:
                i2 = 24;
                break;
            case COCKTAIL_PARTY_BACK:
                i2 = 25;
                break;
            case COCKTAIL_PARTY_FRONT:
                i2 = 26;
                break;
            case IMAGE_ASPECT_RATIO:
                i2 = 27;
                break;
            case IMAGE_ASPECT_RATIO_IMMERSIVE:
                i2 = 28;
                break;
            case AF_BACK:
                i2 = 29;
                break;
            case AF_FRONT:
                i2 = 30;
                break;
        }
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nky nkyVar3 = (nky) nxlVarM18137O2.f44974b;
        nkyVar3.f43428d = i2 - 1;
        nkyVar3.f43425a = 4 | nkyVar3.f43425a;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nky nkyVar4 = (nky) nxlVarM18137O2.mo18103l();
        nkyVar4.getClass();
        nhoVar2.f42435Q = nkyVar4;
        nhoVar2.f42468b |= 524288;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: c */
    public final void mo8183c(float f, float f2, float f3) {
        nxl nxlVarM18137O = nio.f42743g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nio nioVar = (nio) nxqVar;
        nioVar.f42745a |= 4;
        nioVar.f42748d = f;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nio nioVar2 = (nio) nxqVar2;
        nioVar2.f42745a |= 8;
        nioVar2.f42749e = f2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nio nioVar3 = (nio) nxlVarM18137O.f44974b;
        nioVar3.f42745a |= 16;
        nioVar3.f42750f = f3;
        m10416aL(9, null, null, null, null, (nio) nxlVarM18137O.mo18103l());
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: d */
    public final void mo8184d(int i, int i2, int i3, int i4) {
        nxl nxlVarM18137O = nis.f42768f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nis nisVar = (nis) nxqVar;
        nisVar.f42770a |= 1;
        nisVar.f42771b = i;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nis nisVar2 = (nis) nxqVar2;
        nisVar2.f42770a |= 2;
        nisVar2.f42772c = i2;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nis nisVar3 = (nis) nxqVar3;
        nisVar3.f42770a |= 4;
        nisVar3.f42773d = i3;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nis nisVar4 = (nis) nxlVarM18137O.f44974b;
        nisVar4.f42770a |= 8;
        nisVar4.f42774e = i4;
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_FATAL_ERROR_COUNTS_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O3 = nhq.f42507d.m18137O();
        nis nisVar5 = (nis) nxlVarM18137O.mo18103l();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhq nhqVar = (nhq) nxlVarM18137O3.f44974b;
        nisVar5.getClass();
        nhqVar.f42511c = nisVar5;
        nhqVar.f42509a |= 2;
        nhq nhqVar2 = (nhq) nxlVarM18137O3.mo18103l();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nhqVar2.getClass();
        nhoVar2.f42444Z = nhqVar2;
        nhoVar2.f42468b |= 1073741824;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: e */
    public final void mo8185e(String str, int i, int i2, int i3, int i4, int i5, long j) {
        nxl nxlVarM18137O = nja.f42855i.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nja njaVar = (nja) nxqVar;
        str.getClass();
        njaVar.f42857a |= 1;
        njaVar.f42858b = str;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nja njaVar2 = (nja) nxqVar2;
        njaVar2.f42857a |= 2;
        njaVar2.f42859c = i;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nja njaVar3 = (nja) nxqVar3;
        njaVar3.f42857a |= 4;
        njaVar3.f42860d = i2;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        nja njaVar4 = (nja) nxqVar4;
        njaVar4.f42857a |= 8;
        njaVar4.f42861e = i3;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        nja njaVar5 = (nja) nxqVar5;
        njaVar5.f42857a |= 16;
        njaVar5.f42862f = i4;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O.f44974b;
        nja njaVar6 = (nja) nxqVar6;
        njaVar6.f42857a |= 32;
        njaVar6.f42863g = i5;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nja njaVar7 = (nja) nxlVarM18137O.f44974b;
        njaVar7.f42857a |= 64;
        njaVar7.f42864h = j;
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_FATAL_ERROR_COUNTS_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O2.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O3 = nhq.f42507d.m18137O();
        nja njaVar8 = (nja) nxlVarM18137O.mo18103l();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhq nhqVar = (nhq) nxlVarM18137O3.f44974b;
        njaVar8.getClass();
        nhqVar.f42510b = njaVar8;
        nhqVar.f42509a |= 1;
        nhq nhqVar2 = (nhq) nxlVarM18137O3.mo18103l();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nhqVar2.getClass();
        nhoVar2.f42444Z = nhqVar2;
        nhoVar2.f42468b |= 1073741824;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: f */
    public final void mo8186f(boolean z, PointF pointF) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CONTROL_USED;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = njb.f42865d.m18137O();
        int i = true != z ? 3 : 2;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        njb njbVar = (njb) nxlVarM18137O2.f44974b;
        njbVar.f42868b = i - 1;
        njbVar.f42867a |= 1;
        nmd nmdVarM10415aK = m10415aK(pointF);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        njb njbVar2 = (njb) nxlVarM18137O2.f44974b;
        nmdVarM10415aK.getClass();
        njbVar2.f42869c = nmdVarM10415aK;
        njbVar2.f42867a |= 2;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njb njbVar3 = (njb) nxlVarM18137O2.mo18103l();
        njbVar3.getClass();
        nhoVar2.f42427I = njbVar3;
        nhoVar2.f42468b |= 2048;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: g */
    public final void mo8187g(boolean z, PointF pointF, long j, int i, int i2) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CONTROL_USED;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = njc.f42870g.m18137O();
        int i3 = true != z ? 3 : 2;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        njc njcVar = (njc) nxlVarM18137O2.f44974b;
        njcVar.f42873b = i3 - 1;
        njcVar.f42872a |= 1;
        nmd nmdVarM10415aK = m10415aK(pointF);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        njc njcVar2 = (njc) nxqVar;
        nmdVarM10415aK.getClass();
        njcVar2.f42874c = nmdVarM10415aK;
        njcVar2.f42872a |= 2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        njc njcVar3 = (njc) nxqVar2;
        njcVar3.f42872a |= 4;
        njcVar3.f42875d = j;
        int iM17400n = nea.m17400n(i2);
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O2.f44974b;
        njc njcVar4 = (njc) nxqVar3;
        int i4 = iM17400n - 1;
        if (iM17400n == 0) {
            throw null;
        }
        njcVar4.f42876e = i4;
        njcVar4.f42872a |= 16;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        njc njcVar5 = (njc) nxlVarM18137O2.f44974b;
        njcVar5.f42872a |= 32;
        njcVar5.f42877f = i;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njc njcVar6 = (njc) nxlVarM18137O2.mo18103l();
        njcVar6.getClass();
        nhoVar2.f42428J = njcVar6;
        nhoVar2.f42468b |= 4096;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: h */
    public final void mo8188h(boolean z) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.FREQUENT_FACE_PREFERENCE_CHANGE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = njj.f42929c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        njj njjVar = (njj) nxlVarM18137O2.f44974b;
        njjVar.f42931a |= 1;
        njjVar.f42932b = z;
        njj njjVar2 = (njj) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njjVar2.getClass();
        nhoVar2.f42439U = njjVar2;
        nhoVar2.f42468b |= 16777216;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: i */
    public final void mo8189i(njp njpVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.INFLIGHT_FALLBACK_RESTORED_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        njpVar.getClass();
        nhoVar2.f42434P = njpVar;
        nhoVar2.f42468b |= 262144;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: j */
    public final void mo8190j() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PREFERENCES_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nll.f43542d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nll nllVar = (nll) nxqVar;
        nllVar.f43545b = 1;
        nllVar.f43544a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nll nllVar2 = (nll) nxlVarM18137O2.f44974b;
        nllVar2.f43546c = 1;
        nllVar2.f43544a |= 2;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nll nllVar3 = (nll) nxlVarM18137O2.mo18103l();
        nllVar3.getClass();
        nhoVar2.f42419A = nllVar3;
        nhoVar2.f42445a |= 1073741824;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: k */
    public final void mo8191k() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PREFERENCES_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nll.f43542d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nll nllVar = (nll) nxqVar;
        nllVar.f43545b = 2;
        nllVar.f43544a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nll nllVar2 = (nll) nxlVarM18137O2.f44974b;
        nllVar2.f43546c = 1;
        nllVar2.f43544a |= 2;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nll nllVar3 = (nll) nxlVarM18137O2.mo18103l();
        nllVar3.getClass();
        nhoVar2.f42419A = nllVar3;
        nhoVar2.f42445a |= 1073741824;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: l */
    public final void mo8192l(int i) {
        if (i <= 0) {
            return;
        }
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        long j = this.f28153n;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42445a |= 134217728;
        nhoVar.f42490x = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhoVar2.f42469c |= 524288;
        nhoVar2.f42466au = i;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: m */
    public final void mo8193m(int i) {
        if (i <= 0) {
            return;
        }
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        long j = this.f28153n;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42445a |= 134217728;
        nhoVar.f42490x = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhoVar2.f42469c |= 131072;
        nhoVar2.f42464as = i;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: n */
    public final void mo8194n() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAMERA_FAILURE;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhp.f42493m.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nhp nhpVar = (nhp) nxqVar;
        nhpVar.f42496b = 8;
        nhpVar.f42495a |= 1;
        String str = this.f28145e;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhp nhpVar2 = (nhp) nxlVarM18137O2.f44974b;
        str.getClass();
        nhpVar2.f42495a |= 4;
        nhpVar2.f42498d = str;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhp nhpVar3 = (nhp) nxlVarM18137O2.mo18103l();
        nhpVar3.getClass();
        nhoVar2.f42476j = nhpVar3;
        nhoVar2.f42445a |= 128;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: o */
    public final void mo8195o() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ADVICE_SHOWN;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhb.f42277c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhb nhbVar = (nhb) nxlVarM18137O2.f44974b;
        nhbVar.f42280b = 1;
        nhbVar.f42279a = 1 | nhbVar.f42279a;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhb nhbVar2 = (nhb) nxlVarM18137O2.mo18103l();
        nhbVar2.getClass();
        nhoVar2.f42422D = nhbVar2;
        nhoVar2.f42468b |= 8;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: p */
    public final void mo8196p() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ADVICE_SHOWN;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhb.f42277c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhb nhbVar = (nhb) nxlVarM18137O2.f44974b;
        nhbVar.f42280b = 4;
        nhbVar.f42279a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhb nhbVar2 = (nhb) nxlVarM18137O2.mo18103l();
        nhbVar2.getClass();
        nhoVar2.f42422D = nhbVar2;
        nhoVar2.f42468b |= 8;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: q */
    public final void mo8197q() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ADVICE_HEEDED;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nha.f42273c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nha nhaVar = (nha) nxlVarM18137O2.f44974b;
        nhaVar.f42276b = 4;
        nhaVar.f42275a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nha nhaVar2 = (nha) nxlVarM18137O2.mo18103l();
        nhaVar2.getClass();
        nhoVar2.f42440V = nhaVar2;
        nhoVar2.f42468b |= 67108864;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: r */
    public final void mo8198r(nhk nhkVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.BOTTOM_SHEET_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhkVar.getClass();
        nhoVar2.f42455aj = nhkVar;
        nhoVar2.f42469c |= 512;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: s */
    public final void mo8199s(String str, Object obj, Object obj2) {
        nxl nxlVarM18137O = nlk.f43533h.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nlk nlkVar = (nlk) nxqVar;
        str.getClass();
        nlkVar.f43535a |= 2;
        nlkVar.f43537c = str;
        if (obj2 instanceof Boolean) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlk nlkVar2 = (nlk) nxlVarM18137O.f44974b;
            nlkVar2.f43536b = 1;
            nlkVar2.f43535a |= 1;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlk nlkVar3 = (nlk) nxlVarM18137O.f44974b;
            nlkVar3.f43535a |= 4;
            nlkVar3.f43538d = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlk nlkVar4 = (nlk) nxlVarM18137O.f44974b;
            nlkVar4.f43535a |= 8;
            nlkVar4.f43539e = zBooleanValue2;
        } else if (obj2 instanceof String) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nlk nlkVar5 = (nlk) nxqVar2;
            nlkVar5.f43536b = 2;
            nlkVar5.f43535a |= 1;
            String str2 = (String) obj;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O.f44974b;
            nlk nlkVar6 = (nlk) nxqVar3;
            str2.getClass();
            nlkVar6.f43535a |= 16;
            nlkVar6.f43540f = str2;
            String str3 = (String) obj2;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlk nlkVar7 = (nlk) nxlVarM18137O.f44974b;
            str3.getClass();
            nlkVar7.f43535a |= 32;
            nlkVar7.f43541g = str3;
        }
        nxl nxlVarM18137O2 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.PREFERENCE_CHANGE_EVENT;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O2.f44974b;
        nho nhoVar = (nho) nxqVar4;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O2.f44974b;
        nlk nlkVar8 = (nlk) nxlVarM18137O.mo18103l();
        nlkVar8.getClass();
        nhoVar2.f42423E = nlkVar8;
        nhoVar2.f42468b |= 16;
        m10421aF(nxlVarM18137O2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: t */
    public final void mo8200t(long j, fcu fcuVar) {
        nxl nxlVarM18137O = nhm.f42342c.m18137O();
        int iM10418aN = m10418aN(fcuVar.f21288a);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhm nhmVar = (nhm) nxlVarM18137O.f44974b;
        nhmVar.f42345b = iM10418aN - 1;
        nhmVar.f42344a |= 2;
        nhm nhmVar2 = (nhm) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nid.f42657h.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nid nidVar = (nid) nxqVar;
        nidVar.f42659a |= 2;
        nidVar.f42661c = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nid nidVar2 = (nid) nxlVarM18137O2.f44974b;
        nhmVar2.getClass();
        nidVar2.f42660b = nhmVar2;
        nidVar2.f42659a |= 1;
        int iM12984h = jeu.m12984h(fcuVar.f21288a);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nid nidVar3 = (nid) nxqVar2;
        nidVar3.f42662d = iM12984h - 1;
        nidVar3.f42659a |= 4;
        nkm nkmVar = fcuVar.f21289b;
        if (nkmVar != null) {
            int iM15008az = kxk.m15008az(nkmVar.f43238h);
            if (iM15008az == 0) {
                iM15008az = 1;
            }
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nid nidVar4 = (nid) nxlVarM18137O2.f44974b;
            nidVar4.f42663e = iM15008az - 1;
            nidVar4.f42659a |= 8;
        }
        if (fcuVar.f21288a == gyw.LONG_SHOT) {
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nid nidVar5 = (nid) nxlVarM18137O2.f44974b;
            nidVar5.f42664f = 4;
            nidVar5.f42659a |= 16;
        } else if (nkmVar != null) {
            int iM14982aA = kxk.m14982aA(nkmVar.f43242l);
            if (iM14982aA == 0) {
                iM14982aA = 1;
            }
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nid nidVar6 = (nid) nxlVarM18137O2.f44974b;
            nidVar6.f42664f = iM14982aA - 1;
            nidVar6.f42659a |= 16;
        }
        Float f = fcuVar.f21290c;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nid nidVar7 = (nid) nxlVarM18137O2.f44974b;
            nidVar7.f42659a |= 32;
            nidVar7.f42665g = fFloatValue;
        }
        nxl nxlVarM18137O3 = nho.f42417av.m18137O();
        nhn nhnVar = nhn.CAPTURE_PROFILE_START;
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O3.f44974b;
        nho nhoVar = (nho) nxqVar3;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O3.f44974b;
        nid nidVar8 = (nid) nxlVarM18137O2.mo18103l();
        nidVar8.getClass();
        nhoVar2.f42480n = nidVar8;
        nhoVar2.f42445a |= 16384;
        m10421aF(nxlVarM18137O3);
        m10412aH(4, "onCaptureStarted", j, nhmVar2);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: u */
    public final void mo8201u(int i) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.DUAL_FUSION_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = niq.f42760c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        niq niqVar = (niq) nxlVarM18137O2.f44974b;
        niqVar.f42762a |= 1;
        niqVar.f42763b = i;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        niq niqVar2 = (niq) nxlVarM18137O2.mo18103l();
        niqVar2.getClass();
        nhoVar2.f42459an = niqVar2;
        nhoVar2.f42469c |= 8192;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: v */
    public final void mo8202v(nka nkaVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.LENS_SUGGESTION_CHIP_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nkaVar.getClass();
        nhoVar2.f42460ao = nkaVar;
        nhoVar2.f42469c |= 16384;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: w */
    public final void mo8203w(nke nkeVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.LENSLITE_EVENT;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nkeVar.getClass();
        nhoVar2.f42437S = nkeVar;
        nhoVar2.f42468b |= 4194304;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: x */
    public final void mo8204x(List list) {
        if (list.isEmpty()) {
            return;
        }
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        long j = this.f28153n;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42445a |= 134217728;
        nhoVar.f42490x = j;
        nhn nhnVar = nhn.TAXI_STATE_CHANGE_EVENTS;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar2 = (nho) nxqVar;
        nhoVar2.f42470d = nhnVar.f42416ar;
        nhoVar2.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar3 = (nho) nxlVarM18137O.f44974b;
        nxy nxyVar = nhoVar3.f42463ar;
        if (!nxyVar.mo17770c()) {
            nhoVar3.f42463ar = nxq.m18127U(nxyVar);
        }
        nwb.m17749e(list, nhoVar3.f42463ar);
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: y */
    public final void mo8205y(nko nkoVar) {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.f42358M;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nho nhoVar = (nho) nxqVar;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nkoVar.getClass();
        nhoVar2.f42433O = nkoVar;
        nhoVar2.f42468b |= 131072;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: z */
    public final void mo8206z() {
        nxl nxlVarM18137O = nho.f42417av.m18137O();
        nhn nhnVar = nhn.ADVICE_SHOWN;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar = (nho) nxlVarM18137O.f44974b;
        nhoVar.f42470d = nhnVar.f42416ar;
        nhoVar.f42445a |= 1;
        nxl nxlVarM18137O2 = nhb.f42277c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nhb nhbVar = (nhb) nxlVarM18137O2.f44974b;
        nhbVar.f42280b = 2;
        nhbVar.f42279a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
        nhb nhbVar2 = (nhb) nxlVarM18137O2.mo18103l();
        nhbVar2.getClass();
        nhoVar2.f42422D = nhbVar2;
        nhoVar2.f42468b |= 8;
        m10421aF(nxlVarM18137O);
    }

    @Override // p000.fcp
    /* JADX INFO: renamed from: U */
    public final void mo8146U(int i, List list, mrm mrmVar, mrm mrmVar2) {
        long j;
        String string;
        if (i == 0) {
            throw null;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f28161v.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((jeu) this.f28161v.get(str)) != null && jElapsedRealtime > 30000) {
                nxl nxlVarM18137O = nho.f42417av.m18137O();
                nhn nhnVar = nhn.PHOTO_INTERACTION;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nho nhoVar = (nho) nxlVarM18137O.f44974b;
                nhoVar.f42470d = nhnVar.f42416ar;
                nhoVar.f42445a |= 1;
                nxl nxlVarM18137O2 = nkl.f43222f.m18137O();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nkl nklVar = (nkl) nxlVarM18137O2.f44974b;
                nklVar.f43225b = 6;
                nklVar.f43224a |= 1;
                fcx fcxVar = this.f28155p;
                synchronized (fcxVar.f21337c) {
                    byte[] bArrDigest = fcxVar.f21336b.digest(str.getBytes(fcx.f21334a));
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        sb.append(Integer.toString((bArrDigest[i2] & 255) + 256, 16).substring(1));
                        i2++;
                        jElapsedRealtime = jElapsedRealtime;
                    }
                    j = jElapsedRealtime;
                    string = sb.toString();
                }
                String strSubstring = string.substring(0, 10);
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                nkl nklVar2 = (nkl) nxqVar;
                strSubstring.getClass();
                nklVar2.f43224a |= 8;
                nklVar2.f43226c = strSubstring;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O2.f44974b;
                nkl nklVar3 = (nkl) nxqVar2;
                nklVar3.f43224a |= 32;
                nklVar3.f43228e = 0.0f;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nkl nklVar4 = (nkl) nxlVarM18137O2.f44974b;
                nklVar4.f43224a |= 16;
                nklVar4.f43227d = 0.0f;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
                nkl nklVar5 = (nkl) nxlVarM18137O2.mo18103l();
                nklVar5.getClass();
                nhoVar2.f42474h = nklVar5;
                nhoVar2.f42445a |= 32;
                m10421aF(nxlVarM18137O);
                it.remove();
                jElapsedRealtime = j;
            }
        }
        nxl nxlVarM18137O3 = nhh.f42312g.m18137O();
        if (list != null && !list.isEmpty()) {
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhh nhhVar = (nhh) nxlVarM18137O3.f44974b;
            nxy nxyVar = nhhVar.f42318e;
            if (!nxyVar.mo17770c()) {
                nhhVar.f42318e = nxq.m18127U(nxyVar);
            }
            nwb.m17749e(list, nhhVar.f42318e);
        }
        if (mrmVar.mo16813g()) {
            njz njzVar = (njz) mrmVar.mo16809c();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhh nhhVar2 = (nhh) nxlVarM18137O3.f44974b;
            nhhVar2.f42315b = njzVar;
            nhhVar2.f42314a |= 2;
        }
        nhu nhuVar = (nhu) ((mrq) mrmVar2).f41482a;
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O3.f44974b;
        nhh nhhVar3 = (nhh) nxqVar3;
        nhhVar3.f42319f = nhuVar;
        nhhVar3.f42314a |= 8;
        List list2 = this.f28156q;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nhh nhhVar4 = (nhh) nxlVarM18137O3.f44974b;
        nxy nxyVar2 = nhhVar4.f42316c;
        if (!nxyVar2.mo17770c()) {
            nhhVar4.f42316c = nxq.m18127U(nxyVar2);
        }
        nwb.m17749e(list2, nhhVar4.f42316c);
        this.f28156q.clear();
        if (i == 2) {
            if (this.f28158s) {
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nhh nhhVar5 = (nhh) nxlVarM18137O3.f44974b;
                nhhVar5.f42314a |= 4;
                nhhVar5.f42317d = -1.0f;
            } else {
                long j2 = jElapsedRealtimeNanos - this.f28159t;
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nhh nhhVar6 = (nhh) nxlVarM18137O3.f44974b;
                nhhVar6.f42314a |= 4;
                nhhVar6.f42317d = j2 / 1.0E9f;
            }
        }
        this.f28158s = true;
        this.f28159t = 0L;
        nxl nxlVarM18137O4 = nho.f42417av.m18137O();
        nhn nhnVar2 = nhn.BACKGROUND_EVENT;
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O4.f44974b;
        nho nhoVar3 = (nho) nxqVar4;
        nhoVar3.f42470d = nhnVar2.f42416ar;
        nhoVar3.f42445a |= 1;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nho nhoVar4 = (nho) nxlVarM18137O4.f44974b;
        nhh nhhVar7 = (nhh) nxlVarM18137O3.mo18103l();
        nhhVar7.getClass();
        nhoVar4.f42479m = nhhVar7;
        nhoVar4.f42445a |= 8192;
        m10421aF(nxlVarM18137O4);
    }
}
