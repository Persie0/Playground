package com.lingq.feature.library.domain;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.d65;
import p000.nm7;
import p000.xfa;
import p000.xo1;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.library.domain.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2145b {

    /* JADX INFO: renamed from: a */
    public final d65 f26649a;

    /* JADX INFO: renamed from: b */
    public final xo1 f26650b;

    /* JADX INFO: renamed from: c */
    public final y95 f26651c;

    public C2145b(d65 d65Var, xo1 xo1Var, y95 y95Var, nm7 nm7Var) {
        d65Var.getClass();
        xo1Var.getClass();
        y95Var.getClass();
        nm7Var.getClass();
        this.f26649a = d65Var;
        this.f26650b = xo1Var;
        this.f26651c = y95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9062a(String str, int i, int i2, Continuation continuation) throws Throwable {
        HandleLibraryActionsServiceImpl$buyLesson$1 handleLibraryActionsServiceImpl$buyLesson$1;
        if (continuation instanceof HandleLibraryActionsServiceImpl$buyLesson$1) {
            handleLibraryActionsServiceImpl$buyLesson$1 = (HandleLibraryActionsServiceImpl$buyLesson$1) continuation;
            int i3 = handleLibraryActionsServiceImpl$buyLesson$1.f26643c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                handleLibraryActionsServiceImpl$buyLesson$1.f26643c = i3 - Integer.MIN_VALUE;
            } else {
                handleLibraryActionsServiceImpl$buyLesson$1 = new HandleLibraryActionsServiceImpl$buyLesson$1(this, (ContinuationImpl) continuation);
            }
        } else {
            handleLibraryActionsServiceImpl$buyLesson$1 = new HandleLibraryActionsServiceImpl$buyLesson$1(this, (ContinuationImpl) continuation);
        }
        Object obj = handleLibraryActionsServiceImpl$buyLesson$1.f26641a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = handleLibraryActionsServiceImpl$buyLesson$1.f26643c;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            handleLibraryActionsServiceImpl$buyLesson$1.f26643c = 1;
            if (((C1295k) this.f26649a).m7274f(i, i2, true, handleLibraryActionsServiceImpl$buyLesson$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m9063b(int i, int i2, String str, SuspendLambda suspendLambda, boolean z) throws Throwable {
        Object objM7297q0 = ((C1295k) this.f26649a).m7297q0(i, i2, z, str, suspendLambda);
        return objM7297q0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7297q0 : xfa.f68157a;
    }
}
