package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.ArrayMap;
import java.util.Set;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1005tb implements InterfaceC0953rd {

    /* JADX INFO: renamed from: a */
    public final String f47641a;

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristics f47642b;

    /* JADX INFO: renamed from: c */
    private final Set f47643c;

    /* JADX INFO: renamed from: d */
    private final ArrayMap f47644d = new ArrayMap();

    /* JADX INFO: renamed from: e */
    private final ojy f47645e;

    /* JADX INFO: renamed from: f */
    private final ojy f47646f;

    /* JADX INFO: renamed from: g */
    private final ojy f47647g;

    public C1005tb(String str, CameraCharacteristics cameraCharacteristics, Set set) {
        this.f47641a = str;
        this.f47642b = cameraCharacteristics;
        this.f47643c = set;
        lkm.m15594u(new C1004ta(this, 1));
        this.f47645e = lkm.m15594u(new C1004ta(this, 3));
        lkm.m15594u(new C1004ta(this, 4));
        this.f47646f = lkm.m15594u(new C1004ta(this, 0));
        lkm.m15594u(new C1004ta(this, 2));
        this.f47647g = lkm.m15594u(new C1004ta(this, 5));
    }

    @Override // p000.InterfaceC0953rd
    /* JADX INFO: renamed from: a */
    public final Object mo19374a(CameraCharacteristics.Key key) {
        Object obj;
        if (this.f47643c.contains(key)) {
            return this.f47642b.get(key);
        }
        synchronized (this.f47644d) {
            obj = this.f47644d.get(key);
        }
        if (obj == null && (obj = this.f47642b.get(key)) != null) {
            synchronized (this.f47644d) {
                this.f47644d.put(key, obj);
            }
        }
        return obj;
    }

    @Override // p000.InterfaceC0953rd
    /* JADX INFO: renamed from: b */
    public final Set mo19375b() {
        return (Set) this.f47646f.mo18586a();
    }

    @Override // p000.InterfaceC0953rd
    /* JADX INFO: renamed from: c */
    public final Set mo19376c() {
        return (Set) this.f47645e.mo18586a();
    }

    @Override // p000.InterfaceC0953rd
    /* JADX INFO: renamed from: d */
    public final Set mo19377d() {
        return (Set) this.f47647g.mo18586a();
    }

    @Override // p000.InterfaceC0980sd
    /* JADX INFO: renamed from: e */
    public final Object mo13866e(oov oovVar) {
        throw null;
    }
}
