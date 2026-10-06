package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.C0004ad;
import p000.C0006af;
import p000.C0007ag;
import p000.C0014an;
import p000.C0042ao;
import p000.C0043ap;
import p000.C0046as;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    final SparseArray f852a;

    /* JADX INFO: renamed from: b */
    final C0042ao f853b;

    /* JADX INFO: renamed from: c */
    public C0006af f854c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f855d;

    /* JADX INFO: renamed from: e */
    private int f856e;

    /* JADX INFO: renamed from: f */
    private int f857f;

    /* JADX INFO: renamed from: g */
    private int f858g;

    /* JADX INFO: renamed from: h */
    private int f859h;

    /* JADX INFO: renamed from: i */
    private boolean f860i;

    /* JADX INFO: renamed from: j */
    private int f861j;

    public ConstraintLayout(Context context) {
        super(context);
        this.f852a = new SparseArray();
        this.f855d = new ArrayList(100);
        this.f853b = new C0042ao();
        this.f856e = 0;
        this.f857f = 0;
        this.f858g = Integer.MAX_VALUE;
        this.f859h = Integer.MAX_VALUE;
        this.f860i = true;
        this.f861j = 2;
        this.f854c = null;
        m1019e(null);
    }

    /* JADX INFO: renamed from: b */
    public static final C0004ad m1016b() {
        return new C0004ad();
    }

    /* JADX INFO: renamed from: c */
    private final C0014an m1017c(int i) {
        View view;
        if (i != 0 && (view = (View) this.f852a.get(i)) != this) {
            if (view == null) {
                return null;
            }
            return ((C0004ad) view.getLayoutParams()).f134Y;
        }
        return this.f853b;
    }

    /* JADX INFO: renamed from: d */
    private final C0014an m1018d(View view) {
        if (view == this) {
            return this.f853b;
        }
        if (view == null) {
            return null;
        }
        return ((C0004ad) view.getLayoutParams()).f134Y;
    }

    /* JADX INFO: renamed from: e */
    private final void m1019e(AttributeSet attributeSet) {
        this.f853b.f787J = this;
        this.f852a.put(getId(), this);
        this.f854c = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0007ag.f290a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.f856e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.f856e);
                } else if (index == 17) {
                    this.f857f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.f857f);
                } else if (index == 14) {
                    this.f858g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.f858g);
                } else if (index == 15) {
                    this.f859h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.f859h);
                } else if (index == 113) {
                    this.f861j = typedArrayObtainStyledAttributes.getInt(113, this.f861j);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    C0006af c0006af = new C0006af();
                    this.f854c = c0006af;
                    c0006af.m417e(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f853b.f1863ai = this.f861j;
    }

    /* JADX INFO: renamed from: a */
    protected final void m1020a() {
        this.f853b.mo1746D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0004ad;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1016b();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0004ad(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0004ad c0004ad = (C0004ad) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || c0004ad.f126Q || zIsInEditMode) {
                C0014an c0014an = c0004ad.f134Y;
                int iM988b = c0014an.m988b();
                int iM989c = c0014an.m989c();
                childAt.layout(iM988b, iM989c, c0014an.m994h() + iM988b, c0014an.m990d() + iM989c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:198:0x03da  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int baseline;
        int childMeasureSpec;
        boolean z;
        int childMeasureSpec2;
        boolean z2;
        int measuredHeight;
        int baseline2;
        C0014an c0014an;
        C0004ad c0004ad;
        C0014an c0014anM1017c;
        C0014an c0014anM1017c2;
        C0014an c0014anM1017c3;
        C0014an c0014anM1017c4;
        C0014an c0014an2;
        int i6;
        int i7;
        float fAbs;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        C0042ao c0042ao = this.f853b;
        c0042ao.f833w = paddingLeft;
        c0042ao.f834x = paddingTop;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                i3 = 2;
                break;
            case 0:
                i3 = 2;
                size = 0;
                break;
            case 1073741824:
                size = Math.min(this.f858g, size) - paddingLeft2;
                i3 = 1;
                break;
            default:
                i3 = 1;
                size = 0;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                i4 = 2;
                break;
            case 0:
                i4 = 2;
                size2 = 0;
                break;
            case 1073741824:
                size2 = Math.min(this.f859h, size2) - paddingTop2;
                i4 = 1;
                break;
            default:
                i4 = 1;
                size2 = 0;
                break;
        }
        this.f853b.m999m(0);
        this.f853b.m998l(0);
        this.f853b.m1008v(i3);
        this.f853b.m1002p(size);
        this.f853b.m1009w(i4);
        this.f853b.m996j(size2);
        this.f853b.m999m((this.f856e - getPaddingLeft()) - getPaddingRight());
        this.f853b.m998l((this.f857f - getPaddingTop()) - getPaddingBottom());
        if (this.f860i) {
            this.f860i = false;
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).isLayoutRequested()) {
                    this.f855d.clear();
                    C0006af c0006af = this.f854c;
                    if (c0006af != null) {
                        c0006af.m413a(this);
                    }
                    this.f853b.f2221al.clear();
                    int i9 = 0;
                    for (int childCount2 = getChildCount(); i9 < childCount2; childCount2 = childCount2) {
                        View childAt = getChildAt(i9);
                        C0014an c0014anM1018d = m1018d(childAt);
                        if (c0014anM1018d != null) {
                            C0004ad c0004ad2 = (C0004ad) childAt.getLayoutParams();
                            c0014anM1018d.mo995i();
                            c0014anM1018d.f788K = childAt.getVisibility();
                            c0014anM1018d.f787J = childAt;
                            C0042ao c0042ao2 = this.f853b;
                            c0042ao2.f2221al.add(c0014anM1018d);
                            C0014an c0014an3 = c0014anM1018d.f828r;
                            if (c0014an3 != null) {
                                ((C0046as) c0014an3).m1908F(c0014anM1018d);
                            }
                            c0014anM1018d.f828r = c0042ao2;
                            if (!c0004ad2.f124O || !c0004ad2.f123N) {
                                this.f855d.add(c0014anM1018d);
                            }
                            if (c0004ad2.f126Q) {
                                C0043ap c0043ap = (C0043ap) c0014anM1018d;
                                int i10 = c0004ad2.f135a;
                                if (i10 != -1 && i10 >= 0) {
                                    c0043ap.f1968af = -1.0f;
                                    c0043ap.f1969ag = i10;
                                    c0043ap.f1970ah = -1;
                                }
                                int i11 = c0004ad2.f136b;
                                if (i11 != -1 && i11 >= 0) {
                                    c0043ap.f1968af = -1.0f;
                                    c0043ap.f1969ag = -1;
                                    c0043ap.f1970ah = i11;
                                }
                                float f = c0004ad2.f137c;
                                if (f != -1.0f && f > -1.0f) {
                                    c0043ap.f1968af = f;
                                    c0043ap.f1969ag = -1;
                                    c0043ap.f1970ah = -1;
                                }
                            } else if (c0004ad2.f127R != -1 || c0004ad2.f128S != -1 || c0004ad2.f129T != -1 || c0004ad2.f130U != -1 || c0004ad2.f142h != -1 || c0004ad2.f143i != -1 || c0004ad2.f144j != -1 || c0004ad2.f145k != -1 || c0004ad2.f146l != -1 || c0004ad2.f120K != -1 || c0004ad2.f121L != -1 || c0004ad2.width == -1 || c0004ad2.height == -1) {
                                int i12 = c0004ad2.f127R;
                                int i13 = c0004ad2.f128S;
                                int i14 = c0004ad2.f129T;
                                int i15 = c0004ad2.f130U;
                                int i16 = c0004ad2.f131V;
                                int i17 = c0004ad2.f132W;
                                float f2 = c0004ad2.f133X;
                                if (i12 != -1) {
                                    C0014an c0014anM1017c5 = m1017c(i12);
                                    if (c0014anM1017c5 != null) {
                                        c0014an = c0014anM1018d;
                                        c0014anM1018d.m1007u(2, c0014anM1017c5, 2, c0004ad2.leftMargin, i16);
                                        c0004ad = c0004ad2;
                                    } else {
                                        c0014an = c0014anM1018d;
                                        c0004ad = c0004ad2;
                                    }
                                } else {
                                    c0014an = c0014anM1018d;
                                    if (i13 == -1 || (c0014anM1017c = m1017c(i13)) == null) {
                                        c0004ad = c0004ad2;
                                    } else {
                                        c0004ad = c0004ad2;
                                        c0014an.m1007u(2, c0014anM1017c, 4, c0004ad.leftMargin, i16);
                                    }
                                }
                                if (i14 != -1) {
                                    C0014an c0014anM1017c6 = m1017c(i14);
                                    if (c0014anM1017c6 != null) {
                                        c0014an.m1007u(4, c0014anM1017c6, 2, c0004ad.rightMargin, i17);
                                    }
                                } else if (i15 != -1 && (c0014anM1017c2 = m1017c(i15)) != null) {
                                    c0014an.m1007u(4, c0014anM1017c2, 4, c0004ad.rightMargin, i17);
                                }
                                int i18 = c0004ad.f142h;
                                if (i18 != -1) {
                                    C0014an c0014anM1017c7 = m1017c(i18);
                                    if (c0014anM1017c7 != null) {
                                        c0014an.m1007u(3, c0014anM1017c7, 3, c0004ad.topMargin, c0004ad.f152r);
                                    }
                                } else {
                                    int i19 = c0004ad.f143i;
                                    if (i19 != -1 && (c0014anM1017c3 = m1017c(i19)) != null) {
                                        c0014an.m1007u(3, c0014anM1017c3, 5, c0004ad.topMargin, c0004ad.f152r);
                                    }
                                }
                                int i20 = c0004ad.f144j;
                                if (i20 != -1) {
                                    C0014an c0014anM1017c8 = m1017c(i20);
                                    if (c0014anM1017c8 != null) {
                                        c0014an.m1007u(5, c0014anM1017c8, 3, c0004ad.bottomMargin, c0004ad.f154t);
                                    }
                                } else {
                                    int i21 = c0004ad.f145k;
                                    if (i21 != -1 && (c0014anM1017c4 = m1017c(i21)) != null) {
                                        c0014an.m1007u(5, c0014anM1017c4, 5, c0004ad.bottomMargin, c0004ad.f154t);
                                    }
                                }
                                int i22 = c0004ad.f146l;
                                if (i22 != -1) {
                                    View view = (View) this.f852a.get(i22);
                                    C0014an c0014anM1017c9 = m1017c(c0004ad.f146l);
                                    if (c0014anM1017c9 == null || view == null || !(view.getLayoutParams() instanceof C0004ad)) {
                                        c0014an2 = c0014an;
                                    } else {
                                        C0004ad c0004ad3 = (C0004ad) view.getLayoutParams();
                                        c0004ad.f125P = true;
                                        c0004ad3.f125P = true;
                                        c0014an2 = c0014an;
                                        c0014an2.mo1006t(6).m930d(c0014anM1017c9.mo1006t(6), 0, -1, 2, 0, true);
                                        c0014an2.mo1006t(3).m928b();
                                        c0014an2.mo1006t(5).m928b();
                                    }
                                } else {
                                    c0014an2 = c0014an;
                                }
                                if (f2 >= 0.0f && f2 != 0.5f) {
                                    c0014an2.f785H = f2;
                                }
                                float f3 = c0004ad.f158x;
                                if (f3 >= 0.0f && f3 != 0.5f) {
                                    c0014an2.f786I = f3;
                                }
                                if (isInEditMode()) {
                                    int i23 = c0004ad.f120K;
                                    if (i23 != -1) {
                                        int i24 = c0004ad.f121L;
                                        c0014an2.f833w = i23;
                                        c0014an2.f834x = i24;
                                    } else if (c0004ad.f121L != -1) {
                                        i23 = -1;
                                        int i25 = c0004ad.f121L;
                                        c0014an2.f833w = i23;
                                        c0014an2.f834x = i25;
                                    }
                                }
                                if (c0004ad.f123N) {
                                    c0014an2.m1008v(1);
                                    c0014an2.m1002p(c0004ad.width);
                                } else if (c0004ad.width == -1) {
                                    c0014an2.m1008v(4);
                                    c0014an2.mo1006t(2).f673c = c0004ad.leftMargin;
                                    c0014an2.mo1006t(4).f673c = c0004ad.rightMargin;
                                } else {
                                    c0014an2.m1008v(3);
                                    c0014an2.m1002p(0);
                                }
                                if (c0004ad.f124O) {
                                    c0014an2.m1009w(1);
                                    c0014an2.m996j(c0004ad.height);
                                } else if (c0004ad.height == -1) {
                                    c0014an2.m1009w(4);
                                    c0014an2.mo1006t(3).f673c = c0004ad.topMargin;
                                    c0014an2.mo1006t(5).f673c = c0004ad.bottomMargin;
                                } else {
                                    c0014an2.m1009w(3);
                                    c0014an2.m996j(0);
                                }
                                String str = c0004ad.f159y;
                                if (str != null) {
                                    if (str.length() == 0) {
                                        c0014an2.f831u = 0.0f;
                                    } else {
                                        int length = str.length();
                                        int iIndexOf = str.indexOf(44);
                                        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                            i6 = 0;
                                            i7 = -1;
                                        } else {
                                            String strSubstring = str.substring(0, iIndexOf);
                                            i7 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                            i6 = iIndexOf + 1;
                                        }
                                        int iIndexOf2 = str.indexOf(58);
                                        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                            String strSubstring2 = str.substring(i6);
                                            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                        } else {
                                            String strSubstring3 = str.substring(i6, iIndexOf2);
                                            String strSubstring4 = str.substring(iIndexOf2 + 1);
                                            if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                                fAbs = 0.0f;
                                            } else {
                                                try {
                                                    float f4 = Float.parseFloat(strSubstring3);
                                                    float f5 = Float.parseFloat(strSubstring4);
                                                    if (f4 <= 0.0f || f5 <= 0.0f) {
                                                        fAbs = 0.0f;
                                                    } else {
                                                        fAbs = i7 == 1 ? Math.abs(f5 / f4) : Math.abs(f4 / f5);
                                                    }
                                                } catch (NumberFormatException e) {
                                                    fAbs = 0.0f;
                                                }
                                            }
                                        }
                                        if (fAbs > 0.0f) {
                                            c0014an2.f831u = fAbs;
                                            c0014an2.f832v = i7;
                                        }
                                    }
                                }
                                c0014an2.f803Z = c0004ad.f110A;
                                c0014an2.f805aa = c0004ad.f111B;
                                c0014an2.f799V = c0004ad.f112C;
                                c0014an2.f800W = c0004ad.f113D;
                                int i26 = c0004ad.f114E;
                                int i27 = c0004ad.f116G;
                                int i28 = c0004ad.f118I;
                                c0014an2.f813c = i26;
                                c0014an2.f815e = i27;
                                c0014an2.f816f = i28;
                                int i29 = c0004ad.f115F;
                                int i30 = c0004ad.f117H;
                                int i31 = c0004ad.f119J;
                                c0014an2.f814d = i29;
                                c0014an2.f817g = i30;
                                c0014an2.f818h = i31;
                            }
                        }
                        i9++;
                    }
                }
            }
        }
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int childCount3 = getChildCount();
        int i32 = 0;
        while (true) {
            int i33 = 8;
            if (i32 >= childCount3) {
                if (getChildCount() > 0) {
                    m1020a();
                }
                int size3 = this.f855d.size();
                int paddingBottom = paddingTop + getPaddingBottom();
                int paddingRight = paddingLeft + getPaddingRight();
                if (size3 > 0) {
                    C0042ao c0042ao3 = this.f853b;
                    int i34 = c0042ao3.f808ad;
                    int i35 = c0042ao3.f809ae;
                    int iCombineMeasuredStates = 0;
                    int i36 = 0;
                    boolean z3 = false;
                    while (i36 < size3) {
                        C0014an c0014an4 = (C0014an) this.f855d.get(i36);
                        if ((c0014an4 instanceof C0043ap) || (obj = c0014an4.f787J) == null) {
                            size3 = size3;
                        } else {
                            View view2 = (View) obj;
                            if (view2.getVisibility() != i33) {
                                C0004ad c0004ad4 = (C0004ad) view2.getLayoutParams();
                                view2.measure(c0004ad4.width == -2 ? getChildMeasureSpec(i, paddingRight, c0004ad4.width) : View.MeasureSpec.makeMeasureSpec(c0014an4.m994h(), 1073741824), c0004ad4.height == -2 ? getChildMeasureSpec(i2, paddingBottom, c0004ad4.height) : View.MeasureSpec.makeMeasureSpec(c0014an4.m990d(), 1073741824));
                                int measuredWidth = view2.getMeasuredWidth();
                                int measuredHeight2 = view2.getMeasuredHeight();
                                if (measuredWidth != c0014an4.m994h()) {
                                    c0014an4.m1002p(measuredWidth);
                                    if (i34 != 2 || c0014an4.m993g() <= this.f853b.m994h()) {
                                        z3 = true;
                                    } else {
                                        this.f853b.m1002p(Math.max(this.f856e, c0014an4.m993g() + c0014an4.mo1006t(4).m927a()));
                                        z3 = true;
                                    }
                                }
                                if (measuredHeight2 != c0014an4.m990d()) {
                                    c0014an4.m996j(measuredHeight2);
                                    if (i35 != 2 || c0014an4.m987a() <= this.f853b.m990d()) {
                                        z3 = true;
                                    } else {
                                        this.f853b.m996j(Math.max(this.f857f, c0014an4.m987a() + c0014an4.mo1006t(5).m927a()));
                                        z3 = true;
                                    }
                                }
                                if (c0004ad4.f125P && (baseline = view2.getBaseline()) != -1 && baseline != c0014an4.f780C) {
                                    c0014an4.f780C = baseline;
                                    z3 = true;
                                }
                                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                            } else {
                                size3 = size3;
                            }
                        }
                        i36++;
                        size3 = size3;
                        i33 = 8;
                    }
                    if (z3) {
                        m1020a();
                    }
                    i5 = iCombineMeasuredStates;
                } else {
                    i5 = 0;
                }
                int iM994h = this.f853b.m994h() + paddingRight;
                int iM990d = this.f853b.m990d() + paddingBottom;
                int iResolveSizeAndState = resolveSizeAndState(iM994h, i, i5);
                int iResolveSizeAndState2 = resolveSizeAndState(iM990d, i2, i5 << 16);
                int iMin = Math.min(this.f858g, iResolveSizeAndState) & 16777215;
                int iMin2 = Math.min(this.f859h, iResolveSizeAndState2) & 16777215;
                C0042ao c0042ao4 = this.f853b;
                if (c0042ao4.f1864aj) {
                    iMin |= 16777216;
                }
                if (c0042ao4.f1865ak) {
                    iMin2 |= 16777216;
                }
                setMeasuredDimension(iMin, iMin2);
                return;
            }
            View childAt2 = getChildAt(i32);
            if (childAt2.getVisibility() != 8) {
                C0004ad c0004ad5 = (C0004ad) childAt2.getLayoutParams();
                C0014an c0014an5 = c0004ad5.f134Y;
                if (!c0004ad5.f126Q) {
                    int measuredWidth2 = c0004ad5.width;
                    int i37 = c0004ad5.height;
                    if (c0004ad5.f123N || c0004ad5.f124O || c0004ad5.f114E == 1 || c0004ad5.width == -1 || (!c0004ad5.f124O && (c0004ad5.f115F == 1 || c0004ad5.height == -1))) {
                        if (measuredWidth2 == 0 || measuredWidth2 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, -2);
                            z = true;
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, measuredWidth2);
                            z = false;
                        }
                        if (i37 == 0 || i37 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, -2);
                            z2 = true;
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, i37);
                            z2 = false;
                        }
                        childAt2.measure(childMeasureSpec, childMeasureSpec2);
                        measuredWidth2 = childAt2.getMeasuredWidth();
                        measuredHeight = childAt2.getMeasuredHeight();
                    } else {
                        measuredHeight = i37;
                        z = false;
                        z2 = false;
                    }
                    c0014an5.m1002p(measuredWidth2);
                    c0014an5.m996j(measuredHeight);
                    if (z) {
                        c0014an5.f783F = measuredWidth2;
                    }
                    if (z2) {
                        c0014an5.f784G = measuredHeight;
                    }
                    if (c0004ad5.f125P && (baseline2 = childAt2.getBaseline()) != -1) {
                        c0014an5.f780C = baseline2;
                    }
                }
            }
            i32++;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0014an c0014anM1018d = m1018d(view);
        if ((view instanceof Guideline) && !(c0014anM1018d instanceof C0043ap)) {
            C0004ad c0004ad = (C0004ad) view.getLayoutParams();
            c0004ad.f134Y = new C0043ap();
            c0004ad.f126Q = true;
            ((C0043ap) c0004ad.f134Y).m1785A(c0004ad.f122M);
            C0014an c0014an = c0004ad.f134Y;
        }
        this.f852a.put(view.getId(), view);
        this.f860i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f852a.remove(view.getId());
        this.f853b.m1908F(m1018d(view));
        this.f860i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.f860i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.f852a.remove(getId());
        super.setId(i);
        this.f852a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0004ad(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f852a = new SparseArray();
        this.f855d = new ArrayList(100);
        this.f853b = new C0042ao();
        this.f856e = 0;
        this.f857f = 0;
        this.f858g = Integer.MAX_VALUE;
        this.f859h = Integer.MAX_VALUE;
        this.f860i = true;
        this.f861j = 2;
        this.f854c = null;
        m1019e(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f852a = new SparseArray();
        this.f855d = new ArrayList(100);
        this.f853b = new C0042ao();
        this.f856e = 0;
        this.f857f = 0;
        this.f858g = Integer.MAX_VALUE;
        this.f859h = Integer.MAX_VALUE;
        this.f860i = true;
        this.f861j = 2;
        this.f854c = null;
        m1019e(attributeSet);
    }
}
