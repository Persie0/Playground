package com.facebook.appevents;

import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import dm.C5207g;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0050a;
import p067d8.C5078r;
import p067d8.C5086z;
import p173i8.C6205a;
import p409u7.C9475a;
import p451w7.C9819a;
import p476x7.C10106e;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m13365d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "", "writeReplace", "a", "SerializationProxyV2", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AppEvent implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final HashSet<String> f11479f;

    /* JADX INFO: renamed from: a */
    public final JSONObject f11480a;

    /* JADX INFO: renamed from: b */
    public final boolean f11481b;

    /* JADX INFO: renamed from: c */
    public final boolean f11482c;

    /* JADX INFO: renamed from: d */
    public final String f11483d;

    /* JADX INFO: renamed from: e */
    public final String f11484e;

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "", "readResolve", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class SerializationProxyV2 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f11485a;

        /* JADX INFO: renamed from: b */
        public final boolean f11486b;

        /* JADX INFO: renamed from: c */
        public final boolean f11487c;

        /* JADX INFO: renamed from: d */
        public final String f11488d;

        public SerializationProxyV2(String str, boolean z10, boolean z11, String str2) {
            this.f11485a = str;
            this.f11486b = z10;
            this.f11487c = z11;
            this.f11488d = str2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.f11485a, this.f11486b, this.f11487c, this.f11488d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEvent$a */
    public static final class C2284a {
        /* JADX INFO: renamed from: a */
        public static final String m6640a(String str) {
            HashSet<String> hashSet = AppEvent.f11479f;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                C5207g.m11110e(charsetForName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charsetForName);
                C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                C5207g.m11110e(bArrDigest, "digest.digest()");
                return C10106e.m18962a(bArrDigest);
            } catch (UnsupportedEncodingException e10) {
                C5086z.m10806E("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                C5086z.m10806E("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: b */
        public static final void m6641b(String str) {
            boolean zContains;
            HashSet<String> hashSet = AppEvent.f11479f;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    HashSet<String> hashSet2 = AppEvent.f11479f;
                    synchronized (hashSet2) {
                        zContains = hashSet2.contains(str);
                        C9072e c9072e = C9072e.f47360a;
                    }
                    if (zContains) {
                        return;
                    }
                    if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m14271b(str)) {
                        throw new FacebookException(C0166e.m770q(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                    }
                    synchronized (hashSet2) {
                        try {
                            hashSet2.add(str);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(C0141b.m613i(new Object[]{str, 40}, 2, Locale.ROOT, "Identifier '%s' must be less than %d characters", "java.lang.String.format(locale, format, *args)"));
        }
    }

    static {
        new C2284a();
        f11479f = new HashSet<>();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) throws JSONException, FacebookException {
        boolean zContains;
        C9475a.a aVar;
        C5207g.m11111f(str, "contextName");
        C5207g.m11111f(str2, "eventName");
        this.f11481b = z10;
        this.f11482c = z11;
        this.f11483d = str2;
        C2284a.m6641b(str2);
        JSONObject jSONObject = new JSONObject();
        C0050a c0050a = C0050a.f60a;
        if (C6205a.m12742b(C0050a.class)) {
            str2 = null;
        } else {
            try {
                if (C0050a.f61b) {
                    C0050a c0050a2 = C0050a.f60a;
                    c0050a2.getClass();
                    if (!C6205a.m12742b(c0050a2)) {
                        try {
                            zContains = C0050a.f64e.contains(str2);
                        } catch (Throwable th2) {
                            C6205a.m12741a(c0050a2, th2);
                            zContains = false;
                        }
                        if (zContains) {
                            str2 = "_removed_";
                        }
                    }
                    zContains = false;
                    if (zContains) {
                        str2 = "_removed_";
                    }
                }
            } catch (Throwable th3) {
                C6205a.m12741a(C0050a.class, th3);
                str2 = null;
            }
        }
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", C2284a.m6640a(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap map = new HashMap();
            for (String str3 : bundle.keySet()) {
                C5207g.m11110e(str3, "key");
                C2284a.m6641b(str3);
                Object obj = bundle.get(str3);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new FacebookException(C0166e.m770q(new Object[]{obj, str3}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "java.lang.String.format(format, *args)"));
                }
                map.put(str3, obj.toString());
            }
            C9819a c9819a = C9819a.f49984a;
            if (!C6205a.m12742b(C9819a.class)) {
                try {
                    if (C9819a.f49985b && !map.isEmpty()) {
                        try {
                            List<String> listM13453u0 = C6752c.m13453u0(map.keySet());
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str4 : listM13453u0) {
                                Object obj2 = map.get(str4);
                                if (obj2 == null) {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                String str5 = (String) obj2;
                                C9819a c9819a2 = C9819a.f49984a;
                                if (c9819a2.m18304a(str4) || c9819a2.m18304a(str5)) {
                                    map.remove(str4);
                                    if (!C9819a.f49986c) {
                                        str5 = "";
                                    }
                                    jSONObject2.put(str4, str5);
                                }
                            }
                            if (jSONObject2.length() != 0) {
                                String string = jSONObject2.toString();
                                C5207g.m11110e(string, "restrictiveParamJson.toString()");
                                map.put("_onDeviceParams", string);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th4) {
                    C6205a.m12741a(C9819a.class, th4);
                }
            }
            C0050a c0050a3 = C0050a.f60a;
            boolean zM12742b = C6205a.m12742b(C0050a.class);
            String str6 = this.f11483d;
            if (!zM12742b) {
                try {
                    C5207g.m11111f(str6, "eventName");
                    if (C0050a.f61b) {
                        HashMap map2 = new HashMap();
                        for (String str7 : new ArrayList(map.keySet())) {
                            String strM206a = C0050a.f60a.m206a(str6, str7);
                            if (strM206a != null) {
                                map2.put(str7, strM206a);
                                map.remove(str7);
                            }
                        }
                        if (!map2.isEmpty()) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                map.put("_restrictedParams", jSONObject3.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th5) {
                    C6205a.m12741a(C0050a.class, th5);
                }
            }
            C9475a c9475a = C9475a.f48579a;
            if (!C6205a.m12742b(C9475a.class)) {
                try {
                    C5207g.m11111f(str6, "eventName");
                    if (C9475a.f48580b) {
                        ArrayList arrayList = new ArrayList(map.keySet());
                        Iterator it = new ArrayList(C9475a.f48581c).iterator();
                        loop2: while (true) {
                            do {
                                if (!it.hasNext()) {
                                    break loop2;
                                } else {
                                    aVar = (C9475a.a) it.next();
                                }
                            } while (!C5207g.m11106a(aVar.f48583a, str6));
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                while (true) {
                                    if (it2.hasNext()) {
                                        String str8 = (String) it2.next();
                                        if (aVar.f48584b.contains(str8)) {
                                            map.remove(str8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th6) {
                    C6205a.m12741a(C9475a.class, th6);
                }
            }
            for (String str9 : map.keySet()) {
                jSONObject.put(str9, map.get(str9));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f11482c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f11481b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C5078r.a aVar2 = C5078r.f32986e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string2 = jSONObject.toString();
            C5207g.m11110e(string2, "eventObject.toString()");
            aVar2.m10781c(loggingBehavior, "AppEvents", "Created app event '%s'", string2);
        }
        this.f11480a = jSONObject;
        String string3 = jSONObject.toString();
        C5207g.m11110e(string3, "jsonObject.toString()");
        this.f11484e = C2284a.m6640a(string3);
    }

    public AppEvent(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f11480a = jSONObject;
        this.f11481b = z10;
        String strOptString = jSONObject.optString("_eventName");
        C5207g.m11110e(strOptString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f11483d = strOptString;
        this.f11484e = str2;
        this.f11482c = z11;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f11480a.toString();
        C5207g.m11110e(string, "jsonObject.toString()");
        return new SerializationProxyV2(string, this.f11481b, this.f11482c, this.f11484e);
    }

    public final String toString() {
        JSONObject jSONObject = this.f11480a;
        return C0166e.m770q(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f11481b), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }
}
