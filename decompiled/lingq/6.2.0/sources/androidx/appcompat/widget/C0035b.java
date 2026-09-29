package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import p000.C3636u5;
import p000.C3673v5;
import p000.C3747x5;
import p000.C3821z5;
import p000.dx5;
import p000.ex5;
import p000.hw5;
import p000.hx5;
import p000.ix5;
import p000.kj3;
import p000.m58;
import p000.mw5;
import p000.nw5;
import p000.om9;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0035b implements ex5 {

    /* JADX INFO: renamed from: H */
    public boolean f1201H;

    /* JADX INFO: renamed from: I */
    public boolean f1202I;

    /* JADX INFO: renamed from: J */
    public int f1203J;

    /* JADX INFO: renamed from: K */
    public int f1204K;

    /* JADX INFO: renamed from: L */
    public int f1205L;

    /* JADX INFO: renamed from: M */
    public boolean f1206M;

    /* JADX INFO: renamed from: N */
    public final SparseBooleanArray f1207N;

    /* JADX INFO: renamed from: O */
    public C3636u5 f1208O;

    /* JADX INFO: renamed from: P */
    public C3636u5 f1209P;

    /* JADX INFO: renamed from: Q */
    public kj3 f1210Q;

    /* JADX INFO: renamed from: R */
    public C3673v5 f1211R;

    /* JADX INFO: renamed from: S */
    public final m58 f1212S;

    /* JADX INFO: renamed from: T */
    public int f1213T;

    /* JADX INFO: renamed from: a */
    public final Context f1214a;

    /* JADX INFO: renamed from: b */
    public Context f1215b;

    /* JADX INFO: renamed from: c */
    public hw5 f1216c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f1217d;

    /* JADX INFO: renamed from: e */
    public dx5 f1218e;

    /* JADX INFO: renamed from: f */
    public final int f1219f;

    /* JADX INFO: renamed from: g */
    public final int f1220g;

    /* JADX INFO: renamed from: h */
    public ix5 f1221h;

    /* JADX INFO: renamed from: i */
    public int f1222i;

    /* JADX INFO: renamed from: j */
    public C3747x5 f1223j;

    /* JADX INFO: renamed from: k */
    public Drawable f1224k;

    /* JADX INFO: renamed from: l */
    public boolean f1225l;

    public C0035b(Context context) {
        int i = R$layout.abc_action_menu_layout;
        int i2 = R$layout.abc_action_menu_item_layout;
        this.f1214a = context;
        this.f1217d = LayoutInflater.from(context);
        this.f1219f = i;
        this.f1220g = i2;
        this.f1207N = new SparseBooleanArray();
        this.f1212S = new m58(this, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m701a(mw5 mw5Var, View view, ViewGroup viewGroup) {
        View actionView = mw5Var.getActionView();
        if (actionView == null || mw5Var.m17077e()) {
            hx5 hx5Var = view instanceof hx5 ? (hx5) view : (hx5) this.f1217d.inflate(this.f1220g, viewGroup, false);
            hx5Var.mo643c(mw5Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) hx5Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1221h);
            if (this.f1211R == null) {
                this.f1211R = new C3673v5(this);
            }
            actionMenuItemView.setPopupCallback(this.f1211R);
            actionView = (View) hx5Var;
        }
        actionView.setVisibility(mw5Var.f51941C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C3821z5)) {
            actionView.setLayoutParams(ActionMenuView.m670j(layoutParams));
        }
        return actionView;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
        m706f();
        C3636u5 c3636u5 = this.f1209P;
        if (c3636u5 != null) {
            c3636u5.m24176a();
        }
        dx5 dx5Var = this.f1218e;
        if (dx5Var != null) {
            dx5Var.mo10740b(hw5Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f1221h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            hw5 hw5Var = this.f1216c;
            if (hw5Var != null) {
                hw5Var.m13526i();
                ArrayList arrayListM13529l = this.f1216c.m13529l();
                int size = arrayListM13529l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    mw5 mw5Var = (mw5) arrayListM13529l.get(i2);
                    if ((mw5Var.f51965x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        mw5 itemData = childAt instanceof hx5 ? ((hx5) childAt).getItemData() : null;
                        View viewM701a = m701a(mw5Var, childAt, viewGroup);
                        if (mw5Var != itemData) {
                            viewM701a.setPressed(false);
                            viewM701a.jumpDrawablesToCurrentState();
                        }
                        if (viewM701a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM701a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM701a);
                            }
                            ((ViewGroup) this.f1221h).addView(viewM701a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1223j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f1221h).requestLayout();
        hw5 hw5Var2 = this.f1216c;
        if (hw5Var2 != null) {
            hw5Var2.m13526i();
            ArrayList arrayList2 = hw5Var2.f43045i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                nw5 nw5Var = ((mw5) arrayList2.get(i3)).f51939A;
            }
        }
        hw5 hw5Var3 = this.f1216c;
        if (hw5Var3 != null) {
            hw5Var3.m13526i();
            arrayList = hw5Var3.f43046j;
        }
        if (this.f1201H && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((mw5) arrayList.get(0)).f51941C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        C3747x5 c3747x5 = this.f1223j;
        if (z2) {
            if (c3747x5 == null) {
                this.f1223j = new C3747x5(this, this.f1214a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1223j.getParent();
            if (viewGroup3 != this.f1221h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1223j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1221h;
                C3747x5 c3747x6 = this.f1223j;
                actionMenuView.getClass();
                C3821z5 c3821z5 = new C3821z5();
                ((LinearLayout.LayoutParams) c3821z5).gravity = 16;
                c3821z5.f70930a = true;
                actionMenuView.addView(c3747x6, c3821z5);
            }
        } else if (c3747x5 != null) {
            Object parent = c3747x5.getParent();
            Object obj = this.f1221h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1223j);
            }
        }
        ((ActionMenuView) this.f1221h).setOverflowReserved(this.f1201H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        boolean z = false;
        if (om9Var.hasVisibleItems()) {
            om9 om9Var2 = om9Var;
            while (om9Var2.m18112x() != this.f1216c) {
                om9Var2 = (om9) om9Var2.m18112x();
            }
            MenuItem item = om9Var2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f1221h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof hx5) && ((hx5) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f1213T = ((mw5) om9Var.getItem()).f51942a;
                int size = om9Var.f43042f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item2 = om9Var.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                }
                C3636u5 c3636u5 = new C3636u5(this, this.f1215b, om9Var, view);
                this.f1209P = c3636u5;
                c3636u5.m24179e(z);
                this.f1209P.m24180f();
                dx5 dx5Var = this.f1218e;
                if (dx5Var != null) {
                    dx5Var.mo10741j(om9Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        int size;
        ArrayList arrayListM13529l;
        int i;
        boolean z;
        C0035b c0035b = this;
        hw5 hw5Var = c0035b.f1216c;
        if (hw5Var != null) {
            arrayListM13529l = hw5Var.m13529l();
            size = arrayListM13529l.size();
        } else {
            size = 0;
            arrayListM13529l = null;
        }
        int i2 = c0035b.f1205L;
        int i3 = c0035b.f1204K;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0035b.f1221h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            mw5 mw5Var = (mw5) arrayListM13529l.get(i4);
            int i7 = mw5Var.f51966y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0035b.f1206M && mw5Var.f51941C) {
                i2 = 0;
            }
            i4++;
        }
        if (c0035b.f1201H && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0035b.f1207N;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            mw5 mw5Var2 = (mw5) arrayListM13529l.get(i9);
            int i11 = mw5Var2.f51966y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = mw5Var2.f51943b;
            if (z3) {
                View viewM701a = c0035b.m701a(mw5Var2, null, viewGroup);
                viewM701a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM701a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                mw5Var2.m17078f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM701a2 = c0035b.m701a(mw5Var2, null, viewGroup);
                        viewM701a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM701a2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            mw5 mw5Var3 = (mw5) arrayListM13529l.get(i13);
                            if (mw5Var3.f51943b == i12) {
                                if ((mw5Var3.f51965x & 32) == 32) {
                                    i8++;
                                }
                                mw5Var3.m17078f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    mw5Var2.m17078f(z5);
                } else {
                    mw5Var2.m17078f(false);
                }
                i9++;
                i = 2;
                c0035b = this;
                z = true;
            }
            i9++;
            i = 2;
            c0035b = this;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m706f() {
        Object obj;
        kj3 kj3Var = this.f1210Q;
        if (kj3Var != null && (obj = this.f1221h) != null) {
            ((View) obj).removeCallbacks(kj3Var);
            this.f1210Q = null;
            return true;
        }
        C3636u5 c3636u5 = this.f1208O;
        if (c3636u5 == null) {
            return false;
        }
        c3636u5.m24176a();
        return true;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: g */
    public final boolean mo707g(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    public final int getId() {
        return this.f1222i;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).f1107a) > 0 && (menuItemFindItem = this.f1216c.findItem(i)) != null) {
            mo704d((om9) menuItemFindItem.getSubMenu());
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: i */
    public final void mo709i(dx5 dx5Var) {
        throw null;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: j */
    public final boolean mo710j(mw5 mw5Var) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m711k() {
        C3636u5 c3636u5 = this.f1208O;
        return c3636u5 != null && c3636u5.m24178c();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: l */
    public final void mo712l(Context context, hw5 hw5Var) {
        this.f1215b = context;
        LayoutInflater.from(context);
        this.f1216c = hw5Var;
        Resources resources = context.getResources();
        if (!this.f1202I) {
            this.f1201H = true;
        }
        int i = 2;
        this.f1203J = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1205L = i;
        int measuredWidth = this.f1203J;
        if (this.f1201H) {
            if (this.f1223j == null) {
                C3747x5 c3747x5 = new C3747x5(this, this.f1214a);
                this.f1223j = c3747x5;
                if (this.f1225l) {
                    c3747x5.setImageDrawable(this.f1224k);
                    this.f1224k = null;
                    this.f1225l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1223j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1223j.getMeasuredWidth();
        } else {
            this.f1223j = null;
        }
        this.f1204K = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f1107a = this.f1213T;
        return actionMenuPresenter$SavedState;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m714n() {
        hw5 hw5Var;
        boolean z = false;
        if (this.f1201H && !m711k() && (hw5Var = this.f1216c) != null && this.f1221h != null && this.f1210Q == null) {
            hw5Var.m13526i();
            if (!hw5Var.f43046j.isEmpty()) {
                kj3 kj3Var = new kj3(this, new C3636u5(this, this.f1215b, this.f1216c, this.f1223j), z, 1);
                this.f1210Q = kj3Var;
                ((View) this.f1221h).post(kj3Var);
                return true;
            }
        }
        return false;
    }
}
