package com.lingq.feature.vocabulary.domain;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.kk8;
import p000.m83;
import p000.u0b;
import p000.vma;
import p000.wz0;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2826b {

    /* JADX INFO: renamed from: a */
    public final Object f33570a;

    public C2826b(u0b u0bVar) {
        u0bVar.getClass();
        this.f33570a = u0bVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m9747a(String str, ContinuationImpl continuationImpl) throws Throwable {
        GetVocabularySearchQueryForUseCase$current$1 getVocabularySearchQueryForUseCase$current$1;
        String str2;
        VocabularySearchQuery vocabularySearchQuery;
        if (continuationImpl instanceof GetVocabularySearchQueryForUseCase$current$1) {
            getVocabularySearchQueryForUseCase$current$1 = (GetVocabularySearchQueryForUseCase$current$1) continuationImpl;
            int i = getVocabularySearchQueryForUseCase$current$1.f33552d;
            if ((i & Integer.MIN_VALUE) != 0) {
                getVocabularySearchQueryForUseCase$current$1.f33552d = i - Integer.MIN_VALUE;
            } else {
                getVocabularySearchQueryForUseCase$current$1 = new GetVocabularySearchQueryForUseCase$current$1(this, continuationImpl);
            }
        } else {
            getVocabularySearchQueryForUseCase$current$1 = new GetVocabularySearchQueryForUseCase$current$1(this, continuationImpl);
        }
        Object objM15541t = getVocabularySearchQueryForUseCase$current$1.f33550b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getVocabularySearchQueryForUseCase$current$1.f33552d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            getVocabularySearchQueryForUseCase$current$1.f33549a = str;
            getVocabularySearchQueryForUseCase$current$1.f33552d = 1;
            if (m9748b(str, getVocabularySearchQueryForUseCase$current$1) != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = getVocabularySearchQueryForUseCase$current$1.f33549a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = getVocabularySearchQueryForUseCase$current$1.f33549a;
            AbstractC3193b.m15359b(objM15541t);
        }
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM15541t).get(str2);
        if (vocabularySearchQuery == null) {
            return new VocabularySearchQuery();
        }
        return vocabularySearchQuery;
        c83 c83Var = ((C1371d) ((vma) this.f33570a)).f18580q;
        getVocabularySearchQueryForUseCase$current$1.f33549a = str;
        getVocabularySearchQueryForUseCase$current$1.f33552d = 2;
        objM15541t = AbstractC3224d.m15541t(c83Var, getVocabularySearchQueryForUseCase$current$1);
        if (objM15541t != obj) {
            str2 = str;
            vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM15541t).get(str2);
            if (vocabularySearchQuery == null) {
                return new VocabularySearchQuery();
            }
            return vocabularySearchQuery;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m9748b(String str, ContinuationImpl continuationImpl) throws Throwable {
        GetVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1 getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1;
        vma vmaVar = (vma) this.f33570a;
        if (continuationImpl instanceof GetVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1) {
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1 = (GetVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1) continuationImpl;
            int i = getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33556d;
            if ((i & Integer.MIN_VALUE) != 0) {
                getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33556d = i - Integer.MIN_VALUE;
            } else {
                getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1 = new GetVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1(this, continuationImpl);
            }
        } else {
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1 = new GetVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1(this, continuationImpl);
        }
        Object objM15541t = getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33554b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33556d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18580q;
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33553a = str;
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33556d = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33553a;
        AbstractC3193b.m15359b(objM15541t);
        Map map = (Map) objM15541t;
        if (map.get(str) == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, new VocabularySearchQuery());
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33553a = null;
            getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1.f33556d = 2;
            if (((C1371d) vmaVar).m7974n(linkedHashMap, getVocabularySearchQueryForUseCase$ensureVocabularySearchQuery$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: c */
    public c83 m9749c(String str) {
        str.getClass();
        return AbstractC3224d.m15536o(new wz0(11, new m83(((C1371d) ((vma) this.f33570a)).f18580q, new GetVocabularySearchQueryForUseCase$invoke$1(this, str, null)), str));
    }

    /* JADX INFO: renamed from: d */
    public kk8 m9750d(String str, int i, String str2, VocabularyContentFilter vocabularyContentFilter, String str3) {
        str.getClass();
        str2.getClass();
        vocabularyContentFilter.getClass();
        return new kk8(new GetVocabularyCardsUseCase$invoke$1(this, str, i, str2, vocabularyContentFilter, str3, null));
    }

    public C2826b(vma vmaVar) {
        vmaVar.getClass();
        this.f33570a = vmaVar;
    }
}
