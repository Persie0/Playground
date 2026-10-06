package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0193fr;
import p000.afb;
import p000.afn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final boolean f1006a;

    /* JADX INFO: renamed from: b */
    private boolean f1007b;

    /* JADX INFO: renamed from: c */
    private int f1008c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1008c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23267k);
        afn.m536c(this, context, C0193fr.f23267k, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f1006a = z;
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m1084b(z);
        }
    }

    /* JADX INFO: renamed from: a */
    private final int m1083a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private final void m1084b(boolean z) {
        if (this.f1007b != z) {
            if (!z || this.f1006a) {
                this.f1007b = z;
                setOrientation(z ? 1 : 0);
                setGravity(true != z ? 80 : 8388613);
                View viewFindViewById = findViewById(C0100R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(true != z ? 4 : 8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iM1083a;
        int paddingTop;
        int iM1083a2;
        int size = View.MeasureSpec.getSize(i);
        if (this.f1006a) {
            if (size > this.f1008c && this.f1007b) {
                m1084b(false);
            }
            this.f1008c = size;
        }
        if (this.f1007b || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (!this.f1006a || this.f1007b || (getMeasuredWidthAndState() & (-16777216)) != 16777216) {
            if (z) {
            }
            iM1083a = m1083a(0);
            if (iM1083a >= 0) {
                View childAt = getChildAt(iM1083a);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (this.f1007b) {
                    iM1083a2 = m1083a(iM1083a + 1);
                    if (iM1083a2 >= 0) {
                        paddingTop += getChildAt(iM1083a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                    }
                } else {
                    paddingTop += getPaddingBottom();
                }
            } else {
                paddingTop = 0;
            }
            if (afb.m421b(this) != paddingTop) {
                setMinimumHeight(paddingTop);
                if (i2 == 0) {
                    super.onMeasure(i, 0);
                }
            }
        }
        m1084b(true);
        super.onMeasure(i, i2);
        iM1083a = m1083a(0);
        if (iM1083a >= 0) {
            View childAt2 = getChildAt(iM1083a);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            paddingTop = getPaddingTop() + childAt2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (this.f1007b) {
                iM1083a2 = m1083a(iM1083a + 1);
                if (iM1083a2 >= 0) {
                    paddingTop += getChildAt(iM1083a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingTop += getPaddingBottom();
            }
        } else {
            paddingTop = 0;
        }
        if (afb.m421b(this) != paddingTop) {
            setMinimumHeight(paddingTop);
            if (i2 == 0) {
                super.onMeasure(i, 0);
            }
        }
    }
}
