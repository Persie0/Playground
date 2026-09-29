package p443w;

import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.foundation.layout.SizeMode;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2059s;
import dm.C5207g;
import java.util.List;
import p127g1.InterfaceC5651o;
import p338qd.C8584v;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: renamed from: w.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9784o {

    /* JADX INFO: renamed from: a */
    public final LayoutOrientation f49876a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2059s<Integer, int[], LayoutDirection, InterfaceC10015c, int[], C9072e> f49877b;

    /* JADX INFO: renamed from: c */
    public final SizeMode f49878c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9773d f49879d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC5651o> f49880e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0526g[] f49881f;

    /* JADX INFO: renamed from: g */
    public final C9785p[] f49882g;

    public C9784o(LayoutOrientation layoutOrientation, InterfaceC2059s interfaceC2059s, float f3, SizeMode sizeMode, AbstractC9773d abstractC9773d, List list, AbstractC0526g[] abstractC0526gArr) {
        this.f49876a = layoutOrientation;
        this.f49877b = interfaceC2059s;
        this.f49878c = sizeMode;
        this.f49879d = abstractC9773d;
        this.f49880e = list;
        this.f49881f = abstractC0526gArr;
        int size = list.size();
        C9785p[] c9785pArr = new C9785p[size];
        for (int i10 = 0; i10 < size; i10++) {
            c9785pArr[i10] = C8584v.m16795t(this.f49880e.get(i10));
        }
        this.f49882g = c9785pArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m18280a(AbstractC0526g abstractC0526g) {
        return this.f49876a == LayoutOrientation.Horizontal ? abstractC0526g.f3687b : abstractC0526g.f3686a;
    }

    /* JADX INFO: renamed from: b */
    public final int m18281b(AbstractC0526g abstractC0526g) {
        C5207g.m11111f(abstractC0526g, "<this>");
        return this.f49876a == LayoutOrientation.Horizontal ? abstractC0526g.f3686a : abstractC0526g.f3687b;
    }
}
