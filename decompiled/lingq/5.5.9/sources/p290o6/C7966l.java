package p290o6;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dm.C5207g;
import p043c7.C1735a;
import p235l5.CallableC7262i;

/* JADX INFO: renamed from: o6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7966l {

    /* JADX INFO: renamed from: a */
    public static final a f43362a = new a();

    /* JADX INFO: renamed from: b */
    public static volatile C7966l f43363b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f43364c = true;

    /* JADX INFO: renamed from: o6.l$a */
    public static final class a {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m15803a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        a aVar = f43362a;
        C5207g.m11111f(context, "context");
        C5207g.m11111f(cleverTapInstanceConfig, "config");
        if (f43363b == null) {
            synchronized (aVar) {
                try {
                    if (f43363b == null) {
                        C1735a.m5472a(cleverTapInstanceConfig).m5473a().m6585b("buildCache", new CallableC7262i(1, context));
                        f43363b = new C7966l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15804b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(cleverTapInstanceConfig, "config");
        C1735a.m5472a(cleverTapInstanceConfig).m5473a().m6585b("updateCacheToDisk", new CallableC7964k(0, context));
    }
}
