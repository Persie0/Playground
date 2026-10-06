package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: sp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0992sp implements InterfaceC1023tt {

    /* JADX INFO: renamed from: a */
    private final C0948qz f47604a;

    /* JADX INFO: renamed from: b */
    private final C1097wm f47605b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f47606c;

    /* JADX INFO: renamed from: d */
    private final drj f47607d;

    public C0992sp(drj drjVar, C1097wm c1097wm, C0948qz c0948qz, InterfaceC1012ti interfaceC1012ti, int i, byte[] bArr, byte[] bArr2) {
        this.f47606c = i;
        drjVar.getClass();
        interfaceC1012ti.getClass();
        this.f47607d = drjVar;
        this.f47605b = c1097wm;
        this.f47604a = c0948qz;
    }

    public C0992sp(drj drjVar, C0948qz c0948qz, C1097wm c1097wm, InterfaceC1012ti interfaceC1012ti, int i, byte[] bArr, byte[] bArr2) {
        this.f47606c = i;
        drjVar.getClass();
        interfaceC1012ti.getClass();
        this.f47607d = drjVar;
        this.f47604a = c0948qz;
        this.f47605b = c1097wm;
    }

    @Override // p000.InterfaceC1023tt
    /* JADX INFO: renamed from: a */
    public final Map mo19404a(InterfaceC1016tm interfaceC1016tm, Map map, C1028ty c1028ty) throws Exception {
        switch (this.f47606c) {
            case 0:
                C1034ud c1034udM14180b = C0767kg.m14180b(this.f47604a, this.f47605b, map, ((C0983sg) interfaceC1016tm).f47578c);
                if (c1034udM14180b.f47725a.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to create OutputConfigurations for ");
                    C0948qz c0948qz = this.f47604a;
                    sb.append(c0948qz);
                    Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(c0948qz.toString()));
                    return okw.f46216a;
                }
                C1040uj c1040uj = new C1040uj(c1034udM14180b.f47725a, this.f47607d.m6623c(), c1028ty, this.f47604a.f47518e);
                try {
                    try {
                        InterfaceC1014tk interfaceC1014tk = c1040uj.f47748e;
                        InterfaceC1014tk interfaceC1014tk2 = (InterfaceC1014tk) ((C0983sg) interfaceC1016tm).f47579d.f46397a;
                        if (!((C0983sg) interfaceC1016tm).f47579d.m18856d(interfaceC1014tk2, interfaceC1014tk)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        List list = c1040uj.f47746c;
                        ArrayList arrayList = new ArrayList(omn.m18678R(list));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C0991so) it.next()).mo13866e(ooj.m18762a(OutputConfiguration.class)));
                        }
                        SessionConfiguration sessionConfigurationM19429b = C0996st.m19429b(0, arrayList, c1040uj.f47747d, new C0988sl(interfaceC1016tm, interfaceC1014tk, interfaceC1014tk2));
                        CaptureRequest.Builder builderCreateCaptureRequest = ((C0983sg) interfaceC1016tm).f47577b.createCaptureRequest(1);
                        builderCreateCaptureRequest.getClass();
                        Set setMo19377d = ((C0983sg) interfaceC1016tm).f47576a.mo19377d();
                        ArrayList arrayList2 = new ArrayList(omn.m18678R(setMo19377d));
                        Iterator it2 = setMo19377d.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((CaptureRequest.Key) it2.next()).getName());
                        }
                        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
                        captureRequestBuild.getClass();
                        C0996st.m19440m(sessionConfigurationM19429b, captureRequestBuild);
                        C0996st.m19434g(((C0983sg) interfaceC1016tm).f47577b, sessionConfigurationM19429b);
                        return c1034udM14180b.f47726b;
                    } catch (Exception e) {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof CameraAccessException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                            throw e;
                        }
                        e.getClass().getSimpleName();
                        throw new C1032ub(e);
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to create capture session from " + interfaceC1016tm + " for " + c1028ty + '!');
                    c1028ty.m19453d();
                }
                break;
            default:
                C1034ud c1034udM14180b2 = C0767kg.m14180b(this.f47604a, this.f47605b, map, ((C0983sg) interfaceC1016tm).f47578c);
                if (c1034udM14180b2.f47725a.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to create OutputConfigurations for ");
                    C0948qz c0948qz2 = this.f47604a;
                    sb2.append(c0948qz2);
                    Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(c0948qz2.toString()));
                    return okw.f46216a;
                }
                try {
                    List list2 = c1034udM14180b2.f47725a;
                    Handler handlerM6622b = this.f47607d.m6622b();
                    try {
                        InterfaceC1014tk interfaceC1014tk3 = (InterfaceC1014tk) ((C0983sg) interfaceC1016tm).f47579d.f46397a;
                        if (!((C0983sg) interfaceC1016tm).f47579d.m18856d(interfaceC1014tk3, c1028ty)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        CameraDevice cameraDevice = ((C0983sg) interfaceC1016tm).f47577b;
                        ArrayList arrayList3 = new ArrayList(omn.m18678R(list2));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((C0991so) it3.next()).mo13866e(ooj.m18762a(OutputConfiguration.class)));
                        }
                        C0994sr.m19417b(cameraDevice, arrayList3, new C0988sl(interfaceC1016tm, c1028ty, interfaceC1014tk3), handlerM6622b);
                        return okw.f46216a;
                    } catch (Exception e2) {
                        if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof IllegalStateException) && !(e2 instanceof CameraAccessException) && !(e2 instanceof SecurityException) && !(e2 instanceof UnsupportedOperationException)) {
                            throw e2;
                        }
                        e2.getClass().getSimpleName();
                        throw new C1032ub(e2);
                    }
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to create capture session from " + interfaceC1016tm + " for " + c1028ty + '!');
                    c1028ty.m19453d();
                }
                break;
        }
    }
}
