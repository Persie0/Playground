package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.linguist.R;
import java.util.WeakHashMap;
import p058d.C4999a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f935a;

    /* JADX INFO: renamed from: b */
    public boolean f936b;

    /* JADX INFO: renamed from: c */
    public int f937c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f937c = -1;
        int[] iArr = C4999a.f32597k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f935a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f935a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f936b != z10) {
            if (!z10 || this.f935a) {
                this.f936b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int i12;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i10);
        int measuredHeight = 0;
        if (this.f935a) {
            if (size > this.f937c && this.f936b) {
                setStacked(false);
            }
            this.f937c = size;
        }
        if (this.f936b || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f935a && !this.f936b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            measuredHeight = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f936b) {
                int childCount2 = getChildCount();
                for (int i14 = i13 + 1; i14 < childCount2; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                }
                if (i12 >= 0) {
                    paddingBottom = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            measuredHeight += paddingBottom;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18667d(this) != measuredHeight) {
            setMinimumHeight(measuredHeight);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f935a != z10) {
            this.f935a = z10;
            if (!z10 && this.f936b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
