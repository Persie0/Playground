package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.l84;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setVocabularyPagesCount$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setVocabularyPagesCount$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setVocabularyPagesCount$2(C1371d c1371d, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18250b = c1371d;
        this.f18251c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setVocabularyPagesCount$2 utilStoreImpl$setVocabularyPagesCount$2 = new UtilStoreImpl$setVocabularyPagesCount$2(this.f18250b, this.f18251c, continuation);
        utilStoreImpl$setVocabularyPagesCount$2.f18249a = obj;
        return utilStoreImpl$setVocabularyPagesCount$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setVocabularyPagesCount$2 utilStoreImpl$setVocabularyPagesCount$2 = (UtilStoreImpl$setVocabularyPagesCount$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setVocabularyPagesCount$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18249a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18250b;
        mutablePreferences.set(c1371d.f18577n, c1371d.f18564a.m10322b(new je5(sk9.f60959a, l84.f49294a), this.f18251c));
        return xfa.f68157a;
    }
}
