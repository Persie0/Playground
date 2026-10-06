package p000;

import android.content.Context;
import android.net.Uri;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class liv {

    /* JADX INFO: renamed from: a */
    public final Object f38339a;

    public liv(int i) {
        opn[] opnVarArr = new opn[i];
        for (int i2 = 0; i2 < i; i2++) {
            opnVarArr[i2] = ook.m18796j(null);
        }
        this.f38339a = opnVarArr;
    }

    public liv(jon jonVar) {
        this.f38339a = jonVar;
    }

    public liv(lnk lnkVar) {
        this.f38339a = lnkVar;
    }

    public liv(mos mosVar) {
        this.f38339a = mosVar;
    }

    public liv(mpv mpvVar) {
        this.f38339a = mpvVar;
    }

    public liv(nxb nxbVar) {
        Charset charset = nxz.f44985a;
        this.f38339a = nxbVar;
        nxbVar.f44894f = this;
    }

    private liv(oaj oajVar, Object obj, oaj oajVar2, Object obj2) {
        this.f38339a = new ktz(oajVar, obj, oajVar2, obj2);
    }

    public liv(oju ojuVar) {
        ojuVar.getClass();
        this.f38339a = ojuVar;
    }

    public liv(C1117xf c1117xf) {
        this.f38339a = c1117xf;
    }

    /* JADX INFO: renamed from: C */
    public static int m15472C(ktz ktzVar, Object obj, Object obj2) {
        return nxh.m18016a((oaj) ktzVar.f37201d, 1, obj) + nxh.m18016a((oaj) ktzVar.f37198a, 2, obj2);
    }

    /* JADX INFO: renamed from: D */
    public static void m15473D(nxb nxbVar, ktz ktzVar, Object obj, Object obj2) {
        nxh.m18017g(nxbVar, (oaj) ktzVar.f37201d, 1, obj);
        nxh.m18017g(nxbVar, (oaj) ktzVar.f37198a, 2, obj2);
    }

    /* JADX INFO: renamed from: E */
    public static liv m15474E(oaj oajVar, Object obj, oaj oajVar2, Object obj2) {
        return new liv(oajVar, obj, oajVar2, obj2);
    }

    /* JADX INFO: renamed from: F */
    private static nps m15475F(jpp jppVar) {
        return nnj.m17524j(lle.m15695o(jppVar), jdv.class, etv.f19882g, not.INSTANCE);
    }

    /* JADX INFO: renamed from: A */
    public final void m15476A(int i, int i2) {
        ((nxb) this.f38339a).mo17930B(i, i2);
    }

    /* JADX INFO: renamed from: B */
    public final void m15477B(int i, long j) {
        ((nxb) this.f38339a).mo17932D(i, j);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: a */
    public final lno m15478a(float f) {
        Random random = (Random) this.f38339a.get();
        random.getClass();
        return new lno(random, f);
    }

    /* JADX INFO: renamed from: b */
    public final nps m15479b(String str) {
        str.getClass();
        return m15475F(((jon) this.f38339a).m13409a(str));
    }

    /* JADX INFO: renamed from: c */
    public final nps m15480c(String str, String str2) {
        str2.getClass();
        return m15475F(((jon) this.f38339a).m13410b(str, str2).mo13448a(not.INSTANCE, new jpf() { // from class: lqb
            @Override // p000.jpf
            /* JADX INFO: renamed from: a */
            public final Object mo13389a(jpp jppVar) {
                lpz lpzVar;
                job jobVar = (job) jppVar.mo13450c();
                nxl nxlVarM18137O = lpy.f38931i.m18137O();
                String str3 = jobVar.f34441a;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                lpy lpyVar = (lpy) nxqVar;
                str3.getClass();
                int i = 1;
                lpyVar.f38933a |= 1;
                lpyVar.f38934b = str3;
                String str4 = jobVar.f34443c;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                lpy lpyVar2 = (lpy) nxqVar2;
                str4.getClass();
                int i2 = 4;
                lpyVar2.f38933a |= 4;
                lpyVar2.f38936d = str4;
                boolean z = jobVar.f34446f;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar3 = nxlVarM18137O.f44974b;
                lpy lpyVar3 = (lpy) nxqVar3;
                lpyVar3.f38933a |= 8;
                lpyVar3.f38939g = z;
                long j = jobVar.f34447g;
                if (!nxqVar3.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                lpy lpyVar4 = (lpy) nxlVarM18137O.f44974b;
                lpyVar4.f38933a |= 16;
                lpyVar4.f38940h = j;
                byte[] bArr = jobVar.f34442b;
                if (bArr != null) {
                    nwr nwrVarM17799u = nwr.m17799u(bArr);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    lpy lpyVar5 = (lpy) nxlVarM18137O.f44974b;
                    lpyVar5.f38933a |= 2;
                    lpyVar5.f38935c = nwrVarM17799u;
                }
                joa[] joaVarArr = jobVar.f34444d;
                int length = joaVarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    joa joaVar = joaVarArr[i3];
                    jof[] jofVarArr = joaVar.f34438b;
                    int length2 = jofVarArr.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        jof jofVar = jofVarArr[i4];
                        int i5 = jofVar.f34472g;
                        switch (i5) {
                            case 1:
                                nxl nxlVarM18137O2 = lpz.f38941e.m18137O();
                                String str5 = jofVar.f34466a;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nxq nxqVar4 = nxlVarM18137O2.f44974b;
                                lpz lpzVar2 = (lpz) nxqVar4;
                                str5.getClass();
                                lpzVar2.f38943a |= 1;
                                lpzVar2.f38946d = str5;
                                if (jofVar.f34472g != 1) {
                                    throw new IllegalArgumentException("Not a long type");
                                }
                                long j2 = jofVar.f34467b;
                                if (!nxqVar4.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                lpz lpzVar3 = (lpz) nxlVarM18137O2.f44974b;
                                lpzVar3.f38944b = 1;
                                lpzVar3.f38945c = Long.valueOf(j2);
                                lpzVar = (lpz) nxlVarM18137O2.mo18103l();
                                break;
                                break;
                            case 2:
                                nxl nxlVarM18137O3 = lpz.f38941e.m18137O();
                                String str6 = jofVar.f34466a;
                                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                nxq nxqVar5 = nxlVarM18137O3.f44974b;
                                lpz lpzVar4 = (lpz) nxqVar5;
                                str6.getClass();
                                lpzVar4.f38943a |= 1;
                                lpzVar4.f38946d = str6;
                                if (jofVar.f34472g != 2) {
                                    throw new IllegalArgumentException("Not a boolean type");
                                }
                                boolean z2 = jofVar.f34468c;
                                if (!nxqVar5.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                lpz lpzVar5 = (lpz) nxlVarM18137O3.f44974b;
                                lpzVar5.f38944b = 2;
                                lpzVar5.f38945c = Boolean.valueOf(z2);
                                lpzVar = (lpz) nxlVarM18137O3.mo18103l();
                                break;
                                break;
                            case 3:
                                nxl nxlVarM18137O4 = lpz.f38941e.m18137O();
                                String str7 = jofVar.f34466a;
                                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                    nxlVarM18137O4.mo18106p();
                                }
                                nxq nxqVar6 = nxlVarM18137O4.f44974b;
                                lpz lpzVar6 = (lpz) nxqVar6;
                                str7.getClass();
                                lpzVar6.f38943a |= i;
                                lpzVar6.f38946d = str7;
                                if (jofVar.f34472g != 3) {
                                    throw new IllegalArgumentException("Not a double type");
                                }
                                double d = jofVar.f34469d;
                                if (!nxqVar6.m18142ac()) {
                                    nxlVarM18137O4.mo18106p();
                                }
                                lpz lpzVar7 = (lpz) nxlVarM18137O4.f44974b;
                                lpzVar7.f38944b = 3;
                                lpzVar7.f38945c = Double.valueOf(d);
                                lpzVar = (lpz) nxlVarM18137O4.mo18103l();
                                break;
                                break;
                            case 4:
                                nxl nxlVarM18137O5 = lpz.f38941e.m18137O();
                                String str8 = jofVar.f34466a;
                                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                                    nxlVarM18137O5.mo18106p();
                                }
                                lpz lpzVar8 = (lpz) nxlVarM18137O5.f44974b;
                                str8.getClass();
                                lpzVar8.f38943a |= i;
                                lpzVar8.f38946d = str8;
                                if (jofVar.f34472g != i2) {
                                    throw new IllegalArgumentException("Not a String type");
                                }
                                String str9 = jofVar.f34470e;
                                jib.m13205j(str9);
                                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                                    nxlVarM18137O5.mo18106p();
                                }
                                lpz lpzVar9 = (lpz) nxlVarM18137O5.f44974b;
                                lpzVar9.f38944b = i2;
                                lpzVar9.f38945c = str9;
                                lpzVar = (lpz) nxlVarM18137O5.mo18103l();
                                break;
                                break;
                            case 5:
                                nxl nxlVarM18137O6 = lpz.f38941e.m18137O();
                                String str10 = jofVar.f34466a;
                                if (!nxlVarM18137O6.f44974b.m18142ac()) {
                                    nxlVarM18137O6.mo18106p();
                                }
                                lpz lpzVar10 = (lpz) nxlVarM18137O6.f44974b;
                                str10.getClass();
                                lpzVar10.f38943a |= i;
                                lpzVar10.f38946d = str10;
                                if (jofVar.f34472g != 5) {
                                    throw new IllegalArgumentException("Not a bytes type");
                                }
                                byte[] bArr2 = jofVar.f34471f;
                                jib.m13205j(bArr2);
                                nwr nwrVarM17799u2 = nwr.m17799u(bArr2);
                                if (!nxlVarM18137O6.f44974b.m18142ac()) {
                                    nxlVarM18137O6.mo18106p();
                                }
                                lpz lpzVar11 = (lpz) nxlVarM18137O6.f44974b;
                                lpzVar11.f38944b = 5;
                                lpzVar11.f38945c = nwrVarM17799u2;
                                lpzVar = (lpz) nxlVarM18137O6.mo18103l();
                                break;
                                break;
                            default:
                                throw new IllegalArgumentException("Unrecognized flag type: " + i5);
                        }
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        lpy lpyVar6 = (lpy) nxlVarM18137O.f44974b;
                        lpzVar.getClass();
                        nxy nxyVar = lpyVar6.f38937e;
                        if (!nxyVar.mo17770c()) {
                            lpyVar6.f38937e = nxq.m18127U(nxyVar);
                        }
                        lpyVar6.f38937e.add(lpzVar);
                        i4++;
                        i = 1;
                        i2 = 4;
                    }
                    String[] strArr = joaVar.f34439c;
                    if (strArr != null) {
                        for (String str11 : strArr) {
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            lpy lpyVar7 = (lpy) nxlVarM18137O.f44974b;
                            str11.getClass();
                            nxy nxyVar2 = lpyVar7.f38938f;
                            if (!nxyVar2.mo17770c()) {
                                lpyVar7.f38938f = nxq.m18127U(nxyVar2);
                            }
                            lpyVar7.f38938f.add(str11);
                        }
                    }
                    i3++;
                    i = 1;
                    i2 = 4;
                }
                return (lpy) nxlVarM18137O.mo18103l();
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public final String m15481d(Uri uri, String str, String str2) {
        if (uri == null) {
            return null;
        }
        C1117xf c1117xf = (C1117xf) ((C1117xf) this.f38339a).get(uri.toString());
        if (c1117xf == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) c1117xf.get(str2);
    }

    /* JADX INFO: renamed from: e */
    public final int m15482e() {
        long j = ((oxr) ((opn) this.f38339a).f46397a).f46788b.f46394b;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: f */
    public final Object m15483f() {
        Object obj = this.f38339a;
        while (true) {
            oxr oxrVar = (oxr) ((opn) obj).f46397a;
            Object objM19147b = oxrVar.m19147b();
            if (objM19147b != oxr.f46787a) {
                return objM19147b;
            }
            ((opn) this.f38339a).m18856d(oxrVar, oxrVar.m19148c());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15484g() {
        Object obj = this.f38339a;
        while (true) {
            oxr oxrVar = (oxr) ((opn) obj).f46397a;
            if (oxrVar.m19149d()) {
                return;
            }
            ((opn) this.f38339a).m18856d(oxrVar, oxrVar.m19148c());
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15485h(Object obj) {
        Object obj2 = this.f38339a;
        while (true) {
            oxr oxrVar = (oxr) ((opn) obj2).f46397a;
            switch (oxrVar.m19146a(obj)) {
                case 0:
                    return true;
                case 1:
                    ((opn) this.f38339a).m18856d(oxrVar, oxrVar.m19148c());
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final opn m15486i(int i) {
        return ((opn[]) this.f38339a)[i];
    }

    /* JADX INFO: renamed from: j */
    public final void m15487j(int i, boolean z) {
        ((nxb) this.f38339a).mo17945l(i, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m15488k(int i, nwr nwrVar) {
        ((nxb) this.f38339a).mo17946m(i, nwrVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m15489l(int i, double d) {
        ((nxb) this.f38339a).m17999ak(i, d);
    }

    /* JADX INFO: renamed from: m */
    public final void m15490m(int i, int i2) {
        ((nxb) this.f38339a).mo17952s(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m15491n(int i, int i2) {
        ((nxb) this.f38339a).mo17948o(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public final void m15492o(int i, long j) {
        ((nxb) this.f38339a).mo17950q(i, j);
    }

    /* JADX INFO: renamed from: p */
    public final void m15493p(int i, float f) {
        ((nxb) this.f38339a).m18001am(i, f);
    }

    /* JADX INFO: renamed from: q */
    public final void m15494q(int i, Object obj, nzm nzmVar) {
        nxb nxbVar = (nxb) this.f38339a;
        nxbVar.mo17929A(i, 3);
        nzmVar.mo18256l((nyw) obj, nxbVar.f44894f);
        nxbVar.mo17929A(i, 4);
    }

    /* JADX INFO: renamed from: r */
    public final void m15495r(int i, int i2) {
        ((nxb) this.f38339a).mo17952s(i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m15496s(int i, long j) {
        ((nxb) this.f38339a).mo17932D(i, j);
    }

    /* JADX INFO: renamed from: t */
    public final void m15497t(int i, Object obj, nzm nzmVar) {
        ((nxb) this.f38339a).mo17954u(i, (nyw) obj, nzmVar);
    }

    /* JADX INFO: renamed from: u */
    public final void m15498u(int i, Object obj) {
        if (obj instanceof nwr) {
            ((nxb) this.f38339a).mo17957x(i, (nwr) obj);
        } else {
            ((nxb) this.f38339a).mo17956w(i, (nyw) obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m15499v(int i, int i2) {
        ((nxb) this.f38339a).mo17948o(i, i2);
    }

    /* JADX INFO: renamed from: w */
    public final void m15500w(int i, long j) {
        ((nxb) this.f38339a).mo17950q(i, j);
    }

    /* JADX INFO: renamed from: x */
    public final void m15501x(int i, int i2) {
        ((nxb) this.f38339a).m18004ap(i, i2);
    }

    /* JADX INFO: renamed from: y */
    public final void m15502y(int i, long j) {
        ((nxb) this.f38339a).m18006ar(i, j);
    }

    /* JADX INFO: renamed from: z */
    public final void m15503z(int i, String str) {
        ((nxb) this.f38339a).mo17958y(i, str);
    }

    public liv(byte[] bArr) {
        this.f38339a = ook.m18796j(new oxr(8, false));
    }

    public liv() {
        this((byte[]) null);
    }

    public liv(Context context) {
        ArrayList arrayList = new ArrayList(pbn.m19303c(context));
        if (arrayList.isEmpty()) {
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((pbn) it.next()).m19308d()) {
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new C1143ye(12));
            pbn pbnVar = (pbn) arrayList.get(0);
            int i = pbm.f47337a;
            Object obj = pbnVar.m19309e().f38339a;
            throw null;
        }
        throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
    }
}
