package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p000.dfg;
import p000.djm;
import p000.ffw;
import p000.hnk;
import p000.jcb;
import p000.jcw;
import p000.jdz;
import p000.jfx;
import p000.jgb;
import p000.jib;
import p000.jin;
import p000.jpx;
import p000.jqe;
import p000.jqf;
import p000.jqg;
import p000.jqh;
import p000.jtj;
import p000.ktz;
import p000.kxk;
import p000.lku;
import p000.lle;
import p000.loe;
import p000.lof;
import p000.lol;
import p000.lom;
import p000.lov;
import p000.lqo;
import p000.mou;
import p000.mov;
import p000.moz;
import p000.msi;
import p000.nms;
import p000.nmt;
import p000.nmu;
import p000.nmv;
import p000.nnj;
import p000.nod;
import p000.nom;
import p000.not;
import p000.npm;
import p000.npp;
import p000.nps;
import p000.nwb;
import p000.nxl;
import p000.nxp;
import p000.nxq;
import p000.nxx;
import p000.nxy;
import p000.nyn;
import p000.nzg;
import p000.oja;
import p000.oza;
import p000.ozb;
import p000.ozq;
import p000.ozr;
import p000.ozt;
import p000.ozu;
import p000.paf;
import p000.pan;
import p000.pao;
import p000.pat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ClearcutMetricSnapshotTransmitter implements lof {

    /* JADX INFO: renamed from: a */
    public static final msi f7962a = lku.m15663q(ffw.f21762h);

    /* JADX INFO: renamed from: b */
    public volatile jcb f7963b;

    /* JADX INFO: renamed from: c */
    public volatile jcb f7964c;

    /* JADX INFO: renamed from: d */
    private volatile lol f7965d;

    /* JADX INFO: renamed from: e */
    private volatile lov f7966e;

    /* JADX INFO: renamed from: f */
    private final msi f7967f = lku.m15663q(ffw.f21763i);

    @Override // p000.lof
    /* JADX INFO: renamed from: a */
    public final nps mo4717a(final Context context, loe loeVar) {
        nps npsVarM14965K;
        ktz ktzVar = lom.f38809j;
        loeVar.m18121e(ktzVar);
        int i = 1;
        lku.m15670x(loeVar.f44976l.f44911b.get(ktzVar.f37201d) != null, "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        lov lovVar = this.f7966e;
        if (lovVar == null) {
            synchronized (this) {
                lovVar = this.f7966e;
                if (lovVar == null) {
                    lovVar = new lov(new dfg(context, 18));
                    this.f7966e = lovVar;
                }
            }
        }
        pat patVar = loeVar.f38800b;
        if (patVar == null) {
            patVar = pat.f47274u;
        }
        nxl nxlVar = (nxl) patVar.m18143ad(5);
        nxlVar.m18108s(patVar);
        lov.m15790c(lov.f38850a, nxlVar);
        ozb ozbVar = ((pat) nxlVar.f44974b).f47284i;
        if (ozbVar == null) {
            ozbVar = ozb.f46914c;
        }
        if ((ozbVar.f46916a & 1) != 0) {
            ozb ozbVar2 = ((pat) nxlVar.f44974b).f47284i;
            if (ozbVar2 == null) {
                ozbVar2 = ozb.f46914c;
            }
            oza ozaVar = ozbVar2.f46917b;
            if (ozaVar == null) {
                ozaVar = oza.f46901k;
            }
            nxl nxlVar2 = (nxl) ozaVar.m18143ad(5);
            nxlVar2.m18108s(ozaVar);
            lov.m15790c(lov.f38851b, nxlVar2);
            ozb ozbVar3 = ((pat) nxlVar.f44974b).f47284i;
            if (ozbVar3 == null) {
                ozbVar3 = ozb.f46914c;
            }
            nxl nxlVar3 = (nxl) ozbVar3.m18143ad(5);
            nxlVar3.m18108s(ozbVar3);
            if (!nxlVar3.f44974b.m18142ac()) {
                nxlVar3.mo18106p();
            }
            ozb ozbVar4 = (ozb) nxlVar3.f44974b;
            oza ozaVar2 = (oza) nxlVar2.mo18103l();
            ozaVar2.getClass();
            ozbVar4.f46917b = ozaVar2;
            ozbVar4.f46916a |= 1;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar2 = (pat) nxlVar.f44974b;
            ozb ozbVar5 = (ozb) nxlVar3.mo18103l();
            ozbVar5.getClass();
            patVar2.f47284i = ozbVar5;
            patVar2.f47276a |= 256;
        }
        paf pafVar = ((pat) nxlVar.f44974b).f47282g;
        if (pafVar == null) {
            pafVar = paf.f47175l;
        }
        if ((pafVar.f47177a & 256) != 0) {
            paf pafVar2 = ((pat) nxlVar.f44974b).f47282g;
            if (pafVar2 == null) {
                pafVar2 = paf.f47175l;
            }
            nmv nmvVar = pafVar2.f47184h;
            if (nmvVar == null) {
                nmvVar = nmv.f43910f;
            }
            nxl nxlVar4 = (nxl) nmvVar.m18143ad(5);
            nxlVar4.m18108s(nmvVar);
            nms nmsVar = ((nmv) nxlVar4.f44974b).f43915d;
            if (nmsVar == null) {
                nmsVar = nms.f43891f;
            }
            nms nmsVarM15791a = lovVar.m15791a(nmsVar);
            if (!nxlVar4.f44974b.m18142ac()) {
                nxlVar4.mo18106p();
            }
            nmv nmvVar2 = (nmv) nxlVar4.f44974b;
            nmsVarM15791a.getClass();
            nmvVar2.f43915d = nmsVarM15791a;
            nmvVar2.f43912a |= 1;
            List listUnmodifiableList = Collections.unmodifiableList(nmvVar2.f43916e);
            if (!nxlVar4.f44974b.m18142ac()) {
                nxlVar4.mo18106p();
            }
            ((nmv) nxlVar4.f44974b).f43916e = nzg.f45063b;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                nms nmsVarM15791a2 = lovVar.m15791a((nms) it.next());
                if (!nxlVar4.f44974b.m18142ac()) {
                    nxlVar4.mo18106p();
                }
                nmv nmvVar3 = (nmv) nxlVar4.f44974b;
                nmsVarM15791a2.getClass();
                nmvVar3.m17512b();
                nmvVar3.f43916e.add(nmsVarM15791a2);
            }
            nmv nmvVar4 = (nmv) nxlVar4.f44974b;
            nxy<nmu> nxyVar = (nmvVar4.f43913b == 4 ? (nmt) nmvVar4.f43914c : nmt.f43899b).f43901a;
            nxl nxlVarM18137O = nmt.f43899b.m18137O();
            for (nmu nmuVar : nxyVar) {
                nms nmsVar2 = nmuVar.f43906b;
                if (nmsVar2 == null) {
                    nmsVar2 = nms.f43891f;
                }
                if ((nmsVar2.f43893a & 2) != 0) {
                    nxl nxlVar5 = (nxl) nmuVar.m18143ad(5);
                    nxlVar5.m18108s(nmuVar);
                    nms nmsVarM15791a3 = lovVar.m15791a(nmsVar2);
                    if (!nxlVar5.f44974b.m18142ac()) {
                        nxlVar5.mo18106p();
                    }
                    nmu nmuVar2 = (nmu) nxlVar5.f44974b;
                    nmsVarM15791a3.getClass();
                    nmuVar2.f43906b = nmsVarM15791a3;
                    nmuVar2.f43905a |= 1;
                    nmuVar = (nmu) nxlVar5.mo18103l();
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nmt nmtVar = (nmt) nxlVarM18137O.f44974b;
                nmuVar.getClass();
                nmtVar.m17511b();
                nmtVar.f43901a.add(nmuVar);
            }
            nmt nmtVar2 = (nmt) nxlVarM18137O.mo18103l();
            if (!nxlVar4.f44974b.m18142ac()) {
                nxlVar4.mo18106p();
            }
            nmv nmvVar5 = (nmv) nxlVar4.f44974b;
            nmtVar2.getClass();
            nmvVar5.f43914c = nmtVar2;
            nmvVar5.f43913b = 4;
            paf pafVar3 = ((pat) nxlVar.f44974b).f47282g;
            if (pafVar3 == null) {
                pafVar3 = paf.f47175l;
            }
            nxl nxlVar6 = (nxl) pafVar3.m18143ad(5);
            nxlVar6.m18108s(pafVar3);
            nmv nmvVar6 = (nmv) nxlVar4.mo18103l();
            if (!nxlVar6.f44974b.m18142ac()) {
                nxlVar6.mo18106p();
            }
            paf pafVar4 = (paf) nxlVar6.f44974b;
            nmvVar6.getClass();
            pafVar4.f47184h = nmvVar6;
            pafVar4.f47177a |= 256;
            paf pafVar5 = (paf) nxlVar6.mo18103l();
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar3 = (pat) nxlVar.f44974b;
            pafVar5.getClass();
            patVar3.f47282g = pafVar5;
            patVar3.f47276a |= 64;
        }
        pao paoVar = ((pat) nxlVar.f44974b).f47283h;
        if (paoVar == null) {
            paoVar = pao.f47241k;
        }
        if (paoVar.f47252j.size() != 0) {
            pao paoVar2 = ((pat) nxlVar.f44974b).f47283h;
            if (paoVar2 == null) {
                paoVar2 = pao.f47241k;
            }
            nxl nxlVar7 = (nxl) paoVar2.m18143ad(5);
            nxlVar7.m18108s(paoVar2);
            for (int i2 = 0; i2 < ((pao) nxlVar7.f44974b).f47252j.size(); i2++) {
                pan panVar = (pan) ((pao) nxlVar7.f44974b).f47252j.get(i2);
                nxl nxlVar8 = (nxl) panVar.m18143ad(5);
                nxlVar8.m18108s(panVar);
                if (!((pan) nxlVar8.f44974b).f47237b.isEmpty()) {
                    if (!nxlVar8.f44974b.m18142ac()) {
                        nxlVar8.mo18106p();
                    }
                    ((pan) nxlVar8.f44974b).f47238c = nyn.f45025b;
                    List listM15789b = lov.m15789b(((pan) nxlVar8.f44974b).f47237b);
                    if (!nxlVar8.f44974b.m18142ac()) {
                        nxlVar8.mo18106p();
                    }
                    pan panVar2 = (pan) nxlVar8.f44974b;
                    nxx nxxVar = panVar2.f47238c;
                    if (!nxxVar.mo17770c()) {
                        panVar2.f47238c = nxq.m18126T(nxxVar);
                    }
                    nwb.m17749e(listM15789b, panVar2.f47238c);
                }
                if (!nxlVar8.f44974b.m18142ac()) {
                    nxlVar8.mo18106p();
                }
                pan panVar3 = (pan) nxlVar8.f44974b;
                panVar3.f47236a &= -2;
                panVar3.f47237b = pan.f47234f.f47237b;
                if (!nxlVar7.f44974b.m18142ac()) {
                    nxlVar7.mo18106p();
                }
                pao paoVar3 = (pao) nxlVar7.f44974b;
                pan panVar4 = (pan) nxlVar8.mo18103l();
                panVar4.getClass();
                paoVar3.m19257c();
                paoVar3.f47252j.set(i2, panVar4);
            }
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar4 = (pat) nxlVar.f44974b;
            pao paoVar4 = (pao) nxlVar7.mo18103l();
            paoVar4.getClass();
            patVar4.f47283h = paoVar4;
            patVar4.f47276a |= 128;
        }
        ozr ozrVar = ((pat) nxlVar.f44974b).f47281f;
        if (ozrVar == null) {
            ozrVar = ozr.f47067b;
        }
        if (ozrVar.f47069a.size() != 0) {
            ozr ozrVar2 = ((pat) nxlVar.f44974b).f47281f;
            if (ozrVar2 == null) {
                ozrVar2 = ozr.f47067b;
            }
            nxl nxlVar9 = (nxl) ozrVar2.m18143ad(5);
            nxlVar9.m18108s(ozrVar2);
            for (int i3 = 0; i3 < ((ozr) nxlVar9.f44974b).f47069a.size(); i3++) {
                ozq ozqVar = (ozq) ((ozr) nxlVar9.f44974b).f47069a.get(i3);
                nxl nxlVar10 = (nxl) ozqVar.m18143ad(5);
                nxlVar10.m18108s(ozqVar);
                if (!((ozq) nxlVar10.f44974b).f47063d.isEmpty()) {
                    if (!nxlVar10.f44974b.m18142ac()) {
                        nxlVar10.mo18106p();
                    }
                    ((ozq) nxlVar10.f44974b).f47064e = nyn.f45025b;
                    List listM15789b2 = lov.m15789b(((ozq) nxlVar10.f44974b).f47063d);
                    if (!nxlVar10.f44974b.m18142ac()) {
                        nxlVar10.mo18106p();
                    }
                    ozq ozqVar2 = (ozq) nxlVar10.f44974b;
                    nxx nxxVar2 = ozqVar2.f47064e;
                    if (!nxxVar2.mo17770c()) {
                        ozqVar2.f47064e = nxq.m18126T(nxxVar2);
                    }
                    nwb.m17749e(listM15789b2, ozqVar2.f47064e);
                }
                if (!nxlVar10.f44974b.m18142ac()) {
                    nxlVar10.mo18106p();
                }
                ozq ozqVar3 = (ozq) nxlVar10.f44974b;
                ozqVar3.f47060a &= -524289;
                ozqVar3.f47063d = ozq.f47058g.f47063d;
                if (!nxlVar9.f44974b.m18142ac()) {
                    nxlVar9.mo18106p();
                }
                ozr ozrVar3 = (ozr) nxlVar9.f44974b;
                ozq ozqVar4 = (ozq) nxlVar10.mo18103l();
                ozqVar4.getClass();
                nxy nxyVar2 = ozrVar3.f47069a;
                if (!nxyVar2.mo17770c()) {
                    ozrVar3.f47069a = nxq.m18127U(nxyVar2);
                }
                ozrVar3.f47069a.set(i3, ozqVar4);
            }
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar5 = (pat) nxlVar.f44974b;
            ozr ozrVar4 = (ozr) nxlVar9.mo18103l();
            ozrVar4.getClass();
            patVar5.f47281f = ozrVar4;
            patVar5.f47276a |= 32;
        }
        ozt oztVar = ((pat) nxlVar.f44974b).f47286k;
        if (oztVar == null) {
            oztVar = ozt.f47075f;
        }
        if (oztVar.f47080d.size() != 0) {
            ozt oztVar2 = ((pat) nxlVar.f44974b).f47286k;
            if (oztVar2 == null) {
                oztVar2 = ozt.f47075f;
            }
            nxl nxlVar11 = (nxl) oztVar2.m18143ad(5);
            nxlVar11.m18108s(oztVar2);
            for (int i4 = 0; i4 < ((ozt) nxlVar11.f44974b).f47080d.size(); i4++) {
                ozu ozuVar = (ozu) ((ozt) nxlVar11.f44974b).f47080d.get(i4);
                nxl nxlVar12 = (nxl) ozuVar.m18143ad(5);
                nxlVar12.m18108s(ozuVar);
                lov.m15790c(lov.f38852c, nxlVar12);
                if (!nxlVar11.f44974b.m18142ac()) {
                    nxlVar11.mo18106p();
                }
                ozt oztVar3 = (ozt) nxlVar11.f44974b;
                ozu ozuVar2 = (ozu) nxlVar12.mo18103l();
                ozuVar2.getClass();
                nxy nxyVar3 = oztVar3.f47080d;
                if (!nxyVar3.mo17770c()) {
                    oztVar3.f47080d = nxq.m18127U(nxyVar3);
                }
                oztVar3.f47080d.set(i4, ozuVar2);
            }
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pat patVar6 = (pat) nxlVar.f44974b;
            ozt oztVar4 = (ozt) nxlVar11.mo18103l();
            oztVar4.getClass();
            patVar6.f47286k = oztVar4;
            patVar6.f47276a |= 4096;
        }
        final pat patVar7 = (pat) nxlVar.mo18103l();
        if (((Boolean) this.f7967f.mo6051a()).booleanValue()) {
            return npp.f44031a;
        }
        ktz ktzVar2 = lom.f38809j;
        loeVar.m18121e(ktzVar2);
        Object objM18028k = loeVar.f44976l.m18028k((nxp) ktzVar2.f37201d);
        if (objM18028k == null) {
            objM18028k = ktzVar2.f37199b;
        } else {
            ktzVar2.m14855g(objM18028k);
        }
        final lom lomVar = (lom) objM18028k;
        boolean z = lomVar.f38818h;
        int i5 = patVar7.f47276a & 64;
        final lol lolVar = this.f7965d;
        if (lolVar == null) {
            synchronized (this) {
                lolVar = this.f7965d;
                if (lolVar == null) {
                    lolVar = new lol();
                    this.f7965d = lolVar;
                }
            }
        }
        boolean z2 = i5 != 0;
        if (z && oja.f46159a.mo6051a().mo18572b(context)) {
            Boolean bool = (Boolean) lolVar.f38806b.get();
            if (bool != null) {
                npsVarM14965K = kxk.m14965K(bool);
            } else {
                jqh jqhVarM13466a = lolVar.f38805a;
                if (jqhVarM13466a == null) {
                    synchronized (lolVar) {
                        jqhVarM13466a = lolVar.f38805a;
                        if (jqhVarM13466a == null) {
                            jqhVarM13466a = jqf.m13466a(context);
                            lolVar.f38805a = jqhVarM13466a;
                        }
                    }
                }
                if ((!z2) && !lolVar.f38807c.getAndSet(true)) {
                    jdz jdzVar = (jdz) jqhVarM13466a;
                    jfx jfxVarM13213r = jib.m13213r(new jqg() { // from class: lok
                        @Override // p000.jqg
                        /* JADX INFO: renamed from: a */
                        public final void mo13467a() {
                            lolVar.f38806b.set(null);
                        }
                    }, jdzVar.f33824g, jqg.class.getSimpleName());
                    jtj jtjVar = new jtj(jdzVar, jfxVarM13213r, ((jqe) jdzVar.f33822e).f34588a, 1, null);
                    jin jinVar = new jin(jdzVar, 3);
                    jgb jgbVarM6219x = djm.m6219x();
                    jgbVarM6219x.f33938a = jtjVar;
                    jgbVarM6219x.f33939b = jinVar;
                    jgbVarM6219x.f33940c = jfxVarM13213r;
                    jgbVarM6219x.f33941d = new jcw[]{jpx.f34576a};
                    jgbVarM6219x.f33942e = 4507;
                    jdzVar.m12965k(jgbVarM6219x.m13127a());
                }
                npm npmVarM17611q = npm.m17611q(lle.m15695o(jqhVarM13466a.mo12963h()));
                lqo lqoVar = new lqo(lolVar, i);
                int i6 = mov.f41218a;
                npsVarM14965K = nnj.m17523i(nod.m17553i(npmVarM17611q, new mou(moz.m16724b(), lqoVar), not.INSTANCE), Throwable.class, hnk.f28505r, not.INSTANCE);
            }
        } else {
            npsVarM14965K = kxk.m14965K(true);
        }
        return nod.m17554j(npsVarM14965K, new nom() { // from class: loq
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                jcb jcbVar;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.f38836a;
                Context context2 = context;
                pat patVar8 = patVar7;
                lom lomVar2 = lomVar;
                if (!((Boolean) obj).booleanValue()) {
                    return npp.f44031a;
                }
                String str = lomVar2.f38812b;
                if (lomVar2.f38814d) {
                    jcbVar = clearcutMetricSnapshotTransmitter.f7964c;
                    if (jcbVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            jcbVar = clearcutMetricSnapshotTransmitter.f7964c;
                            if (jcbVar == null) {
                                List list = jcb.f33699j;
                                ffw ffwVar = ffw.f21760f;
                                jcg jcgVar = jcg.ZWIEBACK;
                                jib.m13205j(context2);
                                jib.m13203h(str);
                                EnumSet enumSet = jcg.f33721f;
                                jib.m13205j(enumSet);
                                jby.m12879b(enumSet);
                                jcb jcbVarM12857b = jbx.m12857b(context2, str, ffwVar, enumSet);
                                clearcutMetricSnapshotTransmitter.f7964c = jcbVarM12857b;
                                jcbVar = jcbVarM12857b;
                            }
                        }
                    }
                } else {
                    jcbVar = clearcutMetricSnapshotTransmitter.f7963b;
                    if (jcbVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            jcbVar = clearcutMetricSnapshotTransmitter.f7963b;
                            if (jcbVar == null) {
                                List list2 = jcb.f33699j;
                                ffw ffwVar2 = ffw.f21760f;
                                EnumSet enumSet2 = jcg.f33720e;
                                jib.m13205j(context2);
                                jib.m13203h(str);
                                jcb jcbVarM12857b2 = jbx.m12857b(context2, str, ffwVar2, enumSet2);
                                clearcutMetricSnapshotTransmitter.f7963b = jcbVarM12857b2;
                                jcbVar = jcbVarM12857b2;
                            }
                        }
                    }
                }
                jbz jbzVarM12888e = jcbVar.m12888e(patVar8);
                if (oja.f46159a.mo6051a().mo18571a(context2)) {
                    jbzVarM12888e.f33697h = ktr.m14843a(context2, (ksp) ClearcutMetricSnapshotTransmitter.f7962a.mo6051a());
                }
                String str2 = lomVar2.f38815e;
                if (!mro.m16832b(str2)) {
                    if (jbzVarM12888e.f33690a.m12881c()) {
                        throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                    }
                    nxn nxnVar = jbzVarM12888e.f33698i;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ogy ogyVar = (ogy) nxnVar.f44974b;
                    ogy ogyVar2 = ogy.f45974i;
                    str2.getClass();
                    ogyVar.f45976a |= 16777216;
                    ogyVar.f45983h = str2;
                }
                if (!lomVar2.f38814d) {
                    if ((lomVar2.f38811a & 2) != 0) {
                        String str3 = lomVar2.f38813c;
                        if (jbzVarM12888e.f33690a.m12881c()) {
                            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                        }
                        if (jbzVarM12888e.f33692c == null) {
                            jbzVarM12888e.f33692c = new ArrayList();
                        }
                        jbzVarM12888e.f33692c.add(str3);
                    }
                    if ((lomVar2.f38811a & 16) != 0) {
                        String str4 = lomVar2.f38816f;
                        if (!jbzVarM12888e.f33690a.f33689h.contains(jcg.ACCOUNT_NAME)) {
                            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                        }
                        jbzVarM12888e.f33694e = str4;
                    }
                    nxw nxwVar = lomVar2.f38817g;
                    if (!nxwVar.isEmpty()) {
                        Object[] array = nxwVar.toArray();
                        int length = array.length;
                        int[] iArr = new int[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            Object obj2 = array[i7];
                            obj2.getClass();
                            iArr[i7] = ((Number) obj2).intValue();
                        }
                        if (jbzVarM12888e.f33690a.m12881c()) {
                            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                        }
                        if (length != 0) {
                            if (jbzVarM12888e.f33693d == null) {
                                jbzVarM12888e.f33693d = new ArrayList();
                            }
                            for (int i8 = 0; i8 < length; i8++) {
                                jbzVarM12888e.f33693d.add(Integer.valueOf(iArr[i8]));
                            }
                        }
                    }
                }
                return lle.m15695o(jib.m13208m(jbzVarM12888e.m12882a()));
            }
        }, not.INSTANCE);
    }
}
