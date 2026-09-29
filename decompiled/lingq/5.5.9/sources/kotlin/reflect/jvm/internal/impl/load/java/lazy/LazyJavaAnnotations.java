package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import cm.InterfaceC2052l;
import cn.C2064a;
import co.InterfaceC2072d;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5824d;
import java.util.Iterator;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.sequences.C7073a;
import mn.C7646c;
import mn.C7648e;
import p016an.C0128b;
import p249lo.C7412e;
import p249lo.C7423p;
import p266n.C7669f;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotations implements InterfaceC9077e {

    /* JADX INFO: renamed from: a */
    public final C7669f f38664a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5824d f38665b;

    /* JADX INFO: renamed from: c */
    public final boolean f38666c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2072d<InterfaceC5820a, InterfaceC9075c> f38667d;

    public LazyJavaAnnotations(C7669f c7669f, InterfaceC5824d interfaceC5824d, boolean z10) {
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(interfaceC5824d, "annotationOwner");
        this.f38664a = c7669f;
        this.f38665b = interfaceC5824d;
        this.f38666c = z10;
        this.f38667d = ((C2064a) c7669f.f42146a).f10495a.mo6222g(new InterfaceC2052l<InterfaceC5820a, InterfaceC9075c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC9075c mo528n(InterfaceC5820a interfaceC5820a) {
                InterfaceC5820a interfaceC5820a2 = interfaceC5820a;
                C5207g.m11111f(interfaceC5820a2, "annotation");
                C7648e c7648e = C0128b.f332a;
                LazyJavaAnnotations lazyJavaAnnotations = this.f38668b;
                return C0128b.m530b(lazyJavaAnnotations.f38664a, interfaceC5820a2, lazyJavaAnnotations.f38666c);
            }
        });
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(C7646c c7646c) {
        InterfaceC9075c interfaceC9075cM529a;
        C5207g.m11111f(c7646c, "fqName");
        InterfaceC5824d interfaceC5824d = this.f38665b;
        InterfaceC5820a interfaceC5820aMo12239h = interfaceC5824d.mo12239h(c7646c);
        if (interfaceC5820aMo12239h == null || (interfaceC9075cM529a = this.f38667d.mo528n(interfaceC5820aMo12239h)) == null) {
            C7648e c7648e = C0128b.f332a;
            interfaceC9075cM529a = C0128b.m529a(c7646c, interfaceC5824d, this.f38664a);
        }
        return interfaceC9075cM529a;
    }

    @Override // sm.InterfaceC9077e
    public final boolean isEmpty() {
        InterfaceC5824d interfaceC5824d = this.f38665b;
        if (!interfaceC5824d.mo12240w().isEmpty()) {
            return false;
        }
        interfaceC5824d.mo12241x();
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        InterfaceC5824d interfaceC5824d = this.f38665b;
        C7423p c7423pM14261V2 = C7073a.m14261V2(C6752c.m13413G(interfaceC5824d.mo12240w()), this.f38667d);
        C7648e c7648e = C0128b.f332a;
        return new C7412e.a(C7073a.m14257R2(C7073a.m14264Y2(c7423pM14261V2, C0128b.m529a(C6797e.a.f38390m, interfaceC5824d, this.f38664a))));
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        return InterfaceC9077e.b.m17281b(this, c7646c);
    }
}
