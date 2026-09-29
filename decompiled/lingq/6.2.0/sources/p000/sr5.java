package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.R$attr;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class sr5 {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f61296a;

    /* JADX INFO: renamed from: b */
    public p39 f61297b;

    /* JADX INFO: renamed from: c */
    public zf9 f61298c;

    /* JADX INFO: renamed from: d */
    public C3487q7 f61299d;

    /* JADX INFO: renamed from: e */
    public int f61300e;

    /* JADX INFO: renamed from: f */
    public int f61301f;

    /* JADX INFO: renamed from: g */
    public int f61302g;

    /* JADX INFO: renamed from: h */
    public int f61303h;

    /* JADX INFO: renamed from: i */
    public int f61304i;

    /* JADX INFO: renamed from: j */
    public int f61305j;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f61306k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f61307l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f61308m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f61309n;

    /* JADX INFO: renamed from: o */
    public fs5 f61310o;

    /* JADX INFO: renamed from: s */
    public boolean f61314s;

    /* JADX INFO: renamed from: u */
    public RippleDrawable f61316u;

    /* JADX INFO: renamed from: v */
    public int f61317v;

    /* JADX INFO: renamed from: p */
    public boolean f61311p = false;

    /* JADX INFO: renamed from: q */
    public boolean f61312q = false;

    /* JADX INFO: renamed from: r */
    public boolean f61313r = false;

    /* JADX INFO: renamed from: t */
    public boolean f61315t = true;

    public sr5(MaterialButton materialButton, p39 p39Var) {
        this.f61296a = materialButton;
        this.f61297b = p39Var;
    }

    /* JADX INFO: renamed from: a */
    public final fs5 m21669a(boolean z) {
        RippleDrawable rippleDrawable = this.f61316u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (fs5) ((LayerDrawable) ((InsetDrawable) this.f61316u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m21670b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f61296a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f61300e;
        int i6 = this.f61302g;
        int i7 = this.f61301f;
        int i8 = this.f61303h;
        this.f61300e = i;
        this.f61302g = i2;
        this.f61301f = i3;
        this.f61303h = i4;
        if (!this.f61312q) {
            m21671c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX INFO: renamed from: c */
    public final void m21671c() {
        fs5 fs5Var = new fs5(this.f61297b);
        zf9 zf9Var = this.f61298c;
        if (zf9Var != null) {
            fs5Var.m12074r(zf9Var);
        }
        C3487q7 c3487q7 = this.f61299d;
        if (c3487q7 != null) {
            fs5Var.f39576Z = c3487q7;
        }
        MaterialButton materialButton = this.f61296a;
        Context context = materialButton.getContext();
        fs5Var.m12072p(context);
        fs5Var.setTintList(this.f61307l);
        PorterDuff.Mode mode = this.f61306k;
        if (mode != null) {
            fs5Var.setTintMode(mode);
        }
        float f = this.f61305j;
        ColorStateList colorStateList = this.f61308m;
        fs5Var.m12053A(f);
        fs5Var.m12081y(colorStateList);
        fs5 fs5Var2 = new fs5(this.f61297b);
        zf9 zf9Var2 = this.f61298c;
        if (zf9Var2 != null) {
            fs5Var2.m12074r(zf9Var2);
        }
        fs5Var2.setTint(0);
        float f2 = this.f61305j;
        int iM18142c0 = this.f61311p ? omd.m18142c0(materialButton.getContext(), xwc.m24752Y(materialButton, R$attr.colorSurface)) : 0;
        fs5Var2.m12053A(f2);
        fs5Var2.m12081y(ColorStateList.valueOf(iM18142c0));
        fs5 fs5Var3 = new fs5(this.f61297b);
        this.f61310o = fs5Var3;
        zf9 zf9Var3 = this.f61298c;
        if (zf9Var3 != null) {
            fs5Var3.m12074r(zf9Var3);
        }
        this.f61310o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(do7.m10516C(this.f61309n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fs5Var2, fs5Var}), this.f61300e, this.f61302g, this.f61301f, this.f61303h), this.f61310o);
        this.f61316u = rippleDrawable;
        FocusRingDrawable.m6147f(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f61316u);
        fs5 fs5VarM21669a = m21669a(false);
        if (fs5VarM21669a != null) {
            fs5VarM21669a.m12075s(this.f61317v);
            fs5VarM21669a.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable focusRingDrawableM6145c = FocusRingDrawable.m6145c(materialButton.getBackground());
        if (focusRingDrawableM6145c != null) {
            focusRingDrawableM6145c.f12991h = new WeakReference(fs5VarM21669a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX INFO: renamed from: d */
    public final void m21672d() {
        t49 t49Var;
        fs5 fs5VarM21669a = m21669a(false);
        if (fs5VarM21669a != null) {
            fs5VarM21669a.m12080x(this.f61297b);
            zf9 zf9Var = this.f61298c;
            if (zf9Var != null) {
                fs5VarM21669a.m12074r(zf9Var);
            }
        }
        fs5 fs5VarM21669a2 = m21669a(true);
        if (fs5VarM21669a2 != null) {
            fs5VarM21669a2.m12080x(this.f61297b);
            zf9 zf9Var2 = this.f61298c;
            if (zf9Var2 != null) {
                fs5VarM21669a2.m12074r(zf9Var2);
            }
        }
        RippleDrawable rippleDrawable = this.f61316u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof t49) {
                t49Var = (t49) objFindDrawableByLayerId;
            } else {
                t49Var = null;
            }
        } else {
            t49Var = null;
        }
        if (t49Var != null) {
            boolean z = t49Var instanceof fs5;
            p39 p39Var = this.f61297b;
            if (!z) {
                t49Var.setShapeAppearanceModel(p39Var.mo13920d());
                return;
            }
            fs5 fs5Var = (fs5) t49Var;
            fs5Var.m12080x(p39Var);
            zf9 zf9Var3 = this.f61298c;
            if (zf9Var3 != null) {
                fs5Var.m12074r(zf9Var3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21673e() {
        int iM18142c0 = 0;
        fs5 fs5VarM21669a = m21669a(false);
        fs5 fs5VarM21669a2 = m21669a(true);
        if (fs5VarM21669a != null) {
            float f = this.f61305j;
            ColorStateList colorStateList = this.f61308m;
            fs5VarM21669a.m12053A(f);
            fs5VarM21669a.m12081y(colorStateList);
            if (fs5VarM21669a2 != null) {
                float f2 = this.f61305j;
                if (this.f61311p) {
                    int i = R$attr.colorSurface;
                    MaterialButton materialButton = this.f61296a;
                    iM18142c0 = omd.m18142c0(materialButton.getContext(), xwc.m24752Y(materialButton, i));
                }
                fs5VarM21669a2.m12053A(f2);
                fs5VarM21669a2.m12081y(ColorStateList.valueOf(iM18142c0));
            }
        }
    }
}
