package p000;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.GradientBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwo implements gwq {

    /* JADX INFO: renamed from: a */
    private final int f26606a;

    /* JADX INFO: renamed from: b */
    private final int f26607b;

    /* JADX INFO: renamed from: c */
    private final int f26608c;

    /* JADX INFO: renamed from: d */
    private final int f26609d;

    /* JADX INFO: renamed from: e */
    private final int f26610e;

    /* JADX INFO: renamed from: f */
    private final int f26611f;

    /* JADX INFO: renamed from: g */
    private final int f26612g;

    /* JADX INFO: renamed from: h */
    private final int f26613h;

    /* JADX INFO: renamed from: i */
    private final int f26614i;

    /* JADX INFO: renamed from: j */
    private final int f26615j;

    /* JADX INFO: renamed from: k */
    private final ila f26616k;

    /* JADX INFO: renamed from: l */
    private final ila f26617l;

    /* JADX INFO: renamed from: m */
    private final ila f26618m;

    /* JADX INFO: renamed from: n */
    private final ila f26619n;

    /* JADX INFO: renamed from: o */
    private final View f26620o;

    /* JADX INFO: renamed from: p */
    private final GradientBar f26621p;

    /* JADX INFO: renamed from: q */
    private final GradientDrawable f26622q;

    public gwo(BottomBarController bottomBarController, icx icxVar, GradientBar gradientBar, djm djmVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        jvd.m13538a();
        View view = (View) ((jfs) djmVar.f11789c).m13100f(C0100R.id.activity_root_view);
        this.f26620o = view;
        Resources resources = view.getResources();
        if (dhvVar.mo6184l(dib.f11245aE)) {
            this.f26606a = acp.m212d(((Integer) dhvVar.mo6173a(dib.f11367i).get()).intValue(), 255);
        } else {
            this.f26606a = acp.m212d(((Integer) dhvVar.mo6173a(dib.f11366h).get()).intValue(), 255);
            acp.m212d(((Integer) dhvVar.mo6173a(dib.f11366h).get()).intValue(), 204);
        }
        this.f26607b = resources.getColor(C0100R.color.main_layout_background_color, null);
        this.f26608c = resources.getColor(C0100R.color.selfie_flash_warmer_color, null);
        this.f26609d = kxk.m15024q(view, C0100R.attr.colorSecondary);
        this.f26611f = kxk.m15024q(view, C0100R.attr.colorOnSecondary);
        this.f26613h = kxk.m15024q(view, C0100R.attr.colorOnSurface);
        this.f26610e = resources.getColor(C0100R.color.mode_chip_selfieflash_color, null);
        this.f26612g = resources.getColor(C0100R.color.mode_chip_text_selfieflash_color_selected, null);
        this.f26614i = resources.getColor(C0100R.color.mode_chip_text_selfieflash_color_unselected, null);
        this.f26622q = (GradientDrawable) gradientBar.getBackground();
        this.f26616k = new ici(gradientBar, 3);
        this.f26617l = icxVar.mo11078a();
        this.f26618m = icxVar.mo11079c();
        this.f26619n = icxVar.mo11080d();
        this.f26621p = gradientBar;
        this.f26615j = bottomBarController.getBottomBarAreaPixels();
    }

    /* JADX INFO: renamed from: f */
    private final int m9858f(boolean z) {
        return z ? this.f26608c : this.f26606a;
    }

    @Override // p000.gwq
    /* JADX INFO: renamed from: a */
    public final int mo9859a() {
        return this.f26615j;
    }

    @Override // p000.gwq
    /* JADX INFO: renamed from: b */
    public final Animator mo9860b(boolean z) {
        int iM9858f = m9858f(z);
        ikz ikzVarM11416b = ikz.m11416b(333, new akf());
        ikzVarM11416b.m11419d(this.f26620o, "backgroundColor", iM9858f, this.f26607b);
        ikzVarM11416b.m11419d(this.f26617l, "color", this.f26610e, this.f26609d);
        ikzVarM11416b.m11419d(this.f26618m, "color", this.f26612g, this.f26611f);
        ikzVarM11416b.m11419d(this.f26619n, "color", this.f26614i, this.f26613h);
        return ikzVarM11416b.m11417a();
    }

    @Override // p000.gwq
    /* JADX INFO: renamed from: c */
    public final Animator mo9861c(boolean z) {
        int iM9858f = m9858f(z);
        ikz ikzVarM11416b = ikz.m11416b(1000, new akf());
        ikzVarM11416b.m11419d(this.f26620o, "backgroundColor", this.f26607b, iM9858f);
        ikzVarM11416b.m11419d(this.f26617l, "color", this.f26609d, this.f26610e);
        ikzVarM11416b.m11419d(this.f26618m, "color", this.f26611f, this.f26612g);
        ikzVarM11416b.m11419d(this.f26619n, "color", this.f26613h, this.f26614i);
        return ikzVarM11416b.m11417a();
    }

    @Override // p000.gwq
    /* JADX INFO: renamed from: d */
    public final void mo9862d() {
        this.f26617l.setColor(this.f26609d);
        this.f26618m.setColor(this.f26611f);
        this.f26619n.setColor(this.f26613h);
        this.f26620o.setBackgroundColor(this.f26607b);
        this.f26621p.setBackground(this.f26622q);
    }

    @Override // p000.gwq
    /* JADX INFO: renamed from: e */
    public final void mo9863e(boolean z) {
        int iM9858f = m9858f(z);
        this.f26617l.setColor(this.f26610e);
        this.f26618m.setColor(this.f26612g);
        this.f26619n.setColor(this.f26614i);
        this.f26620o.setBackgroundColor(iM9858f);
        ((GradientBar) ((ici) this.f26616k).f30333a).setBackgroundColor(0);
    }
}
