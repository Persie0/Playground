package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwk implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jwl f34952a;

    /* JADX INFO: renamed from: b */
    private final int f34953b;

    public jwk(jwl jwlVar, int i) {
        this.f34952a = jwlVar;
        this.f34953b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        this.f34952a.f34955b.set(this.f34953b, obj);
        jwl jwlVar = this.f34952a;
        if (!jwlVar.f34954a) {
            Iterator it = jwlVar.f34955b.iterator();
            do {
                if (!it.hasNext()) {
                    this.f34952a.f34954a = true;
                    break;
                }
            } while (it.next() != null);
        }
        jwl jwlVar2 = this.f34952a;
        if (jwlVar2.f34954a) {
            this.f34952a.f34957d.execute(new jpm(this, mws.m17095j(jwlVar2.f34955b), 11));
        }
    }
}
