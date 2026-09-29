package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.timepicker.TimePickerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.C0006a4;
import p000.C3479q;
import p000.dta;
import p000.dy9;
import p000.gh9;
import p000.o0a;
import p000.og0;
import p000.qs5;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends AbstractC1051b {

    /* JADX INFO: renamed from: O */
    public static final int f12794O = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: I */
    public final LinkedHashSet f12795I;

    /* JADX INFO: renamed from: J */
    public boolean f12796J;

    /* JADX INFO: renamed from: K */
    public boolean f12797K;

    /* JADX INFO: renamed from: L */
    public boolean f12798L;

    /* JADX INFO: renamed from: M */
    public final int f12799M;

    /* JADX INFO: renamed from: N */
    public HashSet f12800N;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12794O;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12795I = new LinkedHashSet();
        this.f12796J = false;
        this.f12800N = new HashSet();
        TypedArray typedArrayM10751d = dy9.m10751d(getContext(), attributeSet, R$styleable.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayM10751d.getBoolean(R$styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f12799M = typedArrayM10751d.getResourceId(R$styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f12798L = typedArrayM10751d.getBoolean(R$styleable.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f12808f == null) {
            this.f12808f = gh9.m12657b(new C3479q(0.0f));
        }
        setEnabled(typedArrayM10751d.getBoolean(R$styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayM10751d.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f12797K ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.AbstractC1051b, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m6075m(materialButton.getId(), materialButton.f12765P);
        dta.m10640k(materialButton, new og0(this, 4));
    }

    public int getCheckedButtonId() {
        if (!this.f12797K || this.f12800N.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f12800N.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f12800N.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m6075m(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f12800N);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f12797K && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f12798L || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m6077o(hashSet);
    }

    /* JADX INFO: renamed from: n */
    public final void m6076n(MaterialButton materialButton, boolean z) {
        if (this.f12796J) {
            return;
        }
        m6075m(materialButton.getId(), z);
    }

    /* JADX INFO: renamed from: o */
    public final void m6077o(Set set) {
        HashSet hashSet = this.f12800N;
        this.f12800N = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f12796J = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f12796J = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f12795I.iterator();
                while (it.hasNext()) {
                    TimePickerView timePickerView = ((o0a) it.next()).f53563a;
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f12799M;
        if (i != -1) {
            m6077o(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0006a4.m94b(1, getVisibleButtonCount(), this.f12797K ? 1 : 2).f193a);
    }

    public void setSelectionRequired(boolean z) {
        this.f12798L = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f12797K != z) {
            this.f12797K = z;
            m6077o(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
