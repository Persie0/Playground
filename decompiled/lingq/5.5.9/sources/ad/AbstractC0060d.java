package ad;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0229k;
import com.google.android.material.badge.C2947a;
import com.google.android.material.navigation.NavigationBarPresenter;
import gd.C5768g;
import gd.C5772k;
import java.util.HashSet;
import java.util.WeakHashMap;
import lc.C7298a;
import lc.C7299b;
import p177ic.C6308a;
import p254m2.C7472a;
import p406u4.C9400b;
import p446w2.C9807e;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10342i;
import p531zc.C10477a;

/* JADX INFO: renamed from: ad.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060d extends ViewGroup implements InterfaceC0229k {

    /* JADX INFO: renamed from: b0 */
    public static final int[] f111b0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: c0 */
    public static final int[] f112c0 = {-16842910};

    /* JADX INFO: renamed from: H */
    public int f113H;

    /* JADX INFO: renamed from: I */
    public int f114I;

    /* JADX INFO: renamed from: J */
    public Drawable f115J;

    /* JADX INFO: renamed from: K */
    public ColorStateList f116K;

    /* JADX INFO: renamed from: L */
    public int f117L;

    /* JADX INFO: renamed from: M */
    public final SparseArray<C2947a> f118M;

    /* JADX INFO: renamed from: N */
    public int f119N;

    /* JADX INFO: renamed from: O */
    public int f120O;

    /* JADX INFO: renamed from: P */
    public boolean f121P;

    /* JADX INFO: renamed from: Q */
    public int f122Q;

    /* JADX INFO: renamed from: R */
    public int f123R;

    /* JADX INFO: renamed from: S */
    public int f124S;

    /* JADX INFO: renamed from: T */
    public C5772k f125T;

    /* JADX INFO: renamed from: U */
    public boolean f126U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f127V;

    /* JADX INFO: renamed from: W */
    public NavigationBarPresenter f128W;

    /* JADX INFO: renamed from: a */
    public final C9400b f129a;

    /* JADX INFO: renamed from: a0 */
    public C0224f f130a0;

    /* JADX INFO: renamed from: b */
    public final a f131b;

    /* JADX INFO: renamed from: c */
    public final C9807e f132c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<View.OnTouchListener> f133d;

    /* JADX INFO: renamed from: e */
    public int f134e;

    /* JADX INFO: renamed from: f */
    public AbstractC0057a[] f135f;

    /* JADX INFO: renamed from: g */
    public int f136g;

    /* JADX INFO: renamed from: h */
    public int f137h;

    /* JADX INFO: renamed from: i */
    public ColorStateList f138i;

    /* JADX INFO: renamed from: j */
    public int f139j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f140k;

    /* JADX INFO: renamed from: l */
    public final ColorStateList f141l;

    /* JADX INFO: renamed from: ad.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0060d f142a;

        public a(C7299b c7299b) {
            this.f142a = c7299b;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0226h itemData = ((AbstractC0057a) view).getItemData();
            AbstractC0060d abstractC0060d = this.f142a;
            if (abstractC0060d.f130a0.m933q(itemData, abstractC0060d.f128W, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public AbstractC0060d(Context context) {
        super(context);
        this.f132c = new C9807e(5);
        this.f133d = new SparseArray<>(5);
        this.f136g = 0;
        this.f137h = 0;
        this.f118M = new SparseArray<>(5);
        this.f119N = -1;
        this.f120O = -1;
        this.f126U = false;
        this.f141l = m238c();
        if (isInEditMode()) {
            this.f129a = null;
        } else {
            C9400b c9400b = new C9400b();
            this.f129a = c9400b;
            c9400b.m17824W(0);
            c9400b.mo17783J(C10477a.m19428c(com.linguist.R.attr.motionDurationMedium4, getContext(), getResources().getInteger(com.linguist.R.integer.material_motion_duration_long_1)));
            c9400b.mo17785L(C10477a.m19429d(getContext(), com.linguist.R.attr.motionEasingStandard, C6308a.f36524b));
            c9400b.m17821S(new C10342i());
        }
        this.f131b = new a((C7299b) this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(this, 1);
    }

    private AbstractC0057a getNewItem() {
        AbstractC0057a abstractC0057a = (AbstractC0057a) this.f132c.mo11465b();
        return abstractC0057a == null ? mo240e(getContext()) : abstractC0057a;
    }

    private void setBadgeIfNeeded(AbstractC0057a abstractC0057a) {
        int id2 = abstractC0057a.getId();
        if (id2 != -1) {
            C2947a c2947a = this.f118M.get(id2);
            if (c2947a != null) {
                abstractC0057a.setBadge(c2947a);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a */
    public final void m236a() {
        removeAllViews();
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                if (abstractC0057a != null) {
                    this.f132c.mo11464a(abstractC0057a);
                    if (abstractC0057a.f93b0 != null) {
                        ImageView imageView = abstractC0057a.f74H;
                        if (imageView != null) {
                            abstractC0057a.setClipChildren(true);
                            abstractC0057a.setClipToPadding(true);
                            C2947a c2947a = abstractC0057a.f93b0;
                            if (c2947a != null) {
                                if (c2947a.m8575d() != null) {
                                    c2947a.m8575d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c2947a);
                                }
                            }
                        }
                        abstractC0057a.f93b0 = null;
                    }
                    abstractC0057a.f79M = null;
                    abstractC0057a.f85S = 0.0f;
                    abstractC0057a.f90a = false;
                }
            }
        }
        if (this.f130a0.size() == 0) {
            this.f136g = 0;
            this.f137h = 0;
            this.f135f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f130a0.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f130a0.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray<C2947a> sparseArray = this.f118M;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        this.f135f = new AbstractC0057a[this.f130a0.size()];
        int i12 = this.f134e;
        boolean z10 = i12 != -1 ? i12 == 0 : this.f130a0.m928l().size() > 3;
        for (int i13 = 0; i13 < this.f130a0.size(); i13++) {
            this.f128W.f15417b = true;
            this.f130a0.getItem(i13).setCheckable(true);
            this.f128W.f15417b = false;
            AbstractC0057a newItem = getNewItem();
            this.f135f[i13] = newItem;
            newItem.setIconTintList(this.f138i);
            newItem.setIconSize(this.f139j);
            newItem.setTextColor(this.f141l);
            newItem.setTextAppearanceInactive(this.f113H);
            newItem.setTextAppearanceActive(this.f114I);
            newItem.setTextColor(this.f140k);
            int i14 = this.f119N;
            if (i14 != -1) {
                newItem.setItemPaddingTop(i14);
            }
            int i15 = this.f120O;
            if (i15 != -1) {
                newItem.setItemPaddingBottom(i15);
            }
            newItem.setActiveIndicatorWidth(this.f122Q);
            newItem.setActiveIndicatorHeight(this.f123R);
            newItem.setActiveIndicatorMarginHorizontal(this.f124S);
            newItem.setActiveIndicatorDrawable(m239d());
            newItem.setActiveIndicatorResizeable(this.f126U);
            newItem.setActiveIndicatorEnabled(this.f121P);
            Drawable drawable = this.f115J;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f117L);
            }
            newItem.setItemRippleColor(this.f116K);
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f134e);
            C0226h c0226h = (C0226h) this.f130a0.getItem(i13);
            newItem.mo232d(c0226h);
            newItem.setItemPosition(i13);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f133d;
            int i16 = c0226h.f723a;
            newItem.setOnTouchListener(sparseArray2.get(i16));
            newItem.setOnClickListener(this.f131b);
            int i17 = this.f136g;
            if (i17 != 0 && i16 == i17) {
                this.f137h = i13;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f130a0.size() - 1, this.f137h);
        this.f137h = iMin;
        this.f130a0.getItem(iMin).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k
    /* JADX INFO: renamed from: b */
    public final void mo237b(C0224f c0224f) {
        this.f130a0 = c0224f;
    }

    /* JADX INFO: renamed from: c */
    public final ColorStateList m238c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM14842b = C7472a.m14842b(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.linguist.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListM14842b.getDefaultColor();
        int[] iArr = f112c0;
        return new ColorStateList(new int[][]{iArr, f111b0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListM14842b.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    /* JADX INFO: renamed from: d */
    public final C5768g m239d() {
        if (this.f125T == null || this.f127V == null) {
            return null;
        }
        C5768g c5768g = new C5768g(this.f125T);
        c5768g.m12141m(this.f127V);
        return c5768g;
    }

    /* JADX INFO: renamed from: e */
    public abstract C7298a mo240e(Context context);

    public SparseArray<C2947a> getBadgeDrawables() {
        return this.f118M;
    }

    public ColorStateList getIconTintList() {
        return this.f138i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f127V;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f121P;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f123R;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f124S;
    }

    public C5772k getItemActiveIndicatorShapeAppearance() {
        return this.f125T;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f122Q;
    }

    public Drawable getItemBackground() {
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        return (abstractC0057aArr == null || abstractC0057aArr.length <= 0) ? this.f115J : abstractC0057aArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f117L;
    }

    public int getItemIconSize() {
        return this.f139j;
    }

    public int getItemPaddingBottom() {
        return this.f120O;
    }

    public int getItemPaddingTop() {
        return this.f119N;
    }

    public ColorStateList getItemRippleColor() {
        return this.f116K;
    }

    public int getItemTextAppearanceActive() {
        return this.f114I;
    }

    public int getItemTextAppearanceInactive() {
        return this.f113H;
    }

    public ColorStateList getItemTextColor() {
        return this.f140k;
    }

    public int getLabelVisibilityMode() {
        return this.f134e;
    }

    public C0224f getMenu() {
        return this.f130a0;
    }

    public int getSelectedItemId() {
        return this.f136g;
    }

    public int getSelectedItemPosition() {
        return this.f137h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C10284f.b.m19274a(1, this.f130a0.m928l().size(), 1).f51759a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f138i = colorStateList;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f127V = colorStateList;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorDrawable(m239d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f121P = z10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f123R = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f124S = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f126U = z10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C5772k c5772k) {
        this.f125T = c5772k;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorDrawable(m239d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f122Q = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f115J = drawable;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f117L = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f139j = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f120O = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f119N = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f116K = colorStateList;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f114I = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f140k;
                if (colorStateList != null) {
                    abstractC0057a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f113H = i10;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f140k;
                if (colorStateList != null) {
                    abstractC0057a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f140k = colorStateList;
        AbstractC0057a[] abstractC0057aArr = this.f135f;
        if (abstractC0057aArr != null) {
            for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                abstractC0057a.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f134e = i10;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f128W = navigationBarPresenter;
    }
}
