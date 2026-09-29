package com.amplitude.core.remoteconfig;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.ServerZone;
import com.amplitude.core.Storage$Constants;
import com.amplitude.core.utilities.http.HttpClient$Request$Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bl2;
import p000.c58;
import p000.cl9;
import p000.d58;
import p000.e58;
import p000.nn1;
import p000.op5;
import p000.pj5;
import p000.rp5;
import p000.s50;
import p000.u91;
import p000.un1;
import p000.ux5;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vw3;
import p000.vz1;
import p000.wfb;
import p000.ww3;
import p000.xfa;
import p000.ys2;

/* JADX INFO: renamed from: com.amplitude.core.remoteconfig.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0912a {

    /* JADX INFO: renamed from: a */
    public final String f11178a;

    /* JADX INFO: renamed from: b */
    public final ServerZone f11179b;

    /* JADX INFO: renamed from: c */
    public final un1 f11180c;

    /* JADX INFO: renamed from: d */
    public final nn1 f11181d;

    /* JADX INFO: renamed from: e */
    public final nn1 f11182e;

    /* JADX INFO: renamed from: f */
    public final C0898b f11183f;

    /* JADX INFO: renamed from: g */
    public final bl2 f11184g;

    /* JADX INFO: renamed from: h */
    public final pj5 f11185h;

    /* JADX INFO: renamed from: i */
    public final Object f11186i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f11187j;

    /* JADX INFO: renamed from: k */
    public boolean f11188k;

    public C0912a(String str, ServerZone serverZone, un1 un1Var, nn1 nn1Var, nn1 nn1Var2, C0898b c0898b, bl2 bl2Var, pj5 pj5Var) {
        serverZone.getClass();
        c0898b.getClass();
        pj5Var.getClass();
        this.f11178a = str;
        this.f11179b = serverZone;
        this.f11180c = un1Var;
        this.f11181d = nn1Var;
        this.f11182e = nn1Var2;
        this.f11183f = c0898b;
        this.f11184g = bl2Var;
        this.f11185h = pj5Var;
        this.f11186i = new Object();
        this.f11187j = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static final MapBuilder m5147a(C0912a c0912a) {
        MapBuilder mapBuilderM15392b;
        synchronized (c0912a.f11186i) {
            c0912a.m5150c();
        }
        String str = e58.f36727a[c0912a.f11179b.ordinal()] == 1 ? "https://sr-client-cfg.eu.amplitude.com" : "https://sr-client-cfg.amplitude.com";
        String strM22596N0 = u91.m22596N0(RemoteConfigClient$Key.getEntries(), "&", null, null, RemoteConfigClientImpl$buildRemoteConfigUrl$configKeysParam$1.f11160b, 30);
        StringBuilder sbM22999v = ux5.m22999v(str, "/config?api_key=");
        sbM22999v.append(c0912a.f11178a);
        sbM22999v.append('&');
        sbM22999v.append(strM22596N0);
        ww3 ww3VarM3834O = c0912a.f11184g.m3834O(new vw3(sbM22999v.toString(), HttpClient$Request$Method.GET, AbstractC3194a.m15365R(new Pair("Authorization", "Bearer ".concat(c0912a.f11178a)), new Pair("X-Client-Platform", "Android"), new Pair("X-Client-Version", String.valueOf(2)), new Pair("X-Client-Library", "amplitude-kotlin/0.0.1")), null, false, 120));
        int i = ww3VarM3834O.f67408a;
        if (200 > i || i >= 300) {
            if (400 > i || i >= 500) {
                c0912a.f11185h.mo16257c("Failed to fetch remote config: " + ww3VarM3834O.f67408a + ": " + ww3VarM3834O.f67411d);
                return null;
            }
            c0912a.f11185h.mo16255a("Client error on fetch remote config: " + ww3VarM3834O.f67408a + ": " + ww3VarM3834O.f67411d);
            return null;
        }
        String str2 = ww3VarM3834O.f67409b;
        pj5 pj5Var = c0912a.f11185h;
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                MapBuilder mapBuilder = new MapBuilder();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configs");
                if (jSONObjectOptJSONObject == null) {
                    pj5Var.mo16257c("No 'configs' key found in response");
                    return null;
                }
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        itKeys2.getClass();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            String str3 = next + '.' + next2;
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next2);
                            if (jSONObjectOptJSONObject3 != null) {
                                mapBuilder.put(str3, m5149d(vz1.m23634h0(jSONObjectOptJSONObject3)));
                                pj5Var.mo16256b("Successfully parsed config: " + str3);
                            } else {
                                pj5Var.mo16256b("Config " + str3 + " has no nested object, using empty map");
                                mapBuilder.put(str3, AbstractC3194a.m15360M());
                            }
                        }
                    } else {
                        pj5Var.mo16256b("Skipping non-object top-level key: " + next);
                    }
                }
                mapBuilderM15392b = mapBuilder.m15392b();
                if (!mapBuilderM15392b.isEmpty()) {
                    rp5 rp5Var = (rp5) mapBuilderM15392b.values();
                    if (!((MapBuilder) rp5Var.f59681b).isEmpty()) {
                        Iterator it = rp5Var.iterator();
                        do {
                            if (((op5) it).hasNext()) {
                            }
                        } while (((Map) ((op5) it).next()).isEmpty());
                        pj5Var.mo16256b("Successfully parsed " + mapBuilderM15392b.f47669i + " config entries");
                        if (mapBuilderM15392b != null) {
                            return mapBuilderM15392b;
                        }
                    }
                }
                pj5Var.mo16257c("No valid configs found in response");
                return null;
            } catch (Exception e) {
                pj5Var.mo16255a("Failed to parse configs from response: " + e.getMessage());
                mapBuilderM15392b = null;
            }
        }
        pj5Var.mo16257c("Response body is null, returning null config map");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m5148b(C0912a c0912a, ContinuationImpl continuationImpl) throws Throwable {
        RemoteConfigClientImpl$shouldRateLimit$1 remoteConfigClientImpl$shouldRateLimit$1;
        Long lM4845b0;
        if (continuationImpl instanceof RemoteConfigClientImpl$shouldRateLimit$1) {
            remoteConfigClientImpl$shouldRateLimit$1 = (RemoteConfigClientImpl$shouldRateLimit$1) continuationImpl;
            int i = remoteConfigClientImpl$shouldRateLimit$1.f11166c;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigClientImpl$shouldRateLimit$1.f11166c = i - Integer.MIN_VALUE;
            } else {
                remoteConfigClientImpl$shouldRateLimit$1 = new RemoteConfigClientImpl$shouldRateLimit$1(c0912a, continuationImpl);
            }
        } else {
            remoteConfigClientImpl$shouldRateLimit$1 = new RemoteConfigClientImpl$shouldRateLimit$1(c0912a, continuationImpl);
        }
        Object objM23905G = remoteConfigClientImpl$shouldRateLimit$1.f11164a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remoteConfigClientImpl$shouldRateLimit$1.f11166c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM23905G);
            nn1 nn1Var = c0912a.f11182e;
            RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1 remoteConfigClientImpl$shouldRateLimit$lastTsStr$1 = new RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1(c0912a, null);
            remoteConfigClientImpl$shouldRateLimit$1.f11166c = 1;
            objM23905G = wfb.m23905G(remoteConfigClientImpl$shouldRateLimit$lastTsStr$1, nn1Var, remoteConfigClientImpl$shouldRateLimit$1);
            if (objM23905G == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM23905G);
        }
        String str = (String) objM23905G;
        long jLongValue = (str == null || (lM4845b0 = cl9.m4845b0(str)) == null) ? 0L : lM4845b0.longValue();
        if (jLongValue <= 0) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(System.currentTimeMillis() - jLongValue < 300000);
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashMap m5149d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final void m5150c() {
        Iterator it = this.f11187j.entrySet().iterator();
        int size = 0;
        int i = 0;
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            int size2 = list.size();
            u91.m22606X0(RemoteConfigClientImpl$cleanupDeadReferencesLocked$1.f11161b, list);
            size += size2 - list.size();
            if (list.isEmpty()) {
                it.remove();
                i++;
            }
        }
        if (size > 0) {
            this.f11185h.mo16256b(ux5.m22987j(size, i, "Removed ", " dead references and ", " empty lists"));
        }
    }

    /* JADX INFO: renamed from: e */
    public final Map m5151e() {
        pj5 pj5Var = this.f11185h;
        try {
            String strM5096a = this.f11183f.m5096a(Storage$Constants.REMOTE_CONFIG);
            if (strM5096a != null && !vk9.m23391n0(strM5096a)) {
                LinkedHashMap linkedHashMapM23634h0 = vz1.m23634h0(new JSONObject(strM5096a));
                MapBuilder mapBuilder = new MapBuilder();
                for (Map.Entry entry : linkedHashMapM23634h0.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        LinkedHashMap linkedHashMapM5149d = m5149d((Map) value);
                        if (!linkedHashMapM5149d.isEmpty()) {
                            mapBuilder.put(str, linkedHashMapM5149d);
                            pj5Var.mo16256b("Successfully loaded stored config for key: " + str);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Skipping non-map value for key ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(value != null ? value.getClass().getSimpleName() : null);
                        pj5Var.mo16256b(sb.toString());
                    }
                }
                MapBuilder mapBuilderM15392b = mapBuilder.m15392b();
                pj5Var.mo16256b("Successfully loaded " + mapBuilderM15392b.f47669i + " stored configs from storage");
                return mapBuilderM15392b;
            }
            pj5Var.mo16256b("No stored config found in storage");
            return AbstractC3194a.m15360M();
        } catch (Exception e) {
            pj5Var.mo16255a("Failed to parse all stored configs: " + e.getMessage());
            return AbstractC3194a.m15360M();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5152f(RemoteConfigClient$Key remoteConfigClient$Key, s50 s50Var) {
        int size;
        final c58 c58Var;
        Long lM4845b0;
        remoteConfigClient$Key.getClass();
        d58 d58Var = new d58(this, s50Var);
        synchronized (this.f11186i) {
            try {
                m5150c();
                LinkedHashMap linkedHashMap = this.f11187j;
                String value = remoteConfigClient$Key.getValue();
                Object arrayList = linkedHashMap.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(value, arrayList);
                }
                List list = (List) arrayList;
                list.add(d58Var);
                size = list.size();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11185h.mo16256b("Added subscriber for key: " + remoteConfigClient$Key.getValue() + ". Total subscribers: " + size);
        String value2 = remoteConfigClient$Key.getValue();
        pj5 pj5Var = this.f11185h;
        try {
            Map mapM5151e = m5151e();
            if (mapM5151e.isEmpty()) {
                c58Var = null;
            } else {
                ys2 entries = RemoteConfigClient$Key.getEntries();
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(entries, 10));
                Iterator<E> it = entries.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((RemoteConfigClient$Key) it.next()).getValue());
                }
                Set setM22627s1 = u91.m22627s1(arrayList2);
                Set setKeySet = mapM5151e.keySet();
                if (!setKeySet.containsAll(setM22627s1)) {
                    pj5Var.mo16256b("Storage inconsistent keys. Expected: " + setM22627s1 + ", Found: " + setKeySet);
                    Set set = setKeySet;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (setM22627s1.contains((String) it2.next())) {
                                }
                            }
                        }
                    }
                    wfb.m23926u(this.f11180c, this.f11182e, null, new RemoteConfigClientImpl$getStoredConfigData$1(this, null), 2);
                    c58Var = null;
                }
                Map mapM15360M = (Map) mapM5151e.get(value2);
                if (mapM15360M == null) {
                    mapM15360M = AbstractC3194a.m15360M();
                }
                String strM5096a = this.f11183f.m5096a(Storage$Constants.REMOTE_CONFIG_TIMESTAMP);
                long jLongValue = (strM5096a == null || (lM4845b0 = cl9.m4845b0(strM5096a)) == null) ? 0L : lM4845b0.longValue();
                pj5Var.mo16256b("Retrieved stored config for " + value2 + " with " + mapM15360M.size() + " properties");
                c58Var = new c58(mapM15360M, jLongValue);
            }
        } catch (Exception e) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Failed to retrieve stored config data for ", value2, ": ");
            sbM17742q.append(e.getMessage());
            pj5Var.mo16255a(sbM17742q.toString());
        }
        if (c58Var != null) {
            d58Var.m10109a(new vi3() { // from class: com.amplitude.core.remoteconfig.RemoteConfigClientImpl$subscribe$1
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    s50 s50Var2 = (s50) obj;
                    s50Var2.getClass();
                    s50Var2.m21080a(c58Var.f9587a, RemoteConfigClient$Source.CACHE);
                    return xfa.f68157a;
                }
            });
        }
        wfb.m23926u(this.f11180c, this.f11181d, null, new RemoteConfigClientImpl$updateConfigs$1(this, null), 2);
    }
}
