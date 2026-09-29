package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0223e extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final C0224f f686a;

    /* JADX INFO: renamed from: b */
    public int f687b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f688c;

    /* JADX INFO: renamed from: d */
    public final boolean f689d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f690e;

    /* JADX INFO: renamed from: f */
    public final int f691f;

    public C0223e(C0224f c0224f, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f689d = z10;
        this.f690e = layoutInflater;
        this.f686a = c0224f;
        this.f691f = i10;
        m916b();
    }

    /* JADX INFO: renamed from: b */
    public final void m916b() {
        C0224f c0224f = this.f686a;
        C0226h c0226h = c0224f.f714v;
        if (c0226h != null) {
            c0224f.m925i();
            ArrayList<C0226h> arrayList = c0224f.f702j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == c0226h) {
                    this.f687b = i10;
                    return;
                }
            }
        }
        this.f687b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0226h getItem(int i10) {
        ArrayList<C0226h> arrayListM928l;
        boolean z10 = this.f689d;
        C0224f c0224f = this.f686a;
        if (z10) {
            c0224f.m925i();
            arrayListM928l = c0224f.f702j;
        } else {
            arrayListM928l = c0224f.m928l();
        }
        int i11 = this.f687b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListM928l.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C0226h> arrayListM928l;
        boolean z10 = this.f689d;
        C0224f c0224f = this.f686a;
        if (z10) {
            c0224f.m925i();
            arrayListM928l = c0224f.f702j;
        } else {
            arrayListM928l = c0224f.m928l();
        }
        return this.f687b < 0 ? arrayListM928l.size() : arrayListM928l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f690e.inflate(this.f691f, viewGroup, false);
        }
        int i11 = getItem(i10).f724b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f724b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f686a.mo929m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        InterfaceC0229k.a aVar = (InterfaceC0229k.a) view;
        if (this.f688c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo232d(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m916b();
        super.notifyDataSetChanged();
    }
}
