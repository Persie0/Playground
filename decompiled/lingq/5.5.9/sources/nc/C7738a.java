package nc;

import ae.C0062b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import gd.C5768g;
import gd.C5772k;
import gd.InterfaceC5776o;
import java.util.WeakHashMap;
import p093ed.C5397a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: nc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7738a {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f42339a;

    /* JADX INFO: renamed from: b */
    public C5772k f42340b;

    /* JADX INFO: renamed from: c */
    public int f42341c;

    /* JADX INFO: renamed from: d */
    public int f42342d;

    /* JADX INFO: renamed from: e */
    public int f42343e;

    /* JADX INFO: renamed from: f */
    public int f42344f;

    /* JADX INFO: renamed from: g */
    public int f42345g;

    /* JADX INFO: renamed from: h */
    public int f42346h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f42347i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f42348j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f42349k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f42350l;

    /* JADX INFO: renamed from: m */
    public C5768g f42351m;

    /* JADX INFO: renamed from: q */
    public boolean f42355q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f42357s;

    /* JADX INFO: renamed from: t */
    public int f42358t;

    /* JADX INFO: renamed from: n */
    public boolean f42352n = false;

    /* JADX INFO: renamed from: o */
    public boolean f42353o = false;

    /* JADX INFO: renamed from: p */
    public boolean f42354p = false;

    /* JADX INFO: renamed from: r */
    public boolean f42356r = true;

    public C7738a(MaterialButton materialButton, C5772k c5772k) {
        this.f42339a = materialButton;
        this.f42340b = c5772k;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC5776o m15327a() {
        RippleDrawable rippleDrawable = this.f42357s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f42357s.getNumberOfLayers() > 2 ? (InterfaceC5776o) this.f42357s.getDrawable(2) : (InterfaceC5776o) this.f42357s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C5768g m15328b(boolean z10) {
        RippleDrawable rippleDrawable = this.f42357s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C5768g) ((LayerDrawable) ((InsetDrawable) this.f42357s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m15329c(C5772k c5772k) {
        this.f42340b = c5772k;
        if (m15328b(false) != null) {
            m15328b(false).setShapeAppearanceModel(c5772k);
        }
        if (m15328b(true) != null) {
            m15328b(true).setShapeAppearanceModel(c5772k);
        }
        if (m15327a() != null) {
            m15327a().setShapeAppearanceModel(c5772k);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15330d(int i10, int i11) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        MaterialButton materialButton = this.f42339a;
        int iM18688f = C10029b0.e.m18688f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iM18687e = C10029b0.e.m18687e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f42343e;
        int i13 = this.f42344f;
        this.f42344f = i11;
        this.f42343e = i10;
        if (!this.f42353o) {
            m15331e();
        }
        C10029b0.e.m18693k(materialButton, iM18688f, (paddingTop + i10) - i12, iM18687e, (paddingBottom + i11) - i13);
    }

    /* JADX INFO: renamed from: e */
    public final void m15331e() {
        C5768g c5768g = new C5768g(this.f42340b);
        MaterialButton materialButton = this.f42339a;
        c5768g.m12138j(materialButton.getContext());
        C8488a.b.m16570h(c5768g, this.f42348j);
        PorterDuff.Mode mode = this.f42347i;
        if (mode != null) {
            C8488a.b.m16571i(c5768g, mode);
        }
        float f3 = this.f42346h;
        ColorStateList colorStateList = this.f42349k;
        c5768g.f34857a.f34880k = f3;
        c5768g.invalidateSelf();
        c5768g.m12145q(colorStateList);
        C5768g c5768g2 = new C5768g(this.f42340b);
        c5768g2.setTint(0);
        float f10 = this.f42346h;
        int iM340d1 = this.f42352n ? C0062b.m340d1(materialButton, R.attr.colorSurface) : 0;
        c5768g2.f34857a.f34880k = f10;
        c5768g2.invalidateSelf();
        c5768g2.m12145q(ColorStateList.valueOf(iM340d1));
        C5768g c5768g3 = new C5768g(this.f42340b);
        this.f42351m = c5768g3;
        C8488a.b.m16569g(c5768g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C5397a.m11561c(this.f42350l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c5768g2, c5768g}), this.f42341c, this.f42343e, this.f42342d, this.f42344f), this.f42351m);
        this.f42357s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C5768g c5768gM15328b = m15328b(false);
        if (c5768gM15328b != null) {
            c5768gM15328b.m12140l(this.f42358t);
            c5768gM15328b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15332f() {
        C5768g c5768gM15328b = m15328b(false);
        C5768g c5768gM15328b2 = m15328b(true);
        if (c5768gM15328b != null) {
            float f3 = this.f42346h;
            ColorStateList colorStateList = this.f42349k;
            c5768gM15328b.f34857a.f34880k = f3;
            c5768gM15328b.invalidateSelf();
            c5768gM15328b.m12145q(colorStateList);
            if (c5768gM15328b2 != null) {
                float f10 = this.f42346h;
                int iM340d1 = this.f42352n ? C0062b.m340d1(this.f42339a, R.attr.colorSurface) : 0;
                c5768gM15328b2.f34857a.f34880k = f10;
                c5768gM15328b2.invalidateSelf();
                c5768gM15328b2.m12145q(ColorStateList.valueOf(iM340d1));
            }
        }
    }
}
