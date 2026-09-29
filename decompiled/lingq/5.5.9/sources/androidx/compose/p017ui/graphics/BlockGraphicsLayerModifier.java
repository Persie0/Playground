package androidx.compose.p017ui.graphics;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.InterfaceC0544c;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends InterfaceC0500b.c implements InterfaceC0544c {

    /* JADX INFO: renamed from: k */
    public InterfaceC2052l<? super InterfaceC9172x, C9072e> f3410k;

    public BlockGraphicsLayerModifier(InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "layerBlock");
        this.f3410k = interfaceC2052l;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1943e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(j10);
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g.a.m2061g(aVar2, abstractC0526gMo2048w, 0, 0, this.f3410k, 4);
                return C9072e.f47360a;
            }
        });
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3410k + ')';
    }
}
