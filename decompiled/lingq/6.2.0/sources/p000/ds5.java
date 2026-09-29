package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class ds5 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public p39 f36160a;

    /* JADX INFO: renamed from: b */
    public bp2 f36161b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f36162c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f36163d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f36164e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f36165f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f36166g;

    /* JADX INFO: renamed from: h */
    public Rect f36167h;

    /* JADX INFO: renamed from: i */
    public final float f36168i;

    /* JADX INFO: renamed from: j */
    public float f36169j;

    /* JADX INFO: renamed from: k */
    public float f36170k;

    /* JADX INFO: renamed from: l */
    public int f36171l;

    /* JADX INFO: renamed from: m */
    public float f36172m;

    /* JADX INFO: renamed from: n */
    public float f36173n;

    /* JADX INFO: renamed from: o */
    public int f36174o;

    /* JADX INFO: renamed from: p */
    public int f36175p;

    /* JADX INFO: renamed from: q */
    public int f36176q;

    /* JADX INFO: renamed from: r */
    public final Paint.Style f36177r;

    public ds5(ds5 ds5Var) {
        this.f36162c = null;
        this.f36163d = null;
        this.f36164e = null;
        this.f36165f = null;
        this.f36166g = PorterDuff.Mode.SRC_IN;
        this.f36167h = null;
        this.f36168i = 1.0f;
        this.f36169j = 1.0f;
        this.f36171l = 255;
        this.f36172m = 0.0f;
        this.f36173n = 0.0f;
        this.f36174o = 0;
        this.f36175p = 0;
        this.f36176q = 0;
        this.f36177r = Paint.Style.FILL_AND_STROKE;
        this.f36160a = ds5Var.f36160a;
        this.f36161b = ds5Var.f36161b;
        this.f36170k = ds5Var.f36170k;
        this.f36162c = ds5Var.f36162c;
        this.f36163d = ds5Var.f36163d;
        this.f36166g = ds5Var.f36166g;
        this.f36165f = ds5Var.f36165f;
        this.f36171l = ds5Var.f36171l;
        this.f36168i = ds5Var.f36168i;
        this.f36176q = ds5Var.f36176q;
        this.f36174o = ds5Var.f36174o;
        this.f36169j = ds5Var.f36169j;
        this.f36172m = ds5Var.f36172m;
        this.f36173n = ds5Var.f36173n;
        this.f36175p = ds5Var.f36175p;
        this.f36164e = ds5Var.f36164e;
        this.f36177r = ds5Var.f36177r;
        if (ds5Var.f36167h != null) {
            this.f36167h = new Rect(ds5Var.f36167h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fs5 fs5Var = new fs5(this);
        fs5Var.f39582f = true;
        fs5Var.f39583g = true;
        return fs5Var;
    }

    public ds5(p39 p39Var) {
        this.f36162c = null;
        this.f36163d = null;
        this.f36164e = null;
        this.f36165f = null;
        this.f36166g = PorterDuff.Mode.SRC_IN;
        this.f36167h = null;
        this.f36168i = 1.0f;
        this.f36169j = 1.0f;
        this.f36171l = 255;
        this.f36172m = 0.0f;
        this.f36173n = 0.0f;
        this.f36174o = 0;
        this.f36175p = 0;
        this.f36176q = 0;
        this.f36177r = Paint.Style.FILL_AND_STROKE;
        this.f36160a = p39Var;
        this.f36161b = null;
    }
}
