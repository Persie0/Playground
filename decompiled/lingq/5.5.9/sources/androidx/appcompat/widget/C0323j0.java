package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p058d.C4999a;
import p104f.C5452a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C0323j0 extends ViewGroup {

    /* JADX INFO: renamed from: H */
    public int f1240H;

    /* JADX INFO: renamed from: I */
    public int f1241I;

    /* JADX INFO: renamed from: J */
    public int f1242J;

    /* JADX INFO: renamed from: a */
    public boolean f1243a;

    /* JADX INFO: renamed from: b */
    public int f1244b;

    /* JADX INFO: renamed from: c */
    public int f1245c;

    /* JADX INFO: renamed from: d */
    public int f1246d;

    /* JADX INFO: renamed from: e */
    public int f1247e;

    /* JADX INFO: renamed from: f */
    public int f1248f;

    /* JADX INFO: renamed from: g */
    public float f1249g;

    /* JADX INFO: renamed from: h */
    public boolean f1250h;

    /* JADX INFO: renamed from: i */
    public int[] f1251i;

    /* JADX INFO: renamed from: j */
    public int[] f1252j;

    /* JADX INFO: renamed from: k */
    public Drawable f1253k;

    /* JADX INFO: renamed from: l */
    public int f1254l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.j0$a */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0323j0(Context context) {
        this(context, null);
    }

    public C0323j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0323j0(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        super(context, attributeSet, i10);
        this.f1243a = true;
        this.f1244b = -1;
        this.f1245c = 0;
        this.f1247e = 8388659;
        int[] iArr = C4999a.f32600n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        int i11 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f1249g = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f1244b = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.f1250h = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : C5452a.m11672a(context, resourceId));
        this.f1241I = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f1242J = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: f */
    public final void m1229f(Canvas canvas, int i10) {
        this.f1253k.setBounds(getPaddingLeft() + this.f1242J, i10, (getWidth() - getPaddingRight()) - this.f1242J, this.f1240H + i10);
        this.f1253k.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public final void m1230g(Canvas canvas, int i10) {
        this.f1253k.setBounds(i10, getPaddingTop() + this.f1242J, this.f1254l + i10, (getHeight() - getPaddingBottom()) - this.f1242J);
        this.f1253k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1244b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1244b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1244b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1245c;
        if (this.f1246d == 1 && (i10 = this.f1247e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1248f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1248f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1244b;
    }

    public Drawable getDividerDrawable() {
        return this.f1253k;
    }

    public int getDividerPadding() {
        return this.f1242J;
    }

    public int getDividerWidth() {
        return this.f1254l;
    }

    public int getGravity() {
        return this.f1247e;
    }

    public int getOrientation() {
        return this.f1246d;
    }

    public int getShowDividers() {
        return this.f1241I;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1249g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1246d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1231k(int i10) {
        if (i10 == 0) {
            return (this.f1241I & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1241I & 4) != 0;
        }
        if ((this.f1241I & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.f1253k == null) {
            return;
        }
        int i11 = 0;
        if (this.f1246d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && m1231k(i11)) {
                    m1229f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1240H);
                }
                i11++;
            }
            if (m1231k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1240H;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                m1229f(canvas, bottom);
            }
        } else {
            int virtualChildCount2 = getVirtualChildCount();
            boolean zM1200a = C0318h1.m1200a(this);
            while (i11 < virtualChildCount2) {
                View childAt3 = getChildAt(i11);
                if (childAt3 != null && childAt3.getVisibility() != 8 && m1231k(i11)) {
                    a aVar = (a) childAt3.getLayoutParams();
                    m1230g(canvas, zM1200a ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1254l);
                }
                i11++;
            }
            if (m1231k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (zM1200a) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        i10 = this.f1254l;
                        right = left - i10;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    }
                } else if (zM1200a) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.f1254l;
                    right = left - i10;
                }
                m1230g(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int measuredHeight;
        int paddingTop;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        int i24 = 5;
        if (this.f1246d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i25 = i12 - i10;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.f1247e;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            if (i27 != 16) {
                paddingTop = i27 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f1248f;
            } else {
                paddingTop = getPaddingTop() + (((i13 - i11) - this.f1248f) / 2);
            }
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i23) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i30 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, C10029b0.e.m18686d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i24) {
                            i22 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft2;
                        } else {
                            i20 = paddingRight - measuredWidth;
                            i21 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        if (m1231k(i29)) {
                            paddingTop += this.f1240H;
                        }
                        int i31 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        int i32 = i31 + 0;
                        childAt.layout(i22, i32, measuredWidth + i22, measuredHeight2 + i32);
                        i29 += 0;
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i31;
                    } else {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (m1231k(i29)) {
                        paddingTop += this.f1240H;
                    }
                    int i33 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    int i34 = i33 + 0;
                    childAt.layout(i22, i34, measuredWidth + i22, measuredHeight2 + i34);
                    i29 += 0;
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i33;
                }
                i29++;
                i23 = 8;
                i24 = 5;
            }
            return;
        }
        boolean zM1200a = C0318h1.m1200a(this);
        int paddingTop2 = getPaddingTop();
        int i35 = i13 - i11;
        int paddingBottom = i35 - getPaddingBottom();
        int paddingBottom2 = (i35 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i36 = this.f1247e;
        int i37 = 8388615 & i36;
        int i38 = i36 & 112;
        boolean z11 = this.f1243a;
        int[] iArr = this.f1251i;
        int[] iArr2 = this.f1252j;
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i37, C10029b0.e.m18686d(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f1248f;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f1248f) / 2);
        }
        if (zM1200a) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = 1;
            i15 = 0;
        }
        int i39 = paddingLeft;
        int i40 = 0;
        while (i40 < virtualChildCount2) {
            int i41 = (i14 * i40) + i15;
            View childAt2 = getChildAt(i41);
            if (childAt2 == null) {
                i39 += 0;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z11) {
                        i16 = i15;
                        i17 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i18 < 0) {
                            i18 = i38;
                        }
                        i19 = i18 & 112;
                        if (i19 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        } else if (i19 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i19 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m1231k(i41)) {
                            i39 += this.f1254l;
                        }
                        int i42 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        int i43 = i42 + 0;
                        childAt2.layout(i43, measuredHeight, measuredWidth2 + i43, measuredHeight3 + measuredHeight);
                        i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i42;
                        i40 += 0;
                    } else {
                        i16 = i15;
                        i17 = virtualChildCount2;
                    }
                    i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i18 < 0) {
                        i18 = i38;
                    }
                    i19 = i18 & 112;
                    if (i19 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    } else if (i19 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i19 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (m1231k(i41)) {
                        i39 += this.f1254l;
                    }
                    int i44 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    int i45 = i44 + 0;
                    childAt2.layout(i45, measuredHeight, measuredWidth2 + i45, measuredHeight3 + measuredHeight);
                    i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i44;
                    i40 += 0;
                }
                i40++;
                i15 = i16;
                virtualChildCount2 = i17;
                i38 = i38;
            }
            i16 = i15;
            i17 = virtualChildCount2;
            i40++;
            i15 = i16;
            virtualChildCount2 = i17;
            i38 = i38;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0316  */
    /* JADX WARN: Code duplicated, block: B:158:0x0324  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:220:0x04da  */
    /* JADX WARN: Code duplicated, block: B:223:0x0504  */
    /* JADX WARN: Code duplicated, block: B:224:0x0509  */
    /* JADX WARN: Code duplicated, block: B:227:0x0511  */
    /* JADX WARN: Code duplicated, block: B:228:0x0520  */
    /* JADX WARN: Code duplicated, block: B:230:0x0535  */
    /* JADX WARN: Code duplicated, block: B:236:0x0549  */
    /* JADX WARN: Code duplicated, block: B:245:0x0591  */
    /* JADX WARN: Code duplicated, block: B:251:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:254:0x05ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:259:0x05be  */
    /* JADX WARN: Code duplicated, block: B:286:0x0653  */
    /* JADX WARN: Code duplicated, block: B:288:0x0659  */
    /* JADX WARN: Code duplicated, block: B:289:0x065f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0667  */
    /* JADX WARN: Code duplicated, block: B:292:0x066a  */
    /* JADX WARN: Code duplicated, block: B:294:0x0672  */
    /* JADX WARN: Code duplicated, block: B:295:0x0680  */
    /* JADX WARN: Code duplicated, block: B:319:0x070e  */
    /* JADX WARN: Code duplicated, block: B:321:0x0715  */
    /* JADX WARN: Code duplicated, block: B:324:0x0733  */
    /* JADX WARN: Code duplicated, block: B:326:0x0739  */
    /* JADX WARN: Code duplicated, block: B:374:0x0852  */
    /* JADX WARN: Code duplicated, block: B:376:0x0862  */
    /* JADX WARN: Code duplicated, block: B:380:0x0895  */
    /* JADX WARN: Code duplicated, block: B:388:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:395:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:398:0x0904  */
    /* JADX WARN: Code duplicated, block: B:400:0x0910  */
    /* JADX WARN: Code duplicated, block: B:402:0x091c  */
    /* JADX WARN: Code duplicated, block: B:404:0x0929  */
    /* JADX WARN: Code duplicated, block: B:405:0x093f  */
    /* JADX WARN: Code duplicated, block: B:443:0x0940 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        char c10;
        int iMax;
        int i12;
        float f3;
        int iCombineMeasuredStates;
        int i13;
        int i14;
        int i15;
        char c11;
        int i16;
        int iMax2;
        View childAt;
        int i17;
        int i18;
        int i19;
        int i20;
        int baseline;
        int i21;
        int iMakeMeasureSpec;
        View childAt2;
        a aVar;
        int i22;
        int i23;
        View childAt3;
        a aVar2;
        int i24;
        int i25;
        float f10;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z10;
        boolean z11;
        a aVar3;
        int measuredWidth;
        boolean z12;
        int i32;
        boolean z13;
        int i33;
        int measuredHeight;
        boolean z14;
        int iMax3;
        int iMax4;
        int baseline2;
        int i34;
        int i35;
        boolean z15;
        boolean z16;
        int i36;
        int i37;
        boolean z17;
        a aVar4;
        boolean z18;
        int i38;
        boolean z19;
        int iCombineMeasuredStates2;
        int i39 = -2;
        int i40 = Integer.MIN_VALUE;
        int i41 = 8;
        int i42 = 1073741824;
        float f11 = 0.0f;
        int i43 = 0;
        boolean z20 = true;
        if (this.f1246d == 1) {
            this.f1248f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i44 = this.f1244b;
            boolean z21 = this.f1250h;
            boolean z22 = true;
            int i45 = 0;
            int iMax5 = 0;
            int i46 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int i47 = 0;
            boolean z23 = false;
            boolean z24 = false;
            float f12 = 0.0f;
            while (i45 < virtualChildCount) {
                View childAt4 = getChildAt(i45);
                if (childAt4 == null) {
                    this.f1248f += i43;
                } else {
                    if (childAt4.getVisibility() == i41) {
                        i45 += 0;
                    } else {
                        if (m1231k(i45)) {
                            this.f1248f += this.f1240H;
                        }
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) aVar5).weight;
                        f12 += f13;
                        if (mode2 == i42 && ((LinearLayout.LayoutParams) aVar5).height == 0 && f13 > f11) {
                            int i48 = this.f1248f;
                            this.f1248f = Math.max(i48, ((LinearLayout.LayoutParams) aVar5).topMargin + i48 + ((LinearLayout.LayoutParams) aVar5).bottomMargin);
                            aVar4 = aVar5;
                            z18 = true;
                            z17 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar5).height != 0 || f13 <= f11) {
                                i37 = i40;
                            } else {
                                ((LinearLayout.LayoutParams) aVar5).height = i39;
                                i37 = 0;
                            }
                            int i49 = f12 == f11 ? this.f1248f : 0;
                            z17 = true;
                            aVar4 = aVar5;
                            measureChildWithMargins(childAt4, i10, 0, i11, i49);
                            if (i37 != i40) {
                                ((LinearLayout.LayoutParams) aVar4).height = i37;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i50 = this.f1248f;
                            this.f1248f = Math.max(i50, i50 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin + 0);
                            if (z21) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                            z18 = z23;
                        }
                        if (i44 >= 0 && i44 == i45 + 1) {
                            this.f1245c = this.f1248f;
                        }
                        if (i45 < i44 && ((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i38 = mode;
                        if (i38 == 1073741824 || ((LinearLayout.LayoutParams) aVar4).width != -1) {
                            z19 = false;
                        } else {
                            z19 = z17;
                            z24 = z19;
                        }
                        int i51 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i51;
                        int iMax8 = Math.max(i47, measuredWidth2);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(i46, childAt4.getMeasuredState());
                        boolean z25 = (z22 && ((LinearLayout.LayoutParams) aVar4).width == -1) ? z17 : false;
                        if (((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            if (!z19) {
                                i51 = measuredWidth2;
                            }
                            iMax7 = Math.max(iMax7, i51);
                        } else {
                            int i52 = iMax7;
                            if (!z19) {
                                i51 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i51);
                            iMax7 = i52;
                        }
                        i45 += 0;
                        i47 = iMax8;
                        z23 = z18;
                        z22 = z25;
                    }
                    i45++;
                    mode = i38;
                    i44 = i44;
                    i46 = iCombineMeasuredStates2;
                    z20 = z17;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i43 = 0;
                    i39 = -2;
                    i40 = Integer.MIN_VALUE;
                    i41 = 8;
                    i42 = 1073741824;
                    f11 = 0.0f;
                }
                i44 = i44;
                mode2 = mode2;
                i38 = mode;
                virtualChildCount = virtualChildCount;
                iCombineMeasuredStates2 = i46;
                z17 = true;
                i45++;
                mode = i38;
                i44 = i44;
                i46 = iCombineMeasuredStates2;
                z20 = z17;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i43 = 0;
                i39 = -2;
                i40 = Integer.MIN_VALUE;
                i41 = 8;
                i42 = 1073741824;
                f11 = 0.0f;
            }
            int i53 = mode2;
            int i54 = mode;
            int i55 = virtualChildCount;
            boolean z26 = z20;
            int iMax9 = iMax5;
            int iCombineMeasuredStates3 = i46;
            int i56 = iMax6;
            int i57 = iMax7;
            int i58 = i47;
            if (this.f1248f > 0 && m1231k(i55)) {
                this.f1248f += this.f1240H;
            }
            int i59 = i53;
            if (z21 && (i59 == Integer.MIN_VALUE || i59 == 0)) {
                int i60 = 0;
                this.f1248f = 0;
                int i61 = 0;
                while (i61 < i55) {
                    View childAt5 = getChildAt(i61);
                    if (childAt5 == null) {
                        this.f1248f += i60;
                    } else if (childAt5.getVisibility() == 8) {
                        i61 += 0;
                    } else {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        int i62 = this.f1248f;
                        this.f1248f = Math.max(i62, i62 + i56 + ((LinearLayout.LayoutParams) aVar6).topMargin + ((LinearLayout.LayoutParams) aVar6).bottomMargin + 0);
                    }
                    i61++;
                    i60 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f1248f;
            this.f1248f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i63 = (16777215 & iResolveSizeAndState) - this.f1248f;
            if (z23 || (i63 != 0 && f12 > 0.0f)) {
                float f14 = this.f1249g;
                if (f14 > 0.0f) {
                    f12 = f14;
                }
                this.f1248f = 0;
                int i64 = 0;
                while (i64 < i55) {
                    View childAt6 = getChildAt(i64);
                    if (childAt6.getVisibility() != 8) {
                        a aVar7 = (a) childAt6.getLayoutParams();
                        float f15 = ((LinearLayout.LayoutParams) aVar7).weight;
                        if (f15 > 0.0f) {
                            int i65 = (int) ((i63 * f15) / f12);
                            f12 -= f15;
                            int i66 = i63 - i65;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin, ((LinearLayout.LayoutParams) aVar7).width);
                            if (((LinearLayout.LayoutParams) aVar7).height == 0) {
                                i36 = 1073741824;
                                if (i59 == 1073741824) {
                                    if (i65 <= 0) {
                                        i65 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i65, 1073741824));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                i63 = i66;
                            } else {
                                i36 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i65;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i36));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i63 = i66;
                        }
                        int i67 = ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i67;
                        int iMax10 = Math.max(i58, measuredWidth3);
                        if (i54 != 1073741824) {
                            i34 = iMax10;
                            i35 = -1;
                            z15 = ((LinearLayout.LayoutParams) aVar7).width == -1 ? z26 : false;
                            if (!z15) {
                                i67 = measuredWidth3;
                            }
                            int iMax11 = Math.max(iMax9, i67);
                            if (z22 || ((LinearLayout.LayoutParams) aVar7).width != i35) {
                                z16 = false;
                            } else {
                                z16 = z26;
                            }
                            int i68 = this.f1248f;
                            this.f1248f = Math.max(i68, childAt6.getMeasuredHeight() + i68 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin + 0);
                            z22 = z16;
                            i58 = i34;
                            iMax9 = iMax11;
                        } else {
                            i34 = iMax10;
                            i35 = -1;
                        }
                        if (!z15) {
                            i67 = measuredWidth3;
                        }
                        int iMax12 = Math.max(iMax9, i67);
                        if (z22) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        int i69 = this.f1248f;
                        this.f1248f = Math.max(i69, childAt6.getMeasuredHeight() + i69 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin + 0);
                        z22 = z16;
                        i58 = i34;
                        iMax9 = iMax12;
                    }
                    i64++;
                    i59 = i59;
                }
                this.f1248f = getPaddingBottom() + getPaddingTop() + this.f1248f;
            } else {
                iMax9 = Math.max(iMax9, i57);
                if (z21 && i59 != 1073741824) {
                    for (int i70 = 0; i70 < i55; i70++) {
                        View childAt7 = getChildAt(i70);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                        }
                    }
                }
            }
            int i71 = i58;
            if (z22 || i54 == 1073741824) {
                iMax9 = i71;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax9, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z24) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i72 = 0; i72 < i55; i72++) {
                    View childAt8 = getChildAt(i72);
                    if (childAt8.getVisibility() != 8) {
                        a aVar8 = (a) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar8).width == -1) {
                            int i73 = ((LinearLayout.LayoutParams) aVar8).height;
                            ((LinearLayout.LayoutParams) aVar8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i11, 0);
                            ((LinearLayout.LayoutParams) aVar8).height = i73;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1248f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (this.f1251i == null || this.f1252j == null) {
            this.f1251i = new int[4];
            this.f1252j = new int[4];
        }
        int[] iArr = this.f1251i;
        int[] iArr2 = this.f1252j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z27 = this.f1243a;
        boolean z28 = this.f1250h;
        boolean z29 = mode3 == 1073741824;
        boolean z30 = true;
        int i74 = 0;
        float f16 = 0.0f;
        int i75 = 0;
        int i76 = 0;
        int iMax13 = 0;
        int i77 = 0;
        boolean z31 = false;
        boolean z32 = false;
        int i78 = 0;
        while (i76 < virtualChildCount2) {
            View childAt9 = getChildAt(i76);
            if (childAt9 == null) {
                this.f1248f += 0;
                i24 = i74;
                i25 = i75;
            } else {
                i24 = i74;
                i25 = i75;
                if (childAt9.getVisibility() == 8) {
                    i76 += 0;
                } else {
                    if (m1231k(i76)) {
                        this.f1248f += this.f1254l;
                    }
                    a aVar9 = (a) childAt9.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar9).weight;
                    float f18 = f16 + f17;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar9).width == 0 && f17 > 0.0f) {
                        if (z29) {
                            this.f1248f = ((LinearLayout.LayoutParams) aVar9).leftMargin + ((LinearLayout.LayoutParams) aVar9).rightMargin + this.f1248f;
                        } else {
                            int i79 = this.f1248f;
                            this.f1248f = Math.max(i79, ((LinearLayout.LayoutParams) aVar9).leftMargin + i79 + ((LinearLayout.LayoutParams) aVar9).rightMargin);
                        }
                        if (z27) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            aVar3 = aVar9;
                            i28 = i24;
                            i29 = i25;
                            i31 = i76;
                            z10 = z28;
                            z11 = z27;
                        } else {
                            aVar3 = aVar9;
                            i28 = i24;
                            i29 = i25;
                            i31 = i76;
                            i32 = 1073741824;
                            z10 = z28;
                            z11 = z27;
                            z12 = true;
                        }
                        if (mode4 == i32 && ((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z13 = true;
                            z32 = true;
                        } else {
                            z13 = false;
                        }
                        i33 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i33;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i77, childAt9.getMeasuredState());
                        if (!z11 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i80 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i80 < 0) {
                                i80 = this.f1247e;
                            }
                            int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                            iArr[i81] = Math.max(iArr[i81], baseline2);
                            iArr2[i81] = Math.max(iArr2[i81], measuredHeight - baseline2);
                        }
                        int iMax14 = Math.max(i78, measuredHeight);
                        if (z30 || ((LinearLayout.LayoutParams) aVar3).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (z13) {
                                measuredHeight = i33;
                            }
                            iMax3 = Math.max(i29, measuredHeight);
                            iMax4 = i28;
                        } else {
                            iMax3 = i29;
                            if (z13) {
                                measuredHeight = i33;
                            }
                            iMax4 = Math.max(i28, measuredHeight);
                        }
                        i78 = iMax14;
                        i74 = iMax4;
                        i77 = iCombineMeasuredStates4;
                        z31 = z12;
                        i76 = i31 + 0;
                        z30 = z14;
                        i75 = iMax3;
                        f16 = f18;
                    } else {
                        int i82 = i76;
                        if (((LinearLayout.LayoutParams) aVar9).width == 0) {
                            f10 = 0.0f;
                            if (f17 > 0.0f) {
                                ((LinearLayout.LayoutParams) aVar9).width = -2;
                                i26 = 0;
                            }
                            if (f18 == f10) {
                                i27 = this.f1248f;
                            } else {
                                i27 = 0;
                            }
                            i28 = i24;
                            i29 = i25;
                            i30 = i26;
                            i31 = i82;
                            z10 = z28;
                            z11 = z27;
                            measureChildWithMargins(childAt9, i10, i27, i11, 0);
                            if (i30 != Integer.MIN_VALUE) {
                                aVar3 = aVar9;
                                ((LinearLayout.LayoutParams) aVar3).width = i30;
                            } else {
                                aVar3 = aVar9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z29) {
                                this.f1248f = ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + 0 + this.f1248f;
                            } else {
                                int i83 = this.f1248f;
                                this.f1248f = Math.max(i83, i83 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + 0);
                            }
                            if (z10) {
                                iMax13 = Math.max(measuredWidth, iMax13);
                            }
                        } else {
                            f10 = 0.0f;
                        }
                        i26 = Integer.MIN_VALUE;
                        if (f18 == f10) {
                            i27 = this.f1248f;
                        } else {
                            i27 = 0;
                        }
                        i28 = i24;
                        i29 = i25;
                        i30 = i26;
                        i31 = i82;
                        z10 = z28;
                        z11 = z27;
                        measureChildWithMargins(childAt9, i10, i27, i11, 0);
                        if (i30 != Integer.MIN_VALUE) {
                            aVar3 = aVar9;
                            ((LinearLayout.LayoutParams) aVar3).width = i30;
                        } else {
                            aVar3 = aVar9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z29) {
                            this.f1248f = ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + 0 + this.f1248f;
                        } else {
                            int i84 = this.f1248f;
                            this.f1248f = Math.max(i84, i84 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + 0);
                        }
                        if (z10) {
                            iMax13 = Math.max(measuredWidth, iMax13);
                        }
                    }
                    z12 = z31;
                    i32 = 1073741824;
                    if (mode4 == i32) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    i33 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i33;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i77, childAt9.getMeasuredState());
                    if (!z11) {
                    }
                    int iMax15 = Math.max(i78, measuredHeight);
                    if (z30) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (z13) {
                            measuredHeight = i33;
                        }
                        iMax3 = Math.max(i29, measuredHeight);
                        iMax4 = i28;
                    } else {
                        iMax3 = i29;
                        if (z13) {
                            measuredHeight = i33;
                        }
                        iMax4 = Math.max(i28, measuredHeight);
                    }
                    i78 = iMax15;
                    i74 = iMax4;
                    i77 = iCombineMeasuredStates5;
                    z31 = z12;
                    i76 = i31 + 0;
                    z30 = z14;
                    i75 = iMax3;
                    f16 = f18;
                }
                i76++;
                z28 = z10;
                z27 = z11;
            }
            z11 = z27;
            i74 = i24;
            i75 = i25;
            z10 = z28;
            i76++;
            z28 = z10;
            z27 = z11;
        }
        boolean z33 = z28;
        boolean z34 = z27;
        int i85 = i74;
        int i86 = i78;
        if (this.f1248f > 0 && m1231k(virtualChildCount2)) {
            this.f1248f += this.f1254l;
        }
        int i87 = iArr[1];
        int i88 = i77;
        if (i87 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                iMax = i86;
            }
            if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                i22 = 0;
                this.f1248f = 0;
                i23 = 0;
                while (i23 < virtualChildCount2) {
                    childAt3 = getChildAt(i23);
                    if (childAt3 == null) {
                        this.f1248f += i22;
                    } else if (childAt3.getVisibility() == 8) {
                        i23 += 0;
                    } else {
                        aVar2 = (a) childAt3.getLayoutParams();
                        if (z29) {
                            this.f1248f = ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax13 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + this.f1248f;
                        } else {
                            int i89 = this.f1248f;
                            this.f1248f = Math.max(i89, i89 + iMax13 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0);
                        }
                    }
                    i23++;
                    i22 = 0;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f1248f;
            this.f1248f = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
            i12 = (16777215 & iResolveSizeAndState2) - this.f1248f;
            if (!z31 || (i12 != 0 && f16 > 0.0f)) {
                f3 = this.f1249g;
                if (f3 > 0.0f) {
                    f16 = f3;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f1248f = 0;
                iCombineMeasuredStates = i88;
                int iMax16 = -1;
                i13 = 0;
                while (i13 < virtualChildCount2) {
                    childAt = getChildAt(i13);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i17 = i12;
                        i18 = mode4;
                    } else {
                        a aVar10 = (a) childAt.getLayoutParams();
                        float f19 = ((LinearLayout.LayoutParams) aVar10).weight;
                        if (f19 > 0.0f) {
                            int i90 = (int) ((i12 * f19) / f16);
                            float f20 = f16 - f19;
                            int i91 = i12 - i90;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin, ((LinearLayout.LayoutParams) aVar10).height);
                            if (((LinearLayout.LayoutParams) aVar10).width == 0) {
                                i21 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i90 <= 0) {
                                        i90 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i90, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f16 = f20;
                                i19 = i91;
                            } else {
                                i21 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i90;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i21), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f16 = f20;
                            i19 = i91;
                        } else {
                            i19 = i12;
                        }
                        if (z29) {
                            this.f1248f = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + 0 + this.f1248f;
                        } else {
                            int i92 = this.f1248f;
                            this.f1248f = Math.max(i92, childAt.getMeasuredWidth() + i92 + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + 0);
                        }
                        i18 = mode4;
                        boolean z35 = i18 != 1073741824 && ((LinearLayout.LayoutParams) aVar10).height == -1;
                        int i93 = ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i93;
                        iMax16 = Math.max(iMax16, measuredHeight4);
                        if (!z35) {
                            i93 = measuredHeight4;
                        }
                        int iMax17 = Math.max(i85, i93);
                        if (z30) {
                            i20 = -1;
                            boolean z36 = ((LinearLayout.LayoutParams) aVar10).height == -1;
                            if (!z34 && (baseline = childAt.getBaseline()) != i20) {
                                int i94 = ((LinearLayout.LayoutParams) aVar10).gravity;
                                if (i94 < 0) {
                                    i94 = this.f1247e;
                                }
                                int i95 = (((i94 & 112) >> 4) & (-2)) >> 1;
                                iArr[i95] = Math.max(iArr[i95], baseline);
                                iArr2[i95] = Math.max(iArr2[i95], measuredHeight4 - baseline);
                            }
                            z30 = z36;
                            i17 = i19;
                            i85 = iMax17;
                            f16 = f16;
                        } else {
                            i20 = -1;
                        }
                        if (!z34) {
                        }
                        z30 = z36;
                        i17 = i19;
                        i85 = iMax17;
                        f16 = f16;
                    }
                    i13++;
                    i12 = i17;
                    mode4 = i18;
                    mode3 = mode3;
                }
                i14 = mode4;
                this.f1248f = getPaddingRight() + getPaddingLeft() + this.f1248f;
                i15 = iArr[1];
                if (i15 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c11 = 3;
                    if (iArr[3] == -1) {
                        iMax = iMax16;
                        i16 = 0;
                    }
                    iMax2 = i85;
                } else {
                    c11 = 3;
                }
                i16 = 0;
                iMax = Math.max(iMax16, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
                iMax2 = i85;
            } else {
                iMax2 = Math.max(i85, i75);
                if (z33 && mode3 != 1073741824) {
                    for (int i96 = 0; i96 < virtualChildCount2; i96++) {
                        View childAt10 = getChildAt(i96);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax13, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                iCombineMeasuredStates = i88;
                i14 = mode4;
                i16 = 0;
            }
            if (z30 || i14 == 1073741824) {
                iMax2 = iMax;
            }
            setMeasuredDimension(iResolveSizeAndState2 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax2, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates << 16));
            if (z32) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                while (i16 < virtualChildCount2) {
                    childAt2 = getChildAt(i16);
                    if (childAt2.getVisibility() != 8) {
                        aVar = (a) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar).height == -1) {
                            int i97 = ((LinearLayout.LayoutParams) aVar).width;
                            ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) aVar).width = i97;
                        }
                    }
                    i16++;
                }
            }
        }
        c10 = 3;
        iMax = Math.max(i86, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i87, iArr[2]))));
        if (z33) {
            i22 = 0;
            this.f1248f = 0;
            i23 = 0;
            while (i23 < virtualChildCount2) {
                childAt3 = getChildAt(i23);
                if (childAt3 == null) {
                    this.f1248f += i22;
                } else if (childAt3.getVisibility() == 8) {
                    i23 += 0;
                } else {
                    aVar2 = (a) childAt3.getLayoutParams();
                    if (z29) {
                        this.f1248f = ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax13 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + this.f1248f;
                    } else {
                        int i810 = this.f1248f;
                        this.f1248f = Math.max(i810, i810 + iMax13 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0);
                    }
                }
                i23++;
                i22 = 0;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f1248f;
        this.f1248f = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
        i12 = (16777215 & iResolveSizeAndState3) - this.f1248f;
        if (z31) {
            f3 = this.f1249g;
            if (f3 > 0.0f) {
                f16 = f3;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1248f = 0;
            iCombineMeasuredStates = i88;
            int iMax18 = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    i18 = mode4;
                } else {
                    i17 = i12;
                    i18 = mode4;
                }
                i13++;
                i12 = i17;
                mode4 = i18;
                mode3 = mode3;
            }
            i14 = mode4;
            this.f1248f = getPaddingRight() + getPaddingLeft() + this.f1248f;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax18, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax18, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            iMax2 = i85;
        } else {
            f3 = this.f1249g;
            if (f3 > 0.0f) {
                f16 = f3;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1248f = 0;
            iCombineMeasuredStates = i88;
            int iMax19 = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    i18 = mode4;
                } else {
                    i17 = i12;
                    i18 = mode4;
                }
                i13++;
                i12 = i17;
                mode4 = i18;
                mode3 = mode3;
            }
            i14 = mode4;
            this.f1248f = getPaddingRight() + getPaddingLeft() + this.f1248f;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax19, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax19, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            iMax2 = i85;
        }
        if (z30) {
            iMax2 = iMax;
        } else {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState3 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax2, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates << 16));
        if (z32) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            while (i16 < virtualChildCount2) {
                childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    aVar = (a) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).height == -1) {
                        int i98 = ((LinearLayout.LayoutParams) aVar).width;
                        ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) aVar).width = i98;
                    }
                }
                i16++;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1243a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1244b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1253k) {
            return;
        }
        this.f1253k = drawable;
        if (drawable != null) {
            this.f1254l = drawable.getIntrinsicWidth();
            this.f1240H = drawable.getIntrinsicHeight();
        } else {
            this.f1254l = 0;
            this.f1240H = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1242J = i10;
    }

    public void setGravity(int i10) {
        if (this.f1247e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1247e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1247e;
        if ((8388615 & i12) != i11) {
            this.f1247e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1250h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1246d != i10) {
            this.f1246d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1241I) {
            requestLayout();
        }
        this.f1241I = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1247e;
        if ((i12 & 112) != i11) {
            this.f1247e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f1249g = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
