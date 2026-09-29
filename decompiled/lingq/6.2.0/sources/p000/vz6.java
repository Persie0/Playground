package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class vz6 extends lq2 {
    public vz6(y28 y28Var) {
        super(y28Var);
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: d */
    public final int mo16446d(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        ((y28) this.f49998b).getClass();
        return y28.m24876D(view) + ((ViewGroup.MarginLayoutParams) z28Var).rightMargin;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: e */
    public final int mo16447e(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        ((y28) this.f49998b).getClass();
        return y28.m24875C(view) + ((ViewGroup.MarginLayoutParams) z28Var).leftMargin + ((ViewGroup.MarginLayoutParams) z28Var).rightMargin;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: f */
    public final int mo16448f(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        ((y28) this.f49998b).getClass();
        return y28.m24874B(view) + ((ViewGroup.MarginLayoutParams) z28Var).topMargin + ((ViewGroup.MarginLayoutParams) z28Var).bottomMargin;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: g */
    public final int mo16449g(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        ((y28) this.f49998b).getClass();
        return y28.m24873A(view) - ((ViewGroup.MarginLayoutParams) z28Var).leftMargin;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: h */
    public final int mo16450h() {
        return ((y28) this.f49998b).f69184n;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: i */
    public final int mo16451i() {
        y28 y28Var = (y28) this.f49998b;
        return y28Var.f69184n - y28Var.m24893I();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: j */
    public final int mo16452j() {
        return ((y28) this.f49998b).m24893I();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: k */
    public final int mo16453k() {
        return ((y28) this.f49998b).f69182l;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: l */
    public final int mo16454l() {
        return ((y28) this.f49998b).f69183m;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: m */
    public final int mo16455m() {
        return ((y28) this.f49998b).m24891H();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: n */
    public final int mo16456n() {
        y28 y28Var = (y28) this.f49998b;
        return (y28Var.f69184n - y28Var.m24891H()) - y28Var.m24893I();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: o */
    public final int mo16457o(View view) {
        y28 y28Var = (y28) this.f49998b;
        Rect rect = (Rect) this.f49999c;
        y28Var.m24895N(view, rect);
        return rect.right;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: p */
    public final int mo16458p(View view) {
        y28 y28Var = (y28) this.f49998b;
        Rect rect = (Rect) this.f49999c;
        y28Var.m24895N(view, rect);
        return rect.left;
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: q */
    public final void mo16459q(int i) {
        ((y28) this.f49998b).mo2776S(i);
    }
}
