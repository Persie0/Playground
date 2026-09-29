package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.C3513qw;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$$inlined$flatMapLatest$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2478x94b7e943 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29995a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29996b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29997c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2493a f29998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2478x94b7e943(C2493a c2493a, Continuation continuation) {
        super(3, continuation);
        this.f29998d = c2493a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2478x94b7e943 c2478x94b7e943 = new C2478x94b7e943(this.f29998d, (Continuation) obj3);
        c2478x94b7e943.f29996b = (e83) obj;
        c2478x94b7e943.f29997c = obj2;
        return c2478x94b7e943.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29996b;
        Object obj2 = this.f29997c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29995a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            C2493a c2493a = this.f29998d;
            c83 c3228h = zBooleanValue ? new C3228h(c2493a.f30196R, c2493a.f30197S, new ReaderComposeViewModel$observeLessonStudyTracking$6$1(3, null)) : new C3513qw(c2493a.f30218h.f29783q, 22);
            this.f29996b = null;
            this.f29997c = null;
            this.f29995a = 1;
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
