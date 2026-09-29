package ch;

import ag.C0076c;
import android.content.Context;
import bg.C1380a;
import bh.InterfaceC1385a;
import bh.InterfaceC1386b;
import com.kochava.tracker.events.Events;
import p013ah.InterfaceC0077a;
import p341qg.InterfaceC8619e;
import p534zf.C10483a;

/* JADX INFO: renamed from: ch.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2007a {

    /* JADX INFO: renamed from: a */
    public final Context f10450a;

    /* JADX INFO: renamed from: b */
    public C1380a f10451b = null;

    /* JADX INFO: renamed from: c */
    public C1380a f10452c = null;

    /* JADX INFO: renamed from: d */
    public C1380a f10453d = null;

    /* JADX INFO: renamed from: e */
    public C1380a f10454e = null;

    /* JADX INFO: renamed from: f */
    public C1380a f10455f = null;

    /* JADX INFO: renamed from: g */
    public C1380a f10456g = null;

    /* JADX INFO: renamed from: h */
    public C1380a f10457h = null;

    public C2007a(Context context) {
        this.f10450a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized C10483a m5941a() {
        C10483a c10483aM19430i;
        try {
            c10483aM19430i = C10483a.m19430i();
            C1380a c1380a = this.f10451b;
            if (c1380a != null) {
                c10483aM19430i.m19438h(c1380a.m4967b());
            }
            C1380a c1380a2 = this.f10452c;
            if (c1380a2 != null) {
                c10483aM19430i.m19438h(c1380a2.m4967b());
            }
            C1380a c1380a3 = this.f10453d;
            if (c1380a3 != null) {
                c10483aM19430i.m19438h(c1380a3.m4967b());
            }
            C1380a c1380a4 = this.f10454e;
            if (c1380a4 != null) {
                c10483aM19430i.m19438h(c1380a4.m4967b());
            }
            C1380a c1380a5 = this.f10455f;
            if (c1380a5 != null) {
                c10483aM19430i.m19438h(c1380a5.m4967b());
            }
            C1380a c1380a6 = this.f10456g;
            if (c1380a6 != null) {
                c10483aM19430i.m19438h(c1380a6.m4967b());
            }
            C1380a c1380a7 = this.f10457h;
            if (c1380a7 != null) {
                c10483aM19430i.m19438h(c1380a7.m4967b());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c10483aM19430i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m5942b() {
        try {
            C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.core.BuildConfig");
            if (c1380aM4966a.f8290a) {
                this.f10452c = c1380aM4966a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5943c() {
        C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.tracker.datapointnetwork.BuildConfig");
        if (c1380aM4966a.f8290a) {
            this.f10454e = c1380aM4966a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m5944d(InterfaceC8619e interfaceC8619e) {
        Object objInvoke;
        InterfaceC0077a interfaceC0077a = null;
        try {
            objInvoke = Class.forName("com.kochava.tracker.engagement.Engagement").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            objInvoke = null;
        }
        try {
            if (objInvoke instanceof InterfaceC0077a) {
                interfaceC0077a = (InterfaceC0077a) objInvoke;
            }
            if (interfaceC0077a != null) {
                interfaceC0077a.m461a();
            }
            C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.tracker.engagement.BuildConfig");
            if (c1380aM4966a.f8290a) {
                this.f10457h = c1380aM4966a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5945e(InterfaceC1385a interfaceC1385a) {
        Object objInvoke;
        InterfaceC1386b interfaceC1386b = null;
        try {
            C0076c c0076c = Events.f16481c;
            objInvoke = Events.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            objInvoke = null;
        }
        try {
            if (objInvoke instanceof InterfaceC1386b) {
                interfaceC1386b = (InterfaceC1386b) objInvoke;
            }
            if (interfaceC1386b != null) {
                interfaceC1386b.setController(interfaceC1385a);
            }
            C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.tracker.events.BuildConfig");
            if (c1380aM4966a.f8290a) {
                this.f10456g = c1380aM4966a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m5946f() {
        try {
            C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.tracker.legacyreferrer.BuildConfig");
            if (c1380aM4966a.f8290a) {
                this.f10455f = c1380aM4966a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5947g() {
        C1380a c1380aM4966a = C1380a.m4966a(this.f10450a, "com.kochava.tracker.BuildConfig");
        if (c1380aM4966a.f8290a) {
            this.f10453d = c1380aM4966a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m5948h(C1380a c1380a) {
        try {
            if (c1380a.f8290a) {
                this.f10451b = c1380a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
