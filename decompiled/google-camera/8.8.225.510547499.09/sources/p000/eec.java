package p000;

import android.hardware.HardwareBuffer;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eec {

    /* JADX INFO: renamed from: a */
    public static final imv f13604a = new imv(40.0f);

    /* JADX INFO: renamed from: b */
    public static final imv f13605b = new imv(200.0f);

    /* JADX INFO: renamed from: c */
    public final kbo f13606c;

    /* JADX INFO: renamed from: d */
    public final ohb f13607d;

    /* JADX INFO: renamed from: e */
    public final ohb f13608e;

    /* JADX INFO: renamed from: f */
    public final nsz f13609f;

    /* JADX INFO: renamed from: g */
    public final edk f13610g;

    /* JADX INFO: renamed from: h */
    public final dhv f13611h;

    /* JADX INFO: renamed from: i */
    public final mrm f13612i;

    /* JADX INFO: renamed from: j */
    public final gdz f13613j;

    /* JADX INFO: renamed from: k */
    public final edp f13614k;

    /* JADX INFO: renamed from: l */
    private final ohb f13615l;

    /* JADX INFO: renamed from: m */
    private final ohb f13616m;

    /* JADX INFO: renamed from: n */
    private final ohb f13617n;

    /* JADX INFO: renamed from: o */
    private final mrm f13618o;

    /* JADX INFO: renamed from: p */
    private final gtl f13619p;

    /* JADX INFO: renamed from: q */
    private final dzr f13620q;

    public eec(kbo kboVar, ohb ohbVar, ohb ohbVar2, ohb ohbVar3, ohb ohbVar4, ohb ohbVar5, nsz nszVar, edk edkVar, dhv dhvVar, mrm mrmVar, mrm mrmVar2, gdz gdzVar, edp edpVar, gtl gtlVar, dzr dzrVar) {
        this.f13606c = kboVar.mo6314a("PostprocOps");
        this.f13615l = ohbVar;
        this.f13616m = ohbVar4;
        this.f13607d = ohbVar2;
        this.f13617n = ohbVar3;
        this.f13608e = ohbVar5;
        this.f13609f = nszVar;
        this.f13610g = edkVar;
        this.f13611h = dhvVar;
        this.f13612i = mrmVar;
        this.f13613j = gdzVar;
        this.f13618o = mrmVar2;
        this.f13614k = edpVar;
        this.f13619p = gtlVar;
        this.f13620q = dzrVar;
    }

    /* JADX INFO: renamed from: j */
    public static final eea m7204j(eea eeaVar) {
        InterleavedImageU8 interleavedImageU8 = eeaVar.f13584a;
        interleavedImageU8.getClass();
        YuvImage yuvImage = new YuvImage(interleavedImageU8.m5004c(), interleavedImageU8.m5003b(), nsh.f44394b);
        InterleavedReadViewU8 interleavedReadViewU8M5005e = interleavedImageU8.m5005e();
        YuvWriteView yuvWriteViewM17720f = ntw.m17720f(yuvImage);
        long j = interleavedReadViewU8M5005e.f8300a;
        long jM5150c = YuvWriteView.m5150c(yuvWriteViewM17720f);
        lku.m15670x(j != 0, yTyWiTtGtnBhy.KLdlZ);
        lku.m15670x(jM5150c != 0, "dst view is null");
        YuvUtils.rgbToYuvImpl(j, jM5150c);
        eev eevVar = new eev(yuvImage, eeaVar.f13590g);
        interleavedImageU8.m5007g();
        edz edzVarM7203b = eeaVar.m7203b();
        edzVarM7203b.m7191b();
        edzVarM7203b.f13534b = eevVar;
        return edzVarM7203b.m7190a();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final eea m7205a(eea eeaVar) {
        this.f13606c.mo13947i("Apply Face Deblur (RGB).");
        InterleavedImageU8 interleavedImageU8 = eeaVar.f13584a;
        interleavedImageU8.getClass();
        drk drkVar = (drk) this.f13617n.get();
        InterleavedImageU8 interleavedImageU9 = eeaVar.f13593j;
        try {
            try {
                drn drnVar = eeaVar.f13592i;
                ?? r2 = eeaVar.f13597n.f25502c;
                if (drnVar == null) {
                    this.f13606c.mo13942d("Can't apply face deblur, empty face metadata");
                    return eeaVar;
                }
                dhv dhvVar = this.f13611h;
                dhw dhwVar = dhq.f11154a;
                dhvVar.mo6177e();
                ((Boolean) drkVar.mo6620a(new drj(interleavedImageU8, drnVar, interleavedImageU9, r2.mo9905k(), eeaVar.f13587d)).get()).booleanValue();
                if (interleavedImageU9 != null) {
                    interleavedImageU9.m5007g();
                }
                edz edzVarM7203b = eeaVar.m7203b();
                edzVarM7203b.f13538f = null;
                return edzVarM7203b.m7190a();
            } catch (Throwable th) {
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            this.f13606c.mo13948j(voNZjxiJou.EgMyQkqVCWFr, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final eea m7206b(eea eeaVar) {
        eev eevVar = eeaVar.f13585b;
        if (eevVar == null) {
            this.f13606c.mo13947i("Input Yuv image is unavailable.");
            return eeaVar;
        }
        this.f13606c.mo13947i("Extract face metadata from yuv image.");
        mrm mrmVarMo6643b = ((dro) ((mrq) this.f13618o).f41482a).mo6643b(eeaVar.f13587d, eevVar);
        if (!mrmVarMo6643b.mo16813g()) {
            return eeaVar;
        }
        edz edzVarM7203b = eeaVar.m7203b();
        edzVarM7203b.f13537e = (drn) mrmVarMo6643b.mo16809c();
        return edzVarM7203b.m7190a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final eea m7207c(eea eeaVar, boolean z) {
        InterleavedImageU8 interleavedImageU8 = eeaVar.f13584a;
        interleavedImageU8.getClass();
        edk edkVar = this.f13610g;
        edk edkVar2 = edk.LONG_EXPOSURE;
        gtz gtzVar = (gtz) ((mrm) this.f13608e.get()).mo16809c();
        gug gugVarMo4258a = gtzVar.mo4258a();
        InterleavedImageU8 interleavedImageU9 = this.f13611h.mo6184l(dhq.f11154a) ? new InterleavedImageU8(interleavedImageU8.m5004c(), interleavedImageU8.m5003b(), 1) : null;
        InterleavedWriteViewU8 interleavedWriteViewU8M5006f = interleavedImageU9 == null ? null : interleavedImageU9.m5006f();
        gtzVar.mo4260c(interleavedImageU8.m5006f(), eeaVar.f13587d, edkVar == edkVar2, z, eeaVar.f13597n.f25502c.mo9913s(), gugVarMo4258a, eeaVar.f13597n.f25502c.mo9905k(), new eeb(this, eeaVar, z, new AtomicReference(null), 1), interleavedWriteViewU8M5006f);
        edz edzVarM7203b = eeaVar.m7203b();
        edzVarM7203b.f13539g = gugVarMo4258a;
        edzVarM7203b.f13538f = interleavedImageU9;
        return edzVarM7203b.m7190a();
    }

    /* JADX INFO: renamed from: d */
    public final eea m7208d(eea eeaVar) {
        HardwareBuffer hardwareBuffer = eeaVar.f13586c;
        hardwareBuffer.getClass();
        InterleavedImageU8 interleavedImageU8Mo4265h = ((gtz) ((mrm) this.f13608e.get()).mo16809c()).mo4265h(hardwareBuffer);
        edz edzVarM7203b = eeaVar.m7203b();
        edzVarM7203b.m7191b();
        edzVarM7203b.f13533a = interleavedImageU8Mo4265h;
        return edzVarM7203b.m7190a();
    }

    /* JADX INFO: renamed from: e */
    public final eea m7209e(eea eeaVar) {
        eev eevVar = eeaVar.f13585b;
        eevVar.getClass();
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(eevVar.mo7247c(), eevVar.mo7246b(), 3);
        YuvWriteView yuvWriteViewM17650c = this.f13609f.m17650c(eevVar);
        YuvUtils.m5155a(ntw.m17719e(yuvWriteViewM17650c), interleavedImageU8.m5006f());
        edz edzVarM7203b = eeaVar.m7203b();
        edzVarM7203b.m7191b();
        edzVarM7203b.f13533a = interleavedImageU8;
        return edzVarM7203b.m7190a();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final void m7210f(eea eeaVar, dzk dzkVar) {
        try {
            this.f13620q.mo6974c(eeaVar.f13597n.f25502c.mo9900f().f26832a, dzkVar);
        } catch (IOException e) {
            this.f13606c.mo13943e("Error adding badge for Swiss image:  %s", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7211g(eea eeaVar) {
        if (eeaVar == null) {
            this.f13606c.mo13940b("Original image is absent. Skip saving the original image.");
            return false;
        }
        edp edpVar = this.f13614k;
        eay eayVarM7176a = edn.m7176a();
        eayVarM7176a.m7034f(true);
        eayVarM7176a.f13151b = "glare_removal_original";
        eayVarM7176a.f13152c = dzk.DOGFOOD_ONLY;
        edpVar.m7179a(eeaVar, eayVarM7176a.m7029a());
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final void m7212h(eea eeaVar) {
        eeaVar.f13584a.getClass();
        try {
            if (eeaVar.f13592i == null) {
                this.f13606c.mo13942d("[Dereflection] Can't apply eyeglasses dereflection, empty face metadata");
                return;
            }
            AtomicReference atomicReference = new AtomicReference(null);
            eeaVar.f13597n.f25502c.mo9905k();
            if (((Boolean) ((npp) kxk.m14965K(false)).f44033b).booleanValue() && m7211g((eea) atomicReference.get())) {
                this.f13606c.mo13940b("[Anglerfish] Save the original image as burst.");
                m7210f(eeaVar, dzk.DOGFOOD_ONLY);
            }
        } catch (InterruptedException | ExecutionException e) {
            this.f13606c.mo13948j("Can't apply anglerfish (RGB)", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final void m7213i(eea eeaVar) {
        eev eevVar = eeaVar.f13585b;
        eevVar.getClass();
        try {
            drb drbVar = (drb) ((drc) this.f13615l.get()).mo6564a(new cvy(eevVar, eeaVar.f13596m.f13246a, eeaVar.f13589f, mrm.m16828h(this.f13619p.mo9759d(eeaVar.f13590g)))).get();
            drbVar.mo6598b(eeaVar.f13597n.f25502c.mo9905k());
            if (drbVar.mo6599c()) {
                ShotMetadata shotMetadata = eeaVar.f13587d;
                shotMetadata.m5108n(String.valueOf(shotMetadata.m5103i()).concat("b"));
            }
        } catch (InterruptedException | ExecutionException e) {
            this.f13606c.mo13948j("Can't apply post-processing", e);
        }
    }
}
