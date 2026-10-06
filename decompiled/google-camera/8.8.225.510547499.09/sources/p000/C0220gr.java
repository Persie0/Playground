package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: renamed from: gr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0220gr extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0221gs f26099a;

    /* JADX INFO: renamed from: b */
    private int f26100b = -1;

    public C0220gr(C0221gs c0221gs) {
        this.f26099a = c0221gs;
        m9660b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0227gy getItem(int i) {
        ArrayList arrayListM9825e = this.f26099a.f26203c.m9825e();
        int i2 = this.f26100b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0227gy) arrayListM9825e.get(i);
    }

    /* JADX INFO: renamed from: b */
    final void m9660b() {
        C0225gw c0225gw = this.f26099a.f26203c;
        C0227gy c0227gy = c0225gw.f26554h;
        if (c0227gy != null) {
            ArrayList arrayListM9825e = c0225gw.m9825e();
            int size = arrayListM9825e.size();
            for (int i = 0; i < size; i++) {
                if (((C0227gy) arrayListM9825e.get(i)) == c0227gy) {
                    this.f26100b = i;
                    return;
                }
            }
        }
        this.f26100b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.f26099a.f26203c.m9825e().size();
        return this.f26100b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f26099a.f26202b.inflate(C0100R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0240hk) view).mo1035f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m9660b();
        super.notifyDataSetChanged();
    }
}
