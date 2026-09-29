package com.lingq.feature.reader.video;

import com.lingq.feature.reader.video.state.C2597c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ac7;
import p000.bj3;
import p000.c32;
import p000.hqa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$consolidatedPlayerState$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$consolidatedPlayerState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ hqa f31192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ac7 f31193b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f31194c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2583a f31195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$consolidatedPlayerState$1(C2583a c2583a, Continuation continuation) {
        super(4, continuation);
        this.f31195d = c2583a;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ReaderVideoComposeViewModel$consolidatedPlayerState$1 readerVideoComposeViewModel$consolidatedPlayerState$1 = new ReaderVideoComposeViewModel$consolidatedPlayerState$1(this.f31195d, (Continuation) obj4);
        readerVideoComposeViewModel$consolidatedPlayerState$1.f31192a = (hqa) obj;
        readerVideoComposeViewModel$consolidatedPlayerState$1.f31193b = (ac7) obj2;
        readerVideoComposeViewModel$consolidatedPlayerState$1.f31194c = zBooleanValue;
        return readerVideoComposeViewModel$consolidatedPlayerState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        hqa hqaVar = this.f31192a;
        ac7 ac7Var = this.f31193b;
        boolean z = this.f31194c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        long j = hqaVar.f42793a;
        long j2 = hqaVar.f42794b;
        boolean z2 = hqaVar.f42795c;
        boolean z3 = hqaVar.f42796d;
        C2597c c2597c = this.f31195d.f31376i;
        C3244l c3244l = c2597c.f31553c;
        return new hqa(j, j2, z2, z3, ac7Var, (((hqa) c3244l.getValue()).f42796d ? ((hqa) c3244l.getValue()).f42793a : c2597c.f31567q) / 1000.0f, z);
    }
}
