package com.lingq.feature.reader.reader.p017ui;

import android.content.ClipData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3610tg;
import p000.c32;
import p000.t31;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ui.ReaderContentKt$ReaderContent$6$15$1$1$1", m4291f = "ReaderContent.kt", m4292l = {499}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentKt$ReaderContent$6$15$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t31 f30352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentKt$ReaderContent$6$15$1$1$1(t31 t31Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f30352b = t31Var;
        this.f30353c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentKt$ReaderContent$6$15$1$1$1(this.f30352b, this.f30353c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentKt$ReaderContent$6$15$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30351a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ClipData clipDataNewPlainText = ClipData.newPlainText("", this.f30353c);
        clipDataNewPlainText.getClass();
        this.f30351a = 1;
        ((C3610tg) this.f30352b).f62240a.m3360m().setPrimaryClip(clipDataNewPlainText);
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
