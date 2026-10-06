package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: vf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1063vf implements oju {

    /* JADX INFO: renamed from: a */
    private final C1064vg f47825a;

    /* JADX INFO: renamed from: b */
    private final int f47826b;

    public C1063vf(C1064vg c1064vg, int i) {
        this.f47825a = c1064vg;
        this.f47826b = i;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // p000.oju
    public final Object get() {
        byte[] bArr = null;
        switch (this.f47826b) {
            case 0:
                return new bkn((bbo) this.f47825a.f47837k.get(), (byte[]) null, (byte[]) null);
            case 1:
                C1064vg c1064vg = this.f47825a;
                Object obj = c1064vg.f47842p.f3651a;
                oju ojuVar = c1064vg.f47836j;
                ((drj) c1064vg.f47828b.get()).getClass();
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    C1058va c1058va = (C1058va) ojuVar.get();
                    Trace.endSection();
                    C0955rf c0955rf = (C0955rf) obj;
                    if (c0955rf.f47542e.f3651a.containsKey(C0945qw.m19360a())) {
                        throw new IllegalStateException("CameraBackendConfig#cameraBackends should not contain a backend with " + ((Object) "CameraBackendId(value=CXCP-Camera2)") + ". Use CameraBackendConfig#internalBackend field instead.");
                    }
                    Map mapM18662B = omn.m18662B(c0955rf.f47542e.f3651a, lkm.m15590q(C0945qw.m19360a(), new AmbientMode.AmbientController(c1058va, bArr)));
                    if (mapM18662B.containsKey(C0945qw.m19360a())) {
                        return new bbo(mapM18662B);
                    }
                    throw new IllegalStateException("Failed to find " + ((Object) "CameraBackendId(value=CXCP-Camera2)") + " in the list of available CameraPipe backends! Available values are " + mapM18662B.keySet());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 2:
                return new C1058va((drj) this.f47825a.f47828b.get(), (C1009tf) this.f47825a.f47830d.get(), (C1011th) this.f47825a.f47833g.get(), (drj) this.f47825a.f47835i.get(), new C1071vn(this.f47825a), null, null, null);
            case 3:
                oyo oyoVar = this.f47825a.f47841o;
                int[] iArr = C1067vj.f47847a;
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(C1067vj.m19501b(C1067vj.m19502c(C1067vj.f47848b, rmwTRjObXLGH.jJKLNVcjG), -1));
                executorServiceNewCachedThreadPool.getClass();
                oqv.m18931l(executorServiceNewCachedThreadPool);
                oqo oqoVarM18931l = oqv.m18931l(C1067vj.m19500a(C1067vj.m19501b(C1067vj.m19502c(C1067vj.f47848b, TVkaNXnfP.XBuwvoLdBLPUh), -1), 4));
                oqo oqoVarM18931l2 = oqv.m18931l(C1067vj.m19500a(C1067vj.m19501b(C1067vj.m19502c(C1067vj.f47848b, "CXCP-"), -3), oyoVar.f46847a));
                return new drj(oqv.m18925f(new osq().plus(oqoVarM18931l2).plus(new oqr("CXCP"))), oqoVarM18931l, oqoVarM18931l2, new C1065vh(0), new C1065vh(1));
            case 4:
                C1064vg c1064vg2 = this.f47825a;
                return new C1009tf(c1064vg2.f47829c, (drj) c1064vg2.f47828b.get(), null, null);
            case 5:
                Object systemService = this.f47825a.m19499a().getSystemService(CswIK.ewjpu);
                systemService.getClass();
                return (CameraManager) systemService;
            case 6:
                C1064vg c1064vg3 = this.f47825a;
                Context contextM19499a = c1064vg3.m19499a();
                drj drjVar = (drj) c1064vg3.f47828b.get();
                lha lhaVar = (lha) this.f47825a.f47831e.get();
                C1064vg c1064vg4 = this.f47825a;
                return new C1011th(contextM19499a, drjVar, lhaVar, ((C0955rf) c1064vg4.f47842p.f3651a).f47541d, (C0846ne) c1064vg4.f47832f.get(), null, null, null, null, null);
            case 7:
                return new lha(this.f47825a.m19499a());
            case 8:
                return new C0846ne();
            case 9:
                lha lhaVar2 = (lha) this.f47825a.f47831e.get();
                C1064vg c1064vg5 = this.f47825a;
                return new drj(lhaVar2, new C1039ui(new bbo(new bck(c1064vg5.f47829c, (drj) c1064vg5.f47828b.get(), (byte[]) null, (byte[]) null), (InterfaceC1012ti) c1064vg5.f47833g.get(), (C0846ne) c1064vg5.f47832f.get(), ((C0955rf) c1064vg5.f47842p.f3651a).f47540c, null, null), new bck(c1064vg5.f47829c, (drj) c1064vg5.f47828b.get(), (byte[]) null, (byte[]) null, (byte[]) null), (C0846ne) c1064vg5.f47832f.get(), (bkn) c1064vg5.f47834h.get(), null, null, null, null, null), (drj) this.f47825a.f47828b.get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 10:
                Object systemService2 = this.f47825a.m19499a().getSystemService("device_policy");
                systemService2.getClass();
                return new bkn((DevicePolicyManager) systemService2);
            case 11:
                return new C1058va();
            default:
                drj drjVar2 = (drj) this.f47825a.f47828b.get();
                bbo bboVar = (bbo) this.f47825a.f47837k.get();
                drjVar2.getClass();
                bboVar.getClass();
                return new C0796li();
        }
    }
}
