package p477x8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.kochava.tracker.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: x8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10122i implements InterfaceC10117d {

    /* JADX INFO: renamed from: a */
    public final a f51301a;

    /* JADX INFO: renamed from: b */
    public final C10120g f51302b;

    /* JADX INFO: renamed from: c */
    public final HashMap f51303c;

    /* JADX INFO: renamed from: x8.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Context f51304a;

        /* JADX INFO: renamed from: b */
        public Map<String, String> f51305b = null;

        public a(Context context) {
            this.f51304a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX INFO: renamed from: a */
        public final InterfaceC10116c m18980a(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.f51305b == null) {
                Context context = this.f51304a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), BuildConfig.SDK_TRUNCATE_LENGTH);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            mapEmptyMap = Collections.emptyMap();
                        } else {
                            HashMap map = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            mapEmptyMap = map;
                        }
                        this.f51305b = mapEmptyMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map2 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    mapEmptyMap = map2;
                }
                this.f51305b = mapEmptyMap;
            }
            String str4 = this.f51305b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (InterfaceC10116c) Class.forName(str4).asSubclass(InterfaceC10116c.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e14);
                return null;
            }
        }
    }

    public C10122i(Context context, C10120g c10120g) {
        a aVar = new a(context);
        this.f51303c = new HashMap();
        this.f51301a = aVar;
        this.f51302b = c10120g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p477x8.InterfaceC10117d
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC10124k mo18979a(String str) {
        try {
            if (this.f51303c.containsKey(str)) {
                return (InterfaceC10124k) this.f51303c.get(str);
            }
            InterfaceC10116c interfaceC10116cM18980a = this.f51301a.m18980a(str);
            if (interfaceC10116cM18980a == null) {
                return null;
            }
            C10120g c10120g = this.f51302b;
            InterfaceC10124k interfaceC10124kCreate = interfaceC10116cM18980a.create(new C10115b(c10120g.f51295a, c10120g.f51296b, c10120g.f51297c, str));
            this.f51303c.put(str, interfaceC10124kCreate);
            return interfaceC10124kCreate;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
