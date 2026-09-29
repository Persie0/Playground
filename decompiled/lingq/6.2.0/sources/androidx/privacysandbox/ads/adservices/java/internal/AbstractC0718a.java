package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.C0464b;
import java.util.concurrent.CancellationException;
import p000.gm0;
import p000.hn1;
import p000.r78;
import p000.vi3;
import p000.xfa;
import p000.y92;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0718a {
    /* JADX INFO: renamed from: a */
    public static gm0 m2574a(final y92 y92Var) {
        final C0464b c0464b = new C0464b();
        c0464b.f5330c = new r78();
        gm0 gm0Var = new gm0(c0464b);
        c0464b.f5329b = gm0Var;
        c0464b.f5328a = hn1.class;
        try {
            y92Var.mo4540r(new vi3() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    C0464b c0464b2 = c0464b;
                    if (th == null) {
                        c0464b2.m1908a(y92Var.m15494K());
                    } else if (th instanceof CancellationException) {
                        c0464b2.f5331d = true;
                        gm0 gm0Var2 = c0464b2.f5329b;
                        if (gm0Var2 != null && gm0Var2.f40990b.cancel(true)) {
                            c0464b2.f5328a = null;
                            c0464b2.f5329b = null;
                            c0464b2.f5330c = null;
                        }
                    } else {
                        c0464b2.m1909b(th);
                    }
                    return xfa.f68157a;
                }
            });
            c0464b.f5328a = "Deferred.asListenableFuture";
            return gm0Var;
        } catch (Exception e) {
            gm0Var.f40990b.mo20435l(e);
            return gm0Var;
        }
    }
}
