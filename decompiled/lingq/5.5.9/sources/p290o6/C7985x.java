package p290o6;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import android.util.Log;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.p049db.AbstractC2184a;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.concurrent.Callable;
import p043c7.C1735a;
import p080e.C5288t;
import p289o5.C7940t;
import p381s6.C8967b;
import p408u6.C9471j;

/* JADX INFO: renamed from: o6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7985x {

    /* JADX INFO: renamed from: a */
    public C7957g0 f43432a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2184a f43433b;

    /* JADX INFO: renamed from: c */
    public C5288t f43434c;

    /* JADX INFO: renamed from: d */
    public C8967b f43435d;

    /* JADX INFO: renamed from: e */
    public C9471j f43436e;

    /* JADX INFO: renamed from: f */
    public final C7940t f43437f;

    /* JADX INFO: renamed from: g */
    public CTProductConfigController f43438g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0140a f43439h;

    /* JADX INFO: renamed from: i */
    public final CleverTapInstanceConfig f43440i;

    /* JADX INFO: renamed from: j */
    public final Context f43441j;

    /* JADX INFO: renamed from: k */
    public final C7951d0 f43442k;

    /* JADX INFO: renamed from: l */
    public InAppController f43443l;

    /* JADX INFO: renamed from: m */
    public C2260f f43444m;

    /* JADX INFO: renamed from: o6.x$a */
    public class a implements Callable<Void> {
        public a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C7985x c7985x = C7985x.this;
            synchronized (c7985x.f43437f.f43257b) {
                if (c7985x.f43436e != null) {
                    c7985x.f43439h.mo593d();
                } else if (c7985x.f43442k.m15765i() != null) {
                    c7985x.f43436e = new C9471j(c7985x.f43440i, c7985x.f43442k.m15765i(), c7985x.f43433b.mo6479b(c7985x.f43441j), c7985x.f43437f, c7985x.f43439h, C7979r0.f43406a);
                    c7985x.f43439h.mo593d();
                } else {
                    C2181a c2181aM6433b = c7985x.f43440i.m6433b();
                    c2181aM6433b.getClass();
                    if (c2181aM6433b.f11017a >= CleverTapAPI.LogLevel.INFO.intValue()) {
                        Log.i("CleverTap", "CRITICAL : No device ID found!");
                    }
                }
            }
            return null;
        }
    }

    public C7985x(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7940t c7940t, C7972o c7972o, C7951d0 c7951d0, C2185b c2185b) {
        this.f43440i = cleverTapInstanceConfig;
        this.f43437f = c7940t;
        this.f43439h = c7972o;
        this.f43442k = c7951d0;
        this.f43441j = context;
        this.f43433b = c2185b;
    }

    /* JADX INFO: renamed from: a */
    public final void m15845a() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43440i;
        if (!cleverTapInstanceConfig.f10999e) {
            C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("initializeInbox", new a());
        } else {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Instance is analytics only, not initializing Notification Inbox");
        }
    }
}
