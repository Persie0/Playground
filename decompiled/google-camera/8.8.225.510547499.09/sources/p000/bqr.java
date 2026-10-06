package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqr implements bqn {

    /* JADX INFO: renamed from: b */
    public final C1109wy f4198b = new caw();

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C1109wy c1109wy = this.f4198b;
            if (i >= c1109wy.f48004d) {
                return;
            }
            bqq bqqVar = (bqq) c1109wy.m19559d(i);
            Object objM19560g = this.f4198b.m19560g(i);
            bqp bqpVar = bqqVar.f4195b;
            if (bqqVar.f4197d == null) {
                bqqVar.f4197d = bqqVar.f4196c.getBytes(bqn.f4192a);
            }
            bqpVar.mo2923a(bqqVar.f4197d, objM19560g, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2927b(bqq bqqVar) {
        return this.f4198b.containsKey(bqqVar) ? this.f4198b.get(bqqVar) : bqqVar.f4194a;
    }

    /* JADX INFO: renamed from: c */
    public final void m2928c(bqr bqrVar) {
        this.f4198b.mo3368i(bqrVar.f4198b);
    }

    /* JADX INFO: renamed from: d */
    public final void m2929d(bqq bqqVar, Object obj) {
        this.f4198b.put(bqqVar, obj);
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof bqr) {
            return this.f4198b.equals(((bqr) obj).f4198b);
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return this.f4198b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f4198b.toString() + "}";
    }
}
