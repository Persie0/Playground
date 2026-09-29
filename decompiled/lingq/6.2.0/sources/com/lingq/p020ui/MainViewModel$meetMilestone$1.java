package com.lingq.p020ui;

import com.lingq.core.data.repository.C1298n;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.xy5;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$meetMilestone$1", m4291f = "MainViewModel.kt", m4292l = {299, 302}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$meetMilestone$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f34131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$meetMilestone$1(C2889e c2889e, String str, Continuation continuation) {
        super(2, continuation);
        this.f34130b = c2889e;
        this.f34131c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$meetMilestone$1(this.f34130b, this.f34131c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$meetMilestone$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (((com.lingq.core.data.repository.C1298n) r0).m7331b(r8, r7) == r2) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2889e c2889e = this.f34130b;
        cma cmaVar = c2889e.f34200b;
        xy5 xy5Var = c2889e.f34213o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34129a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                String strMo4589b2 = cmaVar.mo4589b2();
                String strM24803a = y02.m24803a();
                this.f34129a = 1;
                if (((C1298n) xy5Var).m7330a(strMo4589b2, this.f34131c, strM24803a, this) != coroutineSingletons) {
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
            String strMo4589b3 = cmaVar.mo4589b2();
            this.f34129a = 2;
        } catch (Exception unused) {
        }
    }
}
