package androidx.recyclerview.widget;

import p081e0.C5339u;
import p326q.C8449e;
import p326q.C8452h;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159j0 {

    /* JADX INFO: renamed from: a */
    public final C8452h<RecyclerView.AbstractC1109b0, a> f7314a = new C8452h<>();

    /* JADX INFO: renamed from: b */
    public final C8449e<RecyclerView.AbstractC1109b0> f7315b = new C8449e<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j0$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static final C5339u f7316d = new C5339u(20);

        /* JADX INFO: renamed from: a */
        public int f7317a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1117j.c f7318b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC1117j.c f7319c;

        /* JADX INFO: renamed from: a */
        public static a m4495a() {
            a aVar = (a) f7316d.mo11465b();
            if (aVar == null) {
                aVar = new a();
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4491a(RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1117j.c cVar) {
        C8452h<RecyclerView.AbstractC1109b0, a> c8452h = this.f7314a;
        a orDefault = c8452h.getOrDefault(abstractC1109b0, null);
        if (orDefault == null) {
            orDefault = a.m4495a();
            c8452h.put(abstractC1109b0, orDefault);
        }
        orDefault.f7319c = cVar;
        orDefault.f7317a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public final RecyclerView.AbstractC1117j.c m4492b(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        RecyclerView.AbstractC1117j.c cVar;
        C8452h<RecyclerView.AbstractC1109b0, a> c8452h = this.f7314a;
        int iM16526e = c8452h.m16526e(abstractC1109b0);
        if (iM16526e < 0) {
            return null;
        }
        a aVarM16530m = c8452h.m16530m(iM16526e);
        if (aVarM16530m != null) {
            int i11 = aVarM16530m.f7317a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                aVarM16530m.f7317a = i12;
                if (i10 == 4) {
                    cVar = aVarM16530m.f7318b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM16530m.f7319c;
                }
                if ((i12 & 12) == 0) {
                    c8452h.mo14869k(iM16526e);
                    aVarM16530m.f7317a = 0;
                    aVarM16530m.f7318b = null;
                    aVarM16530m.f7319c = null;
                    a.f7316d.mo11464a(aVarM16530m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4493c(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        a orDefault = this.f7314a.getOrDefault(abstractC1109b0, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f7317a &= -2;
    }

    /* JADX INFO: renamed from: d */
    public final void m4494d(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        C8449e<RecyclerView.AbstractC1109b0> c8449e = this.f7315b;
        for (int iM16514i = c8449e.m16514i() - 1; iM16514i >= 0; iM16514i--) {
            if (abstractC1109b0 == c8449e.m16515j(iM16514i)) {
                Object[] objArr = c8449e.f45591c;
                Object obj = objArr[iM16514i];
                Object obj2 = C8449e.f45588e;
                if (obj == obj2) {
                    break;
                }
                objArr[iM16514i] = obj2;
                c8449e.f45589a = true;
                break;
            }
        }
        a aVarRemove = this.f7314a.remove(abstractC1109b0);
        if (aVarRemove != null) {
            aVarRemove.f7317a = 0;
            aVarRemove.f7318b = null;
            aVarRemove.f7319c = null;
            a.f7316d.mo11464a(aVarRemove);
        }
    }
}
