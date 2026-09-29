package p000;

import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class os4 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final ls4 f54932b;

    /* JADX INFO: renamed from: c */
    public final cu4 f54933c;

    /* JADX INFO: renamed from: d */
    public final int f54934d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cu4 f54935e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0129b f54936f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f54937g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f54938h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f54939i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os4(ls4 ls4Var, cu4 cu4Var, int i, C0129b c0129b, int i2, int i3, long j) {
        super(5);
        this.f54935e = cu4Var;
        this.f54936f = c0129b;
        this.f54937g = i2;
        this.f54938h = i3;
        this.f54939i = j;
        this.f54932b = ls4Var;
        this.f54933c = cu4Var;
        this.f54934d = i;
    }

    /* JADX INFO: renamed from: E */
    public final ts4 m18462E(int i, int i2, int i3, int i4, long j) {
        int iM3802j;
        ls4 ls4Var = this.f54932b;
        Object objMo15747c = ls4Var.mo15747c(i);
        Object objM996c = ls4Var.f50073b.m996c(i);
        List listM21328r = m21328r(this.f54933c, i, j);
        if (bk1.m3799g(j)) {
            iM3802j = bk1.m3803k(j);
        } else {
            if (!bk1.m3798f(j)) {
                l54.m15814a("does not have fixed height");
            }
            iM3802j = bk1.m3802j(j);
        }
        LayoutDirection layoutDirection = this.f54935e.f34541b.getLayoutDirection();
        C0135d c0135d = this.f54936f.f2480m;
        return new ts4(i, objMo15747c, iM3802j, i4, layoutDirection, this.f54937g, this.f54938h, listM21328r, this.f54939i, objM996c, c0135d, j, i2, i3);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: p */
    public final du4 mo12211p(int i, int i2, int i3, long j) {
        return m18462E(i, i2, i3, this.f54934d, j);
    }
}
