package tc;

import ae.C0062b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0215b;
import com.linguist.R;
import gd.C5768g;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5149b;
import p153hc.C6031a;
import p164i.C6102c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;

/* JADX INFO: renamed from: tc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9249b extends DialogInterfaceC0215b.a {

    /* JADX INFO: renamed from: c */
    public final C5768g f47940c;

    /* JADX INFO: renamed from: d */
    public final Rect f47941d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9249b() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9249b(Context context) {
        TypedValue typedValueM10922a = C5149b.m10922a(R.attr.materialAlertDialogTheme, context);
        int i10 = typedValueM10922a == null ? 0 : typedValueM10922a.data;
        Context contextM15048a = C7542a.m15048a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextM15048a = i10 != 0 ? new C6102c(contextM15048a, i10) : contextM15048a;
        TypedValue typedValueM10922a2 = C5149b.m10922a(R.attr.materialAlertDialogTheme, context);
        super(contextM15048a, typedValueM10922a2 == null ? 0 : typedValueM10922a2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, null, C6031a.f35666p, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayM19357d.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayM19357d.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayM19357d.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayM19357d.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayM19357d.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f47941d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iM337c1 = C0062b.m337c1(context2, R.attr.colorSurface, C9249b.class.getCanonicalName());
        C5768g c5768g = new C5768g(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c5768g.m12138j(context2);
        c5768g.m12141m(ColorStateList.valueOf(iM337c1));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c5768g.setShapeAppearanceModel(c5768g.f34857a.f34870a.m12153e(dimension));
            }
        }
        this.f47940c = c5768g;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0215b.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C9249b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9249b) super.setNegativeButton(i10, onClickListener);
    }

    /* JADX INFO: renamed from: c */
    public final void m17610c(String str, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0211b c0211b = this.f599a;
        c0211b.f582i = str;
        c0211b.f583j = onClickListener;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0215b.a
    public final DialogInterfaceC0215b create() {
        DialogInterfaceC0215b dialogInterfaceC0215bCreate = super.create();
        Window window = dialogInterfaceC0215bCreate.getWindow();
        View decorView = window.getDecorView();
        C5768g c5768g = this.f47940c;
        if (c5768g instanceof C5768g) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            c5768g.m12140l(C10029b0.i.m18715i(decorView));
        }
        Rect rect = this.f47941d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c5768g, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC9248a(dialogInterfaceC0215bCreate, rect));
        return dialogInterfaceC0215bCreate;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0215b.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C9249b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9249b) super.setPositiveButton(i10, onClickListener);
    }

    /* JADX INFO: renamed from: e */
    public final void m17612e(String str, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0211b c0211b = this.f599a;
        c0211b.f580g = str;
        c0211b.f581h = onClickListener;
    }

    /* JADX INFO: renamed from: f */
    public final void m17613f(ArrayAdapter arrayAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0211b c0211b = this.f599a;
        c0211b.f590q = arrayAdapter;
        c0211b.f591r = onClickListener;
        c0211b.f594u = i10;
        c0211b.f593t = true;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0215b.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C9249b setTitle(CharSequence charSequence) {
        return (C9249b) super.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: h */
    public final void m17615h(int i10) {
        AlertController.C0211b c0211b = this.f599a;
        c0211b.f577d = c0211b.f574a.getText(i10);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0215b.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C9249b setView(View view) {
        return (C9249b) super.setView(view);
    }
}
