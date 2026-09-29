package com.lingq.feature.vocabulary.filter;

import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.gm5;
import p000.lda;
import p000.lya;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class VocabularyFilterScreenKt$VocabularyFilterRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        lya lyaVar = (lya) obj;
        lyaVar.getClass();
        C2851c c2851c = (C2851c) this.f47704b;
        c2851c.getClass();
        if (!(lyaVar instanceof lya)) {
            gm5.m12750e();
            return null;
        }
        wfb.m23926u(lda.m16103C(c2851c), null, null, new VocabularyFilterViewModel$updateQueryWith$1(c2851c, new Pair(Integer.valueOf(lyaVar.f50318a), Integer.valueOf(lyaVar.f50319b)), null), 3);
        return xfa.f68157a;
    }
}
