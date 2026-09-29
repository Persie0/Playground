package com.google.android.material.appbar;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.widget.Toolbar;
import com.linguist.R;
import gd.C5768g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import md.C7542a;
import p153hc.C6031a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;
import p507yc.C10345l;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: x0 */
    public static final ImageView.ScaleType[] f14704x0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: s0 */
    public Integer f14705s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f14706t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f14707u0;

    /* JADX INFO: renamed from: v0 */
    public ImageView.ScaleType f14708v0;

    /* JADX INFO: renamed from: w0 */
    public Boolean f14709w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        int i10 = 0;
        Context context2 = getContext();
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35633B, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM19357d.hasValue(2)) {
            setNavigationIconTint(typedArrayM19357d.getColor(2, -1));
        }
        this.f14706t0 = typedArrayM19357d.getBoolean(4, false);
        this.f14707u0 = typedArrayM19357d.getBoolean(3, false);
        int i11 = typedArrayM19357d.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f14704x0;
            if (i11 < scaleTypeArr.length) {
                this.f14708v0 = scaleTypeArr[i11];
            }
        }
        if (typedArrayM19357d.hasValue(0)) {
            this.f14709w0 = Boolean.valueOf(typedArrayM19357d.getBoolean(0, false));
        }
        typedArrayM19357d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C5768g c5768g = new C5768g();
            c5768g.m12141m(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i10));
            c5768g.m12138j(context2);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            c5768g.m12140l(C10029b0.i.m18715i(this));
            C10029b0.d.m18680q(this, c5768g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f14708v0;
    }

    public Integer getNavigationIconTint() {
        return this.f14705s0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: k */
    public final void mo1059k(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof C0224f;
        if (z10) {
            ((C0224f) menu).m939w();
        }
        super.mo1059k(i10);
        if (z10) {
            ((C0224f) menu).m938v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m335b2(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView2 = null;
        if (this.f14706t0 || this.f14707u0) {
            ArrayList arrayListM19360b = C10345l.m19360b(this, getTitle());
            boolean zIsEmpty = arrayListM19360b.isEmpty();
            C10345l.a aVar = C10345l.f52049a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM19360b, aVar);
            ArrayList arrayListM19360b2 = C10345l.m19360b(this, getSubtitle());
            TextView textView2 = arrayListM19360b2.isEmpty() ? null : (TextView) Collections.max(arrayListM19360b2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f14706t0 && textView != null) {
                    m8570u(textView, pair);
                }
                if (this.f14707u0 && textView2 != null) {
                    m8570u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f14709w0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f14708v0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C0062b.m332a2(this, f3);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f14709w0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f14709w0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f14708v0 != scaleType) {
            this.f14708v0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f14705s0 != null) {
            drawable = drawable.mutate();
            C8488a.b.m16569g(drawable, this.f14705s0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f14705s0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f14707u0 != z10) {
            this.f14707u0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f14706t0 != z10) {
            this.f14706t0 = z10;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8570u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
