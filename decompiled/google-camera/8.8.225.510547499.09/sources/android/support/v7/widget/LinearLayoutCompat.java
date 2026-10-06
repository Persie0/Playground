package android.support.v7.widget;

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
import androidx.wear.ambient.AmbientDelegate;
import p000.C0193fr;
import p000.C0783kw;
import p000.C0864nw;
import p000.afc;
import p000.afn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private boolean f1025a;

    /* JADX INFO: renamed from: b */
    private int f1026b;

    /* JADX INFO: renamed from: c */
    private int f1027c;

    /* JADX INFO: renamed from: d */
    private int f1028d;

    /* JADX INFO: renamed from: e */
    private int f1029e;

    /* JADX INFO: renamed from: f */
    public int f1030f;

    /* JADX INFO: renamed from: g */
    public Drawable f1031g;

    /* JADX INFO: renamed from: h */
    public int f1032h;

    /* JADX INFO: renamed from: i */
    private float f1033i;

    /* JADX INFO: renamed from: j */
    private boolean f1034j;

    /* JADX INFO: renamed from: k */
    private int[] f1035k;

    /* JADX INFO: renamed from: l */
    private int[] f1036l;

    /* JADX INFO: renamed from: m */
    private int f1037m;

    /* JADX INFO: renamed from: n */
    private int f1038n;

    /* JADX INFO: renamed from: o */
    private int f1039o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private static void m1118a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: bX, reason: merged with bridge method [inline-methods] */
    public C0783kw generateDefaultLayoutParams() {
        int i = this.f1028d;
        if (i == 0) {
            return new C0783kw(-2);
        }
        if (i == 1) {
            return new C0783kw(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: bY, reason: merged with bridge method [inline-methods] */
    public C0783kw generateLayoutParams(AttributeSet attributeSet) {
        return new C0783kw(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: bZ, reason: merged with bridge method [inline-methods] */
    public C0783kw generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0783kw) {
            return new C0783kw((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0783kw((ViewGroup.MarginLayoutParams) layoutParams) : new C0783kw(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0783kw;
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.f1026b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1026b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1026b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1027c;
        if (this.f1028d == 1 && (i = this.f1030f & 112) != 48) {
            switch (i) {
                case 16:
                    bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1029e) / 2;
                    break;
                case 80:
                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1029e;
                    break;
            }
        }
        return bottom + ((C0783kw) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX INFO: renamed from: p */
    final void m1119p(Canvas canvas, int i) {
        this.f1031g.setBounds(getPaddingLeft() + this.f1039o, i, (getWidth() - getPaddingRight()) - this.f1039o, this.f1037m + i);
        this.f1031g.draw(canvas);
    }

    /* JADX INFO: renamed from: q */
    final void m1120q(Canvas canvas, int i) {
        this.f1031g.setBounds(i, getPaddingTop() + this.f1039o, this.f1032h + i, (getHeight() - getPaddingBottom()) - this.f1039o);
        this.f1031g.draw(canvas);
    }

    /* JADX INFO: renamed from: r */
    public final void m1121r(int i) {
        if (this.f1028d != i) {
            this.f1028d = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    protected final boolean m1122s(int i) {
        if (i == 0) {
            return (this.f1038n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1038n & 4) != 0;
        }
        if ((this.f1038n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m1123t() {
        this.f1025a = false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1025a = true;
        this.f1026b = -1;
        this.f1027c = 0;
        this.f1030f = 8388659;
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23270n, i, 0);
        afn.m536c(this, context, C0193fr.f23270n, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        int iM1613p = ambientDelegateM1568D.m1613p(1, -1);
        if (iM1613p >= 0) {
            m1121r(iM1613p);
        }
        int iM1613p2 = ambientDelegateM1568D.m1613p(0, -1);
        if (iM1613p2 >= 0 && this.f1030f != iM1613p2) {
            iM1613p2 = (8388615 & iM1613p2) == 0 ? iM1613p2 | 8388611 : iM1613p2;
            this.f1030f = (iM1613p2 & 112) == 0 ? iM1613p2 | 48 : iM1613p2;
            requestLayout();
        }
        if (!ambientDelegateM1568D.m1623z(2, true)) {
            m1123t();
        }
        this.f1033i = ((TypedArray) ambientDelegateM1568D.f1686b).getFloat(4, -1.0f);
        this.f1026b = ambientDelegateM1568D.m1613p(3, -1);
        this.f1034j = ambientDelegateM1568D.m1623z(7, false);
        Drawable drawableM1618u = ambientDelegateM1568D.m1618u(5);
        if (drawableM1618u != this.f1031g) {
            this.f1031g = drawableM1618u;
            if (drawableM1618u != null) {
                this.f1032h = drawableM1618u.getIntrinsicWidth();
                this.f1037m = drawableM1618u.getIntrinsicHeight();
            } else {
                this.f1032h = 0;
                this.f1037m = 0;
            }
            setWillNotDraw(drawableM1618u == null);
            requestLayout();
        }
        this.f1038n = ambientDelegateM1568D.m1613p(8, 0);
        this.f1039o = ambientDelegateM1568D.m1612o(6, 0);
        ambientDelegateM1568D.m1622y();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int left;
        int bottom;
        if (this.f1031g == null) {
            return;
        }
        int i = 0;
        if (this.f1028d == 1) {
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && m1122s(i)) {
                    m1119p(canvas, (childAt.getTop() - ((C0783kw) childAt.getLayoutParams()).topMargin) - this.f1037m);
                }
                i++;
            }
            if (m1122s(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1037m;
                } else {
                    bottom = childAt2.getBottom() + ((C0783kw) childAt2.getLayoutParams()).bottomMargin;
                }
                m1119p(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zM17748a = C0864nw.m17748a(this);
        while (i < childCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m1122s(i)) {
                C0783kw c0783kw = (C0783kw) childAt3.getLayoutParams();
                m1120q(canvas, zM17748a ? childAt3.getRight() + c0783kw.rightMargin : (childAt3.getLeft() - c0783kw.leftMargin) - this.f1032h);
            }
            i++;
        }
        if (m1122s(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 == null) {
                left = zM17748a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f1032h;
            } else {
                C0783kw c0783kw2 = (C0783kw) childAt4.getLayoutParams();
                left = zM17748a ? (childAt4.getLeft() - c0783kw2.leftMargin) - this.f1032h : childAt4.getRight() + c0783kw2.rightMargin;
            }
            m1120q(canvas, left);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int baseline;
        int i9;
        int measuredHeight;
        int paddingTop;
        int i10;
        int i11 = 8;
        if (this.f1028d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i12 = i3 - i;
            int paddingRight = i12 - getPaddingRight();
            int paddingRight2 = (i12 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i13 = this.f1030f;
            int i14 = 8388615 & i13;
            switch (i13 & 112) {
                case 16:
                    paddingTop = getPaddingTop() + (((i4 - i2) - this.f1029e) / 2);
                    break;
                case 80:
                    paddingTop = ((getPaddingTop() + i4) - i2) - this.f1029e;
                    break;
                default:
                    paddingTop = getPaddingTop();
                    break;
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt != null && childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0783kw c0783kw = (C0783kw) childAt.getLayoutParams();
                    int i16 = c0783kw.gravity;
                    if (i16 < 0) {
                        i16 = i14;
                    }
                    switch (Gravity.getAbsoluteGravity(i16, afc.m442c(this)) & 7) {
                        case 1:
                            i10 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft2) + c0783kw.leftMargin) - c0783kw.rightMargin;
                            break;
                        case 5:
                            i10 = (paddingRight - measuredWidth) - c0783kw.rightMargin;
                            break;
                        default:
                            i10 = c0783kw.leftMargin + paddingLeft2;
                            break;
                    }
                    if (m1122s(i15)) {
                        paddingTop += this.f1037m;
                    }
                    int i17 = paddingTop + c0783kw.topMargin;
                    m1118a(childAt, i10, i17, measuredWidth, measuredHeight2);
                    paddingTop = i17 + measuredHeight2 + c0783kw.bottomMargin;
                }
            }
            return;
        }
        boolean zM17748a = C0864nw.m17748a(this);
        int paddingTop2 = getPaddingTop();
        int i18 = i4 - i2;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingBottom2 = (i18 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i19 = this.f1030f;
        int i20 = 8388615 & i19;
        int i21 = i19 & 112;
        boolean z3 = this.f1025a;
        int[] iArr = this.f1035k;
        int[] iArr2 = this.f1036l;
        switch (Gravity.getAbsoluteGravity(i20, afc.m442c(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1029e) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f1029e;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (zM17748a) {
            i5 = childCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i22 = 0;
        while (i22 < childCount2) {
            int i23 = i5 + (i6 * i22);
            View childAt2 = getChildAt(i23);
            if (childAt2 != null) {
                i7 = i5;
                if (childAt2.getVisibility() != i11) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0783kw c0783kw2 = (C0783kw) childAt2.getLayoutParams();
                    if (z3) {
                        i8 = i21;
                        z2 = z3;
                        baseline = c0783kw2.height != -1 ? childAt2.getBaseline() : -1;
                        i9 = c0783kw2.gravity;
                        if (i9 < 0) {
                            i9 = i8;
                        }
                        switch (i9 & 112) {
                            case 16:
                                measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + c0783kw2.topMargin) - c0783kw2.bottomMargin;
                                break;
                            case 48:
                                measuredHeight = paddingTop2 + c0783kw2.topMargin;
                                if (baseline != -1) {
                                    measuredHeight += iArr[1] - baseline;
                                }
                                break;
                            case 80:
                                measuredHeight = (paddingBottom - measuredHeight3) - c0783kw2.bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                                break;
                            default:
                                measuredHeight = paddingTop2;
                                break;
                        }
                        if (m1122s(i23)) {
                            paddingLeft += this.f1032h;
                        }
                        int i24 = paddingLeft + c0783kw2.leftMargin;
                        m1118a(childAt2, i24, measuredHeight, measuredWidth2, measuredHeight3);
                        paddingLeft = i24 + measuredWidth2 + c0783kw2.rightMargin;
                    } else {
                        i8 = i21;
                        z2 = z3;
                    }
                    i9 = c0783kw2.gravity;
                    if (i9 < 0) {
                        i9 = i8;
                    }
                    switch (i9 & 112) {
                        case 16:
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + c0783kw2.topMargin) - c0783kw2.bottomMargin;
                            break;
                        case 48:
                            measuredHeight = paddingTop2 + c0783kw2.topMargin;
                            if (baseline != -1) {
                                measuredHeight += iArr[1] - baseline;
                            }
                            break;
                        case 80:
                            measuredHeight = (paddingBottom - measuredHeight3) - c0783kw2.bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                            break;
                        default:
                            measuredHeight = paddingTop2;
                            break;
                    }
                    if (m1122s(i23)) {
                        paddingLeft += this.f1032h;
                    }
                    int i25 = paddingLeft + c0783kw2.leftMargin;
                    m1118a(childAt2, i25, measuredHeight, measuredWidth2, measuredHeight3);
                    paddingLeft = i25 + measuredWidth2 + c0783kw2.rightMargin;
                } else {
                    paddingBottom = paddingBottom;
                    i8 = i21;
                    z2 = z3;
                }
            } else {
                i7 = i5;
                paddingBottom = paddingBottom;
                i8 = i21;
                z2 = z3;
            }
            i22++;
            i5 = i7;
            childCount2 = childCount2;
            i21 = i8;
            z3 = z2;
            paddingBottom = paddingBottom;
            i11 = 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0312  */
    /* JADX WARN: Code duplicated, block: B:215:0x0491  */
    /* JADX WARN: Code duplicated, block: B:216:0x0496  */
    /* JADX WARN: Code duplicated, block: B:219:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:223:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:225:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ee A[PHI: r7 r8 r26 r28 r30 r37
      0x04ee: PHI (r7v30 int) = (r7v20 int), (r7v32 int) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]
      0x04ee: PHI (r8v24 kw) = (r8v18 kw), (r8v26 kw) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]
      0x04ee: PHI (r26v8 int) = (r2v1 int), (r26v11 int) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]
      0x04ee: PHI (r28v8 boolean) = (r28v5 boolean), (r28v10 boolean) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]
      0x04ee: PHI (r30v4 boolean) = (r30v2 boolean), (r30v6 boolean) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]
      0x04ee: PHI (r37v2 int) = (r37v0 int), (r37v4 int) binds: [B:224:0x04e5, B:200:0x0448] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:232:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:235:0x0514  */
    /* JADX WARN: Code duplicated, block: B:239:0x051f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0522  */
    /* JADX WARN: Code duplicated, block: B:244:0x0545  */
    /* JADX WARN: Code duplicated, block: B:247:0x054c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0554  */
    /* JADX WARN: Code duplicated, block: B:252:0x0557  */
    /* JADX WARN: Code duplicated, block: B:255:0x0561  */
    /* JADX WARN: Code duplicated, block: B:257:0x0566  */
    /* JADX WARN: Code duplicated, block: B:323:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:325:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:328:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:330:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:332:0x0705  */
    /* JADX WARN: Code duplicated, block: B:334:0x0713  */
    /* JADX WARN: Code duplicated, block: B:336:0x073c  */
    /* JADX WARN: Code duplicated, block: B:343:0x074e  */
    /* JADX WARN: Code duplicated, block: B:345:0x0755  */
    /* JADX WARN: Code duplicated, block: B:348:0x076f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0778  */
    /* JADX WARN: Code duplicated, block: B:352:0x078f  */
    /* JADX WARN: Code duplicated, block: B:355:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:358:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:361:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:362:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:365:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:367:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:368:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:371:0x07da  */
    /* JADX WARN: Code duplicated, block: B:378:0x0803  */
    /* JADX WARN: Code duplicated, block: B:380:0x080d  */
    /* JADX WARN: Code duplicated, block: B:381:0x0817  */
    /* JADX WARN: Code duplicated, block: B:385:0x0847  */
    /* JADX WARN: Code duplicated, block: B:387:0x084c  */
    /* JADX WARN: Code duplicated, block: B:393:0x085b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:394:0x085c A[PHI: r2
      0x085c: PHI (r2v12 int) = (r2v11 int), (r2v18 int), (r2v19 int) binds: [B:384:0x0845, B:393:0x085b, B:391:0x0854] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:401:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:404:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:406:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:408:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:409:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:444:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int iResolveSizeAndState;
        int i4;
        float f;
        int i5;
        int iCombineMeasuredStates;
        int i6;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax3;
        int i12;
        View childAt;
        int i13;
        int i14;
        C0783kw c0783kw;
        float f2;
        int i15;
        boolean z;
        int i16;
        int measuredHeight;
        int i17;
        int i18;
        int baseline;
        int i19;
        int childMeasureSpec;
        int measuredWidth;
        int iMakeMeasureSpec;
        int i20;
        int i21;
        View childAt2;
        C0783kw c0783kw2;
        int i22;
        int i23;
        float f3;
        byte b;
        int i24;
        int i25;
        int i26;
        C0783kw c0783kw3;
        int i27;
        int measuredWidth2;
        boolean z2;
        boolean z3;
        int i28;
        int measuredHeight2;
        boolean z4;
        int baseline2;
        int i29;
        int i30;
        int i31;
        int iMax4;
        int i32;
        boolean z5;
        int i33;
        View childAt3;
        byte b2;
        int i34;
        C0783kw c0783kw4;
        boolean z6;
        int i35 = -2;
        int i36 = 8;
        float f4 = 0.0f;
        int i37 = 1073741824;
        if (this.f1028d == 1) {
            this.f1029e = 0;
            int childCount = getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i38 = this.f1026b;
            boolean z7 = this.f1034j;
            int i39 = 0;
            float f5 = 0.0f;
            int iMax5 = 0;
            int iMax6 = 0;
            boolean z8 = false;
            int iMax7 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z9 = true;
            boolean z10 = false;
            while (i39 < childCount) {
                View childAt4 = getChildAt(i39);
                if (childAt4 == null || childAt4.getVisibility() == i36) {
                    iMax6 = iMax6;
                    iMax5 = iMax5;
                    i40 = i40;
                    iMax7 = iMax7;
                    i41 = i41;
                } else {
                    if (m1122s(i39)) {
                        this.f1029e += this.f1037m;
                    }
                    C0783kw c0783kw5 = (C0783kw) childAt4.getLayoutParams();
                    f5 += c0783kw5.weight;
                    if (mode2 == i37 && c0783kw5.height == 0 && c0783kw5.weight > f4) {
                        int i42 = this.f1029e;
                        this.f1029e = Math.max(i42, c0783kw5.topMargin + i42 + c0783kw5.bottomMargin);
                        i38 = i38;
                        mode2 = mode2;
                        i34 = mode;
                        childCount = childCount;
                        c0783kw4 = c0783kw5;
                        z8 = true;
                    } else {
                        if (c0783kw5.height != 0 || c0783kw5.weight <= f4) {
                            b2 = -2147483648;
                        } else {
                            c0783kw5.height = i35;
                            b2 = 0;
                        }
                        i38 = i38;
                        mode2 = mode2;
                        i34 = mode;
                        childCount = childCount;
                        measureChildWithMargins(childAt4, i, 0, i2, f5 == f4 ? this.f1029e : 0);
                        if (b2 != -2147483648) {
                            c0783kw4 = c0783kw5;
                            c0783kw4.height = 0;
                        } else {
                            c0783kw4 = c0783kw5;
                        }
                        int measuredHeight3 = childAt4.getMeasuredHeight();
                        int i43 = this.f1029e;
                        this.f1029e = Math.max(i43, i43 + measuredHeight3 + c0783kw4.topMargin + c0783kw4.bottomMargin);
                        if (z7) {
                            iMax7 = Math.max(measuredHeight3, iMax7);
                        }
                    }
                    if (i38 >= 0 && i38 == i39 + 1) {
                        this.f1027c = this.f1029e;
                    }
                    if (i39 < i38 && c0783kw4.weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    mode = i34;
                    if (mode == 1073741824 || c0783kw4.width != -1) {
                        z6 = false;
                    } else {
                        z6 = true;
                        z10 = true;
                    }
                    int i44 = c0783kw4.leftMargin + c0783kw4.rightMargin;
                    int measuredWidth3 = childAt4.getMeasuredWidth() + i44;
                    int iMax8 = Math.max(i40, measuredWidth3);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i41, childAt4.getMeasuredState());
                    boolean z11 = z9 && c0783kw4.width == -1;
                    if (c0783kw4.weight > 0.0f) {
                        if (true != z6) {
                            i44 = measuredWidth3;
                        }
                        iMax6 = Math.max(iMax6, i44);
                    } else {
                        int i45 = iMax6;
                        if (true != z6) {
                            i44 = measuredWidth3;
                        }
                        iMax5 = Math.max(iMax5, i44);
                        iMax6 = i45;
                    }
                    i40 = iMax8;
                    i41 = iCombineMeasuredStates2;
                    z9 = z11;
                }
                i39++;
                mode = mode;
                i38 = i38;
                mode2 = mode2;
                childCount = childCount;
                i35 = -2;
                i36 = 8;
                f4 = 0.0f;
                i37 = 1073741824;
            }
            int i46 = mode2;
            int i47 = mode;
            int i48 = childCount;
            int iMax9 = iMax5;
            int i49 = iMax6;
            int i50 = iMax7;
            int i51 = i40;
            int iCombineMeasuredStates3 = i41;
            if (this.f1029e > 0) {
                i30 = i48;
                if (m1122s(i30)) {
                    this.f1029e += this.f1037m;
                }
            } else {
                i30 = i48;
            }
            if (z7) {
                i31 = i46;
                if (i31 == Integer.MIN_VALUE) {
                    this.f1029e = 0;
                    for (i33 = 0; i33 < i30; i33++) {
                        childAt3 = getChildAt(i33);
                        if (childAt3 != null && childAt3.getVisibility() != 8) {
                            C0783kw c0783kw6 = (C0783kw) childAt3.getLayoutParams();
                            int i52 = this.f1029e;
                            this.f1029e = Math.max(i52, i52 + i50 + c0783kw6.topMargin + c0783kw6.bottomMargin);
                        }
                    }
                } else if (i31 == 0) {
                    i31 = 0;
                    this.f1029e = 0;
                    while (i33 < i30) {
                        childAt3 = getChildAt(i33);
                        if (childAt3 != null) {
                            C0783kw c0783kw7 = (C0783kw) childAt3.getLayoutParams();
                            int i53 = this.f1029e;
                            this.f1029e = Math.max(i53, i53 + i50 + c0783kw7.topMargin + c0783kw7.bottomMargin);
                        }
                    }
                }
            } else {
                i31 = i46;
            }
            int paddingTop = this.f1029e + getPaddingTop() + getPaddingBottom();
            this.f1029e = paddingTop;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
            int i54 = (16777215 & iResolveSizeAndState2) - this.f1029e;
            if (z8 || (i54 != 0 && f5 > 0.0f)) {
                float f6 = this.f1033i;
                if (f6 > 0.0f) {
                    f5 = f6;
                }
                this.f1029e = 0;
                for (int i55 = 0; i55 < i30; i55++) {
                    View childAt5 = getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        C0783kw c0783kw8 = (C0783kw) childAt5.getLayoutParams();
                        float f7 = c0783kw8.weight;
                        if (f7 > 0.0f) {
                            float f8 = (i54 * f7) / f5;
                            f5 -= f7;
                            int i56 = (int) f8;
                            int i57 = i54 - i56;
                            int childMeasureSpec2 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + c0783kw8.leftMargin + c0783kw8.rightMargin, c0783kw8.width);
                            if (c0783kw8.height == 0 && i31 == 1073741824) {
                                if (i56 <= 0) {
                                    i56 = 0;
                                }
                                childAt5.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                            } else {
                                int measuredHeight4 = i56 + childAt5.getMeasuredHeight();
                                if (measuredHeight4 < 0) {
                                    measuredHeight4 = 0;
                                }
                                childAt5.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(measuredHeight4, 1073741824));
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt5.getMeasuredState() & (-256));
                            i54 = i57;
                        }
                        int i58 = c0783kw8.leftMargin + c0783kw8.rightMargin;
                        int measuredWidth4 = childAt5.getMeasuredWidth() + i58;
                        int iMax10 = Math.max(i51, measuredWidth4);
                        if (i47 != 1073741824) {
                            i32 = i54;
                            if (c0783kw8.width != -1) {
                            }
                            iMax9 = Math.max(iMax9, i58);
                            if (z9 || c0783kw8.width != -1) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            int i59 = this.f1029e;
                            this.f1029e = Math.max(i59, childAt5.getMeasuredHeight() + i59 + c0783kw8.topMargin + c0783kw8.bottomMargin);
                            z9 = z5;
                            i51 = iMax10;
                            i54 = i32;
                        } else {
                            i32 = i54;
                        }
                        i58 = measuredWidth4;
                        iMax9 = Math.max(iMax9, i58);
                        if (z9) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        int i510 = this.f1029e;
                        this.f1029e = Math.max(i510, childAt5.getMeasuredHeight() + i510 + c0783kw8.topMargin + c0783kw8.bottomMargin);
                        z9 = z5;
                        i51 = iMax10;
                        i54 = i32;
                    }
                }
                this.f1029e += getPaddingTop() + getPaddingBottom();
                iMax4 = iMax9;
            } else {
                iMax4 = Math.max(iMax9, i49);
                if (z7 && i31 != 1073741824) {
                    for (int i60 = 0; i60 < i30; i60++) {
                        View childAt6 = getChildAt(i60);
                        if (childAt6 != null && childAt6.getVisibility() != 8 && ((C0783kw) childAt6.getLayoutParams()).weight > 0.0f) {
                            childAt6.measure(View.MeasureSpec.makeMeasureSpec(childAt6.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                        }
                    }
                }
            }
            int i61 = i51;
            if (z9 || i47 == 1073741824) {
                iMax4 = i61;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState2);
            if (z10) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i62 = 0; i62 < i30; i62++) {
                    View childAt7 = getChildAt(i62);
                    if (childAt7.getVisibility() != 8) {
                        C0783kw c0783kw9 = (C0783kw) childAt7.getLayoutParams();
                        if (c0783kw9.width == -1) {
                            int i63 = c0783kw9.height;
                            c0783kw9.height = childAt7.getMeasuredHeight();
                            measureChildWithMargins(childAt7, iMakeMeasureSpec2, 0, i2, 0);
                            c0783kw9.height = i63;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1029e = 0;
        int childCount2 = getChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f1035k == null || this.f1036l == null) {
            this.f1035k = new int[4];
            this.f1036l = new int[4];
        }
        int[] iArr = this.f1035k;
        int[] iArr2 = this.f1036l;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z12 = this.f1025a;
        boolean z13 = this.f1034j;
        int i64 = 0;
        float f9 = 0.0f;
        int i65 = 0;
        int iMax11 = 0;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = false;
        int iMax12 = 0;
        int iMax13 = 0;
        int i66 = 0;
        while (i65 < childCount2) {
            View childAt8 = getChildAt(i65);
            if (childAt8 == null) {
                i22 = i64;
            } else {
                int i67 = i64;
                if (childAt8.getVisibility() != 8) {
                    if (m1122s(i65)) {
                        this.f1029e += this.f1032h;
                    }
                    C0783kw c0783kw10 = (C0783kw) childAt8.getLayoutParams();
                    float f10 = f9 + c0783kw10.weight;
                    if (mode3 == 1073741824) {
                        if (c0783kw10.width != 0 || c0783kw10.weight <= 0.0f) {
                            i23 = 1073741824;
                        } else {
                            i65 = i65;
                            this.f1029e += c0783kw10.leftMargin + c0783kw10.rightMargin;
                            if (z12) {
                                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                childAt8.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                                z13 = z13;
                                c0783kw3 = c0783kw10;
                                z12 = z12;
                                i25 = i67;
                                i27 = 1;
                                z2 = z15;
                            } else {
                                z13 = z13;
                                c0783kw3 = c0783kw10;
                                z12 = z12;
                                i25 = i67;
                                z2 = true;
                                i27 = 1;
                            }
                        }
                        if (mode4 == 1073741824 && c0783kw3.height == -1) {
                            z3 = true;
                            z16 = true;
                        } else {
                            z3 = false;
                        }
                        i28 = c0783kw3.topMargin + c0783kw3.bottomMargin;
                        measuredHeight2 = childAt8.getMeasuredHeight() + i28;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i66, childAt8.getMeasuredState());
                        if (z12 && (baseline2 = childAt8.getBaseline()) != -1) {
                            if (c0783kw3.gravity < 0) {
                                i29 = this.f1030f;
                            } else {
                                i29 = c0783kw3.gravity;
                            }
                            int i68 = ((i29 & 112) >> 4) >> i27;
                            iArr[i68] = Math.max(iArr[i68], baseline2);
                            iArr2[i68] = Math.max(iArr2[i68], measuredHeight2 - baseline2);
                        }
                        int iMax14 = Math.max(i25, measuredHeight2);
                        if (z14 || c0783kw3.height != -1) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (c0783kw3.weight > 0.0f) {
                            if (true != z3) {
                                i28 = measuredHeight2;
                            }
                            iMax13 = Math.max(iMax13, i28);
                        } else {
                            int i69 = iMax13;
                            if (true != z3) {
                                i28 = measuredHeight2;
                            }
                            iMax12 = Math.max(iMax12, i28);
                            iMax13 = i69;
                        }
                        i66 = iCombineMeasuredStates4;
                        i64 = iMax14;
                        z15 = z2;
                        z14 = z4;
                        f9 = f10;
                    } else {
                        i23 = mode3;
                    }
                    if (c0783kw10.width == 0) {
                        f3 = 0.0f;
                        if (c0783kw10.weight > 0.0f) {
                            c0783kw10.width = -2;
                            b = 0;
                        }
                        if (f10 == f3) {
                            i24 = this.f1029e;
                        } else {
                            i24 = 0;
                        }
                        i25 = i67;
                        i26 = i23;
                        z13 = z13;
                        int i70 = i24;
                        c0783kw3 = c0783kw10;
                        i27 = 1;
                        z12 = z12;
                        measureChildWithMargins(childAt8, i, i70, i2, 0);
                        if (b != -2147483648) {
                            c0783kw3.width = 0;
                        }
                        measuredWidth2 = childAt8.getMeasuredWidth();
                        if (i26 == 1073741824) {
                            this.f1029e += c0783kw3.leftMargin + measuredWidth2 + c0783kw3.rightMargin;
                        } else {
                            int i71 = this.f1029e;
                            this.f1029e = Math.max(i71, i71 + measuredWidth2 + c0783kw3.leftMargin + c0783kw3.rightMargin);
                        }
                        if (z13) {
                            iMax11 = Math.max(measuredWidth2, iMax11);
                            z2 = z15;
                        } else {
                            z2 = z15;
                        }
                        if (mode4 == 1073741824) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        i28 = c0783kw3.topMargin + c0783kw3.bottomMargin;
                        measuredHeight2 = childAt8.getMeasuredHeight() + i28;
                        int iCombineMeasuredStates5 = View.combineMeasuredStates(i66, childAt8.getMeasuredState());
                        if (z12) {
                            if (c0783kw3.gravity < 0) {
                                i29 = this.f1030f;
                            } else {
                                i29 = c0783kw3.gravity;
                            }
                            int i610 = ((i29 & 112) >> 4) >> i27;
                            iArr[i610] = Math.max(iArr[i610], baseline2);
                            iArr2[i610] = Math.max(iArr2[i610], measuredHeight2 - baseline2);
                        }
                        int iMax15 = Math.max(i25, measuredHeight2);
                        if (z14) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (c0783kw3.weight > 0.0f) {
                            if (true != z3) {
                                i28 = measuredHeight2;
                            }
                            iMax13 = Math.max(iMax13, i28);
                        } else {
                            int i611 = iMax13;
                            if (true != z3) {
                                i28 = measuredHeight2;
                            }
                            iMax12 = Math.max(iMax12, i28);
                            iMax13 = i611;
                        }
                        i66 = iCombineMeasuredStates5;
                        i64 = iMax15;
                        z15 = z2;
                        z14 = z4;
                        f9 = f10;
                    } else {
                        f3 = 0.0f;
                    }
                    b = -2147483648;
                    if (f10 == f3) {
                        i24 = this.f1029e;
                    } else {
                        i24 = 0;
                    }
                    i25 = i67;
                    i26 = i23;
                    z13 = z13;
                    int i72 = i24;
                    c0783kw3 = c0783kw10;
                    i27 = 1;
                    z12 = z12;
                    measureChildWithMargins(childAt8, i, i72, i2, 0);
                    if (b != -2147483648) {
                        c0783kw3.width = 0;
                    }
                    measuredWidth2 = childAt8.getMeasuredWidth();
                    if (i26 == 1073741824) {
                        this.f1029e += c0783kw3.leftMargin + measuredWidth2 + c0783kw3.rightMargin;
                    } else {
                        int i73 = this.f1029e;
                        this.f1029e = Math.max(i73, i73 + measuredWidth2 + c0783kw3.leftMargin + c0783kw3.rightMargin);
                    }
                    if (z13) {
                        iMax11 = Math.max(measuredWidth2, iMax11);
                        z2 = z15;
                    } else {
                        z2 = z15;
                    }
                    if (mode4 == 1073741824) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i28 = c0783kw3.topMargin + c0783kw3.bottomMargin;
                    measuredHeight2 = childAt8.getMeasuredHeight() + i28;
                    int iCombineMeasuredStates6 = View.combineMeasuredStates(i66, childAt8.getMeasuredState());
                    if (z12) {
                        if (c0783kw3.gravity < 0) {
                            i29 = this.f1030f;
                        } else {
                            i29 = c0783kw3.gravity;
                        }
                        int i612 = ((i29 & 112) >> 4) >> i27;
                        iArr[i612] = Math.max(iArr[i612], baseline2);
                        iArr2[i612] = Math.max(iArr2[i612], measuredHeight2 - baseline2);
                    }
                    int iMax16 = Math.max(i25, measuredHeight2);
                    if (z14) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (c0783kw3.weight > 0.0f) {
                        if (true != z3) {
                            i28 = measuredHeight2;
                        }
                        iMax13 = Math.max(iMax13, i28);
                    } else {
                        int i613 = iMax13;
                        if (true != z3) {
                            i28 = measuredHeight2;
                        }
                        iMax12 = Math.max(iMax12, i28);
                        iMax13 = i613;
                    }
                    i66 = iCombineMeasuredStates6;
                    i64 = iMax16;
                    z15 = z2;
                    z14 = z4;
                    f9 = f10;
                } else {
                    i22 = i67;
                }
                i65++;
                z12 = z12;
                z13 = z13;
            }
            i66 = i66;
            iMax12 = iMax12;
            i64 = i22;
            iMax13 = iMax13;
            i65++;
            z12 = z12;
            z13 = z13;
        }
        int i74 = i64;
        boolean z17 = z13;
        boolean z18 = z12;
        int i75 = iMax12;
        int i76 = iMax13;
        int i77 = i66;
        if (this.f1029e > 0 && m1122s(childCount2)) {
            this.f1029e += this.f1032h;
        }
        int i78 = iArr[1];
        if (i78 != -1) {
            iMax = Math.max(i74, Math.max(iArr[3], Math.max(iArr[0], Math.max(i78, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        } else if (iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            iMax = i74;
        } else {
            i78 = -1;
            iMax = Math.max(i74, Math.max(iArr[3], Math.max(iArr[0], Math.max(i78, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z17) {
            if (mode3 == Integer.MIN_VALUE) {
                i3 = mode3;
            } else if (mode3 == 0) {
                i3 = 0;
                mode3 = 0;
            }
            this.f1029e = 0;
            int i79 = 0;
            while (i79 < childCount2) {
                View childAt9 = getChildAt(i79);
                if (childAt9 != null && childAt9.getVisibility() != 8) {
                    C0783kw c0783kw11 = (C0783kw) childAt9.getLayoutParams();
                    int i80 = this.f1029e;
                    this.f1029e = Math.max(i80, i80 + iMax11 + c0783kw11.leftMargin + c0783kw11.rightMargin);
                }
                i79++;
                iMax = iMax;
            }
            iMax = iMax;
            int paddingLeft = this.f1029e + getPaddingLeft() + getPaddingRight();
            this.f1029e = paddingLeft;
            iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
            i4 = (16777215 & iResolveSizeAndState) - this.f1029e;
            if (!z15 || (i4 != 0 && f9 > 0.0f)) {
                f = this.f1033i;
                if (f > 0.0f) {
                    f9 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f1029e = 0;
                i5 = i75;
                iCombineMeasuredStates = i77;
                i6 = 0;
                i7 = i4;
                iMax2 = -1;
                while (i6 < childCount2) {
                    childAt = getChildAt(i6);
                    if (childAt != null) {
                        i14 = childCount2;
                        if (childAt.getVisibility() != 8) {
                            c0783kw = (C0783kw) childAt.getLayoutParams();
                            f2 = c0783kw.weight;
                            if (f2 > 0.0f) {
                                float f11 = (i7 * f2) / f9;
                                float f12 = f9 - f2;
                                i19 = (int) f11;
                                int i81 = i7 - i19;
                                childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + c0783kw.topMargin + c0783kw.bottomMargin, c0783kw.height);
                                if (c0783kw.width == 0 || mode3 != 1073741824) {
                                    measuredWidth = i19 + childAt.getMeasuredWidth();
                                    if (measuredWidth < 0) {
                                        measuredWidth = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                                } else {
                                    if (i19 <= 0) {
                                        i19 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), childMeasureSpec);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f9 = f12;
                                i15 = i81;
                            } else {
                                i15 = i7;
                            }
                            if (i3 == 1073741824) {
                                this.f1029e += childAt.getMeasuredWidth() + c0783kw.leftMargin + c0783kw.rightMargin;
                            } else {
                                int i82 = this.f1029e;
                                this.f1029e = Math.max(i82, childAt.getMeasuredWidth() + i82 + c0783kw.leftMargin + c0783kw.rightMargin);
                            }
                            if (mode4 == 1073741824 && c0783kw.height == -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i16 = c0783kw.topMargin + c0783kw.bottomMargin;
                            measuredHeight = childAt.getMeasuredHeight() + i16;
                            iMax2 = Math.max(iMax2, measuredHeight);
                            if (true != z) {
                                i17 = measuredHeight;
                            } else {
                                i17 = i16;
                            }
                            int iMax17 = Math.max(i5, i17);
                            if (z14) {
                                i18 = -1;
                                boolean z19 = c0783kw.height == -1;
                                if (!z18 && (baseline = childAt.getBaseline()) != i18) {
                                    int i83 = (((c0783kw.gravity < 0 ? this.f1030f : c0783kw.gravity) & 112) >> 4) >> 1;
                                    iArr[i83] = Math.max(iArr[i83], baseline);
                                    iArr2[i83] = Math.max(iArr2[i83], measuredHeight - baseline);
                                }
                                i5 = iMax17;
                                z14 = z19;
                                f9 = f9;
                                i13 = i15;
                            } else {
                                i18 = -1;
                            }
                            if (!z18) {
                            }
                            i5 = iMax17;
                            z14 = z19;
                            f9 = f9;
                            i13 = i15;
                        } else {
                            iResolveSizeAndState = iResolveSizeAndState;
                            i13 = i7;
                        }
                    } else {
                        iResolveSizeAndState = iResolveSizeAndState;
                        i13 = i7;
                        i14 = childCount2;
                    }
                    i6++;
                    i7 = i13;
                    childCount2 = i14;
                    iResolveSizeAndState = iResolveSizeAndState;
                }
                i8 = i2;
                i9 = iResolveSizeAndState;
                i10 = childCount2;
                this.f1029e += getPaddingLeft() + getPaddingRight();
                i11 = iArr[1];
                if (i11 != -1) {
                    iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                    i12 = iCombineMeasuredStates;
                } else if (iArr[0] != -1 && iArr[2] == -1 && iArr[3] == -1) {
                    iMax3 = iMax2;
                    i12 = iCombineMeasuredStates;
                } else {
                    i11 = -1;
                    iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                    i12 = iCombineMeasuredStates;
                }
            } else {
                int iMax18 = Math.max(i75, i76);
                if (z17 && mode3 != 1073741824) {
                    for (int i84 = 0; i84 < childCount2; i84++) {
                        View childAt10 = getChildAt(i84);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((C0783kw) childAt10.getLayoutParams()).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax11, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i8 = i2;
                i5 = iMax18;
                i10 = childCount2;
                i12 = i77;
                i9 = iResolveSizeAndState;
                iMax3 = iMax;
            }
            if (!z14 && mode4 != 1073741824) {
                iMax3 = i5;
            }
            setMeasuredDimension(i9 | (i12 & (-16777216)), View.resolveSizeAndState(Math.max(iMax3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i12 << 16));
            if (z16) {
                return;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i20 = 0;
            while (true) {
                i21 = i10;
                if (i20 < i21) {
                    return;
                }
                childAt2 = getChildAt(i20);
                if (childAt2.getVisibility() != 8) {
                    c0783kw2 = (C0783kw) childAt2.getLayoutParams();
                    if (c0783kw2.height == -1) {
                        int i85 = c0783kw2.width;
                        c0783kw2.width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        c0783kw2.width = i85;
                    }
                }
                i20++;
                i10 = i21;
            }
        }
        i3 = mode3;
        int paddingLeft2 = this.f1029e + getPaddingLeft() + getPaddingRight();
        this.f1029e = paddingLeft2;
        iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft2, getSuggestedMinimumWidth()), i, 0);
        i4 = (16777215 & iResolveSizeAndState) - this.f1029e;
        if (z15) {
            f = this.f1033i;
            if (f > 0.0f) {
                f9 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1029e = 0;
            i5 = i75;
            iCombineMeasuredStates = i77;
            i6 = 0;
            i7 = i4;
            iMax2 = -1;
            while (i6 < childCount2) {
                childAt = getChildAt(i6);
                if (childAt != null) {
                    i14 = childCount2;
                    if (childAt.getVisibility() != 8) {
                        c0783kw = (C0783kw) childAt.getLayoutParams();
                        f2 = c0783kw.weight;
                        if (f2 > 0.0f) {
                            float f13 = (i7 * f2) / f9;
                            float f14 = f9 - f2;
                            i19 = (int) f13;
                            int i86 = i7 - i19;
                            childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + c0783kw.topMargin + c0783kw.bottomMargin, c0783kw.height);
                            if (c0783kw.width == 0) {
                                measuredWidth = i19 + childAt.getMeasuredWidth();
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                            } else {
                                measuredWidth = i19 + childAt.getMeasuredWidth();
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f9 = f14;
                            i15 = i86;
                        } else {
                            i15 = i7;
                        }
                        if (i3 == 1073741824) {
                            this.f1029e += childAt.getMeasuredWidth() + c0783kw.leftMargin + c0783kw.rightMargin;
                        } else {
                            int i87 = this.f1029e;
                            this.f1029e = Math.max(i87, childAt.getMeasuredWidth() + i87 + c0783kw.leftMargin + c0783kw.rightMargin);
                        }
                        if (mode4 == 1073741824) {
                            z = false;
                        } else {
                            z = false;
                        }
                        i16 = c0783kw.topMargin + c0783kw.bottomMargin;
                        measuredHeight = childAt.getMeasuredHeight() + i16;
                        iMax2 = Math.max(iMax2, measuredHeight);
                        if (true != z) {
                            i17 = measuredHeight;
                        } else {
                            i17 = i16;
                        }
                        int iMax19 = Math.max(i5, i17);
                        if (z14) {
                            i18 = -1;
                            if (c0783kw.height == -1) {
                            }
                            if (!z18) {
                            }
                            i5 = iMax19;
                            z14 = z19;
                            f9 = f9;
                            i13 = i15;
                        } else {
                            i18 = -1;
                        }
                        if (!z18) {
                        }
                        i5 = iMax19;
                        z14 = z19;
                        f9 = f9;
                        i13 = i15;
                    } else {
                        iResolveSizeAndState = iResolveSizeAndState;
                        i13 = i7;
                    }
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    i13 = i7;
                    i14 = childCount2;
                }
                i6++;
                i7 = i13;
                childCount2 = i14;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i8 = i2;
            i9 = iResolveSizeAndState;
            i10 = childCount2;
            this.f1029e += getPaddingLeft() + getPaddingRight();
            i11 = iArr[1];
            if (i11 != -1) {
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            } else if (iArr[0] != -1) {
                i11 = -1;
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            } else {
                i11 = -1;
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            }
        } else {
            f = this.f1033i;
            if (f > 0.0f) {
                f9 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1029e = 0;
            i5 = i75;
            iCombineMeasuredStates = i77;
            i6 = 0;
            i7 = i4;
            iMax2 = -1;
            while (i6 < childCount2) {
                childAt = getChildAt(i6);
                if (childAt != null) {
                    i14 = childCount2;
                    if (childAt.getVisibility() != 8) {
                        c0783kw = (C0783kw) childAt.getLayoutParams();
                        f2 = c0783kw.weight;
                        if (f2 > 0.0f) {
                            float f15 = (i7 * f2) / f9;
                            float f16 = f9 - f2;
                            i19 = (int) f15;
                            int i88 = i7 - i19;
                            childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + c0783kw.topMargin + c0783kw.bottomMargin, c0783kw.height);
                            if (c0783kw.width == 0) {
                                measuredWidth = i19 + childAt.getMeasuredWidth();
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                            } else {
                                measuredWidth = i19 + childAt.getMeasuredWidth();
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f9 = f16;
                            i15 = i88;
                        } else {
                            i15 = i7;
                        }
                        if (i3 == 1073741824) {
                            this.f1029e += childAt.getMeasuredWidth() + c0783kw.leftMargin + c0783kw.rightMargin;
                        } else {
                            int i89 = this.f1029e;
                            this.f1029e = Math.max(i89, childAt.getMeasuredWidth() + i89 + c0783kw.leftMargin + c0783kw.rightMargin);
                        }
                        if (mode4 == 1073741824) {
                            z = false;
                        } else {
                            z = false;
                        }
                        i16 = c0783kw.topMargin + c0783kw.bottomMargin;
                        measuredHeight = childAt.getMeasuredHeight() + i16;
                        iMax2 = Math.max(iMax2, measuredHeight);
                        if (true != z) {
                            i17 = measuredHeight;
                        } else {
                            i17 = i16;
                        }
                        int iMax110 = Math.max(i5, i17);
                        if (z14) {
                            i18 = -1;
                            if (c0783kw.height == -1) {
                            }
                            if (!z18) {
                            }
                            i5 = iMax110;
                            z14 = z19;
                            f9 = f9;
                            i13 = i15;
                        } else {
                            i18 = -1;
                        }
                        if (!z18) {
                        }
                        i5 = iMax110;
                        z14 = z19;
                        f9 = f9;
                        i13 = i15;
                    } else {
                        iResolveSizeAndState = iResolveSizeAndState;
                        i13 = i7;
                    }
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    i13 = i7;
                    i14 = childCount2;
                }
                i6++;
                i7 = i13;
                childCount2 = i14;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i8 = i2;
            i9 = iResolveSizeAndState;
            i10 = childCount2;
            this.f1029e += getPaddingLeft() + getPaddingRight();
            i11 = iArr[1];
            if (i11 != -1) {
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            } else if (iArr[0] != -1) {
                i11 = -1;
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            } else {
                i11 = -1;
                iMax3 = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                i12 = iCombineMeasuredStates;
            }
        }
        if (!z14) {
            iMax3 = i5;
        }
        setMeasuredDimension(i9 | (i12 & (-16777216)), View.resolveSizeAndState(Math.max(iMax3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i12 << 16));
        if (z16) {
            return;
        }
        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        i20 = 0;
        while (true) {
            i21 = i10;
            if (i20 < i21) {
                return;
            }
            childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                c0783kw2 = (C0783kw) childAt2.getLayoutParams();
                if (c0783kw2.height == -1) {
                    int i810 = c0783kw2.width;
                    c0783kw2.width = childAt2.getMeasuredWidth();
                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                    c0783kw2.width = i810;
                }
            }
            i20++;
            i10 = i21;
        }
    }
}
