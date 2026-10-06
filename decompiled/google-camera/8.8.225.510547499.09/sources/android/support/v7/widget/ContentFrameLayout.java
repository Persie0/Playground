package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode;
import p000.C0225gw;
import p000.InterfaceC0757jx;
import p000.LayoutInflaterFactory2C0179fd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public TypedValue f1009b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1010c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1011d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1012e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1013f;

    /* JADX INFO: renamed from: g */
    public TypedValue f1014g;

    /* JADX INFO: renamed from: h */
    public final Rect f1015h;

    /* JADX INFO: renamed from: i */
    public AmbientMode.AmbientController f1016i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AmbientMode.AmbientController ambientController = this.f1016i;
        if (ambientController != null) {
            Object obj = ambientController.f1697a;
            LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) obj;
            InterfaceC0757jx interfaceC0757jx = layoutInflaterFactory2C0179fd.f21379n;
            if (interfaceC0757jx != null) {
                interfaceC0757jx.mo1053a();
            }
            if (layoutInflaterFactory2C0179fd.f21382q != null) {
                layoutInflaterFactory2C0179fd.f21375j.getDecorView().removeCallbacks(layoutInflaterFactory2C0179fd.f21383r);
                if (layoutInflaterFactory2C0179fd.f21382q.isShowing()) {
                    try {
                        ((LayoutInflaterFactory2C0179fd) obj).f21382q.dismiss();
                    } catch (IllegalArgumentException e) {
                    }
                }
                layoutInflaterFactory2C0179fd.f21382q = null;
            }
            layoutInflaterFactory2C0179fd.m8234A();
            C0225gw c0225gw = layoutInflaterFactory2C0179fd.m8246M(0).f21177h;
            if (c0225gw != null) {
                c0225gw.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int fraction;
        int fraction2;
        int fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        boolean z3 = i3 < i4;
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f1012e : this.f1011d;
            if (typedValue == null || typedValue.type == 0) {
                z = false;
            } else {
                if (typedValue.type == 5) {
                    fraction3 = (int) typedValue.getDimension(displayMetrics);
                } else {
                    fraction3 = typedValue.type == 6 ? (int) typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                }
                if (fraction3 > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(fraction3 - (this.f1015h.left + this.f1015h.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f1013f : this.f1014g;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction2 = (int) typedValue2.getDimension(displayMetrics);
                } else {
                    fraction2 = typedValue2.type == 6 ? (int) typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels) : 0;
                }
                if (fraction2 > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(fraction2 - (this.f1015h.top + this.f1015h.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f1010c : this.f1009b;
            if (typedValue3 == null || typedValue3.type == 0) {
                z2 = false;
            } else {
                if (typedValue3.type == 5) {
                    fraction = (int) typedValue3.getDimension(displayMetrics);
                } else {
                    fraction = typedValue3.type == 6 ? (int) typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                }
                if (fraction > 0) {
                    fraction -= this.f1015h.left + this.f1015h.right;
                }
                if (measuredWidth < fraction) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(fraction, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1015h = new Rect();
    }
}
