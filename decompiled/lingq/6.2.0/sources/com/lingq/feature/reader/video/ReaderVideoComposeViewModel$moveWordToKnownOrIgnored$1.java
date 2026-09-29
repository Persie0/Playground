package com.lingq.feature.reader.video;

import com.lingq.core.data.repository.C1310z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nha;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {944}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f31212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1(C2583a c2583a, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f31210b = c2583a;
        this.f31211c = str;
        this.f31212d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1(this.f31210b, this.f31211c, this.f31212d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31209a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31210b;
            nha nhaVar = c2583a.f31343B;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int i2 = c2583a.f31348G;
            this.f31209a = 1;
            Object objM7429h = ((C1310z) ((s7b) nhaVar.f52742a)).m7429h(i2, strMo4589b2, this.f31211c, this.f31212d, "", this);
            if (objM7429h != coroutineSingletons) {
                objM7429h = xfaVar;
            }
            if (objM7429h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
