package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.SQLException;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.amplitude.android.C0880b;
import com.amplitude.core.ServerZone;
import com.amplitude.core.utilities.http.HttpClient$Request$Method;
import com.amplitude.core.utilities.http.HttpStatus;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iterable.iterableapi.C1206b;
import com.iterable.iterableapi.C1212h;
import com.iterable.iterableapi.C1220p;
import com.iterable.iterableapi.C1221q;
import com.iterable.iterableapi.C1222r;
import com.iterable.iterableapi.C1223s;
import com.iterable.iterableapi.IterableInAppLocation;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.library.C2146e;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bl2 implements bu8, InstallReferrerStateListener, sm9, uf7, jg9, bm0 {

    /* JADX INFO: renamed from: a */
    public Object f8655a;

    /* JADX INFO: renamed from: b */
    public Object f8656b;

    public bl2(iz3 iz3Var) throws IOException {
        this.f8655a = iz3Var;
        File file = iz3Var.f44800d;
        omd.m18164t(file);
        sq5 sq5Var = new sq5(file, iz3Var.f44801e, iz3Var.f44802f);
        this.f8656b = sq5Var;
        File file2 = (File) sq5Var.f61250d;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    ((Properties) sq5Var.f61249c).load(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3584sr.m21646y(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                file2.delete();
                pj5 pj5Var = (pj5) sq5Var.f61248b;
                if (pj5Var != null) {
                    pj5Var.mo16255a("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + lda.m16112L(th3));
                }
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        sq5 sq5Var2 = (sq5) this.f8656b;
        String str = ((iz3) this.f8655a).f44798b;
        String property = ((Properties) sq5Var2.f61249c).getProperty("api_key", null);
        if (!(property == null ? true : property.equals(str))) {
            List listM23605K = vz1.m23605K("user_id", "device_id", "api_key", "experiment_api_key");
            sq5Var2.getClass();
            Iterator it = listM23605K.iterator();
            while (it.hasNext()) {
                ((Properties) sq5Var2.f61249c).remove((String) it.next());
            }
            sq5Var2.m21583z();
        }
        sq5Var2.m21581x("api_key", str);
    }

    /* JADX INFO: renamed from: I */
    public static JSONObject m3816I(C1212h c1212h, IterableInAppLocation iterableInAppLocation) {
        JSONObject jSONObject = new JSONObject();
        try {
            boolean zM6933p = c1212h.m6933p();
            jSONObject.putOpt("saveToInbox", Boolean.valueOf(c1212h.m6929l()));
            jSONObject.putOpt("silentInbox", Boolean.valueOf(zM6933p));
            if (iterableInAppLocation == null) {
                return jSONObject;
            }
            jSONObject.putOpt("location", iterableInAppLocation.toString());
            return jSONObject;
        } catch (Exception e) {
            eh0.m11136q("IterableApiClient", "Could not populate messageContext JSON", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m3817S(kp2 kp2Var) {
        if (kp2Var.m15638e() != null) {
            kp2Var.m15639f(kp2Var.m15634a() + 1);
            double dM15635b = kp2Var.m15635b();
            long time = new Date().getTime();
            Date dateM15638e = kp2Var.m15638e();
            dateM15638e.getClass();
            kp2Var.m15640g((float) (((time - dateM15638e.getTime()) / 1000.0d) + dM15635b));
            kp2Var.m15641h(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3818k(bl2 bl2Var, l41 l41Var) {
        bl2Var.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bl2Var.f8655a).entrySet()) {
            g9a.m12435l(entry.getKey());
            List list = (List) entry.getValue();
            if (!m3820q(l41Var, list).equals(m3820q((l41) bl2Var.f8656b, list))) {
                throw null;
            }
        }
        bl2Var.f8656b = l41Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m3819p(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!vk9.m23380c0(message, "unique", true) && !vk9.m23380c0(message, "2067", false) && !vk9.m23380c0(message, "1555", false)) {
            throw sQLException;
        }
    }

    /* JADX INFO: renamed from: q */
    public static l41 m3820q(l41 l41Var, List list) {
        l41Var.getClass();
        Map map = l41Var.f49012a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new l41(map2);
    }

    /* JADX INFO: renamed from: A */
    public void m3821A(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Bundle bundle, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3821A(abstractComponentCallbacksC0635c, bundle, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12510d(abstractC0638f, abstractComponentCallbacksC0635c, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m3822B(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3822B(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3823C(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3823C(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12511e(abstractComponentCallbacksC0635c, abstractC0638f);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3824D(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, View view, Bundle bundle, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        view.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3824D(abstractComponentCallbacksC0635c, view, bundle, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12512f(abstractC0638f, abstractComponentCallbacksC0635c, view);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m3825E(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3825E(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: F */
    public void m3826F() {
        if (((tb4) this.f8656b).f62098a == null) {
            eh0.m11135p("EmbeddedSessionManager", "Embedded session ended without start");
            return;
        }
        if (((LinkedHashMap) this.f8655a).isEmpty()) {
            return;
        }
        Iterator it = ((LinkedHashMap) this.f8655a).values().iterator();
        while (it.hasNext()) {
            m3817S((kp2) it.next());
        }
        Date date = ((tb4) this.f8656b).f62098a;
        Date date2 = new Date();
        ArrayList<nb4> arrayList = new ArrayList();
        for (kp2 kp2Var : ((LinkedHashMap) this.f8655a).values()) {
            arrayList.add(new nb4(kp2Var.m15636c(), kp2Var.m15637d(), kp2Var.m15634a(), kp2Var.m15635b()));
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        fb4 fb4Var = fb4.f38769t;
        if (fb4Var.m11690a()) {
            if (date != null) {
                bl2 bl2Var = fb4Var.f38780k;
                JSONObject jSONObject = new JSONObject();
                try {
                    bl2Var.m3855l(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("start", date.getTime());
                    jSONObject2.put("end", date2.getTime());
                    jSONObject.put("session", jSONObject2);
                    JSONArray jSONArray = new JSONArray();
                    for (nb4 nb4Var : arrayList) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("messageId", nb4Var.m17314c());
                        jSONObject3.put("placementId", nb4Var.m17315d());
                        jSONObject3.put("displayCount", nb4Var.m17312a());
                        jSONObject3.put("displayDuration", nb4Var.m17313b());
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("impressions", jSONArray);
                    jSONObject.putOpt("deviceInfo", bl2Var.m3828H());
                    bl2Var.m3835P("embedded-messaging/events/session", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                eh0.m11135p("IterableApi", "trackEmbeddedSession: sessionStartTime and sessionEndTime must be set");
            }
        }
        this.f8656b = new tb4(null);
        this.f8655a = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: G */
    public CctBackendFactory m3827G(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f8656b) == null) {
            Context context = (Context) this.f8655a;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f8656b = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f8656b = map;
        }
        String str4 = (String) ((Map) this.f8656b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: H */
    public JSONObject m3828H() {
        fb4 fb4Var = (fb4) ((m58) this.f8655a).f50618b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("deviceId", fb4Var.m11693d());
            jSONObject.putOpt("platform", "Android");
            jSONObject.putOpt("appPackageName", fb4Var.f38770a.getPackageName());
            return jSONObject;
        } catch (Exception e) {
            eh0.m11136q("IterableApiClient", "Could not populate deviceInfo JSON", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: J */
    public InputStream m3829J(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.getClass();
            return inputStream;
        } catch (IOException e) {
            ((pj5) this.f8656b).mo16257c("Failed to get input stream, falling back to error stream: " + e.getMessage());
            InputStream errorStream = httpURLConnection.getErrorStream();
            errorStream.getClass();
            return errorStream;
        }
    }

    /* JADX INFO: renamed from: K */
    public ht5 m3830K() {
        return (ht5) ((xc9) ((t66) this.f8656b)).getValue();
    }

    /* JADX INFO: renamed from: L */
    public l78 m3831L() {
        if (((l78) this.f8656b) == null) {
            this.f8656b = new vx6();
        }
        return (l78) this.f8656b;
    }

    /* JADX INFO: renamed from: M */
    public synchronized Map m3832M() {
        try {
            if (((Map) this.f8656b) == null) {
                this.f8656b = Collections.unmodifiableMap(new HashMap((HashMap) this.f8655a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f8656b;
    }

    /* JADX INFO: renamed from: N */
    public gz3 m3833N() {
        sq5 sq5Var = (sq5) this.f8656b;
        sq5Var.getClass();
        String property = ((Properties) sq5Var.f61249c).getProperty("user_id", null);
        sq5Var.getClass();
        return new gz3(property, ((Properties) sq5Var.f61249c).getProperty("device_id", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [bl2] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX INFO: renamed from: O */
    public ww3 m3834O(vw3 vw3Var) {
        InputStream inputStreamM3829J;
        byte[] bytes;
        pj5 pj5Var = (pj5) this.f8656b;
        String str = vw3Var.f66014a;
        try {
            ?? url = new URL(str);
            try {
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    uRLConnection.getClass();
                    url = (HttpURLConnection) uRLConnection;
                    try {
                        url.setRequestMethod(vw3Var.f66015b.name());
                        url.setConnectTimeout(vw3Var.f66019f);
                        url.setReadTimeout(vw3Var.f66020g);
                        url.setDoInput(true);
                        for (Map.Entry entry : vw3.f66013h.entrySet()) {
                            url.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        for (Map.Entry entry2 : vw3Var.f66016c.entrySet()) {
                            url.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        String str2 = vw3Var.f66017d;
                        if (str2 != null) {
                            url.setDoOutput(true);
                            if (vw3Var.f66018e) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                    try {
                                        byte[] bytes2 = str2.getBytes(yu0.f70463a);
                                        bytes2.getClass();
                                        gZIPOutputStream.write(bytes2);
                                        gZIPOutputStream.close();
                                        bytes = byteArrayOutputStream.toByteArray();
                                        bytes.getClass();
                                        url.setRequestProperty("Content-Encoding", "gzip");
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC3584sr.m21646y(gZIPOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                } catch (Exception e) {
                                    pj5Var.mo16257c("Gzip compression failed, sending uncompressed: " + e.getMessage());
                                    bytes = str2.getBytes(yu0.f70463a);
                                    bytes.getClass();
                                }
                            } else {
                                bytes = str2.getBytes(yu0.f70463a);
                                bytes.getClass();
                            }
                            url.getOutputStream().write(bytes, 0, bytes.length);
                            url.getOutputStream().close();
                        }
                        try {
                            int responseCode = url.getResponseCode();
                            String responseMessage = url.getResponseMessage();
                            try {
                                inputStreamM3829J = m3829J(url);
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM3829J, yu0.f70463a), 8192);
                                    try {
                                        String strM4066s0 = bq1.m4066s0(bufferedReader);
                                        bufferedReader.close();
                                        inputStreamM3829J.close();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Map<String, List<String>> headerFields = url.getHeaderFields();
                                        headerFields.getClass();
                                        for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                                            String key = entry3.getKey();
                                            List<String> value = entry3.getValue();
                                            if (key != null) {
                                                if (value == null) {
                                                    value = EmptyList.f47638a;
                                                }
                                                linkedHashMap.put(key, value);
                                            }
                                        }
                                        ww3 ww3Var = new ww3(responseCode, strM4066s0, linkedHashMap, responseMessage);
                                        url.disconnect();
                                        return ww3Var;
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            AbstractC3584sr.m21646y(bufferedReader, th3);
                                            throw th4;
                                        }
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    pj5Var.mo16255a("Failed to read response from server: " + e.getMessage());
                                    ww3 ww3Var2 = new ww3(408, null, AbstractC3194a.m15360M(), "Request timeout");
                                    if (inputStreamM3829J != null) {
                                        inputStreamM3829J.close();
                                    }
                                    url.disconnect();
                                    return ww3Var2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                inputStreamM3829J = null;
                            } catch (Throwable th5) {
                                th = th5;
                                this = 0;
                                if (this != 0) {
                                    this.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e4) {
                        pj5Var.mo16255a("Request failed: " + e4.getClass().getName() + ": " + e4.getMessage());
                        Map mapM15360M = AbstractC3194a.m15360M();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Request failed: ");
                        sb.append(e4.getMessage());
                        ww3 ww3Var3 = new ww3(500, null, mapM15360M, sb.toString());
                        url.disconnect();
                        return ww3Var3;
                    }
                } catch (IOException e5) {
                    pj5Var.mo16255a("Failed to open connection: " + e5.getMessage());
                    return new ww3(500, null, AbstractC3194a.m15360M(), "Connection failed");
                }
            } catch (Throwable th7) {
                url.disconnect();
                throw th7;
            }
        } catch (MalformedURLException e6) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Attempted to use malformed url: ", str, ", error: ");
            sbM17742q.append(e6.getMessage());
            pj5Var.mo16255a(sbM17742q.toString());
            return new ww3(400, null, AbstractC3194a.m15360M(), "Malformed URL");
        }
    }

    /* JADX INFO: renamed from: P */
    public void m3835P(String str, JSONObject jSONObject) {
        m3836Q(str, jSONObject, ((fb4) ((m58) this.f8655a).f50618b).f38776g, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public void m3836Q(String str, JSONObject jSONObject, String str2, vb4 vb4Var, pb4 pb4Var) {
        m3831L().mo6966d(((fb4) ((m58) this.f8655a).f50618b).f38772c, str, jSONObject, str2, vb4Var, pb4Var);
    }

    /* JADX INFO: renamed from: R */
    public void m3837R(boolean z) {
        Object vx6Var;
        if (z && (((l78) this.f8656b) instanceof C1222r)) {
            return;
        }
        if (z || !(((l78) this.f8656b) instanceof vx6)) {
            l78 l78Var = (l78) this.f8656b;
            if (l78Var instanceof C1222r) {
                C1222r c1222r = (C1222r) l78Var;
                try {
                    C1206b c1206bM11692c = fb4.f38769t.m11692c();
                    c1206bM11692c.f13994g.remove(c1222r.f14091b);
                } catch (Exception unused) {
                    eh0.m11121R("OfflineRequestProcessor", "Failed to unregister auth token listener on dispose.");
                }
            }
            if (z) {
                Context context = ((fb4) ((m58) this.f8655a).f50618b).f38770a;
                C1222r c1222r2 = new C1222r();
                nc0 nc0VarM17326l = nc0.m17326l(context);
                C1221q c1221qM6960d = C1221q.m6960d(context);
                c1222r2.f14092c = c1221qM6960d;
                sr3 sr3Var = new sr3(c1221qM6960d);
                c1222r2.f14093d = sr3Var;
                C1220p c1220p = new C1220p(c1221qM6960d, bb4.f8269i, nc0VarM17326l, sr3Var, fb4.f38769t.f38781l);
                c1222r2.f14091b = c1220p;
                c1222r2.f14090a = new C1223s(c1221qM6960d, c1220p);
                try {
                    fb4.f38769t.m11692c().f13994g.add(c1220p);
                    vx6Var = c1222r2;
                } catch (Exception unused2) {
                    eh0.m11121R("OfflineRequestProcessor", "Failed to register auth token listener. Auto-retry on JWT failure will not work until AuthManager is available.");
                    vx6Var = c1222r2;
                }
            } else {
                vx6Var = new vx6();
            }
            this.f8656b = vx6Var;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m3838T(JSONObject jSONObject) {
        Boolean bool = Boolean.FALSE;
        JSONObject jSONObject2 = new JSONObject();
        try {
            m3855l(jSONObject2);
            fb4 fb4Var = (fb4) ((m58) this.f8655a).f50618b;
            if (fb4Var.f38773d == null && (fb4Var.f38775f != null || fb4Var.f38774e != null)) {
                jSONObject2.put("preferUserId", true);
            }
            jSONObject2.put("dataFields", jSONObject);
            jSONObject2.put("mergeNestedObjects", bool);
            m3835P("users/update", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: U */
    public AbstractC3572sf m3839U(String str, String str2) throws JSONException {
        str.getClass();
        C0880b c0880b = (C0880b) this.f8655a;
        String str3 = c0880b.f10796i == ServerZone.EU ? "https://api.eu.amplitude.com/2/httpapi" : "https://api2.amplitude.com/2/httpapi";
        String str4 = c0880b.f10788a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("{\"api_key\":\"", str4, "\",\"client_upload_time\":\"");
        String str5 = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        str5.getClass();
        sbM17742q.append(str5);
        sbM17742q.append("\",\"events\":");
        sbM17742q.append(str);
        sb.append(sbM17742q.toString());
        if (str2 != null) {
            sb.append(",\"request_metadata\":{\"sdk\":" + str2 + '}');
        }
        sb.append("}");
        ww3 ww3VarM3834O = m3834O(new vw3(str3, HttpClient$Request$Method.POST, null, sb.toString(), true, 100));
        int i = ww3VarM3834O.f67408a;
        String str6 = ww3VarM3834O.f67409b;
        HttpStatus httpStatus = HttpStatus.SUCCESS;
        i84 range = httpStatus.getRange();
        int i2 = range.f40379a;
        if (i <= range.f40380b && i2 <= i) {
            return new gn9(httpStatus);
        }
        i84 range2 = HttpStatus.BAD_REQUEST.getRange();
        int i3 = range2.f40379a;
        if (i <= range2.f40380b && i3 <= i) {
            return new r70(new JSONObject(str6));
        }
        i84 range3 = HttpStatus.PAYLOAD_TOO_LARGE.getRange();
        int i4 = range3.f40379a;
        if (i <= range3.f40380b && i4 <= i) {
            return new q67(new JSONObject(str6));
        }
        i84 range4 = HttpStatus.TOO_MANY_REQUESTS.getRange();
        int i5 = range4.f40379a;
        if (i <= range4.f40380b && i5 <= i) {
            return new m5a(new JSONObject(str6));
        }
        i84 range5 = HttpStatus.TIMEOUT.getRange();
        int i6 = range5.f40379a;
        if (i <= range5.f40380b && i6 <= i) {
            return new f1a();
        }
        JSONObject jSONObject = new JSONObject();
        if (str6 != null && str6.length() != 0) {
            try {
                jSONObject = new JSONObject(str6);
            } catch (Exception unused) {
                jSONObject.put("error", str6);
            }
        }
        return new jz2(jSONObject);
    }

    /* JADX INFO: renamed from: V */
    public void m3840V(bk8 bk8Var, Iterable iterable) {
        bk8Var.getClass();
        if (iterable == null) {
            return;
        }
        for (Object obj : iterable) {
            try {
                ((r46) this.f8655a).m20400B(bk8Var, obj);
            } catch (SQLException e) {
                m3819p(e);
                ((ss5) this.f8656b).m21729K(bk8Var, obj);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m3841W(bk8 bk8Var, Object obj) {
        bk8Var.getClass();
        try {
            ((r46) this.f8655a).m20400B(bk8Var, obj);
        } catch (SQLException e) {
            m3819p(e);
            ((ss5) this.f8656b).m21729K(bk8Var, obj);
        }
    }

    /* JADX INFO: renamed from: X */
    public long m3842X(bk8 bk8Var, Object obj) {
        bk8Var.getClass();
        try {
            return ((r46) this.f8655a).m20401C(bk8Var, obj);
        } catch (SQLException e) {
            m3819p(e);
            ((ss5) this.f8656b).m21729K(bk8Var, obj);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Y */
    public List m3843Y(bk8 bk8Var, Collection collection) {
        bk8Var.getClass();
        if (collection == null) {
            return EmptyList.f47638a;
        }
        ListBuilder listBuilderM23650t = vz1.m23650t();
        for (Object obj : collection) {
            try {
                listBuilderM23650t.add(Long.valueOf(((r46) this.f8655a).m20401C(bk8Var, obj)));
            } catch (SQLException e) {
                m3819p(e);
                ((ss5) this.f8656b).m21729K(bk8Var, obj);
                listBuilderM23650t.add(-1L);
            }
        }
        return vz1.m23635i(listBuilderM23650t);
    }

    /* JADX INFO: renamed from: Z */
    public void m3844Z(Annotation annotation) {
        if (((HashMap) this.f8656b) == null) {
            this.f8656b = new HashMap();
        }
        ((HashMap) this.f8656b).put(annotation.annotationType(), annotation);
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: a */
    public int mo3845a(int i) {
        TextPaint textPaint = (TextPaint) this.f8656b;
        CharSequence charSequence = (CharSequence) this.f8655a;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.f8656b).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: b */
    public int mo3846b(int i) {
        TextPaint textPaint = (TextPaint) this.f8656b;
        CharSequence charSequence = (CharSequence) this.f8655a;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.f8656b).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // p000.jg9
    /* JADX INFO: renamed from: c */
    public StackTraceElement[] mo3847c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        jg9[] jg9VarArr = (jg9[]) this.f8655a;
        StackTraceElement[] stackTraceElementArrMo3847c = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            jg9 jg9Var = jg9VarArr[i];
            if (stackTraceElementArrMo3847c.length <= 1024) {
                break;
            }
            stackTraceElementArrMo3847c = jg9Var.mo3847c(stackTraceElementArr);
        }
        return stackTraceElementArrMo3847c.length > 1024 ? ((tr3) this.f8656b).mo3847c(stackTraceElementArrMo3847c) : stackTraceElementArrMo3847c;
    }

    @Override // p000.sm9
    /* JADX INFO: renamed from: d */
    public void mo3848d(rm9 rm9Var) {
        d66 d66Var = (d66) this.f8656b;
        d66Var.m10122a();
        i66 i66Var = rm9Var.f59554a;
        Object[] objArr = i66Var.f1296b;
        long[] jArr = i66Var.f1297c;
        int i = i66Var.f1299e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objM24675b = ((xt4) this.f8655a).m24675b(obj);
            int iM10125d = d66Var.m10125d(objM24675b);
            int i3 = iM10125d >= 0 ? d66Var.f35036c[iM10125d] : 0;
            if (i3 == 7) {
                rm9Var.remove(obj);
            } else {
                d66Var.m10128g(i3 + 1, objM24675b);
            }
            i = i2;
        }
    }

    @Override // p000.uf7
    /* JADX INFO: renamed from: e */
    public void mo3849e() {
        ((t66) this.f8655a).setValue(Boolean.FALSE);
        ((C2146e) this.f8656b).mo3737M1(UpgradeReason.PLAYLISTS);
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: f */
    public int mo3850f(int i) {
        TextPaint textPaint = (TextPaint) this.f8656b;
        CharSequence charSequence = (CharSequence) this.f8655a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: g */
    public void mo3851g(vl0 vl0Var, j88 j88Var) {
        am0 am0Var = (am0) this.f8655a;
        br6 br6Var = (br6) this.f8656b;
        try {
            try {
                am0Var.mo553l(br6Var, br6Var.m4150c(j88Var));
            } catch (Throwable th) {
                ci8.m4709V(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            ci8.m4709V(th2);
            try {
                am0Var.mo554p(br6Var, th2);
            } catch (Throwable th3) {
                ci8.m4709V(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // p000.sm9
    /* JADX INFO: renamed from: h */
    public boolean mo3852h(Object obj, Object obj2) {
        xt4 xt4Var = (xt4) this.f8655a;
        return fa4.m11650l(xt4Var.m24675b(obj), xt4Var.m24675b(obj2));
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: i */
    public int mo3853i(int i) {
        TextPaint textPaint = (TextPaint) this.f8656b;
        CharSequence charSequence = (CharSequence) this.f8655a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: j */
    public void mo3854j(vl0 vl0Var, IOException iOException) {
        try {
            ((am0) this.f8655a).mo554p((br6) this.f8656b, iOException);
        } catch (Throwable th) {
            ci8.m4709V(th);
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3855l(JSONObject jSONObject) {
        try {
            fb4 fb4Var = (fb4) ((m58) this.f8655a).f50618b;
            String str = fb4Var.f38773d;
            if (str != null) {
                jSONObject.put("email", str);
                return;
            }
            String str2 = fb4Var.f38775f;
            if (str2 != null) {
                jSONObject.put("userId", str2);
            } else {
                jSONObject.put("userId", fb4Var.f38774e);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: m */
    public vv9 m3856m(List list) {
        uo2 uo2Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            uo2Var = null;
            while (i < size) {
                try {
                    uo2 uo2Var2 = (uo2) list.get(i);
                    try {
                        uo2Var2.mo20a((vo2) this.f8656b);
                        i++;
                        uo2Var = uo2Var2;
                    } catch (Exception e2) {
                        e = e2;
                        uo2Var = uo2Var2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((vo2) this.f8656b).f65702a.m12627f());
                        sb2.append(", composition=");
                        sb2.append(((vo2) this.f8656b).m23455c());
                        sb2.append(", selection=");
                        vo2 vo2Var = (vo2) this.f8656b;
                        sb2.append((Object) cx9.m9926h(eh0.m11127g(vo2Var.f65703b, vo2Var.f65704c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        u91.m22595M0(list, sb, "\n", new C0011a9(uo2Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            vo2 vo2Var2 = (vo2) this.f8656b;
            vo2Var2.getClass();
            C3419on c3419on = new C3419on(vo2Var2.f65702a.toString());
            vo2 vo2Var3 = (vo2) this.f8656b;
            long jM11127g = eh0.m11127g(vo2Var3.f65703b, vo2Var3.f65704c);
            cx9 cx9Var = cx9.m9925g(((vv9) this.f8655a).f65991b) ? null : new cx9(jM11127g);
            vv9 vv9Var = new vv9(c3419on, cx9Var != null ? cx9Var.f34694a : eh0.m11127g(cx9.m9923e(jM11127g), cx9.m9924f(jM11127g)), ((vo2) this.f8656b).m23455c());
            this.f8655a = vv9Var;
            return vv9Var;
        } catch (Exception e4) {
            uo2Var = null;
            e = e4;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3857n(Enum r3, float f) {
        ArrayList arrayList = (ArrayList) this.f8655a;
        arrayList.add(r3);
        if (((float[]) this.f8656b).length < arrayList.size()) {
            this.f8656b = Arrays.copyOf((float[]) this.f8656b, arrayList.size() + 2);
        }
        ((float[]) this.f8656b)[arrayList.size() - 1] = f;
    }

    /* JADX INFO: renamed from: o */
    public c33 m3858o() {
        return new c33((String) this.f8655a, ((HashMap) this.f8656b) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.f8656b)));
    }

    @Override // p000.uf7
    public void onDismiss() {
        ((t66) this.f8655a).setValue(Boolean.FALSE);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        id4.f43965t.m21555D("Referrer client disconnected");
        ce4 ce4Var = (ce4) this.f8655a;
        ((ny8) ((d74) ce4Var.f9968c).f35084h).m17683K(new RunnableC0806bd(24, this, ce4Var));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        GoogleReferrerStatus googleReferrerStatus;
        ce4 ce4Var = (ce4) this.f8655a;
        id4 id4Var = (id4) this.f8656b;
        try {
            if (i == -1) {
                googleReferrerStatus = GoogleReferrerStatus.ServiceDisconnected;
            } else if (i == 0) {
                googleReferrerStatus = GoogleReferrerStatus.Ok;
            } else if (i == 1) {
                googleReferrerStatus = GoogleReferrerStatus.ServiceUnavailable;
            } else if (i == 2) {
                googleReferrerStatus = GoogleReferrerStatus.FeatureNotSupported;
            } else if (i != 3) {
                googleReferrerStatus = i != 4 ? GoogleReferrerStatus.OtherError : GoogleReferrerStatus.PermissionError;
            } else {
                googleReferrerStatus = GoogleReferrerStatus.DeveloperError;
            }
            id4.f43965t.m21555D("Referrer client setup finished with status " + googleReferrerStatus);
            if (googleReferrerStatus == GoogleReferrerStatus.Ok) {
                ((ny8) ((d74) ce4Var.f9968c).f35084h).m17683K(new RunnableC0002a0(this, 12));
            } else {
                id4.m13793q(id4Var, ce4Var, googleReferrerStatus);
            }
        } catch (Throwable th) {
            id4.f43965t.m21555D("Unable to read the referrer status: ".concat(r46.m20395v(th)));
            id4.m13793q(id4Var, ce4Var, GoogleReferrerStatus.MissingDependency);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m3859r(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3859r(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3860s(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        id3 id3Var = abstractC0638f.f5763x.f42210L;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3860s(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m3861t(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3861t(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3862u(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3862u(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12507a(abstractComponentCallbacksC0635c, abstractC0638f);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m3863v(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3863v(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3864w(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3864w(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12508b(abstractComponentCallbacksC0635c);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3865x(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        id3 id3Var = abstractC0638f.f5763x.f42210L;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3865x(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m3866y(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((AbstractC0638f) this.f8655a).f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3866y(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m3867z(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        abstractComponentCallbacksC0635c.getClass();
        AbstractC0638f abstractC0638f = (AbstractC0638f) this.f8655a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractC0638f.f5765z;
        if (abstractComponentCallbacksC0635c2 != null) {
            abstractComponentCallbacksC0635c2.m2109k().f5755p.m3867z(abstractComponentCallbacksC0635c, true);
        }
        for (zd3 zd3Var : (CopyOnWriteArrayList) this.f8656b) {
            if (!z || zd3Var.f71383b) {
                zd3Var.f71382a.mo12509c(abstractComponentCallbacksC0635c, abstractC0638f);
            }
        }
    }

    public /* synthetic */ bl2(Object obj, Object obj2) {
        this.f8655a = obj;
        this.f8656b = obj2;
    }

    public /* synthetic */ bl2(Object obj, Object obj2, boolean z) {
        this.f8656b = obj;
        this.f8655a = obj2;
    }

    public /* synthetic */ bl2(Object obj) {
        this.f8656b = null;
        this.f8655a = obj;
    }

    public bl2(C0880b c0880b, pj5 pj5Var) {
        pj5Var.getClass();
        this.f8655a = c0880b;
        this.f8656b = pj5Var;
    }

    public bl2(int i) {
        switch (i) {
            case 4:
                this.f8655a = new Object();
                this.f8656b = new LinkedHashMap();
                break;
            case 5:
                this.f8655a = new Object();
                this.f8656b = new ArrayBlockingQueue(512);
                break;
            case 6:
                this.f8655a = new HashMap();
                this.f8656b = l41.f49011b;
                break;
            case 9:
                this.f8655a = new ArrayList();
                this.f8656b = new ArrayList();
                break;
            case 14:
                this.f8655a = new HashMap();
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                this.f8655a = new n66();
                this.f8656b = new n66();
                break;
            case 29:
                this.f8655a = new AtomicInteger();
                this.f8656b = new AtomicInteger();
                break;
            default:
                this.f8655a = new ArrayList();
                float[] fArr = new float[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    fArr[i2] = Float.NaN;
                }
                this.f8656b = fArr;
                break;
        }
    }
}
