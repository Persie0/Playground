package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface n0a {
    /* JADX INFO: renamed from: a */
    default void mo12312a(g32 g32Var) {
        mo12313b(g32Var != null ? Integer.valueOf(g32Var.m12309a(9)) : null);
    }

    /* JADX INFO: renamed from: b */
    void mo12313b(Integer num);

    /* JADX INFO: renamed from: d */
    Integer mo12314d();

    /* JADX INFO: renamed from: e */
    void mo12315e(Integer num);

    /* JADX INFO: renamed from: g */
    default g32 mo12316g() {
        Integer numMo12317h = mo12317h();
        if (numMo12317h != null) {
            return new g32(numMo12317h.intValue(), 9);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    Integer mo12317h();

    /* JADX INFO: renamed from: m */
    void mo12318m(Integer num);

    /* JADX INFO: renamed from: n */
    Integer mo12319n();

    /* JADX INFO: renamed from: o */
    Integer mo12320o();

    /* JADX INFO: renamed from: p */
    void mo12321p(Integer num);
}
