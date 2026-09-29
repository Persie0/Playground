package com.lingq.core.achievements;

import com.lingq.core.datastore.C1371d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakViewModel$1", m4291f = "RepairStreakViewModel.kt", m4292l = {53, 55}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vma f14217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1236c f14218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakViewModel$1(vma vmaVar, C1236c c1236c, Continuation continuation) {
        super(2, continuation);
        this.f14217b = vmaVar;
        this.f14218c = c1236c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakViewModel$1(this.f14217b, this.f14218c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r2).m7971k(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14216a;
        vma vmaVar = this.f14217b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83Var = ((C1371d) vmaVar).f18588y;
            this.f14216a = 1;
            obj = AbstractC3224d.m15541t(c83Var, this);
            if (obj != coroutineSingletons) {
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
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
        linkedHashMapM15372Y.put(this.f14218c.f14226b.mo4589b2(), y02.m24803a());
        this.f14216a = 2;
    }
}
