package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nza implements nzm {

    /* JADX INFO: renamed from: a */
    private final nyw f45055a;

    /* JADX INFO: renamed from: b */
    private final boolean f45056b;

    /* JADX INFO: renamed from: c */
    private final lij f45057c;

    private nza(lij lijVar, nyw nywVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f45057c = lijVar;
        this.f45056b = nywVar instanceof nxo;
        this.f45055a = nywVar;
    }

    /* JADX INFO: renamed from: c */
    static nza m18258c(lij lijVar, ntw ntwVar, nyw nywVar) {
        return new nza(lijVar, nywVar, null, null, null);
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: a */
    public final int mo18246a(Object obj) {
        nzy nzyVarM15423af = lij.m15423af(obj);
        int iM17982aa = nzyVarM15423af.f45109e;
        if (iM17982aa == -1) {
            iM17982aa = 0;
            for (int i = 0; i < nzyVarM15423af.f45106b; i++) {
                int iM18386a = oal.m18386a(nzyVarM15423af.f45107c[i]);
                int iM17962G = nxb.m17962G(3, (nwr) nzyVarM15423af.f45108d[i]);
                int iM17981Z = nxb.m17981Z(1);
                iM17982aa += iM17981Z + iM17981Z + nxb.m17982aa(2, iM18386a) + iM17962G;
            }
            nzyVarM15423af.f45109e = iM17982aa;
        }
        if (!this.f45056b) {
            return iM17982aa;
        }
        nxh nxhVarM17734t = ntw.m17734t(obj);
        int iM18021b = 0;
        for (int i2 = 0; i2 < nxhVarM17734t.f44911b.m18322a(); i2++) {
            iM18021b += nxhVarM17734t.m18021b(nxhVarM17734t.f44911b.m18326f(i2));
        }
        Iterator it = nxhVarM17734t.f44911b.m18323c().iterator();
        while (it.hasNext()) {
            iM18021b += nxhVarM17734t.m18021b((Map.Entry) it.next());
        }
        return iM17982aa + iM18021b;
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: b */
    public final int mo18247b(Object obj) {
        int iHashCode = lij.m15423af(obj).hashCode();
        return this.f45056b ? (iHashCode * 53) + ntw.m17734t(obj).hashCode() : iHashCode;
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: e */
    public final Object mo18249e() {
        nyw nywVar = this.f45055a;
        return nywVar instanceof nxq ? ((nxq) nywVar).m18138P() : nywVar.mo17761bg().mo18104m();
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: f */
    public final void mo18250f(Object obj) {
        lij.m15426ai(obj);
        ntw.m17737w(obj);
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: g */
    public final void mo18251g(Object obj, Object obj2) {
        nzn.m18269B(obj, obj2);
        if (this.f45056b) {
            nzn.m18268A(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, nyw] */
    @Override // p000.nzm
    /* JADX INFO: renamed from: h */
    public final void mo18252h(Object obj, nzi nziVar, nxf nxfVar) {
        boolean zMo17901P;
        lij lijVar = this.f45057c;
        Object objM15425ah = lij.m15425ah(obj);
        nxh nxhVarM17735u = ntw.m17735u(obj);
        while (nziVar.mo17904c() != Integer.MAX_VALUE) {
            try {
                int i = ((nwx) nziVar).f44881b;
                if (i != oal.f45162a) {
                    if (oal.m18387b(i) == 2) {
                        ktz ktzVarMo18013c = nxfVar.mo18013c(this.f45055a, oal.m18386a(i));
                        if (ktzVarMo18013c != null) {
                            ntw.m17736v(nziVar, ktzVarMo18013c, nxfVar, nxhVarM17735u);
                        } else {
                            zMo17901P = lijVar.m15458ac(objM15425ah, nziVar);
                        }
                    } else {
                        zMo17901P = nziVar.mo17901P();
                    }
                    if (!zMo17901P) {
                        break;
                    }
                } else {
                    ktz ktzVarMo18013c2 = null;
                    nwr nwrVarMo17916o = null;
                    int iMo17910i = 0;
                    while (nziVar.mo17904c() != Integer.MAX_VALUE) {
                        int i2 = ((nwx) nziVar).f44881b;
                        if (i2 == oal.f45164c) {
                            iMo17910i = nziVar.mo17910i();
                            ktzVarMo18013c2 = nxfVar.mo18013c(this.f45055a, iMo17910i);
                        } else if (i2 == oal.f45165d) {
                            if (ktzVarMo18013c2 != null) {
                                ntw.m17736v(nziVar, ktzVarMo18013c2, nxfVar, nxhVarM17735u);
                            } else {
                                nwrVarMo17916o = nziVar.mo17916o();
                            }
                        } else if (!nziVar.mo17901P()) {
                            break;
                        }
                    }
                    if (((nwx) nziVar).f44881b != oal.f45163b) {
                        throw nyb.m18160b();
                    }
                    if (nwrVarMo17916o != null) {
                        if (ktzVarMo18013c2 != null) {
                            nyv nyvVarMo17761bg = ktzVarMo18013c2.f37200c.mo17761bg();
                            nww nwwVarMo17791l = nwrVarMo17916o.mo17791l();
                            nyvVarMo17761bg.mo17754f(nwwVarMo17791l, nxfVar);
                            nxhVarM17735u.m18029l((nxp) ktzVarMo18013c2.f37201d, nyvVarMo17761bg.mo18104m());
                            nwwVarMo17791l.mo17839z(0);
                        } else {
                            lij.m15421ad(objM15425ah, iMo17910i, nwrVarMo17916o);
                        }
                    }
                }
            } catch (Throwable th) {
                lij.m15424ag(obj, (nzy) objM15425ah);
                throw th;
            }
        }
        lij.m15424ag(obj, (nzy) objM15425ah);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0077. Please report as an issue. */
    @Override // p000.nzm
    /* JADX INFO: renamed from: i */
    public final void mo18253i(Object obj, byte[] bArr, int i, int i2, nwh nwhVar) throws nyb {
        nxq nxqVar = (nxq) obj;
        nzy nzyVarM18329b = nxqVar.f44981aJ;
        if (nzyVarM18329b == nzy.f45105a) {
            nzyVarM18329b = nzy.m18329b();
            nxqVar.f44981aJ = nzyVarM18329b;
        }
        nxh nxhVarM18120c = ((nxo) obj).m18120c();
        ktz ktzVarMo18013c = null;
        while (i < i2) {
            int iM17701J = ntw.m17701J(bArr, i, nwhVar);
            int i3 = nwhVar.f44826a;
            if (i3 == oal.f45162a) {
                int i4 = 0;
                nwr nwrVar = null;
                while (iM17701J < i2) {
                    iM17701J = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i5 = nwhVar.f44826a;
                    int iM18386a = oal.m18386a(i5);
                    int iM18387b = oal.m18387b(i5);
                    switch (iM18386a) {
                        case 2:
                            if (iM18387b == 0) {
                                iM17701J = ntw.m17701J(bArr, iM17701J, nwhVar);
                                i4 = nwhVar.f44826a;
                                ktzVarMo18013c = nwhVar.f44829d.mo18013c(this.f45055a, i4);
                            } else if (i5 != oal.f45163b) {
                                iM17701J = ntw.m17707P(i5, bArr, iM17701J, i2, nwhVar);
                            }
                            break;
                        case 3:
                            if (ktzVarMo18013c != null) {
                                iM17701J = ntw.m17695D(nzf.f45060a.m18259a(ktzVarMo18013c.f37200c.getClass()), bArr, iM17701J, i2, nwhVar);
                                nxhVarM18120c.m18029l((nxp) ktzVarMo18013c.f37201d, nwhVar.f44828c);
                            } else if (iM18387b == 2) {
                                iM17701J = ntw.m17692A(bArr, iM17701J, nwhVar);
                                nwrVar = (nwr) nwhVar.f44828c;
                            } else if (i5 != oal.f45163b) {
                                iM17701J = ntw.m17707P(i5, bArr, iM17701J, i2, nwhVar);
                            }
                            break;
                        default:
                            if (i5 != oal.f45163b) {
                                iM17701J = ntw.m17707P(i5, bArr, iM17701J, i2, nwhVar);
                            }
                            break;
                    }
                    if (nwrVar != null) {
                        nzyVarM18329b.m18334f(oal.m18388c(i4, 2), nwrVar);
                    }
                    i = iM17701J;
                }
                if (nwrVar != null) {
                    nzyVarM18329b.m18334f(oal.m18388c(i4, 2), nwrVar);
                }
                i = iM17701J;
            } else if (oal.m18387b(i3) == 2) {
                ktz ktzVarMo18013c2 = nwhVar.f44829d.mo18013c(this.f45055a, oal.m18386a(i3));
                if (ktzVarMo18013c2 != null) {
                    i = ntw.m17695D(nzf.f45060a.m18259a(ktzVarMo18013c2.f37200c.getClass()), bArr, iM17701J, i2, nwhVar);
                    nxhVarM18120c.m18029l((nxp) ktzVarMo18013c2.f37201d, nwhVar.f44828c);
                    ktzVarMo18013c = ktzVarMo18013c2;
                } else {
                    i = ntw.m17700I(i3, bArr, iM17701J, i2, nzyVarM18329b, nwhVar);
                    ktzVarMo18013c = ktzVarMo18013c2;
                }
            } else {
                i = ntw.m17707P(i3, bArr, iM17701J, i2, nwhVar);
            }
        }
        if (i != i2) {
            throw nyb.m18165g();
        }
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: j */
    public final boolean mo18254j(Object obj, Object obj2) {
        if (!lij.m15423af(obj).equals(lij.m15423af(obj2))) {
            return false;
        }
        if (this.f45056b) {
            return ntw.m17734t(obj).equals(ntw.m17734t(obj2));
        }
        return true;
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: k */
    public final boolean mo18255k(Object obj) {
        return ntw.m17734t(obj).m18027i();
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: l */
    public final void mo18256l(Object obj, liv livVar) {
        Iterator itM18023d = ntw.m17734t(obj).m18023d();
        while (itM18023d.hasNext()) {
            Map.Entry entry = (Map.Entry) itM18023d.next();
            nxp nxpVar = (nxp) entry.getKey();
            if (nxpVar.m18122a() != oak.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof nye) {
                livVar.m15498u(nxpVar.f44977a, ((nyg) ((nye) entry).f45016a.getValue()).m18171a());
            } else {
                livVar.m15498u(nxpVar.f44977a, entry.getValue());
            }
        }
        nzy nzyVarM15423af = lij.m15423af(obj);
        for (int i = 0; i < nzyVarM15423af.f45106b; i++) {
            livVar.m15498u(oal.m18386a(nzyVarM15423af.f45107c[i]), nzyVarM15423af.f45108d[i]);
        }
    }
}
