package p155he;

import ae.C0065e;
import com.google.firebase.crashlytics.internal.common.C3213b;
import p241le.C7332f;
import p241le.C7352w;
import p241le.CallableC7334g;
import p241le.RunnableC7346q;

/* JADX INFO: renamed from: he.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6041e {

    /* JADX INFO: renamed from: a */
    public final C7352w f35688a;

    public C6041e(C7352w c7352w) {
        this.f35688a = c7352w;
    }

    /* JADX INFO: renamed from: a */
    public static C6041e m12476a() {
        C0065e c0065eM434b = C0065e.m434b();
        c0065eM434b.m437a();
        C6041e c6041e = (C6041e) c0065eM434b.f174d.mo11748a(C6041e.class);
        if (c6041e != null) {
            return c6041e;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: renamed from: b */
    public final void m12477b(Exception exc) {
        C3213b c3213b = this.f35688a.f41100g;
        Thread threadCurrentThread = Thread.currentThread();
        c3213b.getClass();
        RunnableC7346q runnableC7346q = new RunnableC7346q(c3213b, System.currentTimeMillis(), exc, threadCurrentThread);
        C7332f c7332f = c3213b.f16209e;
        c7332f.getClass();
        c7332f.m14749a(new CallableC7334g(runnableC7346q));
    }
}
