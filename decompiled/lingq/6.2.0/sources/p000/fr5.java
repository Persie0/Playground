package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class fr5 extends C3829zd {

    /* JADX INFO: renamed from: e */
    public static final int f39520e = R$attr.alertDialogStyle;

    /* JADX INFO: renamed from: f */
    public static final int f39521f = R$style.MaterialAlertDialog_MaterialComponents;

    /* JADX INFO: renamed from: g */
    public static final int f39522g = com.google.android.material.R$attr.materialAlertDialogTheme;

    /* JADX INFO: renamed from: c */
    public final fs5 f39523c;

    /* JADX INFO: renamed from: d */
    public final Rect f39524d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fr5(Context context, int i) {
        Resources.Theme theme = context.getTheme();
        int i2 = f39522g;
        TypedValue typedValueM24748U = xwc.m24748U(theme, i2);
        int i3 = typedValueM24748U == null ? 0 : typedValueM24748U.data;
        int i4 = f39520e;
        int i5 = f39521f;
        Context contextM20141b = qs5.m20141b(context, null, i4, i5);
        contextM20141b = i3 != 0 ? new wl1(contextM20141b, i3) : contextM20141b;
        TypedValue typedValueM24748U2 = xwc.m24748U(context.getTheme(), i2);
        super(contextM20141b, typedValueM24748U2 == null ? 0 : typedValueM24748U2.data);
        Context context2 = getContext();
        Resources.Theme theme2 = context2.getTheme();
        int[] iArr = R$styleable.MaterialAlertDialog;
        dy9.m10748a(context2, null, i4, i5);
        dy9.m10749b(context2, null, iArr, i4, i5, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i4, i5);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialAlertDialog_backgroundInsetStart, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialAlertDialog_backgroundInsetTop, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialAlertDialog_backgroundInsetEnd, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialAlertDialog_backgroundInsetBottom, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.f39524d = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iM18142c0 = omd.m18142c0(context2, xwc.m24751X(com.google.android.material.R$attr.colorSurface, context2, fr5.class.getCanonicalName()));
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, R$styleable.MaterialAlertDialog, i4, i5);
        int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.MaterialAlertDialog_backgroundTint, iM18142c0);
        typedArrayObtainStyledAttributes2.recycle();
        fs5 fs5Var = new fs5(context2, null, i4, i5);
        fs5Var.m12072p(context2);
        fs5Var.m12076t(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme2.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            fs5Var.setShapeAppearanceModel(fs5Var.f39578b.f36160a.mo13917a(dimension));
        }
        this.f39523c = fs5Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m12019b() {
        this.f71376a.f65216n = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m12020c(int i) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65209g = c3681vd.f65203a.getText(i);
    }

    @Override // p000.C3829zd
    public final DialogInterfaceC0016ae create() {
        DialogInterfaceC0016ae dialogInterfaceC0016aeCreate = super.create();
        Window window = dialogInterfaceC0016aeCreate.getWindow();
        View decorView = window.getDecorView();
        fs5 fs5Var = this.f39523c;
        if (fs5Var != null) {
            fs5Var.m12075s(decorView.getElevation());
        }
        Rect rect = this.f39524d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) fs5Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new k64(dialogInterfaceC0016aeCreate, rect));
        return dialogInterfaceC0016aeCreate;
    }

    /* JADX INFO: renamed from: d */
    public final void m12021d(String str) {
        this.f71376a.f65209g = str;
    }

    /* JADX INFO: renamed from: e */
    public final fr5 m12022e(int i, DialogInterface.OnClickListener onClickListener) {
        return (fr5) super.setNegativeButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: f */
    public final void m12023f(String str, DialogInterface.OnClickListener onClickListener) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65212j = str;
        c3681vd.f65213k = onClickListener;
    }

    /* JADX INFO: renamed from: g */
    public final void m12024g(uo5 uo5Var) {
        this.f71376a.f65217o = uo5Var;
    }

    /* JADX INFO: renamed from: h */
    public final fr5 m12025h(int i, DialogInterface.OnClickListener onClickListener) {
        return (fr5) super.setPositiveButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: i */
    public final void m12026i(String str, DialogInterface.OnClickListener onClickListener) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65210h = str;
        c3681vd.f65211i = onClickListener;
    }

    /* JADX INFO: renamed from: j */
    public final fr5 m12027j(String str) {
        return (fr5) super.setTitle(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m12028k(int i) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65207e = c3681vd.f65203a.getText(i);
    }

    /* JADX INFO: renamed from: l */
    public final fr5 m12029l(View view) {
        return (fr5) super.setView(view);
    }

    @Override // p000.C3829zd
    public final C3829zd setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (fr5) super.setNegativeButton(i, onClickListener);
    }

    @Override // p000.C3829zd
    public final C3829zd setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (fr5) super.setPositiveButton(i, onClickListener);
    }

    @Override // p000.C3829zd
    public final C3829zd setTitle(CharSequence charSequence) {
        return (fr5) super.setTitle(charSequence);
    }

    @Override // p000.C3829zd
    public final C3829zd setView(View view) {
        return (fr5) super.setView(view);
    }

    public fr5(Context context) {
        this(context, 0);
    }
}
