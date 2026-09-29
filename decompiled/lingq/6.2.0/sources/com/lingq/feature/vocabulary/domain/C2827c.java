package com.lingq.feature.vocabulary.domain;

import com.lingq.core.data.repository.C1308x;
import com.lingq.core.datastore.C1371d;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.ob1;
import p000.u0b;
import p000.vma;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.domain.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2827c {

    /* JADX INFO: renamed from: a */
    public final u0b f33571a;

    /* JADX INFO: renamed from: b */
    public final vma f33572b;

    /* JADX INFO: renamed from: c */
    public final ob1 f33573c;

    public C2827c(u0b u0bVar, vma vmaVar, ob1 ob1Var) {
        u0bVar.getClass();
        vmaVar.getClass();
        ob1Var.getClass();
        this.f33571a = u0bVar;
        this.f33572b = vmaVar;
        this.f33573c = ob1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (r3 == r4) goto L47;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9751a(String str, String str2, VocabularyContentFilter vocabularyContentFilter, String str3, int i, ContinuationImpl continuationImpl) throws Throwable {
        GetVocabularyTotalPagesUseCase$invoke$1 getVocabularyTotalPagesUseCase$invoke$1;
        int i2;
        String str4;
        if (continuationImpl instanceof GetVocabularyTotalPagesUseCase$invoke$1) {
            getVocabularyTotalPagesUseCase$invoke$1 = (GetVocabularyTotalPagesUseCase$invoke$1) continuationImpl;
            int i3 = getVocabularyTotalPagesUseCase$invoke$1.f33567e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getVocabularyTotalPagesUseCase$invoke$1.f33567e = i3 - Integer.MIN_VALUE;
            } else {
                getVocabularyTotalPagesUseCase$invoke$1 = new GetVocabularyTotalPagesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getVocabularyTotalPagesUseCase$invoke$1 = new GetVocabularyTotalPagesUseCase$invoke$1(this, continuationImpl);
        }
        GetVocabularyTotalPagesUseCase$invoke$1 getVocabularyTotalPagesUseCase$invoke$2 = getVocabularyTotalPagesUseCase$invoke$1;
        Object objM7415i = getVocabularyTotalPagesUseCase$invoke$2.f33565c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getVocabularyTotalPagesUseCase$invoke$2.f33567e;
        if (i4 != 0) {
            if (i4 == 1) {
                str4 = getVocabularyTotalPagesUseCase$invoke$2.f33563a;
                AbstractC3193b.m15359b(objM7415i);
                Integer num = (Integer) ((Map) objM7415i).get(str4);
                int iIntValue = num != null ? num.intValue() : 0;
                return new Integer(iIntValue >= 1 ? iIntValue : 1);
            }
            if (i4 == 2) {
                i2 = getVocabularyTotalPagesUseCase$invoke$2.f33564b;
                AbstractC3193b.m15359b(objM7415i);
                getVocabularyTotalPagesUseCase$invoke$2.f33563a = null;
                getVocabularyTotalPagesUseCase$invoke$2.f33564b = i2;
                getVocabularyTotalPagesUseCase$invoke$2.f33567e = 3;
                objM7415i = AbstractC3224d.m15541t((c83) objM7415i, getVocabularyTotalPagesUseCase$invoke$2);
            } else {
                if (i4 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = getVocabularyTotalPagesUseCase$invoke$2.f33564b;
                AbstractC3193b.m15359b(objM7415i);
            }
            int iCeil = (int) Math.ceil(((double) ((Number) objM7415i).intValue()) / ((double) i2));
            return new Integer(iCeil >= 1 ? iCeil : 1);
        }
        AbstractC3193b.m15359b(objM7415i);
        if (this.f33573c.m17895i()) {
            c83 c83Var = ((C1371d) this.f33572b).f18561A;
            getVocabularyTotalPagesUseCase$invoke$2.f33563a = str;
            getVocabularyTotalPagesUseCase$invoke$2.f33564b = i;
            getVocabularyTotalPagesUseCase$invoke$2.f33567e = 1;
            Object objM15541t = AbstractC3224d.m15541t(c83Var, getVocabularyTotalPagesUseCase$invoke$2);
            if (objM15541t != coroutineSingletons) {
                objM7415i = objM15541t;
                str4 = str;
                Integer num2 = (Integer) ((Map) objM7415i).get(str4);
                if (num2 != null) {
                }
                return new Integer(iIntValue >= 1 ? iIntValue : 1);
            }
        } else {
            boolean z = vocabularyContentFilter == VocabularyContentFilter.SrsDue;
            boolean z2 = vocabularyContentFilter == VocabularyContentFilter.Phrases;
            getVocabularyTotalPagesUseCase$invoke$2.f33563a = null;
            getVocabularyTotalPagesUseCase$invoke$2.f33564b = i;
            getVocabularyTotalPagesUseCase$invoke$2.f33567e = 2;
            objM7415i = ((C1308x) this.f33571a).m7415i(str, str2, z, z2, str3, getVocabularyTotalPagesUseCase$invoke$2);
            if (objM7415i != coroutineSingletons) {
                i2 = i;
                getVocabularyTotalPagesUseCase$invoke$2.f33563a = null;
                getVocabularyTotalPagesUseCase$invoke$2.f33564b = i2;
                getVocabularyTotalPagesUseCase$invoke$2.f33567e = 3;
                objM7415i = AbstractC3224d.m15541t((c83) objM7415i, getVocabularyTotalPagesUseCase$invoke$2);
            }
        }
        return coroutineSingletons;
    }
}
