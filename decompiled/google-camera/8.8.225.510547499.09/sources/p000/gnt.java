package p000;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayWriteViewU16;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnt extends gni {

    /* JADX INFO: renamed from: e */
    private final boolean f25791e;

    /* JADX INFO: renamed from: f */
    private final cem f25792f;

    /* JADX INFO: renamed from: g */
    private final kbc f25793g;

    /* JADX INFO: renamed from: h */
    private final gpx f25794h;

    public gnt(gpx gpxVar, dsx dsxVar, DynamicDepthUtils dynamicDepthUtils, gva gvaVar, gkz gkzVar, Executor executor, gvw gvwVar, cem cemVar, gdz gdzVar, djm djmVar, kbz kbzVar, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(dsxVar, dynamicDepthUtils, gvaVar, gkzVar, cemVar, gdzVar, djmVar, executor, kbzVar, bkoVar, null, null, null, null);
        this.f25791e = gvwVar.mo9812h(kmq.f36557a);
        this.f25792f = cemVar;
        this.f25793g = gdzVar.f24348b;
        this.f25794h = gpxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gyh, java.lang.Object] */
    @Override // p000.gni
    /* JADX INFO: renamed from: j */
    protected final DynamicDepthResult mo9551j(gmc gmcVar, gnj gnjVar) throws Throwable {
        long jMo9617a;
        kpw kpwVar;
        kbz kbzVar;
        kpw kpwVarM9498g = gmcVar.m9498g();
        kpw kpwVarM9494c = gmcVar.m9494c(((gva) gmcVar.f25582b).f26470a);
        gnjVar.m9554g();
        if (kpwVarM9494c == null || kpwVarM9498g == null) {
            if (kpwVarM9494c != null) {
                kpwVarM9494c.close();
            }
            if (kpwVarM9498g == 0) {
                return null;
            }
            kpwVarM9498g.close();
            return null;
        }
        boolean zM6221B = this.f25728d.m6221B();
        if (zM6221B) {
            gpx gpxVar = this.f25794h;
            if (gpxVar == null) {
                return null;
            }
            if (gpxVar.mo9617a() == 0) {
                this.f25794h.mo9618b();
            }
            jMo9617a = this.f25794h.mo9617a();
        } else {
            jMo9617a = 0;
        }
        gnjVar.f25745t.f25502c.mo9902h();
        this.f25728d.m6223D();
        try {
            ShotMetadata shotMetadata = (ShotMetadata) gnjVar.f25738m.get();
            this.f25726b.mo13961e("udepth#process");
            DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.f25793g, this.f25792f.m3566d().ordinal(), this.f25791e, gnjVar.f25744s.f13251f, gmcVar.f25581a.mo7042c());
            nsz nszVar = new nsz();
            int iMo7245a = kpwVarM9494c.mo7245a();
            List listMo7251g = kpwVarM9494c.mo7251g();
            lku.m15672z(listMo7251g.size() == 1, "Should have a single depth plane, has: %s", listMo7251g.size());
            lku.m15672z(iMo7245a == 1144402265, "Unsupported format: %s", iMo7245a);
            ByteBuffer buffer = ((kpv) listMo7251g.get(0)).getBuffer();
            int iRemaining = buffer.remaining();
            int pixelStride = ((kpv) listMo7251g.get(0)).getPixelStride();
            lku.m15670x(pixelStride == 2, "Pixel stride should be two bytes.");
            int iMo7247c = kpwVarM9494c.mo7247c();
            int iMo7246b = kpwVarM9494c.mo7246b();
            int rowStride = ((kpv) listMo7251g.get(0)).getRowStride();
            int i = rowStride / 2;
            int i2 = pixelStride * iMo7247c;
            lku.m15608C(rowStride >= i2, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i2);
            lku.m15611F(iRemaining == rowStride * iMo7246b, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iMo7246b));
            GrayWriteViewU16 grayWriteViewU16 = (GrayWriteViewU16) ((mrq) mrm.m16829i(new GrayWriteViewU16(GcamModuleJNI.new_GrayWriteViewU16__SWIG_1(iMo7247c, iMo7246b, 1, BufferUtils.m4902a(buffer), i)))).f41482a;
            kpwVar = kpwVarM9498g;
            try {
                if (DynamicDepthUtils.createDynamicDepthFromUltradepthImpl(jMo9617a, grayWriteViewU16.f8281a, YuvWriteView.m5150c(nszVar.m17650c(kpwVarM9498g)), ShotMetadata.m5095a(shotMetadata), zM6221B, dynamicDepthResult.f6629a)) {
                    this.f25726b.mo13962f();
                    kpwVarM9494c.close();
                    kpwVar.close();
                    return dynamicDepthResult;
                }
                dynamicDepthResult.close();
                kpwVar.close();
                kbzVar = this.f25726b;
            } catch (Exception e) {
                kbzVar = this.f25726b;
            } catch (Throwable th) {
                th = th;
                this.f25726b.mo13962f();
                kpwVarM9494c.close();
                kpwVar.close();
                throw th;
            }
        } catch (Exception e2) {
            kpwVar = kpwVarM9498g;
        } catch (Throwable th2) {
            th = th2;
            kpwVar = kpwVarM9498g;
        }
        kbzVar.mo13962f();
        kpwVarM9494c.close();
        kpwVar.close();
        return null;
    }
}
