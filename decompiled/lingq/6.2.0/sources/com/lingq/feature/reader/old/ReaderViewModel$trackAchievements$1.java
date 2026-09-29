package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.az5;
import p000.bz5;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$trackAchievements$1", m4291f = "ReaderViewModel.kt", m4292l = {2326, 2327}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$trackAchievements$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$trackAchievements$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29143b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$trackAchievements$1(this.f29143b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$trackAchievements$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r5.f29143b.mo4239l2(0, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29142a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29142a = 1;
            if (AbstractC3208a.m15437d(2000L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        this.f29142a = 2;
        az5 az5Var = bz5.Companion;
    }
}
