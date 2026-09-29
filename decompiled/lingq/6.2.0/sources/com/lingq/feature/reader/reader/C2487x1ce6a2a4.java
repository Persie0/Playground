package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.lv7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$$inlined$flatMapLatest$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2487x1ce6a2a4 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30041b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2493a f30043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487x1ce6a2a4(C2493a c2493a, Continuation continuation) {
        super(3, continuation);
        this.f30043d = c2493a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2487x1ce6a2a4 c2487x1ce6a2a4 = new C2487x1ce6a2a4(this.f30043d, (Continuation) obj3);
        c2487x1ce6a2a4.f30041b = (e83) obj;
        c2487x1ce6a2a4.f30042c = obj2;
        return c2487x1ce6a2a4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30041b;
        Object obj2 = this.f30042c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30040a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            C2493a c2493a = this.f30043d;
            c83 c3228h = zBooleanValue ? new C3228h(c2493a.f30196R, c2493a.f30197S, new ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1(zBooleanValue, null)) : new lv7(c2493a.f30218h.f29783q, zBooleanValue);
            this.f30041b = null;
            this.f30042c = null;
            this.f30040a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3228h, this) == coroutineSingletons) {
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
