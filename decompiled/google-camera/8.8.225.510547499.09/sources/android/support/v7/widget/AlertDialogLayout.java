package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0783kw;
import p000.afb;
import p000.afc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    private static int m1081a(View view) {
        int iM421b = afb.m421b(view);
        if (iM421b > 0) {
            return iM421b;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1081a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i7 = this.f1030f;
        int i8 = i7 & 112;
        int i9 = i7 & 8388615;
        switch (i8) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        Drawable drawable = this.f1031g;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0783kw c0783kw = (C0783kw) childAt.getLayoutParams();
                int i11 = c0783kw.gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                switch (Gravity.getAbsoluteGravity(i11, afc.m442c(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + c0783kw.leftMargin) - c0783kw.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - c0783kw.rightMargin;
                        break;
                    default:
                        i5 = c0783kw.leftMargin + paddingLeft;
                        break;
                }
                if (m1122s(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i12 = paddingTop + c0783kw.topMargin;
                childAt.layout(i5, i12, measuredWidth + i5, i12 + measuredHeight2);
                paddingTop = i12 + measuredHeight2 + c0783kw.bottomMargin;
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM1081a;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0100R.id.topPanel) {
                    view = childAt;
                } else if (id == C0100R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != C0100R.id.contentPanel && id != C0100R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM1081a = m1081a(view2);
            measuredHeight = view2.getMeasuredHeight() - iM1081a;
            paddingTop += iM1081a;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM1081a = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingTop;
        if (view2 != null) {
            int i5 = paddingTop - iM1081a;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM1081a += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM1081a, 1073741824));
            paddingTop = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    C0783kw c0783kw = (C0783kw) childAt3.getLayoutParams();
                    if (c0783kw.width == -1) {
                        int i8 = c0783kw.height;
                        c0783kw.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        c0783kw.height = i8;
                    }
                }
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
