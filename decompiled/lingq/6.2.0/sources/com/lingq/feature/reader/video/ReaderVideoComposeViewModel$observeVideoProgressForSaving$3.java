package com.lingq.feature.reader.video;

import com.lingq.core.domain.lesson.C1385g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoProgressForSaving$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {483}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeVideoProgressForSaving$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31255a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f31256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeVideoProgressForSaving$3(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31257c = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeVideoProgressForSaving$3 readerVideoComposeViewModel$observeVideoProgressForSaving$3 = new ReaderVideoComposeViewModel$observeVideoProgressForSaving$3(this.f31257c, continuation);
        readerVideoComposeViewModel$observeVideoProgressForSaving$3.f31256b = ((Number) obj).longValue();
        return readerVideoComposeViewModel$observeVideoProgressForSaving$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$observeVideoProgressForSaving$3) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j = this.f31256b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31255a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31257c;
            c2583a.f31368a0 = j;
            C1385g c1385g = c2583a.f31385r;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int i2 = c2583a.f31348G;
            Integer num = new Integer(c2583a.f31372e.m9519a());
            this.f31256b = j;
            this.f31255a = 1;
            if (c1385g.m7996a(strMo4589b2, i2, j, num, this) == coroutineSingletons) {
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
