package com.lingq.feature.vocabulary.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.u0b;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetVocabularyCardsUseCase$invoke$1", m4291f = "GetVocabularyCardsUseCase.kt", m4292l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 22}, m4293m = "invokeSuspend", m4294v = 2)
final class GetVocabularyCardsUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public e83 f33540a;

    /* JADX INFO: renamed from: b */
    public int f33541b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33542c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2826b f33543d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f33544e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f33545f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f33546g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ VocabularyContentFilter f33547h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f33548i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVocabularyCardsUseCase$invoke$1(C2826b c2826b, String str, int i, String str2, VocabularyContentFilter vocabularyContentFilter, String str3, Continuation continuation) {
        super(2, continuation);
        this.f33543d = c2826b;
        this.f33544e = str;
        this.f33545f = i;
        this.f33546g = str2;
        this.f33547h = vocabularyContentFilter;
        this.f33548i = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetVocabularyCardsUseCase$invoke$1 getVocabularyCardsUseCase$invoke$1 = new GetVocabularyCardsUseCase$invoke$1(this.f33543d, this.f33544e, this.f33545f, this.f33546g, this.f33547h, this.f33548i, continuation);
        getVocabularyCardsUseCase$invoke$1.f33542c = obj;
        return getVocabularyCardsUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetVocabularyCardsUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r9, (p000.c83) r0, r13) == r10) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM22379b;
        e83 e83Var = (e83) this.f33542c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33541b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f33540a;
                AbstractC3193b.m15359b(obj);
                objM22379b = obj;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        u0b u0bVar = (u0b) this.f33543d.f33570a;
        VocabularyContentFilter vocabularyContentFilter = VocabularyContentFilter.SrsDue;
        VocabularyContentFilter vocabularyContentFilter2 = this.f33547h;
        boolean z = vocabularyContentFilter2 == vocabularyContentFilter;
        boolean z2 = vocabularyContentFilter2 == VocabularyContentFilter.Phrases;
        this.f33542c = null;
        this.f33540a = e83Var;
        this.f33541b = 1;
        objM22379b = u0b.m22379b(u0bVar, this.f33544e, this.f33545f, this.f33546g, z, z2, this.f33548i, this, 64);
        if (objM22379b != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f33542c = null;
        this.f33540a = null;
        this.f33541b = 2;
    }
}
