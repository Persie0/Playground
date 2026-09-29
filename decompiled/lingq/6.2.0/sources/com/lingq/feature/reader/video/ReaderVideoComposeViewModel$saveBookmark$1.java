package com.lingq.feature.reader.video;

import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dsa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$saveBookmark$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {565}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$saveBookmark$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$saveBookmark$1(C2583a c2583a, int i, Continuation continuation) {
        super(2, continuation);
        this.f31276b = c2583a;
        this.f31277c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$saveBookmark$1(this.f31276b, this.f31277c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$saveBookmark$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31275a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31276b;
            C1384f c1384f = c2583a.f31388u;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int i2 = c2583a.f31348G;
            ReaderBookmarkMode readerBookmarkMode = ((dsa) c2583a.f31354M.getValue()).f36184d ? ReaderBookmarkMode.VideoImmersive : ReaderBookmarkMode.VideoScroll;
            Integer num = new Integer(c2583a.f31372e.m9519a());
            this.f31275a = 1;
            if (c1384f.m7995a(strMo4589b2, i2, this.f31277c, readerBookmarkMode, num, this) == coroutineSingletons) {
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
