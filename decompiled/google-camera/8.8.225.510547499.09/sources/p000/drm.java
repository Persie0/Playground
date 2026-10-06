package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.googlex.gcam.ShotMetadata;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drm implements dro {

    /* JADX INFO: renamed from: a */
    private final mrm f12409a;

    /* JADX INFO: renamed from: b */
    private final dhv f12410b;

    /* JADX INFO: renamed from: c */
    private final dxx f12411c;

    /* JADX INFO: renamed from: d */
    private mrm f12412d;

    public drm(jvb jvbVar, mrm mrmVar, dxx dxxVar, kbz kbzVar, Executor executor, dhv dhvVar) {
        int i = 1;
        if (!FaceMetadataNative.f6661a.getAndSet(true)) {
            kbi.m13938a(FaceMetadataNative.class);
        }
        this.f12412d = mrm.m16829i(Long.valueOf(FaceMetadataNative.createHandle()));
        this.f12409a = mrmVar;
        jvbVar.m13537d(new fjl(this, executor, kbzVar, i));
        this.f12410b = dhvVar;
        this.f12411c = dxxVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6642a() {
        if (this.f12412d.mo16813g()) {
            FaceMetadataNative.releaseHandle(((Long) this.f12412d.mo16809c()).longValue());
        }
        this.f12412d = mqu.f41450a;
    }

    @Override // p000.dro
    /* JADX INFO: renamed from: b */
    public final synchronized mrm mo6643b(ShotMetadata shotMetadata, kpw kpwVar) {
        if (!this.f12412d.mo16813g()) {
            return mqu.f41450a;
        }
        gsr gsrVarM6885a = this.f12411c.m6885a(shotMetadata.m5098d().m4953c());
        if (gsrVarM6885a != null && gsrVarM6885a.f26257q.length != 0) {
            mrm mrmVarM9770b = mqu.f41450a;
            if (this.f12409a.mo16813g() && this.f12410b.mo6184l(dhq.f11158e)) {
                SystemClock.uptimeMillis();
                mrmVarM9770b = ((gtw) this.f12409a.mo16809c()).m9770b(kpwVar, gsrVarM6885a, false);
                SystemClock.uptimeMillis();
            }
            gsu[] gsuVarArr = gsrVarM6885a.f26257q;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < gsuVarArr.length) {
                gsu gsuVar = gsuVarArr[i];
                mrm mrmVar = mrmVarM9770b.mo16813g() ? ((gtt) mrmVarM9770b.mo16809c()).f26393a[i].f26392g : mqu.f41450a;
                Rect rect = gsuVar.f26286a;
                PointF pointF = gsuVar.f26288c;
                PointF pointF2 = gsuVar.f26289d;
                PointF pointF3 = gsuVar.f26291f;
                PointF pointF4 = gsuVar.f26290e;
                PointF pointF5 = gsuVar.f26292g;
                PointF pointF6 = gsuVar.f26293h;
                if (pointF == null || pointF2 == null || pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    throw new IllegalArgumentException("Required face feature missing");
                }
                float f = gsuVar.f26287b;
                kvd kvdVarM4117a = FaceToBeautify.m4117a(rect);
                gsu[] gsuVarArr2 = gsuVarArr;
                mrm mrmVar2 = mrmVarM9770b;
                kvdVarM4117a.f37318a = new Point((int) pointF.x, (int) pointF.y);
                kvdVarM4117a.f37325h = new Point((int) pointF2.x, (int) pointF2.y);
                kvdVarM4117a.f37324g = new Point((int) pointF3.x, (int) pointF3.y);
                kvdVarM4117a.f37323f = new Point((int) pointF4.x, (int) pointF4.y);
                kvdVarM4117a.f37319b = new Point((int) pointF5.x, (int) pointF5.y);
                kvdVarM4117a.f37322e = new Point((int) pointF6.x, (int) pointF6.y);
                kvdVarM4117a.f37326i = Float.valueOf((f - 1.0f) / 99.0f);
                kvdVarM4117a.f37327j = Float.valueOf(gsuVar.f26296k);
                kvdVarM4117a.f37328k = Integer.valueOf(gsuVar.f26294i);
                if (mrmVar.mo16813g()) {
                    int size = ((mws) mrmVar.mo16809c()).size();
                    float[] fArr = new float[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Float f2 = (Float) ((mws) mrmVar.mo16809c()).get(i2);
                        fArr[i2] = f2 == null ? -1.0f : f2.floatValue();
                    }
                    kvdVarM4117a.f37320c = fArr;
                }
                arrayList.add(kvdVarM4117a.m14929b());
                i++;
                gsuVarArr = gsuVarArr2;
                mrmVarM9770b = mrmVar2;
            }
            int size2 = arrayList.size();
            FaceToBeautify[] faceToBeautifyArr = new FaceToBeautify[size2];
            arrayList.toArray(faceToBeautifyArr);
            if (size2 == 0) {
                return mqu.f41450a;
            }
            long[] jArrGenerateFaceInfos = FaceMetadataNative.generateFaceInfos(faceToBeautifyArr);
            if (jArrGenerateFaceInfos == null) {
                return mqu.f41450a;
            }
            return mrm.m16829i(new drn(((eev) kpwVar).f13753a, shotMetadata.m5098d().m4952a(), FaceMetadataNative.generateFaceThumbnails(kpwVar.mo7247c(), kpwVar.mo7246b(), jArrGenerateFaceInfos, ((Long) this.f12412d.mo16809c()).longValue()), jArrGenerateFaceInfos));
        }
        return mqu.f41450a;
    }
}
