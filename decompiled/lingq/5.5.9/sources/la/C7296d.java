package la;

import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;

/* JADX INFO: renamed from: la.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7296d implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final List<C6640a> f40905a;

    public C7296d(List<C6640a> list) {
        this.f40905a = list;
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
        return j10 >= 0 ? this.f40905a : Collections.emptyList();
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return 1;
    }
}
