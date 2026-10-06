package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import p000.ava;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BoxInsetLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private final int f1714a;

    /* JADX INFO: renamed from: b */
    private final int f1715b;

    /* JADX INFO: renamed from: c */
    private boolean f1716c;

    /* JADX INFO: renamed from: d */
    private Rect f1717d;

    /* JADX INFO: renamed from: e */
    private Rect f1718e;

    /* JADX INFO: renamed from: f */
    private Drawable f1719f;

    public BoxInsetLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private final int m1672a(ava avaVar, int i, int i2) {
        return (this.f1716c && (avaVar.f2474a & 8) != 0 && (avaVar.height == -1 || i == 80)) ? avaVar.bottomMargin + i2 : avaVar.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    private final int m1673b(ava avaVar, int i, int i2) {
        return (this.f1716c && (avaVar.f2474a & 1) != 0 && (avaVar.width == -1 || i == 3)) ? avaVar.leftMargin + i2 : avaVar.leftMargin;
    }

    /* JADX INFO: renamed from: c */
    private final int m1674c(ava avaVar, int i, int i2) {
        return (this.f1716c && (avaVar.f2474a & 4) != 0 && (avaVar.width == -1 || i == 5)) ? avaVar.rightMargin + i2 : avaVar.rightMargin;
    }

    /* JADX INFO: renamed from: d */
    private final int m1675d(ava avaVar, int i, int i2) {
        return (this.f1716c && (avaVar.f2474a & 2) != 0 && (avaVar.height == -1 || i == 48)) ? avaVar.topMargin + i2 : avaVar.topMargin;
    }

    /* JADX INFO: renamed from: e */
    private final int m1676e(int i, int i2) {
        return (int) (Math.max(Math.min(i, this.f1715b), Math.min(i2, this.f1714a)) * 0.146447f);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ava;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ava(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1716c = getResources().getConfiguration().isScreenRound();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        this.f1718e.set(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft() + this.f1717d.left;
        int paddingRight = ((i3 - i) - getPaddingRight()) - this.f1717d.right;
        int paddingTop = getPaddingTop() + this.f1717d.top;
        int paddingBottom = ((i4 - i2) - getPaddingBottom()) - this.f1717d.bottom;
        int i9 = 0;
        for (int childCount = getChildCount(); i9 < childCount; childCount = childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ava avaVar = (ava) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = avaVar.gravity;
                if (i10 == -1) {
                    i10 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                int i11 = i10 & 7;
                int iM1676e = m1676e(getMeasuredWidth(), getMeasuredHeight());
                int iM1673b = m1673b(avaVar, i11, iM1676e);
                int iM1674c = m1674c(avaVar, i11, iM1676e);
                if (avaVar.width != -1) {
                    switch (absoluteGravity & 7) {
                        case 1:
                            i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + iM1673b;
                            i6 = i5 - iM1674c;
                            break;
                        case 5:
                            i5 = paddingRight - measuredWidth;
                            i6 = i5 - iM1674c;
                            break;
                        default:
                            i6 = iM1673b + paddingLeft;
                            break;
                    }
                } else {
                    i6 = iM1673b + paddingLeft;
                }
                int i12 = i10 & 112;
                int iM1675d = m1675d(avaVar, i12, iM1676e);
                int iM1672a = m1672a(avaVar, i12, iM1676e);
                if (avaVar.height != -1) {
                    switch (i12) {
                        case 16:
                            i7 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + iM1675d;
                            i8 = i7 - iM1672a;
                            break;
                        case 80:
                            i7 = paddingBottom - measuredHeight;
                            i8 = i7 - iM1672a;
                            break;
                        default:
                            i8 = iM1675d + paddingTop;
                            break;
                    }
                } else {
                    i8 = iM1675d + paddingTop;
                }
                childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
            }
            i9++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ava avaVar = (ava) childAt.getLayoutParams();
                if (this.f1716c) {
                    int i8 = (avaVar.f2474a & 1) == 0 ? avaVar.leftMargin : 0;
                    int i9 = (avaVar.f2474a & 4) == 0 ? avaVar.rightMargin : 0;
                    int i10 = (avaVar.f2474a & 2) == 0 ? avaVar.topMargin : 0;
                    if ((8 & avaVar.f2474a) == 0) {
                        i3 = avaVar.bottomMargin;
                        i4 = i8;
                        i5 = i9;
                        i6 = i10;
                    } else {
                        i4 = i8;
                        i5 = i9;
                        i6 = i10;
                        i3 = 0;
                    }
                } else {
                    int i11 = avaVar.leftMargin;
                    int i12 = avaVar.topMargin;
                    int i13 = avaVar.rightMargin;
                    i3 = avaVar.bottomMargin;
                    i4 = i11;
                    i5 = i13;
                    i6 = i12;
                }
                measureChildWithMargins(childAt, i, 0, i2, 0);
                iMax = Math.max(iMax, childAt.getMeasuredWidth() + i4 + i5);
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + i6 + i3);
                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int paddingLeft = iMax + getPaddingLeft() + this.f1717d.left + getPaddingRight() + this.f1717d.right;
        int iMax3 = Math.max(iMax2 + getPaddingTop() + this.f1717d.top + getPaddingBottom() + this.f1717d.bottom, getSuggestedMinimumHeight());
        int iMax4 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable drawable = this.f1719f;
        if (drawable != null) {
            iMax3 = Math.max(iMax3, drawable.getMinimumHeight());
            iMax4 = Math.max(iMax4, this.f1719f.getMinimumWidth());
        }
        int iResolveSizeAndState = resolveSizeAndState(iMax4, i, iCombineMeasuredStates);
        int iResolveSizeAndState2 = resolveSizeAndState(iMax3, i2, iCombineMeasuredStates << 16);
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
        int iM1676e = m1676e(iResolveSizeAndState, iResolveSizeAndState2);
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            ava avaVar2 = (ava) childAt2.getLayoutParams();
            int i15 = avaVar2.gravity;
            if (i15 == -1) {
                i15 = 8388659;
            }
            int paddingLeft2 = getPaddingLeft() + this.f1717d.left;
            int paddingRight = getPaddingRight() + this.f1717d.right;
            int paddingTop = getPaddingTop() + this.f1717d.top;
            int paddingBottom = getPaddingBottom() + this.f1717d.bottom;
            int i16 = i15 & 7;
            int iM1673b = paddingLeft2 + paddingRight + m1673b(avaVar2, i16, iM1676e) + m1674c(avaVar2, i16, iM1676e);
            int i17 = i15 & 112;
            int iM1675d = paddingTop + paddingBottom + m1675d(avaVar2, i17, iM1676e) + m1672a(avaVar2, i17, iM1676e);
            int childMeasureSpec = getChildMeasureSpec(i, iM1673b, avaVar2.width);
            int childMeasureSpec2 = getChildMeasureSpec(i2, iM1675d, avaVar2.height);
            int measuredWidth = getMeasuredWidth() - iM1673b;
            int measuredHeight = getMeasuredHeight() - iM1675d;
            if (childAt2.getMeasuredWidth() > measuredWidth || childAt2.getMeasuredHeight() > measuredHeight) {
                childAt2.measure(childMeasureSpec, childMeasureSpec2);
            }
        }
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        this.f1719f = drawable;
        if (this.f1717d == null) {
            this.f1717d = new Rect();
        }
        if (this.f1719f != null) {
            drawable.getPadding(this.f1717d);
        }
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ava(layoutParams);
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.f1717d == null) {
            this.f1717d = new Rect();
        }
        if (this.f1718e == null) {
            this.f1718e = new Rect();
        }
        this.f1714a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.f1715b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
