package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ew5 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final hw5 f37988a;

    /* JADX INFO: renamed from: b */
    public int f37989b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f37990c;

    /* JADX INFO: renamed from: d */
    public final boolean f37991d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f37992e;

    /* JADX INFO: renamed from: f */
    public final int f37993f;

    public ew5(hw5 hw5Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f37991d = z;
        this.f37992e = layoutInflater;
        this.f37988a = hw5Var;
        this.f37993f = i;
        m11367a();
    }

    /* JADX INFO: renamed from: a */
    public final void m11367a() {
        hw5 hw5Var = this.f37988a;
        mw5 mw5Var = hw5Var.f43058v;
        if (mw5Var != null) {
            hw5Var.m13526i();
            ArrayList arrayList = hw5Var.f43046j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mw5) arrayList.get(i)) == mw5Var) {
                    this.f37989b = i;
                    return;
                }
            }
        }
        this.f37989b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mw5 getItem(int i) {
        ArrayList arrayListM13529l;
        boolean z = this.f37991d;
        hw5 hw5Var = this.f37988a;
        if (z) {
            hw5Var.m13526i();
            arrayListM13529l = hw5Var.f43046j;
        } else {
            arrayListM13529l = hw5Var.m13529l();
        }
        int i2 = this.f37989b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (mw5) arrayListM13529l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM13529l;
        boolean z = this.f37991d;
        hw5 hw5Var = this.f37988a;
        if (z) {
            hw5Var.m13526i();
            arrayListM13529l = hw5Var.f43046j;
        } else {
            arrayListM13529l = hw5Var.m13529l();
        }
        return this.f37989b < 0 ? arrayListM13529l.size() : arrayListM13529l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f37992e.inflate(this.f37993f, viewGroup, false);
        }
        int i2 = getItem(i).f51943b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f51943b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f37988a.mo13530m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        hx5 hx5Var = (hx5) view;
        if (this.f37990c) {
            listMenuItemView.setForceShowIcon(true);
        }
        hx5Var.mo643c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m11367a();
        super.notifyDataSetChanged();
    }
}
