package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gup implements inp {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f26446a;

    public gup(int i) {
        this.f26446a = i;
    }

    @Override // p000.inp
    /* JADX INFO: renamed from: a */
    public final boolean mo6844a(naf nafVar) {
        switch (this.f26446a) {
            case 0:
                if (nafVar.isEmpty()) {
                    return false;
                }
                return nafVar.size() > 150 || ((Long) nafVar.mo16929k().mo17162b()).longValue() - ((Long) nafVar.mo16928j().mo17162b()).longValue() > TimeUnit.SECONDS.toNanos(5L);
            default:
                return false;
        }
    }
}
