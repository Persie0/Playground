package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import p000.C3386nv;
import p000.C3479q;
import p000.ck6;
import p000.dy9;
import p000.fn1;
import p000.gh9;
import p000.hh9;
import p000.ih9;
import p000.jh9;
import p000.kh9;
import p000.l90;
import p000.p39;
import p000.qs5;
import p000.r39;
import p000.rr5;
import p000.vb1;

/* JADX INFO: renamed from: com.google.android.material.button.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1051b extends LinearLayout {

    /* JADX INFO: renamed from: H */
    public static final Object f12801H = null;

    /* JADX INFO: renamed from: l */
    public static final int f12802l = R$style.Widget_Material3_MaterialButtonGroup;

    /* JADX INFO: renamed from: a */
    public int f12803a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f12804b;

    /* JADX INFO: renamed from: c */
    public final ck6 f12805c;

    /* JADX INFO: renamed from: d */
    public final vb1 f12806d;

    /* JADX INFO: renamed from: e */
    public Integer[] f12807e;

    /* JADX INFO: renamed from: f */
    public gh9 f12808f;

    /* JADX INFO: renamed from: g */
    public ih9 f12809g;

    /* JADX INFO: renamed from: h */
    public int f12810h;

    /* JADX INFO: renamed from: i */
    public kh9 f12811i;

    /* JADX INFO: renamed from: j */
    public boolean f12812j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f12813k;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1051b(Context context, AttributeSet attributeSet, int i) {
        gh9 gh9VarM12657b;
        int next;
        int next2;
        int i2 = f12802l;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12803a = 0;
        this.f12804b = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f12805c = new ck6(materialButtonToggleGroup, 19);
        this.f12806d = new vb1(materialButtonToggleGroup, 1);
        this.f12812j = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f12813k = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialButtonGroup, i, i2, new int[0]);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = typedArrayM10751d.getResourceId(R$styleable.MaterialButtonGroup_buttonSizeChange, 0);
            kh9 kh9Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        kh9 kh9Var2 = new kh9();
                        kh9Var2.f47304c = new int[10][];
                        kh9Var2.f47305d = new jh9[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            kh9Var2.m15242b(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        kh9Var = kh9Var2;
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f12811i = kh9Var;
        }
        if (typedArrayM10751d.hasValue(R$styleable.MaterialButtonGroup_shapeAppearance)) {
            ih9 ih9VarM13916h = ih9.m13916h(context2, typedArrayM10751d, R$styleable.MaterialButtonGroup_shapeAppearance);
            this.f12809g = ih9VarM13916h;
            if (ih9VarM13916h == null) {
                this.f12809g = new hh9(r39.m20280g(context2, typedArrayM10751d.getResourceId(R$styleable.MaterialButtonGroup_shapeAppearance, 0), typedArrayM10751d.getResourceId(R$styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).m19627a()).m13253j();
            }
        }
        if (typedArrayM10751d.hasValue(R$styleable.MaterialButtonGroup_innerCornerSize)) {
            int i3 = R$styleable.MaterialButtonGroup_innerCornerSize;
            C3479q c3479q = new C3479q(0.0f);
            int resourceId2 = typedArrayM10751d.getResourceId(i3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        gh9 gh9Var = new gh9();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            gh9Var.m12662f(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                        gh9VarM12657b = gh9Var;
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    gh9VarM12657b = gh9.m12657b(c3479q);
                }
            } else {
                gh9VarM12657b = gh9.m12657b(r39.m20283j(typedArrayM10751d, i3, c3479q));
            }
            this.f12808f = gh9VarM12657b;
        }
        this.f12810h = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM10751d.getBoolean(R$styleable.MaterialButtonGroup_android_enabled, true));
        setOverflowMode(typedArrayM10751d.getInt(R$styleable.MaterialButtonGroup_overflowMode, 0));
        getResources().getDimensionPixelOffset(R$dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayM10751d.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static LinearLayout.LayoutParams m6078d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new rr5(layoutParams.width, layoutParams.height);
    }

    /* JADX INFO: renamed from: f */
    public static rr5 m6079f(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new rr5((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rr5((ViewGroup.MarginLayoutParams) layoutParams) : new rr5(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m6086i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m6086i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6080a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f12810h <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsM6078d = m6078d(childAt);
            if (getOrientation() == 0) {
                layoutParamsM6078d.setMarginEnd(0);
                layoutParamsM6078d.setMarginStart(this.f12810h - iMin);
                layoutParamsM6078d.topMargin = 0;
            } else {
                layoutParamsM6078d.bottomMargin = 0;
                layoutParamsM6078d.topMargin = this.f12810h - iMin;
                layoutParamsM6078d.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsM6078d);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsM6078d2 = m6078d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsM6078d2.topMargin = 0;
            layoutParamsM6078d2.bottomMargin = 0;
        } else {
            layoutParamsM6078d2.setMarginEnd(0);
            layoutParamsM6078d2.setMarginStart(0);
            layoutParamsM6078d2.leftMargin = 0;
            layoutParamsM6078d2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m6088k();
        this.f12812j = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f12805c);
        this.f12804b.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    /* JADX INFO: renamed from: b */
    public final void m6081b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f12811i == null) {
            return;
        }
        if (this.f12803a != 2) {
            m6082c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12813k;
            if (i >= arrayList.size()) {
                return;
            }
            m6082c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6082c(int i, int i2) {
        float fMax;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (m6086i(i3)) {
                ((MaterialButton) getChildAt(i3)).setWidthChangeDirection(i3 == i ? MaterialButton.WidthChangeDirection.END : i3 == i2 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH);
                int iMin2 = 0;
                if (m6086i(i3) && this.f12811i != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                    kh9 kh9Var = this.f12811i;
                    int width = materialButton.getWidth();
                    int i4 = -width;
                    for (int i5 = 0; i5 < kh9Var.f47302a; i5++) {
                        l90 l90Var = (l90) kh9Var.f47305d[i5].f45552b;
                        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = (StateListSizeChange$SizeChangeType) l90Var.f49323b;
                        float f = l90Var.f49322a;
                        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
                            fMax = Math.max(i4, f);
                        } else {
                            if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PERCENT) {
                                fMax = Math.max(i4, width * f);
                            }
                        }
                        i4 = (int) fMax;
                    }
                    int iMax = Math.max(0, i4);
                    MaterialButton materialButtonM6085h = m6085h(i3);
                    int allowedWidthDecrease = materialButtonM6085h == null ? 0 : materialButtonM6085h.getAllowedWidthDecrease();
                    MaterialButton materialButtonM6084g = m6084g(i3);
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButtonM6084g != null ? materialButtonM6084g.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
            i3++;
        }
        while (i <= i2) {
            if (m6086i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f12811i);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rr5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f12806d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f12807e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final rr5 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        rr5 rr5Var = new rr5(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialButtonGroup_Layout);
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialButtonGroup_Layout_layout_overflowIcon);
        typedArrayObtainStyledAttributes.getText(R$styleable.MaterialButtonGroup_Layout_layout_overflowText);
        typedArrayObtainStyledAttributes.recycle();
        return rr5Var;
    }

    /* JADX INFO: renamed from: g */
    public final MaterialButton m6084g(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (m6086i(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.f12813k;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= iIntValue && i <= iIntValue2 && (i2 < iIntValue || i2 > iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rr5(-2, -2);
    }

    public kh9 getButtonSizeChange() {
        return this.f12811i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f12807e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public fn1 getInnerCornerSize() {
        return this.f12808f.f40828b;
    }

    public gh9 getInnerCornerSizeStateList() {
        return this.f12808f;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f12803a;
    }

    public r39 getShapeAppearance() {
        ih9 ih9Var = this.f12809g;
        if (ih9Var == null) {
            return null;
        }
        return ih9Var.m13923i();
    }

    public int getSpacing() {
        return this.f12810h;
    }

    public ih9 getStateListShapeAppearance() {
        return this.f12809g;
    }

    /* JADX INFO: renamed from: h */
    public final MaterialButton m6085h(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (m6086i(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.f12813k;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= iIntValue && i < iIntValue2 && (i2 < iIntValue || i2 >= iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6086i(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: j */
    public final void m6087j(MaterialButton materialButton, int i) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonM6085h = m6085h(iIndexOfChild);
        MaterialButton materialButtonM6084g = m6084g(iIndexOfChild);
        if (materialButtonM6085h == null && materialButtonM6084g == null) {
            return;
        }
        if (materialButtonM6085h == null) {
            materialButtonM6084g.setDisplayedWidthDecrease(i);
        }
        if (materialButtonM6084g == null) {
            materialButtonM6085h.setDisplayedWidthDecrease(i);
        }
        if (materialButtonM6085h == null || materialButtonM6084g == null) {
            return;
        }
        materialButtonM6085h.setDisplayedWidthDecrease(i / 2);
        materialButtonM6084g.setDisplayedWidthDecrease((i + 1) / 2);
    }

    /* JADX INFO: renamed from: k */
    public final void m6088k() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f12773a0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f12773a0 = null;
                materialButton.f12770U = -2.1474836E9f;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6089l() {
        int i;
        if (!(this.f12808f == null && this.f12809g == null) && this.f12812j) {
            this.f12812j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    p39 p39Var = this.f12809g;
                    ArrayList arrayList = this.f12804b;
                    if (p39Var == null || (!z && !z2)) {
                        p39Var = (p39) arrayList.get(i2);
                    }
                    hh9 hh9Var = !(p39Var instanceof ih9) ? new hh9((r39) arrayList.get(i2)) : new hh9((ih9) p39Var);
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    gh9 gh9Var = this.f12808f;
                    if ((i3 | 1) == i3) {
                        hh9Var.f42381e = gh9Var;
                    }
                    if ((i3 | 2) == i3) {
                        hh9Var.f42382f = gh9Var;
                    }
                    if ((i3 | 4) == i3) {
                        hh9Var.f42383g = gh9Var;
                    }
                    if ((i3 | 8) == i3) {
                        hh9Var.f42384h = gh9Var;
                    }
                    ih9 ih9VarM13253j = hh9Var.m13253j();
                    boolean zMo13922f = ih9VarM13253j.mo13922f();
                    ih9 ih9VarM13923i = ih9VarM13253j;
                    if (!zMo13922f) {
                        ih9VarM13923i = ih9VarM13253j.m13923i();
                    }
                    materialButton.setShapeAppearance(ih9VarM13923i);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m6088k();
            m6081b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        m6080a();
        if (this.f12803a != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                C3386nv.m17626m("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                C3386nv.m17626m("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.f12813k;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (m6086i(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsM6078d = m6078d(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f12810h) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.f12810h);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsM6078d.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.f12810h);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsM6078d.topMargin += i4;
                        view.setLayoutParams(layoutParamsM6078d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i3));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i7)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsM6078d2 = m6078d(materialButton);
                int i8 = layoutParamsM6078d2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsM6078d2.setMarginStart((layoutParamsM6078d2.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsM6078d2);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        m6089l();
        super.onMeasure(i, i2);
        if (this.f12803a != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f12804b.remove(iIndexOfChild);
        }
        this.f12812j = true;
        m6089l();
        m6088k();
        m6080a();
    }

    public void setButtonSizeChange(kh9 kh9Var) {
        if (this.f12811i != kh9Var) {
            this.f12811i = kh9Var;
            m6081b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(fn1 fn1Var) {
        this.f12808f = gh9.m12657b(fn1Var);
        this.f12812j = true;
        m6089l();
        invalidate();
    }

    public void setInnerCornerSizeStateList(gh9 gh9Var) {
        this.f12808f = gh9Var;
        this.f12812j = true;
        m6089l();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f12812j = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.f12803a != i) {
            this.f12803a = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(r39 r39Var) {
        this.f12809g = new hh9(r39Var).m13253j();
        this.f12812j = true;
        m6089l();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f12810h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(ih9 ih9Var) {
        this.f12809g = ih9Var;
        this.f12812j = true;
        m6089l();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m6079f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new rr5(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m6079f(layoutParams);
    }
}
