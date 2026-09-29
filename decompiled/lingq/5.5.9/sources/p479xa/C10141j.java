package p479xa;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: xa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10141j {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f51380a;

    /* JADX INFO: renamed from: xa.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f51381a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f51382b;

        /* JADX INFO: renamed from: a */
        public final void m19073a(int i10) {
            C10129a.m18992d(!this.f51382b);
            this.f51381a.append(i10, true);
        }

        /* JADX INFO: renamed from: b */
        public final C10141j m19074b() {
            C10129a.m18992d(!this.f51382b);
            this.f51382b = true;
            return new C10141j(this.f51381a);
        }
    }

    public C10141j(SparseBooleanArray sparseBooleanArray) {
        this.f51380a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m19071a(int i10) {
        C10129a.m18991c(i10, m19072b());
        return this.f51380a.keyAt(i10);
    }

    /* JADX INFO: renamed from: b */
    public final int m19072b() {
        return this.f51380a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10141j)) {
            return false;
        }
        C10141j c10141j = (C10141j) obj;
        if (C10134c0.f51354a >= 24) {
            return this.f51380a.equals(c10141j.f51380a);
        }
        if (m19072b() != c10141j.m19072b()) {
            return false;
        }
        for (int i10 = 0; i10 < m19072b(); i10++) {
            if (m19071a(i10) != c10141j.m19071a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (C10134c0.f51354a >= 24) {
            return this.f51380a.hashCode();
        }
        int iM19072b = m19072b();
        for (int i10 = 0; i10 < m19072b(); i10++) {
            iM19072b = (iM19072b * 31) + m19071a(i10);
        }
        return iM19072b;
    }
}
