package p290o6;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import p003a2.C0009a;
import p066d7.C5050b;
import p381s6.C8967b;

/* JADX INFO: renamed from: o6.v */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7983v implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f43422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7985x f43423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CleverTapInstanceConfig f43424c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C7951d0 f43425d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0140a f43426e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AnalyticsManager f43427f;

    public CallableC7983v(Context context, C7985x c7985x, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C7972o c7972o, AnalyticsManager analyticsManager) {
        this.f43422a = context;
        this.f43423b = c7985x;
        this.f43424c = cleverTapInstanceConfig;
        this.f43425d = c7951d0;
        this.f43426e = c7972o;
        this.f43427f = analyticsManager;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        AbstractC0140a abstractC0140a = this.f43426e;
        AnalyticsManager analyticsManager = this.f43427f;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43424c;
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        StringBuilder sb2 = new StringBuilder();
        String str = cleverTapInstanceConfig.f10995a;
        String strM23l = C0009a.m23l(sb2, str, ":async_deviceID");
        StringBuilder sb3 = new StringBuilder("Initializing Feature Flags with device Id = ");
        C7951d0 c7951d0 = this.f43425d;
        sb3.append(c7951d0.m15765i());
        String string = sb3.toString();
        c2181aM6433b.getClass();
        C2181a.m6460m(strM23l, string);
        if (cleverTapInstanceConfig.f10999e) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6452d(str, "Feature Flag is not enabled for this instance");
        } else {
            this.f43423b.f43435d = new C8967b(c7951d0.m15765i(), cleverTapInstanceConfig, abstractC0140a, analyticsManager, new C5050b(this.f43422a, cleverTapInstanceConfig));
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6460m(str + ":async_deviceID", "Feature Flags initialized");
        }
        return null;
    }
}
