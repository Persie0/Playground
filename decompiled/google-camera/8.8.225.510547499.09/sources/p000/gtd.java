package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.Tuning;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;
import java.util.Timer;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtd {

    /* JADX INFO: renamed from: a */
    public final Object f26334a;

    /* JADX INFO: renamed from: b */
    public final Object f26335b;

    public gtd() {
        this.f26334a = new TreeMap();
        this.f26335b = new TreeMap();
    }

    public gtd(Activity activity) {
        this.f26334a = activity;
        this.f26335b = new jwf(Boolean.valueOf(activity.isInMultiWindowMode()));
    }

    public gtd(Context context, gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f26335b = context;
        this.f26334a = gtdVar;
    }

    public gtd(bon bonVar, bon bonVar2) {
        this.f26335b = bonVar;
        this.f26334a = bonVar2;
    }

    public gtd(chk chkVar, dhv dhvVar) {
        this.f26335b = dhvVar;
        this.f26334a = chkVar;
    }

    public gtd(Tuning tuning, kpp kppVar) {
        this.f26335b = tuning;
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        if (faceArr == null) {
            throw new IllegalStateException("STATISTICS_FACES not present in metadata.");
        }
        if (rect == null) {
            throw new IllegalStateException("SCALER_CROP_REGION not present in metadata.");
        }
        this.f26334a = new igp(faceArr, rect, l != null ? l.longValue() : 0L);
    }

    public gtd(cwd cwdVar, fcp fcpVar, byte[] bArr, byte[] bArr2) {
        this.f26334a = cwdVar;
        this.f26335b = fcpVar;
    }

    public gtd(dhv dhvVar, UserManager userManager) {
        this.f26334a = dhvVar;
        this.f26335b = userManager;
    }

    public gtd(esz eszVar) {
        this.f26334a = eszVar;
        this.f26335b = ohh.m18486b(new hhy(eszVar.f16350A, 17));
    }

    public gtd(fuo fuoVar, fuo fuoVar2) {
        this.f26335b = fuoVar;
        this.f26334a = fuoVar2;
    }

    public gtd(gax gaxVar, jvd jvdVar) {
        this.f26335b = gaxVar;
        this.f26334a = jvdVar;
    }

    public gtd(glk glkVar, kbn kbnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f26334a = glkVar;
        this.f26335b = kbnVar.mo6314a("CptModuleCfgBldr");
    }

    public gtd(grj grjVar, Set set) {
        this.f26334a = grjVar;
        this.f26335b = set;
    }

    public gtd(gtd gtdVar, oju ojuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f26334a = gtdVar;
        this.f26335b = ojuVar;
    }

    public gtd(ikw ikwVar) {
        this.f26335b = mxk.m17136H(ikw.PHOTO_SPHERE);
        this.f26334a = ikwVar;
    }

    public gtd(imu imuVar, jwn jwnVar) {
        this.f26335b = imuVar;
        this.f26334a = jwnVar;
    }

    public gtd(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f26335b = byteBuffer;
        this.f26334a = bufferInfo;
    }

    public gtd(jww jwwVar, Context context) {
        this.f26335b = jwwVar;
        this.f26334a = context;
    }

    public gtd(kbo kboVar) {
        this.f26334a = new jvb();
        this.f26335b = kboVar.mo6314a("EndOnShutdown");
    }

    public gtd(kgx kgxVar, FrameRequest frameRequest) {
        this.f26335b = kgxVar;
        this.f26334a = frameRequest;
    }

    public gtd(kpb kpbVar, dhv dhvVar) {
        this.f26334a = kpbVar;
        this.f26335b = dhvVar;
    }

    public gtd(nps npsVar, nps npsVar2) {
        this.f26335b = npsVar;
        this.f26334a = npsVar2;
    }

    public gtd(oju ojuVar, oju ojuVar2) {
        ojuVar.getClass();
        this.f26335b = ojuVar;
        this.f26334a = ojuVar2;
    }

    public gtd(byte[] bArr) {
        this.f26334a = new fus(this, null, null);
        this.f26335b = new Object();
    }

    public gtd(float[] fArr, float[] fArr2) {
        this.f26334a = fArr;
        this.f26335b = fArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9733e() {
        return (ivv.f32394c == null || ivv.f32393b == null || ivv.f32395d == null) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static void m9734o(Context context) {
        context.startService(new Intent(context, (Class<?>) NoOpPrewarmService.class));
    }

    /* JADX INFO: renamed from: q */
    public static final Handler m9735q() {
        return jvh.m13557e(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: s */
    public static final Timer m9736s() {
        return new Timer();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9737a(long j, obh obhVar, obi obiVar) {
        Object obj = this.f26334a;
        Long lValueOf = Long.valueOf(j);
        ((TreeMap) obj).put(lValueOf, obhVar);
        ((TreeMap) this.f26335b).put(lValueOf, obiVar);
        while (((TreeMap) this.f26334a).size() > 1000) {
            Object obj2 = this.f26334a;
            ((TreeMap) obj2).remove(((TreeMap) obj2).firstKey());
            Object obj3 = this.f26335b;
            ((TreeMap) obj3).remove(((TreeMap) obj3).firstKey());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9738b(long j) {
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m9739c(long j) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final int m9740d(kmd kmdVar) {
        int iIntValue = ((Integer) this.f26335b.mo6173a(dil.f11615a).get()).intValue();
        int iIntValue2 = -1;
        if (m9733e()) {
            try {
                iIntValue2 = ((Integer) kmdVar.mo14560m(ivv.f32395d, -1)).intValue();
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return Math.min(iIntValue, iIntValue2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: f */
    public final fps m9741f(ohb ohbVar, ftm ftmVar, fqi fqiVar) {
        gti gtiVar = (gti) this.f26335b.get();
        gtiVar.getClass();
        ((gtb) this.f26334a).get();
        ohbVar.getClass();
        fqiVar.getClass();
        return new fps(gtiVar, ohbVar, ftmVar, fqiVar);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9742g() {
        return ((mxk) this.f26335b).contains(this.f26334a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ihv, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final flz m9743h(kmg kmgVar, ikw ikwVar) {
        glk glkVar = (glk) this.f26334a;
        glkVar.f25503d.mo13961e("OneConfig#create");
        glkVar.f25503d.mo13961e("OneConfig#oneCharacteristics");
        fvu fvuVarM14581f = ((kms) glkVar.f25502c).m14581f(kmgVar);
        kmq kmqVarMo14558k = fvuVarM14581f.mo14558k();
        glkVar.f25503d.mo13963g("OneConfig#pictureSize");
        kbc kbcVarM10082a = ((hbg) glkVar.f25500a).m10082a(kmgVar, kmqVarMo14558k);
        glkVar.f25503d.mo13963g("OneConfig#selectViewfinder");
        kbc kbcVarMo11324b = glkVar.f25501b.mo11324b(fvuVarM14581f.mo14572y(), kan.m13873j(kbcVarM10082a), kmqVarMo14558k, ikwVar, kmgVar);
        ihx ihxVarM11369a = ihx.m11369a(kmqVarMo14558k, kbcVarMo11324b, kan.m13873j(kbcVarMo11324b));
        glkVar.f25503d.mo13962f();
        kan kanVarM13873j = kan.m13873j(kbcVarM10082a);
        if (kmqVarMo14558k == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        flz flzVar = new flz(kmgVar, kmqVarMo14558k, kanVarM13873j, kbcVarM10082a, ihxVarM11369a);
        glkVar.f25503d.mo13962f();
        this.f26335b.mo13944f("Selected configuration for camera (" + kmgVar.f36540a + "): " + flzVar.toString());
        return flzVar;
    }

    /* JADX INFO: renamed from: i */
    public final flf m9744i(flf flfVar) {
        fkx fkxVar = new fkx(this, flfVar, null, null, null);
        ((jvb) this.f26334a).m13537d(fkxVar.f22428a);
        return fkxVar;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m9745j() {
        ((jvb) this.f26334a).close();
    }

    /* JADX INFO: renamed from: k */
    public final float m9746k(float f) {
        int iBinarySearch = Arrays.binarySearch((float[]) this.f26334a, f);
        if (iBinarySearch == -1) {
            return ((float[]) this.f26335b)[0];
        }
        if (iBinarySearch < -201) {
            return ((float[]) this.f26335b)[200];
        }
        if (iBinarySearch >= 0) {
            return ((float[]) this.f26335b)[iBinarySearch];
        }
        int i = (-iBinarySearch) - 1;
        int i2 = i - 1;
        float[] fArr = (float[]) this.f26334a;
        float f2 = fArr[i2];
        float[] fArr2 = (float[]) this.f26335b;
        float f3 = fArr2[i2];
        float f4 = fArr[i];
        float f5 = fArr2[i];
        if (f <= f2) {
            return f3;
        }
        if (f >= f4) {
            return f5;
        }
        return f3 + (((f - f2) / (f4 - f2)) * (f5 - f3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [chk, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final void m9747l(long j) {
        if (!this.f26335b.mo6173a(did.f11456j).isPresent() || j >= ((Integer) this.f26335b.mo6173a(did.f11456j).get()).intValue()) {
            this.f26334a.mo3693g().mo3721k();
        }
    }

    /* JADX WARN: Type inference failed for: r12v24, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: m */
    public final void m9748m(LinkChipResult linkChipResult, kwe kweVar, int i, String str) {
        if (i == 3) {
            cwd cwdVar = (cwd) this.f26334a;
            if (((Long) cwdVar.f9866a.mo3831be()).longValue() == 0) {
                cwdVar.f9866a.mo3415bf(Long.valueOf(System.currentTimeMillis()));
                i = 3;
            } else {
                i = 3;
            }
        }
        nxl nxlVarM18137O = nkd.f43176e.m18137O();
        int i2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}[linkChipResult.getResultType()];
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkd nkdVar = (nkd) nxlVarM18137O.f44974b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        nkdVar.f43179b = i3;
        nkdVar.f43178a |= 1;
        int i4 = new int[]{1, 2, 3, 4}[linkChipResult.getActionType()];
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkd nkdVar2 = (nkd) nxlVarM18137O.f44974b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        nkdVar2.f43180c = i5;
        nkdVar2.f43178a |= 2;
        if (linkChipResult.getCenterpoint() != null) {
            nxl nxlVarM18137O2 = njq.f43060d.m18137O();
            Point centerpoint = linkChipResult.getCenterpoint();
            centerpoint.getClass();
            float f = centerpoint.x;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            njq njqVar = (njq) nxlVarM18137O2.f44974b;
            njqVar.f43062a |= 1;
            njqVar.f43063b = f;
            Point centerpoint2 = linkChipResult.getCenterpoint();
            centerpoint2.getClass();
            float f2 = centerpoint2.y;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            njq njqVar2 = (njq) nxlVarM18137O2.f44974b;
            njqVar2.f43062a |= 2;
            njqVar2.f43064c = f2;
            njq njqVar3 = (njq) nxlVarM18137O2.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkd nkdVar3 = (nkd) nxlVarM18137O.f44974b;
            njqVar3.getClass();
            nkdVar3.f43181d = njqVar3;
            nkdVar3.f43178a |= 4;
        }
        nkd nkdVar4 = (nkd) nxlVarM18137O.mo18103l();
        long jLongValue = ((Long) ((cwd) this.f26334a).f9866a.mo3831be()).longValue();
        mrm mrmVarM16829i = jLongValue == 0 ? mqu.f41450a : mrm.m16829i(Long.valueOf(jLongValue));
        nxl nxlVarM18137O3 = nkc.f43167h.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O3.f44974b;
        nkc nkcVar = (nkc) nxqVar;
        nkdVar4.getClass();
        nkcVar.f43170b = nkdVar4;
        nkcVar.f43169a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nkc nkcVar2 = (nkc) nxlVarM18137O3.f44974b;
        nkcVar2.f43171c = i - 1;
        nkcVar2.f43169a |= 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nkc nkcVar3 = (nkc) nxlVarM18137O3.f44974b;
        nkcVar3.f43169a |= 16;
        nkcVar3.f43174f = jCurrentTimeMillis;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        kwd kwdVar = kweVar.f37499b;
        if (kwdVar == null) {
            kwdVar = kwd.f37492b;
        }
        long millis = timeUnit.toMillis(kwdVar.f37494a);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nkc nkcVar4 = (nkc) nxlVarM18137O3.f44974b;
        nkcVar4.f43169a |= 32;
        nkcVar4.f43175g = millis;
        if (mrmVarM16829i.mo16813g()) {
            long jLongValue2 = ((Long) mrmVarM16829i.mo16809c()).longValue();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nkc nkcVar5 = (nkc) nxlVarM18137O3.f44974b;
            nkcVar5.f43169a |= 8;
            nkcVar5.f43173e = jLongValue2;
        }
        kwc kwcVar = kweVar.f37500c;
        if (kwcVar == null) {
            kwcVar = kwc.f37486d;
        }
        mfg mfgVar = kwcVar.f37489b;
        if (mfgVar == null) {
            mfgVar = mfg.f40322b;
        }
        if (mfgVar.f40324a.size() > 0) {
            kwc kwcVar2 = kweVar.f37500c;
            if (kwcVar2 == null) {
                kwcVar2 = kwc.f37486d;
            }
            mfg mfgVar2 = kwcVar2.f37489b;
            if (mfgVar2 == null) {
                mfgVar2 = mfg.f40322b;
            }
            int iM15030w = kxk.m15030w(((mfe) mfgVar2.f40324a.get(0)).f40314b);
            int i6 = iM15030w != 0 ? iM15030w : 1;
            nea.m17398l();
            int i7 = nea.m17398l()[i6 - 1];
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nkc nkcVar6 = (nkc) nxlVarM18137O3.f44974b;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            nkcVar6.f43172d = i8;
            nkcVar6.f43169a |= 4;
        }
        ?? r12 = this.f26335b;
        nxl nxlVarM18137O4 = nke.f43182f.m18137O();
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nke nkeVar = (nke) nxlVarM18137O4.f44974b;
        str.getClass();
        nkeVar.f43184a |= 8;
        nkeVar.f43188e = str;
        nkc nkcVar7 = (nkc) nxlVarM18137O3.mo18103l();
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        nke nkeVar2 = (nke) nxlVarM18137O4.f44974b;
        nkcVar7.getClass();
        nkeVar2.f43186c = nkcVar7;
        nkeVar2.f43184a |= 2;
        r12.mo8203w((nke) nxlVarM18137O4.mo18103l());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9749n() {
        return ((gtd) this.f26334a).m9750p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final boolean m9750p() {
        return this.f26334a.mo6184l(dib.f11248aH) && ((UserManager) this.f26335b).isSystemUser();
    }

    /* JADX INFO: renamed from: r */
    public final ActivityC0157ei m9751r() {
        lku.m15669w(true);
        return (ActivityC0157ei) this.f26334a;
    }

    public gtd(Application application, Context context) {
        context.getClass();
        this.f26334a = application;
        this.f26335b = context;
    }

    public gtd(oju ojuVar, oju ojuVar2, byte[] bArr) {
        ojuVar.getClass();
        this.f26335b = ojuVar;
        ojuVar2.getClass();
        this.f26334a = ojuVar2;
    }
}
