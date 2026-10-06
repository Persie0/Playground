package p000;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0222gt extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final C0225gw f26308a;

    /* JADX INFO: renamed from: b */
    public boolean f26309b;

    /* JADX INFO: renamed from: c */
    private int f26310c = -1;

    /* JADX INFO: renamed from: d */
    private final boolean f26311d;

    /* JADX INFO: renamed from: e */
    private final LayoutInflater f26312e;

    /* JADX INFO: renamed from: f */
    private final int f26313f;

    public C0222gt(C0225gw c0225gw, LayoutInflater layoutInflater, boolean z, int i) {
        this.f26311d = z;
        this.f26312e = layoutInflater;
        this.f26308a = c0225gw;
        this.f26313f = i;
        m9728b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0227gy getItem(int i) {
        ArrayList arrayListM9825e = this.f26311d ? this.f26308a.m9825e() : this.f26308a.m9826f();
        int i2 = this.f26310c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0227gy) arrayListM9825e.get(i);
    }

    /* JADX INFO: renamed from: b */
    final void m9728b() {
        C0225gw c0225gw = this.f26308a;
        C0227gy c0227gy = c0225gw.f26554h;
        if (c0227gy != null) {
            ArrayList arrayListM9825e = c0225gw.m9825e();
            int size = arrayListM9825e.size();
            for (int i = 0; i < size; i++) {
                if (((C0227gy) arrayListM9825e.get(i)) == c0227gy) {
                    this.f26310c = i;
                    return;
                }
            }
        }
        this.f26310c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM9825e = this.f26311d ? this.f26308a.m9825e() : this.f26308a.m9826f();
        return this.f26310c < 0 ? arrayListM9825e.size() : arrayListM9825e.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f26312e.inflate(this.f26313f, viewGroup, false);
        }
        int i2 = getItem(i).f26788b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.f26308a.mo9843w() && i2 != (i3 >= 0 ? getItem(i3).f26788b : i2);
        ImageView imageView = listMenuItemView.f922b;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.f924d || !z) ? 8 : 0);
        }
        InterfaceC0240hk interfaceC0240hk = (InterfaceC0240hk) view;
        if (this.f26309b) {
            listMenuItemView.f925e = true;
            listMenuItemView.f923c = true;
        }
        interfaceC0240hk.mo1035f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m9728b();
        super.notifyDataSetChanged();
    }
}
