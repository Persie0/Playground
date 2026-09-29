package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class lq2 {

    /* JADX INFO: renamed from: a */
    public int f49997a;

    /* JADX INFO: renamed from: b */
    public final Object f49998b;

    /* JADX INFO: renamed from: c */
    public final Object f49999c;

    public lq2(y28 y28Var) {
        this.f49997a = Integer.MIN_VALUE;
        this.f49999c = new Rect();
        this.f49998b = y28Var;
    }

    /* JADX INFO: renamed from: b */
    public static lq2 m16443b(y28 y28Var, int i) {
        if (i == 0) {
            return new vz6(y28Var);
        }
        if (i == 1) {
            return new wz6(y28Var);
        }
        C3386nv.m17626m("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16444a(bk8 bk8Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo16445c(bk8 bk8Var);

    /* JADX INFO: renamed from: d */
    public abstract int mo16446d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo16447e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo16448f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo16449g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo16450h();

    /* JADX INFO: renamed from: i */
    public abstract int mo16451i();

    /* JADX INFO: renamed from: j */
    public abstract int mo16452j();

    /* JADX INFO: renamed from: k */
    public abstract int mo16453k();

    /* JADX INFO: renamed from: l */
    public abstract int mo16454l();

    /* JADX INFO: renamed from: m */
    public abstract int mo16455m();

    /* JADX INFO: renamed from: n */
    public abstract int mo16456n();

    /* JADX INFO: renamed from: o */
    public abstract int mo16457o(View view);

    /* JADX INFO: renamed from: p */
    public abstract int mo16458p(View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo16459q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo16460r(bk8 bk8Var);

    /* JADX INFO: renamed from: s */
    public abstract void mo16461s(bk8 bk8Var);

    /* JADX INFO: renamed from: t */
    public abstract void mo16462t(bk8 bk8Var);

    /* JADX INFO: renamed from: u */
    public abstract void mo16463u(bk8 bk8Var);

    /* JADX INFO: renamed from: v */
    public abstract mc0 mo16464v(bk8 bk8Var);

    public lq2(String str, int i, String str2) {
        this.f49997a = i;
        this.f49998b = str;
        this.f49999c = str2;
    }

    public lq2(oq2 oq2Var) {
        this.f49997a = 0;
        this.f49999c = new k62();
        this.f49998b = oq2Var;
    }
}
