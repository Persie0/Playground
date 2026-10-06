package p000;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0855nn implements InterfaceC0239hj {

    /* JADX INFO: renamed from: a */
    C0225gw f43921a;

    /* JADX INFO: renamed from: b */
    public C0227gy f43922b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Toolbar f43923c;

    public C0855nn(Toolbar toolbar) {
        this.f43923c = toolbar;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: b */
    public final void mo9484b(Context context, C0225gw c0225gw) {
        C0227gy c0227gy;
        C0225gw c0225gw2 = this.f43921a;
        if (c0225gw2 != null && (c0227gy = this.f43922b) != null) {
            c0225gw2.mo9840t(c0227gy);
        }
        this.f43921a = c0225gw;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: c */
    public final void mo9485c(C0225gw c0225gw, boolean z) {
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
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: g */
    public final boolean mo9489g(C0227gy c0227gy) {
        View view = this.f43923c.f1231h;
        if (view instanceof C0231hb) {
            ((C0231hb) view).f27115a.onActionViewCollapsed();
        }
        Toolbar toolbar = this.f43923c;
        toolbar.removeView(toolbar.f1231h);
        Toolbar toolbar2 = this.f43923c;
        toolbar2.removeView(toolbar2.f1230g);
        Toolbar toolbar3 = this.f43923c;
        toolbar3.f1231h = null;
        for (int size = toolbar3.f1244u.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.f1244u.get(size));
        }
        toolbar3.f1244u.clear();
        this.f43922b = null;
        this.f43923c.requestLayout();
        c0227gy.m9951h(false);
        this.f43923c.m1353u();
        return true;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: h */
    public final boolean mo9490h(C0227gy c0227gy) {
        Toolbar toolbar = this.f43923c;
        if (toolbar.f1230g == null) {
            toolbar.f1230g = new C0273iq(toolbar.getContext(), null, C0100R.attr.toolbarNavigationButtonStyle);
            toolbar.f1230g.setImageDrawable(toolbar.f1228e);
            toolbar.f1230g.setContentDescription(toolbar.f1229f);
            C0856no c0856noM1331y = Toolbar.m1331y();
            c0856noM1331y.f12698a = (toolbar.f1236m & 112) | 8388611;
            c0856noM1331y.f43969b = 2;
            toolbar.f1230g.setLayoutParams(c0856noM1331y);
            toolbar.f1230g.setOnClickListener(new ViewOnClickListenerC0250hu(toolbar, 2));
        }
        ViewParent parent = this.f43923c.f1230g.getParent();
        Toolbar toolbar2 = this.f43923c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.f1230g);
            }
            Toolbar toolbar3 = this.f43923c;
            toolbar3.addView(toolbar3.f1230g);
        }
        this.f43923c.f1231h = c0227gy.getActionView();
        this.f43922b = c0227gy;
        ViewParent parent2 = this.f43923c.f1231h.getParent();
        Toolbar toolbar4 = this.f43923c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.f1231h);
            }
            C0856no c0856noM1331y2 = Toolbar.m1331y();
            Toolbar toolbar5 = this.f43923c;
            c0856noM1331y2.f12698a = 8388611 | (toolbar5.f1236m & 112);
            c0856noM1331y2.f43969b = 2;
            toolbar5.f1231h.setLayoutParams(c0856noM1331y2);
            Toolbar toolbar6 = this.f43923c;
            toolbar6.addView(toolbar6.f1231h);
        }
        Toolbar toolbar7 = this.f43923c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (((C0856no) childAt.getLayoutParams()).f43969b != 2 && childAt != toolbar7.f1224a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.f1244u.add(childAt);
            }
        }
        this.f43923c.requestLayout();
        c0227gy.m9951h(true);
        View view = this.f43923c.f1231h;
        if (view instanceof C0231hb) {
            ((C0231hb) view).f27115a.onActionViewExpanded();
        }
        this.f43923c.m1353u();
        return true;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: i */
    public final void mo9491i() {
        if (this.f43922b != null) {
            C0225gw c0225gw = this.f43921a;
            if (c0225gw != null) {
                int size = c0225gw.size();
                for (int i = 0; i < size; i++) {
                    if (this.f43921a.getItem(i) == this.f43922b) {
                        return;
                    }
                }
            }
            mo9489g(this.f43922b);
        }
    }
}
