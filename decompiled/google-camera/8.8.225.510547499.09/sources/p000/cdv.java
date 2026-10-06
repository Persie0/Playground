package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdv extends cmk implements fbp, fbn, fbo, gws {

    /* JADX INFO: renamed from: i */
    private static volatile Boolean f5339i;

    /* JADX INFO: renamed from: a */
    public final fcp f5340a;

    /* JADX INFO: renamed from: b */
    public long f5341b;

    /* JADX INFO: renamed from: c */
    public boolean f5342c;

    /* JADX INFO: renamed from: d */
    public final hkk f5343d;

    /* JADX INFO: renamed from: e */
    public int f5344e;

    /* JADX INFO: renamed from: f */
    public final bko f5345f;

    /* JADX INFO: renamed from: g */
    public final cwd f5346g;

    /* JADX INFO: renamed from: j */
    private final jww f5347j;

    /* JADX INFO: renamed from: k */
    private final CameraActivityTiming f5348k;

    /* JADX INFO: renamed from: l */
    private final jvd f5349l;

    /* JADX INFO: renamed from: m */
    private final kbz f5350m;

    /* JADX INFO: renamed from: n */
    private final dlc f5351n;

    /* JADX INFO: renamed from: o */
    private final Context f5352o;

    /* JADX INFO: renamed from: p */
    private final god f5353p;

    /* JADX INFO: renamed from: q */
    private final gwu f5354q;

    /* JADX INFO: renamed from: r */
    private final boolean f5355r;

    /* JADX INFO: renamed from: s */
    private long f5356s;

    /* JADX INFO: renamed from: t */
    private gwt f5357t;

    /* JADX INFO: renamed from: u */
    private long f5358u;

    /* JADX INFO: renamed from: v */
    private final drj f5359v;

    public cdv(Context context, bko bkoVar, fcp fcpVar, CameraActivityTiming cameraActivityTiming, cwd cwdVar, hkk hkkVar, jvd jvdVar, kbz kbzVar, jww jwwVar, dlc dlcVar, ggm ggmVar, drj drjVar, god godVar, gwu gwuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(not.INSTANCE);
        this.f5344e = 1;
        this.f5352o = context;
        this.f5345f = bkoVar;
        fcpVar.getClass();
        this.f5340a = fcpVar;
        this.f5348k = cameraActivityTiming;
        cwdVar.getClass();
        this.f5346g = cwdVar;
        jwwVar.getClass();
        this.f5347j = jwwVar;
        this.f5343d = hkkVar;
        this.f5349l = jvdVar;
        this.f5350m = kbzVar;
        this.f5351n = dlcVar;
        this.f5353p = godVar;
        this.f5354q = gwuVar;
        this.f5359v = drjVar;
        this.f5355r = ggmVar.mo9219i();
    }

    @Override // p000.cmk
    /* JADX INFO: renamed from: a */
    public final void mo3531a() {
    }

    @Override // p000.gws
    /* JADX INFO: renamed from: b */
    public final void mo3532b(gwt gwtVar) {
        this.f5358u = SystemClock.elapsedRealtimeNanos();
        this.f5357t = gwtVar;
        this.f5354q.m9864a(this);
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        boolean z;
        gwu gwuVar = this.f5354q;
        synchronized (gwuVar.f26638d) {
            gwuVar.f26642h.add(this);
            if (gwuVar.f26643i) {
                z = false;
            } else {
                z = true;
                gwuVar.f26643i = true;
            }
        }
        if (z) {
            gwuVar.f26636b.execute(new gpn(gwuVar, 16));
        }
        this.f5349l.execute(this.f5350m.mo13959c("logForegroundStat", new baa(this, 19)));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        int i;
        int i2;
        boolean zEquals;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f5356s >= 2000) {
            if (f5339i == null) {
                synchronized (cdv.class) {
                    if (f5339i == null) {
                        Context context = this.f5352o;
                        PackageManager packageManager = context.getPackageManager();
                        mrm mrmVarM11535g = inr.m11535g(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), false);
                        if (!mrmVarM11535g.mo16813g()) {
                            mrmVarM11535g = inr.m11535g(packageManager, new Intent(IuyLAqNmW.dxVNa), false);
                        }
                        if (!mrmVarM11535g.mo16813g()) {
                            mrmVarM11535g = inr.m11535g(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), true);
                        }
                        if (mrmVarM11535g.mo16813g()) {
                            String str = ((ApplicationInfo) mrmVarM11535g.mo16809c()).packageName;
                            String str2 = context.getApplicationInfo().packageName;
                            zEquals = context.getApplicationInfo().packageName.equals(str);
                        } else {
                            zEquals = false;
                        }
                        f5339i = Boolean.valueOf(zEquals);
                    }
                }
            }
            boolean zBooleanValue = f5339i.booleanValue();
            this.f5356s = jElapsedRealtime;
            int iM11411e = this.f5344e;
            if (iM11411e != 1) {
                if (iM11411e == 3) {
                    this.f5342c = true;
                }
                this.f5344e = 1;
            } else {
                iM11411e = iku.m11411e((ikw) this.f5347j.mo3831be());
            }
            mrm mrmVarM16829i = mqu.f41450a;
            int i3 = mws.f41739d;
            List listMo6328a = mzr.f41857a;
            CameraActivityTiming cameraActivityTiming = this.f5348k;
            if (cameraActivityTiming.m4306d() && !cameraActivityTiming.f6963c) {
                long j = this.f5343d.m10425b() == 1 ? this.f5348k.f28241m : 0L;
                nxl nxlVarM18137O = njz.f43133t.m18137O();
                long activityOnCreateStartNs = this.f5348k.getActivityOnCreateStartNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar = (njz) nxlVarM18137O.f44974b;
                njzVar.f43135a |= 1;
                njzVar.f43136b = activityOnCreateStartNs;
                long permissionStartupTaskTimeStartNs = this.f5348k.getPermissionStartupTaskTimeStartNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar2 = (njz) nxlVarM18137O.f44974b;
                njzVar2.f43135a |= 128;
                njzVar2.f43143i = permissionStartupTaskTimeStartNs;
                long permissionStartupTaskTimeEndNs = this.f5348k.getPermissionStartupTaskTimeEndNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar3 = (njz) nxlVarM18137O.f44974b;
                njzVar3.f43135a |= 256;
                njzVar3.f43144j = permissionStartupTaskTimeEndNs;
                long waitForCameraDevicesTaskTimeStartNs = this.f5348k.getWaitForCameraDevicesTaskTimeStartNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar4 = (njz) nxlVarM18137O.f44974b;
                njzVar4.f43135a |= 2048;
                njzVar4.f43145k = waitForCameraDevicesTaskTimeStartNs;
                long waitForCameraDevicesTaskTimeEndNs = this.f5348k.getWaitForCameraDevicesTaskTimeEndNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar5 = (njz) nxlVarM18137O.f44974b;
                njzVar5.f43135a |= 4096;
                njzVar5.f43146l = waitForCameraDevicesTaskTimeEndNs;
                long activityInitializedNs = this.f5348k.getActivityInitializedNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar6 = (njz) nxlVarM18137O.f44974b;
                njzVar6.f43135a |= 4;
                njzVar6.f43138d = activityInitializedNs;
                long firstPreviewFrameReceivedNs = this.f5348k.getFirstPreviewFrameReceivedNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar7 = (njz) nxlVarM18137O.f44974b;
                njzVar7.f43135a |= 2;
                njzVar7.f43137c = firstPreviewFrameReceivedNs;
                long firstPreviewFrameRenderedNs = this.f5348k.getFirstPreviewFrameRenderedNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar8 = (njz) nxlVarM18137O.f44974b;
                njzVar8.f43135a |= 64;
                njzVar8.f43142h = firstPreviewFrameRenderedNs;
                long firstVfePreviewFrameRenderedNs = this.f5348k.getFirstVfePreviewFrameRenderedNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar9 = (njz) nxlVarM18137O.f44974b;
                njzVar9.f43135a |= 131072;
                njzVar9.f43151q = firstVfePreviewFrameRenderedNs;
                long shutterButtonFirstEnabledNs = this.f5348k.getShutterButtonFirstEnabledNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar10 = (njz) nxlVarM18137O.f44974b;
                njzVar10.f43135a |= 16;
                njzVar10.f43140f = shutterButtonFirstEnabledNs;
                long shutterButtonFirstDrawnNs = this.f5348k.getShutterButtonFirstDrawnNs();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                njz njzVar11 = (njz) nxqVar;
                njzVar11.f43135a |= 8;
                njzVar11.f43139e = shutterButtonFirstDrawnNs;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar12 = (njz) nxlVarM18137O.f44974b;
                njzVar12.f43135a |= 32;
                njzVar12.f43141g = j;
                long nanos = TimeUnit.MILLISECONDS.toNanos(Process.getStartElapsedRealtime());
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar13 = (njz) nxlVarM18137O.f44974b;
                njzVar13.f43135a |= 262144;
                njzVar13.f43152r = nanos;
                switch (this.f5343d.m10425b() - 1) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        i = 4;
                        break;
                    default:
                        i = 1;
                        break;
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                njz njzVar14 = (njz) nxqVar2;
                njzVar14.f43150p = i - 1;
                njzVar14.f43135a |= 65536;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                njz njzVar15 = (njz) nxlVarM18137O.f44974b;
                njzVar15.f43135a |= 8192;
                njzVar15.f43147m = zBooleanValue;
                gwt gwtVar = this.f5357t;
                if (gwtVar != null) {
                    long j2 = this.f5358u;
                    if (j2 != 0) {
                        nxl nxlVarM18137O2 = nlp.f43563f.m18137O();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar3 = nxlVarM18137O2.f44974b;
                        nlp nlpVar = (nlp) nxqVar3;
                        nlpVar.f43565a |= 1;
                        nlpVar.f43566b = j2;
                        float f = gwtVar.f26632a;
                        if (!nxqVar3.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar4 = nxlVarM18137O2.f44974b;
                        nlp nlpVar2 = (nlp) nxqVar4;
                        nlpVar2.f43565a |= 2;
                        nlpVar2.f43567c = f;
                        float f2 = gwtVar.f26633b;
                        if (!nxqVar4.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar5 = nxlVarM18137O2.f44974b;
                        nlp nlpVar3 = (nlp) nxqVar5;
                        nlpVar3.f43565a |= 4;
                        nlpVar3.f43568d = f2;
                        float f3 = gwtVar.f26634c;
                        if (!nxqVar5.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nlp nlpVar4 = (nlp) nxlVarM18137O2.f44974b;
                        nlpVar4.f43565a |= 8;
                        nlpVar4.f43569e = f3;
                        nlp nlpVar5 = (nlp) nxlVarM18137O2.mo18103l();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        njz njzVar16 = (njz) nxlVarM18137O.f44974b;
                        nlpVar5.getClass();
                        njzVar16.f43149o = nlpVar5;
                        njzVar16.f43135a |= 32768;
                        switch (ggi.m9209a(kay.m13889b((int) this.f5357t.f26634c), this.f5355r) - 1) {
                            case 0:
                                i2 = 2;
                                break;
                            case 1:
                                i2 = 3;
                                break;
                            case 2:
                                i2 = 4;
                                break;
                            default:
                                i2 = 5;
                                break;
                        }
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        njz njzVar17 = (njz) nxlVarM18137O.f44974b;
                        njzVar17.f43148n = i2 - 1;
                        njzVar17.f43135a |= 16384;
                    }
                }
                nlj nljVarMo9572a = this.f5353p.mo9572a();
                int i4 = nljVarMo9572a.f43530a;
                if ((i4 & 1) != 0 || (i4 & 2) != 0) {
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    njz njzVar18 = (njz) nxlVarM18137O.f44974b;
                    nljVarMo9572a.getClass();
                    njzVar18.f43153s = nljVarMo9572a;
                    njzVar18.f43135a |= 524288;
                }
                mrmVarM16829i = mrm.m16829i((njz) nxlVarM18137O.mo18103l());
                listMo6328a = this.f5351n.mo6328a();
            }
            drj drjVar = this.f5359v;
            nxl nxlVarM18137O3 = nhu.f42548g.m18137O();
            boolean zBooleanValue2 = ((Boolean) drjVar.f12397c.mo10031c(gzy.f27010V)).booleanValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhu nhuVar = (nhu) nxlVarM18137O3.f44974b;
            nhuVar.f42550a |= 1;
            nhuVar.f42551b = zBooleanValue2;
            boolean z = drjVar.f12398d.getString(gzy.f26990B.f26977a, null) != null;
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhu nhuVar2 = (nhu) nxlVarM18137O3.f44974b;
            nhuVar2.f42550a |= 2;
            nhuVar2.f42552c = z;
            boolean zBooleanValue3 = ((Boolean) drjVar.f12399e.mo3831be()).booleanValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhu nhuVar3 = (nhu) nxlVarM18137O3.f44974b;
            nhuVar3.f42550a |= 4;
            nhuVar3.f42553d = zBooleanValue3;
            boolean zBooleanValue4 = ((Boolean) drjVar.f12395a.mo3831be()).booleanValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhu nhuVar4 = (nhu) nxlVarM18137O3.f44974b;
            nhuVar4.f42550a |= 8;
            nhuVar4.f42554e = zBooleanValue4;
            boolean zBooleanValue5 = ((Boolean) drjVar.f12396b.mo3831be()).booleanValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nhu nhuVar5 = (nhu) nxlVarM18137O3.f44974b;
            nhuVar5.f42550a |= 16;
            nhuVar5.f42555f = zBooleanValue5;
            this.f5340a.mo8146U(iM11411e, listMo6328a, mrmVarM16829i, mrm.m16829i((nhu) nxlVarM18137O3.mo18103l()));
            this.f5354q.m9864a(this);
        }
    }
}
