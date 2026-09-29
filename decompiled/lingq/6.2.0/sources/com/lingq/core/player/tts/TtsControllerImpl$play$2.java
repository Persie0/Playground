package com.lingq.core.player.tts;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ada;
import p000.c32;
import p000.fa4;
import p000.jw2;
import p000.mn7;
import p000.n97;
import p000.pu5;
import p000.un1;
import p000.xfa;
import p000.z0a;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$play$2", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$play$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f22084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f22085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pu5 f22086c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mn7 f22087d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f22088e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f22089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$play$2(C1819c c1819c, float f, pu5 pu5Var, mn7 mn7Var, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22084a = c1819c;
        this.f22085b = f;
        this.f22086c = pu5Var;
        this.f22087d = mn7Var;
        this.f22088e = str;
        this.f22089f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$play$2(this.f22084a, this.f22085b, this.f22086c, this.f22087d, this.f22088e, this.f22089f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TtsControllerImpl$play$2 ttsControllerImpl$play$2 = (TtsControllerImpl$play$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        ttsControllerImpl$play$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1819c c1819c = this.f22084a;
        C3244l c3244l = c1819c.f22174l;
        jw2 jw2Var = c1819c.f22172j;
        jw2Var.m14697C(new n97(this.f22085b, 1.0f));
        z0a z0aVarM14716l = jw2Var.m14716l();
        boolean zM11650l = fa4.m11650l(z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo39m(jw2Var.m14712h(), jw2Var.f46280a, 0L).f69065b, this.f22086c);
        boolean z = this.f22089f;
        String str = this.f22088e;
        if (zM11650l && jw2Var.m14722s()) {
            jw2Var.m14699E();
            jw2Var.m14707c();
            jw2Var.m14726x();
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, new ada(str, false, z, false)));
        } else {
            jw2Var.m14699E();
            jw2Var.m14707c();
            jw2Var.m14695A(this.f22087d);
            jw2Var.m14726x();
            jw2Var.m14696B(true);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new ada(str, true, z, false)));
        }
        return xfa.f68157a;
    }
}
