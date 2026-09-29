package p000;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.R$id;
import androidx.compose.runtime.AbstractC0278f;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l6b {

    /* JADX INFO: renamed from: w */
    public static final WeakHashMap f49204w = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C3578sl f49205a;

    /* JADX INFO: renamed from: b */
    public final C3578sl f49206b;

    /* JADX INFO: renamed from: c */
    public final C3578sl f49207c;

    /* JADX INFO: renamed from: d */
    public final C3578sl f49208d;

    /* JADX INFO: renamed from: e */
    public final C3578sl f49209e;

    /* JADX INFO: renamed from: f */
    public final C3578sl f49210f;

    /* JADX INFO: renamed from: g */
    public final C3578sl f49211g;

    /* JADX INFO: renamed from: h */
    public final C3578sl f49212h;

    /* JADX INFO: renamed from: i */
    public final C3578sl f49213i;

    /* JADX INFO: renamed from: j */
    public final boa f49214j;

    /* JADX INFO: renamed from: k */
    public final t66 f49215k;

    /* JADX INFO: renamed from: l */
    public final ufa f49216l;

    /* JADX INFO: renamed from: m */
    public final boa f49217m;

    /* JADX INFO: renamed from: n */
    public final boa f49218n;

    /* JADX INFO: renamed from: o */
    public final boa f49219o;

    /* JADX INFO: renamed from: p */
    public final boa f49220p;

    /* JADX INFO: renamed from: q */
    public final boa f49221q;

    /* JADX INFO: renamed from: r */
    public final boa f49222r;

    /* JADX INFO: renamed from: s */
    public final boa f49223s;

    /* JADX INFO: renamed from: t */
    public final boolean f49224t;

    /* JADX INFO: renamed from: u */
    public int f49225u;

    /* JADX INFO: renamed from: v */
    public final q64 f49226v;

    public l6b(View view) {
        C3578sl c3578slM13393l = ho5.m13393l(4, "captionBar");
        this.f49205a = c3578slM13393l;
        C3578sl c3578slM13393l2 = ho5.m13393l(128, "displayCutout");
        this.f49206b = c3578slM13393l2;
        C3578sl c3578slM13393l3 = ho5.m13393l(8, "ime");
        this.f49207c = c3578slM13393l3;
        C3578sl c3578slM13393l4 = ho5.m13393l(32, "mandatorySystemGestures");
        this.f49208d = c3578slM13393l4;
        C3578sl c3578slM13393l5 = ho5.m13393l(2, "navigationBars");
        this.f49209e = c3578slM13393l5;
        C3578sl c3578slM13393l6 = ho5.m13393l(1, "statusBars");
        this.f49210f = c3578slM13393l6;
        C3578sl c3578slM13393l7 = ho5.m13393l(519, "systemBars");
        this.f49211g = c3578slM13393l7;
        C3578sl c3578slM13393l8 = ho5.m13393l(16, "systemGestures");
        this.f49212h = c3578slM13393l8;
        C3578sl c3578slM13393l9 = ho5.m13393l(64, "tappableElement");
        this.f49213i = c3578slM13393l9;
        boa boaVar = new boa(new v64(0, 0, 0, 0), "waterfall");
        this.f49214j = boaVar;
        this.f49215k = AbstractC0278f.m1260j(null);
        ufa ufaVar = new ufa(new ufa(c3578slM13393l7, c3578slM13393l3), c3578slM13393l2);
        this.f49216l = ufaVar;
        new ufa(ufaVar, new ufa(new ufa(new ufa(c3578slM13393l9, c3578slM13393l4), c3578slM13393l8), boaVar));
        this.f49217m = ho5.m13395n(4, "captionBarIgnoringVisibility");
        this.f49218n = ho5.m13395n(2, "navigationBarsIgnoringVisibility");
        this.f49219o = ho5.m13395n(1, "statusBarsIgnoringVisibility");
        this.f49220p = ho5.m13395n(519, "systemBarsIgnoringVisibility");
        this.f49221q = ho5.m13395n(64, "tappableElementIgnoringVisibility");
        this.f49222r = new boa(new v64(0, 0, 0, 0), "imeAnimationTarget");
        this.f49223s = new boa(new v64(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R$id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f49224t = bool != null ? bool.booleanValue() : false;
        this.f49226v = new q64(this);
        WeakHashMap weakHashMap = dta.f36217a;
        f6b f6bVarM24661a = xsa.m24661a(view);
        if (f6bVarM24661a != null) {
            c6b c6bVar = f6bVarM24661a.f38536a;
            c3578slM13393l.m21442f(c6bVar.mo139u(4));
            c3578slM13393l2.m21442f(c6bVar.mo139u(128));
            c3578slM13393l3.m21442f(c6bVar.mo139u(8));
            c3578slM13393l4.m21442f(c6bVar.mo139u(32));
            c3578slM13393l5.m21442f(c6bVar.mo139u(2));
            c3578slM13393l6.m21442f(c6bVar.mo139u(1));
            c3578slM13393l7.m21442f(c6bVar.mo139u(519));
            c3578slM13393l8.m21442f(c6bVar.mo139u(16));
            c3578slM13393l9.m21442f(c6bVar.mo139u(64));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15908b(l6b l6bVar, f6b f6bVar) {
        boolean z = false;
        l6bVar.f49205a.m21443g(f6bVar, 0);
        l6bVar.f49207c.m21443g(f6bVar, 0);
        l6bVar.f49206b.m21443g(f6bVar, 0);
        l6bVar.f49209e.m21443g(f6bVar, 0);
        l6bVar.f49210f.m21443g(f6bVar, 0);
        l6bVar.f49211g.m21443g(f6bVar, 0);
        l6bVar.f49212h.m21443g(f6bVar, 0);
        l6bVar.f49213i.m21443g(f6bVar, 0);
        l6bVar.f49208d.m21443g(f6bVar, 0);
        l6bVar.f49217m.m4004f(nda.m17384h(f6bVar.f38536a.mo137j(4)));
        l6bVar.f49218n.m4004f(nda.m17384h(f6bVar.f38536a.mo137j(2)));
        l6bVar.f49219o.m4004f(nda.m17384h(f6bVar.f38536a.mo137j(1)));
        l6bVar.f49220p.m4004f(nda.m17384h(f6bVar.f38536a.mo137j(519)));
        l6bVar.f49221q.m4004f(nda.m17384h(f6bVar.f38536a.mo137j(64)));
        rh2 rh2VarMo4365h = f6bVar.f38536a.mo4365h();
        l6bVar.f49214j.m4004f(nda.m17384h(rh2VarMo4365h != null ? rh2VarMo4365h.m20660a() : l64.f49115e));
        C3500qj c3500qj = null;
        if (rh2VarMo4365h != null) {
            Path pathM2938d = Build.VERSION.SDK_INT >= 31 ? AbstractC0780ao.m2938d(rh2VarMo4365h.f59262a) : null;
            if (pathM2938d != null) {
                c3500qj = new C3500qj(pathM2938d);
            }
        }
        ((xc9) l6bVar.f49215k).setValue(c3500qj);
        synchronized (nc9.f52602c) {
            o66 o66Var = nc9.f52609j.f60422h;
            if (o66Var != null && o66Var.m725c()) {
                z = true;
            }
        }
        if (z) {
            nc9.m17349a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15909a(View view) {
        if (this.f49225u == 0) {
            q64 q64Var = this.f49226v;
            q64Var.f57319d = false;
            q64Var.f57320e = false;
            q64Var.f57321f = null;
            WeakHashMap weakHashMap = dta.f36217a;
            wsa.m24145c(view, q64Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(q64Var);
            dta.m10642m(view, q64Var);
        }
        this.f49225u++;
    }
}
