package p000;

import android.hardware.camera2.CaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khu extends kfv {

    /* JADX INFO: renamed from: b */
    private final kbo f36090b;

    /* JADX INFO: renamed from: c */
    private final Set f36091c = new HashSet();

    /* JADX INFO: renamed from: a */
    final List f36089a = new ArrayList(10);

    /* JADX INFO: renamed from: d */
    private final LongSparseArray f36092d = new LongSparseArray(8);

    /* JADX INFO: renamed from: e */
    private boolean f36093e = false;

    public khu(jvb jvbVar, kbo kboVar) {
        this.f36090b = kboVar.mo6314a("MetadataDst");
        jvbVar.m13537d(new kap(this, 3));
    }

    /* JADX INFO: renamed from: r */
    private static final void m14293r(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((khq) it.next()).m14286j(null);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        long jKeyAt;
        if (this.f36093e) {
            return;
        }
        long jB = kppVar.mo9515b();
        this.f36092d.put(jB, kppVar);
        if (this.f36092d.size() >= 8) {
            jKeyAt = this.f36092d.keyAt(0);
            this.f36092d.remove(jKeyAt);
        } else {
            jKeyAt = -1;
        }
        Iterator it = this.f36091c.iterator();
        while (it.hasNext()) {
            khq khqVar = (khq) it.next();
            kfd kfdVar = khqVar.f36078b;
            if (kfdVar != null) {
                if (kfdVar.f35812c == kppVar.mo9515b()) {
                    khqVar.m14286j(kppVar);
                    it.remove();
                } else if (jKeyAt >= 0 && kfdVar.f35812c < jKeyAt) {
                    this.f36089a.add(khqVar);
                    it.remove();
                }
            }
        }
        if (this.f36089a.isEmpty()) {
            return;
        }
        LongSparseArray longSparseArray = this.f36092d;
        long jLongValue = ((Long) mrm.m16828h((Long) ((kpp) longSparseArray.valueAt(longSparseArray.size() - 1)).mo9517d(CaptureResult.SENSOR_TIMESTAMP)).mo16811e(0L)).longValue();
        Iterator it2 = this.f36089a.iterator();
        while (it2.hasNext()) {
            khq khqVar2 = (khq) it2.next();
            kfd kfdVar2 = khqVar2.f36078b;
            kfdVar2.getClass();
            long j = kfdVar2.f35811b;
            long j2 = kfdVar2.f35812c;
            if (j2 == jB) {
                khqVar2.m14286j(kppVar);
                it2.remove();
            } else if (jKeyAt - j2 > 100 || jLongValue - j > 4000000000L || this.f36089a.size() > 10) {
                khqVar2.m14286j(null);
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m14294p() {
        if (!this.f36093e) {
            this.f36093e = true;
            m14293r(this.f36089a);
            m14293r(this.f36091c);
            this.f36091c.clear();
            this.f36089a.clear();
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m14295q(Collection collection) {
        if (this.f36093e) {
            m14293r(collection);
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            khq khqVar = (khq) it.next();
            kfd kfdVar = khqVar.f36078b;
            if (kfdVar != null) {
                kpp kppVar = (kpp) this.f36092d.get(kfdVar.f35812c);
                if (kppVar != null) {
                    khqVar.m14286j(kppVar);
                } else {
                    this.f36091c.add(khqVar);
                }
            } else {
                this.f36091c.add(khqVar);
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final synchronized void mo5455ba(kll kllVar) {
        if (kllVar == null) {
            return;
        }
        if (!this.f36093e) {
            this.f36090b.mo13947i("onCaptureFailed for Frame " + kllVar.m14500b() + (true != kllVar.m14501c() ? "" : " (images were captured)"));
        }
        Iterator it = this.f36091c.iterator();
        while (it.hasNext()) {
            khq khqVar = (khq) it.next();
            kfd kfdVar = khqVar.f36078b;
            if (kfdVar != null && kfdVar.f35812c == kllVar.m14500b()) {
                khqVar.m14286j(null);
                it.remove();
            }
        }
    }
}
