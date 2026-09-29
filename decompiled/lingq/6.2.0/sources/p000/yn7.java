package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yn7 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f70110a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final jp9 f70111b;

    /* JADX INFO: renamed from: c */
    public l64 f70112c;

    /* JADX INFO: renamed from: d */
    public l64 f70113d;

    /* JADX INFO: renamed from: e */
    public int f70114e;

    /* JADX INFO: renamed from: f */
    public boolean f70115f;

    public yn7(jp9 jp9Var, ArrayList arrayList) {
        l64 l64Var = l64.f49115e;
        this.f70112c = l64Var;
        this.f70113d = l64Var;
        m25212a(arrayList, false);
        m25212a(arrayList, true);
        ArrayList arrayList2 = jp9Var.f45973b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            l64 l64Var2 = jp9Var.f45974c;
            l64 l64Var3 = jp9Var.f45975d;
            this.f70112c = l64Var2;
            this.f70113d = l64Var3;
            m25214c();
            m25213b(jp9Var.f45976e);
        }
        this.f70111b = jp9Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m25212a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            na1 na1Var = (na1) list.get(i);
            na1Var.getClass();
            if (true == z) {
                yn7 yn7Var = na1Var.f52533c;
                if (yn7Var != null) {
                    throw new IllegalStateException(na1Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + yn7Var + " but is still added to " + this);
                }
                na1Var.f52533c = this;
                this.f70110a.add(na1Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25213b(int i) {
        ArrayList arrayList = this.f70110a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            na1 na1Var = (na1) arrayList.get(size);
            na1Var.getClass();
            if (na1Var.f52534d != i) {
                na1Var.f52534d = i;
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25214c() {
        ArrayList arrayList = this.f70110a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        na1 na1Var = (na1) arrayList.get(size);
        l64 l64Var = this.f70112c;
        l64 l64Var2 = this.f70113d;
        na1Var.f52531a = l64Var;
        na1Var.f52532b = l64Var2;
        throw null;
    }
}
