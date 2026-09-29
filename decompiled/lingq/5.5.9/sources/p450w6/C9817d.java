package p450w6;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.ArrayList;
import java.util.Iterator;
import p043c7.C1735a;
import p043c7.C1736b;
import p066d7.C5050b;
import p088e7.C5382b;
import p088e7.C5383c;
import p289o5.C7940t;
import p290o6.C7951d0;
import p290o6.C7963j0;
import p290o6.C7972o;
import p290o6.C7975p0;
import p290o6.C7985x;
import p290o6.C7986y;
import p357r6.C8740b;
import p381s6.C8967b;
import p381s6.CallableC8966a;
import p501y6.C10299c;
import p501y6.CallableC10298b;

/* JADX INFO: renamed from: w6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9817d {

    /* JADX INFO: renamed from: q */
    public static final Object f49964q = new Object();

    /* JADX INFO: renamed from: b */
    public final AnalyticsManager f49966b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f49967c;

    /* JADX INFO: renamed from: d */
    public final C7940t f49968d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0140a f49969e;

    /* JADX INFO: renamed from: f */
    public final CleverTapInstanceConfig f49970f;

    /* JADX INFO: renamed from: g */
    public final Context f49971g;

    /* JADX INFO: renamed from: h */
    public final C7985x f49972h;

    /* JADX INFO: renamed from: i */
    public final C7986y f49973i;

    /* JADX INFO: renamed from: j */
    public final C2185b f49974j;

    /* JADX INFO: renamed from: k */
    public final C7951d0 f49975k;

    /* JADX INFO: renamed from: l */
    public final C7963j0 f49976l;

    /* JADX INFO: renamed from: m */
    public final C2260f f49977m;

    /* JADX INFO: renamed from: n */
    public final C7975p0 f49978n;

    /* JADX INFO: renamed from: o */
    public final C5383c f49979o;

    /* JADX INFO: renamed from: a */
    public String f49965a = null;

    /* JADX INFO: renamed from: p */
    public String f49980p = null;

    public C9817d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C5383c c5383c, C8740b c8740b, AnalyticsManager analyticsManager, C7986y c7986y, C7985x c7985x, C7975p0 c7975p0, C7963j0 c7963j0, C7972o c7972o, C2185b c2185b, C7940t c7940t) {
        this.f49970f = cleverTapInstanceConfig;
        this.f49971g = context;
        this.f49975k = c7951d0;
        this.f49979o = c5383c;
        this.f49967c = c8740b;
        this.f49966b = analyticsManager;
        this.f49973i = c7986y;
        this.f49977m = c7985x.f43444m;
        this.f49978n = c7975p0;
        this.f49976l = c7963j0;
        this.f49969e = c7972o;
        this.f49974j = c2185b;
        this.f49972h = c7985x;
        this.f49968d = c7940t;
    }

    /* JADX INFO: renamed from: a */
    public static void m18293a(C9817d c9817d) {
        C8967b c8967b = c9817d.f49972h.f43435d;
        if (c8967b == null || !c8967b.f46977c) {
            CleverTapInstanceConfig cleverTapInstanceConfig = c9817d.f49970f;
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6460m(cleverTapInstanceConfig.f10995a, "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null");
        } else {
            c8967b.f46976b = c9817d.f49975k.m15765i();
            c8967b.m17195e();
            C1736b c1736bM5472a = C1735a.m5472a(c8967b.f46975a);
            c1736bM5472a.m5476d(c1736bM5472a.f9582b, c1736bM5472a.f9583c, "Main").m6585b("fetchFeatureFlags", new CallableC8966a(c8967b));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18294b(C9817d c9817d) {
        CleverTapInstanceConfig cleverTapInstanceConfig = c9817d.f49970f;
        boolean z10 = cleverTapInstanceConfig.f10999e;
        String str = cleverTapInstanceConfig.f10995a;
        if (z10) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6452d(str, "Product Config is not enabled for this instance");
            return;
        }
        C7985x c7985x = c9817d.f49972h;
        CTProductConfigController cTProductConfigController = c7985x.f43438g;
        if (cTProductConfigController != null) {
            C10299c c10299c = cTProductConfigController.f11323h;
            c10299c.m19291f();
            C5050b c5050b = cTProductConfigController.f11319d;
            if (c5050b == null) {
                throw new IllegalArgumentException("FileUtils can't be null");
            }
            C1735a.m5472a(c10299c.f51809a).m5473a().m6585b("ProductConfigSettings#eraseStoredSettingsFile", new CallableC10298b(c10299c, c5050b));
        }
        String strM15765i = c9817d.f49975k.m15765i();
        Context context = c9817d.f49971g;
        CleverTapInstanceConfig cleverTapInstanceConfig2 = c9817d.f49970f;
        C5050b c5050b2 = new C5050b(context, cleverTapInstanceConfig2);
        c7985x.f43438g = new CTProductConfigController(cleverTapInstanceConfig2, c9817d.f49969e, new C10299c(strM15765i, cleverTapInstanceConfig2, c5050b2), c5050b2);
        cleverTapInstanceConfig.m6433b().getClass();
        C2181a.m6460m(str, "Product Config reset");
    }

    /* JADX INFO: renamed from: c */
    public final void m18295c() {
        ArrayList<C5382b> arrayList = this.f49975k.f43301k;
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f49979o.m11556b((C5382b) it.next());
        }
    }
}
