package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dti {
    /* JADX INFO: renamed from: a */
    public static final dtj m6727a(String str, ArrayList arrayList, ArrayList arrayList2) {
        dtj[] dtjVarArr = (dtj[]) arrayList.toArray(new dtj[0]);
        return new dtj(str, dtjVarArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m6728b(dtf dtfVar, kmd kmdVar) {
        dtfVar.mo6719c(kmdVar);
    }

    /* JADX INFO: renamed from: c */
    public static mws m6729c(kpp kppVar) {
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
        if (faceArr == null || rect == null) {
            int i = mws.f41739d;
            return mzr.f41857a;
        }
        ArrayList arrayList = new ArrayList();
        for (Face face : faceArr) {
            Rect rect2 = kpe.m14671a(face).f36797c;
            arrayList.add(new FaceToBeautify2(new RectF((rect2.left - rect.left) / rect.width(), (rect2.top - rect.top) / rect.height(), (rect2.right - rect.left) / rect.width(), (rect2.bottom - rect.top) / rect.height()), rect.width() / rect.height()));
        }
        return mws.m17095j(arrayList);
    }
}
