package p081e0;

import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7155e;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: e0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5349z implements InterfaceC5338t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> f33651a;

    /* JADX INFO: renamed from: b */
    public final C7155e f33652b;

    /* JADX INFO: renamed from: c */
    public C7848l1 f33653c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5349z(CoroutineContext coroutineContext, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p) {
        C5207g.m11111f(coroutineContext, "parentCoroutineContext");
        C5207g.m11111f(interfaceC2056p, "task");
        this.f33651a = interfaceC2056p;
        this.f33652b = C7499b.m14930b(coroutineContext);
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: a */
    public final void mo1536a() {
        C7848l1 c7848l1 = this.f33653c;
        if (c7848l1 != null) {
            c7848l1.mo15618a(null);
        }
        this.f33653c = null;
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: b */
    public final void mo1537b() {
        C7848l1 c7848l1 = this.f33653c;
        if (c7848l1 != null) {
            c7848l1.mo15618a(null);
        }
        this.f33653c = null;
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
        C7848l1 c7848l1 = this.f33653c;
        if (c7848l1 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c7848l1.mo15618a(cancellationException);
        }
        this.f33653c = C7828f.m15570d(this.f33652b, null, null, this.f33651a, 3);
    }
}
