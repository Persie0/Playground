package com.lingq.feature.reader.preferences;

import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.ly7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.preferences.ReaderPreferencesStateHolder$state$3", m4291f = "ReaderPreferencesStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPreferencesStateHolder$state$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ly7 f29832a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Pair f29833b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderPreferencesStateHolder$state$3 readerPreferencesStateHolder$state$3 = new ReaderPreferencesStateHolder$state$3(3, (Continuation) obj3);
        readerPreferencesStateHolder$state$3.f29832a = (ly7) obj;
        readerPreferencesStateHolder$state$3.f29833b = (Pair) obj2;
        return readerPreferencesStateHolder$state$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ly7 ly7Var = this.f29832a;
        Pair pair = this.f29833b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean zBooleanValue = ((Boolean) pair.f47623a).booleanValue();
        AudioUnderlineMode audioUnderlineMode = (AudioUnderlineMode) pair.f47624b;
        C2469a.Companion.getClass();
        List list = C2469a.f29834m;
        boolean z = ly7Var.f50307a;
        float f = ly7Var.f50308b;
        float f2 = ly7Var.f50309c;
        boolean z2 = ly7Var.f50310d;
        boolean z3 = ly7Var.f50311e;
        audioUnderlineMode.getClass();
        list.getClass();
        return new ly7(z, f, f2, z2, z3, zBooleanValue, audioUnderlineMode, list);
    }
}
