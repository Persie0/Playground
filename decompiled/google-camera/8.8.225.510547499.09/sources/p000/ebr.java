package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import p021j$.time.Instant;
import p021j$.util.Collection$EL;
import p021j$.util.DesugarArrays;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebr {
    /* JADX INFO: renamed from: a */
    public static float m7075a(float f, float f2) {
        return Math.max(0.0f, Math.min(f2, f));
    }

    /* JADX INFO: renamed from: b */
    public static ByteArrayOutputStream m7076b() {
        return new ByteArrayOutputStream();
    }

    /* JADX INFO: renamed from: d */
    public static PointF m7078d(PointF pointF, Rect rect) {
        if (pointF == null) {
            return null;
        }
        return new PointF((pointF.x - rect.left) / rect.width(), (pointF.y - rect.top) / rect.height());
    }

    /* JADX INFO: renamed from: e */
    public static List m7079e(kpp kppVar, dsr dsrVar, Instant instant) {
        List arrayList;
        CaptureResult.Key key;
        if (ivt.f32359m == null || kppVar.mo9517d(ivt.f32359m) == null || (key = ivt.f32363q) == null || kppVar.mo9517d(key) == null) {
            Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
            arrayList = faceArr == null ? new ArrayList() : (List) DesugarArrays.stream(faceArr).map(cqk.f8927n).collect(Collectors.toCollection(drv.f12447a));
        } else {
            arrayList = (List) Collection$EL.stream(kpm.m14672h(kppVar)).map(cqk.f8928o).collect(Collectors.toCollection(drv.f12447a));
        }
        return dsrVar.mo6645a(arrayList, mrm.m16829i(instant));
    }
}
