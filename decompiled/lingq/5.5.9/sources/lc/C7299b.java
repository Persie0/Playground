package lc;

import ad.AbstractC0060d;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0224f;
import com.linguist.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: lc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7299b extends AbstractC0060d {

    /* JADX INFO: renamed from: d0 */
    public final int f40909d0;

    /* JADX INFO: renamed from: e0 */
    public final int f40910e0;

    /* JADX INFO: renamed from: f0 */
    public final int f40911f0;

    /* JADX INFO: renamed from: g0 */
    public final int f40912g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f40913h0;

    /* JADX INFO: renamed from: i0 */
    public final ArrayList f40914i0;

    public C7299b(Context context) {
        super(context);
        this.f40914i0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f40909d0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f40910e0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f40911f0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f40912g0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // ad.AbstractC0060d
    /* JADX INFO: renamed from: e */
    public final C7298a mo240e(Context context) {
        return new C7298a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.e.m18686d(this) == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        C0224f menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.m928l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f40914i0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i14 = 1;
        if (labelVisibilityMode == -1) {
            if (size2 > 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (labelVisibilityMode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = this.f40911f0;
        if (z10 && this.f40913h0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f40912g0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i16 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f40910e0 * i16), Math.min(iMax, i15));
            int i17 = size - iMin;
            if (i16 != 0) {
                i14 = i16;
            }
            int iMin2 = Math.min(i17 / i14, this.f40909d0);
            int i18 = i17 - (i16 * iMin2);
            int i19 = 0;
            while (i19 < childCount) {
                if (getChildAt(i19).getVisibility() != 8) {
                    i13 = i19 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i18 > 0) {
                        i13++;
                        i18--;
                    }
                    arrayList.add(Integer.valueOf(i13));
                    i19++;
                } else {
                    i13 = 0;
                }
                arrayList.add(Integer.valueOf(i13));
                i19++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i15);
            int i20 = size - (size2 * iMin3);
            for (int i21 = 0; i21 < childCount; i21++) {
                if (getChildAt(i21).getVisibility() == 8) {
                    i12 = 0;
                } else if (i20 > 0) {
                    i12 = iMin3 + 1;
                    i20--;
                } else {
                    i12 = iMin3;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i22)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f40913h0 = z10;
    }
}
