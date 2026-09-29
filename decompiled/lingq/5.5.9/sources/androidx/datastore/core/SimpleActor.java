package androidx.datastore.core;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p325po.C8431g;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7882z f5653a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2056p<T, InterfaceC9968c<? super C9072e>, Object> f5654b;

    /* JADX INFO: renamed from: c */
    public final AbstractChannel f5655c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f5656d;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(InterfaceC7882z interfaceC7882z, final InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l, final InterfaceC2056p<? super T, ? super Throwable, C9072e> interfaceC2056p, InterfaceC2056p<? super T, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p2) {
        C5207g.m11111f(interfaceC7882z, "scope");
        C5207g.m11111f(interfaceC2056p, "onUndeliveredElement");
        this.f5653a = interfaceC7882z;
        this.f5654b = interfaceC2056p2;
        this.f5655c = C8573r0.m16738m(Integer.MAX_VALUE, null, 6);
        this.f5656d = new AtomicInteger(0);
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) interfaceC7882z.getF6528b().mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 == null) {
            return;
        }
        interfaceC7875v0.mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                C9072e c9072e;
                Throwable th3 = th2;
                interfaceC2052l.mo528n(th3);
                SimpleActor<T> simpleActor = this;
                simpleActor.f5655c.mo16477h(th3);
                do {
                    Object objMo14336f = simpleActor.f5655c.mo14336f();
                    c9072e = null;
                    if (objMo14336f instanceof C8431g.b) {
                        objMo14336f = null;
                    }
                    if (objMo14336f != null) {
                        interfaceC2056p.mo1337m0((T) objMo14336f, th3);
                        c9072e = C9072e.f47360a;
                    }
                } while (c9072e != null);
                return C9072e.f47360a;
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m3003a(SingleProcessDataStore.AbstractC0790a abstractC0790a) {
        Object objMo16479j = this.f5655c.mo16479j(abstractC0790a);
        boolean z10 = objMo16479j instanceof C8431g.a;
        if (z10) {
            C8431g.a aVar = z10 ? (C8431g.a) objMo16479j : null;
            Throwable th2 = aVar != null ? aVar.f45568a : null;
            if (th2 != null) {
                throw th2;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!(!(objMo16479j instanceof C8431g.b))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f5656d.getAndIncrement() == 0) {
            C7828f.m15570d(this.f5653a, null, null, new SimpleActor$offer$2(this, null), 3);
        }
    }
}
