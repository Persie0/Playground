package com.lingq.feature.vocabulary.filter;

import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.settings.FilterType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.eh9;
import p000.fa4;
import p000.fv8;
import p000.g41;
import p000.hza;
import p000.lda;
import p000.lm4;
import p000.nl8;
import p000.nn1;
import p000.v91;
import p000.vma;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.xo1;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2850b extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33677b;

    /* JADX INFO: renamed from: c */
    public final vma f33678c;

    /* JADX INFO: renamed from: d */
    public final xo1 f33679d;

    /* JADX INFO: renamed from: e */
    public final d65 f33680e;

    /* JADX INFO: renamed from: f */
    public final lm4 f33681f;

    /* JADX INFO: renamed from: g */
    public final y95 f33682g;

    /* JADX INFO: renamed from: h */
    public final nn1 f33683h;

    /* JADX INFO: renamed from: i */
    public final FilterType f33684i;

    /* JADX INFO: renamed from: j */
    public final C3244l f33685j;

    /* JADX INFO: renamed from: k */
    public final c18 f33686k;

    /* JADX INFO: renamed from: l */
    public final C3244l f33687l;

    /* JADX INFO: renamed from: m */
    public final c18 f33688m;

    /* JADX INFO: renamed from: n */
    public final C3244l f33689n;

    /* JADX INFO: renamed from: o */
    public final c18 f33690o;

    /* JADX INFO: renamed from: p */
    public final C3244l f33691p;

    /* JADX INFO: renamed from: q */
    public final C3244l f33692q;

    /* JADX INFO: renamed from: r */
    public final C3244l f33693r;

    /* JADX INFO: renamed from: s */
    public final C3244l f33694s;

    /* JADX INFO: renamed from: t */
    public final c18 f33695t;

    /* JADX INFO: renamed from: u */
    public final C3244l f33696u;

    /* JADX INFO: renamed from: v */
    public final C3244l f33697v;

    /* JADX INFO: renamed from: w */
    public final c18 f33698w;

    /* JADX INFO: renamed from: x */
    public final C3244l f33699x;

    /* JADX INFO: renamed from: y */
    public final c18 f33700y;

    /* JADX INFO: renamed from: z */
    public final C3244l f33701z;

    public C2850b(vma vmaVar, xo1 xo1Var, d65 d65Var, lm4 lm4Var, y95 y95Var, nn1 nn1Var, cma cmaVar, nl8 nl8Var) {
        vmaVar.getClass();
        xo1Var.getClass();
        d65Var.getClass();
        lm4Var.getClass();
        y95Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f33677b = cmaVar;
        this.f33678c = vmaVar;
        this.f33679d = xo1Var;
        this.f33680e = d65Var;
        this.f33681f = lm4Var;
        this.f33682g = y95Var;
        this.f33683h = nn1Var;
        FilterType filterType = (FilterType) nl8Var.m17488b("filterType");
        this.f33684i = filterType;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f33685j = c3244lM17114d;
        FilterType filterType2 = FilterType.Tags;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(Boolean.valueOf(filterType == filterType2 || filterType == FilterType.SRSDate));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        Boolean bool = Boolean.FALSE;
        this.f33686k = AbstractC3224d.m15520B(c3244lM17114d2, g41VarM16103C, c3243k, bool);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f33687l = c3244lM17114d3;
        this.f33688m = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, bool);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(emptyList);
        this.f33689n = c3244lM17114d4;
        this.f33690o = AbstractC3224d.m15520B(new C3228h(c3244lM17114d4, c3244lM17114d, new VocabularyFilterSelectionViewModel$selectionItems$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        this.f33691p = AbstractC3352my.m17114d(emptyList);
        this.f33692q = AbstractC3352my.m17114d(emptyList);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(emptyList);
        this.f33693r = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(emptyList);
        this.f33694s = c3244lM17114d6;
        this.f33695t = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c3244lM17114d5, c3244lM17114d6, c3244lM17114d, new VocabularyFilterSelectionViewModel$_tags$1(4, null)), lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d("");
        this.f33696u = c3244lM17114d7;
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(emptyList);
        this.f33697v = c3244lM17114d8;
        this.f33698w = AbstractC3224d.m15520B(new C3228h(c3244lM17114d7, c3244lM17114d8, new VocabularyFilterSelectionViewModel$srsDates$1(3, null)), lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(bool);
        this.f33699x = c3244lM17114d9;
        this.f33700y = AbstractC3224d.m15520B(c3244lM17114d9, lda.m16103C(this), c3243k, bool);
        this.f33701z = AbstractC3352my.m17114d(null);
        m9760V2();
        if (filterType == filterType2) {
            wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$1(this, null), 3);
        }
        if (filterType == FilterType.SRSDate) {
            wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$2(this, null), 3);
        }
        wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$3(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33677b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33677b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33677b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33677b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33677b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33677b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33677b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33677b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33677b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33677b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33677b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33677b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33677b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33677b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33677b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33677b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9760V2() {
        VocabularySort vocabularySort;
        VocabularySearch vocabularySearch;
        VocabularySearchQuery vocabularySearchQuery;
        Pair pair;
        Integer num;
        Pair pair2;
        Integer num2;
        Pair pair3;
        FilterType filterType = this.f33684i;
        int i = filterType == null ? -1 : hza.f43262a[filterType.ordinal()];
        nn1 nn1Var = this.f33683h;
        C3244l c3244l = this.f33689n;
        C3244l c3244l2 = this.f33701z;
        switch (i) {
            case 2:
                new VocabularySearchQuery();
                List<VocabularySort> listM23605K = vz1.m23605K(VocabularySort.AtoZ, VocabularySort.CreationDate, VocabularySort.Importance, VocabularySort.Status);
                ArrayList arrayList = new ArrayList(v91.m23189q0(listM23605K, 10));
                for (VocabularySort vocabularySort2 : listM23605K) {
                    Integer numValueOf = Integer.valueOf(AbstractC3423or.m18227L(vocabularySort2));
                    String roomColumnName = vocabularySort2.getRoomColumnName();
                    VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) c3244l2.getValue();
                    arrayList.add(new fv8(2, numValueOf, null, vocabularySort2.getRoomColumnName(), fa4.m11650l(roomColumnName, (vocabularySearchQuery2 == null || (vocabularySort = vocabularySearchQuery2.f19863e) == null) ? null : vocabularySort.getRoomColumnName())));
                }
                c3244l.getClass();
                c3244l.m15572j(null, arrayList);
                break;
            case 3:
                new VocabularySearchQuery();
                List<VocabularySearch> listM23605K2 = vz1.m23605K(VocabularySearch.StartsWith, VocabularySearch.EndsWith, VocabularySearch.Contains, VocabularySearch.PhraseContaining, VocabularySearch.MeaningContaining);
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM23605K2, 10));
                for (VocabularySearch vocabularySearch2 : listM23605K2) {
                    Integer numValueOf2 = Integer.valueOf(AbstractC3423or.m18226K(vocabularySearch2));
                    String columnName = vocabularySearch2.getColumnName();
                    VocabularySearchQuery vocabularySearchQuery3 = (VocabularySearchQuery) c3244l2.getValue();
                    arrayList2.add(new fv8(2, numValueOf2, null, vocabularySearch2.getColumnName(), fa4.m11650l(columnName, (vocabularySearchQuery3 == null || (vocabularySearch = vocabularySearchQuery3.f19861c) == null) ? null : vocabularySearch.getColumnName())));
                }
                c3244l.getClass();
                c3244l.m15572j(null, arrayList2);
                break;
            case 4:
                wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$getCourses$1(this, null), 3);
                wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$networkVocabularyCourses$1(this, null), 3);
                break;
            case 5:
                VocabularySearchQuery vocabularySearchQuery4 = (VocabularySearchQuery) c3244l2.getValue();
                if (((vocabularySearchQuery4 == null || (pair3 = vocabularySearchQuery4.f19867i) == null) ? null : (Integer) pair3.f47624b) == null || !((vocabularySearchQuery = (VocabularySearchQuery) c3244l2.getValue()) == null || (pair2 = vocabularySearchQuery.f19867i) == null || (num2 = (Integer) pair2.f47624b) == null || num2.intValue() != 0)) {
                    wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$getLessons$1(this, null), 3);
                    wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$networkVocabularyLessons$1(this, null), 3);
                } else {
                    wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$getCourseLessons$1(this, null), 3);
                    VocabularySearchQuery vocabularySearchQuery5 = (VocabularySearchQuery) c3244l2.getValue();
                    wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$networkCourseLessons$1(this, (vocabularySearchQuery5 == null || (pair = vocabularySearchQuery5.f19867i) == null || (num = (Integer) pair.f47624b) == null) ? 0 : num.intValue(), null), 3);
                }
                break;
            case 6:
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new VocabularyFilterSelectionViewModel$getLanguageTags$1(this, null), 2);
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new VocabularyFilterSelectionViewModel$networkLanguageTags$1(this, null), 2);
                break;
            case 7:
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new VocabularyFilterSelectionViewModel$getSRSDates$1(this, null), 2);
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new VocabularyFilterSelectionViewModel$networkUserLanguage$1(this, null), 2);
                break;
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9761W2(VocabularySearchQuery vocabularySearchQuery) {
        wfb.m23926u(lda.m16103C(this), null, null, new VocabularyFilterSelectionViewModel$updateStoreQuery$1(this, vocabularySearchQuery, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33677b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33677b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33677b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33677b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33677b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33677b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33677b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33677b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33677b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33677b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33677b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33677b.mo4598w2();
    }
}
