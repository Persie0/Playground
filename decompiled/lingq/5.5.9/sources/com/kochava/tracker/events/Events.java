package com.kochava.tracker.events;

import ag.C0075b;
import ag.C0076c;
import bh.C1387c;
import bh.InterfaceC1385a;
import bh.InterfaceC1386b;
import java.util.concurrent.ArrayBlockingQueue;
import p003a2.C0009a;
import p243lg.C7360b;
import p341qg.C8618d;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;
import tg.InterfaceC9283c;

/* JADX INFO: loaded from: classes.dex */
public final class Events implements InterfaceC9283c, InterfaceC1386b {

    /* JADX INFO: renamed from: c */
    public static final C0076c f16481c;

    /* JADX INFO: renamed from: d */
    public static final Object f16482d;

    /* JADX INFO: renamed from: e */
    public static Events f16483e;

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f16484a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b */
    public InterfaceC1385a f16485b = null;

    /* JADX INFO: renamed from: com.kochava.tracker.events.Events$a */
    public class RunnableC3264a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1385a f16486a;

        public RunnableC3264a(InterfaceC1385a interfaceC1385a) {
            this.f16486a = interfaceC1385a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                InterfaceC10488f interfaceC10488f = (InterfaceC10488f) Events.this.f16484a.poll();
                if (interfaceC10488f == null) {
                    return;
                }
                try {
                    C8618d c8618d = (C8618d) this.f16486a;
                    synchronized (c8618d) {
                        try {
                            c8618d.f46122t.offer(new C1387c(c8618d, c8618d.f46106d, c8618d.f46126x, c8618d.f46104b, c8618d.f46107e, interfaceC10488f));
                            c8618d.m16833j(c8618d.f46122t);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    C0076c c0076c = Events.f16481c;
                    c0076c.m460d("action failed, unknown error occurred");
                    c0076c.m460d(th3);
                }
            }
        }
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f16481c = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
        f16482d = new Object();
        f16483e = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static InterfaceC9283c getInstance() {
        if (f16483e == null) {
            synchronized (f16482d) {
                if (f16483e == null) {
                    f16483e = new Events();
                }
            }
        }
        return f16483e;
    }

    /* JADX INFO: renamed from: a */
    public final void m9306a() {
        InterfaceC1385a interfaceC1385a = this.f16485b;
        if (interfaceC1385a == null) {
            f16481c.m459c("Cannot flush queue, SDK not started");
            return;
        }
        ((C7360b) ((C8618d) interfaceC1385a).f46126x.f46132f).m14769f(new RunnableC3264a(interfaceC1385a));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public synchronized InterfaceC1385a getController() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16485b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // bh.InterfaceC1386b
    public synchronized void setController(InterfaceC1385a interfaceC1385a) {
        try {
            this.f16485b = interfaceC1385a;
            if (interfaceC1385a != null) {
                m9306a();
            } else {
                this.f16484a.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
