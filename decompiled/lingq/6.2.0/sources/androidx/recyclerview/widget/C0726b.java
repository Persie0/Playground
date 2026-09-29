package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.C3488q8;
import p000.dta;
import p000.m28;
import p000.p28;
import p000.r28;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0726b extends r28 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f6718a;

    public C0726b(RecyclerView recyclerView) {
        this.f6718a = recyclerView;
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: a */
    public final void mo2797a() {
        RecyclerView recyclerView = this.f6718a;
        recyclerView.m2745k(null);
        recyclerView.f6606C0.f46632f = true;
        recyclerView.m2731Z(true);
        if (recyclerView.f6651e.m19755x()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: b */
    public final void mo2798b(int i, int i2) {
        RecyclerView recyclerView = this.f6718a;
        recyclerView.m2745k(null);
        C3488q8 c3488q8 = recyclerView.f6651e;
        ArrayList arrayList = (ArrayList) c3488q8.f57370d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c3488q8.m19757z(4, i, i2));
        c3488q8.f57368b |= 4;
        if (arrayList.size() == 1) {
            m2803g();
        }
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: c */
    public final void mo2799c(int i, int i2) {
        RecyclerView recyclerView = this.f6718a;
        recyclerView.m2745k(null);
        C3488q8 c3488q8 = recyclerView.f6651e;
        ArrayList arrayList = (ArrayList) c3488q8.f57370d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c3488q8.m19757z(1, i, i2));
        c3488q8.f57368b |= 1;
        if (arrayList.size() == 1) {
            m2803g();
        }
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: d */
    public final void mo2800d(int i, int i2) {
        RecyclerView recyclerView = this.f6718a;
        recyclerView.m2745k(null);
        C3488q8 c3488q8 = recyclerView.f6651e;
        ArrayList arrayList = (ArrayList) c3488q8.f57370d;
        if (i == i2) {
            return;
        }
        arrayList.add(c3488q8.m19757z(8, i, i2));
        c3488q8.f57368b |= 8;
        if (arrayList.size() == 1) {
            m2803g();
        }
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: e */
    public final void mo2801e(int i, int i2) {
        RecyclerView recyclerView = this.f6718a;
        recyclerView.m2745k(null);
        C3488q8 c3488q8 = recyclerView.f6651e;
        ArrayList arrayList = (ArrayList) c3488q8.f57370d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c3488q8.m19757z(2, i, i2));
        c3488q8.f57368b |= 2;
        if (arrayList.size() == 1) {
            m2803g();
        }
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: f */
    public final void mo2802f() {
        p28 p28Var;
        RecyclerView recyclerView = this.f6718a;
        if (recyclerView.f6649d == null || (p28Var = recyclerView.f6611H) == null) {
            return;
        }
        int iOrdinal = p28Var.f55488c.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
        } else if (p28Var.mo6133a() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: g */
    public final void m2803g() {
        RecyclerView recyclerView = this.f6718a;
        if (!recyclerView.f6625O || !recyclerView.f6623N) {
            recyclerView.f6639V = true;
            recyclerView.requestLayout();
        } else {
            m28 m28Var = recyclerView.f6659i;
            WeakHashMap weakHashMap = dta.f36217a;
            recyclerView.postOnAnimation(m28Var);
        }
    }
}
