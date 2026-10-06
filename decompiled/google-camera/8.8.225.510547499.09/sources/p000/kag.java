package p000;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kag implements kme {

    /* JADX INFO: renamed from: a */
    public final bkn f35474a;

    /* JADX INFO: renamed from: b */
    private final kmk f35475b;

    /* JADX INFO: renamed from: c */
    private final kpb f35476c;

    /* JADX INFO: renamed from: d */
    private final kbo f35477d;

    /* JADX INFO: renamed from: e */
    private final kbz f35478e;

    public kag(bkn bknVar, kmk kmkVar, kpa kpaVar, kpb kpbVar, kbo kboVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        kpaVar.getClass();
        kpbVar.getClass();
        kbzVar.getClass();
        this.f35474a = bknVar;
        this.f35475b = kmkVar;
        this.f35476c = kpbVar;
        this.f35477d = kboVar;
        this.f35478e = kbzVar;
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: a */
    public final kmd mo13854a(kmg kmgVar) {
        kmgVar.getClass();
        InterfaceC0953rd interfaceC0953rdM2600u = this.f35474a.m2600u(kbd.m13918g(kmgVar));
        Set setMo19375b = interfaceC0953rdM2600u.mo19375b();
        HashSet hashSet = new HashSet();
        Iterator it = setMo19375b.iterator();
        while (it.hasNext()) {
            hashSet.add(kmg.m14575b(((C0952rc) it.next()).f47535a));
        }
        return new kmc(kmgVar, new kah(interfaceC0953rdM2600u), hashSet, this.f35476c, this.f35478e, this.f35477d);
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: b */
    public final kmg mo13855b() {
        return (kmg) omn.m18672L(m13859f());
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: c */
    public final kmg mo13856c(int i) {
        return mo13857d(String.valueOf(i));
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: d */
    public final kmg mo13857d(String str) {
        str.getClass();
        Object obj = null;
        Iterator itMo18817a = ooc.m18743i(new kaf(this, null)).mo18817a();
        while (itMo18817a.hasNext()) {
            Object next = itMo18817a.next();
            if (ooc.m18737c(((kmg) next).f36540a, str)) {
                obj = next;
                break;
            }
        }
        return (kmg) obj;
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: e */
    public final kmg mo13858e(kmq kmqVar) {
        Object next;
        kmqVar.getClass();
        Iterator it = m13859f().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kai.m13867a(this.f35474a.m2600u(kbd.m13918g((kmg) next))) == kmqVar) {
                return (kmg) next;
            }
        }
        next = null;
        return (kmg) next;
    }

    /* JADX INFO: renamed from: f */
    public final List m13859f() {
        List listMo14578a = this.f35475b.mo14578a();
        listMo14578a.getClass();
        return listMo14578a;
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: g */
    public final List mo13860g() {
        return m13859f();
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: h */
    public final List mo13861h(kmq kmqVar) {
        kmqVar.getClass();
        List listM13859f = m13859f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM13859f) {
            if (kai.m13867a(this.f35474a.m2600u(kbd.m13918g((kmg) obj))) == kmqVar) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p000.kme
    /* JADX INFO: renamed from: i */
    public final boolean mo13862i() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return false;
                }
            } catch (RuntimeException e) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002e A[RETURN] */
    @Override // p000.kme
    /* JADX INFO: renamed from: j */
    public final boolean mo13863j(kmq kmqVar) {
        kmqVar.getClass();
        for (Object obj : m13859f()) {
            if (kai.m13867a(this.f35474a.m2600u(kbd.m13918g((kmg) obj))) == kmqVar) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[RETURN] */
    @Override // p000.kme
    /* JADX INFO: renamed from: k */
    public final boolean mo13864k() {
        for (Object obj : m13859f()) {
            bkn bknVar = this.f35474a;
            String str = ((kmg) obj).f36540a;
            str.getClass();
            InterfaceC0953rd interfaceC0953rdM2600u = bknVar.m2600u(str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) interfaceC0953rdM2600u.mo19374a(key);
            if (iArr == null) {
                iArr = kai.f35480a;
            }
            if (omn.m18690ad(iArr, 9)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
