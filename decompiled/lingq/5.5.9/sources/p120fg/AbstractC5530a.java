package p120fg;

import ag.C0076c;
import android.content.Context;
import android.os.Handler;
import com.kochava.core.profile.internal.ProfileLoadException;
import com.kochava.core.task.internal.TaskQueue;
import gh.C5798f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kg.C6670c;
import kg.InterfaceC6672e;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.C7363e;
import p243lg.InterfaceC7361c;
import p341qg.C8618d;
import p349qo.C8656b;
import p535zg.C10489a;

/* JADX INFO: renamed from: fg.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5530a implements InterfaceC6477b, InterfaceC6672e {

    /* JADX INFO: renamed from: a */
    public final Context f34212a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7361c f34213b;

    /* JADX INFO: renamed from: c */
    public final Object f34214c = new Object();

    /* JADX INFO: renamed from: d */
    public final Object f34215d = new Object();

    /* JADX INFO: renamed from: e */
    public final CountDownLatch f34216e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    public volatile boolean f34217f = false;

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC5531b f34218g = null;

    public AbstractC5530a(Context context, InterfaceC7361c interfaceC7361c) {
        this.f34212a = context;
        this.f34213b = interfaceC7361c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m11768a() {
        boolean z10;
        synchronized (this.f34215d) {
            z10 = this.f34216e.getCount() == 0;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final void mo11769b() {
        synchronized (this.f34214c) {
            mo11772e();
        }
        synchronized (this.f34215d) {
            this.f34216e.countDown();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kg.InterfaceC6672e
    /* JADX INFO: renamed from: c */
    public final void mo11770c(boolean z10) {
        InterfaceC5531b interfaceC5531b;
        String str;
        synchronized (this.f34215d) {
            try {
                interfaceC5531b = this.f34218g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC5531b != null) {
            C8618d c8618d = (C8618d) interfaceC5531b;
            synchronized (c8618d) {
                c8618d.m16838o();
                c8618d.m16836m();
                c8618d.m16844u();
                c8618d.f46107e.m12963i();
                C0076c c0076c = C8618d.f46102y;
                StringBuilder sb2 = new StringBuilder("This ");
                sb2.append(c8618d.f46106d.m12187m().m12212k() ? "is" : "is not");
                sb2.append(" the first tracker SDK launch");
                C10489a.m19475a(c0076c, sb2.toString());
                StringBuilder sb3 = new StringBuilder("The kochava device id is ");
                String strM12210i = c8618d.f46106d.m12187m().m12210i();
                C5798f c5798fM12187m = c8618d.f46106d.m12187m();
                synchronized (c5798fM12187m) {
                    str = c5798fM12187m.f35049g;
                }
                sb3.append(C8656b.m16913u(strM12210i, str, new String[0]));
                C10489a.m19477c(c0076c, sb3.toString());
                c8618d.f46109g.start();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m11771d(InterfaceC5531b interfaceC5531b) {
        synchronized (this.f34215d) {
            if (this.f34217f) {
                return;
            }
            this.f34217f = true;
            this.f34218g = interfaceC5531b;
            InterfaceC7361c interfaceC7361c = this.f34213b;
            TaskQueue taskQueue = TaskQueue.IO;
            C6476a c6476a = new C6476a(this);
            C7360b c7360b = (C7360b) interfaceC7361c;
            C7363e c7363e = c7360b.f41121b;
            Handler handler = c7363e.f41128b;
            Handler handler2 = c7363e.f41127a;
            ExecutorService executorService = C7363e.f41126e;
            if (executorService == null) {
                throw new RuntimeException("Failed to start threadpool");
            }
            new C6670c(handler, handler2, executorService, taskQueue, c7360b, c6476a, this).m13294f(0L);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo11772e();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final void m11773f() throws ProfileLoadException {
        if (m11768a()) {
            return;
        }
        synchronized (this.f34215d) {
            if (!this.f34217f) {
                throw new ProfileLoadException("Failed to load persisted profile. attempted access before loading.");
            }
        }
        try {
            if (this.f34216e.await(5000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new ProfileLoadException("Failed to load persisted profile, timed out.");
            }
        } catch (InterruptedException e10) {
            throw new ProfileLoadException(e10);
        }
    }
}
