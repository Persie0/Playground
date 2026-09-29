package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.navigation.C1065b;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class pg6 extends ViewGroup implements ix5 {

    /* JADX INFO: renamed from: u0 */
    public static final int[] f56135u0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: v0 */
    public static final int[] f56136v0 = {-16842910};

    /* JADX INFO: renamed from: H */
    public final ColorStateList f56137H;

    /* JADX INFO: renamed from: I */
    public int f56138I;

    /* JADX INFO: renamed from: J */
    public int f56139J;

    /* JADX INFO: renamed from: K */
    public int f56140K;

    /* JADX INFO: renamed from: L */
    public int f56141L;

    /* JADX INFO: renamed from: M */
    public boolean f56142M;

    /* JADX INFO: renamed from: N */
    public Drawable f56143N;

    /* JADX INFO: renamed from: O */
    public ColorStateList f56144O;

    /* JADX INFO: renamed from: P */
    public int f56145P;

    /* JADX INFO: renamed from: Q */
    public final SparseArray f56146Q;

    /* JADX INFO: renamed from: R */
    public int f56147R;

    /* JADX INFO: renamed from: S */
    public int f56148S;

    /* JADX INFO: renamed from: T */
    public int f56149T;

    /* JADX INFO: renamed from: U */
    public int f56150U;

    /* JADX INFO: renamed from: V */
    public boolean f56151V;

    /* JADX INFO: renamed from: W */
    public int f56152W;

    /* JADX INFO: renamed from: a */
    public final p20 f56153a;

    /* JADX INFO: renamed from: a0 */
    public int f56154a0;

    /* JADX INFO: renamed from: b */
    public final og6 f56155b;

    /* JADX INFO: renamed from: b0 */
    public int f56156b0;

    /* JADX INFO: renamed from: c */
    public kh7 f56157c;

    /* JADX INFO: renamed from: c0 */
    public int f56158c0;

    /* JADX INFO: renamed from: d */
    public final SparseArray f56159d;

    /* JADX INFO: renamed from: d0 */
    public int f56160d0;

    /* JADX INFO: renamed from: e */
    public int f56161e;

    /* JADX INFO: renamed from: e0 */
    public int f56162e0;

    /* JADX INFO: renamed from: f */
    public int f56163f;

    /* JADX INFO: renamed from: f0 */
    public int f56164f0;

    /* JADX INFO: renamed from: g */
    public ng6[] f56165g;

    /* JADX INFO: renamed from: g0 */
    public r39 f56166g0;

    /* JADX INFO: renamed from: h */
    public int f56167h;

    /* JADX INFO: renamed from: h0 */
    public boolean f56168h0;

    /* JADX INFO: renamed from: i */
    public int f56169i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f56170i0;

    /* JADX INFO: renamed from: j */
    public ColorStateList f56171j;

    /* JADX INFO: renamed from: j0 */
    public C1065b f56172j0;

    /* JADX INFO: renamed from: k */
    public int f56173k;

    /* JADX INFO: renamed from: k0 */
    public mg6 f56174k0;

    /* JADX INFO: renamed from: l */
    public ColorStateList f56175l;

    /* JADX INFO: renamed from: l0 */
    public boolean f56176l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f56177m0;

    /* JADX INFO: renamed from: n0 */
    public int f56178n0;

    /* JADX INFO: renamed from: o0 */
    public int f56179o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f56180p0;

    /* JADX INFO: renamed from: q0 */
    public MenuItem f56181q0;

    /* JADX INFO: renamed from: r0 */
    public int f56182r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f56183s0;

    /* JADX INFO: renamed from: t0 */
    public final Rect f56184t0;

    public pg6(Context context) {
        super(context);
        this.f56159d = new SparseArray();
        this.f56167h = -1;
        this.f56169i = -1;
        this.f56146Q = new SparseArray();
        this.f56147R = -1;
        this.f56148S = -1;
        this.f56149T = -1;
        this.f56150U = -1;
        this.f56164f0 = 49;
        this.f56168h0 = false;
        this.f56178n0 = 1;
        this.f56179o0 = 0;
        this.f56181q0 = null;
        this.f56182r0 = 7;
        this.f56183s0 = false;
        this.f56184t0 = new Rect();
        this.f56137H = m19131c();
        if (isInEditMode()) {
            this.f56153a = null;
        } else {
            p20 p20Var = new p20();
            this.f56153a = p20Var;
            p20Var.m20498b0(0);
            p20Var.mo10215t(TextView.class);
            p20Var.mo10194O(r46.m20364G(getContext(), R$attr.motionDurationMedium4, getResources().getInteger(R$integer.material_motion_duration_long_1)));
            p20Var.mo10196Q(r46.m20365H(getContext(), R$attr.motionEasingStandard, AbstractC0853cn.f10297b));
            p20Var.m20494W(new ut0());
        }
        this.f56155b = new og6((dg0) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f56182r0, this.f56174k0.f51290e);
    }

    private kg6 getNewItem() {
        kh7 kh7Var = this.f56157c;
        kg6 kg6Var = kh7Var != null ? (kg6) kh7Var.mo14458a() : null;
        return kg6Var == null ? new cg0(getContext()) : kg6Var;
    }

    private void setBadgeIfNeeded(kg6 kg6Var) {
        x70 x70Var;
        int id = kg6Var.getId();
        if (id == -1 || (x70Var = (x70) this.f56146Q.get(id)) == null) {
            return;
        }
        kg6Var.setBadge(x70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m19130a() {
        kg6 kg6VarM19133e;
        View viewM19133e;
        gg6 gg6Var;
        removeAllViews();
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null && this.f56157c != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    kg6 kg6Var = (kg6) ng6Var;
                    this.f56157c.mo14460c(kg6Var);
                    kg6Var.m15185j(kg6Var.f47188O);
                    kg6Var.f47210g0 = null;
                    kg6Var.f47221m0 = 0.0f;
                    kg6Var.f47197a = false;
                }
            }
        }
        this.f56172j0.f13056b = true;
        this.f56174k0.m16826b();
        this.f56172j0.f13056b = false;
        int i = this.f56174k0.f51288c;
        if (i == 0) {
            this.f56167h = 0;
            this.f56169i = 0;
            this.f56165g = null;
            this.f56157c = null;
            return;
        }
        if (this.f56157c == null || this.f56179o0 != i) {
            this.f56179o0 = i;
            this.f56157c = new kh7(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f56174k0.f51287b.size(); i2++) {
            hashSet.add(Integer.valueOf(this.f56174k0.m16825a(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f56146Q;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int size = this.f56174k0.f51287b.size();
        this.f56165g = new ng6[size];
        int i4 = this.f56161e;
        boolean z = i4 != -1 ? i4 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem menuItemM16825a = this.f56174k0.m16825a(i6);
            boolean z2 = menuItemM16825a instanceof ni2;
            if (z2) {
                gg6Var = new gg6(getContext());
                gg6Var.setOnlyShowWhenExpanded(true);
                gg6Var.setDividersEnabled(this.f56183s0);
            } else if (menuItemM16825a.hasSubMenu()) {
                if (size2 > 0) {
                    C3386nv.m17626m("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                qg6 qg6Var = new qg6(getContext());
                int i7 = this.f56141L;
                if (i7 == 0) {
                    i7 = this.f56139J;
                }
                qg6Var.setTextAppearance(i7);
                qg6Var.setTextColor(this.f56175l);
                qg6Var.setOnlyShowWhenExpanded(true);
                qg6Var.mo643c((mw5) menuItemM16825a);
                size2 = menuItemM16825a.getSubMenu().size();
                viewM19133e = qg6Var;
            } else if (size2 > 0) {
                kg6VarM19133e = m19133e(i6, (mw5) menuItemM16825a, z, true);
                size2--;
            } else {
                mw5 mw5Var = (mw5) menuItemM16825a;
                boolean z3 = i5 >= this.f56182r0;
                i5++;
                viewM19133e = m19133e(i6, mw5Var, z, z3);
            }
            if (z2) {
                viewM19133e = kg6VarM19133e;
                viewM19133e = gg6Var;
            } else {
                viewM19133e = kg6VarM19133e;
                if (menuItemM16825a.isCheckable() && this.f56169i == -1) {
                    viewM19133e = gg6Var;
                    this.f56169i = i6;
                } else {
                    viewM19133e = gg6Var;
                }
            }
            this.f56165g[i6] = viewM19133e;
            addView(viewM19133e);
        }
        int iMin = Math.min(size - 1, this.f56169i);
        this.f56169i = iMin;
        setCheckedItem(this.f56165g[iMin].getItemData());
    }

    @Override // p000.ix5
    /* JADX INFO: renamed from: b */
    public final void mo648b(hw5 hw5Var) {
        this.f56174k0 = new mg6(hw5Var);
    }

    /* JADX INFO: renamed from: c */
    public final ColorStateList m19131c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM10540p = do7.m10540p(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListM10540p.getDefaultColor();
        int[] iArr = f56135u0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f56136v0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM10540p.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    /* JADX INFO: renamed from: d */
    public final fs5 m19132d() {
        if (this.f56166g0 == null || this.f56170i0 == null) {
            return null;
        }
        fs5 fs5Var = new fs5(this.f56166g0);
        fs5Var.m12076t(this.f56170i0);
        return fs5Var;
    }

    /* JADX INFO: renamed from: e */
    public final kg6 m19133e(int i, mw5 mw5Var, boolean z, boolean z2) {
        this.f56172j0.f13056b = true;
        mw5Var.setCheckable(true);
        this.f56172j0.f13056b = false;
        kg6 newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.f56178n0);
        newItem.setIconTintList(this.f56171j);
        newItem.setIconSize(this.f56173k);
        newItem.setTextColor(this.f56137H);
        newItem.setTextAppearanceInactive(this.f56138I);
        newItem.setTextAppearanceActive(this.f56139J);
        newItem.setHorizontalTextAppearanceInactive(this.f56140K);
        newItem.setHorizontalTextAppearanceActive(this.f56141L);
        newItem.setTextAppearanceActiveBoldEnabled(this.f56142M);
        newItem.setTextColor(this.f56175l);
        int i2 = this.f56147R;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.f56148S;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f56176l0);
        newItem.setLabelFontScalingEnabled(this.f56177m0);
        int i4 = this.f56149T;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.f56150U;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.f56152W);
        newItem.setActiveIndicatorHeight(this.f56154a0);
        newItem.setActiveIndicatorExpandedWidth(this.f56156b0);
        newItem.setActiveIndicatorExpandedHeight(this.f56158c0);
        newItem.setActiveIndicatorMarginHorizontal(this.f56160d0);
        newItem.setItemGravity(this.f56164f0);
        newItem.setActiveIndicatorExpandedPadding(this.f56184t0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f56162e0);
        newItem.setActiveIndicatorDrawable(m19132d());
        newItem.setActiveIndicatorResizeable(this.f56168h0);
        newItem.setActiveIndicatorEnabled(this.f56151V);
        Drawable drawable = this.f56143N;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f56145P);
        }
        newItem.setItemRippleColor(this.f56144O);
        newItem.setLabelVisibilityMode(this.f56161e);
        newItem.setItemIconGravity(this.f56163f);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.f56180p0);
        newItem.mo643c(mw5Var);
        newItem.setItemPosition(i);
        int i6 = mw5Var.f51942a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f56159d.get(i6));
        newItem.setOnClickListener(this.f56155b);
        int i7 = this.f56167h;
        if (i7 != 0 && i6 == i7) {
            this.f56169i = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f56149T;
    }

    public SparseArray<x70> getBadgeDrawables() {
        return this.f56146Q;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f56180p0 ? this.f56174k0.f51289d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f56141L;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f56140K;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f56150U;
    }

    public ColorStateList getIconTintList() {
        return this.f56171j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f56170i0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f56151V;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f56158c0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f56162e0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f56156b0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f56154a0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f56160d0;
    }

    public r39 getItemActiveIndicatorShapeAppearance() {
        return this.f56166g0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f56152W;
    }

    public Drawable getItemBackground() {
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null && ng6VarArr.length > 0) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    return ((kg6) ng6Var).getBackground();
                }
            }
        }
        return this.f56143N;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f56145P;
    }

    public int getItemGravity() {
        return this.f56164f0;
    }

    public int getItemIconGravity() {
        return this.f56163f;
    }

    public int getItemIconSize() {
        return this.f56173k;
    }

    public int getItemPaddingBottom() {
        return this.f56148S;
    }

    public int getItemPaddingTop() {
        return this.f56147R;
    }

    public ColorStateList getItemRippleColor() {
        return this.f56144O;
    }

    public int getItemTextAppearanceActive() {
        return this.f56139J;
    }

    public int getItemTextAppearanceInactive() {
        return this.f56138I;
    }

    public ColorStateList getItemTextColor() {
        return this.f56175l;
    }

    public int getLabelMaxLines() {
        return this.f56178n0;
    }

    public int getLabelVisibilityMode() {
        return this.f56161e;
    }

    public mg6 getMenu() {
        return this.f56174k0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f56177m0;
    }

    public int getSelectedItemId() {
        return this.f56167h;
    }

    public int getSelectedItemPosition() {
        return this.f56169i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0006a4.m94b(1, getCurrentVisibleContentItemCount(), 1).f193a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f56149T = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f56181q0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f56181q0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f56181q0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f56181q0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.f56182r0 = i;
    }

    public void setExpanded(boolean z) {
        this.f56180p0 = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                ng6Var.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.f56141L = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.f56140K = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f56150U = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f56171j = colorStateList;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f56170i0 = colorStateList;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorDrawable(m19132d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f56151V = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f56158c0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f56162e0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f56156b0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f56154a0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f56160d0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f56168h0 = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(r39 r39Var) {
        this.f56166g0 = r39Var;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorDrawable(m19132d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f56152W = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f56143N = drawable;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f56145P = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.f56164f0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f56163f = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f56173k = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f56148S = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemPaddingBottom(this.f56148S);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f56147R = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f56144O = colorStateList;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f56139J = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f56142M = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f56138I = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f56175l = colorStateList;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.f56177m0 = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.f56178n0 = i;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f56161e = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.f56176l0 = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof kg6) {
                    ((kg6) ng6Var).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(C1065b c1065b) {
        this.f56172j0 = c1065b;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.f56183s0 == z) {
            return;
        }
        this.f56183s0 = z;
        ng6[] ng6VarArr = this.f56165g;
        if (ng6VarArr != null) {
            for (ng6 ng6Var : ng6VarArr) {
                if (ng6Var instanceof gg6) {
                    ((gg6) ng6Var).setDividersEnabled(z);
                }
            }
        }
    }
}
