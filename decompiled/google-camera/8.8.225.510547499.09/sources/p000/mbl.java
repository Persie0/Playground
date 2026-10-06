package p000;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbl {

    /* JADX INFO: renamed from: a */
    public final oju f39816a;

    /* JADX INFO: renamed from: b */
    public final oju f39817b;

    /* JADX INFO: renamed from: c */
    public final Object f39818c;

    /* JADX INFO: renamed from: d */
    public final Object f39819d;

    /* JADX INFO: renamed from: e */
    public final Object f39820e;

    /* JADX INFO: renamed from: f */
    public final Object f39821f;

    /* JADX INFO: renamed from: g */
    public final Object f39822g;

    /* JADX INFO: renamed from: h */
    public final Object f39823h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, oju] */
    public mbl(ljd ljdVar, oju ojuVar, lha lhaVar, lie lieVar, oju ojuVar2, mrm mrmVar, mrm mrmVar2, Executor executor, ohb ohbVar, oju ojuVar3, byte[] bArr, byte[] bArr2) {
        this.f39818c = ljdVar;
        this.f39820e = lhaVar;
        this.f39816a = ojuVar;
        this.f39821f = executor;
        this.f39817b = new doy(ojuVar2, 7);
        Context contextM6830a = ((dws) lieVar.f38294a).m6830a();
        Executor executor2 = (Executor) lieVar.f38296c.get();
        executor2.getClass();
        Object obj = lieVar.f38297d.get();
        ((Boolean) lieVar.f38295b.get()).booleanValue();
        this.f39823h = new lnt(contextM6830a, executor2, (lnw) obj, ohbVar, true, ojuVar3);
        this.f39819d = mrmVar;
        this.f39822g = mrmVar2;
    }

    /* JADX INFO: renamed from: a */
    public final long m16297a(String str) {
        if (((lha) this.f39820e).f38250a) {
            return -1L;
        }
        lnt lntVar = (lnt) this.f39823h;
        lns lnsVar = lntVar.f38781d;
        int iIntValue = ((Integer) lnsVar.f38773b.get()).intValue();
        if (iIntValue == 0) {
            return -1L;
        }
        if (iIntValue != Integer.MAX_VALUE) {
            synchronized (lnsVar.f38772a) {
                if (lnsVar.f38775d >= iIntValue) {
                    long j = lnsVar.f38776e;
                    ksi ksiVar = lnsVar.f38774c;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return -1L;
                    }
                }
            }
        }
        boolean z = lntVar.f38780c;
        lnx lnxVar = lntVar.f38779b;
        if (z) {
            return lnxVar.mo15774a(str);
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: b */
    public final nps m16298b(final ljb ljbVar) {
        if (((lha) this.f39820e).f38250a) {
            return kxk.m14963I();
        }
        final byte[] bArr = null;
        return kxk.m14970P(new nol(ljbVar, bArr) { // from class: lje

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ljb f38367a;

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, msi] */
            /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object, msi] */
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                pas pasVarMo15775b;
                mbl mblVar = this.f38368b;
                ljb ljbVar2 = this.f38367a;
                if (ljbVar2.f38358g) {
                    nxl nxlVarM18137O = pas.f47269d.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    pas pasVar = (pas) nxlVarM18137O.f44974b;
                    pasVar.f47273c = 2;
                    pasVar.f47271a |= 4;
                    pasVarMo15775b = (pas) nxlVarM18137O.mo18103l();
                } else {
                    Long l = ljbVar2.f38357f;
                    lnt lntVar = (lnt) mblVar.f39823h;
                    boolean z = lntVar.f38780c;
                    lnx lnxVar = lntVar.f38779b;
                    pasVarMo15775b = z ? lnxVar.mo15775b(l) : lnxVar.m15778d();
                }
                if (pasVarMo15775b.f47272b == -1) {
                    return npp.f44031a;
                }
                lji ljiVar = (lji) mblVar.f39816a.get();
                pat patVar = ljbVar2.f38354c;
                nxl nxlVar = (nxl) patVar.m18143ad(5);
                nxlVar.m18108s(patVar);
                nxl nxlVarM18137O2 = pac.f47157g.m18137O();
                int i = ljiVar.f38383a;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                pac pacVar = (pac) nxqVar;
                pacVar.f47162d = i - 1;
                pacVar.f47159a |= 4;
                Object obj = ljiVar.f38385c;
                if (obj != null) {
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pac pacVar2 = (pac) nxlVarM18137O2.f44974b;
                    pacVar2.f47159a |= 1;
                    pacVar2.f47160b = (String) obj;
                }
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O2.f44974b;
                pac pacVar3 = (pac) nxqVar2;
                pacVar3.f47159a |= 8;
                pacVar3.f47163e = 506730610L;
                Object obj2 = ljiVar.f38387e;
                if (obj2 != null) {
                    if (!nxqVar2.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pac pacVar4 = (pac) nxlVarM18137O2.f44974b;
                    pacVar4.f47159a |= 2;
                    pacVar4.f47161c = (String) obj2;
                }
                Object obj3 = ljiVar.f38386d;
                if (obj3 != null) {
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pac pacVar5 = (pac) nxlVarM18137O2.f44974b;
                    pacVar5.f47159a |= 16;
                    pacVar5.f47164f = (String) obj3;
                }
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                pat patVar2 = (pat) nxlVar.f44974b;
                pac pacVar6 = (pac) nxlVarM18137O2.mo18103l();
                pat patVar3 = pat.f47274u;
                pacVar6.getClass();
                patVar2.f47291p = pacVar6;
                patVar2.f47276a |= 16777216;
                if (kuh.m14889d((Context) ljiVar.f38384b)) {
                    nxl nxlVarM18137O3 = paj.f47203d.m18137O();
                    long freeSpace = ((kui) ljiVar.f38388f).m14891a().getFreeSpace() / 1024;
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    paj pajVar = (paj) nxlVarM18137O3.f44974b;
                    pajVar.f47205a |= 1;
                    pajVar.f47206b = freeSpace;
                    long jLongValue = ((Long) ljiVar.f38389g.mo6051a()).longValue();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    paj pajVar2 = (paj) nxlVarM18137O3.f44974b;
                    pajVar2.f47205a |= 2;
                    pajVar2.f47207c = jLongValue;
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    pat patVar4 = (pat) nxlVar.f44974b;
                    paj pajVar3 = (paj) nxlVarM18137O3.mo18103l();
                    pajVar3.getClass();
                    patVar4.f47293r = pajVar3;
                    patVar4.f47276a |= 67108864;
                }
                ?? r4 = ljiVar.f38390h;
                RuntimeException runtimeException = null;
                String str = r4 == 0 ? null : ((lgp) r4.mo6051a()).f38223a;
                if (!TextUtils.isEmpty(str)) {
                    paa paaVar = patVar.f47295t;
                    if (paaVar == null) {
                        paaVar = paa.f47144c;
                    }
                    nxl nxlVar2 = (nxl) paaVar.m18143ad(5);
                    nxlVar2.m18108s(paaVar);
                    if (((paa) nxlVar2.f44974b).f47147b.isEmpty()) {
                        if (!nxlVar2.f44974b.m18142ac()) {
                            nxlVar2.mo18106p();
                        }
                        paa paaVar2 = (paa) nxlVar2.f44974b;
                        str.getClass();
                        paaVar2.f47146a |= 1;
                        paaVar2.f47147b = str;
                    } else {
                        String str2 = str + "::" + ((paa) nxlVar2.f44974b).f47147b;
                        if (!nxlVar2.f44974b.m18142ac()) {
                            nxlVar2.mo18106p();
                        }
                        paa paaVar3 = (paa) nxlVar2.f44974b;
                        paaVar3.f47146a |= 1;
                        paaVar3.f47147b = str2;
                    }
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    pat patVar5 = (pat) nxlVar.f44974b;
                    paa paaVar4 = (paa) nxlVar2.mo18103l();
                    paaVar4.getClass();
                    patVar5.f47295t = paaVar4;
                    patVar5.f47276a |= 268435456;
                }
                pat patVar6 = (pat) nxlVar.mo18103l();
                nxl nxlVar3 = (nxl) patVar6.m18143ad(5);
                nxlVar3.m18108s(patVar6);
                if (!nxlVar3.f44974b.m18142ac()) {
                    nxlVar3.mo18106p();
                }
                pat patVar7 = (pat) nxlVar3.f44974b;
                pasVarMo15775b.getClass();
                patVar7.f47288m = pasVarMo15775b;
                patVar7.f47276a |= 4194304;
                if (ljbVar2.f38359h != null && ((mrm) mblVar.f39819d).mo16813g()) {
                    int i2 = ljbVar2.f38360i;
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(arrayList, amx.f757u);
                    nxl nxlVarM18137O4 = pai.f47201a.m18137O();
                    int iMax = Math.max(arrayList.size() - i2, 0);
                    if (iMax < arrayList.size()) {
                        Object obj4 = ((lhz) arrayList.get(iMax)).f38277a;
                        throw null;
                    }
                    pai paiVar = (pai) nxlVarM18137O4.mo18103l();
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar8 = (pat) nxlVar3.f44974b;
                    paiVar.getClass();
                    patVar8.f47289n = paiVar;
                    patVar8.f47276a |= 8388608;
                }
                mrm mrmVar = (mrm) mblVar.f39822g;
                if (mrmVar.mo16813g()) {
                    mws mwsVarM15508a = ((liz) mrmVar.mo16809c()).m15508a();
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar9 = (pat) nxlVar3.f44974b;
                    nxy nxyVar = patVar9.f47290o;
                    if (!nxyVar.mo17770c()) {
                        patVar9.f47290o = nxq.m18127U(nxyVar);
                    }
                    nwb.m17749e(mwsVarM15508a, patVar9.f47290o);
                }
                String str3 = ljbVar2.f38352a;
                if (ljbVar2.f38353b) {
                    if (str3 != null) {
                        if (!nxlVar3.f44974b.m18142ac()) {
                            nxlVar3.mo18106p();
                        }
                        pat patVar10 = (pat) nxlVar3.f44974b;
                        patVar10.f47276a |= 4;
                        patVar10.f47279d = str3;
                    } else {
                        if (!nxlVar3.f44974b.m18142ac()) {
                            nxlVar3.mo18106p();
                        }
                        pat patVar11 = (pat) nxlVar3.f44974b;
                        patVar11.f47276a &= -5;
                        patVar11.f47279d = pat.f47274u.f47279d;
                    }
                } else if (str3 != null) {
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar12 = (pat) nxlVar3.f44974b;
                    patVar12.f47276a = 2 | patVar12.f47276a;
                    patVar12.f47278c = str3;
                } else {
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar13 = (pat) nxlVar3.f44974b;
                    patVar13.f47276a &= -3;
                    patVar13.f47278c = pat.f47274u.f47278c;
                }
                Object obj5 = mblVar.f39817b.get();
                ozk ozkVar = ljbVar2.f38355d;
                if (obj5 != null || ozkVar != null) {
                    if (obj5 != null && ozkVar != null) {
                        nxq nxqVar3 = (nxq) obj5;
                        nxl nxlVar4 = (nxl) nxqVar3.m18143ad(5);
                        nxlVar4.m18108s(nxqVar3);
                        nxn nxnVar = (nxn) nxlVar4;
                        nxnVar.m18108s(ozkVar);
                        obj5 = (ozk) nxnVar.mo18103l();
                    } else if (obj5 == null) {
                        ozkVar.getClass();
                        obj5 = ozkVar;
                    }
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar14 = (pat) nxlVar3.f44974b;
                    obj5.getClass();
                    patVar14.f47294s = (ozk) obj5;
                    patVar14.f47276a |= 134217728;
                }
                String str4 = ljbVar2.f38356e;
                if (str4 != null) {
                    nxl nxlVarM18137O5 = paa.f47144c.m18137O();
                    if (!nxlVarM18137O5.f44974b.m18142ac()) {
                        nxlVarM18137O5.mo18106p();
                    }
                    paa paaVar5 = (paa) nxlVarM18137O5.f44974b;
                    paaVar5.f47146a |= 1;
                    paaVar5.f47147b = str4;
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar15 = (pat) nxlVar3.f44974b;
                    paa paaVar6 = (paa) nxlVarM18137O5.mo18103l();
                    paaVar6.getClass();
                    patVar15.f47295t = paaVar6;
                    patVar15.f47276a |= 268435456;
                }
                Object obj6 = mblVar.f39818c;
                pat patVar16 = (pat) nxlVar3.mo18103l();
                mws mwsVar = (mws) ((ljd) obj6).f38366b.mo6051a();
                mwn mwnVarM17091f = mws.m17091f(mwsVar.size());
                int size = mwsVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    try {
                        mwnVarM17091f.m17082g(((log) mwsVar.get(i3)).mo15346a(patVar16));
                    } catch (RuntimeException e) {
                        ((nbe) ((nbe) ((nbe) ljd.f38365a.m17252c()).mo17283h(e)).mo17276G((char) 4507)).mo17290o("One transmitter failed to send message");
                        if (runtimeException == null) {
                            runtimeException = e;
                        } else {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(runtimeException, e);
                            } catch (Exception e2) {
                            }
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                nps npsVarM17605a = kxk.m14960F(mwnVarM17091f.m17081f()).m17605a(ljc.f38361a, not.INSTANCE);
                lns lnsVar = ((lnt) mblVar.f39823h).f38781d;
                ksi ksiVar = lnsVar.f38774c;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (lnsVar.f38772a) {
                    lnsVar.f38775d++;
                    if (jElapsedRealtime - lnsVar.f38776e > 1000) {
                        lnsVar.f38775d = 0;
                        lnsVar.f38776e = jElapsedRealtime;
                    }
                }
                return npsVarM17605a;
            }
        }, this.f39821f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16299c(String str) {
        return m16297a(str) != -1;
    }

    public mbl(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        ojuVar.getClass();
        this.f39818c = ojuVar;
        ojuVar2.getClass();
        this.f39819d = ojuVar2;
        ojuVar3.getClass();
        this.f39820e = ojuVar3;
        ojuVar4.getClass();
        this.f39816a = ojuVar4;
        ojuVar5.getClass();
        this.f39817b = ojuVar5;
        ojuVar6.getClass();
        this.f39821f = ojuVar6;
        ojuVar7.getClass();
        this.f39822g = ojuVar7;
        ojuVar8.getClass();
        this.f39823h = ojuVar8;
    }
}
