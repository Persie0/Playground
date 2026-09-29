package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.linguist.R;
import gd.C5762a;
import gd.C5772k;
import gd.InterfaceC5764c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import md.C7542a;
import p153hc.C6031a;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10344k;
import p507yc.C10347n;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f14921k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f14922a;

    /* JADX INFO: renamed from: b */
    public final C2974e f14923b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet<InterfaceC2973d> f14924c;

    /* JADX INFO: renamed from: d */
    public final C2970a f14925d;

    /* JADX INFO: renamed from: e */
    public Integer[] f14926e;

    /* JADX INFO: renamed from: f */
    public boolean f14927f;

    /* JADX INFO: renamed from: g */
    public boolean f14928g;

    /* JADX INFO: renamed from: h */
    public boolean f14929h;

    /* JADX INFO: renamed from: i */
    public final int f14930i;

    /* JADX INFO: renamed from: j */
    public HashSet f14931j;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C2970a implements Comparator<MaterialButton> {
        public C2970a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C2971b extends C10026a {
        public C2971b() {
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            int i10;
            this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
            int i11 = MaterialButtonToggleGroup.f14921k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        c10284f.m19266k(C10284f.c.m19275a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.m8637d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            c10284f.m19266k(C10284f.c.m19275a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C2972c {

        /* JADX INFO: renamed from: e */
        public static final C5762a f14934e = new C5762a(0.0f);

        /* JADX INFO: renamed from: a */
        public final InterfaceC5764c f14935a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5764c f14936b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5764c f14937c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5764c f14938d;

        public C2972c(InterfaceC5764c interfaceC5764c, InterfaceC5764c interfaceC5764c2, InterfaceC5764c interfaceC5764c3, InterfaceC5764c interfaceC5764c4) {
            this.f14935a = interfaceC5764c;
            this.f14936b = interfaceC5764c3;
            this.f14937c = interfaceC5764c4;
            this.f14938d = interfaceC5764c2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface InterfaceC2973d {
        /* JADX INFO: renamed from: a */
        void mo8640a();
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C2974e implements MaterialButton.InterfaceC2969b {
        public C2974e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f14922a = new ArrayList();
        this.f14923b = new C2974e();
        this.f14924c = new LinkedHashSet<>();
        this.f14925d = new C2970a();
        this.f14927f = false;
        this.f14931j = new HashSet();
        TypedArray typedArrayM19357d = C10344k.m19357d(getContext(), attributeSet, C6031a.f35669s, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM19357d.getBoolean(3, false));
        this.f14930i = typedArrayM19357d.getResourceId(1, -1);
        this.f14929h = typedArrayM19357d.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM19357d.getBoolean(0, true));
        typedArrayM19357d.recycle();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m8637d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m8637d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m8637d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            materialButton.setId(C10029b0.e.m18683a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f14923b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m8634a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonM8636c = m8636c(i10);
            int iMin = Math.min(materialButtonM8636c.getStrokeWidth(), m8636c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonM8636c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                C10040h.m18813g(layoutParams2, 0);
                C10040h.m18814h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                C10040h.m18814h(layoutParams2, 0);
            }
            materialButtonM8636c.setLayoutParams(layoutParams2);
        }
        if (getChildCount() != 0) {
            if (firstVisibleChildIndex == -1) {
                return;
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) m8636c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                C10040h.m18813g(layoutParams3, 0);
                C10040h.m18814h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m8635b(materialButton.getId(), materialButton.isChecked());
        C5772k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f14922a.add(new C2972c(shapeAppearanceModel.f34899e, shapeAppearanceModel.f34902h, shapeAppearanceModel.f34900f, shapeAppearanceModel.f34901g));
        materialButton.setEnabled(isEnabled());
        C10029b0.m18658n(materialButton, new C2971b());
    }

    /* JADX INFO: renamed from: b */
    public final void m8635b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f14931j);
        if (!z10 || hashSet.contains(Integer.valueOf(i10))) {
            if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
                if (!this.f14929h || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i10));
                }
            }
        }
        if (this.f14928g && !hashSet.isEmpty()) {
            hashSet.clear();
        }
        hashSet.add(Integer.valueOf(i10));
        m8638e(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final MaterialButton m8636c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8637d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14925d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(m8636c(i10), Integer.valueOf(i10));
        }
        this.f14926e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m8638e(Set<Integer> set) {
        HashSet hashSet = this.f14931j;
        this.f14931j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m8636c(i10).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f14927f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f14927f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<InterfaceC2973d> it = this.f14924c.iterator();
                while (it.hasNext()) {
                    it.next().mo8640a();
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public final void m8639f() {
        C2972c c2972c;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonM8636c = m8636c(i10);
            if (materialButtonM8636c.getVisibility() != 8) {
                C5772k shapeAppearanceModel = materialButtonM8636c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C5772k.a aVar = new C5772k.a(shapeAppearanceModel);
                C2972c c2972c2 = (C2972c) this.f14922a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    C5762a c5762a = C2972c.f14934e;
                    if (i10 == firstVisibleChildIndex) {
                        c2972c = z10 ? C10347n.m19365e(this) ? new C2972c(c5762a, c5762a, c2972c2.f14936b, c2972c2.f14937c) : new C2972c(c2972c2.f14935a, c2972c2.f14938d, c5762a, c5762a) : new C2972c(c2972c2.f14935a, c5762a, c2972c2.f14936b, c5762a);
                    } else if (i10 != lastVisibleChildIndex) {
                        c2972c2 = null;
                    } else if (z10) {
                        c2972c = C10347n.m19365e(this) ? new C2972c(c2972c2.f14935a, c2972c2.f14938d, c5762a, c5762a) : new C2972c(c5762a, c5762a, c2972c2.f14936b, c2972c2.f14937c);
                    } else {
                        c2972c = new C2972c(c5762a, c2972c2.f14938d, c5762a, c2972c2.f14937c);
                    }
                    c2972c2 = c2972c;
                }
                if (c2972c2 == null) {
                    aVar.m12156c(0.0f);
                } else {
                    aVar.f34911e = c2972c2.f14935a;
                    aVar.f34914h = c2972c2.f14938d;
                    aVar.f34912f = c2972c2.f14936b;
                    aVar.f34913g = c2972c2.f14937c;
                }
                materialButtonM8636c.setShapeAppearanceModel(new C5772k(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f14928g || this.f14931j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f14931j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = m8636c(i10).getId();
            if (this.f14931j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f14926e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f14930i;
        if (i10 != -1) {
            m8638e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C10284f.b.m19274a(1, getVisibleButtonCount(), this.f14928g ? 1 : 2).f51759a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        m8639f();
        m8634a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f14922a.remove(iIndexOfChild);
        }
        m8639f();
        m8634a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m8636c(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f14929h = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f14928g != z10) {
            this.f14928g = z10;
            m8638e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m8636c(i10).setA11yClassName((this.f14928g ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
