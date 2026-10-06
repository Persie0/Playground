package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzh implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Set f23971a;

    /* JADX INFO: renamed from: c */
    public final fzf f23973c;

    /* JADX INFO: renamed from: b */
    public final List f23972b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List f23974d = new ArrayList();

    public fzh(Set set, fzf fzfVar) {
        this.f23971a = set;
        this.f23973c = fzfVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        kxk.m14975U(jvh.m13559g(kxk.m14961G(this.f23972b), kxk.m14961G(this.f23974d), new fzg(this)), new cmo(this, 13), not.INSTANCE);
    }
}
