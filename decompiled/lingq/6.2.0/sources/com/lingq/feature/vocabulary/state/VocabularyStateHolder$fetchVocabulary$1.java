package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import com.lingq.feature.vocabulary.domain.C2826b;
import com.lingq.feature.vocabulary.domain.C2827c;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eo1;
import p000.h0a;
import p000.n1b;
import p000.sm5;
import p000.u0b;
import p000.vi3;
import p000.vk9;
import p000.xfa;
import p000.zw2;
import p000.zza;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$fetchVocabulary$1", m4291f = "VocabularyStateHolder.kt", m4292l = {278, 287, 288}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$fetchVocabulary$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33754a;

    /* JADX INFO: renamed from: b */
    public C2862d f33755b;

    /* JADX INFO: renamed from: c */
    public int f33756c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2862d f33757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$fetchVocabulary$1(C2862d c2862d, Continuation continuation) {
        super(1, continuation);
        this.f33757d = c2862d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new VocabularyStateHolder$fetchVocabulary$1(this.f33757d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((VocabularyStateHolder$fetchVocabulary$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r0 == r9) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        vi3 vi3Var;
        boolean z;
        boolean z2;
        Object objM22378a;
        int iIntValue;
        Object objM9747a;
        C2862d c2862d;
        String str;
        Object objM9751a;
        VocabularyStateHolder$fetchVocabulary$1 vocabularyStateHolder$fetchVocabulary$1 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = vocabularyStateHolder$fetchVocabulary$1.f33756c;
        int i2 = 2;
        final C2862d c2862d2 = vocabularyStateHolder$fetchVocabulary$1.f33757d;
        try {
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw2 zw2Var = c2862d2.f33797c;
                    String str2 = c2862d2.f33810p;
                    int iM9769b = c2862d2.m9769b();
                    String strM9770c = c2862d2.m9770c();
                    VocabularyContentFilter vocabularyContentFilterM9768a = c2862d2.m9768a();
                    String str3 = c2862d2.f33814t.f19864f;
                    if (vk9.m23391n0(str3)) {
                        str3 = null;
                    }
                    vocabularyStateHolder$fetchVocabulary$1.f33756c = 1;
                    u0b u0bVar = zw2Var.f72294a;
                    if (vocabularyContentFilterM9768a == VocabularyContentFilter.SrsDue) {
                        z = true;
                        z2 = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    objM22378a = u0b.m22378a(u0bVar, str2, iM9769b, strM9770c, z2, vocabularyContentFilterM9768a == VocabularyContentFilter.Phrases ? z : false, str3, vocabularyStateHolder$fetchVocabulary$1, 64);
                    vocabularyStateHolder$fetchVocabulary$1 = vocabularyStateHolder$fetchVocabulary$1;
                    if (objM22378a == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    objM22378a = obj;
                } else if (i == 2) {
                    iIntValue = vocabularyStateHolder$fetchVocabulary$1.f33754a;
                    C2862d c2862d3 = vocabularyStateHolder$fetchVocabulary$1.f33755b;
                    AbstractC3193b.m15359b(obj);
                    c2862d = c2862d3;
                    objM9747a = obj;
                    c2862d.f33814t = (VocabularySearchQuery) objM9747a;
                    C2827c c2827c = c2862d2.f33799e;
                    String str4 = c2862d2.f33810p;
                    String strM9770c2 = c2862d2.m9770c();
                    VocabularyContentFilter vocabularyContentFilterM9768a2 = c2862d2.m9768a();
                    str = c2862d2.f33814t.f19864f;
                    if (vk9.m23391n0(str)) {
                        str = null;
                    }
                    int i3 = c2862d2.f33814t.f19862d;
                    vocabularyStateHolder$fetchVocabulary$1.f33755b = null;
                    vocabularyStateHolder$fetchVocabulary$1.f33754a = iIntValue;
                    vocabularyStateHolder$fetchVocabulary$1.f33756c = 3;
                    objM9751a = c2827c.m9751a(str4, strM9770c2, vocabularyContentFilterM9768a2, str, i3, vocabularyStateHolder$fetchVocabulary$1);
                } else {
                    if (i != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                    objM9751a = obj;
                }
                c2862d2.m9773f(new eo1(((Number) objM9751a).intValue(), c2862d2, i2));
                c2862d2.f33816v = false;
                c2862d2.f33818x = false;
                vi3Var = new vi3() { // from class: com.lingq.feature.vocabulary.state.c
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        n1b n1bVar = (n1b) obj2;
                        return n1b.m17171a(n1bVar, null, zza.m25902a(n1bVar.f52192b, null, null, c2862d2.f33812r, 3), null, null, null, false, false, false, false, null, null, 2045);
                    }
                };
                c2862d2.m9773f(vi3Var);
                return xfa.f68157a;
                iIntValue = ((Number) ((Triple) objM22378a).f47634b).intValue();
                c2862d2.f33812r = iIntValue;
                C2826b c2826b = c2862d2.f33795a;
                String str5 = c2862d2.f33810p;
                vocabularyStateHolder$fetchVocabulary$1.f33755b = c2862d2;
                vocabularyStateHolder$fetchVocabulary$1.f33754a = iIntValue;
                vocabularyStateHolder$fetchVocabulary$1.f33756c = 2;
                objM9747a = c2826b.m9747a(str5, vocabularyStateHolder$fetchVocabulary$1);
                if (objM9747a != coroutineSingletons) {
                    c2862d = c2862d2;
                    c2862d.f33814t = (VocabularySearchQuery) objM9747a;
                    C2827c c2827c2 = c2862d2.f33799e;
                    String str6 = c2862d2.f33810p;
                    String strM9770c3 = c2862d2.m9770c();
                    VocabularyContentFilter vocabularyContentFilterM9768a3 = c2862d2.m9768a();
                    str = c2862d2.f33814t.f19864f;
                    if (vk9.m23391n0(str)) {
                        str = null;
                    }
                    int i4 = c2862d2.f33814t.f19862d;
                    vocabularyStateHolder$fetchVocabulary$1.f33755b = null;
                    vocabularyStateHolder$fetchVocabulary$1.f33754a = iIntValue;
                    vocabularyStateHolder$fetchVocabulary$1.f33756c = 3;
                    objM9751a = c2827c2.m9751a(str6, strM9770c3, vocabularyContentFilterM9768a3, str, i4, vocabularyStateHolder$fetchVocabulary$1);
                }
                return coroutineSingletons;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                sm5.Companion.getClass();
                h0a.f41641a.mo11432c(e2);
                c2862d2.f33816v = false;
                c2862d2.f33818x = false;
                vi3Var = new vi3() { // from class: com.lingq.feature.vocabulary.state.c
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        n1b n1bVar = (n1b) obj2;
                        return n1b.m17171a(n1bVar, null, zza.m25902a(n1bVar.f52192b, null, null, c2862d2.f33812r, 3), null, null, null, false, false, false, false, null, null, 2045);
                    }
                };
            }
        } catch (Throwable th) {
            c2862d2.f33816v = false;
            c2862d2.f33818x = false;
            c2862d2.m9773f(new vi3() { // from class: com.lingq.feature.vocabulary.state.c
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    n1b n1bVar = (n1b) obj2;
                    return n1b.m17171a(n1bVar, null, zza.m25902a(n1bVar.f52192b, null, null, c2862d2.f33812r, 3), null, null, null, false, false, false, false, null, null, 2045);
                }
            });
            throw th;
        }
    }
}
