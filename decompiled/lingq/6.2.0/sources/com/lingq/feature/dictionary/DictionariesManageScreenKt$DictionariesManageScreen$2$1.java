package com.lingq.feature.dictionary;

import com.lingq.core.domain.model.language.DictionaryData;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DictionariesManageScreenKt$DictionariesManageScreen$2$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        DictionaryData dictionaryData = (DictionaryData) obj;
        dictionaryData.getClass();
        C2066j c2066j = (C2066j) this.f47704b;
        c2066j.getClass();
        wfb.m23926u(lda.m16103C(c2066j), c2066j.f25839h, null, new DictionariesManageViewModel$removeDictionaryFromActive$1(c2066j, dictionaryData, null), 2);
        return xfa.f68157a;
    }
}
