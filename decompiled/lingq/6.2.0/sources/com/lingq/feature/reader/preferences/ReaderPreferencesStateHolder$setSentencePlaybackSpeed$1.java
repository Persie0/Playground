package com.lingq.feature.reader.preferences;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.preferences.ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1", m4291f = "ReaderPreferencesStateHolder.kt", m4292l = {119}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2469a f29820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f29821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1(C2469a c2469a, float f, Continuation continuation) {
        super(2, continuation);
        this.f29820b = c2469a;
        this.f29821c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1(this.f29820b, this.f29821c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29819a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f29820b.f29835a;
            this.f29819a = 1;
            if (((C1368a) si7Var).m7863V(this.f29821c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
