package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rfa {

    /* JADX INFO: renamed from: a */
    public qfa f59209a;

    /* JADX INFO: renamed from: b */
    public qfa f59210b;

    /* JADX INFO: renamed from: c */
    public int f59211c;

    /* JADX INFO: renamed from: d */
    public Long f59212d;

    /* JADX INFO: renamed from: e */
    public boolean f59213e;

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX INFO: renamed from: a */
    public final void m20647a(vv9 vv9Var) {
        qfa qfaVar;
        vv9 vv9Var2;
        this.f59213e = false;
        qfa qfaVar2 = this.f59209a;
        if (fa4.m11650l(vv9Var, qfaVar2 != null ? (vv9) qfaVar2.f57706b : null)) {
            return;
        }
        String str = vv9Var.f65990a.f54604b;
        qfa qfaVar3 = this.f59209a;
        boolean zM11650l = fa4.m11650l(str, (qfaVar3 == null || (vv9Var2 = (vv9) qfaVar3.f57706b) == null) ? null : vv9Var2.f65990a.f54604b);
        qfa qfaVar4 = this.f59209a;
        if (zM11650l) {
            if (qfaVar4 != null) {
                qfaVar4.f57706b = vv9Var;
                return;
            }
            return;
        }
        this.f59209a = new qfa(qfaVar4, vv9Var);
        this.f59210b = null;
        int length = vv9Var.f65990a.f54604b.length() + this.f59211c;
        this.f59211c = length;
        if (length > 100000) {
            qfa qfaVar5 = this.f59209a;
            if ((qfaVar5 != null ? (qfa) qfaVar5.f57705a : null) == null) {
                return;
            }
            while (true) {
                if (qfaVar5 == null) {
                    qfaVar = null;
                } else {
                    qfa qfaVar6 = (qfa) qfaVar5.f57705a;
                    if (qfaVar6 != null) {
                        qfaVar = (qfa) qfaVar6.f57705a;
                    } else {
                        qfaVar = null;
                    }
                }
                if (qfaVar == null) {
                    break;
                } else {
                    qfaVar5 = (qfa) qfaVar5.f57705a;
                }
            }
            if (qfaVar5 != null) {
                qfaVar5.f57705a = null;
            }
        }
    }
}
