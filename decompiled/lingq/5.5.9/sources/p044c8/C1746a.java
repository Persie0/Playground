package p044c8;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import dm.C5207g;
import java.util.HashMap;
import mo.C7661i;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1746a {

    /* JADX INFO: renamed from: a */
    public static final C1746a f9605a = new C1746a();

    /* JADX INFO: renamed from: b */
    public static final String f9606b = C1746a.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static final HashMap<String, NsdManager.RegistrationListener> f9607c = new HashMap<>();

    /* JADX INFO: renamed from: c8.a$a */
    public static final class a implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9608a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9609b;

        public a(String str, String str2) {
            this.f9608a = str;
            this.f9609b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            C5207g.m11111f(nsdServiceInfo, "serviceInfo");
            C1746a c1746a = C1746a.f9605a;
            C1746a.m5479a(this.f9609b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C5207g.m11111f(nsdServiceInfo, "NsdServiceInfo");
            if (!C5207g.m11106a(this.f9608a, nsdServiceInfo.getServiceName())) {
                C1746a c1746a = C1746a.f9605a;
                C1746a.m5479a(this.f9609b);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C5207g.m11111f(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            C5207g.m11111f(nsdServiceInfo, "serviceInfo");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5479a(String str) {
        if (C6205a.m12742b(C1746a.class)) {
            return;
        }
        try {
            f9605a.m5481b(str);
        } catch (Throwable th2) {
            C6205a.m12741a(C1746a.class, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5480c() {
        if (C6205a.m12742b(C1746a.class)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
            C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
            return c5074nM6670b != null && c5074nM6670b.f32971e.contains(SmartLoginOption.Enabled);
        } catch (Throwable th2) {
            C6205a.m12741a(C1746a.class, th2);
            return false;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    public final void m5481b(String str) {
        if (C6205a.m12742b(this)) {
            return;
        }
        HashMap<String, NsdManager.RegistrationListener> map = f9607c;
        try {
            NsdManager.RegistrationListener registrationListener = map.get(str);
            if (registrationListener != null) {
                Object systemService = C8004n.m15871a().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    C5086z c5086z = C5086z.f33015a;
                    C5086z.m10806E(f9606b, e10);
                }
                map.remove(str);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: d */
    public final boolean m5482d(String str) {
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = f9607c;
            if (map.containsKey(str)) {
                return true;
            }
            C8004n c8004n = C8004n.f43550a;
            String str2 = "fbsdk_" + C5207g.m11116k(C7661i.m15253S2("16.0.1", '.', '|'), "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C8004n.m15871a().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            a aVar = new a(str2, str);
            map.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }
}
