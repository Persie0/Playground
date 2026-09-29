package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tf5 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f62221a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uf5 f62222b;

    public tf5(uf5 uf5Var) {
        this.f62222b = uf5Var;
        m22024a();
    }

    /* JADX INFO: renamed from: a */
    public final void m22024a() {
        hw5 hw5Var = this.f62222b.f63841c;
        mw5 mw5Var = hw5Var.f43058v;
        if (mw5Var != null) {
            hw5Var.m13526i();
            ArrayList arrayList = hw5Var.f43046j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mw5) arrayList.get(i)) == mw5Var) {
                    this.f62221a = i;
                    return;
                }
            }
        }
        this.f62221a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mw5 getItem(int i) {
        hw5 hw5Var = this.f62222b.f63841c;
        hw5Var.m13526i();
        ArrayList arrayList = hw5Var.f43046j;
        int i2 = this.f62221a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (mw5) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        hw5 hw5Var = this.f62222b.f63841c;
        hw5Var.m13526i();
        int size = hw5Var.f43046j.size();
        return this.f62221a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            uf5 uf5Var = this.f62222b;
            view = uf5Var.f63840b.inflate(uf5Var.f63843e, viewGroup, false);
        }
        ((hx5) view).mo643c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m22024a();
        super.notifyDataSetChanged();
    }
}
