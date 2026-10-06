package p000;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.ImageUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frm implements frl {

    /* JADX INFO: renamed from: a */
    private final kbo f23326a;

    /* JADX INFO: renamed from: b */
    private final mrm f23327b;

    /* JADX INFO: renamed from: c */
    private final ohb f23328c;

    /* JADX INFO: renamed from: d */
    private final long f23329d;

    /* JADX INFO: renamed from: e */
    private final DynamicDepthUtils f23330e;

    /* JADX INFO: renamed from: f */
    private final nsz f23331f = new nsz();

    /* JADX INFO: renamed from: g */
    private final mrm f23332g;

    /* JADX INFO: renamed from: h */
    private final gtl f23333h;

    public frm(kbo kboVar, mrm mrmVar, ohb ohbVar, long j, DynamicDepthUtils dynamicDepthUtils, mrm mrmVar2, gtl gtlVar) {
        this.f23326a = kboVar.mo6314a(frm.class.getSimpleName());
        this.f23327b = mrmVar;
        this.f23328c = ohbVar;
        this.f23329d = j;
        this.f23330e = dynamicDepthUtils;
        this.f23332g = mrmVar2;
        this.f23333h = gtlVar;
    }

    /* JADX INFO: renamed from: c */
    private final kpw m8716c(HardwareBuffer hardwareBuffer, long j, ShotMetadata shotMetadata) {
        if (!this.f23327b.mo16813g()) {
            return new kno(hardwareBuffer, j);
        }
        HardwareBuffer hardwareBufferAllocateHardwareBuffer = MomentsUtils.allocateHardwareBuffer(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), hardwareBuffer.getFormat(), 1, this.f23329d | 768);
        if (hardwareBufferAllocateHardwareBuffer == null) {
            this.f23326a.mo13942d("Unable to allocate output buffer for rectiface, return image without warping.");
            return new kno(hardwareBuffer, j);
        }
        if (((gtz) this.f23327b.mo16809c()).mo4263f(hardwareBuffer, hardwareBufferAllocateHardwareBuffer, shotMetadata)) {
            hardwareBuffer.close();
            return new kno(hardwareBufferAllocateHardwareBuffer, j);
        }
        hardwareBufferAllocateHardwareBuffer.close();
        return new kno(hardwareBuffer, j);
    }

    /* JADX INFO: renamed from: d */
    private final kpw m8717d(drc drcVar, kpw kpwVar, iay iayVar) {
        long jNanoTime = System.nanoTime();
        try {
            drb drbVar = (drb) drcVar.mo6564a(new cvy(kpwVar, (gzl) iayVar.f30189a, (kpp) ((npp) iayVar.f30192d).f44033b, mrm.m16828h(this.f23333h.mo9759d(((kno) kpwVar).f36629a)))).get();
            long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - jNanoTime, TimeUnit.NANOSECONDS);
            this.f23326a.mo13940b("Post-processing - image transformer finished. Took " + jConvert + "ms");
            return drbVar.mo6597a();
        } catch (InterruptedException | ExecutionException e) {
            this.f23326a.mo13948j("Couldn't apply post-processing", e);
            return kpwVar;
        }
    }

    @Override // p000.frl
    /* JADX INFO: renamed from: a */
    public final kpw mo8714a(iay iayVar, YuvWriteView yuvWriteView, kpw kpwVar, ShotMetadata shotMetadata) {
        mrm mrmVarM16829i;
        HardwareBuffer hardwareBufferCreate;
        long jLongValue = ((Long) iayVar.f30191c).longValue();
        if (!iayVar.f30190b) {
            mrmVarM16829i = mqu.f41450a;
        } else if (!this.f23332g.mo16813g()) {
            this.f23326a.mo13944f("Fast bokeh controller is absent, skipping blur.");
            mrmVarM16829i = mqu.f41450a;
        } else if (kpwVar.mo7253i()) {
            this.f23326a.mo13944f("No PD data, skipping blur.");
            mrmVarM16829i = mqu.f41450a;
        } else {
            mrm mrmVarM17648a = this.f23331f.m17648a(kpwVar);
            if (!mrmVarM17648a.mo16813g()) {
                this.f23326a.mo13947i("Unable to get RawWriteView from PD, skipping blur.");
                mrmVarM16829i = mqu.f41450a;
            } else if (this.f23330e.m4098c((RawWriteView) mrmVarM17648a.mo16809c(), yuvWriteView, new DynamicDepthResult(kbc.m13903h(yuvWriteView.m5152b(), yuvWriteView.m5151a()), kay.CLOCKWISE_0.ordinal(), false, false, null), shotMetadata)) {
                fts ftsVar = (fts) this.f23332g.mo16809c();
                ntw.m17719e(yuvWriteView);
                InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) ftsVar.m8794a().first;
                HardwareBuffer hardwareBufferCreate2 = HardwareBuffer.create(interleavedImageU8.m5004c(), interleavedImageU8.m5003b(), 3, 1, 51L);
                LockedHardwareBuffer lockedHardwareBufferM5040c = LockedHardwareBuffer.m5040c(hardwareBufferCreate2, 51L);
                try {
                    ImageUtils.m5154a(interleavedImageU8.m5005e(), lockedHardwareBufferM5040c.m5042b());
                    lockedHardwareBufferM5040c.close();
                    mrmVarM16829i = mrm.m16829i(hardwareBufferCreate2);
                } catch (Throwable th) {
                    try {
                        lockedHardwareBufferM5040c.close();
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        } catch (Exception e) {
                            throw th;
                        }
                    }
                }
            } else {
                this.f23326a.mo13947i("Failed to create depth map, skipping blur.");
                mrmVarM16829i = mqu.f41450a;
            }
        }
        if (mrmVarM16829i.mo16813g()) {
            hardwareBufferCreate = (HardwareBuffer) mrmVarM16829i.mo16809c();
        } else {
            eev eevVar = new eev(yuvWriteView, kpwVar.mo7248d());
            int iMo7247c = eevVar.mo7247c();
            int iMo7246b = eevVar.mo7246b();
            hardwareBufferCreate = HardwareBuffer.create(iMo7247c, iMo7246b, 35, 1, 307L);
            kpv kpvVar = (kpv) eevVar.f13754b.get(0);
            kpv kpvVar2 = (kpv) eevVar.f13754b.get(1);
            kpv kpvVar3 = (kpv) eevVar.f13754b.get(2);
            MomentsUtils.yuv2hwyuv(iMo7247c, iMo7246b, kpvVar.getBuffer(), kpvVar.getRowStride(), kpvVar.getPixelStride(), kpvVar2.getBuffer(), kpvVar2.getRowStride(), kpvVar2.getPixelStride(), kpvVar3.getBuffer(), kpvVar3.getRowStride(), kpvVar3.getPixelStride(), hardwareBufferCreate);
        }
        return m8717d((drc) this.f23328c.get(), m8716c(hardwareBufferCreate, jLongValue, shotMetadata), iayVar);
    }

    @Override // p000.frl
    /* JADX INFO: renamed from: b */
    public final kpw mo8715b(iay iayVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return m8717d((drc) this.f23328c.get(), m8716c(hardwareBuffer, ((Long) iayVar.f30191c).longValue(), shotMetadata), iayVar);
    }
}
