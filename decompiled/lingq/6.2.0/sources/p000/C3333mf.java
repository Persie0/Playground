package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: mf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3333mf implements fi0, InterfaceC3407of, w92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3370nf f51238a;

    public /* synthetic */ C3333mf(C3370nf c3370nf) {
        this.f51238a = c3370nf;
    }

    @Override // p000.fi0
    /* JADX INFO: renamed from: b */
    public void mo11842b(qp1 qp1Var) {
        C3370nf c3370nf = this.f51238a;
        synchronized (c3370nf) {
            try {
                if (((fi0) c3370nf.f52664c) instanceof tg2) {
                    ((ArrayList) c3370nf.f52663b).add(qp1Var);
                }
                ((fi0) c3370nf.f52664c).mo11842b(qp1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC3407of
    /* JADX INFO: renamed from: g */
    public void mo16507g(Bundle bundle) {
        ((InterfaceC3407of) this.f51238a.f52662a).mo16507g(bundle);
    }

    @Override // p000.w92
    /* JADX INFO: renamed from: h */
    public void mo13969h(uo7 uo7Var) {
        C3370nf c3370nf = this.f51238a;
        iy5 iy5Var = iy5.f44770f;
        iy5Var.m14205e("AnalyticsConnector now available.");
        InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) uo7Var.get();
        qn3 qn3Var = new qn3(interfaceC3036gf);
        b64 b64Var = new b64();
        C3182kf c3182kf = (C3182kf) interfaceC3036gf;
        jj5 jj5VarM15168b = c3182kf.m15168b("clx", b64Var);
        if (jj5VarM15168b == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            jj5VarM15168b = c3182kf.m15168b("crash", b64Var);
            if (jj5VarM15168b != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (jj5VarM15168b == null) {
            iy5Var.m14208s("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        iy5Var.m14205e("Registered Firebase Analytics listener.");
        qn3 qn3Var2 = new qn3();
        C3309ls c3309ls = new C3309ls(qn3Var);
        synchronized (c3370nf) {
            try {
                Iterator it = ((ArrayList) c3370nf.f52663b).iterator();
                while (it.hasNext()) {
                    qn3Var2.mo11842b((qp1) it.next());
                }
                b64Var.f8007b = qn3Var2;
                b64Var.f8006a = c3309ls;
                c3370nf.f52664c = qn3Var2;
                c3370nf.f52662a = c3309ls;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
