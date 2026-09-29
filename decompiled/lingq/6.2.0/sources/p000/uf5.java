package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes2.dex */
public final class uf5 implements ex5, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f63839a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f63840b;

    /* JADX INFO: renamed from: c */
    public hw5 f63841c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f63842d;

    /* JADX INFO: renamed from: e */
    public final int f63843e;

    /* JADX INFO: renamed from: f */
    public dx5 f63844f;

    /* JADX INFO: renamed from: g */
    public tf5 f63845g;

    public uf5(Context context, int i) {
        this.f63843e = i;
        this.f63839a = context;
        this.f63840b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public final tf5 m22723a() {
        if (this.f63845g == null) {
            this.f63845g = new tf5(this);
        }
        return this.f63845g;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
        dx5 dx5Var = this.f63844f;
        if (dx5Var != null) {
            dx5Var.mo10740b(hw5Var, z);
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        tf5 tf5Var = this.f63845g;
        if (tf5Var != null) {
            tf5Var.notifyDataSetChanged();
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        boolean zHasVisibleItems = om9Var.hasVisibleItems();
        Context context = om9Var.f43037a;
        if (!zHasVisibleItems) {
            return false;
        }
        jw5 jw5Var = new jw5();
        jw5Var.f46313a = om9Var;
        C3829zd c3829zd = new C3829zd(context);
        uf5 uf5Var = new uf5(c3829zd.getContext(), R$layout.abc_list_menu_item_layout);
        jw5Var.f46315c = uf5Var;
        uf5Var.f63844f = jw5Var;
        om9Var.m13519b(uf5Var, context);
        tf5 tf5VarM22723a = jw5Var.f46315c.m22723a();
        C3681vd c3681vd = c3829zd.f71376a;
        c3681vd.f65220r = tf5VarM22723a;
        c3681vd.f65221s = jw5Var;
        View view = om9Var.f43051o;
        if (view != null) {
            c3681vd.f65208f = view;
        } else {
            c3681vd.f65206d = om9Var.f43050n;
            c3829zd.setTitle(om9Var.f43049m);
        }
        c3681vd.f65218p = jw5Var;
        DialogInterfaceC0016ae dialogInterfaceC0016aeCreate = c3829zd.create();
        jw5Var.f46314b = dialogInterfaceC0016aeCreate;
        dialogInterfaceC0016aeCreate.setOnDismissListener(jw5Var);
        WindowManager.LayoutParams attributes = jw5Var.f46314b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        jw5Var.f46314b.show();
        dx5 dx5Var = this.f63844f;
        if (dx5Var == null) {
            return true;
        }
        dx5Var.mo10741j(om9Var);
        return true;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ix5 m22724f(ViewGroup viewGroup) {
        if (this.f63842d == null) {
            this.f63842d = (ExpandedMenuView) this.f63840b.inflate(R$layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f63845g == null) {
                this.f63845g = new tf5(this);
            }
            this.f63842d.setAdapter((ListAdapter) this.f63845g);
            this.f63842d.setOnItemClickListener(this);
        }
        return this.f63842d;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: g */
    public final boolean mo707g(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    public final int getId() {
        return 0;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f63842d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: i */
    public final void mo709i(dx5 dx5Var) {
        this.f63844f = dx5Var;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: j */
    public final boolean mo710j(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: l */
    public final void mo712l(Context context, hw5 hw5Var) {
        if (this.f63839a != null) {
            this.f63839a = context;
            if (this.f63840b == null) {
                this.f63840b = LayoutInflater.from(context);
            }
        }
        this.f63841c = hw5Var;
        tf5 tf5Var = this.f63845g;
        if (tf5Var != null) {
            tf5Var.notifyDataSetChanged();
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        if (this.f63842d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f63842d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f63841c.m13534q(this.f63845g.getItem(i), this, 0);
    }
}
