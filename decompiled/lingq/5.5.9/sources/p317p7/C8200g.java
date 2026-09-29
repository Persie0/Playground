package p317p7;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.PersistedEvents;
import dm.C5207g;
import java.util.HashMap;
import p173i8.C6205a;
import p387t0.C9166r;
import p476x7.C10106e;

/* JADX INFO: renamed from: p7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8200g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f44392a = 0;

    static {
        new C8200g();
    }

    /* JADX INFO: renamed from: a */
    public static final synchronized void m16327a(AccessTokenAppIdPair accessTokenAppIdPair, C8205l c8205l) {
        try {
            if (C6205a.m12742b(C8200g.class)) {
                return;
            }
            try {
                int i10 = C10106e.f51261a;
                PersistedEvents persistedEventsM16319a = C8196c.m16319a();
                persistedEventsM16319a.m6642a(accessTokenAppIdPair, c8205l.m16344c());
                C8196c.m16320b(persistedEventsM16319a);
            } catch (Throwable th2) {
                C6205a.m12741a(C8200g.class, th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public static final synchronized void m16328b(C9166r c9166r) {
        C8205l c8205l;
        try {
            if (C6205a.m12742b(C8200g.class)) {
                return;
            }
            try {
                C5207g.m11111f(c9166r, "eventsToPersist");
                int i10 = C10106e.f51261a;
                PersistedEvents persistedEventsM16319a = C8196c.m16319a();
                for (AccessTokenAppIdPair accessTokenAppIdPair : c9166r.m17490u()) {
                    synchronized (c9166r) {
                        try {
                            C5207g.m11111f(accessTokenAppIdPair, "accessTokenAppIdPair");
                            c8205l = (C8205l) ((HashMap) c9166r.f47694a).get(accessTokenAppIdPair);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (c8205l == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    persistedEventsM16319a.m6642a(accessTokenAppIdPair, c8205l.m16344c());
                }
                C8196c.m16320b(persistedEventsM16319a);
            } catch (Throwable th3) {
                C6205a.m12741a(C8200g.class, th3);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
