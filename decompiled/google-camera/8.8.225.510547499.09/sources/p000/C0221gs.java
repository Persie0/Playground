package p000;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0221gs implements AdapterView.OnItemClickListener, InterfaceC0239hj {

    /* JADX INFO: renamed from: a */
    Context f26201a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f26202b;

    /* JADX INFO: renamed from: c */
    C0225gw f26203c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f26204d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0238hi f26205e;

    /* JADX INFO: renamed from: f */
    public C0220gr f26206f;

    public C0221gs(Context context) {
        this.f26201a = context;
        this.f26202b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public final ListAdapter m9696a() {
        if (this.f26206f == null) {
            this.f26206f = new C0220gr(this);
        }
        return this.f26206f;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: b */
    public final void mo9484b(Context context, C0225gw c0225gw) {
        if (this.f26201a != null) {
            this.f26201a = context;
            if (this.f26202b == null) {
                this.f26202b = LayoutInflater.from(context);
            }
        }
        this.f26203c = c0225gw;
        C0220gr c0220gr = this.f26206f;
        if (c0220gr != null) {
            c0220gr.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: c */
    public final void mo9485c(C0225gw c0225gw, boolean z) {
        InterfaceC0238hi interfaceC0238hi = this.f26205e;
        if (interfaceC0238hi != null) {
            interfaceC0238hi.mo8114a(c0225gw, z);
        }
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: d */
    public final void mo9486d(InterfaceC0238hi interfaceC0238hi) {
        throw null;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: e */
    public final boolean mo9487e() {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: f */
    public final boolean mo9488f(SubMenuC0246hq subMenuC0246hq) {
        if (!subMenuC0246hq.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0226gx dialogInterfaceOnKeyListenerC0226gx = new DialogInterfaceOnKeyListenerC0226gx(subMenuC0246hq);
        C0225gw c0225gw = dialogInterfaceOnKeyListenerC0226gx.f26702a;
        C0154ef c0154ef = new C0154ef(c0225gw.f26547a);
        dialogInterfaceOnKeyListenerC0226gx.f26704c = new C0221gs(c0154ef.m7255a());
        C0221gs c0221gs = dialogInterfaceOnKeyListenerC0226gx.f26704c;
        c0221gs.f26205e = dialogInterfaceOnKeyListenerC0226gx;
        dialogInterfaceOnKeyListenerC0226gx.f26702a.m9827g(c0221gs);
        ListAdapter listAdapterM9696a = dialogInterfaceOnKeyListenerC0226gx.f26704c.m9696a();
        C0150eb c0150eb = c0154ef.f13785a;
        c0150eb.f13177o = listAdapterM9696a;
        c0150eb.f13178p = dialogInterfaceOnKeyListenerC0226gx;
        View view = c0225gw.f26553g;
        if (view != null) {
            c0150eb.f13167e = view;
        } else {
            c0154ef.m7258d(c0225gw.f26552f);
            c0154ef.m7263i(c0225gw.f26551e);
        }
        c0154ef.m7261g(dialogInterfaceOnKeyListenerC0226gx);
        dialogInterfaceOnKeyListenerC0226gx.f26703b = c0154ef.mo7256b();
        dialogInterfaceOnKeyListenerC0226gx.f26703b.setOnDismissListener(dialogInterfaceOnKeyListenerC0226gx);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0226gx.f26703b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0226gx.f26703b.show();
        InterfaceC0238hi interfaceC0238hi = this.f26205e;
        if (interfaceC0238hi == null) {
            return true;
        }
        interfaceC0238hi.mo8115b(subMenuC0246hq);
        return true;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: g */
    public final boolean mo9489g(C0227gy c0227gy) {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: h */
    public final boolean mo9490h(C0227gy c0227gy) {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: i */
    public final void mo9491i() {
        C0220gr c0220gr = this.f26206f;
        if (c0220gr != null) {
            c0220gr.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f26203c.m9817A(this.f26206f.getItem(i), this, 0);
    }
}
