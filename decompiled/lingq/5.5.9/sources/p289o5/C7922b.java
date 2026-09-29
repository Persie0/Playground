package p289o5;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.AbstractC0140a;
import com.google.android.gms.internal.play_billing.C2933a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p081e0.C5298b1;
import p480xb.InterfaceC10161d;

/* JADX INFO: renamed from: o5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7922b extends AbstractC0140a {

    /* JADX INFO: renamed from: H */
    public boolean f43152H;

    /* JADX INFO: renamed from: I */
    public boolean f43153I;

    /* JADX INFO: renamed from: J */
    public boolean f43154J;

    /* JADX INFO: renamed from: K */
    public boolean f43155K;

    /* JADX INFO: renamed from: L */
    public boolean f43156L;

    /* JADX INFO: renamed from: M */
    public ExecutorService f43157M;

    /* JADX INFO: renamed from: a */
    public volatile int f43158a;

    /* JADX INFO: renamed from: b */
    public final String f43159b;

    /* JADX INFO: renamed from: c */
    public final Handler f43160c;

    /* JADX INFO: renamed from: d */
    public volatile C5298b1 f43161d;

    /* JADX INFO: renamed from: e */
    public Context f43162e;

    /* JADX INFO: renamed from: f */
    public volatile InterfaceC10161d f43163f;

    /* JADX INFO: renamed from: g */
    public volatile ServiceConnectionC7938r f43164g;

    /* JADX INFO: renamed from: h */
    public boolean f43165h;

    /* JADX INFO: renamed from: i */
    public int f43166i;

    /* JADX INFO: renamed from: j */
    public boolean f43167j;

    /* JADX INFO: renamed from: k */
    public boolean f43168k;

    /* JADX INFO: renamed from: l */
    public boolean f43169l;

    public C7922b(boolean z10, Context context, InterfaceC7927g interfaceC7927g) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.1.0";
        }
        this.f43158a = 0;
        this.f43160c = new Handler(Looper.getMainLooper());
        this.f43166i = 0;
        this.f43159b = str;
        this.f43162e = context.getApplicationContext();
        if (interfaceC7927g == null) {
            C2933a.m8515g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f43161d = new C5298b1(this.f43162e, interfaceC7927g);
        this.f43155K = z10;
        this.f43156L = false;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m15738k0() {
        return (this.f43158a != 2 || this.f43163f == null || this.f43164g == null) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public final Handler m15739l0() {
        return Looper.myLooper() == null ? this.f43160c : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15740m0(C7925e c7925e) {
        if (Thread.interrupted()) {
            return;
        }
        this.f43160c.post(new RunnableC7934n(this, 0, c7925e));
    }

    /* JADX INFO: renamed from: n0 */
    public final C7925e m15741n0() {
        if (this.f43158a != 0 && this.f43158a != 3) {
            return C7939s.f43248h;
        }
        return C7939s.f43250j;
    }

    /* JADX INFO: renamed from: o0 */
    public final Future m15742o0(Callable callable, long j10, Runnable runnable, Handler handler) {
        if (this.f43157M == null) {
            this.f43157M = Executors.newFixedThreadPool(C2933a.f14568a, new ThreadFactoryC7936p());
        }
        try {
            Future futureSubmit = this.f43157M.submit(callable);
            handler.postDelayed(new RunnableC7933m(futureSubmit, 0, runnable), (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            C2933a.m8516h("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }
}
