package androidx.compose.foundation.layout;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p470x1.C10013a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SpacerMeasurePolicy implements InterfaceC5652p {

    /* JADX INFO: renamed from: a */
    public static final SpacerMeasurePolicy f2415a = new SpacerMeasurePolicy();

    @Override // p127g1.InterfaceC5652p
    /* JADX INFO: renamed from: a */
    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        return interfaceC0524e.m2043P(C10013a.m18601f(j10) ? C10013a.m18603h(j10) : 0, C10013a.m18600e(j10) ? C10013a.m18602g(j10) : 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.SpacerMeasurePolicy$measure$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                C5207g.m11111f(aVar, "$this$layout");
                return C9072e.f47360a;
            }
        });
    }
}
