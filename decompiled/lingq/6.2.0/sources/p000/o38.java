package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o38 {

    /* JADX INFO: renamed from: t */
    public static final List f53780t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final View f53781a;

    /* JADX INFO: renamed from: b */
    public WeakReference f53782b;

    /* JADX INFO: renamed from: j */
    public int f53790j;

    /* JADX INFO: renamed from: r */
    public RecyclerView f53798r;

    /* JADX INFO: renamed from: s */
    public p28 f53799s;

    /* JADX INFO: renamed from: c */
    public int f53783c = -1;

    /* JADX INFO: renamed from: d */
    public int f53784d = -1;

    /* JADX INFO: renamed from: e */
    public long f53785e = -1;

    /* JADX INFO: renamed from: f */
    public int f53786f = -1;

    /* JADX INFO: renamed from: g */
    public int f53787g = -1;

    /* JADX INFO: renamed from: h */
    public o38 f53788h = null;

    /* JADX INFO: renamed from: i */
    public o38 f53789i = null;

    /* JADX INFO: renamed from: k */
    public final ArrayList f53791k = null;

    /* JADX INFO: renamed from: l */
    public final List f53792l = null;

    /* JADX INFO: renamed from: m */
    public int f53793m = 0;

    /* JADX INFO: renamed from: n */
    public g38 f53794n = null;

    /* JADX INFO: renamed from: o */
    public boolean f53795o = false;

    /* JADX INFO: renamed from: p */
    public int f53796p = 0;

    /* JADX INFO: renamed from: q */
    public int f53797q = -1;

    public o38(View view) {
        if (view != null) {
            this.f53781a = view;
        } else {
            C3386nv.m17626m("itemView may not be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17781a(int i) {
        this.f53790j = i | this.f53790j;
    }

    /* JADX INFO: renamed from: b */
    public final int m17782b() {
        RecyclerView recyclerView = this.f53798r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m2717K(this);
    }

    /* JADX INFO: renamed from: c */
    public final int m17783c() {
        RecyclerView recyclerView;
        p28 adapter;
        int iM2717K;
        if (this.f53799s == null || (recyclerView = this.f53798r) == null || (adapter = recyclerView.getAdapter()) == null || (iM2717K = this.f53798r.m2717K(this)) == -1 || this.f53799s != adapter) {
            return -1;
        }
        return iM2717K;
    }

    /* JADX INFO: renamed from: d */
    public final int m17784d() {
        int i = this.f53787g;
        return i == -1 ? this.f53783c : i;
    }

    /* JADX INFO: renamed from: e */
    public final List m17785e() {
        ArrayList arrayList;
        return ((this.f53790j & 1024) != 0 || (arrayList = this.f53791k) == null || arrayList.size() == 0) ? f53780t : this.f53792l;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17786f() {
        View view = this.f53781a;
        return (view.getParent() == null || view.getParent() == this.f53798r) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17787g() {
        return (this.f53790j & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17788h() {
        return (this.f53790j & 4) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17789i() {
        if ((this.f53790j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        return !this.f53781a.hasTransientState();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m17790j() {
        return (this.f53790j & 8) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17791k() {
        return this.f53794n != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17792l() {
        return (this.f53790j & 256) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m17793m() {
        return (this.f53790j & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m17794n(int i, boolean z) {
        if (this.f53784d == -1) {
            this.f53784d = this.f53783c;
        }
        if (this.f53787g == -1) {
            this.f53787g = this.f53783c;
        }
        if (z) {
            this.f53787g += i;
        }
        this.f53783c += i;
        View view = this.f53781a;
        if (view.getLayoutParams() != null) {
            ((z28) view.getLayoutParams()).f70801c = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m17795o() {
        if (RecyclerView.f6595X0 && m17792l()) {
            v63.m23148z("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.f53790j = 0;
        this.f53783c = -1;
        this.f53784d = -1;
        this.f53785e = -1L;
        this.f53787g = -1;
        this.f53793m = 0;
        this.f53788h = null;
        this.f53789i = null;
        ArrayList arrayList = this.f53791k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f53790j &= -1025;
        this.f53796p = 0;
        this.f53797q = -1;
        RecyclerView.m2706l(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m17796p(boolean z) {
        int i = this.f53793m;
        int i2 = z ? i - 1 : i + 1;
        this.f53793m = i2;
        if (i2 < 0) {
            this.f53793m = 0;
            if (RecyclerView.f6595X0) {
                ho2.m13384d(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.f53790j |= 16;
        } else if (z && i2 == 0) {
            this.f53790j &= -17;
        }
        if (RecyclerView.f6596Y0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17797q() {
        return (this.f53790j & 128) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17798r() {
        return (this.f53790j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbM22999v = ux5.m22999v(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM22999v.append(Integer.toHexString(hashCode()));
        sbM22999v.append(" position=");
        sbM22999v.append(this.f53783c);
        sbM22999v.append(" id=");
        sbM22999v.append(this.f53785e);
        sbM22999v.append(", oldPos=");
        sbM22999v.append(this.f53784d);
        sbM22999v.append(", pLpos:");
        sbM22999v.append(this.f53787g);
        StringBuilder sb = new StringBuilder(sbM22999v.toString());
        if (m17791k()) {
            sb.append(" scrap ");
            sb.append(this.f53795o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m17788h()) {
            sb.append(" invalid");
        }
        if (!m17787g()) {
            sb.append(" unbound");
        }
        if ((this.f53790j & 2) != 0) {
            sb.append(" update");
        }
        if (m17790j()) {
            sb.append(" removed");
        }
        if (m17797q()) {
            sb.append(" ignored");
        }
        if (m17792l()) {
            sb.append(" tmpDetached");
        }
        if (!m17789i()) {
            sb.append(" not recyclable(" + this.f53793m + ")");
        }
        if ((this.f53790j & 512) != 0 || m17788h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f53781a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
