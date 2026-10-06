package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import com.google.android.apps.camera.facemetadata.conversions.jni.MeshWarpInverseNative;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.googlex.gcam.MeshWarp;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpy implements Callable {

    /* JADX INFO: renamed from: a */
    private final long f12267a;

    /* JADX INFO: renamed from: b */
    private final int f12268b;

    /* JADX INFO: renamed from: c */
    private final boolean f12269c;

    /* JADX INFO: renamed from: d */
    private final cvy f12270d;

    public dpy(long j, cvy cvyVar, int i, boolean z, byte[] bArr, byte[] bArr2) {
        this.f12267a = j;
        this.f12270d = cvyVar;
        this.f12268b = i;
        this.f12269c = z;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kpl] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int length;
        int i;
        mrm mrmVar;
        dpy dpyVar = this;
        lku.m15613H(((gzl) dpyVar.f12270d.f9845b).m10016b());
        kpv kpvVar = (kpv) dpyVar.f12270d.f9846c.mo7251g().get(0);
        kpv kpvVar2 = (kpv) dpyVar.f12270d.f9846c.mo7251g().get(1);
        kpv kpvVar3 = (kpv) dpyVar.f12270d.f9846c.mo7251g().get(2);
        kzh kzhVarM15087d = kzi.m15087d(dpyVar.f12270d.f9846c.mo7247c(), dpyVar.f12270d.f9846c.mo7246b());
        Face[] faceArr = (Face[]) dpyVar.f12270d.f9847d.mo9517d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) dpyVar.f12270d.f9847d.mo9517d(CaptureResult.SCALER_CROP_REGION);
        MeshWarp meshWarpM17667l = rect != null ? nta.m17667l(rect, dpyVar.f12270d.f9847d) : null;
        if (faceArr == null || (length = faceArr.length) == 0 || rect == null) {
            return new dqp(dpyVar.f12270d.f9846c);
        }
        FaceToBeautify[] faceToBeautifyArr = new FaceToBeautify[length];
        int i2 = 0;
        while (i2 < faceArr.length) {
            kpe kpeVarM14671a = kpe.m14671a(faceArr[i2]);
            mrm mrmVar2 = (mrm) dpyVar.f12270d.f9844a;
            if (mrmVar2.mo16813g()) {
                mrm mrmVar3 = ((gth) mrmVar2.mo16809c()).f26354p;
                mrmVar = (!mrmVar3.mo16813g() || i2 >= ((gtt) mrmVar3.mo16809c()).f26393a.length) ? mqu.f41450a : ((gtt) mrmVar3.mo16809c()).f26393a[i2].f26392g;
            } else {
                mrmVar = mqu.f41450a;
            }
            if (!meshWarpM17667l.m5048e()) {
                MeshWarpInverseNative.invertMeshWarp(meshWarpM17667l.f8318a);
            }
            Rect rect2 = kpeVarM14671a.f36797c;
            Point point = new Point(rect2.left, rect2.top);
            Face[] faceArr2 = faceArr;
            Point point2 = new Point(rect2.right, rect2.bottom);
            kpv kpvVar4 = kpvVar3;
            Point point3 = new Point(rect2.right, rect2.top);
            Point point4 = new Point(rect2.left, rect2.bottom);
            Point pointM6869e = dxu.m6869e(point, meshWarpM17667l);
            Point pointM6869e2 = dxu.m6869e(point2, meshWarpM17667l);
            Point pointM6869e3 = dxu.m6869e(point3, meshWarpM17667l);
            Point pointM6869e4 = dxu.m6869e(point4, meshWarpM17667l);
            kpv kpvVar5 = kpvVar2;
            kpv kpvVar6 = kpvVar;
            FaceToBeautify[] faceToBeautifyArr2 = faceToBeautifyArr;
            Rect rect3 = new Rect(kxk.m14983aa(pointM6869e.x, pointM6869e2.x, pointM6869e3.x, pointM6869e4.x), kxk.m14983aa(pointM6869e.y, pointM6869e2.y, pointM6869e3.y, pointM6869e4.y), kxk.m14980Z(pointM6869e.x, pointM6869e2.x, pointM6869e3.x, pointM6869e4.x), kxk.m14980Z(pointM6869e.y, pointM6869e2.y, pointM6869e3.y, pointM6869e4.y));
            Point point5 = new Point(rect3.left, rect3.top);
            Point point6 = new Point(rect3.right, rect3.bottom);
            Point pointM6868d = dxu.m6868d(point5, kzhVarM15087d, rect);
            Point pointM6868d2 = dxu.m6868d(point6, kzhVarM15087d, rect);
            Rect rect4 = new Rect(pointM6868d.x, pointM6868d.y, pointM6868d2.x, pointM6868d2.y);
            Point point7 = kpeVarM14671a.f36798d;
            Point point8 = kpeVarM14671a.f36799e;
            Point pointM6868d3 = point8 != null ? dxu.m6868d(dxu.m6869e(point8, meshWarpM17667l), kzhVarM15087d, rect) : null;
            Point pointM6868d4 = point7 != null ? dxu.m6868d(dxu.m6869e(point7, meshWarpM17667l), kzhVarM15087d, rect) : null;
            kvd kvdVarM4117a = FaceToBeautify.m4117a(rect4);
            kvdVarM4117a.f37318a = pointM6868d4;
            kvdVarM4117a.f37325h = pointM6868d3;
            if (mrmVar.mo16813g()) {
                int size = ((mws) mrmVar.mo16809c()).size();
                float[] fArr = new float[size];
                for (int i3 = 0; i3 < size; i3++) {
                    Float f = (Float) ((mws) mrmVar.mo16809c()).get(i3);
                    fArr[i3] = f == null ? -1.0f : f.floatValue();
                }
                kvdVarM4117a.f37320c = fArr;
            }
            faceToBeautifyArr2[i2] = kvdVarM4117a.m14929b();
            i2++;
            dpyVar = this;
            faceArr = faceArr2;
            kpvVar3 = kpvVar4;
            kpvVar2 = kpvVar5;
            kpvVar = kpvVar6;
            faceToBeautifyArr = faceToBeautifyArr2;
        }
        kpv kpvVar7 = kpvVar;
        kpv kpvVar8 = kpvVar2;
        kpv kpvVar9 = kpvVar3;
        FaceToBeautify[] faceToBeautifyArr3 = faceToBeautifyArr;
        Object obj = this.f12270d.f9845b;
        if (this.f12269c) {
            if (((gzl) obj).equals(gzl.ON_LIGHT)) {
                obj = gzl.ON_ADAPTIVE;
            }
        }
        cvy cvyVar = this.f12270d;
        cvyVar.f9845b.getClass();
        long j = this.f12267a;
        int iMo7245a = cvyVar.f9846c.mo7245a();
        int iMo7247c = this.f12270d.f9846c.mo7247c();
        int iMo7246b = this.f12270d.f9846c.mo7246b();
        ByteBuffer buffer = kpvVar7.getBuffer();
        int pixelStride = kpvVar7.getPixelStride();
        int rowStride = kpvVar7.getRowStride();
        ByteBuffer buffer2 = kpvVar8.getBuffer();
        int pixelStride2 = kpvVar8.getPixelStride();
        int rowStride2 = kpvVar8.getRowStride();
        ByteBuffer buffer3 = kpvVar9.getBuffer();
        int pixelStride3 = kpvVar9.getPixelStride();
        int rowStride3 = kpvVar9.getRowStride();
        gzl gzlVar = (gzl) obj;
        int i4 = gzlVar.f26939f;
        int i5 = this.f12268b;
        switch (((gzl) this.f12270d.f9845b).ordinal()) {
            case 1:
            case 2:
            case 3:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        return new dqo(this.f12270d.f9846c, FaceBeautificationNative.doFaceBeautification(j, iMo7245a, iMo7247c, iMo7246b, buffer, pixelStride, rowStride, buffer2, pixelStride2, rowStride2, buffer3, pixelStride3, rowStride3, faceToBeautifyArr3, i4, i5 & i), gzlVar);
    }
}
