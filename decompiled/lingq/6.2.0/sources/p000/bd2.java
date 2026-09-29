package p000;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.SmartLoginOption;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bd2 {

    /* JADX INFO: renamed from: a */
    public static final bd2 f8364a = new bd2();

    /* JADX INFO: renamed from: b */
    public static final HashMap f8365b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final void m3632a(String str) {
        Set set = lp1.f49971a;
        if (set.contains(bd2.class)) {
            return;
        }
        try {
            bd2 bd2Var = f8364a;
            HashMap map = f8365b;
            if (set.contains(bd2Var)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    Object systemService = sy2.m21766a().getSystemService("servicediscovery");
                    systemService.getClass();
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        sy2 sy2Var = sy2.f61585a;
                    }
                    map.remove(str);
                    return;
                }
                return;
            } catch (Throwable th) {
                lp1.m16420a(bd2Var, th);
                return;
            }
            lp1.m16420a(bd2.class, th);
        } catch (Throwable th2) {
            lp1.m16420a(bd2.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3633b() {
        if (!lp1.f49971a.contains(bd2.class)) {
            try {
                w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
                if (w23VarM24854b != null && w23VarM24854b.f66254c.contains(SmartLoginOption.Enabled)) {
                    return true;
                }
            } catch (Throwable th) {
                lp1.m16420a(bd2.class, th);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3634c(String str) {
        if (lp1.f49971a.contains(this)) {
            return false;
        }
        try {
            HashMap map = f8365b;
            if (map.containsKey(str)) {
                return true;
            }
            sy2 sy2Var = sy2.f61585a;
            String strReplace = "18.2.3".replace('.', '|');
            strReplace.getClass();
            String str2 = "fbsdk_" + "android-".concat(strReplace) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = sy2.m21766a().getSystemService("servicediscovery");
            systemService.getClass();
            ad2 ad2Var = new ad2(str2, str);
            map.put(str, ad2Var);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, ad2Var);
            return true;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return false;
        }
    }
}
