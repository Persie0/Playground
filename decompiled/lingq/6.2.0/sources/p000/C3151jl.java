package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import androidx.compose.p002ui.window.C0459g;
import java.util.List;

/* JADX INFO: renamed from: jl */
/* JADX INFO: loaded from: classes2.dex */
public final class C3151jl extends m80 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45658c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewGroup f45659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151jl(ViewGroup viewGroup, int i) {
        super(1);
        this.f45658c = i;
        this.f45659d = viewGroup;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: i */
    public final f6b mo14070i(f6b f6bVar, List list) {
        int i = this.f45658c;
        ViewGroup viewGroup = this.f45659d;
        switch (i) {
            case 0:
                return ((AbstractC0442b) viewGroup).m1888m(f6bVar);
            default:
                C0459g c0459g = (C0459g) viewGroup;
                if (c0459g.f5295H) {
                    return f6bVar;
                }
                View childAt = c0459g.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0459g.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0459g.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? f6bVar : f6bVar.f38536a.mo4371r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: j */
    public final p33 mo14071j(m5b m5bVar, p33 p33Var) {
        int i = this.f45658c;
        int i2 = 29;
        ViewGroup viewGroup = this.f45659d;
        switch (i) {
            case 0:
                C0353c c0353c = (C0353c) ((AbstractC0442b) viewGroup).f5190U.f4335a0.f46676d;
                if (!c0353c.f4307n0.f34836I) {
                    return p33Var;
                }
                long jM19495C = pvc.m19495C(c0353c.mo1671R(0L));
                int i3 = (int) (jM19495C >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = (int) (jM19495C & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long jMo1687j = bq1.m4054e0(c0353c).mo1687j();
                int i5 = (int) (jMo1687j >> 32);
                int i6 = (int) (jMo1687j & 4294967295L);
                long j = c0353c.f49303c;
                long jM19495C2 = pvc.m19495C(c0353c.mo1671R((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i7 = i5 - ((int) (jM19495C2 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (jM19495C2 & 4294967295L));
                int i9 = i8 >= 0 ? i8 : 0;
                return (i3 == 0 && i4 == 0 && i7 == 0 && i9 == 0) ? p33Var : new p33(i2, AbstractC0442b.m1887l((l64) p33Var.f55513b, i3, i4, i7, i9), AbstractC0442b.m1887l((l64) p33Var.f55514c, i3, i4, i7, i9));
            default:
                C0459g c0459g = (C0459g) viewGroup;
                if (c0459g.f5295H) {
                    return p33Var;
                }
                View childAt = c0459g.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0459g.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0459g.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return p33Var;
                }
                l64 l64VarM15830c = l64.m15830c(iMax, iMax2, iMax3, iMax4);
                int i10 = l64VarM15830c.f49116a;
                l64 l64Var = (l64) p33Var.f55513b;
                int i11 = l64VarM15830c.f49117b;
                int i12 = l64VarM15830c.f49118c;
                int i13 = l64VarM15830c.f49119d;
                return new p33(i2, f6b.m11569e(l64Var, i10, i11, i12, i13), f6b.m11569e((l64) p33Var.f55514c, i10, i11, i12, i13));
        }
    }
}
