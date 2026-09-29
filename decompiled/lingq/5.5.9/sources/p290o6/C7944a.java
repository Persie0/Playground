package p290o6;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0140a;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import androidx.fragment.app.Fragment;
import com.android.installreferrer.api.C2078a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CallableC2216e0;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.concurrent.Callable;
import p043c7.C1735a;
import p043c7.HandlerC1740f;
import p357r6.C8740b;
import p526z6.CallableC10451g;

/* JADX INFO: renamed from: o6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7944a {

    /* JADX INFO: renamed from: a */
    public final AnalyticsManager f43267a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f43268b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f43269c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f43270d;

    /* JADX INFO: renamed from: e */
    public final Context f43271e;

    /* JADX INFO: renamed from: f */
    public final C7986y f43272f;

    /* JADX INFO: renamed from: g */
    public final InAppController f43273g;

    /* JADX INFO: renamed from: h */
    public final C2260f f43274h;

    /* JADX INFO: renamed from: i */
    public final C7975p0 f43275i;

    /* JADX INFO: renamed from: o6.a$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            C7944a c7944a = C7944a.this;
            C7986y c7986y = c7944a.f43272f;
            CleverTapInstanceConfig cleverTapInstanceConfig = c7944a.f43270d;
            if (!(c7986y.f43462d > 0)) {
                return null;
            }
            try {
                C7977q0.m15831i(c7944a.f43271e, iCurrentTimeMillis, C7977q0.m15833k(cleverTapInstanceConfig, "sexe"));
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                c2181aM6433b.getClass();
                C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Updated session time: " + iCurrentTimeMillis);
                return null;
            } catch (Throwable th2) {
                C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                String str = "Failed to update session time time: " + th2.getMessage();
                c2181aM6433b2.getClass();
                C2181a.m6460m(cleverTapInstanceConfig.f10995a, str);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: o6.a$b */
    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C7944a c7944a = C7944a.this;
            C7986y c7986y = c7944a.f43272f;
            if (!c7986y.f43467i && c7986y.f43465g) {
                C7944a.m15752a(c7944a);
            }
            return null;
        }
    }

    public C7944a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, AnalyticsManager analyticsManager, C7986y c7986y, C7975p0 c7975p0, C2260f c2260f, C7972o c7972o, InAppController inAppController, C8740b c8740b) {
        this.f43271e = context;
        this.f43270d = cleverTapInstanceConfig;
        this.f43267a = analyticsManager;
        this.f43272f = c7986y;
        this.f43275i = c7975p0;
        this.f43274h = c2260f;
        this.f43269c = c7972o;
        this.f43273g = inAppController;
        this.f43268b = c8740b;
    }

    /* JADX INFO: renamed from: a */
    public static void m15752a(C7944a c7944a) {
        CleverTapInstanceConfig cleverTapInstanceConfig = c7944a.f43270d;
        cleverTapInstanceConfig.m6433b().getClass();
        String str = cleverTapInstanceConfig.f10995a;
        C2181a.m6460m(str, "Starting to handle install referrer");
        try {
            C2078a c2078aM6226a = InstallReferrerClient.newBuilder(c7944a.f43271e).m6226a();
            c2078aM6226a.startConnection(new C7950d(c7944a, c2078aM6226a));
        } catch (Throwable th2) {
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str2 = "Google Play Install Referrer's InstallReferrerClient Class not found - " + th2.getLocalizedMessage() + " \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle";
            c2181aM6433b.getClass();
            C2181a.m6460m(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15753b() {
        C7986y.f43446Q = false;
        this.f43275i.f43396a = System.currentTimeMillis();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43270d;
        cleverTapInstanceConfig.m6433b().getClass();
        C2181a.m6460m(cleverTapInstanceConfig.f10995a, "App in background");
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("activityPaused", new a());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m15754c(Activity activity) {
        boolean z10;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43270d;
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        String str = cleverTapInstanceConfig.f10995a;
        c2181aM6433b.getClass();
        C2181a.m6460m(str, "App in foreground");
        C7975p0 c7975p0 = this.f43275i;
        if (c7975p0.f43396a > 0 && System.currentTimeMillis() - c7975p0.f43396a > 1200000) {
            CleverTapInstanceConfig cleverTapInstanceConfig2 = c7975p0.f43398c;
            C2181a c2181aM6433b2 = cleverTapInstanceConfig2.m6433b();
            String str2 = cleverTapInstanceConfig2.f10995a;
            c2181aM6433b2.getClass();
            C2181a.m6460m(str2, "Session Timed Out");
            c7975p0.m15821k0();
            C7986y.f43447R = null;
        }
        C7986y c7986y = this.f43272f;
        synchronized (c7986y.f43461c) {
            z10 = c7986y.f43460b;
        }
        if (!z10) {
            AnalyticsManager analyticsManager = this.f43267a;
            analyticsManager.m6411t0();
            analyticsManager.mo605v();
            C2260f c2260f = this.f43274h;
            C1735a.m5472a(c2260f.f11344g).m5473a().m6585b("PushProviders#refreshAllTokens", new CallableC10451g(c2260f));
            C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("HandlingInstallReferrer", new b());
            try {
                this.f43269c.mo568D();
            } catch (IllegalStateException e10) {
                C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                String str3 = cleverTapInstanceConfig.f10995a;
                String localizedMessage = e10.getLocalizedMessage();
                c2181aM6433b3.getClass();
                C2181a.m6460m(str3, localizedMessage);
            } catch (Exception unused) {
                C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
                String str4 = cleverTapInstanceConfig.f10995a;
                c2181aM6433b4.getClass();
                C2181a.m6460m(str4, "Failed to trigger location");
            }
        }
        this.f43268b.mo594d0();
        InAppController inAppController = this.f43273g;
        if (inAppController.m6505f() && InAppController.f11138k != null && System.currentTimeMillis() / 1000 < InAppController.f11138k.f11096Z) {
            ActivityC0979t activityC0979t = (ActivityC0979t) activity;
            Fragment fragmentM3617E = activityC0979t.m3805K().m3617E(new Bundle(), InAppController.f11138k.f11106e0);
            if (C7986y.m15846k0() != null && fragmentM3617E != null) {
                C0949e0 c0949e0M3805K = activityC0979t.m3805K();
                c0949e0M3805K.getClass();
                C0940a c0940a = new C0940a(c0949e0M3805K);
                Bundle bundle = new Bundle();
                bundle.putParcelable("inApp", InAppController.f11138k);
                CleverTapInstanceConfig cleverTapInstanceConfig3 = inAppController.f11142c;
                bundle.putParcelable("config", cleverTapInstanceConfig3);
                fragmentM3617E.m3583e0(bundle);
                c0940a.f6345b = R.animator.fade_in;
                c0940a.f6346c = R.animator.fade_out;
                c0940a.f6347d = 0;
                c0940a.f6348e = 0;
                c0940a.mo3695f(R.id.content, fragmentM3617E, InAppController.f11138k.f11106e0, 1);
                C2181a.m6456i(cleverTapInstanceConfig3.f10995a, "calling InAppFragment " + InAppController.f11138k.f11109g);
                c0940a.m3697i();
            }
        }
        if (inAppController.m6505f()) {
            HandlerC1740f handlerC1740f = inAppController.f11149j;
            if (handlerC1740f.f9591a != null) {
                String str5 = inAppController.f11142c.f10995a;
                inAppController.f11148i.getClass();
                C2181a.m6460m(str5, "Found a pending inapp runnable. Scheduling it");
                handlerC1740f.postDelayed(handlerC1740f.f9591a, 200L);
                handlerC1740f.f9591a = null;
                return;
            }
            Context context = inAppController.f11143d;
            CleverTapInstanceConfig cleverTapInstanceConfig4 = inAppController.f11142c;
            if (!cleverTapInstanceConfig4.f10999e) {
                C1735a.m5472a(cleverTapInstanceConfig4).m5475c("TAG_FEATURE_IN_APPS").m6585b("InappController#showNotificationIfAvailable", new CallableC2216e0(inAppController, context));
            }
        } else {
            StringBuilder sb2 = new StringBuilder("In-app notifications will not be shown for this activity (");
            sb2.append(activity != null ? activity.getLocalClassName() : "");
            sb2.append(")");
            C2181a.m6449a(sb2.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:31:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: d */
    public final void m15755d(Bundle bundle, Uri uri, String str) {
        boolean z10;
        AnalyticsManager analyticsManager;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43270d;
        if (str == null) {
            try {
                if (cleverTapInstanceConfig.f10988H) {
                    z10 = true;
                } else if (cleverTapInstanceConfig.f10995a.equals(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    analyticsManager = this.f43267a;
                    if (bundle != null && !bundle.isEmpty() && bundle.containsKey("wzrk_pn")) {
                        analyticsManager.m6416y0(bundle);
                    }
                    if (uri != null) {
                        try {
                            analyticsManager.m6412u0(false, uri);
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                C2181a.m6455h("Throwable - " + th2.getLocalizedMessage());
            }
        } else {
            if (cleverTapInstanceConfig.f10995a.equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                analyticsManager = this.f43267a;
                if (bundle != null) {
                    analyticsManager.m6416y0(bundle);
                }
                if (uri != null) {
                    analyticsManager.m6412u0(false, uri);
                }
            }
        }
    }
}
