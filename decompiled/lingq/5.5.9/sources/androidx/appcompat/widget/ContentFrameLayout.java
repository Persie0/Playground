package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0224f;
import p080e.C5277i;
import p080e.LayoutInflaterFactory2C5275g;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f938a;

    /* JADX INFO: renamed from: b */
    public TypedValue f939b;

    /* JADX INFO: renamed from: c */
    public TypedValue f940c;

    /* JADX INFO: renamed from: d */
    public TypedValue f941d;

    /* JADX INFO: renamed from: e */
    public TypedValue f942e;

    /* JADX INFO: renamed from: f */
    public TypedValue f943f;

    /* JADX INFO: renamed from: g */
    public final Rect f944g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0263a f945h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0263a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f944g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f942e == null) {
            this.f942e = new TypedValue();
        }
        return this.f942e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f943f == null) {
            this.f943f = new TypedValue();
        }
        return this.f943f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f940c == null) {
            this.f940c = new TypedValue();
        }
        return this.f940c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f941d == null) {
            this.f941d = new TypedValue();
        }
        return this.f941d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f938a == null) {
            this.f938a = new TypedValue();
        }
        return this.f938a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f939b == null) {
            this.f939b = new TypedValue();
        }
        return this.f939b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0263a interfaceC0263a = this.f945h;
        if (interfaceC0263a != null) {
            interfaceC0263a.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0263a interfaceC0263a = this.f945h;
        if (interfaceC0263a != null) {
            LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = ((C5277i) interfaceC0263a).f33468a;
            InterfaceC0302c0 interfaceC0302c0 = layoutInflaterFactory2C5275g.f33389M;
            if (interfaceC0302c0 != null) {
                interfaceC0302c0.mo969j();
            }
            if (layoutInflaterFactory2C5275g.f33394R != null) {
                layoutInflaterFactory2C5275g.f33416l.getDecorView().removeCallbacks(layoutInflaterFactory2C5275g.f33395S);
                if (layoutInflaterFactory2C5275g.f33394R.isShowing()) {
                    try {
                        layoutInflaterFactory2C5275g.f33394R.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C5275g.f33394R = null;
            }
            C10049l0 c10049l0 = layoutInflaterFactory2C5275g.f33396T;
            if (c10049l0 != null) {
                c10049l0.m18836b();
            }
            C0224f c0224f = layoutInflaterFactory2C5275g.m11366N(0).f33457h;
            if (c0224f != null) {
                c0224f.m919c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f944g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f941d : this.f940c;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z12 ? this.f942e : this.f943f;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f939b : this.f938a;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0263a interfaceC0263a) {
        this.f945h = interfaceC0263a;
    }
}
