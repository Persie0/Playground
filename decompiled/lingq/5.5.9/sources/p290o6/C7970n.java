package p290o6;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.AbstractC2213d;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.validation.Validator;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p066d7.C5049a;
import p088e7.C5382b;
import p088e7.C5383c;
import p232l2.C7222a;
import p254m2.C7472a;

/* JADX INFO: renamed from: o6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7970n {

    /* JADX INFO: renamed from: a */
    public final WeakReference<CleverTapAPI> f43386a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2213d f43387b;

    public C7970n(CleverTapAPI cleverTapAPI, AbstractC2213d abstractC2213d) {
        this.f43386a = new WeakReference<>(cleverTapAPI);
        this.f43387b = abstractC2213d;
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            cleverTapAPI.f10981b.f43474d.m6406n0(str);
            return;
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(str2));
        AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
        C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("addMultiValuesForKey", new CallableC7956g(analyticsManager, str, arrayList));
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            C2181a.m6455h("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList<String> arrayListM15835b = C7979r0.m15835b(new JSONArray(str2));
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("addMultiValuesForKey", new CallableC7956g(analyticsManager, str, arrayListM15835b));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse values from WebView "));
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d10) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.f10981b.f43474d.m6405m0(Double.valueOf(d10), str, "$decr");
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.f43386a.get() == null) {
            C2181a.m6449a("CleverTap Instance is null.");
        } else {
            this.f43387b.m6513n0(null);
        }
    }

    @JavascriptInterface
    public void incrementValue(String str, double d10) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.f10981b.f43474d.m6405m0(Double.valueOf(d10), str, "$incr");
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m6430m(C7979r0.m15836c(new JSONObject(str)));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse profile from WebView "));
        }
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z10) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        dismissInAppNotification();
        Context context = cleverTapAPI.f10980a;
        C5207g.m11111f(context, "<this>");
        if (!(Build.VERSION.SDK_INT > 32 && context.getApplicationContext().getApplicationInfo().targetSdkVersion > 32)) {
            C2181a.m6455h("Ensure your app supports Android 13 to verify permission access for notifications.");
            return;
        }
        InAppController inAppController = cleverTapAPI.f10981b.f43478h;
        inAppController.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallbackToNotificationSettings", z10);
            jSONObject.put("isHardPermissionRequest", true);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        Context context2 = inAppController.f11143d;
        if (C7472a.m14841a(context2, "android.permission.POST_NOTIFICATIONS") != -1) {
            inAppController.m6507i(true);
            return;
        }
        C7966l.m15803a(context2, inAppController.f11142c);
        boolean z11 = C7966l.f43364c;
        Activity activityM15846k0 = C7986y.m15846k0();
        Objects.requireNonNull(activityM15846k0);
        boolean zM14546d = C7222a.m14546d(activityM15846k0, "android.permission.POST_NOTIFICATIONS");
        if (z11 || !zM14546d) {
            inAppController.m6510m(jSONObject);
        } else if (jSONObject.optBoolean("fallbackToNotificationSettings", false)) {
            inAppController.m6510m(jSONObject);
        } else {
            C2181a.m6455h("Notification permission is denied. Please grant notification permission access in your app's settings to send notifications");
            inAppController.m6507i(false);
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
    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList arrayList;
        Validator validator;
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (str == null) {
            C2181a.m6455h("chargeDetails passed to CTWebInterface is null");
            return;
        }
        try {
            map = C7979r0.m15836c(new JSONObject(str));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse chargeDetails for Charged Event from WebView "));
        }
        if (str2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                boolean z10 = C7979r0.f43406a;
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(C7979r0.m15836c(jSONArray.getJSONObject(i10)));
                    } catch (JSONException e11) {
                        C2181a.m6455h("Could not convert JSONArray of JSONObjects to ArrayList of HashMaps - " + e11.getMessage());
                    }
                }
            } catch (JSONException e12) {
                C0204c.m863w(e12, new StringBuilder("Unable to parse items for Charged Event from WebView "));
                arrayList = null;
            }
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            CleverTapInstanceConfig cleverTapInstanceConfig = analyticsManager.f10949e;
            if (arrayList == null) {
                cleverTapInstanceConfig.m6433b().getClass();
                C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Invalid Charged event: details and or items is null");
                return;
            }
            int size = arrayList.size();
            C5383c c5383c = analyticsManager.f10955k;
            if (size > 50) {
                C5382b c5382bM3821c = C0987y.m3821c(522, -1, new String[0]);
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str3 = c5382bM3821c.f33798b;
                c2181aM6433b.getClass();
                C2181a.m6452d(cleverTapInstanceConfig.f10995a, str3);
                c5383c.m11556b(c5382bM3821c);
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                Iterator<String> it = map.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    validator = analyticsManager.f10956l;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    Object obj = map.get(next);
                    validator.getClass();
                    C5382b c5382bM6589d = Validator.m6589d(next);
                    String string = c5382bM6589d.f33799c.toString();
                    if (c5382bM6589d.f33797a != 0) {
                        jSONObject2.put("wzrk_error", C5049a.m10724c(c5382bM6589d));
                    }
                    try {
                        C5382b c5382bM6590e = Validator.m6590e(obj, Validator.ValidationContext.Event);
                        Object obj2 = c5382bM6590e.f33799c;
                        if (c5382bM6590e.f33797a != 0) {
                            jSONObject2.put("wzrk_error", C5049a.m10724c(c5382bM6590e));
                        }
                        jSONObject.put(string, obj2);
                    } catch (IllegalArgumentException unused) {
                        String[] strArr = new String[3];
                        strArr[0] = "Charged";
                        strArr[1] = string;
                        strArr[2] = obj != null ? obj.toString() : "";
                        C5382b c5382bM3821c2 = C0987y.m3821c(511, 7, strArr);
                        c5383c.m11556b(c5382bM3821c2);
                        C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                        String str4 = cleverTapInstanceConfig.f10995a;
                        String str5 = c5382bM3821c2.f33798b;
                        c2181aM6433b2.getClass();
                        C2181a.m6452d(str4, str5);
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    HashMap map2 = (HashMap) it2.next();
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str6 : map2.keySet()) {
                        Object obj3 = map2.get(str6);
                        validator.getClass();
                        C5382b c5382bM6589d2 = Validator.m6589d(str6);
                        Iterator it3 = it2;
                        String string2 = c5382bM6589d2.f33799c.toString();
                        HashMap map3 = map2;
                        if (c5382bM6589d2.f33797a != 0) {
                            jSONObject2.put("wzrk_error", C5049a.m10724c(c5382bM6589d2));
                        }
                        try {
                            C5382b c5382bM6590e2 = Validator.m6590e(obj3, Validator.ValidationContext.Event);
                            Object obj4 = c5382bM6590e2.f33799c;
                            if (c5382bM6590e2.f33797a != 0) {
                                jSONObject2.put("wzrk_error", C5049a.m10724c(c5382bM6590e2));
                            }
                            jSONObject3.put(string2, obj4);
                        } catch (IllegalArgumentException unused2) {
                            String[] strArr2 = new String[2];
                            strArr2[0] = string2;
                            strArr2[1] = obj3 != null ? obj3.toString() : "";
                            C5382b c5382bM3821c3 = C0987y.m3821c(511, 15, strArr2);
                            C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                            String str7 = cleverTapInstanceConfig.f10995a;
                            String str8 = c5382bM3821c3.f33798b;
                            c2181aM6433b3.getClass();
                            C2181a.m6452d(str7, str8);
                            c5383c.m11556b(c5382bM3821c3);
                        }
                        it2 = it3;
                        map2 = map3;
                    }
                    jSONArray2.put(jSONObject3);
                    it2 = it2;
                }
                jSONObject.put("Items", jSONArray2);
                jSONObject2.put("evtName", "Charged");
                jSONObject2.put("evtData", jSONObject);
                analyticsManager.f10947c.mo595e0(analyticsManager.f10950f, jSONObject2, 4);
            } catch (Throwable unused3) {
            }
        }
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
        } else {
            if (str == null || str.trim().equals("")) {
                return;
            }
            cleverTapAPI.m6431n(str, null);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str2 == null) {
            C2181a.m6455h("eventActions passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m6431n(str, C7979r0.m15836c(new JSONObject(str2)));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse eventActions from WebView "));
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.f10981b.f43474d.m6402A0(C7979r0.m15836c(new JSONObject(str)));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse profile from WebView "));
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            C2181a.m6455h("Value passed to CTWebInterface is null");
        } else {
            if (str2.isEmpty()) {
                cleverTapAPI.f10981b.f43474d.m6406n0(str);
                return;
            }
            ArrayList arrayList = new ArrayList(Collections.singletonList(str2));
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("removeMultiValuesForKey", new CallableC7958h(analyticsManager, str, arrayList));
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            C2181a.m6455h("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList<String> arrayListM15835b = C7979r0.m15835b(new JSONArray(str2));
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("removeMultiValuesForKey", new CallableC7958h(analyticsManager, str, arrayListM15835b));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse values from WebView "));
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
        } else if (str == null) {
            C2181a.m6455h("Key passed to CTWebInterface is null");
        } else {
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("removeValueForKey", new CallableC7960i(analyticsManager, str));
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f43386a.get();
        if (cleverTapAPI == null) {
            C2181a.m6449a("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            C2181a.m6455h("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            C2181a.m6455h("values passed to CTWebInterface is null");
            return;
        }
        try {
            ArrayList<String> arrayListM15835b = C7979r0.m15835b(new JSONArray(str2));
            AnalyticsManager analyticsManager = cleverTapAPI.f10981b.f43474d;
            C1735a.m5472a(analyticsManager.f10949e).m5474b().m6585b("setMultiValuesForKey", new CallableC7962j(analyticsManager, str, arrayListM15835b));
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse values from WebView "));
        }
    }
}
