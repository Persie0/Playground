package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setVocabularySearchQuery$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setVocabularySearchQuery$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashMap f18254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setVocabularySearchQuery$2(C1371d c1371d, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f18253b = c1371d;
        this.f18254c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setVocabularySearchQuery$2 utilStoreImpl$setVocabularySearchQuery$2 = new UtilStoreImpl$setVocabularySearchQuery$2(this.f18253b, this.f18254c, continuation);
        utilStoreImpl$setVocabularySearchQuery$2.f18252a = obj;
        return utilStoreImpl$setVocabularySearchQuery$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setVocabularySearchQuery$2 utilStoreImpl$setVocabularySearchQuery$2 = (UtilStoreImpl$setVocabularySearchQuery$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setVocabularySearchQuery$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18252a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18253b;
        mutablePreferences.set(c1371d.f18567d, c1371d.f18564a.m10322b(new je5(sk9.f60959a, VocabularySearchQuery.Companion.serializer()), this.f18254c));
        return xfa.f68157a;
    }
}
