package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0215b;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0222d implements InterfaceC0228j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f678a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f679b;

    /* JADX INFO: renamed from: c */
    public C0224f f680c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f681d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0228j.a f682e;

    /* JADX INFO: renamed from: f */
    public a f683f;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$a */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f684a = -1;

        public a() {
            m914b();
        }

        /* JADX INFO: renamed from: b */
        public final void m914b() {
            C0224f c0224f = C0222d.this.f680c;
            C0226h c0226h = c0224f.f714v;
            if (c0226h != null) {
                c0224f.m925i();
                ArrayList<C0226h> arrayList = c0224f.f702j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == c0226h) {
                        this.f684a = i10;
                        return;
                    }
                }
            }
            this.f684a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0226h getItem(int i10) {
            C0222d c0222d = C0222d.this;
            C0224f c0224f = c0222d.f680c;
            c0224f.m925i();
            ArrayList<C0226h> arrayList = c0224f.f702j;
            c0222d.getClass();
            int i11 = i10 + 0;
            int i12 = this.f684a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            C0222d c0222d = C0222d.this;
            C0224f c0224f = c0222d.f680c;
            c0224f.m925i();
            int size = c0224f.f702j.size();
            c0222d.getClass();
            int i10 = size + 0;
            return this.f684a < 0 ? i10 : i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0222d.this.f679b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((InterfaceC0229k.a) view).mo232d(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            m914b();
            super.notifyDataSetChanged();
        }
    }

    public C0222d(Context context) {
        this.f678a = context;
        this.f679b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: c */
    public final void mo895c(C0224f c0224f, boolean z10) {
        InterfaceC0228j.a aVar = this.f682e;
        if (aVar != null) {
            aVar.mo942c(c0224f, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: d */
    public final void mo896d(boolean z10) {
        a aVar = this.f683f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: e */
    public final boolean mo897e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: f */
    public final void mo890f(InterfaceC0228j.a aVar) {
        this.f682e = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: g */
    public final boolean mo891g(C0226h c0226h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: h */
    public final void mo913h(Context context, C0224f c0224f) {
        if (this.f678a != null) {
            this.f678a = context;
            if (this.f679b == null) {
                this.f679b = LayoutInflater.from(context);
            }
        }
        this.f680c = c0224f;
        a aVar = this.f683f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: i */
    public final void mo898i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f681d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: k */
    public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
        if (!subMenuC0231m.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0225g dialogInterfaceOnKeyListenerC0225g = new DialogInterfaceOnKeyListenerC0225g(subMenuC0231m);
        Context context = subMenuC0231m.f693a;
        DialogInterfaceC0215b.a aVar = new DialogInterfaceC0215b.a(context);
        C0222d c0222d = new C0222d(aVar.getContext());
        dialogInterfaceOnKeyListenerC0225g.f719c = c0222d;
        c0222d.f682e = dialogInterfaceOnKeyListenerC0225g;
        subMenuC0231m.m918b(c0222d, context);
        C0222d c0222d2 = dialogInterfaceOnKeyListenerC0225g.f719c;
        if (c0222d2.f683f == null) {
            c0222d2.f683f = c0222d2.new a();
        }
        a aVar2 = c0222d2.f683f;
        AlertController.C0211b c0211b = aVar.f599a;
        c0211b.f590q = aVar2;
        c0211b.f591r = dialogInterfaceOnKeyListenerC0225g;
        View view = subMenuC0231m.f707o;
        if (view != null) {
            c0211b.f578e = view;
        } else {
            c0211b.f576c = subMenuC0231m.f706n;
            aVar.setTitle(subMenuC0231m.f705m);
        }
        c0211b.f588o = dialogInterfaceOnKeyListenerC0225g;
        DialogInterfaceC0215b dialogInterfaceC0215bCreate = aVar.create();
        dialogInterfaceOnKeyListenerC0225g.f718b = dialogInterfaceC0215bCreate;
        dialogInterfaceC0215bCreate.setOnDismissListener(dialogInterfaceOnKeyListenerC0225g);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0225g.f718b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0225g.f718b.show();
        InterfaceC0228j.a aVar3 = this.f682e;
        if (aVar3 != null) {
            aVar3.mo943d(subMenuC0231m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: l */
    public final Parcelable mo901l() {
        if (this.f681d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f681d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: m */
    public final boolean mo892m(C0226h c0226h) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f680c.m933q(this.f683f.getItem(i10), this, 0);
    }
}
