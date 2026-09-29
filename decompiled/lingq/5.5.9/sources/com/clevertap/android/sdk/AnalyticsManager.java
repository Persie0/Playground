package com.clevertap.android.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0140a;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.validation.Validator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028b7.C1325c;
import p028b7.C1327e;
import p028b7.C1330h;
import p028b7.C1331i;
import p043c7.C1735a;
import p066d7.C5049a;
import p066d7.C5054f;
import p088e7.C5382b;
import p088e7.C5383c;
import p289o5.C7940t;
import p290o6.C7951d0;
import p290o6.C7963j0;
import p290o6.C7972o;
import p290o6.C7985x;
import p290o6.C7986y;
import p357r6.C8740b;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsManager extends AbstractC0140a {

    /* JADX INFO: renamed from: K */
    public NumberValueType f10944K;

    /* JADX INFO: renamed from: a */
    public final C7940t f10945a;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f10947c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0140a f10948d;

    /* JADX INFO: renamed from: e */
    public final CleverTapInstanceConfig f10949e;

    /* JADX INFO: renamed from: f */
    public final Context f10950f;

    /* JADX INFO: renamed from: g */
    public final C7985x f10951g;

    /* JADX INFO: renamed from: h */
    public final C7986y f10952h;

    /* JADX INFO: renamed from: i */
    public final C7951d0 f10953i;

    /* JADX INFO: renamed from: j */
    public final C7963j0 f10954j;

    /* JADX INFO: renamed from: k */
    public final C5383c f10955k;

    /* JADX INFO: renamed from: l */
    public final Validator f10956l;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Integer> f10946b = new HashMap<>(8);

    /* JADX INFO: renamed from: H */
    public final HashMap<String, Object> f10941H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public final Object f10942I = new Object();

    /* JADX INFO: renamed from: J */
    public final HashMap<String, Object> f10943J = new HashMap<>();

    public enum NumberValueType {
        INT_NUMBER,
        FLOAT_NUMBER,
        DOUBLE_NUMBER
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.AnalyticsManager$a */
    public class CallableC2166a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bundle f10957a;

        public CallableC2166a(Bundle bundle) {
            this.f10957a = bundle;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            AnalyticsManager analyticsManager = AnalyticsManager.this;
            Bundle bundle = this.f10957a;
            try {
                C2181a.m6455h("Received in-app via push payload: " + bundle.getString("wzrk_inapp"));
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("inapp_notifs", jSONArray);
                jSONArray.put(new JSONObject(bundle.getString("wzrk_inapp")));
                new C1330h(new C1325c(), analyticsManager.f10949e, analyticsManager.f10951g, true).mo591b0(jSONObject, null, analyticsManager.f10950f);
            } catch (Throwable th2) {
                C2181a.m6457j("Failed to display inapp notification from push notification payload", th2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.AnalyticsManager$b */
    public class CallableC2167b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bundle f10959a;

        public CallableC2167b(Bundle bundle) {
            this.f10959a = bundle;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            AnalyticsManager analyticsManager = AnalyticsManager.this;
            Bundle bundle = this.f10959a;
            try {
                C2181a.m6455h("Received inbox via push payload: " + bundle.getString("wzrk_inbox"));
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("inbox_notifs", jSONArray);
                JSONObject jSONObject2 = new JSONObject(bundle.getString("wzrk_inbox"));
                jSONObject2.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
                jSONArray.put(jSONObject2);
                new C1331i(new C1325c(), analyticsManager.f10949e, analyticsManager.f10945a, analyticsManager.f10948d, analyticsManager.f10951g).mo591b0(jSONObject, null, analyticsManager.f10950f);
            } catch (Throwable th2) {
                C2181a.m6457j("Failed to process inbox message from push notification payload", th2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.AnalyticsManager$c */
    public class CallableC2168c implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f10961a;

        public CallableC2168c(Map map) {
            this.f10961a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.lang.String] */
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
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            AnalyticsManager analyticsManager = AnalyticsManager.this;
            Validator validator = analyticsManager.f10956l;
            CleverTapInstanceConfig cleverTapInstanceConfig = analyticsManager.f10949e;
            Map map = this.f10961a;
            if (map == null || map.isEmpty()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    validator.getClass();
                    C5382b c5382bM6589d = Validator.m6589d(str);
                    String string = c5382bM6589d.f33799c.toString();
                    int i10 = c5382bM6589d.f33797a;
                    C5383c c5383c = analyticsManager.f10955k;
                    if (i10 != 0) {
                        c5383c.m11556b(c5382bM6589d);
                    }
                    if (string.isEmpty()) {
                        C5382b c5382bM3821c = C0987y.m3821c(512, 2, new String[0]);
                        c5383c.m11556b(c5382bM3821c);
                        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                        String str2 = cleverTapInstanceConfig.f10995a;
                        String str3 = c5382bM3821c.f33798b;
                        c2181aM6433b.getClass();
                        C2181a.m6452d(str2, str3);
                    } else {
                        try {
                            C5382b c5382bM6590e = Validator.m6590e(obj, Validator.ValidationContext.Profile);
                            Object string2 = c5382bM6590e.f33799c;
                            if (c5382bM6590e.f33797a != 0) {
                                c5383c.m11556b(c5382bM6590e);
                            }
                            if (string.equalsIgnoreCase("Phone")) {
                                try {
                                    string2 = string2.toString();
                                    String str4 = analyticsManager.f10953i.m15764h().f43305d;
                                    if ((str4 == null || str4.isEmpty()) && !string2.startsWith("+")) {
                                        C5382b c5382bM3821c2 = C0987y.m3821c(512, 4, string2);
                                        c5383c.m11556b(c5382bM3821c2);
                                        C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                                        String str5 = cleverTapInstanceConfig.f10995a;
                                        String str6 = c5382bM3821c2.f33798b;
                                        c2181aM6433b2.getClass();
                                        C2181a.m6452d(str5, str6);
                                    }
                                    C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                                    String str7 = cleverTapInstanceConfig.f10995a;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Profile phone is: ");
                                    sb2.append((Object) string2);
                                    sb2.append(" device country code is: ");
                                    if (str4 == null) {
                                        str4 = "null";
                                    }
                                    sb2.append(str4);
                                    String string3 = sb2.toString();
                                    c2181aM6433b3.getClass();
                                    C2181a.m6460m(str7, string3);
                                } catch (Exception e10) {
                                    c5383c.m11556b(C0987y.m3821c(512, 5, new String[0]));
                                    C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
                                    String str8 = cleverTapInstanceConfig.f10995a;
                                    String str9 = "Invalid phone number: " + e10.getLocalizedMessage();
                                    c2181aM6433b4.getClass();
                                    C2181a.m6452d(str8, str9);
                                }
                            }
                            jSONObject2.put(string, string2);
                            jSONObject.put(string, string2);
                        } catch (Throwable unused) {
                            String[] strArr = new String[2];
                            strArr[0] = obj != null ? obj.toString() : "";
                            strArr[1] = string;
                            C5382b c5382bM3821c3 = C0987y.m3821c(512, 3, strArr);
                            c5383c.m11556b(c5382bM3821c3);
                            C2181a c2181aM6433b5 = cleverTapInstanceConfig.m6433b();
                            String str10 = cleverTapInstanceConfig.f10995a;
                            String str11 = c5382bM3821c3.f33798b;
                            c2181aM6433b5.getClass();
                            C2181a.m6452d(str10, str11);
                        }
                    }
                }
                C2181a c2181aM6433b6 = cleverTapInstanceConfig.m6433b();
                String str12 = cleverTapInstanceConfig.f10995a;
                String str13 = "Constructed custom profile: " + jSONObject.toString();
                c2181aM6433b6.getClass();
                C2181a.m6460m(str12, str13);
                if (jSONObject2.length() > 0) {
                    analyticsManager.f10954j.m15793m(jSONObject2, Boolean.FALSE);
                }
                analyticsManager.f10947c.mo592c0(jSONObject, false);
                return null;
            } catch (Throwable th2) {
                cleverTapInstanceConfig.m6433b().getClass();
                C2181a.m6461n(cleverTapInstanceConfig.f10995a, "Failed to push profile", th2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.AnalyticsManager$d */
    public static /* synthetic */ class C2169d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10963a;

        static {
            int[] iArr = new int[NumberValueType.values().length];
            f10963a = iArr;
            try {
                iArr[NumberValueType.DOUBLE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10963a[NumberValueType.FLOAT_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AnalyticsManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C8740b c8740b, Validator validator, C5383c c5383c, C7986y c7986y, C7963j0 c7963j0, C7951d0 c7951d0, C7972o c7972o, C7985x c7985x, C7940t c7940t) {
        this.f10950f = context;
        this.f10949e = cleverTapInstanceConfig;
        this.f10947c = c8740b;
        this.f10956l = validator;
        this.f10955k = c5383c;
        this.f10952h = c7986y;
        this.f10954j = c7963j0;
        this.f10953i = c7951d0;
        this.f10948d = c7972o;
        this.f10945a = c7940t;
        this.f10951g = c7985x;
    }

    /* JADX INFO: renamed from: q0 */
    public static void m6401q0(AnalyticsManager analyticsManager, ArrayList arrayList, String str, String str2) {
        analyticsManager.getClass();
        if (str == null) {
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            analyticsManager.f10956l.getClass();
            C5382b c5382bM6587b = Validator.m6587b(str);
            int i10 = c5382bM6587b.f33797a;
            C5383c c5383c = analyticsManager.f10955k;
            if (i10 != 0) {
                c5383c.m11556b(c5382bM6587b);
            }
            Object obj = c5382bM6587b.f33799c;
            String string = obj != null ? obj.toString() : null;
            CleverTapInstanceConfig cleverTapInstanceConfig = analyticsManager.f10949e;
            if (string != null && !string.isEmpty()) {
                try {
                    analyticsManager.m6408p0(analyticsManager.m6404l0(string, str2), analyticsManager.m6403k0(string, arrayList), arrayList, string, str2);
                    return;
                } catch (Throwable th2) {
                    C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                    String strConcat = "Error handling multi value operation for key ".concat(string);
                    c2181aM6433b.getClass();
                    C2181a.m6461n(cleverTapInstanceConfig.f10995a, strConcat, th2);
                    return;
                }
            }
            c5383c.m11556b(C0987y.m3821c(523, 23, str));
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Invalid multi-value property key " + str + " profile multi value operation aborted");
            return;
        }
        analyticsManager.m6406n0(str);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m6402A0(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        C1735a.m5472a(this.f10949e).m5474b().m6585b("profilePush", new CallableC2168c(map));
    }

    /* JADX INFO: renamed from: k0 */
    public final JSONArray m6403k0(String str, ArrayList arrayList) {
        if (arrayList != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.f10956l.getClass();
                    C5382b c5382bM6588c = Validator.m6588c(str2);
                    if (c5382bM6588c.f33797a != 0) {
                        this.f10955k.m11556b(c5382bM6588c);
                    }
                    Object obj = c5382bM6588c.f33799c;
                    String string = obj != null ? obj.toString() : null;
                    if (string != null && !string.isEmpty()) {
                        jSONArray.put(string);
                    }
                    m6406n0(str);
                    return null;
                }
                return jSONArray;
            } catch (Throwable th2) {
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String strConcat = "Error cleaning multi values for key ".concat(str);
                c2181aM6433b.getClass();
                C2181a.m6461n(cleverTapInstanceConfig.f10995a, strConcat, th2);
                m6406n0(str);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final JSONArray m6404l0(String str, String str2) {
        String string;
        boolean zEquals = str2.equals("$remove");
        boolean zEquals2 = str2.equals("$add");
        if (!zEquals && !zEquals2) {
            return new JSONArray();
        }
        Object objM15786f = this.f10954j.m15786f(str);
        if (objM15786f == null) {
            if (zEquals) {
                return null;
            }
            return new JSONArray();
        }
        if (objM15786f instanceof JSONArray) {
            return (JSONArray) objM15786f;
        }
        JSONArray jSONArray = zEquals2 ? new JSONArray() : null;
        try {
            string = objM15786f.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (string != null) {
            this.f10956l.getClass();
            C5382b c5382bM6588c = Validator.m6588c(string);
            if (c5382bM6588c.f33797a != 0) {
                this.f10955k.m11556b(c5382bM6588c);
            }
            Object obj = c5382bM6588c.f33799c;
            string = obj != null ? obj.toString() : null;
        }
        if (string != null) {
            jSONArray = new JSONArray().put(string);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6405m0(Double d10, String str, String str2) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        if (str == null || d10 == null) {
            return;
        }
        try {
            this.f10956l.getClass();
            C5382b c5382bM6589d = Validator.m6589d(str);
            String string = c5382bM6589d.f33799c.toString();
            boolean zIsEmpty = string.isEmpty();
            C5383c c5383c = this.f10955k;
            if (zIsEmpty) {
                C5382b c5382bM3821c = C0987y.m3821c(512, 2, string);
                c5383c.m11556b(c5382bM3821c);
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str3 = cleverTapInstanceConfig.f10995a;
                String str4 = c5382bM3821c.f33798b;
                c2181aM6433b.getClass();
                C2181a.m6452d(str3, str4);
                return;
            }
            if (d10.intValue() >= 0 && d10.doubleValue() >= 0.0d && d10.floatValue() >= 0.0f) {
                if (c5382bM6589d.f33797a != 0) {
                    c5383c.m11556b(c5382bM6589d);
                }
                this.f10954j.m15792l(string, m6407o0(d10, string, str2), Boolean.FALSE, true);
                this.f10947c.mo592c0(new JSONObject().put(string, new JSONObject().put(str2, d10)), false);
                return;
            }
            C5382b c5382bM3821c2 = C0987y.m3821c(512, 25, string);
            c5383c.m11556b(c5382bM3821c2);
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String str5 = cleverTapInstanceConfig.f10995a;
            String str6 = c5382bM3821c2.f33798b;
            c2181aM6433b2.getClass();
            C2181a.m6452d(str5, str6);
        } catch (Throwable th2) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6461n(cleverTapInstanceConfig.f10995a, "Failed to update profile value for key " + str, th2);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6406n0(String str) {
        C5382b c5382bM3821c = C0987y.m3821c(512, 1, str);
        this.f10955k.m11556b(c5382bM3821c);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        String str2 = c5382bM3821c.f33798b;
        c2181aM6433b.getClass();
        C2181a.m6452d(cleverTapInstanceConfig.f10995a, str2);
    }

    /* JADX INFO: renamed from: o0 */
    public final Number m6407o0(Double d10, String str, String str2) {
        Number number = (Number) this.f10954j.m15786f(str);
        if (number == null) {
            int i10 = C2169d.f10963a[m6410s0(d10).ordinal()];
            if (i10 == 1) {
                if (str2.equals("$incr")) {
                    return Double.valueOf(d10.doubleValue());
                }
                if (str2.equals("$decr")) {
                    return Double.valueOf(-d10.doubleValue());
                }
                return null;
            }
            if (i10 != 2) {
                if (str2.equals("$incr")) {
                    return Integer.valueOf(d10.intValue());
                }
                if (str2.equals("$decr")) {
                    return Integer.valueOf(-d10.intValue());
                }
                return null;
            }
            if (str2.equals("$incr")) {
                return Float.valueOf(d10.floatValue());
            }
            if (str2.equals("$decr")) {
                return Float.valueOf(-d10.floatValue());
            }
            return null;
        }
        int i11 = C2169d.f10963a[m6410s0(number).ordinal()];
        if (i11 == 1) {
            if (str2.equals("$incr")) {
                return Double.valueOf(d10.doubleValue() + number.doubleValue());
            }
            if (str2.equals("$decr")) {
                return Double.valueOf(number.doubleValue() - d10.doubleValue());
            }
            return null;
        }
        if (i11 != 2) {
            if (str2.equals("$incr")) {
                return Integer.valueOf(d10.intValue() + number.intValue());
            }
            if (str2.equals("$decr")) {
                return Integer.valueOf(number.intValue() - d10.intValue());
            }
            return null;
        }
        if (str2.equals("$incr")) {
            return Float.valueOf(d10.floatValue() + number.floatValue());
        }
        if (str2.equals("$decr")) {
            return Float.valueOf(number.floatValue() - d10.floatValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m6408p0(JSONArray jSONArray, JSONArray jSONArray2, ArrayList<String> arrayList, String str, String str2) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        if (jSONArray == null || jSONArray2 == null || arrayList == null) {
            return;
        }
        try {
            String str3 = str2.equals("$remove") ? "multiValuePropertyRemoveValues" : "multiValuePropertyAddValues";
            this.f10956l.getClass();
            C5382b c5382bM6591f = Validator.m6591f(jSONArray, jSONArray2, str3, str);
            if (c5382bM6591f.f33797a != 0) {
                this.f10955k.m11556b(c5382bM6591f);
            }
            JSONArray jSONArray3 = (JSONArray) c5382bM6591f.f33799c;
            C7963j0 c7963j0 = this.f10954j;
            if (jSONArray3 == null || jSONArray3.length() <= 0) {
                c7963j0.m15790j(str, Boolean.FALSE);
            } else {
                c7963j0.m15792l(str, jSONArray3, Boolean.FALSE, true);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, new JSONArray((Collection) arrayList));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, jSONObject);
            this.f10947c.mo592c0(jSONObject2, false);
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str4 = cleverTapInstanceConfig.f10995a;
            String str5 = "Constructed multi-value profile push: " + jSONObject2.toString();
            c2181aM6433b.getClass();
            C2181a.m6460m(str4, str5);
        } catch (Throwable th2) {
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String strConcat = "Error pushing multiValue for key ".concat(str);
            c2181aM6433b2.getClass();
            C2181a.m6461n(cleverTapInstanceConfig.f10995a, strConcat, th2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m6409r0(Bundle bundle, HashMap<String, Object> map, int i10) {
        boolean z10;
        synchronized (this.f10942I) {
            z10 = false;
            try {
                String string = bundle.getString("wzrk_id");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (map.containsKey(string) && jCurrentTimeMillis - ((Long) map.get(string)).longValue() < i10) {
                    z10 = true;
                }
                map.put(string, Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: s0 */
    public final NumberValueType m6410s0(Number number) {
        if (number.equals(Integer.valueOf(number.intValue()))) {
            this.f10944K = NumberValueType.INT_NUMBER;
        } else if (number.equals(Double.valueOf(number.doubleValue()))) {
            this.f10944K = NumberValueType.DOUBLE_NUMBER;
        } else if (number.equals(Float.valueOf(number.floatValue()))) {
            this.f10944K = NumberValueType.FLOAT_NUMBER;
        }
        return this.f10944K;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m6411t0() {
        boolean z10;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        boolean z11 = cleverTapInstanceConfig.f11004j;
        C7986y c7986y = this.f10952h;
        if (z11) {
            synchronized (c7986y.f43461c) {
                try {
                    c7986y.f43460b = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6452d(str, "App Launched Events disabled in the Android Manifest file");
            return;
        }
        synchronized (c7986y.f43461c) {
            z10 = c7986y.f43460b;
        }
        if (z10) {
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM6433b2.getClass();
            C2181a.m6460m(str2, "App Launched has already been triggered. Will not trigger it ");
            return;
        }
        C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
        String str3 = cleverTapInstanceConfig.f10995a;
        c2181aM6433b3.getClass();
        C2181a.m6460m(str3, "Firing App Launched event");
        synchronized (c7986y.f43461c) {
            try {
                c7986y.f43460b = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evtName", "App Launched");
            jSONObject.put("evtData", this.f10953i.m15762f());
        } catch (Throwable unused) {
        }
        this.f10947c.mo595e0(this.f10950f, jSONObject, 4);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:9:0x0008, B:11:0x0017, B:12:0x0027, B:16:0x0030, B:19:0x0033, B:21:0x0035, B:22:0x0036, B:24:0x003f, B:25:0x004d, B:30:0x0056, B:37:0x005d, B:39:0x0066, B:40:0x0077, B:44:0x0080, B:51:0x0087, B:53:0x0095, B:47:0x0083, B:48:0x0084, B:33:0x0059, B:35:0x005b, B:41:0x0078, B:43:0x007d, B:13:0x0028, B:15:0x002d, B:26:0x004e, B:28:0x0053), top: B:87:0x0008, inners: #0, #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #4 {all -> 0x0058, blocks: (B:26:0x004e, B:28:0x0053), top: B:83:0x004e, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066 A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:9:0x0008, B:11:0x0017, B:12:0x0027, B:16:0x0030, B:19:0x0033, B:21:0x0035, B:22:0x0036, B:24:0x003f, B:25:0x004d, B:30:0x0056, B:37:0x005d, B:39:0x0066, B:40:0x0077, B:44:0x0080, B:51:0x0087, B:53:0x0095, B:47:0x0083, B:48:0x0084, B:33:0x0059, B:35:0x005b, B:41:0x0078, B:43:0x007d, B:13:0x0028, B:15:0x002d, B:26:0x004e, B:28:0x0053), top: B:87:0x0008, inners: #0, #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {, blocks: (B:41:0x0078, B:43:0x007d), top: B:75:0x0078, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #6 {all -> 0x00cd, blocks: (B:9:0x0008, B:11:0x0017, B:12:0x0027, B:16:0x0030, B:19:0x0033, B:21:0x0035, B:22:0x0036, B:24:0x003f, B:25:0x004d, B:30:0x0056, B:37:0x005d, B:39:0x0066, B:40:0x0077, B:44:0x0080, B:51:0x0087, B:53:0x0095, B:47:0x0083, B:48:0x0084, B:33:0x0059, B:35:0x005b, B:41:0x0078, B:43:0x007d, B:13:0x0028, B:15:0x002d, B:26:0x004e, B:28:0x0053), top: B:87:0x0008, inners: #0, #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00e4, blocks: (B:54:0x009b, B:56:0x00a7, B:57:0x00ac, B:59:0x00b3, B:62:0x00c4), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: u0 */
    public final synchronized void m6412u0(boolean z10, Uri uri) {
        JSONObject jSONObject;
        Iterator<String> itKeys;
        C7986y c7986y;
        String string;
        C7986y c7986y2;
        String string2;
        if (uri == null) {
            return;
        }
        try {
            JSONObject jSONObjectM10734b = C5054f.m10734b(uri);
            if (jSONObjectM10734b.has("us")) {
                C7986y c7986y3 = this.f10952h;
                String string3 = jSONObjectM10734b.get("us").toString();
                synchronized (c7986y3) {
                    try {
                        if (c7986y3.f43455M == null) {
                            c7986y3.f43455M = string3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jSONObjectM10734b.has("um")) {
                    c7986y2 = this.f10952h;
                    string2 = jSONObjectM10734b.get("um").toString();
                    synchronized (c7986y2) {
                        try {
                            if (c7986y2.f43456N == null) {
                                c7986y2.f43456N = string2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                if (jSONObjectM10734b.has("uc")) {
                    c7986y = this.f10952h;
                    string = jSONObjectM10734b.get("uc").toString();
                    synchronized (c7986y) {
                        if (c7986y.f43457O == null) {
                            c7986y.f43457O = string;
                        }
                    }
                }
                jSONObjectM10734b.put("referrer", uri.toString());
                if (z10) {
                    jSONObjectM10734b.put("install", true);
                }
                try {
                    jSONObject = new JSONObject();
                    if (jSONObjectM10734b.length() > 0) {
                        itKeys = jSONObjectM10734b.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                jSONObject.put(next, jSONObjectM10734b.getString(next));
                            } catch (ClassCastException unused) {
                            }
                        }
                    }
                    this.f10947c.mo595e0(this.f10950f, jSONObject, 1);
                } catch (Throwable unused2) {
                }
            } else {
                if (jSONObjectM10734b.has("um")) {
                    c7986y2 = this.f10952h;
                    string2 = jSONObjectM10734b.get("um").toString();
                    synchronized (c7986y2) {
                        if (c7986y2.f43456N == null) {
                            c7986y2.f43456N = string2;
                        }
                    }
                }
                if (jSONObjectM10734b.has("uc")) {
                    c7986y = this.f10952h;
                    string = jSONObjectM10734b.get("uc").toString();
                    synchronized (c7986y) {
                        if (c7986y.f43457O == null) {
                            c7986y.f43457O = string;
                        }
                    }
                }
                jSONObjectM10734b.put("referrer", uri.toString());
                if (z10) {
                    jSONObjectM10734b.put("install", true);
                }
                jSONObject = new JSONObject();
                if (jSONObjectM10734b.length() > 0) {
                    itKeys = jSONObjectM10734b.keys();
                    while (itKeys.hasNext()) {
                        String next2 = itKeys.next();
                        jSONObject.put(next2, jSONObjectM10734b.getString(next2));
                    }
                }
                this.f10947c.mo595e0(this.f10950f, jSONObject, 1);
            }
        } catch (Throwable th4) {
            C2181a c2181aM6433b = this.f10949e.m6433b();
            String str = this.f10949e.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6461n(str, "Failed to push deep link", th4);
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: v */
    public final void mo605v() {
        if (this.f10949e.f10999e) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", 1);
            jSONObject.put("evtName", "wzrk_fetch");
            jSONObject.put("evtData", jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.f10947c.mo595e0(this.f10950f, jSONObject, 7);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m6413v0(boolean z10, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = cTInAppNotification.f11088R;
            Iterator<String> itKeys = jSONObject3.keys();
            loop0: while (true) {
                while (true) {
                    if (!itKeys.hasNext()) {
                        break loop0;
                    }
                    String next = itKeys.next();
                    if (next.startsWith("wzrk_")) {
                        jSONObject2.put(next, jSONObject3.get(next));
                    }
                }
            }
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj);
                    }
                }
            }
            if (z10) {
                try {
                    C7986y c7986y = this.f10952h;
                    synchronized (c7986y) {
                        try {
                            if (c7986y.f43458P == null) {
                                c7986y.f43458P = jSONObject2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable unused) {
                }
                jSONObject.put("evtName", "Notification Clicked");
            } else {
                jSONObject.put("evtName", "Notification Viewed");
            }
            jSONObject.put("evtData", jSONObject2);
            this.f10947c.mo595e0(this.f10950f, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m6414w0(boolean z10, CTInboxMessage cTInboxMessage, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = cTInboxMessage.f11275L;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (bundle != null) {
                Iterator<String> it = bundle.keySet().iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        String next = it.next();
                        Object obj = bundle.get(next);
                        if (obj != null) {
                            jSONObject2.put(next, obj);
                        }
                    }
                }
            }
            if (z10) {
                try {
                    C7986y c7986y = this.f10952h;
                    synchronized (c7986y) {
                        try {
                            if (c7986y.f43458P == null) {
                                c7986y.f43458P = jSONObject2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable unused) {
                }
                jSONObject.put("evtName", "Notification Clicked");
            } else {
                jSONObject.put("evtName", "Notification Viewed");
            }
            jSONObject.put("evtData", jSONObject2);
            this.f10947c.mo595e0(this.f10950f, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m6415x0(String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        try {
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str2, "Referrer received: " + str);
            if (str == null) {
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            HashMap<String, Integer> map = this.f10946b;
            if (!map.containsKey(str) || iCurrentTimeMillis - map.get(str).intValue() >= 10) {
                map.put(str, Integer.valueOf(iCurrentTimeMillis));
                m6412u0(true, Uri.parse("wzrk://track?install=true&".concat(str)));
            } else {
                cleverTapInstanceConfig.m6433b().getClass();
                C2181a.m6460m(str2, "Skipping install referrer due to duplicate within 10 seconds");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: y0 */
    public final void m6416y0(Bundle bundle) {
        String string;
        boolean z10;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        if (cleverTapInstanceConfig.f10999e) {
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6452d(str, "is Analytics Only - will not process Notification Clicked event.");
            return;
        }
        if (bundle != null && !bundle.isEmpty()) {
            if (bundle.get("wzrk_pn") != null) {
                try {
                    string = bundle.getString("wzrk_acct_id");
                } catch (Throwable unused) {
                    string = null;
                }
                if (string == null && cleverTapInstanceConfig.f10988H) {
                    z10 = true;
                } else if (cleverTapInstanceConfig.f10995a.equals(string)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                    String str2 = cleverTapInstanceConfig.f10995a;
                    c2181aM6433b2.getClass();
                    C2181a.m6452d(str2, "Push notification not targeted at this instance, not processing Notification Clicked Event");
                    return;
                }
                if (bundle.containsKey("wzrk_inapp")) {
                    C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("testInappNotification", new CallableC2166a(bundle));
                    return;
                }
                if (bundle.containsKey("wzrk_inbox")) {
                    C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("testInboxNotification", new CallableC2167b(bundle));
                    return;
                }
                boolean zContainsKey = bundle.containsKey("wzrk_adunit");
                Context context = this.f10950f;
                AbstractC0140a abstractC0140a = this.f10948d;
                if (zContainsKey) {
                    try {
                        new C1327e(new C1325c(), cleverTapInstanceConfig, abstractC0140a, this.f10951g).mo591b0(C5049a.m10722a(bundle), null, context);
                        return;
                    } catch (Throwable th2) {
                        C2181a.m6457j("Failed to process Display Unit from push notification payload", th2);
                        return;
                    }
                }
                if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
                    C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                    String str3 = cleverTapInstanceConfig.f10995a;
                    String str4 = "Push notification ID Tag is null, not processing Notification Clicked event for:  " + bundle.toString();
                    c2181aM6433b3.getClass();
                    C2181a.m6452d(str3, str4);
                    return;
                }
                if (m6409r0(bundle, this.f10941H, 5000)) {
                    C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
                    String str5 = cleverTapInstanceConfig.f10995a;
                    String str6 = "Already processed Notification Clicked event for " + bundle.toString() + ", dropping duplicate.";
                    c2181aM6433b4.getClass();
                    C2181a.m6452d(str5, str6);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (String str7 : bundle.keySet()) {
                        if (str7.startsWith("wzrk_")) {
                            jSONObject2.put(str7, bundle.get(str7));
                        }
                    }
                    jSONObject.put("evtName", "Notification Clicked");
                    jSONObject.put("evtData", jSONObject2);
                    this.f10947c.mo595e0(context, jSONObject, 4);
                    C7986y c7986y = this.f10952h;
                    JSONObject jSONObjectM10726e = C5049a.m10726e(bundle);
                    synchronized (c7986y) {
                        try {
                            if (c7986y.f43458P == null) {
                                c7986y.f43458P = jSONObjectM10726e;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable unused2) {
                }
                abstractC0140a.mo576N();
                C2181a.m6449a("CTPushNotificationListener is not set");
                return;
            }
        }
        C2181a c2181aM6433b5 = cleverTapInstanceConfig.m6433b();
        String str8 = cleverTapInstanceConfig.f10995a;
        StringBuilder sb2 = new StringBuilder("Push notification: ");
        sb2.append(bundle == null ? "NULL" : bundle.toString());
        sb2.append(" not from CleverTap - will not process Notification Clicked event.");
        String string2 = sb2.toString();
        c2181aM6433b5.getClass();
        C2181a.m6452d(str8, string2);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6417z0(Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f10949e;
        if (bundle != null && !bundle.isEmpty() && bundle.get("wzrk_pn") != null) {
            if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str = "Push notification ID Tag is null, not processing Notification Viewed event for:  " + bundle.toString();
                c2181aM6433b.getClass();
                C2181a.m6452d(cleverTapInstanceConfig.f10995a, str);
                return;
            }
            if (m6409r0(bundle, this.f10943J, 2000)) {
                C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                String str2 = "Already processed Notification Viewed event for " + bundle.toString() + ", dropping duplicate.";
                c2181aM6433b2.getClass();
                C2181a.m6452d(cleverTapInstanceConfig.f10995a, str2);
                return;
            }
            C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
            String str3 = "Recording Notification Viewed event for notification:  " + bundle.toString();
            c2181aM6433b3.getClass();
            C2181a.m6451c(str3);
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObjectM10726e = C5049a.m10726e(bundle);
                jSONObject.put("evtName", "Notification Viewed");
                jSONObject.put("evtData", jSONObjectM10726e);
            } catch (Throwable unused) {
            }
            this.f10952h.f43451I = bundle.getString("wzrk_pid");
            this.f10947c.mo595e0(this.f10950f, jSONObject, 6);
            return;
        }
        C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
        StringBuilder sb2 = new StringBuilder("Push notification: ");
        sb2.append(bundle == null ? "NULL" : bundle.toString());
        sb2.append(" not from CleverTap - will not process Notification Viewed event.");
        String string = sb2.toString();
        c2181aM6433b4.getClass();
        C2181a.m6452d(cleverTapInstanceConfig.f10995a, string);
    }
}
