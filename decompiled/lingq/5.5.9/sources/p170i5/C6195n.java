package p170i5;

import android.content.Context;
import cl.C2040a;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.Reason;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p041c5.C1702c;
import p257m5.C7480b;
import p489xk.C10221i;
import sl.C9072e;

/* JADX INFO: renamed from: i5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6195n {

    /* JADX INFO: renamed from: a */
    public final Object f36056a;

    /* JADX INFO: renamed from: b */
    public final Object f36057b;

    /* JADX INFO: renamed from: c */
    public final Object f36058c;

    /* JADX INFO: renamed from: d */
    public final Object f36059d;

    public C6195n(Context context, C7480b c7480b) {
        C5207g.m11111f(context, "context");
        Context applicationContext = context.getApplicationContext();
        C5207g.m11110e(applicationContext, "context.applicationContext");
        C6182a c6182a = new C6182a(applicationContext, c7480b, 0);
        Context applicationContext2 = context.getApplicationContext();
        C5207g.m11110e(applicationContext2, "context.applicationContext");
        C6184c c6184c = new C6184c(applicationContext2, c7480b);
        Context applicationContext3 = context.getApplicationContext();
        C5207g.m11110e(applicationContext3, "context.applicationContext");
        String str = C6193l.f36054a;
        C6192k c6192k = new C6192k(applicationContext3, c7480b);
        Context applicationContext4 = context.getApplicationContext();
        C5207g.m11110e(applicationContext4, "context.applicationContext");
        C6182a c6182a2 = new C6182a(applicationContext4, c7480b, 1);
        this.f36056a = c6182a;
        this.f36059d = c6184c;
        this.f36057b = c6192k;
        this.f36058c = c6182a2;
    }

    public C6195n(String str, C1702c c1702c) {
        C5207g.m11112g(str, "namespace");
        this.f36058c = str;
        this.f36059d = c1702c;
        this.f36056a = new Object();
        this.f36057b = new LinkedHashMap();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12711a() {
        synchronized (this.f36056a) {
            try {
                Iterator it = ((Map) this.f36057b).entrySet().iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            C9072e c9072e = C9072e.f47360a;
                        } else if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C2040a m12712b(int i10, Reason reason) {
        C2040a c2040a;
        C5207g.m11112g(reason, "reason");
        synchronized (this.f36056a) {
            try {
                WeakReference weakReference = (WeakReference) ((Map) this.f36057b).get(Integer.valueOf(i10));
                c2040a = weakReference != null ? (C2040a) weakReference.get() : null;
                if (c2040a == null) {
                    c2040a = new C2040a((String) this.f36058c);
                    c2040a.m6210a(((C10221i) ((C1702c) this.f36059d).f9487a).mo10613K0(i10), null, reason);
                    ((Map) this.f36057b).put(Integer.valueOf(i10), new WeakReference(c2040a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2040a;
    }

    /* JADX INFO: renamed from: c */
    public final C2040a m12713c(int i10, Download download, Reason reason) {
        C2040a c2040aM12712b;
        C5207g.m11112g(download, "download");
        C5207g.m11112g(reason, "reason");
        synchronized (this.f36056a) {
            c2040aM12712b = m12712b(i10, reason);
            c2040aM12712b.m6210a(((C1702c) this.f36059d).m5440g(i10, download), download, reason);
        }
        return c2040aM12712b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m12714d(int i10, Download download, Reason reason) {
        C5207g.m11112g(download, "download");
        C5207g.m11112g(reason, "reason");
        synchronized (this.f36056a) {
            try {
                WeakReference weakReference = (WeakReference) ((Map) this.f36057b).get(Integer.valueOf(i10));
                C2040a c2040a = weakReference != null ? (C2040a) weakReference.get() : null;
                if (c2040a != null) {
                    c2040a.m6210a(((C1702c) this.f36059d).m5440g(i10, download), download, reason);
                    C9072e c9072e = C9072e.f47360a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
