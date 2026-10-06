package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC1174zi;
import p000.C1058va;
import p000.C1141yc;
import p000.C1142yd;
import p000.C1148yj;
import p000.C1152yn;
import p000.C1153yo;
import p000.C1155yq;
import p000.C1156yr;
import p000.C1157ys;
import p000.C1158yt;
import p000.C1159yu;
import p000.C1161yw;
import p000.C1163yy;
import p000.C1168zc;
import p000.C1170ze;
import p000.C1172zg;
import p000.C1176zk;
import p000.C1178zm;
import p000.C1179zn;
import p000.C1181zp;
import p000.C1182zq;
import p000.C1183zr;
import p000.C1190zy;
import p000.C1191zz;
import p000.EnumC1150yl;
import p000.InterfaceC1180zo;
import p000.aaa;
import p000.aab;
import p000.aad;
import p000.aae;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static aae sSharedValues = null;
    SparseArray mChildrenByIds;
    private ArrayList mConstraintHelpers;
    protected C1183zr mConstraintLayoutSpec;
    private C1190zy mConstraintSet;
    private int mConstraintSetId;
    private HashMap mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C1153yo mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    C1179zn mMeasurer;
    private C1142yd mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1153yo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1179zn(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static aae getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new aae();
        }
        return sSharedValues;
    }

    private C1152yn getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = (View) this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C1178zm) viewFindViewById.getLayoutParams()).f48415av;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C1153yo c1153yo = this.mLayoutWidget;
        c1153yo.f48219ah = this;
        C1179zn c1179zn = this.mMeasurer;
        c1153yo.f48262aI = c1179zn;
        c1153yo.f48253a.f48303g = c1179zn;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aad.f2b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(113, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException e) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        C1190zy c1190zy = new C1190zy();
                        this.mConstraintSet = c1190zy;
                        c1190zy.m19826k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException e2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m19712W(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        int i;
        C1156yr c1156yr;
        C1152yn viewWidget;
        String str;
        int iM19792d;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C1152yn viewWidget2 = getViewWidget(getChildAt(i2));
            if (viewWidget2 != null) {
                viewWidget2.mo19701v();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f48221aj = resourceName;
                } catch (Resources.NotFoundException e) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C1191zz)) {
                    throw null;
                }
            }
        }
        C1190zy c1190zy = this.mConstraintSet;
        if (c1190zy != null) {
            c1190zy.m19833t(this);
        }
        this.mLayoutWidget.f48284aK.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                C1176zk c1176zk = (C1176zk) this.mConstraintHelpers.get(i5);
                if (c1176zk.isInEditMode()) {
                    c1176zk.m19793e(c1176zk.f48362f);
                }
                C1156yr c1156yr2 = c1176zk.f48365i;
                if (c1156yr2 != null) {
                    c1156yr2.f48282at = 0;
                    Arrays.fill(c1156yr2.f48281as, (Object) null);
                    for (int i6 = 0; i6 < c1176zk.f48360d; i6++) {
                        int i7 = c1176zk.f48359c[i6];
                        View viewById = getViewById(i7);
                        if (viewById == null && (iM19792d = c1176zk.m19792d(this, (str = (String) c1176zk.f48364h.get(Integer.valueOf(i7))))) != 0) {
                            c1176zk.f48359c[i6] = iM19792d;
                            c1176zk.f48364h.put(Integer.valueOf(iM19792d), str);
                            viewById = getViewById(iM19792d);
                        }
                        if (viewById != null && (viewWidget = getViewWidget(viewById)) != (c1156yr = c1176zk.f48365i) && viewWidget != null) {
                            int i8 = c1156yr.f48282at + 1;
                            C1152yn[] c1152ynArr = c1156yr.f48281as;
                            int length = c1152ynArr.length;
                            if (i8 > length) {
                                c1156yr.f48281as = (C1152yn[]) Arrays.copyOf(c1152ynArr, length + length);
                            }
                            C1152yn[] c1152ynArr2 = c1156yr.f48281as;
                            int i9 = c1156yr.f48282at;
                            c1152ynArr2[i9] = viewWidget;
                            c1156yr.f48282at = i9 + 1;
                        }
                    }
                    C1156yr c1156yr3 = c1176zk.f48365i;
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        while (i < childCount) {
            View childAt3 = getChildAt(i);
            if (childAt3 instanceof aab) {
                throw null;
            }
            i++;
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = getChildAt(i10);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt5 = getChildAt(i11);
            C1152yn viewWidget3 = getViewWidget(childAt5);
            if (viewWidget3 != null) {
                C1178zm c1178zm = (C1178zm) childAt5.getLayoutParams();
                C1153yo c1153yo = this.mLayoutWidget;
                c1153yo.f48284aK.add(viewWidget3);
                C1152yn c1152yn = viewWidget3.f48206V;
                if (c1152yn != null) {
                    ((C1159yu) c1152yn).m19722aa(viewWidget3);
                }
                viewWidget3.f48206V = c1153yo;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget3, c1178zm, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(C1152yn c1152yn, C1178zm c1178zm, SparseArray sparseArray, int i, EnumC1150yl enumC1150yl) {
        View view = (View) this.mChildrenByIds.get(i);
        C1152yn c1152yn2 = (C1152yn) sparseArray.get(i);
        if (c1152yn2 == null || view == null || !(view.getLayoutParams() instanceof C1178zm)) {
            return;
        }
        c1178zm.f48400ag = USE_CONSTRAINTS_HELPER;
        if (enumC1150yl == EnumC1150yl.BASELINE) {
            C1178zm c1178zm2 = (C1178zm) view.getLayoutParams();
            c1178zm2.f48400ag = USE_CONSTRAINTS_HELPER;
            c1178zm2.f48415av.f48191G = USE_CONSTRAINTS_HELPER;
        }
        c1152yn.mo19692m(EnumC1150yl.BASELINE).m19659j(c1152yn2.mo19692m(enumC1150yl), c1178zm.f48370D, c1178zm.f48369C);
        c1152yn.f48191G = USE_CONSTRAINTS_HELPER;
        c1152yn.mo19692m(EnumC1150yl.TOP).m19653d();
        c1152yn.mo19692m(EnumC1150yl.BOTTOM).m19653d();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = USE_CONSTRAINTS_HELPER;
                break;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void addValueModifier(InterfaceC1180zo interfaceC1180zo) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList();
        }
        this.mModifiers.add(interfaceC1180zo);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d8  */
    protected void applyConstraintsFromLayoutParams(boolean z, View view, C1152yn c1152yn, C1178zm c1178zm, SparseArray sparseArray) {
        float f;
        C1152yn c1152yn2;
        C1152yn c1152yn3;
        C1152yn c1152yn4;
        C1152yn c1152yn5;
        int i;
        int i2;
        float fAbs;
        int i3;
        c1178zm.m19797a();
        c1178zm.f48416aw = false;
        c1152yn.f48220ai = view.getVisibility();
        boolean z2 = c1178zm.f48403aj;
        c1152yn.f48219ah = view;
        if (view instanceof C1176zk) {
            ((C1176zk) view).mo1404b(c1152yn, this.mLayoutWidget.f48273c);
        }
        if (c1178zm.f48401ah) {
            C1155yq c1155yq = (C1155yq) c1152yn;
            int i4 = c1178zm.f48412as;
            int i5 = c1178zm.f48413at;
            float f2 = c1178zm.f48414au;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    c1155yq.f48275a = f2;
                    c1155yq.f48278b = -1;
                    c1155yq.f48279c = -1;
                    return;
                }
                return;
            }
            if (i4 != -1) {
                if (i4 >= 0) {
                    c1155yq.f48275a = -1.0f;
                    c1155yq.f48278b = i4;
                    c1155yq.f48279c = -1;
                    return;
                }
                return;
            }
            if (i5 == -1 || i5 < 0) {
                return;
            }
            c1155yq.f48275a = -1.0f;
            c1155yq.f48278b = -1;
            c1155yq.f48279c = i5;
            return;
        }
        int i6 = c1178zm.f48405al;
        int i7 = c1178zm.f48406am;
        int i8 = c1178zm.f48407an;
        int i9 = c1178zm.f48408ao;
        int i10 = c1178zm.f48409ap;
        int i11 = c1178zm.f48410aq;
        float f3 = c1178zm.f48411ar;
        int i12 = c1178zm.f48431p;
        if (i12 != -1) {
            C1152yn c1152yn6 = (C1152yn) sparseArray.get(i12);
            if (c1152yn6 != null) {
                float f4 = c1178zm.f48433r;
                c1152yn.m19700u(EnumC1150yl.CENTER, c1152yn6, EnumC1150yl.CENTER, c1178zm.f48432q, 0);
                c1152yn.f48190F = f4;
                f = 0.0f;
            } else {
                f = 0.0f;
            }
        } else {
            if (i6 != -1) {
                C1152yn c1152yn7 = (C1152yn) sparseArray.get(i6);
                if (c1152yn7 != null) {
                    f = 0.0f;
                    c1152yn.m19700u(EnumC1150yl.LEFT, c1152yn7, EnumC1150yl.LEFT, c1178zm.leftMargin, i10);
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
                if (i7 != -1 && (c1152yn2 = (C1152yn) sparseArray.get(i7)) != null) {
                    c1152yn.m19700u(EnumC1150yl.LEFT, c1152yn2, EnumC1150yl.RIGHT, c1178zm.leftMargin, i10);
                }
            }
            if (i8 != -1) {
                C1152yn c1152yn8 = (C1152yn) sparseArray.get(i8);
                if (c1152yn8 != null) {
                    c1152yn.m19700u(EnumC1150yl.RIGHT, c1152yn8, EnumC1150yl.LEFT, c1178zm.rightMargin, i11);
                }
            } else if (i9 != -1 && (c1152yn3 = (C1152yn) sparseArray.get(i9)) != null) {
                c1152yn.m19700u(EnumC1150yl.RIGHT, c1152yn3, EnumC1150yl.RIGHT, c1178zm.rightMargin, i11);
            }
            int i13 = c1178zm.f48424i;
            if (i13 != -1) {
                C1152yn c1152yn9 = (C1152yn) sparseArray.get(i13);
                if (c1152yn9 != null) {
                    c1152yn.m19700u(EnumC1150yl.TOP, c1152yn9, EnumC1150yl.TOP, c1178zm.topMargin, c1178zm.f48439x);
                }
            } else {
                int i14 = c1178zm.f48425j;
                if (i14 != -1 && (c1152yn4 = (C1152yn) sparseArray.get(i14)) != null) {
                    c1152yn.m19700u(EnumC1150yl.TOP, c1152yn4, EnumC1150yl.BOTTOM, c1178zm.topMargin, c1178zm.f48439x);
                }
            }
            int i15 = c1178zm.f48426k;
            if (i15 != -1) {
                C1152yn c1152yn10 = (C1152yn) sparseArray.get(i15);
                if (c1152yn10 != null) {
                    c1152yn.m19700u(EnumC1150yl.BOTTOM, c1152yn10, EnumC1150yl.TOP, c1178zm.bottomMargin, c1178zm.f48441z);
                }
            } else {
                int i16 = c1178zm.f48427l;
                if (i16 != -1 && (c1152yn5 = (C1152yn) sparseArray.get(i16)) != null) {
                    c1152yn.m19700u(EnumC1150yl.BOTTOM, c1152yn5, EnumC1150yl.BOTTOM, c1178zm.bottomMargin, c1178zm.f48441z);
                }
            }
            int i17 = c1178zm.f48428m;
            if (i17 != -1) {
                setWidgetBaseline(c1152yn, c1178zm, sparseArray, i17, EnumC1150yl.BASELINE);
            } else {
                int i18 = c1178zm.f48429n;
                if (i18 != -1) {
                    setWidgetBaseline(c1152yn, c1178zm, sparseArray, i18, EnumC1150yl.TOP);
                } else {
                    int i19 = c1178zm.f48430o;
                    if (i19 != -1) {
                        setWidgetBaseline(c1152yn, c1178zm, sparseArray, i19, EnumC1150yl.BOTTOM);
                    }
                }
            }
            if (f3 >= f) {
                c1152yn.f48217af = f3;
            }
            float f5 = c1178zm.f48374H;
            if (f5 >= f) {
                c1152yn.f48218ag = f5;
            }
        }
        if (z) {
            int i20 = c1178zm.f48390X;
            if (i20 != -1) {
                int i21 = c1178zm.f48391Y;
                c1152yn.f48212aa = i20;
                c1152yn.f48213ab = i21;
            } else if (c1178zm.f48391Y != -1) {
                i20 = -1;
                int i22 = c1178zm.f48391Y;
                c1152yn.f48212aa = i20;
                c1152yn.f48213ab = i22;
            }
        }
        if (c1178zm.f48398ae) {
            c1152yn.m19682Q(1);
            c1152yn.m19671F(c1178zm.width);
            if (c1178zm.width == -2) {
                c1152yn.m19682Q(2);
            }
        } else if (c1178zm.width == -1) {
            if (c1178zm.f48394aa) {
                c1152yn.m19682Q(3);
            } else {
                c1152yn.m19682Q(4);
            }
            c1152yn.mo19692m(EnumC1150yl.LEFT).f48182g = c1178zm.leftMargin;
            c1152yn.mo19692m(EnumC1150yl.RIGHT).f48182g = c1178zm.rightMargin;
        } else {
            c1152yn.m19682Q(3);
            c1152yn.m19671F(0);
        }
        if (c1178zm.f48399af) {
            c1152yn.m19683R(1);
            c1152yn.m19666A(c1178zm.height);
            if (c1178zm.height == -2) {
                c1152yn.m19683R(2);
            }
        } else if (c1178zm.height == -1) {
            if (c1178zm.f48395ab) {
                c1152yn.m19683R(3);
            } else {
                c1152yn.m19683R(4);
            }
            c1152yn.mo19692m(EnumC1150yl.TOP).f48182g = c1178zm.topMargin;
            c1152yn.mo19692m(EnumC1150yl.BOTTOM).f48182g = c1178zm.bottomMargin;
        } else {
            c1152yn.m19683R(3);
            c1152yn.m19666A(0);
        }
        String str = c1178zm.f48375I;
        if (str == null || str.length() == 0) {
            c1152yn.f48209Y = f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
                i2 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i3 = 0;
                } else {
                    i3 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i23 = i3;
                i2 = iIndexOf + 1;
                i = i23;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = 0.0f;
                    }
                    if (fAbs > f) {
                        c1152yn.f48209Y = fAbs;
                        c1152yn.f48210Z = i;
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = 0.0f;
                    } else {
                        float f6 = Float.parseFloat(strSubstring3);
                        float f7 = Float.parseFloat(strSubstring4);
                        if (f6 <= f || f7 <= f) {
                            fAbs = 0.0f;
                        } else {
                            fAbs = i == 1 ? Math.abs(f7 / f6) : Math.abs(f6 / f7);
                        }
                    }
                }
            } catch (NumberFormatException e) {
                fAbs = 0.0f;
            }
            if (fAbs > f) {
                c1152yn.f48209Y = fAbs;
                c1152yn.f48210Z = i;
            }
        }
        float f8 = c1178zm.f48378L;
        float[] fArr = c1152yn.f48224am;
        fArr[0] = f8;
        fArr[1] = c1178zm.f48379M;
        c1152yn.f48222ak = c1178zm.f48380N;
        c1152yn.f48223al = c1178zm.f48381O;
        int i24 = c1178zm.f48397ad;
        if (i24 >= 0 && i24 <= 3) {
            c1152yn.f48245s = i24;
        }
        int i25 = c1178zm.f48382P;
        int i26 = c1178zm.f48384R;
        int i27 = c1178zm.f48386T;
        float f9 = c1178zm.f48388V;
        c1152yn.f48246t = i25;
        c1152yn.f48249w = i26;
        if (i27 == Integer.MAX_VALUE) {
            i27 = 0;
        }
        c1152yn.f48250x = i27;
        c1152yn.f48251y = f9;
        if (f9 > f && f9 < 1.0f && i25 == 0) {
            c1152yn.f48246t = 2;
        }
        int i28 = c1178zm.f48383Q;
        int i29 = c1178zm.f48385S;
        int i30 = c1178zm.f48387U;
        float f10 = c1178zm.f48389W;
        c1152yn.f48247u = i28;
        c1152yn.f48252z = i29;
        if (i30 == Integer.MAX_VALUE) {
            i30 = 0;
        }
        c1152yn.f48185A = i30;
        c1152yn.f48186B = f10;
        if (f10 <= f || f10 >= 1.0f || i28 != 0) {
            return;
        }
        c1152yn.f48247u = 2;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1178zm;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        float f = (Integer.parseInt(strArrSplit[3]) / 1920.0f) * height;
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f2 = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f3 = i7;
                        float f4 = i6;
                        canvas.drawLine(f3, f4, f2, f4, paint);
                        float f5 = i6 + ((int) f);
                        canvas.drawLine(f2, f4, f2, f5, paint);
                        canvas.drawLine(f2, f5, f3, f5, paint);
                        canvas.drawLine(f3, f5, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f2, f5, paint);
                        canvas.drawLine(f3, f5, f2, f4, paint);
                    }
                }
            }
        }
    }

    protected boolean dynamicUpdateConstraints(int i, int i2) {
        int i3;
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        ArrayList arrayList = this.mModifiers;
        int size = arrayList.size();
        int i4 = 0;
        boolean zM19800a = false;
        while (i4 < size) {
            InterfaceC1180zo interfaceC1180zo = (InterfaceC1180zo) arrayList.get(i4);
            ArrayList arrayList2 = this.mLayoutWidget.f48284aK;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (true) {
                i3 = i4 + 1;
                if (i5 < size2) {
                    View view = (View) ((C1152yn) arrayList2.get(i5)).f48219ah;
                    view.getId();
                    zM19800a |= interfaceC1180zo.m19800a();
                    i5++;
                }
            }
            i4 = i3;
        }
        return zM19800a;
    }

    public void fillMetrics(C1142yd c1142yd) {
        this.mMetrics = c1142yd;
        this.mLayoutWidget.m19716c(c1142yd);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f48271az;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f48239m == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f48239m = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f48239m = "parent";
            }
        }
        C1153yo c1153yo = this.mLayoutWidget;
        if (c1153yo.f48221aj == null) {
            c1153yo.f48221aj = c1153yo.f48239m;
            String str = c1153yo.f48221aj;
        }
        ArrayList arrayList = c1153yo.f48284aK;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1152yn c1152yn = (C1152yn) arrayList.get(i);
            Object obj = c1152yn.f48219ah;
            if (obj != null) {
                if (c1152yn.f48239m == null && (id = ((View) obj).getId()) != -1) {
                    c1152yn.f48239m = getContext().getResources().getResourceEntryName(id);
                }
                if (c1152yn.f48221aj == null) {
                    c1152yn.f48221aj = c1152yn.f48239m;
                    String str2 = c1152yn.f48221aj;
                }
            }
        }
        this.mLayoutWidget.mo19699t(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    public final C1152yn getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1178zm) {
            return ((C1178zm) view.getLayoutParams()).f48415av;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1178zm) {
            return ((C1178zm) view.getLayoutParams()).f48415av;
        }
        return null;
    }

    protected boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || getLayoutDirection() != 1) {
            return false;
        }
        return USE_CONSTRAINTS_HELPER;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C1183zr(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException e) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1142yd c1142yd = this.mMetrics;
        if (c1142yd != null) {
            c1142yd.f48084D++;
        }
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1178zm c1178zm = (C1178zm) childAt.getLayoutParams();
            C1152yn c1152yn = c1178zm.f48415av;
            if (childAt.getVisibility() != 8 || c1178zm.f48401ah || c1178zm.f48402ai) {
                boolean z2 = c1178zm.f48403aj;
                int iM19690k = c1152yn.m19690k();
                int iM19691l = c1152yn.m19691l();
                childAt.layout(iM19690k, iM19691l, c1152yn.m19689j() + iM19690k, c1152yn.m19687h() + iM19691l);
                if (!(childAt instanceof aab)) {
                    throw null;
                }
            } else {
                boolean z3 = c1178zm.f48404ak;
                if (zIsInEditMode) {
                    boolean z4 = c1178zm.f48403aj;
                    int iM19690k2 = c1152yn.m19690k();
                    int iM19691l2 = c1152yn.m19691l();
                    childAt.layout(iM19690k2, iM19691l2, c1152yn.m19689j() + iM19690k2, c1152yn.m19687h() + iM19691l2);
                    if (!(childAt instanceof aab)) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        long jNanoTime;
        if (this.mMetrics != null) {
            jNanoTime = System.nanoTime();
            this.mMetrics.f48087G = getChildCount();
            this.mMetrics.f48088H++;
        } else {
            jNanoTime = 0;
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f48273c = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C1153yo c1153yo = this.mLayoutWidget;
                c1153yo.f48263aJ.m19480h(c1153yo);
            }
        }
        this.mLayoutWidget.m19716c(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int iM19689j = this.mLayoutWidget.m19689j();
        int iM19687h = this.mLayoutWidget.m19687h();
        C1153yo c1153yo2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, iM19689j, iM19687h, c1153yo2.f48254aA, c1153yo2.f48255aB);
        C1142yd c1142yd = this.mMetrics;
        if (c1142yd != null) {
            c1142yd.f48086F += System.nanoTime() - jNanoTime;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1152yn viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C1155yq)) {
            C1178zm c1178zm = (C1178zm) view.getLayoutParams();
            c1178zm.f48415av = new C1155yq();
            c1178zm.f48401ah = USE_CONSTRAINTS_HELPER;
            ((C1155yq) c1178zm.f48415av).m19718c(c1178zm.f48392Z);
        }
        if (view instanceof C1176zk) {
            C1176zk c1176zk = (C1176zk) view;
            c1176zk.m19796h();
            ((C1178zm) view.getLayoutParams()).f48402ai = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(c1176zk)) {
                this.mConstraintHelpers.add(c1176zk);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m19722aa(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C1183zr(getContext(), this, i);
    }

    void removeValueModifier(InterfaceC1180zo interfaceC1180zo) {
        if (interfaceC1180zo == null) {
            return;
        }
        this.mModifiers.remove(interfaceC1180zo);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C1179zn c1179zn = this.mMeasurer;
        int i5 = c1179zn.f48446e;
        int iResolveSizeAndState = resolveSizeAndState(i3 + c1179zn.f48445d, i, 0) & 16777215;
        int iResolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0234 A[EDGE_INSN: B:113:0x0234->B:114:0x0250 BREAK  A[LOOP:9: B:103:0x01fd->B:404:?]] */
    /* JADX WARN: Code duplicated, block: B:362:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x00f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:402:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    protected void resolveSystem(C1153yo c1153yo, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        boolean zM19713X;
        int i5;
        int i6;
        int i7;
        int i8;
        C1179zn c1179zn;
        boolean z3;
        boolean z4;
        C1170ze c1170ze;
        C1172zg c1172zg;
        boolean zM19713X2;
        int i9;
        ArrayList arrayList;
        int size;
        int i10;
        boolean zMo19729e;
        boolean z5;
        boolean z6;
        ArrayList arrayList2;
        C1142yd c1142yd;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i11 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        C1179zn c1179zn2 = this.mMeasurer;
        c1179zn2.f48443b = iMax;
        c1179zn2.f48444c = iMax2;
        c1179zn2.f48445d = paddingWidth;
        c1179zn2.f48446e = i11;
        c1179zn2.f48447f = i2;
        c1179zn2.f48448g = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? isRtl() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i12 = size2 - paddingWidth;
        int i13 = size3 - i11;
        setSelfDimensionBehaviour(c1153yo, mode, i12, mode2, i13);
        c1153yo.f48265at = iMax5;
        c1153yo.f48266au = iMax;
        C1058va c1058va = c1153yo.f48263aJ;
        C1179zn c1179zn3 = c1153yo.f48262aI;
        int size4 = c1153yo.f48284aK.size();
        boolean zM19721b = C1157ys.m19721b(i, 128);
        int iM19689j = c1153yo.m19689j();
        int iM19687h = c1153yo.m19687h();
        boolean z7 = (zM19721b || C1157ys.m19721b(i, 64)) ? USE_CONSTRAINTS_HELPER : false;
        if (!z7) {
            z = z7;
            break;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                z = z7;
                break;
            }
            C1152yn c1152yn = (C1152yn) c1153yo.f48284aK.get(i14);
            boolean z8 = z7;
            boolean z9 = (c1152yn.m19680O() == 3 && c1152yn.m19681P() == 3 && c1152yn.f48209Y > 0.0f) ? USE_CONSTRAINTS_HELPER : false;
            if (c1152yn.m19676K()) {
                if (!z9) {
                    z9 = false;
                    if (c1152yn.m19677L()) {
                        if (c1152yn instanceof C1158yt) {
                            z = false;
                            break;
                        } else {
                            if (c1152yn.m19676K()) {
                            }
                            z = false;
                            break;
                        }
                    }
                    if (c1152yn instanceof C1158yt) {
                        z = false;
                        break;
                    } else {
                        if (c1152yn.m19676K()) {
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
            }
            if (c1152yn.m19677L() && z9) {
                z = false;
                break;
            }
            if (c1152yn instanceof C1158yt) {
                z = false;
                break;
            } else if (!c1152yn.m19676K() || c1152yn.m19677L()) {
                z = false;
                break;
            } else {
                i14++;
                z7 = z8;
            }
        }
        if (z && (c1142yd = C1141yc.f48062b) != null) {
            c1142yd.f48095e++;
        }
        if (mode != 1073741824) {
            if (zM19721b) {
                z2 = USE_CONSTRAINTS_HELPER;
            } else {
                z2 = false;
            }
        } else if (mode2 != 1073741824) {
            mode = 1073741824;
            if (zM19721b) {
                z2 = USE_CONSTRAINTS_HELPER;
            } else {
                z2 = false;
            }
        } else {
            z2 = USE_CONSTRAINTS_HELPER;
            mode = 1073741824;
            mode2 = 1073741824;
        }
        boolean z10 = z2 & z;
        if (z10) {
            int iMin = Math.min(c1153yo.f48189E[0], i12);
            int iMin2 = Math.min(c1153yo.f48189E[1], i13);
            boolean z11 = mode == 1073741824 ? false : USE_CONSTRAINTS_HELPER;
            if (mode == 1073741824 && c1153yo.m19689j() != iMin) {
                c1153yo.m19671F(iMin);
                c1153yo.m19710U();
            }
            boolean z12 = mode2 == 1073741824 ? false : USE_CONSTRAINTS_HELPER;
            if (mode2 == 1073741824 && c1153yo.m19687h() != iMin2) {
                c1153yo.m19666A(iMin2);
                c1153yo.m19710U();
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                C1163yy c1163yy = c1153yo.f48253a;
                if (c1163yy.f48298b || c1163yy.f48299c) {
                    ArrayList arrayList3 = c1163yy.f48297a.f48284aK;
                    int size5 = arrayList3.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        C1152yn c1152yn2 = (C1152yn) arrayList3.get(i15);
                        c1152yn2.m19698s();
                        c1152yn2.f48231e = false;
                        c1152yn2.f48234h.m19774g();
                        c1152yn2.f48235i.m19777g();
                    }
                    c1163yy.f48297a.m19698s();
                    C1153yo c1153yo2 = c1163yy.f48297a;
                    i9 = 0;
                    c1153yo2.f48231e = false;
                    c1153yo2.f48234h.m19774g();
                    c1163yy.f48297a.f48235i.m19777g();
                    c1163yy.f48299c = false;
                } else {
                    i9 = 0;
                }
                c1163yy.m19737d(c1163yy.f48300d);
                C1153yo c1153yo3 = c1163yy.f48297a;
                c1153yo3.f48212aa = i9;
                c1153yo3.f48213ab = i9;
                int iM19679N = c1153yo3.m19679N(i9);
                int iM19679N2 = c1163yy.f48297a.m19679N(1);
                if (c1163yy.f48298b) {
                    c1163yy.m19735b();
                }
                C1153yo c1153yo4 = c1163yy.f48297a;
                int iM19690k = c1153yo4.m19690k();
                int iM19691l = c1153yo4.m19691l();
                c1153yo4.f48234h.f48347i.mo19740c(iM19690k);
                c1163yy.f48297a.f48235i.f48347i.mo19740c(iM19691l);
                c1163yy.m19736c();
                if (iM19679N != 2) {
                    if (iM19679N2 == 2) {
                        iM19679N2 = 2;
                        if (zM19721b) {
                            arrayList = c1163yy.f48301e;
                            size = arrayList.size();
                            i10 = 0;
                            do {
                                if (i10 < size) {
                                    if (iM19679N == 2) {
                                        c1163yy.f48297a.m19682Q(1);
                                        C1153yo c1153yo5 = c1163yy.f48297a;
                                        c1153yo5.m19671F(c1163yy.m19734a(c1153yo5, 0));
                                        C1153yo c1153yo6 = c1163yy.f48297a;
                                        c1153yo6.f48234h.f48344f.mo19740c(c1153yo6.m19689j());
                                        iM19679N = 2;
                                    }
                                    if (iM19679N2 == 2) {
                                        break;
                                    }
                                    c1163yy.f48297a.m19683R(1);
                                    C1153yo c1153yo7 = c1163yy.f48297a;
                                    c1153yo7.m19666A(c1163yy.m19734a(c1153yo7, 1));
                                    C1153yo c1153yo8 = c1163yy.f48297a;
                                    c1153yo8.f48235i.f48344f.mo19740c(c1153yo8.m19687h());
                                    break;
                                }
                                zMo19729e = ((AbstractC1174zi) arrayList.get(i10)).mo19729e();
                                i10++;
                            } while (zMo19729e);
                        }
                    }
                } else if (zM19721b) {
                    arrayList = c1163yy.f48301e;
                    size = arrayList.size();
                    i10 = 0;
                    do {
                        if (i10 < size) {
                            if (iM19679N == 2) {
                                c1163yy.f48297a.m19682Q(1);
                                C1153yo c1153yo9 = c1163yy.f48297a;
                                c1153yo9.m19671F(c1163yy.m19734a(c1153yo9, 0));
                                C1153yo c1153yo10 = c1163yy.f48297a;
                                c1153yo10.f48234h.f48344f.mo19740c(c1153yo10.m19689j());
                                iM19679N = 2;
                            }
                            if (iM19679N2 == 2) {
                                break;
                            }
                            c1163yy.f48297a.m19683R(1);
                            C1153yo c1153yo11 = c1163yy.f48297a;
                            c1153yo11.m19666A(c1163yy.m19734a(c1153yo11, 1));
                            C1153yo c1153yo12 = c1163yy.f48297a;
                            c1153yo12.f48235i.f48344f.mo19740c(c1153yo12.m19687h());
                            break;
                        }
                        zMo19729e = ((AbstractC1174zi) arrayList.get(i10)).mo19729e();
                        i10++;
                    } while (zMo19729e);
                }
                C1153yo c1153yo13 = c1163yy.f48297a;
                int i16 = c1153yo13.f48229ar[0];
                if (i16 == 1 || i16 == 4) {
                    int iM19689j2 = c1153yo13.m19689j() + iM19690k;
                    c1153yo13.f48234h.f48348j.mo19740c(iM19689j2);
                    c1163yy.f48297a.f48234h.f48344f.mo19740c(iM19689j2 - iM19690k);
                    c1163yy.m19736c();
                    C1153yo c1153yo14 = c1163yy.f48297a;
                    int i17 = c1153yo14.f48229ar[1];
                    if (i17 == 1 || i17 == 4) {
                        int iM19687h2 = c1153yo14.m19687h() + iM19691l;
                        c1153yo14.f48235i.f48348j.mo19740c(iM19687h2);
                        c1163yy.f48297a.f48235i.f48344f.mo19740c(iM19687h2 - iM19691l);
                    }
                    c1163yy.m19736c();
                    z5 = USE_CONSTRAINTS_HELPER;
                } else {
                    z5 = false;
                }
                ArrayList arrayList4 = c1163yy.f48301e;
                int size6 = arrayList4.size();
                int i18 = 0;
                while (i18 < size6) {
                    AbstractC1174zi abstractC1174zi = (AbstractC1174zi) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    int i19 = size6;
                    if (abstractC1174zi.f48342d != c1163yy.f48297a || abstractC1174zi.f48346h) {
                        abstractC1174zi.mo19727c();
                    }
                    i18++;
                    arrayList4 = arrayList5;
                    size6 = i19;
                }
                ArrayList arrayList6 = c1163yy.f48301e;
                int size7 = arrayList6.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size7) {
                        zM19713X = USE_CONSTRAINTS_HELPER;
                        break;
                    }
                    AbstractC1174zi abstractC1174zi2 = (AbstractC1174zi) arrayList6.get(i20);
                    if (z5) {
                        z6 = z5;
                        arrayList2 = arrayList6;
                    } else {
                        z6 = z5;
                        arrayList2 = arrayList6;
                        if (abstractC1174zi2.f48342d == c1163yy.f48297a) {
                            continue;
                        }
                        i20++;
                        z5 = z6;
                        arrayList6 = arrayList2;
                    }
                    if (!abstractC1174zi2.f48347i.f48313i) {
                        zM19713X = false;
                        break;
                    }
                    if (!abstractC1174zi2.f48348j.f48313i && !(abstractC1174zi2 instanceof C1168zc)) {
                        zM19713X = false;
                        break;
                    }
                    if (!abstractC1174zi2.f48344f.f48313i && !(abstractC1174zi2 instanceof C1161yw) && !(abstractC1174zi2 instanceof C1168zc)) {
                        zM19713X = false;
                        break;
                    } else {
                        i20++;
                        z5 = z6;
                        arrayList6 = arrayList2;
                    }
                }
                c1163yy.f48297a.m19682Q(iM19679N);
                c1163yy.f48297a.m19683R(iM19679N2);
                i4 = iM19689j;
                i5 = 2;
            } else {
                C1163yy c1163yy2 = c1153yo.f48253a;
                if (c1163yy2.f48298b) {
                    ArrayList arrayList7 = c1163yy2.f48297a.f48284aK;
                    int size8 = arrayList7.size();
                    int i21 = 0;
                    while (i21 < size8) {
                        C1152yn c1152yn3 = (C1152yn) arrayList7.get(i21);
                        c1152yn3.m19698s();
                        c1152yn3.f48231e = false;
                        int i22 = size8;
                        C1170ze c1170ze2 = c1152yn3.f48234h;
                        c1170ze2.f48344f.f48313i = false;
                        c1170ze2.f48346h = false;
                        c1170ze2.m19774g();
                        C1172zg c1172zg2 = c1152yn3.f48235i;
                        c1172zg2.f48344f.f48313i = false;
                        c1172zg2.f48346h = false;
                        c1172zg2.m19777g();
                        i21++;
                        size8 = i22;
                        arrayList7 = arrayList7;
                        iM19689j = iM19689j;
                    }
                    i4 = iM19689j;
                    c1163yy2.f48297a.m19698s();
                    C1153yo c1153yo15 = c1163yy2.f48297a;
                    c1153yo15.f48231e = false;
                    C1170ze c1170ze3 = c1153yo15.f48234h;
                    c1170ze3.f48344f.f48313i = false;
                    c1170ze3.f48346h = false;
                    c1170ze3.m19774g();
                    C1172zg c1172zg3 = c1163yy2.f48297a.f48235i;
                    c1172zg3.f48344f.f48313i = false;
                    c1172zg3.f48346h = false;
                    c1172zg3.m19777g();
                    c1163yy2.m19735b();
                } else {
                    i4 = iM19689j;
                }
                c1163yy2.m19737d(c1163yy2.f48300d);
                C1153yo c1153yo16 = c1163yy2.f48297a;
                c1153yo16.f48212aa = 0;
                c1153yo16.f48213ab = 0;
                c1153yo16.f48234h.f48347i.mo19740c(0);
                c1163yy2.f48297a.f48235i.f48347i.mo19740c(0);
                if (mode == 1073741824) {
                    zM19713X2 = c1153yo.m19713X(zM19721b, 0);
                    i5 = 1;
                } else {
                    i5 = 0;
                    zM19713X2 = USE_CONSTRAINTS_HELPER;
                }
                if (mode2 == 1073741824) {
                    zM19713X = c1153yo.m19713X(zM19721b, 1) & zM19713X2;
                    i5++;
                } else {
                    zM19713X = zM19713X2;
                }
            }
            if (zM19713X) {
                c1153yo.mo19672G(z11 ^ USE_CONSTRAINTS_HELPER, z12 ^ USE_CONSTRAINTS_HELPER);
            }
        } else {
            i4 = iM19689j;
            zM19713X = false;
            i5 = 0;
        }
        if (!zM19713X || i5 != 2) {
            int i23 = c1153yo.f48271az;
            if (size4 > 0) {
                int size9 = c1153yo.f48284aK.size();
                boolean zM19714Y = c1153yo.m19714Y(64);
                C1179zn c1179zn4 = c1153yo.f48262aI;
                for (int i24 = 0; i24 < size9; i24++) {
                    C1152yn c1152yn4 = (C1152yn) c1153yo.f48284aK.get(i24);
                    if (!(c1152yn4 instanceof C1155yq) && !(c1152yn4 instanceof C1148yj)) {
                        boolean z13 = c1152yn4.f48192H;
                        if (!zM19714Y || (c1170ze = c1152yn4.f48234h) == null || (c1172zg = c1152yn4.f48235i) == null || !c1170ze.f48344f.f48313i || !c1172zg.f48344f.f48313i) {
                            int iM19679N3 = c1152yn4.m19679N(0);
                            int iM19679N4 = c1152yn4.m19679N(1);
                            if (iM19679N3 != 3) {
                                z4 = false;
                            } else if (c1152yn4.f48246t == 1 || iM19679N4 != 3) {
                                z4 = false;
                                iM19679N3 = 3;
                            } else if (c1152yn4.f48247u != 1) {
                                z4 = USE_CONSTRAINTS_HELPER;
                                iM19679N3 = 3;
                                iM19679N4 = 3;
                            } else {
                                z4 = false;
                                iM19679N3 = 3;
                                iM19679N4 = 3;
                            }
                            if (!z4) {
                                if (c1153yo.m19714Y(1) && !(c1152yn4 instanceof C1158yt)) {
                                    boolean z14 = (iM19679N3 != 3 || c1152yn4.f48246t != 0 || iM19679N4 == 3 || c1152yn4.m19676K()) ? false : USE_CONSTRAINTS_HELPER;
                                    if (iM19679N4 == 3 && c1152yn4.f48247u == 0 && iM19679N3 != 3 && !c1152yn4.m19676K()) {
                                        z14 = USE_CONSTRAINTS_HELPER;
                                    }
                                    if (((iM19679N3 == 3 || iM19679N4 == 3) && c1152yn4.f48209Y > 0.0f) || z14) {
                                    }
                                }
                                c1058va.m19482j(c1179zn4, c1152yn4, 0);
                                C1142yd c1142yd2 = c1153yo.f48274d;
                                if (c1142yd2 != null) {
                                    c1142yd2.f48093c++;
                                }
                            }
                        }
                    }
                }
                int childCount = c1179zn4.f48442a.getChildCount();
                for (int i25 = 0; i25 < childCount; i25++) {
                    View childAt = c1179zn4.f48442a.getChildAt(i25);
                    if (childAt instanceof aab) {
                        ConstraintLayout constraintLayout = c1179zn4.f48442a;
                        throw null;
                    }
                }
                int size10 = c1179zn4.f48442a.mConstraintHelpers.size();
                if (size10 > 0) {
                    for (int i26 = 0; i26 < size10; i26++) {
                        ConstraintLayout constraintLayout2 = c1179zn4.f48442a;
                    }
                }
            }
            if (c1153yo.f48274d != null) {
                System.nanoTime();
            }
            c1058va.m19480h(c1153yo);
            int size11 = ((ArrayList) c1058va.f47802a).size();
            if (size4 > 0) {
                i6 = iM19687h;
                i7 = i4;
                c1058va.m19481i(c1153yo, 0, i7, i6);
            } else {
                i6 = iM19687h;
                i7 = i4;
            }
            if (size11 > 0) {
                int iM19680O = c1153yo.m19680O();
                int iM19681P = c1153yo.m19681P();
                int iMax6 = Math.max(c1153yo.m19689j(), ((C1152yn) c1058va.f47803b).f48215ad);
                int iMax7 = Math.max(c1153yo.m19687h(), ((C1152yn) c1058va.f47803b).f48216ae);
                int i27 = 0;
                boolean z15 = false;
                while (i27 < size11) {
                    C1152yn c1152yn5 = (C1152yn) ((ArrayList) c1058va.f47802a).get(i27);
                    if (c1152yn5 instanceof C1158yt) {
                        int iM19689j3 = c1152yn5.m19689j();
                        int iM19687h3 = c1152yn5.m19687h();
                        boolean zM19482j = z15 | c1058va.m19482j(c1179zn3, c1152yn5, 1);
                        C1142yd c1142yd3 = c1153yo.f48274d;
                        if (c1142yd3 != null) {
                            c1142yd3.f48094d++;
                        }
                        int iM19689j4 = c1152yn5.m19689j();
                        int iM19687h4 = c1152yn5.m19687h();
                        if (iM19689j4 != iM19689j3) {
                            c1152yn5.m19671F(iM19689j4);
                            if (iM19680O == 2 && c1152yn5.m19688i() > iMax6) {
                                iMax6 = Math.max(iMax6, c1152yn5.m19688i() + c1152yn5.mo19692m(EnumC1150yl.RIGHT).m19651b());
                            }
                            z3 = USE_CONSTRAINTS_HELPER;
                        }
                        if (iM19687h4 != iM19687h3) {
                            z3 = zM19482j;
                            c1152yn5.m19666A(iM19687h4);
                            if (iM19681P == 2 && c1152yn5.m19686g() > iMax7) {
                                iMax7 = Math.max(iMax7, c1152yn5.m19686g() + c1152yn5.mo19692m(EnumC1150yl.BOTTOM).m19651b());
                            }
                            z3 = USE_CONSTRAINTS_HELPER;
                        }
                        z3 = zM19482j;
                        z15 = z3;
                    } else {
                        i7 = i7;
                        i6 = i6;
                    }
                    i27++;
                    i23 = i23;
                    i6 = i6;
                    i7 = i7;
                }
                i8 = i23;
                int i28 = i7;
                int i29 = i6;
                int i30 = 0;
                while (i30 < 2) {
                    int i31 = 0;
                    while (i31 < size11) {
                        C1152yn c1152yn6 = (C1152yn) ((ArrayList) c1058va.f47802a).get(i31);
                        if (((c1152yn6 instanceof C1156yr) && !(c1152yn6 instanceof C1158yt)) || (c1152yn6 instanceof C1155yq)) {
                            c1179zn = c1179zn3;
                            size11 = size11;
                            z10 = z10;
                        } else if (c1152yn6.f48220ai == 8) {
                            c1179zn = c1179zn3;
                            size11 = size11;
                            z10 = z10;
                        } else if (z10 && c1152yn6.f48234h.f48344f.f48313i && c1152yn6.f48235i.f48344f.f48313i) {
                            c1179zn = c1179zn3;
                            size11 = size11;
                            z10 = z10;
                        } else if (c1152yn6 instanceof C1158yt) {
                            c1179zn = c1179zn3;
                            size11 = size11;
                            z10 = z10;
                        } else {
                            int iM19689j5 = c1152yn6.m19689j();
                            int iM19687h5 = c1152yn6.m19687h();
                            int i32 = c1152yn6.f48214ac;
                            boolean zM19482j2 = z15 | c1058va.m19482j(c1179zn3, c1152yn6, i30 == 1 ? 2 : 1);
                            c1179zn = c1179zn3;
                            C1142yd c1142yd4 = c1153yo.f48274d;
                            if (c1142yd4 != null) {
                                c1142yd4.f48094d++;
                            }
                            int iM19689j6 = c1152yn6.m19689j();
                            int iM19687h6 = c1152yn6.m19687h();
                            if (iM19689j6 != iM19689j5) {
                                c1152yn6.m19671F(iM19689j6);
                                if (iM19680O == 2 && c1152yn6.m19688i() > iMax6) {
                                    iMax6 = Math.max(iMax6, c1152yn6.m19688i() + c1152yn6.mo19692m(EnumC1150yl.RIGHT).m19651b());
                                }
                                zM19482j2 = USE_CONSTRAINTS_HELPER;
                            }
                            if (iM19687h6 != iM19687h5) {
                                c1152yn6.m19666A(iM19687h6);
                                if (iM19681P == 2 && c1152yn6.m19686g() > iMax7) {
                                    iMax7 = Math.max(iMax7, c1152yn6.m19686g() + c1152yn6.mo19692m(EnumC1150yl.BOTTOM).m19651b());
                                }
                                zM19482j2 = USE_CONSTRAINTS_HELPER;
                            }
                            z15 = (!c1152yn6.f48191G || i32 == c1152yn6.f48214ac) ? zM19482j2 : USE_CONSTRAINTS_HELPER;
                        }
                        i31++;
                        z10 = z10;
                        size11 = size11;
                        c1179zn3 = c1179zn;
                    }
                    C1179zn c1179zn5 = c1179zn3;
                    int i33 = size11;
                    boolean z16 = z10;
                    if (!z15) {
                        break;
                    }
                    i30++;
                    c1058va.m19481i(c1153yo, i30, i28, i29);
                    z10 = z16;
                    c1179zn3 = c1179zn5;
                    z15 = false;
                    size11 = i33;
                }
            } else {
                i8 = i23;
            }
            c1153yo.m19712W(i8);
        }
        if (c1153yo.f48274d != null) {
            System.nanoTime();
        }
    }

    public void setConstraintSet(C1190zy c1190zy) {
        this.mConstraintSet = c1190zy;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(aaa aaaVar) {
        C1183zr c1183zr = this.mConstraintLayoutSpec;
        if (c1183zr != null) {
            c1183zr.f48464e = aaaVar;
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m19712W(i);
    }

    protected void setSelfDimensionBehaviour(C1153yo c1153yo, int i, int i2, int i3, int i4) {
        int i5;
        C1179zn c1179zn = this.mMeasurer;
        int i6 = c1179zn.f48446e;
        int i7 = c1179zn.f48445d;
        int childCount = getChildCount();
        int i8 = 2;
        switch (i) {
            case Integer.MIN_VALUE:
                if (childCount != 0) {
                    i5 = 2;
                } else {
                    i2 = Math.max(0, this.mMinWidth);
                    i5 = 2;
                    childCount = 0;
                }
                break;
            case 0:
                if (childCount != 0) {
                    i5 = 2;
                    i2 = 0;
                } else {
                    i2 = Math.max(0, this.mMinWidth);
                    i5 = 2;
                    childCount = 0;
                }
                break;
            case 1073741824:
                i2 = Math.min(this.mMaxWidth - i7, i2);
                i5 = 1;
                break;
            default:
                i5 = 1;
                i2 = 0;
                break;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                break;
            case 0:
                i4 = childCount != 0 ? 0 : Math.max(0, this.mMinHeight);
                break;
            case 1073741824:
                i4 = Math.min(this.mMaxHeight - i6, i4);
                i8 = 1;
                break;
            default:
                i4 = 0;
                i8 = 1;
                break;
        }
        if (i2 != c1153yo.m19689j() || i4 != c1153yo.m19687h()) {
            c1153yo.f48253a.f48299c = USE_CONSTRAINTS_HELPER;
        }
        c1153yo.f48212aa = 0;
        c1153yo.f48213ab = 0;
        int i9 = this.mMaxWidth - i7;
        int[] iArr = c1153yo.f48189E;
        iArr[0] = i9;
        iArr[1] = this.mMaxHeight - i6;
        c1153yo.m19670E(0);
        c1153yo.m19669D(0);
        c1153yo.m19682Q(i5);
        c1153yo.m19671F(i2);
        c1153yo.m19683R(i8);
        c1153yo.m19666A(i4);
        c1153yo.m19670E(this.mMinWidth - i7);
        c1153yo.m19669D(this.mMinHeight - i6);
    }

    public void setState(int i, int i2, int i3) {
        int iM19801a;
        C1183zr c1183zr = this.mConstraintLayoutSpec;
        if (c1183zr != null) {
            float f = i2;
            float f2 = i3;
            int i4 = c1183zr.f48461b;
            if (i4 == i) {
                C1181zp c1181zp = i == -1 ? (C1181zp) c1183zr.f48463d.valueAt(0) : (C1181zp) c1183zr.f48463d.get(i4);
                int i5 = c1183zr.f48462c;
                if ((i5 == -1 || !((C1182zq) ((ArrayList) c1181zp.f48452c).get(i5)).m19803a(f, f2)) && c1183zr.f48462c != (iM19801a = c1181zp.m19801a(f, f2))) {
                    C1190zy c1190zy = iM19801a == -1 ? null : ((C1182zq) ((ArrayList) c1181zp.f48452c).get(iM19801a)).f48459f;
                    if (iM19801a == -1) {
                        int i6 = c1181zp.f48451b;
                    } else {
                        int i7 = ((C1182zq) ((ArrayList) c1181zp.f48452c).get(iM19801a)).f48458e;
                    }
                    if (c1190zy != null) {
                        c1183zr.f48462c = iM19801a;
                        if (c1183zr.f48464e != null) {
                            throw null;
                        }
                        c1190zy.m19818c(c1183zr.f48460a);
                        if (c1183zr.f48464e != null) {
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            c1183zr.f48461b = i;
            C1181zp c1181zp2 = (C1181zp) c1183zr.f48463d.get(i);
            int iM19801a2 = c1181zp2.m19801a(f, f2);
            Object obj = iM19801a2 == -1 ? c1181zp2.f48453d : ((C1182zq) ((ArrayList) c1181zp2.f48452c).get(iM19801a2)).f48459f;
            if (iM19801a2 == -1) {
                int i8 = c1181zp2.f48451b;
            } else {
                int i9 = ((C1182zq) ((ArrayList) c1181zp2.f48452c).get(iM19801a2)).f48458e;
            }
            if (obj != null) {
                c1183zr.f48462c = iM19801a2;
                if (c1183zr.f48464e != null) {
                    throw null;
                }
                ((C1190zy) obj).m19818c(c1183zr.f48460a);
                if (c1183zr.f48464e != null) {
                    throw null;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public C1178zm generateDefaultLayoutParams() {
        return new C1178zm(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C1178zm generateLayoutParams(AttributeSet attributeSet) {
        return new C1178zm(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1178zm(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1153yo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1179zn(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1153yo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1179zn(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1153yo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1179zn(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }
}
