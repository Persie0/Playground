package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1150f {

    /* JADX INFO: renamed from: a */
    public final b f7254a;

    /* JADX INFO: renamed from: b */
    public final a f7255b = new a();

    /* JADX INFO: renamed from: c */
    public final ArrayList f7256c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f7257a = 0;

        /* JADX INFO: renamed from: b */
        public a f7258b;

        /* JADX INFO: renamed from: a */
        public final void m4466a(int i10) {
            if (i10 < 64) {
                this.f7257a &= ~(1 << i10);
                return;
            }
            a aVar = this.f7258b;
            if (aVar != null) {
                aVar.m4466a(i10 - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m4467b(int i10) {
            a aVar = this.f7258b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f7257a) : Long.bitCount(this.f7257a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f7257a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f7257a) + aVar.m4467b(i10 - 64);
        }

        /* JADX INFO: renamed from: c */
        public final void m4468c() {
            if (this.f7258b == null) {
                this.f7258b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m4469d(int i10) {
            if (i10 < 64) {
                return (this.f7257a & (1 << i10)) != 0;
            }
            m4468c();
            return this.f7258b.m4469d(i10 - 64);
        }

        /* JADX INFO: renamed from: e */
        public final void m4470e(int i10, boolean z10) {
            if (i10 >= 64) {
                m4468c();
                this.f7258b.m4470e(i10 - 64, z10);
                return;
            }
            long j10 = this.f7257a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f7257a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                m4473h(i10);
            } else {
                m4466a(i10);
            }
            if (!z11 && this.f7258b == null) {
                return;
            }
            m4468c();
            this.f7258b.m4470e(0, z11);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m4471f(int i10) {
            if (i10 >= 64) {
                m4468c();
                return this.f7258b.m4471f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f7257a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f7257a = j12;
            long j13 = j10 - 1;
            this.f7257a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f7258b;
            if (aVar != null) {
                if (aVar.m4469d(0)) {
                    m4473h(63);
                }
                this.f7258b.m4471f(0);
            }
            return z10;
        }

        /* JADX INFO: renamed from: g */
        public final void m4472g() {
            this.f7257a = 0L;
            a aVar = this.f7258b;
            if (aVar != null) {
                aVar.m4472g();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m4473h(int i10) {
            if (i10 < 64) {
                this.f7257a |= 1 << i10;
            } else {
                m4468c();
                this.f7258b.m4473h(i10 - 64);
            }
        }

        public final String toString() {
            if (this.f7258b == null) {
                return Long.toBinaryString(this.f7257a);
            }
            return this.f7258b.toString() + "xx" + Long.toBinaryString(this.f7257a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$b */
    public interface b {
    }

    public C1150f(C1145c0 c1145c0) {
        this.f7254a = c1145c0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4455a(View view, int i10, boolean z10) {
        b bVar = this.f7254a;
        int iM4436a = i10 < 0 ? ((C1145c0) bVar).m4436a() : m4460f(i10);
        this.f7255b.m4470e(iM4436a, z10);
        if (z10) {
            m4463i(view);
        }
        RecyclerView recyclerView = ((C1145c0) bVar).f7226a;
        recyclerView.addView(view, iM4436a);
        RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
        RecyclerView.Adapter adapter = recyclerView.f6971H;
        if (adapter != null && abstractC1109b0M4161L != null) {
            adapter.mo4232m(abstractC1109b0M4161L);
        }
        ArrayList arrayList = recyclerView.f7005b0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((RecyclerView.InterfaceC1122o) recyclerView.f7005b0.get(size)).mo67d(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4456b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b bVar = this.f7254a;
        int iM4436a = i10 < 0 ? ((C1145c0) bVar).m4436a() : m4460f(i10);
        this.f7255b.m4470e(iM4436a, z10);
        if (z10) {
            m4463i(view);
        }
        C1145c0 c1145c0 = (C1145c0) bVar;
        c1145c0.getClass();
        RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
        RecyclerView recyclerView = c1145c0.f7226a;
        if (abstractC1109b0M4161L != null) {
            if (!abstractC1109b0M4161L.m4250m() && !abstractC1109b0M4161L.m4254q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC1109b0M4161L + recyclerView.m4170B());
            }
            abstractC1109b0M4161L.f7063j &= -257;
        }
        recyclerView.attachViewToParent(view, iM4436a, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m4457c(int i10) {
        RecyclerView.AbstractC1109b0 abstractC1109b0M4161L;
        int iM4460f = m4460f(i10);
        this.f7255b.m4471f(iM4460f);
        C1145c0 c1145c0 = (C1145c0) this.f7254a;
        View childAt = c1145c0.f7226a.getChildAt(iM4460f);
        RecyclerView recyclerView = c1145c0.f7226a;
        if (childAt != null && (abstractC1109b0M4161L = RecyclerView.m4161L(childAt)) != null) {
            if (abstractC1109b0M4161L.m4250m() && !abstractC1109b0M4161L.m4254q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC1109b0M4161L + recyclerView.m4170B());
            }
            abstractC1109b0M4161L.m4239b(256);
        }
        recyclerView.detachViewFromParent(iM4460f);
    }

    /* JADX INFO: renamed from: d */
    public final View m4458d(int i10) {
        return ((C1145c0) this.f7254a).f7226a.getChildAt(m4460f(i10));
    }

    /* JADX INFO: renamed from: e */
    public final int m4459e() {
        return ((C1145c0) this.f7254a).m4436a() - this.f7256c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m4460f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iM4436a = ((C1145c0) this.f7254a).m4436a();
        int i11 = i10;
        while (i11 < iM4436a) {
            a aVar = this.f7255b;
            int iM4467b = i10 - (i11 - aVar.m4467b(i11));
            if (iM4467b == 0) {
                while (aVar.m4469d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iM4467b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m4461g(int i10) {
        return ((C1145c0) this.f7254a).f7226a.getChildAt(i10);
    }

    /* JADX INFO: renamed from: h */
    public final int m4462h() {
        return ((C1145c0) this.f7254a).m4436a();
    }

    /* JADX INFO: renamed from: i */
    public final void m4463i(View view) {
        this.f7256c.add(view);
        C1145c0 c1145c0 = (C1145c0) this.f7254a;
        c1145c0.getClass();
        RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
        if (abstractC1109b0M4161L != null) {
            int i10 = abstractC1109b0M4161L.f7070q;
            View view2 = abstractC1109b0M4161L.f7054a;
            if (i10 != -1) {
                abstractC1109b0M4161L.f7069p = i10;
            } else {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                abstractC1109b0M4161L.f7069p = C10029b0.d.m18666c(view2);
            }
            RecyclerView recyclerView = c1145c0.f7226a;
            if (recyclerView.m4180N()) {
                abstractC1109b0M4161L.f7070q = 4;
                recyclerView.f6990Q0.add(abstractC1109b0M4161L);
            } else {
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.d.m18682s(view2, 4);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4464j(View view) {
        return this.f7256c.contains(view);
    }

    /* JADX INFO: renamed from: k */
    public final void m4465k(View view) {
        if (this.f7256c.remove(view)) {
            C1145c0 c1145c0 = (C1145c0) this.f7254a;
            c1145c0.getClass();
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            if (abstractC1109b0M4161L != null) {
                int i10 = abstractC1109b0M4161L.f7069p;
                RecyclerView recyclerView = c1145c0.f7226a;
                if (recyclerView.m4180N()) {
                    abstractC1109b0M4161L.f7070q = i10;
                    recyclerView.f6990Q0.add(abstractC1109b0M4161L);
                } else {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18682s(abstractC1109b0M4161L.f7054a, i10);
                }
                abstractC1109b0M4161L.f7069p = 0;
            }
        }
    }

    public final String toString() {
        return this.f7255b.toString() + ", hidden list:" + this.f7256c.size();
    }
}
