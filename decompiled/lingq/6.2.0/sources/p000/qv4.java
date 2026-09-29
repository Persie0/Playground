package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qv4 implements pt4 {

    /* JADX INFO: renamed from: a */
    public final C0144d f58245a;

    public qv4(C0144d c0144d) {
        this.f58245a = c0144d;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: a */
    public final int mo11505a() {
        return this.f58245a.m1023g().f36306l;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: b */
    public final int mo11506b() {
        return ((fw4) u91.m22597O0(this.f58245a.m1023g().f36307m)).f39785a;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: c */
    public final int mo11507c() {
        int i;
        C0144d c0144d = this.f58245a;
        int size = 0;
        if (c0144d.m1023g().f36307m.isEmpty()) {
            return 0;
        }
        dw4 dw4VarM1023g = c0144d.m1023g();
        dw4 dw4Var = ew4.f37987a;
        Orientation orientation = dw4VarM1023g.f36315u;
        Orientation orientation2 = Orientation.Vertical;
        long j = dw4VarM1023g.f36308n;
        int i2 = (int) (orientation == orientation2 ? j & 4294967295L : j >> 32);
        dw4 dw4VarM1023g2 = c0144d.m1023g();
        List list = dw4VarM1023g2.f36307m;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                fw4 fw4Var = (fw4) list.get(size);
                i3 += (int) (dw4VarM1023g2.f36315u == Orientation.Vertical ? fw4Var.f39806v & 4294967295L : fw4Var.f39806v >> 32);
                size++;
            }
            size = (i3 / list.size()) + dw4VarM1023g2.f36313s;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: d */
    public final boolean mo11508d() {
        return !this.f58245a.m1023g().f36307m.isEmpty();
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: e */
    public final int mo11509e() {
        return ((sc9) this.f58245a.f2600c.f71351d).m21222h();
    }
}
