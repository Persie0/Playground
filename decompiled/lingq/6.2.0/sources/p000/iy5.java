package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.C0918b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.gps.ara.C0923a;
import com.facebook.internal.FeatureManager$Feature;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlinx.coroutines.flow.SharingCommand;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class iy5 implements g94, c94, j59, b9a, zc1, dqb {

    /* JADX INFO: renamed from: c */
    public static boolean f44767c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44777a;

    /* JADX INFO: renamed from: b */
    public static final iy5 f44766b = new iy5(0);

    /* JADX INFO: renamed from: d */
    public static final hm2 f44768d = new hm2(7);

    /* JADX INFO: renamed from: e */
    public static final iy5 f44769e = new iy5(2);

    /* JADX INFO: renamed from: f */
    public static final iy5 f44770f = new iy5(3);

    /* JADX INFO: renamed from: g */
    public static final iy5 f44771g = new iy5(4);

    /* JADX INFO: renamed from: h */
    public static final iy5 f44772h = new iy5(5);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ iy5 f44773i = new iy5(19);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ iy5 f44774j = new iy5(20);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ iy5 f44775k = new iy5(21);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ iy5 f44776l = new iy5(22);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ iy5 f44760H = new iy5(23);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ iy5 f44761I = new iy5(24);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ iy5 f44762J = new iy5(25);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ iy5 f44763K = new iy5(26);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ iy5 f44764L = new iy5(27);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ iy5 f44765M = new iy5(28);

    public /* synthetic */ iy5(int i) {
        this.f44777a = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #4 {all -> 0x006f, blocks: (B:16:0x0042, B:28:0x0061, B:24:0x0058, B:20:0x004d), top: B:66:0x0042, inners: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m14189b(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        Object[] objArr;
        String str = appEvent.f11384e;
        boolean z = appEvent.f11382c;
        String str2 = C3012fs.f39540c;
        qn3 qn3Var = AbstractC3546rr.f59732a;
        boolean z2 = false;
        z2 = false;
        if (!lp1.f49971a.contains(AbstractC3546rr.class)) {
            try {
                accessTokenAppIdPair.getClass();
                AbstractC3546rr.f59733b.execute(new RunnableC3470pr(z2 ? 1 : 0, accessTokenAppIdPair, appEvent));
            } catch (Throwable th) {
                lp1.m16420a(AbstractC3546rr.class, th);
            }
        }
        if (p13.m18852b(FeatureManager$Feature.OnDevicePostInstallEventProcessing) && xr6.m24659a()) {
            String str3 = accessTokenAppIdPair.f11376a;
            Set set = lp1.f49971a;
            if (!set.contains(xr6.class)) {
                try {
                    xr6 xr6Var = xr6.f68583a;
                    if (!set.contains(xr6Var)) {
                        if (z) {
                            try {
                                if (xr6.f68584b.contains(str)) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                                if (z || objArr != false) {
                                    sy2.m21768c().execute(new mv5(2, str3, appEvent));
                                }
                            } catch (Throwable th2) {
                                lp1.m16420a(xr6Var, th2);
                            }
                        } else {
                            objArr = false;
                            if (z) {
                                sy2.m21768c().execute(new mv5(2, str3, appEvent));
                            } else {
                                sy2.m21768c().execute(new mv5(2, str3, appEvent));
                            }
                        }
                    }
                } catch (Throwable th3) {
                    lp1.m16420a(xr6.class, th3);
                }
            }
        }
        if (p13.m18852b(FeatureManager$Feature.GPSARATriggers)) {
            C0923a.f11395a.m5189d(accessTokenAppIdPair.f11376a, appEvent);
        }
        if (p13.m18852b(FeatureManager$Feature.GPSPACAProcessing)) {
            f17.f38243a.m11498c(accessTokenAppIdPair.f11376a, appEvent);
        }
        if (z) {
            return;
        }
        if (!lp1.f49971a.contains(C3012fs.class)) {
            try {
                z2 = C3012fs.f39545h;
            } catch (Throwable th4) {
                lp1.m16420a(C3012fs.class, th4);
            }
        }
        if (z2) {
            return;
        }
        if (!fa4.m11650l(str, "fb_mobile_activate_app")) {
            iy5 iy5Var = qj5.f57852d;
            m14197m(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        } else {
            if (lp1.f49971a.contains(C3012fs.class)) {
                return;
            }
            try {
                C3012fs.f39545h = true;
            } catch (Throwable th5) {
                lp1.m16420a(C3012fs.class, th5);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Pair m14190c(Bundle bundle, jz6 jz6Var, boolean z) {
        String str = c60.m4339c() ? "1" : "0";
        Map map = jz6.f46432b;
        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
        Pair pairM11647i = fa4.m11647i(operationalDataEnum, "is_implicit_purchase_logging_enabled", str, bundle, jz6Var);
        Object objM11658t = fa4.m11658t(operationalDataEnum, "fb_iap_product_id", bundle, jz6Var);
        String str2 = objM11658t instanceof String ? (String) objM11658t : null;
        if (!z) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                Pair pairM11647i2 = fa4.m11647i(operationalDataEnum, "fb_content_id", str2, bundle, jz6Var);
                pairM11647i = fa4.m11647i(operationalDataEnum, "android_dynamic_ads_content_id", "client_manual", (Bundle) pairM11647i2.f47623a, (jz6) pairM11647i2.f47624b);
            }
        }
        Pair pairM11647i3 = fa4.m11647i(operationalDataEnum, "is_autolog_app_events_enabled", ema.m11256c() ? "1" : "0", (Bundle) pairM11647i.f47623a, (jz6) pairM11647i.f47624b);
        return new Pair((Bundle) pairM11647i3.f47623a, (jz6) pairM11647i3.f47624b);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static ByteString m14191f(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = AbstractC0001a.f1a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new ByteString(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new ByteString(bArrCopyOf);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ByteString m14192g(String str) {
        if (str.length() % 2 != 0) {
            C3386nv.m17624j("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC3352my.m17118f(str.charAt(i2 + 1)) + (AbstractC3352my.m17118f(str.charAt(i2)) << 4));
        }
        return new ByteString(bArr);
    }

    /* JADX INFO: renamed from: h */
    public static ByteString m14193h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(yu0.f70463a);
        bytes.getClass();
        ByteString byteString = new ByteString(bytes);
        byteString.f54516c = str;
        return byteString;
    }

    /* JADX INFO: renamed from: i */
    public static AppEventsLogger$FlushBehavior m14194i() {
        AppEventsLogger$FlushBehavior appEventsLogger$FlushBehavior;
        synchronized (C3012fs.m12036c()) {
            appEventsLogger$FlushBehavior = null;
            if (!lp1.f49971a.contains(C3012fs.class)) {
                try {
                    appEventsLogger$FlushBehavior = C3012fs.f39542e;
                } catch (Throwable th) {
                    lp1.m16420a(C3012fs.class, th);
                }
            }
        }
        return appEventsLogger$FlushBehavior;
    }

    /* JADX INFO: renamed from: j */
    public static String m14195j() {
        gm5 gm5Var;
        if (lp1.f49971a.contains(C3012fs.class)) {
            gm5Var = null;
        } else {
            try {
                gm5Var = C3012fs.f39546i;
            } catch (Throwable th) {
                lp1.m16420a(C3012fs.class, th);
                gm5Var = null;
            }
        }
        gm5Var.getClass();
        if (!sy2.m21766a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            Context context = InstallReferrerClient.newBuilder(sy2.m21766a()).f8045a;
            if (context == null) {
                C3386nv.m17626m("Please provide a valid Context.");
                return null;
            }
            C0918b c0918b = new C0918b(context);
            try {
                c0918b.startConnection(new or3(c0918b, gm5Var));
            } catch (Exception unused) {
            }
        }
        return sy2.m21766a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    /* JADX INFO: renamed from: k */
    public static void m14196k() {
        synchronized (C3012fs.m12036c()) {
            if (C3012fs.m12035b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!lp1.f49971a.contains(C3012fs.class)) {
                try {
                    C3012fs.f39541d = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    lp1.m16420a(C3012fs.class, th);
                }
            }
            RunnableC3637u6 runnableC3637u6 = new RunnableC3637u6(6);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM12035b = C3012fs.m12035b();
            if (scheduledThreadPoolExecutorM12035b != null) {
                scheduledThreadPoolExecutorM12035b.scheduleAtFixedRate(runnableC3637u6, 0L, 86400L, TimeUnit.SECONDS);
            } else {
                C3386nv.m17633t("Required value was null.");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m14197m(LoggingBehavior loggingBehavior, String str, String str2) {
        loggingBehavior.getClass();
        str.getClass();
        m14199o(loggingBehavior, str, str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m14198n(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        loggingBehavior.getClass();
        str.getClass();
        synchronized (sy2.f61586b) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m14199o(LoggingBehavior loggingBehavior, String str, String str2) {
        loggingBehavior.getClass();
        str.getClass();
        synchronized (sy2.f61586b) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static ByteString m14200p(byte[] bArr) {
        ByteString byteString = ByteString.f54513d;
        int length = bArr.length;
        te1.m22001o(bArr.length, 0L, length);
        return new ByteString(AbstractC3550rv.m20831Y(bArr, 0, length));
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ ojb m14201t(Object obj) {
        whb whbVar = (whb) obj;
        ojb ojbVar = whbVar.zzc;
        if (ojbVar != ojb.f54469f) {
            return ojbVar;
        }
        ojb ojbVarM18048a = ojb.m18048a();
        whbVar.zzc = ojbVarM18048a;
        return ojbVarM18048a;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m14202u(int i, k80 k80Var, Object obj) throws zzaeh {
        int iM14955D = k80Var.m14955D();
        int i2 = iM14955D >>> 3;
        int i3 = iM14955D & 7;
        if (i3 == 0) {
            ((ojb) obj).m18051d(i2 << 3, Long.valueOf(k80Var.m14959H()));
            return true;
        }
        if (i3 == 1) {
            ((ojb) obj).m18051d((i2 << 3) | 1, Long.valueOf(k80Var.m14961J()));
            return true;
        }
        if (i3 == 2) {
            ((ojb) obj).m18051d((i2 << 3) | 2, k80Var.m14968Q());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                uk9.m22782q("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i3 == 5) {
                ((ojb) obj).m18051d(5 | (i2 << 3), Integer.valueOf(k80Var.m14962K()));
                return true;
            }
            fg2.m11817c();
            return false;
        }
        ojb ojbVarM18048a = ojb.m18048a();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= 100) {
            uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (k80Var.m14954C() != Integer.MAX_VALUE && m14202u(i5, k80Var, ojbVarM18048a)) {
        }
        if ((i4 | 4) != k80Var.m14955D()) {
            uk9.m22782q("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (ojbVarM18048a.f54474e) {
            ojbVarM18048a.f54474e = false;
        }
        ((ojb) obj).m18051d(i4 | 3, ojbVarM18048a);
        return true;
    }

    @Override // p000.j59
    /* JADX INFO: renamed from: a */
    public c83 mo14203a(vm9 vm9Var) {
        return new i83(SharingCommand.START, 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m14204d(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    /* JADX INFO: renamed from: e */
    public void m14205e(String str) {
        if (m14204d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f44777a) {
            case 19:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(co7Var);
            default:
                return new l58(co7Var.mo4928c(g9c.class));
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m14206q(String str) {
        str.getClass();
        sy2.m21773h(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        synchronized (this) {
            qj5.f57853e.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14207r(String str) {
        if (m14204d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m14208s(String str, Exception exc) {
        if (m14204d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    public String toString() {
        switch (this.f44777a) {
            case 16:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f44777a) {
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_error_events_per_day", 69, 1000L).get()).longValue());
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.batch.retry_interval", 41, 1800000L).get();
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.realtime_upload_interval", 33, 10000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.lifetimevalue.max_currency_tracked", 17, 4L).get()).longValue());
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_item_scoped_custom_parameters", 23, 27L).get()).longValue());
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.app_allowlist", 32, "").get();
            case 26:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Boolean) xjb.f68306a.m19916p("measurement.config.default_flag_values", 10, true).get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                ((lkb) kkb.f47461b.f47462a.get()).getClass();
                return (Boolean) lkb.f49783b.get();
            default:
                List list9 = z8c.f71153a;
                ((glb) flb.f39268b.f39269a.get()).getClass();
                return (Boolean) glb.f40979a.get();
        }
    }
}
