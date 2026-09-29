package com.lingq.feature.vocabulary.state;

import android.content.Context;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.ExportType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.domain.token.C1537e;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import com.lingq.feature.vocabulary.domain.C2825a;
import com.lingq.feature.vocabulary.domain.C2826b;
import com.lingq.feature.vocabulary.domain.C2827c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3513qw;
import p000.axa;
import p000.bxa;
import p000.c18;
import p000.cxa;
import p000.dxa;
import p000.e0b;
import p000.exa;
import p000.fa4;
import p000.fxa;
import p000.gm5;
import p000.gya;
import p000.h0b;
import p000.l70;
import p000.m83;
import p000.mv0;
import p000.mxa;
import p000.n1b;
import p000.nn1;
import p000.owa;
import p000.pwa;
import p000.qwa;
import p000.r0b;
import p000.rwa;
import p000.rxa;
import p000.swa;
import p000.sxa;
import p000.t7d;
import p000.twa;
import p000.un1;
import p000.uwa;
import p000.v13;
import p000.v91;
import p000.va2;
import p000.vi3;
import p000.vk9;
import p000.vs3;
import p000.vwa;
import p000.vxa;
import p000.vz1;
import p000.w0b;
import p000.wfb;
import p000.wwa;
import p000.xca;
import p000.xi9;
import p000.xwa;
import p000.ywa;
import p000.zw2;
import p000.zwa;
import p000.zz7;
import p000.zza;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2862d {

    /* JADX INFO: renamed from: a */
    public final C2826b f33795a;

    /* JADX INFO: renamed from: b */
    public final C2826b f33796b;

    /* JADX INFO: renamed from: c */
    public final zw2 f33797c;

    /* JADX INFO: renamed from: d */
    public final v13 f33798d;

    /* JADX INFO: renamed from: e */
    public final C2827c f33799e;

    /* JADX INFO: renamed from: f */
    public final C2825a f33800f;

    /* JADX INFO: renamed from: g */
    public final zw2 f33801g;

    /* JADX INFO: renamed from: h */
    public final va2 f33802h;

    /* JADX INFO: renamed from: i */
    public final va2 f33803i;

    /* JADX INFO: renamed from: j */
    public final C1537e f33804j;

    /* JADX INFO: renamed from: k */
    public final Context f33805k;

    /* JADX INFO: renamed from: l */
    public final nn1 f33806l;

    /* JADX INFO: renamed from: m */
    public final un1 f33807m;

    /* JADX INFO: renamed from: n */
    public final C3244l f33808n;

    /* JADX INFO: renamed from: o */
    public final c18 f33809o;

    /* JADX INFO: renamed from: p */
    public String f33810p;

    /* JADX INFO: renamed from: q */
    public List f33811q;

    /* JADX INFO: renamed from: r */
    public int f33812r;

    /* JADX INFO: renamed from: s */
    public boolean f33813s;

    /* JADX INFO: renamed from: t */
    public VocabularySearchQuery f33814t;

    /* JADX INFO: renamed from: u */
    public vs3 f33815u;

    /* JADX INFO: renamed from: v */
    public boolean f33816v;

    /* JADX INFO: renamed from: w */
    public boolean f33817w;

    /* JADX INFO: renamed from: x */
    public boolean f33818x;

    /* JADX INFO: renamed from: y */
    public boolean f33819y;

    public C2862d(C2826b c2826b, C2826b c2826b2, zw2 zw2Var, v13 v13Var, C2827c c2827c, C2825a c2825a, zw2 zw2Var2, va2 va2Var, va2 va2Var2, C1537e c1537e, C1530a c1530a, Context context, nn1 nn1Var, un1 un1Var) {
        un1Var.getClass();
        this.f33795a = c2826b;
        this.f33796b = c2826b2;
        this.f33797c = zw2Var;
        this.f33798d = v13Var;
        this.f33799e = c2827c;
        this.f33800f = c2825a;
        this.f33801g = zw2Var2;
        this.f33802h = va2Var;
        this.f33803i = va2Var2;
        this.f33804j = c1537e;
        this.f33805k = context;
        this.f33806l = nn1Var;
        this.f33807m = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new n1b());
        this.f33808n = c3244lM17114d;
        this.f33809o = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, new n1b());
        this.f33810p = "";
        this.f33811q = EmptyList.f47638a;
        this.f33814t = new VocabularySearchQuery();
        this.f33815u = zz7.f72431f;
        AbstractC3224d.m15545x(new m83(c1530a.m8209a(), new VocabularyStateHolder$1(this, null), 2), un1Var);
    }

    /* JADX INFO: renamed from: a */
    public final VocabularyContentFilter m9768a() {
        return ((n1b) this.f33808n.getValue()).f52192b.f72434a;
    }

    /* JADX INFO: renamed from: b */
    public final int m9769b() {
        return ((n1b) this.f33808n.getValue()).f52194d.f58465a;
    }

    /* JADX INFO: renamed from: c */
    public final String m9770c() {
        return ((n1b) this.f33808n.getValue()).f52191a.f41665a;
    }

    /* JADX INFO: renamed from: d */
    public final void m9771d(final fxa fxaVar) {
        fxaVar.getClass();
        final int i = 1;
        if (fxaVar.equals(axa.f7653a)) {
            m9774g(true);
            return;
        }
        final int i2 = 0;
        if (fxaVar instanceof zwa) {
            m9773f(new vi3() { // from class: o1b
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    fxa fxaVar2 = fxaVar;
                    switch (i3) {
                        case 0:
                            n1b n1bVar = (n1b) obj;
                            n1bVar.getClass();
                            h1b h1bVar = n1bVar.f52191a;
                            String str = ((zwa) fxaVar2).f72323a;
                            h1bVar.getClass();
                            str.getClass();
                            return n1b.m17171a(n1bVar, new h1b(str), null, null, null, null, false, false, false, false, null, null, 2046);
                        case 1:
                            n1b n1bVar2 = (n1b) obj;
                            n1bVar2.getClass();
                            return n1b.m17171a(n1bVar2, null, zza.m25902a(n1bVar2.f52192b, ((rwa) fxaVar2).f59981a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                        default:
                            n1b n1bVar3 = (n1b) obj;
                            n1bVar3.getClass();
                            return n1b.m17171a(n1bVar3, null, zza.m25902a(n1bVar3.f52192b, ((swa) fxaVar2).f61522a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                    }
                }
            });
            return;
        }
        if (fxaVar.equals(bxa.f9150a)) {
            m9773f(new e0b(i));
            m9774g(false);
            return;
        }
        if (fxaVar instanceof rwa) {
            m9773f(new vi3() { // from class: o1b
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    int i3 = i;
                    fxa fxaVar2 = fxaVar;
                    switch (i3) {
                        case 0:
                            n1b n1bVar = (n1b) obj;
                            n1bVar.getClass();
                            h1b h1bVar = n1bVar.f52191a;
                            String str = ((zwa) fxaVar2).f72323a;
                            h1bVar.getClass();
                            str.getClass();
                            return n1b.m17171a(n1bVar, new h1b(str), null, null, null, null, false, false, false, false, null, null, 2046);
                        case 1:
                            n1b n1bVar2 = (n1b) obj;
                            n1bVar2.getClass();
                            return n1b.m17171a(n1bVar2, null, zza.m25902a(n1bVar2.f52192b, ((rwa) fxaVar2).f59981a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                        default:
                            n1b n1bVar3 = (n1b) obj;
                            n1bVar3.getClass();
                            return n1b.m17171a(n1bVar3, null, zza.m25902a(n1bVar3.f52192b, ((swa) fxaVar2).f61522a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                    }
                }
            });
            m9773f(new e0b(i));
            m9774g(false);
            return;
        }
        boolean z = fxaVar instanceof owa;
        nn1 nn1Var = this.f33806l;
        un1 un1Var = this.f33807m;
        final int i3 = 2;
        if (z) {
            String string = vk9.m23376L0(((owa) fxaVar).f55112a).toString();
            if (vk9.m23391n0(string) || vk9.m23391n0(this.f33810p)) {
                return;
            }
            wfb.m23926u(un1Var, nn1Var, null, new VocabularyStateHolder$resolveAddedTerm$1(this, string, null), 2);
            return;
        }
        if (fxaVar instanceof dxa) {
            dxa dxaVar = (dxa) fxaVar;
            String str = dxaVar.f36401a;
            int i4 = dxaVar.f36402b;
            if (vk9.m23391n0(this.f33810p)) {
                return;
            }
            wfb.m23926u(un1Var, nn1Var, null, new VocabularyStateHolder$updateStatus$1(i4, this, str, null), 2);
            return;
        }
        if (fxaVar instanceof twa) {
            twa twaVar = (twa) fxaVar;
            ExportType exportType = twaVar.f63024a;
            if (twaVar.f63025b) {
                wfb.m23926u(un1Var, nn1Var, null, new VocabularyStateHolder$exportAll$1(this, exportType, null), 2);
                return;
            } else {
                wfb.m23926u(un1Var, nn1Var, null, new VocabularyStateHolder$exportCurrentPage$1(this, exportType, null), 2);
                return;
            }
        }
        boolean zEquals = fxaVar.equals(cxa.f34695a);
        C3244l c3244l = this.f33808n;
        if (zEquals) {
            if (fa4.m11650l(((n1b) c3244l.getValue()).f52201k, gya.f41535a)) {
                return;
            }
            String str2 = this.f33810p;
            List list = this.f33811q;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((mxa) it.next()).f52003a));
            }
            m9773f(new e0b(i3));
            wfb.m23926u(un1Var, nn1Var, null, new VocabularyStateHolder$exportToSkritter$2(this, str2, arrayList, null), 2);
            return;
        }
        if (fxaVar instanceof swa) {
            m9773f(new vi3() { // from class: o1b
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    int i5 = i3;
                    fxa fxaVar2 = fxaVar;
                    switch (i5) {
                        case 0:
                            n1b n1bVar = (n1b) obj;
                            n1bVar.getClass();
                            h1b h1bVar = n1bVar.f52191a;
                            String str3 = ((zwa) fxaVar2).f72323a;
                            h1bVar.getClass();
                            str3.getClass();
                            return n1b.m17171a(n1bVar, new h1b(str3), null, null, null, null, false, false, false, false, null, null, 2046);
                        case 1:
                            n1b n1bVar2 = (n1b) obj;
                            n1bVar2.getClass();
                            return n1b.m17171a(n1bVar2, null, zza.m25902a(n1bVar2.f52192b, ((rwa) fxaVar2).f59981a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                        default:
                            n1b n1bVar3 = (n1b) obj;
                            n1bVar3.getClass();
                            return n1b.m17171a(n1bVar3, null, zza.m25902a(n1bVar3.f52192b, ((swa) fxaVar2).f61522a, null, 0, 6), null, null, null, false, false, false, false, null, null, 2045);
                    }
                }
            });
            m9773f(new e0b(i));
            m9774g(false);
            return;
        }
        if (fxaVar.equals(wwa.f67435a)) {
            int iM9769b = m9769b();
            int i5 = ((n1b) c3244l.getValue()).f52194d.f58466b;
            if (this.f33816v || iM9769b >= i5) {
                return;
            }
            m9773f(new mv0(iM9769b, 21));
            m9774g(false);
            return;
        }
        if (fxaVar.equals(ywa.f70601a)) {
            int iM9769b2 = m9769b();
            if (this.f33816v || iM9769b2 <= 1) {
                return;
            }
            m9773f(new mv0(iM9769b2, 22));
            m9774g(false);
            return;
        }
        if (fxaVar instanceof xwa) {
            int i6 = ((xwa) fxaVar).f68909a;
            int i7 = ((n1b) c3244l.getValue()).f52194d.f58466b;
            if (this.f33816v || i6 == m9769b() || i6 > i7) {
                return;
            }
            m9773f(new mv0(i6, 23));
            m9774g(false);
            return;
        }
        if (fxaVar.equals(qwa.f58305a)) {
            this.f33819y = false;
            m9773f(new e0b(5));
        } else {
            if (fxaVar.equals(pwa.f56931a)) {
                m9773f(new e0b(3));
                return;
            }
            if (fxaVar.equals(uwa.f64479a)) {
                m9773f(new e0b(4));
            } else {
                if ((fxaVar instanceof exa) || (fxaVar instanceof vwa)) {
                    return;
                }
                gm5.m12750e();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9772e(String str, boolean z) {
        str.getClass();
        boolean zM11650l = fa4.m11650l(this.f33810p, str);
        this.f33810p = str;
        this.f33819y = z;
        int i = 1;
        if (!zM11650l) {
            this.f33811q = EmptyList.f47638a;
            this.f33812r = 0;
            this.f33813s = false;
            this.f33814t = new VocabularySearchQuery();
            m83 m83Var = new m83(this.f33795a.m9749c(this.f33810p), new VocabularyStateHolder$observeVocabularySearchQuery$1(this, null), 2);
            String str2 = "vocabularySearchQuery:" + this.f33810p;
            un1 un1Var = this.f33807m;
            nn1 nn1Var = this.f33806l;
            AbstractC1263a.m7049d(m83Var, un1Var, str2, nn1Var);
            String str3 = this.f33810p;
            str3.getClass();
            C1308x c1308x = (C1308x) this.f33798d.f64692a;
            c1308x.getClass();
            rxa rxaVar = (rxa) c1308x.f16569b;
            rxaVar.getClass();
            AbstractC1263a.m7049d(new m83(new C3513qw(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(rxaVar.f60013K, true, new String[]{"CardEntity"}, new xca(str3, 2))), 12), new VocabularyStateHolder$observeHasCreatedLingqs$1(this, null), 2), un1Var, "observeHasCreatedLingqs:" + this.f33810p, nn1Var);
        }
        m9773f(new e0b(i));
        m9774g(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m9773f(vi3 vi3Var) {
        C3244l c3244l;
        Object value;
        n1b n1bVar;
        zza zzaVar;
        int i;
        int iM15945h;
        boolean z;
        ArrayList arrayList;
        Pair pair;
        zza zzaVarM25902a;
        h0b h0bVar;
        String str;
        boolean z2;
        boolean z3;
        do {
            c3244l = this.f33808n;
            value = c3244l.getValue();
            n1bVar = (n1b) vi3Var.invoke((n1b) value);
            r0b r0bVar = n1bVar.f52194d;
            zzaVar = n1bVar.f52192b;
            int i2 = r0bVar.f58466b;
            i = i2 < 1 ? 1 : i2;
            iM15945h = l70.m15945h(r0bVar.f58465a, 1, i);
            List list = this.f33811q;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mxa mxaVar = (mxa) it.next();
                int i3 = mxaVar.f52003a;
                List list2 = mxaVar.f52009g;
                String str2 = mxaVar.f52004b;
                String str3 = mxaVar.f52011i;
                List list3 = mxaVar.f52010h;
                if (list3.isEmpty()) {
                    list3 = list2;
                }
                String strM17122h = AbstractC3352my.m17122h(str3, str2, list3);
                String strM21897b = t7d.m21897b(mxaVar.f52008f);
                boolean z4 = mxaVar.f52007e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list2) {
                    Iterator it2 = it;
                    if (!vk9.m23391n0((String) obj)) {
                        arrayList3.add(obj);
                    }
                    it = it2;
                }
                arrayList2.add(new sxa(i3, str2, strM17122h, strM21897b, z4, arrayList3, mxaVar.f52005c, Integer.valueOf(mxaVar.f52006d), this.f33815u));
                it = it;
            }
            z = this.f33816v && !this.f33817w && arrayList2.isEmpty();
            List list4 = this.f33811q;
            arrayList = new ArrayList(v91.m23189q0(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList.add(((mxa) it3.next()).f52004b);
            }
            VocabularySearchQuery vocabularySearchQuery = this.f33814t;
            List list5 = vocabularySearchQuery.f19866h;
            if (list5.isEmpty()) {
                pair = new Pair(CardStatus.New, CardStatus.Known);
            } else {
                List list6 = list5;
                pair = new Pair(list5.get(l70.m15946i(vocabularySearchQuery.f19859a, vz1.m23601G(list6))), list5.get(l70.m15946i(vocabularySearchQuery.f19860b, vz1.m23601G(list6))));
            }
            boolean z5 = (!arrayList2.isEmpty() || z || this.f33818x) ? false : true;
            zzaVarM25902a = zza.m25902a(zzaVar, null, pair, this.f33812r, 1);
            h0bVar = new h0b(arrayList2, z5 ? (!vk9.m23391n0(n1bVar.f52191a.f41665a) || this.f33813s) ? new vxa(R$string.search_no_search_results, null) : new vxa(com.lingq.feature.vocabulary.R$string.vocabulary_empty_no_lingqs, Integer.valueOf(com.lingq.feature.vocabulary.R$string.vocabulary_empty_choose_lesson)) : null);
            r0b r0bVar2 = n1bVar.f52194d;
            str = iM15945h + "/" + i;
            z2 = iM15945h > 1;
            z3 = iM15945h < i;
            r0bVar2.getClass();
        } while (!c3244l.m15570h(value, n1b.m17171a(n1bVar, null, zzaVarM25902a, h0bVar, new r0b(iM15945h, i, str, z2, z3), new w0b(!arrayList.isEmpty(), arrayList, zzaVar.f72434a.toReviewType(), this.f33819y && !arrayList.isEmpty()), this.f33816v && this.f33817w, z, false, C2825a.m9745a(this.f33810p), null, null, 1665)));
    }

    /* JADX INFO: renamed from: g */
    public final void m9774g(boolean z) {
        if (vk9.m23391n0(this.f33810p)) {
            return;
        }
        this.f33817w = z;
        this.f33816v = true;
        this.f33818x = true;
        m9773f(new e0b(5));
        String str = this.f33810p;
        int iM9769b = m9769b();
        String strM9770c = m9770c();
        VocabularyContentFilter vocabularyContentFilterM9768a = m9768a();
        String str2 = this.f33814t.f19864f;
        m83 m83Var = new m83(this.f33796b.m9750d(str, iM9769b, strM9770c, vocabularyContentFilterM9768a, vk9.m23391n0(str2) ? null : str2), new VocabularyStateHolder$observeVocabulary$1(this, null), 2);
        String str3 = "observeVocabulary:" + this.f33810p;
        un1 un1Var = this.f33807m;
        nn1 nn1Var = this.f33806l;
        AbstractC1263a.m7049d(m83Var, un1Var, str3, nn1Var);
        AbstractC1263a.m7047b(un1Var, nn1Var, AbstractC3393o1.m17734i("fetchVocabulary:", this.f33810p), new VocabularyStateHolder$fetchVocabulary$1(this, null));
    }
}
