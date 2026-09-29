package com.clevertap.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.pushnotification.C2260f;
import com.clevertap.android.sdk.pushnotification.InterfaceC2254a;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.validation.Validator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.HandlerC1740f;
import p066d7.C5049a;
import p066d7.C5053e;
import p066d7.C5054f;
import p088e7.C5382b;
import p088e7.C5383c;
import p289o5.C7940t;
import p290o6.C7944a;
import p290o6.C7951d0;
import p290o6.C7963j0;
import p290o6.C7966l;
import p290o6.C7967l0;
import p290o6.C7972o;
import p290o6.C7975p0;
import p290o6.C7977q0;
import p290o6.C7979r0;
import p290o6.C7985x;
import p290o6.C7986y;
import p290o6.C7987z;
import p290o6.CallableC7974p;
import p290o6.CallableC7976q;
import p290o6.CallableC7982u;
import p290o6.CallableC7983v;
import p338qd.C8573r0;
import p357r6.C8740b;
import p388t1.C9181g;
import p402u0.C9370m;
import p450w6.C9817d;
import p450w6.C9818e;
import p450w6.CallableC9816c;
import p450w6.InterfaceC9814a;
import p475x6.C10101a;
import p526z6.C10447c;
import p526z6.InterfaceC10452h;

/* JADX INFO: loaded from: classes.dex */
public final class CleverTapAPI implements CTInboxActivity.InterfaceC2243c {

    /* JADX INFO: renamed from: c */
    public static int f10977c = LogLevel.INFO.intValue();

    /* JADX INFO: renamed from: d */
    public static CleverTapInstanceConfig f10978d;

    /* JADX INFO: renamed from: e */
    public static ConcurrentHashMap<String, CleverTapAPI> f10979e;

    /* JADX INFO: renamed from: a */
    public final Context f10980a;

    /* JADX INFO: renamed from: b */
    public C7987z f10981b;

    public enum LogLevel {
        OFF(-1),
        INFO(0),
        DEBUG(2),
        VERBOSE(3);

        private final int value;

        LogLevel(int i10) {
            this.value = i10;
        }

        public int intValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapAPI$a */
    public class CallableC2171a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CleverTapInstanceConfig f10982a;

