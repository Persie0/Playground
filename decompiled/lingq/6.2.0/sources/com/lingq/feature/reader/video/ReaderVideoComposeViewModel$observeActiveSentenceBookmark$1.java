package com.lingq.feature.reader.video;

import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.feature.reader.video.state.C2595a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dsa;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {499}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31213a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f31214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31215c = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1 readerVideoComposeViewModel$observeActiveSentenceBookmark$1 = new ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1(this.f31215c, continuation);
        readerVideoComposeViewModel$observeActiveSentenceBookmark$1.f31214b = ((Number) obj).intValue();
        return readerVideoComposeViewModel$observeActiveSentenceBookmark$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2583a c2583a = this.f31215c;
        C2595a c2595a = c2583a.f31372e;
        int i = this.f31214b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f31213a;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Integer numM9523e = c2595a.m9523e(i);
        if (numM9523e != null) {
            int iIntValue = numM9523e.intValue();
            C1384f c1384f = c2583a.f31388u;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int i3 = c2583a.f31348G;
            ReaderBookmarkMode readerBookmarkMode = ((dsa) c2583a.f31354M.getValue()).f36184d ? ReaderBookmarkMode.VideoImmersive : ReaderBookmarkMode.VideoScroll;
            Integer num = new Integer(c2595a.m9519a());
            this.f31214b = i;
            this.f31213a = 1;
            if (c1384f.m7995a(strMo4589b2, i3, iIntValue, readerBookmarkMode, num, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
