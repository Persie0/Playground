package com.lingq.feature.reader.reader.p017ui;

import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.C3226f;
import p000.C3386nv;
import p000.c32;
import p000.kk8;
import p000.sv7;
import p000.un1;
import p000.vi3;
import p000.x81;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ui.ReaderContentKt$ReaderContent$6$10$1", m4291f = "ReaderContent.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentKt$ReaderContent$6$10$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0150d f30343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f30344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentKt$ReaderContent$6$10$1(AbstractC0150d abstractC0150d, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f30343b = abstractC0150d;
        this.f30344c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentKt$ReaderContent$6$10$1(this.f30343b, this.f30344c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentKt$ReaderContent$6$10$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30342a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            kk8 kk8VarM1264n = AbstractC0278f.m1264n(new sv7(this.f30343b, 0));
            x81 x81Var = new x81(this.f30344c, 2);
            this.f30342a = 1;
            Object objCollect = kk8VarM1264n.collect(new C3226f(new Ref$IntRef(), x81Var), this);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = xfaVar;
            }
            if (objCollect == coroutineSingletons) {
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
