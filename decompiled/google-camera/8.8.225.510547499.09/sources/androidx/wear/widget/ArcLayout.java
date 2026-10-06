package androidx.wear.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000.auv;
import p000.auw;
import p000.aux;
import p000.auy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ArcLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private int f1707a;

    /* JADX INFO: renamed from: b */
    private int f1708b;

    /* JADX INFO: renamed from: c */
    private float f1709c;

    /* JADX INFO: renamed from: d */
    private float f1710d;

    /* JADX INFO: renamed from: e */
    private boolean f1711e;

    /* JADX INFO: renamed from: f */
    private final auw f1712f;

    /* JADX INFO: renamed from: g */
    private View f1713g;

    public ArcLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final float m1668a(View view) {
        float f;
        aux auxVar = (aux) view.getLayoutParams();
        boolean z = view instanceof auy;
        int iMo1684b = z ? ((auy) view).mo1684b() : view.getMeasuredHeight();
        int i = (this.f1707a - auxVar.topMargin) - auxVar.bottomMargin;
        int i2 = this.f1711e ? auxVar.topMargin : auxVar.bottomMargin;
        float fRound = (z || getMeasuredWidth() >= getMeasuredHeight()) ? 0.0f : Math.round((getMeasuredHeight() - getMeasuredWidth()) / 2.0f);
        int i3 = i - iMo1684b;
        float f2 = i2 + fRound;
        switch (auxVar.f2453b) {
            case 0:
                return f2;
            case 1:
                f = i3 / 2.0f;
                break;
            case 2:
                f = i3;
                break;
            default:
                return 0.0f;
        }
        return f2 + f;
    }

    /* JADX INFO: renamed from: b */
    private static float m1669b(float f, float f2) {
        double dAsin = Math.asin((f / f2) / 2.0f);
        return (float) Math.toDegrees(dAsin + dAsin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private final void m1670c(View view, auw auwVar) {
        if (view.getVisibility() == 8) {
            auwVar.f2449a = 0.0f;
            auwVar.f2450b = 0.0f;
            auwVar.f2451c = 0.0f;
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f = this.f1707a;
        aux auxVar = (aux) view.getLayoutParams();
        float f2 = (measuredWidth / 2.0f) - f;
        auwVar.f2449a = m1669b(auxVar.leftMargin, f2);
        auwVar.f2450b = m1669b(auxVar.rightMargin, f2);
        if (view instanceof auy) {
            auwVar.f2451c = ((auy) view).mo1683a();
        } else {
            auwVar.f2451c = m1669b(view.getMeasuredWidth(), f2);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m1671d(View view, float f, float[] fArr) {
        Matrix matrix = new Matrix();
        aux auxVar = (aux) view.getLayoutParams();
        if (view instanceof auy) {
            matrix.postRotate(-f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            matrix.postTranslate(-view.getX(), -view.getY());
        } else {
            matrix.postTranslate(-auxVar.f2455d, -auxVar.f2456e);
            if (auxVar.f2452a) {
                matrix.postRotate(-f);
            }
            matrix.postTranslate(view.getWidth() / 2, view.getHeight() / 2);
        }
        matrix.mapPoints(fArr);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aux;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        aux auxVar = (aux) view.getLayoutParams();
        float f = auxVar.f2454c;
        if (view instanceof auy) {
            canvas.rotate(f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            ((auy) view).mo1685c();
        } else {
            float f2 = 0.0f;
            if (auxVar.f2452a) {
                f2 = (true != this.f1711e ? 180.0f : 0.0f) + f;
            }
            canvas.rotate(f2, auxVar.f2455d, auxVar.f2456e);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aux();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aux(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1713g == null && motionEvent.getActionMasked() == 0) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    float f = ((aux) childAt.getLayoutParams()).f2454c;
                    float[] fArr = {motionEvent.getX(), motionEvent.getY()};
                    m1671d(childAt, f, fArr);
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    if (childAt instanceof auy) {
                        if (((auy) childAt).mo1687e(f2, f3)) {
                            this.f1713g = childAt;
                            break;
                        }
                    } else {
                        if (f2 >= 0.0f && f2 < childAt.getMeasuredWidth() && f3 >= 0.0f && f3 < childAt.getMeasuredHeight()) {
                            this.f1713g = childAt;
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fM2047a;
        float f;
        float f2;
        int i5 = 0;
        boolean z2 = getLayoutDirection() == 1;
        boolean z3 = this.f1711e;
        int i6 = this.f1708b;
        float f3 = z3 != z2 ? 1.0f : -1.0f;
        int i7 = 2;
        if (i6 == 0) {
            fM2047a = this.f1709c * f3;
        } else {
            boolean z4 = false;
            float fM2047a2 = 0.0f;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                z4 |= !(((aux) childAt.getLayoutParams()).f2457f <= 0.0f);
                m1670c(childAt, this.f1712f);
                fM2047a2 += this.f1712f.m2047a();
            }
            if (z4) {
                float f4 = this.f1710d;
                if (fM2047a2 < f4) {
                    fM2047a2 = f4;
                }
            }
            int i9 = this.f1708b;
            if (i9 == 1) {
                f = this.f1709c * f3;
                fM2047a2 /= 2.0f;
            } else if (i9 == 2) {
                f = this.f1709c * f3;
            } else {
                fM2047a = 0.0f;
            }
            fM2047a = f - fM2047a2;
        }
        float f5 = 0.0f;
        float fM2047a3 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                float f6 = ((aux) childAt2.getLayoutParams()).f2457f;
                if (f6 > 0.0f) {
                    f5 += f6;
                    m1670c(childAt2, this.f1712f);
                    auw auwVar = this.f1712f;
                    fM2047a3 += auwVar.f2449a + auwVar.f2450b;
                } else {
                    m1670c(childAt2, this.f1712f);
                    fM2047a3 += this.f1712f.m2047a();
                }
            }
        }
        float f7 = f5 > 0.0f ? (this.f1710d - fM2047a3) / f5 : 0.0f;
        while (i5 < getChildCount()) {
            View childAt3 = getChildAt(i5);
            if (childAt3.getVisibility() != 8) {
                m1670c(childAt3, this.f1712f);
                aux auxVar = (aux) childAt3.getLayoutParams();
                float f8 = auxVar.f2457f;
                if (f8 > 0.0f) {
                    float f9 = f8 * f7;
                    this.f1712f.f2451c = f9;
                    if (!(childAt3 instanceof auy)) {
                        throw new IllegalStateException("ArcLayout.LayoutParams with non zero weights are only supported for views implementing ArcLayout.Widget");
                    }
                    ((auy) childAt3).mo1686d(f9);
                }
                auw auwVar2 = this.f1712f;
                float f10 = (auwVar2.f2449a + (auwVar2.f2451c / 2.0f) + fM2047a) * f3;
                auxVar.f2454c = f10;
                float measuredHeight = ((getMeasuredHeight() - childAt3.getMeasuredHeight()) / i7) - m1668a(childAt3);
                float measuredWidth = getMeasuredWidth();
                double d = f10;
                Double.isNaN(d);
                f2 = f7;
                double d2 = measuredHeight;
                double d3 = (d * 3.141592653589793d) / 180.0d;
                double dSin = Math.sin(d3);
                Double.isNaN(d2);
                double d4 = measuredWidth / 2.0f;
                Double.isNaN(d4);
                auxVar.f2455d = (float) (d4 + (dSin * d2));
                float measuredHeight2 = getMeasuredHeight();
                double dCos = Math.cos(d3);
                Double.isNaN(d2);
                double d5 = d2 * dCos;
                double d6 = measuredHeight2 / 2.0f;
                Double.isNaN(d6);
                auxVar.f2456e = (float) (d6 - d5);
                fM2047a += this.f1712f.m2047a();
                if (childAt3 instanceof auy) {
                    int iRound = Math.round((getMeasuredWidth() / 2.0f) - (childAt3.getMeasuredWidth() / 2.0f));
                    int iRound2 = Math.round((getMeasuredHeight() / 2.0f) - (childAt3.getMeasuredHeight() / 2.0f));
                    childAt3.layout(iRound, iRound2, childAt3.getMeasuredWidth() + iRound, childAt3.getMeasuredHeight() + iRound2);
                } else {
                    int iRound3 = Math.round(auxVar.f2455d - (childAt3.getMeasuredWidth() / 2.0f));
                    int iRound4 = Math.round(auxVar.f2456e - (childAt3.getMeasuredHeight() / 2.0f));
                    childAt3.layout(iRound3, iRound4, childAt3.getMeasuredWidth() + iRound3, childAt3.getMeasuredHeight() + iRound4);
                }
            } else {
                f2 = f7;
            }
            i5++;
            f7 = f2;
            i7 = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            size2 = displayMetrics.heightPixels;
            size = i3;
        }
        if (size < size2) {
            size2 = size;
        } else if (size2 < size) {
            size = size2;
        } else {
            int i4 = size2;
            size2 = size;
            size = i4;
        }
        int i5 = size / 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        int iMax = 0;
        int iCombineMeasuredStates = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (childAt instanceof auy) {
                    measuredHeight = ((auy) childAt).mo1684b();
                } else {
                    measureChild(childAt, getChildMeasureSpec(iMakeMeasureSpec, 0, childAt.getLayoutParams().width), getChildMeasureSpec(iMakeMeasureSpec, 0, childAt.getLayoutParams().height));
                    measuredHeight = childAt.getMeasuredHeight();
                    iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                }
                aux auxVar = (aux) childAt.getLayoutParams();
                iMax = Math.max(iMax, measuredHeight + auxVar.topMargin + auxVar.bottomMargin);
            }
        }
        this.f1707a = iMax;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8 && (childAt2 instanceof auy)) {
                aux auxVar2 = (aux) childAt2.getLayoutParams();
                float fM1668a = m1668a(childAt2);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i5 + i5) - Math.round(fM1668a + fM1668a), 1073741824);
                measureChild(childAt2, getChildMeasureSpec(iMakeMeasureSpec2, 0, auxVar2.width), getChildMeasureSpec(iMakeMeasureSpec2, 0, auxVar2.height));
                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt2.getMeasuredState());
            }
        }
        setMeasuredDimension(resolveSizeAndState(size2, i, iCombineMeasuredStates), resolveSizeAndState(size, i2, iCombineMeasuredStates));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1713g == null) {
            return false;
        }
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        m1671d(this.f1713g, ((aux) this.f1713g.getLayoutParams()).f2454c, fArr);
        motionEvent.offsetLocation(fArr[0] - motionEvent.getX(), fArr[1] - motionEvent.getY());
        this.f1713g.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.f1713g = null;
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).forceLayout();
        }
    }

    public ArcLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aux(layoutParams);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1707a = 0;
        this.f1710d = 360.0f;
        this.f1712f = new auw();
        this.f1713g = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, auv.f2441a, i, i2);
        this.f1708b = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f1709c = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        this.f1711e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
