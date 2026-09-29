package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ytb implements vwb {

    /* JADX INFO: renamed from: d */
    public static final Object f70454d = new Object();

    /* JADX INFO: renamed from: e */
    public static final rwb f70455e = new rwb(pxb.class);

    /* JADX INFO: renamed from: f */
    public static final boolean f70456f;

    /* JADX INFO: renamed from: g */
    public static final fdd f70457g;

    /* JADX INFO: renamed from: a */
    public volatile Object f70458a;

    /* JADX INFO: renamed from: b */
    public volatile mtb f70459b;

    /* JADX INFO: renamed from: c */
    public volatile ttb f70460c;

    static {
        boolean z;
        fdd rtbVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f70456f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                rtbVar = new stb();
            } catch (Error | Exception e) {
                try {
                    rtbVar = new qtb();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    rtbVar = new rtb();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                rtbVar = new qtb();
            } catch (NoClassDefFoundError unused2) {
                rtbVar = new rtb();
            }
        }
        th = null;
        th2 = null;
        f70457g = rtbVar;
        if (th != null) {
            rwb rwbVar = f70455e;
            Logger loggerM20965a = rwbVar.m20965a();
            Level level = Level.SEVERE;
            loggerM20965a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            rwbVar.m20965a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25317c(ttb ttbVar) {
        ttbVar.f62873a = null;
        while (true) {
            ttb ttbVar2 = this.f70460c;
            if (ttbVar2 != ttb.f62872c) {
                ttb ttbVar3 = null;
                while (ttbVar2 != null) {
                    ttb ttbVar4 = ttbVar2.f62874b;
                    if (ttbVar2.f62873a != null) {
                        ttbVar3 = ttbVar2;
                    } else if (ttbVar3 != null) {
                        ttbVar3.f62874b = ttbVar4;
                        if (ttbVar3.f62873a == null) {
                        }
                    } else if (!f70457g.mo11794g(this, ttbVar2, ttbVar4)) {
                    }
                    ttbVar2 = ttbVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Throwable mo19563d();
}
