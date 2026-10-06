package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcj {

    /* JADX INFO: renamed from: a */
    public final kbo f35569a;

    /* JADX INFO: renamed from: b */
    public final Set f35570b = new HashSet();

    /* JADX INFO: renamed from: c */
    public volatile int f35571c = 1;

    /* JADX INFO: renamed from: d */
    private final Executor f35572d;

    public kcj(kbo kboVar, Executor executor) {
        this.f35569a = kboVar.mo6314a("AudioRestrictApi");
        this.f35572d = kxk.m14956B(executor);
    }

    /* JADX INFO: renamed from: a */
    public final void m13975a(int i) {
        this.f35572d.execute(new gdi(this, i, 5));
    }

    /* JADX INFO: renamed from: b */
    public final void m13976b(kdr kdrVar) {
        this.f35572d.execute(new jpm(this, kdrVar, 19));
    }

    /* JADX INFO: renamed from: c */
    public final void m13977c(kdr kdrVar) {
        this.f35572d.execute(new jpm(this, kdrVar, 20));
    }
}
