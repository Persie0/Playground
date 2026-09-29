package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1147d0 implements C1140a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f7244a;

    public C1147d0(RecyclerView recyclerView) {
        this.f7244a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m4444a(C1140a.b bVar) {
        int i10 = bVar.f7213a;
        RecyclerView recyclerView = this.f7244a;
        if (i10 == 1) {
            recyclerView.f6973I.mo4078b0(bVar.f7214b, bVar.f7216d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f6973I.mo4083e0(bVar.f7214b, bVar.f7216d);
        } else if (i10 == 4) {
            recyclerView.f6973I.mo4084f0(bVar.f7214b, bVar.f7216d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f6973I.mo4082d0(bVar.f7214b, bVar.f7216d);
        }
    }

    /* JADX INFO: renamed from: b */
    public final RecyclerView.AbstractC1109b0 m4445b(int i10) {
        RecyclerView recyclerView = this.f7244a;
        int iM4462h = recyclerView.f7012f.m4462h();
        RecyclerView.AbstractC1109b0 abstractC1109b0 = null;
        for (int i11 = 0; i11 < iM4462h; i11++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(recyclerView.f7012f.m4461g(i11));
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4248k() && abstractC1109b0M4161L.f7056c == i10) {
                if (!recyclerView.f7012f.m4464j(abstractC1109b0M4161L.f7054a)) {
                    abstractC1109b0 = abstractC1109b0M4161L;
                    break;
                }
                abstractC1109b0 = abstractC1109b0M4161L;
            }
        }
        if (abstractC1109b0 != null && !recyclerView.f7012f.m4464j(abstractC1109b0.f7054a)) {
            return abstractC1109b0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4446c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f7244a;
        int iM4462h = recyclerView.f7012f.m4462h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iM4462h; i15++) {
            View viewM4461g = recyclerView.f7012f.m4461g(i15);
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(viewM4461g);
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4254q() && (i13 = abstractC1109b0M4161L.f7056c) >= i10 && i13 < i14) {
                abstractC1109b0M4161L.m4239b(2);
                abstractC1109b0M4161L.m4238a(obj);
                ((RecyclerView.C1121n) viewM4461g.getLayoutParams()).f7107c = true;
            }
        }
        RecyclerView.C1127t c1127t = recyclerView.f7006c;
        ArrayList<RecyclerView.AbstractC1109b0> arrayList = c1127t.f7118c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.f6972H0 = true;
                return;
            }
            RecyclerView.AbstractC1109b0 abstractC1109b0 = arrayList.get(size);
            if (abstractC1109b0 != null && (i12 = abstractC1109b0.f7056c) >= i10 && i12 < i14) {
                abstractC1109b0.m4239b(2);
                c1127t.m4349h(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4447d(int i10, int i11) {
        RecyclerView recyclerView = this.f7244a;
        int iM4462h = recyclerView.f7012f.m4462h();
        for (int i12 = 0; i12 < iM4462h; i12++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(recyclerView.f7012f.m4461g(i12));
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4254q() && abstractC1109b0M4161L.f7056c >= i10) {
                abstractC1109b0M4161L.m4251n(i11, false);
                recyclerView.f6967D0.f7145f = true;
            }
        }
        ArrayList<RecyclerView.AbstractC1109b0> arrayList = recyclerView.f7006c.f7118c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0 = arrayList.get(i13);
            if (abstractC1109b0 != null && abstractC1109b0.f7056c >= i10) {
                abstractC1109b0.m4251n(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6970G0 = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m4448e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f7244a;
        int iM4462h = recyclerView.f7012f.m4462h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iM4462h; i20++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(recyclerView.f7012f.m4461g(i20));
            if (abstractC1109b0M4161L != null && (i18 = abstractC1109b0M4161L.f7056c) >= i13) {
                if (i18 <= i12) {
                    if (i18 == i10) {
                        abstractC1109b0M4161L.m4251n(i11 - i10, false);
                    } else {
                        abstractC1109b0M4161L.m4251n(i14, false);
                    }
                    recyclerView.f6967D0.f7145f = true;
                }
            }
        }
        RecyclerView.C1127t c1127t = recyclerView.f7006c;
        c1127t.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.AbstractC1109b0> arrayList = c1127t.f7118c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0 = arrayList.get(i21);
            if (abstractC1109b0 != null && (i17 = abstractC1109b0.f7056c) >= i16) {
                if (i17 <= i15) {
                    if (i17 == i10) {
                        abstractC1109b0.m4251n(i11 - i10, false);
                    } else {
                        abstractC1109b0.m4251n(i19, false);
                    }
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6970G0 = true;
    }
}
