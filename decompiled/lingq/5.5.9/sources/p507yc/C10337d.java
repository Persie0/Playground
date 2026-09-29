package p507yc;

import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;

/* JADX INFO: renamed from: yc.d */
/* JADX INFO: loaded from: classes.dex */
public class C10337d extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f52025a;

    /* JADX INFO: renamed from: b */
    public int f52026b;

    /* JADX INFO: renamed from: c */
    public boolean f52027c;

    /* JADX INFO: renamed from: d */
    public int f52028d;

    /* JADX INFO: renamed from: a */
    public boolean mo16625a() {
        return this.f52027c;
    }

    public int getItemSpacing() {
        return this.f52026b;
    }

    public int getLineSpacing() {
        return this.f52025a;
    }

    public int getRowCount() {
        return this.f52028d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iM18808b;
        int iM18809c;
        if (getChildCount() == 0) {
            this.f52028d = 0;
            return;
        }
        this.f52028d = 1;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z11 = C10029b0.e.m18686d(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iM18809c = C10040h.m18809c(marginLayoutParams);
                    iM18808b = C10040h.m18808b(marginLayoutParams);
                } else {
                    iM18808b = 0;
                    iM18809c = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + iM18809c;
                if (!this.f52027c && measuredWidth2 > i14) {
                    i15 = this.f52025a + paddingTop;
                    this.f52028d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f52028d - 1));
                int i17 = measuredWidth + iM18809c;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - iM18809c, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + iM18809c + iM18808b + this.f52026b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !mo16625a()) {
                    paddingLeft = getPaddingLeft();
                    i16 = this.f52025a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i13 + this.f52026b + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i13;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i12) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f52026b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f52025a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f52027c = z10;
    }
}
