package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0809lv {

    /* JADX INFO: renamed from: l */
    public AmbientMode.AmbientController f39375l = null;

    /* JADX INFO: renamed from: a */
    private final ArrayList f39370a = new ArrayList();

    /* JADX INFO: renamed from: h */
    public long f39371h = 120;

    /* JADX INFO: renamed from: i */
    public long f39372i = 120;

    /* JADX INFO: renamed from: j */
    public long f39373j = 250;

    /* JADX INFO: renamed from: k */
    public long f39374k = 250;

    /* JADX INFO: renamed from: o */
    public static void m16073o(C0829mo c0829mo) {
        int i = c0829mo.f41164j;
        if (!c0829mo.m16692s() && (i & 4) == 0) {
            int i2 = c0829mo.f41158d;
            c0829mo.m16674a();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final aev m16074t() {
        return new aev();
    }

    /* JADX INFO: renamed from: u */
    public static final aev m16075u(C0829mo c0829mo) {
        aev aevVarM16074t = m16074t();
        aevVarM16074t.m401d(c0829mo);
        return aevVarM16074t;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo11859b(C0829mo c0829mo);

    /* JADX INFO: renamed from: c */
    public abstract void mo11860c();

    /* JADX INFO: renamed from: d */
    public abstract void mo11861d();

    /* JADX INFO: renamed from: g */
    public boolean mo11862g(C0829mo c0829mo, List list) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo11863h();

    /* JADX INFO: renamed from: l */
    public final void m16076l(C0829mo c0829mo) {
        AmbientMode.AmbientController ambientController = this.f39375l;
        if (ambientController != null) {
            boolean z = true;
            c0829mo.m16686m(true);
            if (c0829mo.f41162h != null && c0829mo.f41163i == null) {
                c0829mo.f41162h = null;
            }
            c0829mo.f41163i = null;
            if ((c0829mo.f41164j & 16) != 0) {
                return;
            }
            Object obj = ambientController.f1697a;
            View view = c0829mo.f41155a;
            RecyclerView recyclerView = (RecyclerView) obj;
            recyclerView.m1232ae();
            C0756jw c0756jw = recyclerView.f1118h;
            int iM1637j = c0756jw.f34934c.m1637j(view);
            if (iM1637j == -1) {
                c0756jw.m13620l(view);
            } else if (c0756jw.f34932a.m13534f(iM1637j)) {
                c0756jw.f34932a.m13535g(iM1637j);
                c0756jw.m13620l(view);
                c0756jw.f34934c.m1640m(iM1637j);
            } else {
                z = false;
            }
            if (z) {
                C0829mo c0829moM1197h = RecyclerView.m1197h(view);
                recyclerView.f1116f.m16324m(c0829moM1197h);
                recyclerView.f1116f.m16322k(c0829moM1197h);
            }
            recyclerView.m1233af(!z);
            if (z || !c0829mo.m16696w()) {
                return;
            }
            ((RecyclerView) ambientController.f1697a).removeDetachedView(c0829mo.f41155a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16077m() {
        int size = this.f39370a.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0808lu) this.f39370a.get(i)).m15981a();
        }
        this.f39370a.clear();
    }

    /* JADX INFO: renamed from: n */
    public boolean mo16078n(C0829mo c0829mo) {
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo16079p(C0829mo c0829mo, aev aevVar, aev aevVar2);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo16080q(C0829mo c0829mo, C0829mo c0829mo2, aev aevVar, aev aevVar2);

    /* JADX INFO: renamed from: r */
    public abstract boolean mo16081r(C0829mo c0829mo, aev aevVar, aev aevVar2);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo16082s(C0829mo c0829mo, aev aevVar, aev aevVar2);
}
