package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000.C3636u5;
import p000.LayoutInflaterFactory2C3804yp;
import p000.hw5;
import p000.qn3;
import p000.tk1;
import p000.x5a;
import p000.xua;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f1141a;

    /* JADX INFO: renamed from: b */
    public TypedValue f1142b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1143c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1144d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1145e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1146f;

    /* JADX INFO: renamed from: g */
    public final Rect f1147g;

    /* JADX INFO: renamed from: h */
    public tk1 f1148h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1147g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1145e == null) {
            this.f1145e = new TypedValue();
        }
        return this.f1145e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1146f == null) {
            this.f1146f = new TypedValue();
        }
        return this.f1146f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1143c == null) {
            this.f1143c = new TypedValue();
        }
        return this.f1143c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1144d == null) {
            this.f1144d = new TypedValue();
        }
        return this.f1144d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1141a == null) {
            this.f1141a = new TypedValue();
        }
        return this.f1141a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1142b == null) {
            this.f1142b = new TypedValue();
        }
        return this.f1142b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tk1 tk1Var = this.f1148h;
        if (tk1Var != null) {
            tk1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0035b c0035b;
        super.onDetachedFromWindow();
        tk1 tk1Var = this.f1148h;
        if (tk1Var != null) {
            LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) ((qn3) tk1Var).f57974a;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C3804yp.f70189L;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.m668k();
                ActionMenuView actionMenuView = ((x5a) actionBarOverlayLayout.f1099e).f67786a.f1168a;
                if (actionMenuView != null && (c0035b = actionMenuView.f1112O) != null) {
                    c0035b.m706f();
                    C3636u5 c3636u5 = c0035b.f1209P;
                    if (c3636u5 != null) {
                        c3636u5.m24176a();
                    }
                }
            }
            if (layoutInflaterFactory2C3804yp.f70194Q != null) {
                layoutInflaterFactory2C3804yp.f70217l.getDecorView().removeCallbacks(layoutInflaterFactory2C3804yp.f70195R);
                if (layoutInflaterFactory2C3804yp.f70194Q.isShowing()) {
                    try {
                        layoutInflaterFactory2C3804yp.f70194Q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C3804yp.f70194Q = null;
            }
            xua xuaVar = layoutInflaterFactory2C3804yp.f70196S;
            if (xuaVar != null) {
                xuaVar.m24704b();
            }
            hw5 hw5Var = layoutInflaterFactory2C3804yp.m25238x(0).f68471h;
            if (hw5Var != null) {
                hw5Var.m13520c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1147g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f1144d : this.f1143c;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f1145e : this.f1146f;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f1142b : this.f1141a;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(tk1 tk1Var) {
        this.f1148h = tk1Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
