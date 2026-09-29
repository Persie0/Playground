package sa;

import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;

/* JADX INFO: renamed from: sa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8986b implements InterfaceC6646g {

    /* JADX INFO: renamed from: b */
    public static final C8986b f47169b = new C8986b();

    /* JADX INFO: renamed from: a */
    public final List<C6640a> f47170a;

    public C8986b() {
        this.f47170a = Collections.emptyList();
    }

    public C8986b(C6640a c6640a) {
        this.f47170a = Collections.singletonList(c6640a);
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
        return j10 >= 0 ? this.f47170a : Collections.emptyList();
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return 1;
    }
}
