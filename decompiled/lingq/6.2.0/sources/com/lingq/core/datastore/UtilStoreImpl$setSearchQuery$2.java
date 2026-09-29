package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import java.util.Map;
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
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setSearchQuery$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setSearchQuery$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setSearchQuery$2(C1371d c1371d, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18238b = c1371d;
        this.f18239c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setSearchQuery$2 utilStoreImpl$setSearchQuery$2 = new UtilStoreImpl$setSearchQuery$2(this.f18238b, this.f18239c, continuation);
        utilStoreImpl$setSearchQuery$2.f18237a = obj;
        return utilStoreImpl$setSearchQuery$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setSearchQuery$2 utilStoreImpl$setSearchQuery$2 = (UtilStoreImpl$setSearchQuery$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setSearchQuery$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18237a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18238b;
        mutablePreferences.set(c1371d.f18566c, c1371d.f18564a.m10322b(new je5(sk9.f60959a, LibrarySearchQuery.Companion.serializer()), this.f18239c));
        return xfa.f68157a;
    }
}
