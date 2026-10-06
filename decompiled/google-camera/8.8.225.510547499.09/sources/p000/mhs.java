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
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhs extends C0154ef {

    /* JADX INFO: renamed from: b */
    private final Drawable f40542b;

    /* JADX INFO: renamed from: c */
    private final Rect f40543c;

    /* JADX WARN: Illegal instructions before constructor call */
    public mhs(Context context, int i) {
        int iM16382v = m16382v(context);
        Context contextM16632a = mmp.m16632a(context, null, C0100R.attr.alertDialogStyle, C0100R.style.MaterialAlertDialog_MaterialComponents);
        super(iM16382v != 0 ? new C0931qi(contextM16632a, iM16382v) : contextM16632a, i == 0 ? m16382v(context) : i);
        Context contextM7255a = m7255a();
        Resources.Theme theme = contextM7255a.getTheme();
        TypedArray typedArrayM16438a = mjb.m16438a(contextM7255a, null, mht.f40544a, C0100R.attr.alertDialogStyle, C0100R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayM16438a.getDimensionPixelSize(2, contextM7255a.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayM16438a.getDimensionPixelSize(3, contextM7255a.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayM16438a.getDimensionPixelSize(1, contextM7255a.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayM16438a.getDimensionPixelSize(0, contextM7255a.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayM16438a.recycle();
        int layoutDirection = contextM7255a.getResources().getConfiguration().getLayoutDirection();
        this.f40543c = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection == 1 ? dimensionPixelSize : dimensionPixelSize3, dimensionPixelSize4);
        int iM15027t = kxk.m15027t(contextM7255a, lij.m15395C(contextM7255a, C0100R.attr.colorSurface, getClass().getCanonicalName()));
        mkx mkxVar = new mkx(mlc.m16590a(contextM7255a, null, C0100R.attr.alertDialogStyle, C0100R.style.MaterialAlertDialog_MaterialComponents).m16589a());
        mkxVar.m16577g(contextM7255a);
        mkxVar.m16579i(ColorStateList.valueOf(iM15027t));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(m7255a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            mkxVar.mo4827c(mkxVar.f40893a.f40870a.m16594d(dimension));
        }
        this.f40542b = mkxVar;
    }

    /* JADX INFO: renamed from: v */
    private static int m16382v(Context context) {
        TypedValue typedValueM15394B = lij.m15394B(context, C0100R.attr.materialAlertDialogTheme);
        if (typedValueM15394B == null) {
            return 0;
        }
        return typedValueM15394B.data;
    }

    @Override // p000.C0154ef
    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0155eg mo7256b() {
        DialogInterfaceC0155eg dialogInterfaceC0155egMo7256b = super.mo7256b();
        Window window = dialogInterfaceC0155egMo7256b.getWindow();
        View decorView = window.getDecorView();
        ((mkx) this.f40542b).m16578h(afh.m470a(decorView));
        Drawable drawable = this.f40542b;
        Rect rect = this.f40543c;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new mhr(dialogInterfaceC0155egMo7256b, this.f40543c));
        return dialogInterfaceC0155egMo7256b;
    }

    /* JADX INFO: renamed from: k */
    public final void m16383k(boolean z) {
        this.f13785a.f13173k = z;
    }

    /* JADX INFO: renamed from: l */
    public final void m16384l(int i) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13168f = c0150eb.f13163a.getText(i);
    }

    /* JADX INFO: renamed from: m */
    public final void m16385m(CharSequence charSequence) {
        super.m7259e(charSequence);
    }

    /* JADX INFO: renamed from: n */
    public final void m16386n(int i, DialogInterface.OnClickListener onClickListener) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13171i = c0150eb.f13163a.getText(i);
        this.f13785a.f13172j = onClickListener;
    }

    /* JADX INFO: renamed from: o */
    public final void m16387o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.m7260f(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: p */
    public final void m16388p(DialogInterface.OnKeyListener onKeyListener) {
        super.m7261g(onKeyListener);
    }

    /* JADX INFO: renamed from: q */
    public final void m16389q(int i, DialogInterface.OnClickListener onClickListener) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13169g = c0150eb.f13163a.getText(i);
        this.f13785a.f13170h = onClickListener;
    }

    /* JADX INFO: renamed from: r */
    public final void m16390r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.m7262h(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: s */
    public final void m16391s(int i) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13166d = c0150eb.f13163a.getText(i);
    }

    /* JADX INFO: renamed from: t */
    public final void m16392t(CharSequence charSequence) {
        super.m7263i(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public final void m16393u(View view) {
        super.m7264j(view);
    }
}
