package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import p000.dg0;
import p000.ex5;
import p000.gg6;
import p000.hw5;
import p000.kg6;
import p000.mg6;
import p000.mw5;
import p000.ng6;
import p000.ni2;
import p000.oaa;
import p000.om9;
import p000.p20;
import p000.qg6;
import p000.x70;

/* JADX INFO: renamed from: com.google.android.material.navigation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1065b implements ex5 {

    /* JADX INFO: renamed from: a */
    public dg0 f13055a;

    /* JADX INFO: renamed from: b */
    public boolean f13056b;

    /* JADX INFO: renamed from: c */
    public int f13057c;

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        mg6 mg6Var;
        p20 p20Var;
        if (this.f13056b) {
            return;
        }
        dg0 dg0Var = this.f13055a;
        if (z) {
            dg0Var.m19130a();
            return;
        }
        mg6 mg6Var2 = dg0Var.f56174k0;
        if (mg6Var2 == null || dg0Var.f56165g == null) {
            return;
        }
        dg0Var.f56172j0.f13056b = true;
        mg6Var2.m16826b();
        dg0Var.f56172j0.f13056b = false;
        if (dg0Var.f56165g != null && (mg6Var = dg0Var.f56174k0) != null && mg6Var.f51287b.size() == dg0Var.f56165g.length) {
            for (int i = 0; i < dg0Var.f56165g.length; i++) {
                if (!(dg0Var.f56174k0.m16825a(i) instanceof ni2) || (dg0Var.f56165g[i] instanceof gg6)) {
                    boolean z2 = dg0Var.f56174k0.m16825a(i).hasSubMenu() && !(dg0Var.f56165g[i] instanceof qg6);
                    boolean z3 = (dg0Var.f56174k0.m16825a(i).hasSubMenu() || (dg0Var.f56165g[i] instanceof kg6)) ? false : true;
                    if ((dg0Var.f56174k0.m16825a(i) instanceof ni2) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = dg0Var.f56167h;
            int size = dg0Var.f56174k0.f51287b.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem menuItemM16825a = dg0Var.f56174k0.m16825a(i3);
                if (menuItemM16825a.isChecked()) {
                    dg0Var.setCheckedItem(menuItemM16825a);
                    dg0Var.f56167h = menuItemM16825a.getItemId();
                    dg0Var.f56169i = i3;
                }
            }
            if (i2 != dg0Var.f56167h && (p20Var = dg0Var.f56153a) != null) {
                oaa.m17884a(dg0Var, p20Var);
            }
            int i4 = dg0Var.f56161e;
            boolean z4 = i4 != -1 ? i4 == 0 : dg0Var.getCurrentVisibleContentItemCount() > 3;
            for (int i5 = 0; i5 < size; i5++) {
                dg0Var.f56172j0.f13056b = true;
                dg0Var.f56165g[i5].setExpanded(dg0Var.f56180p0);
                ng6 ng6Var = dg0Var.f56165g[i5];
                if (ng6Var instanceof kg6) {
                    kg6 kg6Var = (kg6) ng6Var;
                    kg6Var.setLabelVisibilityMode(dg0Var.f56161e);
                    kg6Var.setItemIconGravity(dg0Var.f56163f);
                    kg6Var.setItemGravity(dg0Var.f56164f0);
                    kg6Var.setShifting(z4);
                }
                if (dg0Var.f56174k0.m16825a(i5) instanceof mw5) {
                    dg0Var.f56165g[i5].mo643c((mw5) dg0Var.f56174k0.m16825a(i5));
                }
                dg0Var.f56172j0.f13056b = false;
            }
            return;
        }
        dg0Var.m19130a();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: g */
    public final boolean mo707g(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    public final int getId() {
        return this.f13057c;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            dg0 dg0Var = this.f13055a;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i = navigationBarPresenter$SavedState.f13052a;
            int size = dg0Var.f56174k0.f51287b.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem menuItemM16825a = dg0Var.f56174k0.m16825a(i2);
                if (i == menuItemM16825a.getItemId()) {
                    dg0Var.f56167h = i;
                    dg0Var.f56169i = i2;
                    dg0Var.setCheckedItem(menuItemM16825a);
                    break;
                }
            }
            Context context = this.f13055a.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f13053b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(iKeyAt, badgeState$State != null ? new x70(context, badgeState$State) : null);
            }
            dg0 dg0Var2 = this.f13055a;
            SparseArray sparseArray2 = dg0Var2.f56146Q;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (x70) sparseArray.get(iKeyAt2));
                }
            }
            ng6[] ng6VarArr = dg0Var2.f56165g;
            if (ng6VarArr != null) {
                for (ng6 ng6Var : ng6VarArr) {
                    if (ng6Var instanceof kg6) {
                        kg6 kg6Var = (kg6) ng6Var;
                        x70 x70Var = (x70) sparseArray2.get(kg6Var.getId());
                        if (x70Var != null) {
                            kg6Var.setBadge(x70Var);
                        }
                    }
                }
            }
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: j */
    public final boolean mo710j(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: l */
    public final void mo712l(Context context, hw5 hw5Var) {
        this.f13055a.mo648b(hw5Var);
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f13052a = this.f13055a.getSelectedItemId();
        SparseArray<x70> badgeDrawables = this.f13055a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            x70 x70VarValueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(iKeyAt, x70VarValueAt != null ? x70VarValueAt.f67857e.f9686a : null);
        }
        navigationBarPresenter$SavedState.f13053b = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }
}
