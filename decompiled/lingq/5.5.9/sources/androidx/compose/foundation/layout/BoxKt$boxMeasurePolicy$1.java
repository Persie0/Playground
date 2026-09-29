package androidx.compose.foundation.layout;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.Ref$IntRef;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p470x1.C10013a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BoxKt$boxMeasurePolicy$1 implements InterfaceC5652p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f2313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7885a f2314b;

    public BoxKt$boxMeasurePolicy$1(C7886b c7886b, boolean z10) {
        this.f2313a = z10;
        this.f2314b = c7886b;
    }

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: a */
    public final InterfaceC5653q mo1328a(final InterfaceC0524e interfaceC0524e, final List<? extends InterfaceC5651o> list, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$MeasurePolicy");
        if (list.isEmpty()) {
            return interfaceC0524e.m2043P(C10013a.m18605j(j10), C10013a.m18604i(j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(AbstractC0526g.a aVar) {
                    C5207g.m11111f(aVar, "$this$layout");
                    return C9072e.f47360a;
                }
            });
        }
        long jM18596a = this.f2313a ? j10 : C10013a.m18596a(j10, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            final InterfaceC5651o interfaceC5651o = list.get(0);
            BoxKt.m1498c(interfaceC5651o);
            final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(jM18596a);
            final int iMax = Math.max(C10013a.m18605j(j10), abstractC0526gMo2048w.f3686a);
            final int iMax2 = Math.max(C10013a.m18604i(j10), abstractC0526gMo2048w.f3687b);
            final InterfaceC7885a interfaceC7885a = this.f2314b;
            return interfaceC0524e.m2043P(iMax, iMax2, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(AbstractC0526g.a aVar) {
                    AbstractC0526g.a aVar2 = aVar;
                    C5207g.m11111f(aVar2, "$this$layout");
                    BoxKt.m1497b(aVar2, abstractC0526gMo2048w, interfaceC5651o, interfaceC0524e.getLayoutDirection(), iMax, iMax2, interfaceC7885a);
                    return C9072e.f47360a;
                }
            });
        }
        final AbstractC0526g[] abstractC0526gArr = new AbstractC0526g[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f38125a = C10013a.m18605j(j10);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f38125a = C10013a.m18604i(j10);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5651o interfaceC5651o2 = list.get(i10);
            BoxKt.m1498c(interfaceC5651o2);
            AbstractC0526g abstractC0526gMo2048w2 = interfaceC5651o2.mo2048w(jM18596a);
            abstractC0526gArr[i10] = abstractC0526gMo2048w2;
            ref$IntRef.f38125a = Math.max(ref$IntRef.f38125a, abstractC0526gMo2048w2.f3686a);
            ref$IntRef2.f38125a = Math.max(ref$IntRef2.f38125a, abstractC0526gMo2048w2.f3687b);
        }
        int i11 = ref$IntRef.f38125a;
        int i12 = ref$IntRef2.f38125a;
        final InterfaceC7885a interfaceC7885a2 = this.f2314b;
        return interfaceC0524e.m2043P(i11, i12, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                InterfaceC7885a interfaceC7885a3 = interfaceC7885a2;
                AbstractC0526g[] abstractC0526gArr2 = abstractC0526gArr;
                int length = abstractC0526gArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i14 < length) {
                    AbstractC0526g abstractC0526g = abstractC0526gArr2[i14];
                    C5207g.m11109d(abstractC0526g, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.m1497b(aVar2, abstractC0526g, list.get(i13), interfaceC0524e.getLayoutDirection(), ref$IntRef.f38125a, ref$IntRef2.f38125a, interfaceC7885a3);
                    i14++;
                    i13++;
                }
                return C9072e.f47360a;
            }
        });
    }
}
