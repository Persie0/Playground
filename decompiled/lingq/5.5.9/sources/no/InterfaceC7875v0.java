package no;

import cm.InterfaceC2052l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: no.v0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7875v0 extends CoroutineContext.InterfaceC6757a {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f42975B = 0;

    /* JADX INFO: renamed from: no.v0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC7838i0 m15621a(InterfaceC7875v0 interfaceC7875v0, boolean z10, AbstractC7881y0 abstractC7881y0, int i10) {
            boolean z11 = false;
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return interfaceC7875v0.mo15616G(z10, z11, abstractC7881y0);
        }
    }

    /* JADX INFO: renamed from: no.v0$b */
    public static final class b implements CoroutineContext.InterfaceC6758b<InterfaceC7875v0> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b f42976a = new b();
    }

    /* JADX INFO: renamed from: E */
    Object mo15615E(InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: G */
    InterfaceC7838i0 mo15616G(boolean z10, boolean z11, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l);

    /* JADX INFO: renamed from: Q */
    CancellationException mo15617Q();

    /* JADX INFO: renamed from: a */
    void mo15618a(CancellationException cancellationException);

    /* JADX INFO: renamed from: b */
    boolean mo15547b();

    boolean isCancelled();

    /* JADX INFO: renamed from: q1 */
    InterfaceC7852n mo15619q1(C7883z0 c7883z0);

    /* JADX INFO: renamed from: r1 */
    InterfaceC7838i0 mo15620r1(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l);

    boolean start();
}
