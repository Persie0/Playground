package p000;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: mo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0829mo {

    /* JADX INFO: renamed from: s */
    private static final List f41154s = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    public final View f41155a;

    /* JADX INFO: renamed from: b */
    public WeakReference f41156b;

    /* JADX INFO: renamed from: j */
    int f41164j;

    /* JADX INFO: renamed from: q */
    public RecyclerView f41171q;

    /* JADX INFO: renamed from: r */
    public AbstractC0806ls f41172r;

    /* JADX INFO: renamed from: c */
    public int f41157c = -1;

    /* JADX INFO: renamed from: d */
    public int f41158d = -1;

    /* JADX INFO: renamed from: e */
    public long f41159e = -1;

    /* JADX INFO: renamed from: f */
    public int f41160f = -1;

    /* JADX INFO: renamed from: g */
    int f41161g = -1;

    /* JADX INFO: renamed from: h */
    public C0829mo f41162h = null;

    /* JADX INFO: renamed from: i */
    public C0829mo f41163i = null;

    /* JADX INFO: renamed from: k */
    List f41165k = null;

    /* JADX INFO: renamed from: l */
    List f41166l = null;

    /* JADX INFO: renamed from: t */
    private int f41173t = 0;

    /* JADX INFO: renamed from: m */
    C0818md f41167m = null;

    /* JADX INFO: renamed from: n */
    boolean f41168n = false;

    /* JADX INFO: renamed from: o */
    public int f41169o = 0;

    /* JADX INFO: renamed from: p */
    public int f41170p = -1;

    public C0829mo(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f41155a = view;
    }

    /* JADX INFO: renamed from: A */
    final boolean m16673A() {
        return (this.f41164j & 32) != 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m16674a() {
        RecyclerView recyclerView = this.f41171q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m1250b(this);
    }

    /* JADX INFO: renamed from: b */
    public final int m16675b() {
        int i = this.f41161g;
        return i == -1 ? this.f41157c : i;
    }

    /* JADX INFO: renamed from: c */
    public final List m16676c() {
        if ((this.f41164j & 1024) != 0) {
            return f41154s;
        }
        List list = this.f41165k;
        return (list == null || list.size() == 0) ? f41154s : this.f41166l;
    }

    /* JADX INFO: renamed from: d */
    public final void m16677d(Object obj) {
        if (obj == null) {
            m16678e(1024);
            return;
        }
        if ((1024 & this.f41164j) == 0) {
            if (this.f41165k == null) {
                ArrayList arrayList = new ArrayList();
                this.f41165k = arrayList;
                this.f41166l = Collections.unmodifiableList(arrayList);
            }
            this.f41165k.add(obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16678e(int i) {
        this.f41164j = i | this.f41164j;
    }

    /* JADX INFO: renamed from: f */
    public final void m16679f() {
        this.f41158d = -1;
        this.f41161g = -1;
    }

    /* JADX INFO: renamed from: g */
    final void m16680g() {
        List list = this.f41165k;
        if (list != null) {
            list.clear();
        }
        this.f41164j &= -1025;
    }

    /* JADX INFO: renamed from: h */
    final void m16681h() {
        this.f41164j &= -33;
    }

    /* JADX INFO: renamed from: i */
    public final void m16682i() {
        this.f41164j &= -257;
    }

    /* JADX INFO: renamed from: j */
    public final void m16683j(int i, boolean z) {
        if (this.f41158d == -1) {
            this.f41158d = this.f41157c;
        }
        int i2 = this.f41161g;
        if (i2 == -1) {
            i2 = this.f41157c;
            this.f41161g = i2;
        }
        if (z) {
            this.f41161g = i2 + i;
        }
        this.f41157c += i;
        if (this.f41155a.getLayoutParams() != null) {
            ((C0813lz) this.f41155a.getLayoutParams()).f39587e = true;
        }
    }

    /* JADX INFO: renamed from: k */
    final void m16684k() {
        this.f41164j = 0;
        this.f41157c = -1;
        this.f41158d = -1;
        this.f41159e = -1L;
        this.f41161g = -1;
        this.f41173t = 0;
        this.f41162h = null;
        this.f41163i = null;
        m16680g();
        this.f41169o = 0;
        this.f41170p = -1;
        RecyclerView.m1202r(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m16685l(int i, int i2) {
        this.f41164j = (i & i2) | (this.f41164j & (i2 ^ (-1)));
    }

    /* JADX INFO: renamed from: m */
    public final void m16686m(boolean z) {
        int i = this.f41173t;
        int i2 = z ? i - 1 : i + 1;
        this.f41173t = i2;
        if (i2 < 0) {
            this.f41173t = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
            return;
        }
        if (!z && i2 == 1) {
            this.f41164j |= 16;
        } else if (z && i2 == 0) {
            this.f41164j &= -17;
        }
    }

    /* JADX INFO: renamed from: n */
    final void m16687n(C0818md c0818md, boolean z) {
        this.f41167m = c0818md;
        this.f41168n = z;
    }

    /* JADX INFO: renamed from: o */
    final void m16688o() {
        this.f41167m.m16324m(this);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16689p(int i) {
        return (i & this.f41164j) != 0;
    }

    /* JADX INFO: renamed from: q */
    final boolean m16690q() {
        return (this.f41155a.getParent() == null || this.f41155a.getParent() == this.f41171q) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16691r() {
        return (this.f41164j & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16692s() {
        return (this.f41164j & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16693t() {
        return (this.f41164j & 16) == 0 && !afb.m437r(this.f41155a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f41157c + " id=" + this.f41159e + ", oldPos=" + this.f41158d + ", pLpos:" + this.f41161g);
        if (m16695v()) {
            sb.append(" scrap ");
            sb.append(true != this.f41168n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (m16692s()) {
            sb.append(" invalid");
        }
        if (!m16691r()) {
            sb.append(" unbound");
        }
        if (m16698y()) {
            sb.append(yTyWiTtGtnBhy.mnypotssZPG);
        }
        if (m16694u()) {
            sb.append(" removed");
        }
        if (m16699z()) {
            sb.append(" ignored");
        }
        if (m16696w()) {
            sb.append(" tmpDetached");
        }
        if (!m16693t()) {
            sb.append(" not recyclable(" + this.f41173t + ")");
        }
        if ((this.f41164j & 512) != 0 || m16692s()) {
            sb.append(" undefined adapter position");
        }
        if (this.f41155a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16694u() {
        return (this.f41164j & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    final boolean m16695v() {
        return this.f41167m != null;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m16696w() {
        return (this.f41164j & 256) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m16697x() {
        return (this.f41164j & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    final boolean m16698y() {
        return (this.f41164j & 2) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m16699z() {
        return (this.f41164j & 128) != 0;
    }
}
