package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: jw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0756jw {

    /* JADX INFO: renamed from: a */
    public final C0755jv f34932a = new C0755jv();

    /* JADX INFO: renamed from: b */
    public final List f34933b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AmbientMode.AmbientController f34934c;

    public C0756jw(AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f34934c = ambientController;
    }

    /* JADX INFO: renamed from: a */
    public final int m13609a() {
        return this.f34934c.m1636i() - this.f34933b.size();
    }

    /* JADX INFO: renamed from: b */
    public final int m13610b(int i) {
        if (i < 0) {
            return -1;
        }
        int iM1636i = this.f34934c.m1636i();
        int i2 = i;
        while (i2 < iM1636i) {
            int iM13529a = i - (i2 - this.f34932a.m13529a(i2));
            if (iM13529a == 0) {
                while (this.f34932a.m13534f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM13529a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m13611c() {
        return this.f34934c.m1636i();
    }

    /* JADX INFO: renamed from: d */
    final int m13612d(View view) {
        int iM1637j = this.f34934c.m1637j(view);
        if (iM1637j == -1 || this.f34932a.m13534f(iM1637j)) {
            return -1;
        }
        return iM1637j - this.f34932a.m13529a(iM1637j);
    }

    /* JADX INFO: renamed from: e */
    public final View m13613e(int i) {
        return this.f34934c.m1638k(m13610b(i));
    }

    /* JADX INFO: renamed from: f */
    public final View m13614f(int i) {
        return this.f34934c.m1638k(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m13615g(View view, int i, boolean z) {
        int iM1636i = i < 0 ? this.f34934c.m1636i() : m13610b(0);
        this.f34932a.m13531c(iM1636i, z);
        if (z) {
            m13618j(view);
        }
        AmbientMode.AmbientController ambientController = this.f34934c;
        ((RecyclerView) ambientController.f1697a).addView(view, iM1636i);
        Object obj = ambientController.f1697a;
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        RecyclerView recyclerView = (RecyclerView) obj;
        AbstractC0806ls abstractC0806ls = recyclerView.f1123m;
        if (abstractC0806ls != null && c0829moM1197h != null) {
            abstractC0806ls.mo10719aU(c0829moM1197h);
        }
        List list = recyclerView.f1135y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0813lz c0813lz = (C0813lz) view.getLayoutParams();
                if (c0813lz.width != -1 || c0813lz.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m13616h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM1636i = i < 0 ? this.f34934c.m1636i() : m13610b(i);
        this.f34932a.m13531c(iM1636i, z);
        if (z) {
            m13618j(view);
        }
        AmbientMode.AmbientController ambientController = this.f34934c;
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (c0829moM1197h != null) {
            if (!c0829moM1197h.m16696w() && !c0829moM1197h.m16699z()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + c0829moM1197h + ((RecyclerView) ambientController.f1697a).m1257k());
            }
            c0829moM1197h.m16682i();
        }
        ((RecyclerView) ambientController.f1697a).attachViewToParent(view, iM1636i, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    final void m13617i(int i) {
        C0829mo c0829moM1197h;
        int iM13610b = m13610b(i);
        this.f34932a.m13535g(iM13610b);
        AmbientMode.AmbientController ambientController = this.f34934c;
        View viewM1638k = ambientController.m1638k(iM13610b);
        if (viewM1638k != null && (c0829moM1197h = RecyclerView.m1197h(viewM1638k)) != null) {
            if (c0829moM1197h.m16696w() && !c0829moM1197h.m16699z()) {
                throw new IllegalArgumentException("called detach on an already detached child " + c0829moM1197h + ((RecyclerView) ambientController.f1697a).m1257k());
            }
            c0829moM1197h.m16678e(256);
        }
        ((RecyclerView) ambientController.f1697a).detachViewFromParent(iM13610b);
    }

    /* JADX INFO: renamed from: j */
    public final void m13618j(View view) {
        this.f34933b.add(view);
        AmbientMode.AmbientController ambientController = this.f34934c;
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (c0829moM1197h != null) {
            Object obj = ambientController.f1697a;
            int i = c0829moM1197h.f41170p;
            if (i != -1) {
                c0829moM1197h.f41169o = i;
            } else {
                c0829moM1197h.f41169o = afb.m420a(c0829moM1197h.f41155a);
            }
            ((RecyclerView) obj).m1242ar(c0829moM1197h, 4);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13619k(View view) {
        return this.f34933b.contains(view);
    }

    /* JADX INFO: renamed from: l */
    public final void m13620l(View view) {
        if (this.f34933b.remove(view)) {
            this.f34934c.m1639l(view);
        }
    }

    public final String toString() {
        return this.f34932a.toString() + ", hidden list:" + this.f34933b.size();
    }
}
