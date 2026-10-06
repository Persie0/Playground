package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebg implements ecz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f13211a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ebn f13212b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ewq f13213c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ glk f13214d;

    public ebg(ewq ewqVar, int i, glk glkVar, ebn ebnVar, byte[] bArr, byte[] bArr2) {
        this.f13213c = ewqVar;
        this.f13211a = i;
        this.f13214d = glkVar;
        this.f13212b = ebnVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Type inference failed for: r10v1, types: [gvw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r9v2, types: [gyh, java.lang.Object] */
    @Override // p000.ecz
    /* JADX INFO: renamed from: o */
    public final void mo7053o(eem eemVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        int i;
        this.f13213c.f20674h.mo13961e("PostviewRgbCallback");
        if (((cwd) this.f13213c.f20671e).m5652K()) {
            FrameMetadata frameMetadataM5098d = shotMetadata.m5098d();
            long jFrameMetadata_geometric_calibration_get = GcamModuleJNI.FrameMetadata_geometric_calibration_get(frameMetadataM5098d.f8263a, frameMetadataM5098d);
            GeometricCalibrationVector geometricCalibrationVector = jFrameMetadata_geometric_calibration_get == 0 ? null : new GeometricCalibrationVector(jFrameMetadata_geometric_calibration_get, false);
            if (GcamModuleJNI.GeometricCalibrationVector_isEmpty(geometricCalibrationVector.f8277a, geometricCalibrationVector)) {
                FrameMetadata frameMetadataM5098d2 = shotMetadata.m5098d();
                long jFrameMetadata_mesh_warp_get = GcamModuleJNI.FrameMetadata_mesh_warp_get(frameMetadataM5098d2.f8263a, frameMetadataM5098d2);
                FloatVector floatVectorM5046c = (jFrameMetadata_mesh_warp_get != 0 ? new MeshWarp(jFrameMetadata_mesh_warp_get, false) : null).m5046c();
                if (!GcamModuleJNI.FloatVector_isEmpty(floatVectorM5046c.f8261a, floatVectorM5046c)) {
                    ((gtz) ((cwd) this.f13213c.f20671e).m5651J()).mo4261d(bitmap, shotMetadata);
                }
            } else {
                ((gtz) ((cwd) this.f13213c.f20671e).m5651J()).mo4261d(bitmap, shotMetadata);
            }
        }
        ewq ewqVar = this.f13213c;
        Bitmap bitmapMo9806b = ewqVar.f20672f.mo9806b(bitmap, this.f13211a, ((kmr) ewqVar.f20676j).mo14558k());
        if (bitmapMo9806b.equals(bitmap) && (i = this.f13211a) != 0 && bitmap != null) {
            bitmapMo9806b = ewq.m7951b(bitmap, i);
        }
        ?? r9 = this.f13214d.f25502c;
        if (this.f13212b.f13255j) {
            bitmapMo9806b = dst.m6666a((dsl) this.f13213c.f20677k.get(), bitmapMo9806b, mqu.f41450a);
        }
        r9.mo9892X(bitmapMo9806b, 0);
        this.f13213c.f20674h.mo13962f();
    }
}
