package p000;

import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: sn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0990sn implements InterfaceC1023tt {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f47600a;

    /* JADX INFO: renamed from: b */
    private final drj f47601b;

    public C0990sn(drj drjVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f47600a = i;
        drjVar.getClass();
        this.f47601b = drjVar;
    }

    public C0990sn(drj drjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f47600a = i;
        drjVar.getClass();
        this.f47601b = drjVar;
    }

    public C0990sn(drj drjVar, int i, char[] cArr, byte[] bArr, byte[] bArr2) {
        this.f47600a = i;
        drjVar.getClass();
        this.f47601b = drjVar;
    }

    @Override // p000.InterfaceC1023tt
    /* JADX INFO: renamed from: a */
    public final Map mo19404a(InterfaceC1016tm interfaceC1016tm, Map map, C1028ty c1028ty) throws Exception {
        switch (this.f47600a) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    Handler handlerM6622b = this.f47601b.m6622b();
                    try {
                        InterfaceC1014tk interfaceC1014tk = (InterfaceC1014tk) ((C0983sg) interfaceC1016tm).f47579d.f46397a;
                        if (!((C0983sg) interfaceC1016tm).f47579d.m18856d(interfaceC1014tk, c1028ty)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C0993sq.m19410e(((C0983sg) interfaceC1016tm).f47577b, arrayList, new C0988sl(interfaceC1016tm, c1028ty, interfaceC1014tk), handlerM6622b);
                        return okw.f46216a;
                    } catch (Exception e) {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                            throw e;
                        }
                        e.getClass().getSimpleName();
                        throw new C1032ub(e);
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + interfaceC1016tm + " for " + c1028ty + '!');
                    c1028ty.m19453d();
                }
                break;
            case 1:
                try {
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    interfaceC1016tm.mo19395a(arrayList2, c1028ty, this.f47601b.m6622b());
                    break;
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to create capture session from " + interfaceC1016tm + " for " + c1028ty + '!');
                    c1028ty.m19453d();
                }
                return okw.f46216a;
            default:
                try {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it3.next()).getValue());
                    }
                    interfaceC1016tm.mo19395a(arrayList3, c1028ty, this.f47601b.m6622b());
                    break;
                } catch (Throwable th3) {
                    Log.w("CXCP", "Failed to create captures session from " + interfaceC1016tm + " for " + c1028ty + '!');
                    c1028ty.m19453d();
                }
                return okw.f46216a;
        }
    }
}
