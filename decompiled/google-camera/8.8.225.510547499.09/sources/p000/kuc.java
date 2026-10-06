package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuc {

    /* JADX INFO: renamed from: a */
    private final ktz f37207a;

    /* JADX INFO: renamed from: b */
    private final kts f37208b;

    /* JADX INFO: renamed from: c */
    private final ksr f37209c;

    /* JADX INFO: renamed from: d */
    private final int f37210d;

    /* JADX INFO: renamed from: e */
    private final int f37211e;

    /* JADX INFO: renamed from: f */
    private final ArrayDeque f37212f;

    /* JADX INFO: renamed from: g */
    private final nax f37213g;

    public kuc(nax naxVar, ktz ktzVar, kts ktsVar, ksr ksrVar, int i, int i2, ArrayDeque arrayDeque, byte[] bArr, byte[] bArr2) {
        this.f37213g = naxVar;
        this.f37207a = ktzVar;
        this.f37208b = ktsVar;
        this.f37209c = ksrVar;
        this.f37210d = i;
        this.f37211e = i2;
        this.f37212f = arrayDeque;
    }

    /* JADX INFO: renamed from: a */
    public final void m14884a(nxn nxnVar) {
        if ((((obf) nxnVar.f44974b).f45247a & 64) == 0) {
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            obf obfVar = (obf) nxnVar.f44974b;
            obfVar.f45254h = lij.m15407P(2);
            obfVar.f45247a |= 64;
        }
        Throwable th = (Throwable) this.f37209c.f37127b.mo16811e(new Throwable());
        String strM14862a = kua.m14862a(th);
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar2 = (obf) nxnVar.f44974b;
        strM14862a.getClass();
        obfVar2.f45247a |= 2048;
        obfVar2.f45258m = strM14862a;
        obf obfVar3 = (obf) nxnVar.mo18103l();
        if (this.f37207a.m14850b(obfVar3)) {
            this.f37208b.mo14842a(obfVar3, mrm.m16829i(th));
        }
    }

    /* JADX INFO: renamed from: b */
    public final nxn m14885b(int i) {
        nxn nxnVar = (nxn) obf.f45245n.m18137O();
        String packageName = this.f37209c.f37126a.getPackageName();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar = (obf) nxnVar.f44974b;
        packageName.getClass();
        obfVar.f45247a |= 1;
        obfVar.f45248b = packageName;
        int iM17235f = this.f37213g.m17235f(this.f37209c.f37126a);
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar2 = (obf) nxnVar.f44974b;
        obfVar2.f45247a |= 2;
        obfVar2.f45249c = iM17235f;
        long j = this.f37210d;
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar3 = (obf) nxnVar.f44974b;
        obfVar3.f45247a |= 4;
        obfVar3.f45250d = j;
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar4 = (obf) nxnVar.f44974b;
        obfVar4.f45247a |= 8;
        obfVar4.f45251e = -2032180703L;
        long j2 = this.f37211e;
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar5 = (obf) nxnVar.f44974b;
        obfVar5.f45247a |= 16;
        obfVar5.f45252f = j2;
        mwn mwnVarM17090e = mws.m17090e();
        Iterator itDescendingIterator = this.f37212f.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            mwnVarM17090e.m17082g(Long.valueOf(((ksy) itDescendingIterator.next()).f37148d));
        }
        mws mwsVarM17081f = mwnVarM17090e.m17081f();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar6 = (obf) nxnVar.f44974b;
        obfVar6.m18400f();
        nwb.m17749e(mwsVarM17081f, obfVar6.f45257k);
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        obf obfVar7 = (obf) nxnVar.f44974b;
        obfVar7.f45254h = lij.m15407P(i);
        obfVar7.f45247a |= 64;
        return nxnVar;
    }
}
