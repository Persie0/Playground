package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class np1 {

    /* JADX INFO: renamed from: a */
    public final tz1 f53086a;

    /* JADX INFO: renamed from: b */
    public final C3309ls f53087b;

    public np1(tz1 tz1Var, t33 t33Var) {
        this.f53086a = tz1Var;
        this.f53087b = new C3309ls(t33Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m17576a(String str) {
        C3309ls c3309ls = this.f53087b;
        synchronized (c3309ls) {
            if (!Objects.equals((String) c3309ls.f50065c, str)) {
                C3309ls.m16478G((t33) c3309ls.f50064b, str, (String) c3309ls.f50066d);
                c3309ls.f50065c = str;
            }
        }
    }
}
