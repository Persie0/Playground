package p397ta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;

/* JADX INFO: renamed from: ta.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9234b implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final List<C6640a> f47876a;

    public C9234b(ArrayList arrayList) {
        this.f47876a = Collections.unmodifiableList(arrayList);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        C10129a.m18990b(i10 == 0);
        return 0L;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        return j10 >= 0 ? this.f47876a : Collections.emptyList();
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return 1;
    }
}