        public CallableC2171a(CleverTapInstanceConfig cleverTapInstanceConfig) {
            this.f10982a = cleverTapInstanceConfig;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            if (this.f10982a.f10988H) {
                CleverTapAPI cleverTapAPI = CleverTapAPI.this;
                C1735a.m5472a(cleverTapAPI.f10981b.f43471a).m5474b().m6585b("Manifest Validation", new CallableC7976q(cleverTapAPI));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapAPI$b */
    public class CallableC2172b implements Callable<Void> {
        public CallableC2172b() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            String str;
            CleverTapAPI cleverTapAPI = CleverTapAPI.this;
            C7963j0 c7963j0 = cleverTapAPI.f10981b.f43480j.f43399d;
            CleverTapInstanceConfig cleverTapInstanceConfig = c7963j0.f43349c;
            try {
                if (cleverTapInstanceConfig.f10991K) {
                    if (cleverTapInstanceConfig.f10988H) {
                        str = "local_events";
                    } else {
                        str = "local_events:" + cleverTapInstanceConfig.f10995a;
                    }
                    C7963j0.m15781b("App Launched", c7963j0.m15787g("App Launched", null, str));
                }
            } catch (Throwable th2) {
                C2181a c2181aM15784d = c7963j0.m15784d();
                String str2 = cleverTapInstanceConfig.f10995a;
                c2181aM15784d.getClass();
                C2181a.m6461n(str2, "Failed to retrieve local event detail", th2);
            }
            C7951d0 c7951d0 = cleverTapAPI.f10981b.f43472b;
            Context context = c7951d0.f43295e;
            CleverTapInstanceConfig cleverTapInstanceConfig2 = c7951d0.f43294d;
            boolean zM15823a = C7977q0.m15823a(context, cleverTapInstanceConfig2, "NetworkInfo");
            cleverTapInstanceConfig2.m6433b().getClass();
            C2181a.m6460m(cleverTapInstanceConfig2.f10995a, "Setting device network info reporting state from storage to " + zM15823a);
            c7951d0.f43297g = zM15823a;
            cleverTapAPI.f10981b.f43472b.m15769n();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapAPI$c */
    public class CallableC2173c implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CleverTapInstanceConfig f10985a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f10986b;

        public CallableC2173c(CleverTapInstanceConfig cleverTapInstanceConfig, Context context) {
            this.f10985a = cleverTapInstanceConfig;
            this.f10986b = context;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            String string;
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f10985a;
            cleverTapInstanceConfig.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accountId", cleverTapInstanceConfig.f10995a);
                jSONObject.put("accountToken", cleverTapInstanceConfig.f10997c);
                jSONObject.put("accountRegion", cleverTapInstanceConfig.f10996b);
                jSONObject.put("fcmSenderId", cleverTapInstanceConfig.f11006l);
                jSONObject.put("analyticsOnly", cleverTapInstanceConfig.f10999e);
                jSONObject.put("isDefaultInstance", cleverTapInstanceConfig.f10988H);
                jSONObject.put("useGoogleAdId", cleverTapInstanceConfig.f10994N);
                jSONObject.put("disableAppLaunchedEvent", cleverTapInstanceConfig.f11004j);
                jSONObject.put("personalization", cleverTapInstanceConfig.f10991K);
                jSONObject.put("debugLevel", cleverTapInstanceConfig.f11003i);
                jSONObject.put("createdPostAppLaunch", cleverTapInstanceConfig.f11002h);
                jSONObject.put("sslPinning", cleverTapInstanceConfig.f10993M);
                jSONObject.put("backgroundSync", cleverTapInstanceConfig.f11000f);
                jSONObject.put("getEnableCustomCleverTapId", cleverTapInstanceConfig.f11005k);
                jSONObject.put("packageName", cleverTapInstanceConfig.f10990J);
                jSONObject.put("beta", cleverTapInstanceConfig.f11001g);
                ArrayList<String> arrayList = cleverTapInstanceConfig.f10998d;
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = arrayList.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        String next = it.next();
                        if (next != null) {
                            jSONArray.put(next);
                        }
                    }
                }
                jSONObject.put("allowedPushTypes", jSONArray);
                string = jSONObject.toString();
            } catch (Throwable th2) {
                C2181a.m6457j("Unable to convert config to JSON : ", th2.getCause());
                string = null;
            }
            if (string == null) {
                C2181a.m6455h("Unable to save config to SharedPrefs, config Json is null");
            } else {
                C7977q0.m15832j(this.f10986b, C7977q0.m15833k(cleverTapInstanceConfig, "instance"), string);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapAPI$d */
    public class CallableC2174d implements Callable<Void> {
        public CallableC2174d() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            CleverTapAPI cleverTapAPI = CleverTapAPI.this;
            if (cleverTapAPI.f10981b.f43472b.m15765i() != null) {
                cleverTapAPI.f10981b.f43479i.m18295c();
            }
            return null;
        }
    }

    public CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        ArrayList<PushConstants.PushType> arrayList;
        ArrayList<PushConstants.PushType> arrayList2;
        PushConstants.PushType[] pushTypeArr;
        int i10;
        this.f10980a = context;
        C7987z c7987z = new C7987z();
        C7986y c7986y = new C7986y();
        Validator validator = new Validator();
        C5383c c5383c = new C5383c();
        C7940t c7940t = new C7940t(2);
        c7987z.f43475e = c7940t;
        HandlerC1740f handlerC1740f = new HandlerC1740f();
        CleverTapInstanceConfig cleverTapInstanceConfig2 = new CleverTapInstanceConfig(cleverTapInstanceConfig);
        c7987z.f43471a = cleverTapInstanceConfig2;
        C9181g c9181g = new C9181g(context, cleverTapInstanceConfig2, c7986y);
        C7963j0 c7963j0 = new C7963j0(context, cleverTapInstanceConfig2);
        C7951d0 c7951d0 = new C7951d0(context, cleverTapInstanceConfig2, str, c7986y);
        c7987z.f43472b = c7951d0;
        C7966l.m15803a(context, cleverTapInstanceConfig2);
        C7972o c7972o = new C7972o(cleverTapInstanceConfig2, c7951d0);
        c7987z.f43476f = c7972o;
        C7975p0 c7975p0 = new C7975p0(cleverTapInstanceConfig2, c7986y, validator, c7963j0);
        c7987z.f43480j = c7975p0;
        C2185b c2185b = new C2185b(cleverTapInstanceConfig2, c7940t);
        C7985x c7985x = new C7985x(context, cleverTapInstanceConfig2, c7940t, c7972o, c7951d0, c2185b);
        c7987z.f43477g = c7985x;
        C1735a.m5472a(cleverTapInstanceConfig2).m5473a().m6585b("initFCManager", new CallableC7982u(c7987z, c7985x, cleverTapInstanceConfig2, context));
        C8740b c8740b = new C8740b(c2185b, context, cleverTapInstanceConfig2, c9181g, c7975p0, c7972o, handlerC1740f, c7951d0, c5383c, new C10101a(context, cleverTapInstanceConfig2, c7951d0, c7986y, c5383c, c7985x, c2185b, c7972o, c7940t, validator, c7963j0), c7986y, c7940t, c7963j0);
        AnalyticsManager analyticsManager = new AnalyticsManager(context, cleverTapInstanceConfig2, c8740b, validator, c5383c, c7986y, c7963j0, c7951d0, c7972o, c7985x, c7940t);
        c7987z.f43474d = analyticsManager;
        InAppController inAppController = new InAppController(context, cleverTapInstanceConfig2, handlerC1740f, c7985x, c7972o, analyticsManager, c7986y, c7951d0);
        c7987z.f43478h = inAppController;
        c7987z.f43477g.f43443l = inAppController;
        C1735a.m5472a(cleverTapInstanceConfig2).m5473a().m6585b("initFeatureFlags", new CallableC7983v(context, c7985x, cleverTapInstanceConfig2, c7951d0, c7972o, analyticsManager));
        cleverTapInstanceConfig2.m6433b();
        final C2260f c2260f = new C2260f(context, cleverTapInstanceConfig2, c2185b, c5383c, analyticsManager);
        CleverTapInstanceConfig cleverTapInstanceConfig3 = c2260f.f11344g;
        ArrayList<String> arrayList3 = cleverTapInstanceConfig3.f10998d;
        int i11 = 0;
        PushConstants.PushType[] pushTypeArr2 = new PushConstants.PushType[0];
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            pushTypeArr2 = new PushConstants.PushType[arrayList3.size()];
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                pushTypeArr2[i12] = PushConstants.PushType.valueOf(arrayList3.get(i12));
            }
        }
        int length = pushTypeArr2.length;
        while (true) {
            arrayList = c2260f.f11339b;
            arrayList2 = c2260f.f11338a;
            Context context2 = c2260f.f11345h;
            if (i11 >= length) {
                break;
            }
            PushConstants.PushType pushType = pushTypeArr2[i11];
            String messagingSDKClassName = pushType.getMessagingSDKClassName();
            try {
                Class.forName(messagingSDKClassName);
                arrayList2.add(pushType);
                StringBuilder sb2 = new StringBuilder();
                pushTypeArr = pushTypeArr2;
                try {
                    sb2.append("SDK Class Available :");
                    sb2.append(messagingSDKClassName);
                    cleverTapInstanceConfig3.m6434c("PushProvider", sb2.toString());
                    i10 = length;
                    if (pushType.getRunningDevices() == 3) {
                        try {
                            arrayList2.remove(pushType);
                            arrayList.add(pushType);
                            cleverTapInstanceConfig3.m6434c("PushProvider", "disabling " + pushType + " due to flag set as PushConstants.NO_DEVICES");
                        } catch (Exception e10) {
                            e = e10;
                            StringBuilder sbM854m = C0204c.m854m("SDK class Not available ", messagingSDKClassName, " Exception:");
                            sbM854m.append(e.getClass().getName());
                            cleverTapInstanceConfig3.m6434c("PushProvider", sbM854m.toString());
                        }
                    }
                    if (pushType.getRunningDevices() == 2 && !C5053e.m10732b(context2)) {
                        arrayList2.remove(pushType);
                        arrayList.add(pushType);
                        cleverTapInstanceConfig3.m6434c("PushProvider", "disabling " + pushType + " due to flag set as PushConstants.XIAOMI_MIUI_DEVICES");
                    }
                } catch (Exception e11) {
                    e = e11;
                    i10 = length;
                    StringBuilder sbM854m2 = C0204c.m854m("SDK class Not available ", messagingSDKClassName, " Exception:");
                    sbM854m2.append(e.getClass().getName());
                    cleverTapInstanceConfig3.m6434c("PushProvider", sbM854m2.toString());
                    i11++;
                    pushTypeArr2 = pushTypeArr;
                    length = i10;
                }
            } catch (Exception e12) {
                e = e12;
                pushTypeArr = pushTypeArr2;
            }
            i11++;
            pushTypeArr2 = pushTypeArr;
            length = i10;
        }
        final ArrayList arrayList4 = new ArrayList();
        Iterator<PushConstants.PushType> it = arrayList2.iterator();
        while (it.hasNext()) {
            InterfaceC2254a interfaceC2254aM6576f = c2260f.m6576f(it.next(), true);
            if (interfaceC2254aM6576f != null) {
                arrayList4.add(interfaceC2254aM6576f);
            }
        }
        for (PushConstants.PushType pushType2 : arrayList) {
            PushConstants.PushType pushType3 = PushConstants.PushType.XPS;
            if (pushType2 == pushType3 && !TextUtils.isEmpty(c2260f.m6577g(pushType3))) {
                InterfaceC2254a interfaceC2254aM6576f2 = c2260f.m6576f(pushType2, false);
                if (interfaceC2254aM6576f2 instanceof InterfaceC10452h) {
                    ((InterfaceC10452h) interfaceC2254aM6576f2).m19413a();
                    cleverTapInstanceConfig3.m6434c("PushProvider", "unregistering existing token for disabled " + pushType2);
                }
            }
        }
        Task taskM5474b = C1735a.m5472a(cleverTapInstanceConfig3).m5474b();
        taskM5474b.m6584a(new C9370m(2, c2260f));
        taskM5474b.m6585b("asyncFindCTPushProviders", new Callable() { // from class: z6.d
            /* JADX WARN: Code duplicated, block: B:42:0x00de A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:44:0x0100 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:47:0x0107 A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z10;
                C2260f c2260f2 = c2260f;
                c2260f2.getClass();
                List<InterfaceC2254a> list = arrayList4;
                boolean zIsEmpty = list.isEmpty();
                CleverTapInstanceConfig cleverTapInstanceConfig4 = c2260f2.f11344g;
                if (zIsEmpty) {
                    cleverTapInstanceConfig4.m6434c("PushProvider", "No push providers found!. Make sure to install at least one push provider");
                } else {
                    for (InterfaceC2254a interfaceC2254a : list) {
                        if (40705 < interfaceC2254a.minSDKSupportVersionCode()) {
                            cleverTapInstanceConfig4.m6434c("PushProvider", "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.");
                        } else {
                            int i13 = C2260f.b.f11353a[interfaceC2254a.getPushType().ordinal()];
                            z10 = true;
                            if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
                                if (interfaceC2254a.getPlatform() != 1) {
                                    cleverTapInstanceConfig4.m6434c("PushProvider", "Invalid Provider: " + interfaceC2254a.getClass() + " delivery is only available for Android platforms." + interfaceC2254a.getPushType());
                                }
                            } else if (i13 == 5 && interfaceC2254a.getPlatform() != 2) {
                                cleverTapInstanceConfig4.m6434c("PushProvider", "Invalid Provider: " + interfaceC2254a.getClass() + " ADM delivery is only available for Amazon platforms." + interfaceC2254a.getPushType());
                            }
                            if (!z10) {
                                cleverTapInstanceConfig4.m6434c("PushProvider", "Invalid Provider: " + interfaceC2254a.getClass());
                            } else if (!interfaceC2254a.isSupported()) {
                                cleverTapInstanceConfig4.m6434c("PushProvider", "Unsupported Provider: " + interfaceC2254a.getClass());
                            } else if (interfaceC2254a.isAvailable()) {
                                cleverTapInstanceConfig4.m6434c("PushProvider", "Available Provider: " + interfaceC2254a.getClass());
                                c2260f2.f11340c.add(interfaceC2254a);
                            } else {
                                cleverTapInstanceConfig4.m6434c("PushProvider", "Unavailable Provider: " + interfaceC2254a.getClass());
                            }
                        }
                        z10 = false;
                        if (!z10) {
                            cleverTapInstanceConfig4.m6434c("PushProvider", "Invalid Provider: " + interfaceC2254a.getClass());
                        } else if (!interfaceC2254a.isSupported()) {
                            cleverTapInstanceConfig4.m6434c("PushProvider", "Unsupported Provider: " + interfaceC2254a.getClass());
                        } else if (interfaceC2254a.isAvailable()) {
                            cleverTapInstanceConfig4.m6434c("PushProvider", "Available Provider: " + interfaceC2254a.getClass());
                            c2260f2.f11340c.add(interfaceC2254a);
                        } else {
                            cleverTapInstanceConfig4.m6434c("PushProvider", "Unavailable Provider: " + interfaceC2254a.getClass());
                        }
                    }
                }
                return null;
            }
        });
        c7985x.f43444m = c2260f;
        c7987z.f43481k = c2260f;
        c7987z.f43473c = new C7944a(context, cleverTapInstanceConfig2, analyticsManager, c7986y, c7975p0, c2260f, c7972o, inAppController, c8740b);
        c7987z.f43479i = new C9817d(context, cleverTapInstanceConfig2, c7951d0, c5383c, c8740b, analyticsManager, c7986y, c7985x, c7975p0, c7963j0, c7972o, c2185b, c7940t);
        this.f10981b = c7987z;
        C2181a c2181aM6429f = m6429f();
        StringBuilder sb3 = new StringBuilder();
        String str2 = cleverTapInstanceConfig.f10995a;
        sb3.append(str2);
        sb3.append(":async_deviceID");
        String string = sb3.toString();
        c2181aM6429f.getClass();
        C2181a.m6460m(string, "CoreState is set");
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("CleverTapAPI#initializeDeviceInfo", new CallableC2171a(cleverTapInstanceConfig));
        boolean z10 = C7979r0.f43406a;
        if (((int) (System.currentTimeMillis() / 1000)) - C7986y.f43449T > 5) {
            this.f10981b.f43471a.f11002h = true;
        }
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("setStatesAsync", new CallableC2172b());
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("saveConfigtoSharedPrefs", new CallableC2173c(cleverTapInstanceConfig, context));
        C2181a.m6454f("CleverTap SDK initialized with accountId: " + str2 + " accountToken: " + cleverTapInstanceConfig.f10997c + " accountRegion: " + cleverTapInstanceConfig.f10996b);
    }

    /* JADX INFO: renamed from: c */
    public static CleverTapAPI m6418c(Context context, String str, String str2) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        try {
            if (str == null) {
                try {
                    return m6420g(context, str2);
                } catch (Throwable th2) {
                    C2181a.m6457j("Error creating shared Instance: ", th2.getCause());
                    return null;
                }
            }
            String strM15828f = C7977q0.m15828f(context, "instance:".concat(str), "");
            if (!strM15828f.isEmpty()) {
                try {
                    cleverTapInstanceConfig = new CleverTapInstanceConfig(strM15828f);
                } catch (Throwable unused) {
                    cleverTapInstanceConfig = null;
                }
                C2181a.m6455h("Inflated Instance Config: ".concat(strM15828f));
                return cleverTapInstanceConfig != null ? m6423j(context, cleverTapInstanceConfig, str2) : null;
            }
            try {
                CleverTapAPI cleverTapAPIM6420g = m6420g(context, null);
                if (cleverTapAPIM6420g == null || !cleverTapAPIM6420g.f10981b.f43471a.f10995a.equals(str)) {
                    return null;
                }
                return cleverTapAPIM6420g;
            } catch (Throwable th3) {
                C2181a.m6457j("Error creating shared Instance: ", th3.getCause());
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: d */
    public static CleverTapAPI m6419d(Context context, String str) {
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = f10979e;
        if (concurrentHashMap == null) {
            return m6418c(context, str, null);
        }
        Iterator<String> it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f10979e.get(it.next());
            boolean z10 = false;
            if (cleverTapAPI != null) {
                if (str == null && cleverTapAPI.f10981b.f43471a.f10988H) {
                    z10 = true;
                } else if (cleverTapAPI.m6428e().equals(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return cleverTapAPI;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static CleverTapAPI m6420g(Context context, String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        CleverTapInstanceConfig cleverTapInstanceConfig2 = f10978d;
        if (cleverTapInstanceConfig2 != null) {
            return m6423j(context, cleverTapInstanceConfig2, str);
        }
        C7967l0.m15806h(context).getClass();
        String str2 = C7967l0.f43371b;
        String str3 = C7967l0.f43372c;
        C2181a.m6455h("ManifestInfo: getAccountRegion called, returning region:" + C7967l0.f43373d);
        String str4 = C7967l0.f43373d;
        if (str2 == null || str3 == null) {
            C2181a.m6454f("Account ID or Account token is missing from AndroidManifest.xml, unable to create default instance");
            cleverTapInstanceConfig = null;
        } else {
            if (str4 == null) {
                C2181a.m6454f("Account Region not specified in the AndroidManifest - using default region");
            }
            cleverTapInstanceConfig = new CleverTapInstanceConfig(context, str2, str3, str4);
        }
        f10978d = cleverTapInstanceConfig;
        if (cleverTapInstanceConfig != null) {
            return m6423j(context, cleverTapInstanceConfig, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static C10447c m6421h(Bundle bundle) {
        boolean zContainsKey = bundle.containsKey("wzrk_pn");
        return new C10447c(0, zContainsKey, zContainsKey && bundle.containsKey("nm"));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX INFO: renamed from: i */
    public static void m6422i(Context context, Bundle bundle) {
        String string;
        boolean z10;
        try {
            string = bundle.getString("wzrk_acct_id");
        } catch (Throwable unused) {
            string = null;
        }
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = f10979e;
        if (concurrentHashMap == null) {
            CleverTapAPI cleverTapAPIM6418c = m6418c(context, string, null);
            if (cleverTapAPIM6418c != null) {
                cleverTapAPIM6418c.f10981b.f43474d.m6416y0(bundle);
            }
            return;
        }
        Iterator<String> it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f10979e.get(it.next());
            if (cleverTapAPI == null) {
                z10 = false;
            } else {
                if (string != null || !cleverTapAPI.f10981b.f43471a.f10988H) {
                    if (!cleverTapAPI.m6428e().equals(string)) {
                        z10 = false;
                    }
                }
                z10 = true;
            }
            if (z10) {
                cleverTapAPI.f10981b.f43474d.m6416y0(bundle);
                break;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static CleverTapAPI m6423j(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            C2181a.m6455h("CleverTapInstanceConfig cannot be null");
            return null;
        }
        if (f10979e == null) {
            f10979e = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = f10979e;
        String str2 = cleverTapInstanceConfig.f10995a;
        CleverTapAPI cleverTapAPI = concurrentHashMap.get(str2);
        if (cleverTapAPI == null) {
            cleverTapAPI = new CleverTapAPI(context, cleverTapInstanceConfig, str);
            f10979e.put(str2, cleverTapAPI);
            C1735a.m5472a(cleverTapAPI.f10981b.f43471a).m5474b().m6585b("recordDeviceIDErrors", cleverTapAPI.new CallableC2174d());
        } else if (cleverTapAPI.f10981b.f43472b.m15767l() && cleverTapAPI.f10981b.f43471a.f11005k && C7979r0.m15844k(str)) {
            C9817d c9817d = cleverTapAPI.f10981b.f43479i;
            C1735a.m5472a(c9817d.f49970f).m5474b().m6585b("resetProfile", new CallableC9816c(c9817d, null, null, str));
        }
        C2181a.m6456i(C0166e.m765k(str2, ":async_deviceID"), "CleverTapAPI instance = " + cleverTapAPI);
        return cleverTapAPI;
    }

    /* JADX INFO: renamed from: k */
    public static void m6424k(Activity activity, String str) {
        Uri data;
        String string;
        Bundle extras = null;
        if (f10979e == null) {
            m6418c(activity.getApplicationContext(), null, str);
        }
        if (f10979e == null) {
            C2181a.m6455h("Instances is null in onActivityCreated!");
            return;
        }
        boolean z10 = true;
        try {
            data = activity.getIntent().getData();
            if (data != null) {
                try {
                    string = C5054f.m10733a(data.toString(), true).getString("wzrk_acct_id");
                } catch (Throwable unused) {
                    string = null;
                }
            } else {
                string = null;
            }
        } catch (Throwable unused2) {
            data = null;
        }
        boolean z11 = false;
        try {
            extras = activity.getIntent().getExtras();
            if (extras != null && !extras.isEmpty()) {
                if (!extras.containsKey("wzrk_from") || !"CTPushNotificationReceiver".equals(extras.get("wzrk_from"))) {
                    z10 = false;
                }
                if (z10) {
                    try {
                        C2181a.m6455h("ActivityLifecycleCallback: Notification Clicked already processed for " + extras.toString() + ", dropping duplicate.");
                    } catch (Throwable unused3) {
                    }
                }
                if (extras.containsKey("wzrk_acct_id")) {
                    string = (String) extras.get("wzrk_acct_id");
                }
                z11 = z10;
            }
        } catch (Throwable unused4) {
        }
        if (z11 && data == null) {
            return;
        }
        try {
            Iterator<String> it = f10979e.keySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    CleverTapAPI cleverTapAPI = f10979e.get(it.next());
                    if (cleverTapAPI != null) {
                        cleverTapAPI.f10981b.f43473c.m15755d(extras, data, string);
                    }
                }
            }
        } catch (Throwable th2) {
            C2181a.m6455h("Throwable - " + th2.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m6425l(Activity activity, String str) {
        if (f10979e == null) {
            m6418c(activity.getApplicationContext(), null, str);
        }
        C7986y.f43446Q = true;
        if (f10979e == null) {
            C2181a.m6455h("Instances is null in onActivityResumed!");
            return;
        }
        Activity activityM15846k0 = C7986y.m15846k0();
        String localClassName = activityM15846k0 != null ? activityM15846k0.getLocalClassName() : null;
        if (activity == null) {
            C7986y.f43447R = null;
        } else if (!activity.getLocalClassName().contains("InAppNotificationActivity")) {
            C7986y.f43447R = new WeakReference<>(activity);
        }
        if (localClassName == null || !localClassName.equals(activity.getLocalClassName())) {
            C7986y.f43448S++;
        }
        if (C7986y.f43449T <= 0) {
            boolean z10 = C7979r0.f43406a;
            C7986y.f43449T = (int) (System.currentTimeMillis() / 1000);
        }
        Iterator<String> it = f10979e.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = f10979e.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.f10981b.f43473c.m15754c(activity);
                } catch (Throwable th2) {
                    C2181a.m6455h("Throwable - " + th2.getLocalizedMessage());
                }
            }
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC2243c
    /* JADX INFO: renamed from: a */
    public final void mo6426a(CTInboxMessage cTInboxMessage) {
        C1735a.m5472a(this.f10981b.f43471a).m5474b().m6585b("handleMessageDidShow", new CallableC7974p(this, cTInboxMessage));
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InterfaceC2243c
    /* JADX INFO: renamed from: b */
    public final void mo6427b(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap map) {
        this.f10981b.f43474d.m6414w0(true, cTInboxMessage, bundle);
        if (map == null || map.isEmpty()) {
            C2181a.m6455h("clicked inbox notification.");
        } else {
            C2181a.m6455h("clicked button of an inbox notification.");
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m6428e() {
        return this.f10981b.f43471a.f10995a;
    }

    /* JADX INFO: renamed from: f */
    public final C2181a m6429f() {
        return this.f10981b.f43471a.m6433b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r3 != false) goto L36;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6430m(Map<String, Object> map) {
        C9817d c9817d = this.f10981b.f43479i;
        if (c9817d.f49970f.f11005k) {
            C2181a.m6454f("CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml Please call onUserlogin() and pass a custom CleverTap ID");
        }
        try {
            String strM15765i = c9817d.f49975k.m15765i();
            if (strM15765i == null) {
                return;
            }
            Context context = c9817d.f49971g;
            CleverTapInstanceConfig cleverTapInstanceConfig = c9817d.f49970f;
            C7951d0 c7951d0 = c9817d.f49975k;
            C9818e c9818e = new C9818e(context, cleverTapInstanceConfig, c7951d0);
            InterfaceC9814a interfaceC9814aM16759t0 = C8573r0.m16759t0(context, cleverTapInstanceConfig, c7951d0, c9817d.f49979o);
            boolean z10 = false;
            boolean z11 = false;
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (interfaceC9814aM16759t0.mo4794a(str)) {
                    String string = obj != null ? obj.toString() : null;
                    if (string != null && string.length() > 0) {
                        try {
                            String strM18299d = c9818e.m18299d(str, string);
                            c9817d.f49965a = strM18299d;
                            if (strM18299d != null) {
                                z11 = true;
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                        z11 = true;
                    }
                }
            }
            if (!c9817d.f49975k.m15767l()) {
                if (z11) {
                    boolean z12 = c9818e.m18297b().length() <= 0;
                    ((CleverTapInstanceConfig) c9818e.f49981a).m6434c("ON_USER_LOGIN", "isAnonymousDevice:[" + z12 + "]");
                }
                C2181a c2181aM6433b = c9817d.f49970f.m6433b();
                String str2 = c9817d.f49970f.f10995a;
                c2181aM6433b.getClass();
                C2181a.m6452d(str2, "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile");
                c9817d.f49966b.m6402A0(map);
                return;
            }
            String str3 = c9817d.f49965a;
            if (str3 != null && str3.equals(strM15765i)) {
                C2181a c2181aM6433b2 = c9817d.f49970f.m6433b();
                String str4 = c9817d.f49970f.f10995a;
                String str5 = "onUserLogin: " + map.toString() + " maps to current device id " + strM15765i + " pushing on current profile";
                c2181aM6433b2.getClass();
                C2181a.m6452d(str4, str5);
                c9817d.f49966b.m6402A0(map);
                return;
            }
            String string2 = map.toString();
            Object obj2 = C9817d.f49964q;
            synchronized (obj2) {
                String str6 = c9817d.f49980p;
                if (str6 != null && str6.equals(string2)) {
                    z10 = true;
                }
            }
            if (z10) {
                C2181a c2181aM6433b3 = c9817d.f49970f.m6433b();
                c2181aM6433b3.getClass();
                C2181a.m6452d(c9817d.f49970f.f10995a, "Already processing onUserLogin for " + string2);
                return;
            }
            synchronized (obj2) {
                try {
                    c9817d.f49980p = string2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2181a c2181aM6433b4 = c9817d.f49970f.m6433b();
            String str7 = c9817d.f49970f.f10995a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onUserLogin: queuing reset profile for ");
            sb2.append(string2);
            sb2.append(" with Cached GUID ");
            String str8 = c9817d.f49965a;
            if (str8 == null) {
                str8 = "NULL";
            }
            sb2.append(str8);
            String string3 = sb2.toString();
            c2181aM6433b4.getClass();
            C2181a.m6460m(str7, string3);
            C1735a.m5472a(c9817d.f49970f).m5474b().m6585b("resetProfile", new CallableC9816c(c9817d, map, c9817d.f49965a, null));
        } catch (Throwable th3) {
            C2181a c2181aM6433b5 = c9817d.f49970f.m6433b();
            String str9 = c9817d.f49970f.f10995a;
            c2181aM6433b5.getClass();
            C2181a.m6461n(str9, "onUserLogin failed", th3);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6431n(String str, Map<String, Object> map) {
        AnalyticsManager analyticsManager = this.f10981b.f43474d;
        CleverTapInstanceConfig cleverTapInstanceConfig = analyticsManager.f10949e;
        if (str == null || str.equals("")) {
            return;
        }
        Validator validator = analyticsManager.f10956l;
        validator.getClass();
        C5382b c5382b = new C5382b();
        String[] strArr = Validator.f11364e;
        char c10 = 0;
        for (int i10 = 0; i10 < 14; i10++) {
            if (str.equalsIgnoreCase(strArr[i10])) {
                C5382b c5382bM3821c = C0987y.m3821c(513, 16, str);
                c5382b.f33797a = c5382bM3821c.f33797a;
                c5382b.f33798b = c5382bM3821c.f33798b;
                C2181a.m6455h(c5382bM3821c.f33798b);
                break;
            }
        }
        int i11 = c5382b.f33797a;
        C5383c c5383c = analyticsManager.f10955k;
        if (i11 > 0) {
            c5383c.m11556b(c5382b);
            return;
        }
        C5382b c5382b2 = new C5382b();
        ArrayList<String> arrayList = validator.f11365a;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next())) {
                    C5382b c5382bM3821c2 = C0987y.m3821c(513, 17, str);
                    c5382b2.f33797a = c5382bM3821c2.f33797a;
                    c5382b2.f33798b = c5382bM3821c2.f33798b;
                    C2181a.m6449a(str.concat(" s a discarded event name as per CleverTap. Dropping event at SDK level. Check discarded events in CleverTap Dashboard settings."));
                    break;
                }
            }
        }
        if (c5382b2.f33797a > 0) {
            c5383c.m11556b(c5382b2);
            return;
        }
        Map<String, Object> map2 = map == null ? new HashMap<>() : map;
        JSONObject jSONObject = new JSONObject();
        try {
            C5382b c5382bM6586a = Validator.m6586a(str);
            if (c5382bM6586a.f33797a != 0) {
                jSONObject.put("wzrk_error", C5049a.m10724c(c5382bM6586a));
            }
            String string = c5382bM6586a.f33799c.toString();
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : map2.keySet()) {
                Object obj = map2.get(str2);
                C5382b c5382bM6589d = Validator.m6589d(str2);
                String string2 = c5382bM6589d.f33799c.toString();
                if (c5382bM6589d.f33797a != 0) {
                    jSONObject.put("wzrk_error", C5049a.m10724c(c5382bM6589d));
                }
                try {
                    C5382b c5382bM6590e = Validator.m6590e(obj, Validator.ValidationContext.Event);
                    Object obj2 = c5382bM6590e.f33799c;
                    if (c5382bM6590e.f33797a != 0) {
                        jSONObject.put("wzrk_error", C5049a.m10724c(c5382bM6590e));
                    }
                    jSONObject2.put(string2, obj2);
                } catch (IllegalArgumentException unused) {
                    String[] strArr2 = new String[3];
                    strArr2[c10] = string;
                    strArr2[1] = string2;
                    strArr2[2] = obj != null ? obj.toString() : "";
                    C5382b c5382bM3821c3 = C0987y.m3821c(512, 7, strArr2);
                    C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                    String str3 = cleverTapInstanceConfig.f10995a;
                    String str4 = c5382bM3821c3.f33798b;
                    c2181aM6433b.getClass();
                    C2181a.m6452d(str3, str4);
                    c5383c.m11556b(c5382bM3821c3);
                    c10 = 0;
                }
            }
            jSONObject.put("evtName", string);
            jSONObject.put("evtData", jSONObject2);
            analyticsManager.f10947c.mo595e0(analyticsManager.f10950f, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }
}
