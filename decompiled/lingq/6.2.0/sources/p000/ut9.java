package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class ut9 {

    /* JADX INFO: renamed from: a */
    public final C3419on f64340a;

    /* JADX INFO: renamed from: b */
    public final vx9 f64341b;

    /* JADX INFO: renamed from: e */
    public final boolean f64344e;

    /* JADX INFO: renamed from: g */
    public final fb2 f64346g;

    /* JADX INFO: renamed from: h */
    public final wa3 f64347h;

    /* JADX INFO: renamed from: j */
    public w41 f64349j;

    /* JADX INFO: renamed from: k */
    public LayoutDirection f64350k;

    /* JADX INFO: renamed from: c */
    public final int f64342c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public final int f64343d = 1;

    /* JADX INFO: renamed from: f */
    public final int f64345f = 1;

    /* JADX INFO: renamed from: i */
    public final List f64348i = EmptyList.f47638a;

    public ut9(C3419on c3419on, vx9 vx9Var, boolean z, fb2 fb2Var, wa3 wa3Var, int i) {
        this.f64340a = c3419on;
        this.f64341b = vx9Var;
        this.f64344e = z;
        this.f64346g = fb2Var;
        this.f64347h = wa3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m22911a(LayoutDirection layoutDirection) {
        w41 w41Var = this.f64349j;
        if (w41Var == null || layoutDirection != this.f64350k || w41Var.mo13024a()) {
            this.f64350k = layoutDirection;
            w41Var = new w41(this.f64340a, vz1.m23615W(this.f64341b, layoutDirection), this.f64348i, this.f64346g, this.f64347h);
        }
        this.f64349j = w41Var;
    }
}
