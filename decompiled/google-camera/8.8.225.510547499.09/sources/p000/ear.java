package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ear extends kfv {

    /* JADX INFO: renamed from: a */
    public static final nbh f13078a = nbh.m17259h("com/google/android/apps/camera/gyro/OisListener");

    /* JADX INFO: renamed from: b */
    public final int f13079b;

    /* JADX INFO: renamed from: c */
    public final Set f13080c;

    /* JADX INFO: renamed from: d */
    private final Executor f13081d;

    /* JADX INFO: renamed from: e */
    private final Set f13082e;

    public ear(Integer num, Executor executor, Set set, Set set2) {
        this.f13079b = num.intValue();
        this.f13081d = executor;
        this.f13082e = set;
        this.f13080c = set2;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(final kpp kppVar) {
        this.f13081d.execute(new Runnable() { // from class: eap
            @Override // java.lang.Runnable
            public final void run() {
                ear earVar = this.f13076a;
                kpp kppVar2 = kppVar;
                synchronized (earVar) {
                    String str = (String) kppVar2.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    kpl kplVar = str != null ? (kpl) kppVar2.mo9520g().get(str) : null;
                    if (kplVar == null) {
                        kplVar = kppVar2;
                    }
                    if (str == null) {
                        str = BEeWZPor.CMvjqnY;
                    }
                    String str2 = str;
                    switch (earVar.f13079b) {
                        case 0:
                            if (ivs.f32325e == null || ivs.f32326f == null) {
                                ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1235)).mo17290o("Null OIS keys (version: 0)");
                            } else {
                                long[] jArr = (long[]) kplVar.mo9517d(ivs.f32324d);
                                int[] iArr = (int[]) kplVar.mo9517d(ivs.f32325e);
                                int[] iArr2 = (int[]) kplVar.mo9517d(ivs.f32326f);
                                if (jArr == null || iArr == null || iArr2 == null) {
                                    ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1239)).mo17290o("Null pointer for OIS data. OIS API version: 0");
                                } else {
                                    for (int i = 0; i < jArr.length; i++) {
                                        earVar.m7005i(jArr[i], iArr[i], iArr2[i], str2);
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (ivs.f32327g == null || ivs.f32328h == null) {
                                ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1236)).mo17290o("Null OIS keys (version: 1)");
                            } else {
                                long[] jArr2 = (long[]) kplVar.mo9517d(ivs.f32324d);
                                float[] fArr = (float[]) kplVar.mo9517d(ivs.f32327g);
                                float[] fArr2 = (float[]) kplVar.mo9517d(ivs.f32328h);
                                if (jArr2 == null || fArr == null || fArr2 == null) {
                                    ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1240)).mo17290o("Null pointer for OIS data. OIS API version: 1");
                                } else {
                                    for (int i2 = 0; i2 < jArr2.length; i2++) {
                                        earVar.m7005i(jArr2[i2], fArr[i2], fArr2[i2], str2);
                                    }
                                }
                            }
                            break;
                        case 2:
                            if (CaptureResult.STATISTICS_OIS_SAMPLES == null) {
                                ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1237)).mo17290o("Null OIS key (version: 2)");
                            } else {
                                OisSample[] oisSampleArr = (OisSample[]) kplVar.mo9517d(CaptureResult.STATISTICS_OIS_SAMPLES);
                                if (oisSampleArr != null) {
                                    for (OisSample oisSample : oisSampleArr) {
                                        earVar.m7005i(oisSample.getTimestamp(), oisSample.getXshift(), oisSample.getYshift(), str2);
                                    }
                                } else {
                                    ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1241)).mo17290o("Null pointer for OIS data. OIS API version: 2");
                                    Long l = (Long) kplVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                                    earVar.m7005i(l == null ? 0L : l.longValue(), 0.0f, 0.0f, str2);
                                }
                            }
                            break;
                        case 3:
                            if (ivw.f32432r == null || ivw.f32433s == null) {
                                ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1238)).mo17290o(IuyLAqNmW.LjWTLwnwkKdWRR);
                            } else {
                                long[] jArr3 = (long[]) kplVar.mo9517d(ivw.f32431q);
                                int[] iArr3 = (int[]) kplVar.mo9517d(ivw.f32432r);
                                int[] iArr4 = (int[]) kplVar.mo9517d(ivw.f32433s);
                                if (jArr3 == null || iArr3 == null || iArr4 == null) {
                                    ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G((char) 1242)).mo17290o("Null pointer for OIS data. OIS API version: 3");
                                } else {
                                    for (int i3 = 0; i3 < jArr3.length; i3++) {
                                        earVar.m7005i(jArr3[i3], iArr3[i3], iArr4[i3], str2);
                                    }
                                }
                            }
                            break;
                        default:
                            ((nbe) ((nbe) ((nbe) ear.f13078a.m17251b()).mo17277H(TimeUnit.MILLISECONDS)).mo17276G(1234)).mo17291p("Invalid OIS API version: %d", earVar.f13079b);
                            break;
                    }
                    Iterator it = earVar.f13080c.iterator();
                    while (it.hasNext()) {
                        ((kfv) it.next()).mo3408bu(kppVar2);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m7005i(long j, float f, float f2, String str) {
        Iterator it = this.f13082e.iterator();
        while (it.hasNext()) {
            ((eaq) it.next()).mo7004a(j, f, f2, str);
        }
    }
}
