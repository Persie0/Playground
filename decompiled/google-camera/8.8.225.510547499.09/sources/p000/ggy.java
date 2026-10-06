package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggy extends kfv {

    /* JADX INFO: renamed from: a */
    private final kfk f24709a;

    /* JADX INFO: renamed from: b */
    private final dyl f24710b;

    /* JADX INFO: renamed from: c */
    private final fuz f24711c;

    /* JADX INFO: renamed from: d */
    private final jww f24712d;

    /* JADX INFO: renamed from: e */
    private boolean f24713e = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jww] */
    public ggy(fuz fuzVar, bko bkoVar, kfk kfkVar, dyl dylVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f24709a = kfkVar;
        this.f24710b = dylVar;
        this.f24711c = fuzVar;
        this.f24712d = bkoVar.f3652a;
        dhx dhxVar = dib.f11240a;
    }

    /* JADX INFO: renamed from: p */
    private final void m9236p(List list) {
        if (!list.isEmpty() || this.f24713e) {
            if (ivw.f32418d != null) {
                kfk kfkVar = this.f24709a;
                CaptureRequest.Key key = ivw.f32418d;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(404);
                byteBufferAllocate.order(ByteOrder.nativeOrder());
                List<dyu> list2 = (List) Collection$EL.stream(list).filter(cdy.f5387p).collect(Collectors.toList());
                byteBufferAllocate.putInt(list2.size());
                for (dyu dyuVar : list2) {
                    if (dyuVar.f12935c.mo16813g()) {
                        byteBufferAllocate.putInt(dyuVar.f12933a);
                        byteBufferAllocate.putFloat(dyuVar.f12934b);
                        byteBufferAllocate.putInt(((mws) dyuVar.f12935c.mo16809c()).size());
                        mws mwsVar = (mws) dyuVar.f12935c.mo16809c();
                        int size = mwsVar.size();
                        for (int i = 0; i < size; i++) {
                            byteBufferAllocate.putFloat(((Float) mwsVar.get(i)).floatValue());
                        }
                        for (int i2 = 0; i2 < 6 - ((mws) dyuVar.f12935c.mo16809c()).size(); i2++) {
                            byteBufferAllocate.putFloat(0.0f);
                        }
                        byteBufferAllocate.putFloat(dyuVar.f12936d);
                    }
                }
                kfkVar.mo14122i(key, byteBufferAllocate.array());
            }
            this.f24713e = !list.isEmpty();
            this.f24711c.m8819a(!list.isEmpty());
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        dyu dyuVar;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        if (!this.f24711c.m8822d() || l == null || rect == null || faceArr == null) {
            int i = mws.f41739d;
            m9236p(mzr.f41857a);
            return;
        }
        if (!((Boolean) ((jwf) this.f24712d).f34942d).booleanValue() && faceArr.length > 0) {
            this.f24712d.mo3415bf(true);
        }
        long jLongValue = l.longValue();
        HashMap map = new HashMap();
        jzk jzkVarMo6935b = this.f24710b.mo6935b(jLongValue);
        if (jzkVarMo6935b != null && !jzkVarMo6935b.f35297b.isEmpty()) {
            for (dyk dykVar : jzkVarMo6935b.f35297b) {
                mrm mrmVar = dykVar.f12920c;
                if (!mrmVar.mo16813g() || ((mws) mrmVar.mo16809c()).size() != 4) {
                    mrmVar = mqu.f41450a;
                }
                if (dykVar.f12919b > 0.0f) {
                    Integer numValueOf = Integer.valueOf((int) dykVar.f12918a);
                    int i2 = (int) dykVar.f12918a;
                    float f = dykVar.f12919b;
                    if (mrmVar == null) {
                        throw new NullPointerException("Null toneProbabilities");
                    }
                    dyu dyuVar2 = new dyu(i2, f, mrmVar, dykVar.f12921d);
                    if (dyuVar2.f12935c.mo16813g()) {
                        lku.m15669w(((mws) dyuVar2.f12935c.mo16809c()).size() == 4);
                    }
                    map.put(numValueOf, dyuVar2);
                }
            }
        }
        List arrayList = new ArrayList();
        if (!map.keySet().isEmpty()) {
            for (Face face : faceArr) {
                if (map.containsKey(Integer.valueOf(face.getId())) && (dyuVar = (dyu) map.get(Integer.valueOf(face.getId()))) != null && dyuVar.f12934b > 0.0f) {
                    arrayList.add(dyuVar);
                }
            }
            Collections.sort(arrayList, amx.f748l);
            if (arrayList.size() > 5) {
                arrayList = arrayList.subList(0, 5);
            }
        }
        m9236p(arrayList);
    }
}
