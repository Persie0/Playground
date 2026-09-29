package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C0129b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gs4 implements pt4 {

    /* JADX INFO: renamed from: a */
    public final C0129b f41264a;

    public gs4(C0129b c0129b) {
        this.f41264a = c0129b;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: a */
    public final int mo11505a() {
        return this.f41264a.m985g().f61349p;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: b */
    public final int mo11506b() {
        return ((ts4) u91.m22597O0(this.f41264a.m985g().f61346m)).f62798a;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: c */
    public final int mo11507c() {
        int i;
        C0129b c0129b = this.f41264a;
        int i2 = 0;
        if (c0129b.m985g().f61346m.isEmpty()) {
            return 0;
        }
        ss4 ss4VarM985g = c0129b.m985g();
        Orientation orientation = ss4VarM985g.f61350q;
        Orientation orientation2 = Orientation.Vertical;
        int iM21675g = (int) (orientation == orientation2 ? ss4VarM985g.m21675g() & 4294967295L : ss4VarM985g.m21675g() >> 32);
        ss4 ss4VarM985g2 = c0129b.m985g();
        Orientation orientation3 = ss4VarM985g2.f61350q;
        List list = ss4VarM985g2.f61346m;
        boolean z = orientation3 == orientation2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                ts4 ts4Var = (ts4) list.get(i3);
                int i6 = z ? ts4Var.f62821x : ts4Var.f62822y;
                if (i6 == -1) {
                    i3++;
                } else {
                    int iMax = 0;
                    while (i3 < list.size()) {
                        ts4 ts4Var2 = (ts4) list.get(i3);
                        if ((z ? ts4Var2.f62821x : ts4Var2.f62822y) != i6) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((ts4) list.get(i3)).f62819v & 4294967295L : ((ts4) list.get(i3)).f62819v >> 32));
                        i3++;
                    }
                    i4 += iMax;
                    i5++;
                }
            }
            i2 = (i4 / i5) + ss4VarM985g2.f61352s;
        }
        if (i2 != 0 && (i = iM21675g / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: d */
    public final boolean mo11508d() {
        return !this.f41264a.m985g().f61346m.isEmpty();
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: e */
    public final int mo11509e() {
        return this.f41264a.f2471d.f67245b.m21222h();
    }
}
