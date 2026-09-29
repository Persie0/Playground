package com.lingq.feature.reader.reader.p017ui;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cd4;
import p000.jbb;
import p000.jy7;
import p000.qc9;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ui.ReaderContentKt$ReaderContent$2$1", m4291f = "ReaderContent.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentKt$ReaderContent$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f30325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yz4 f30326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jy7 f30327c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f30328d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qc9 f30329e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f30330f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f30331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentKt$ReaderContent$2$1(t66 t66Var, yz4 yz4Var, jy7 jy7Var, Map map, qc9 qc9Var, t66 t66Var2, t66 t66Var3, Continuation continuation) {
        super(2, continuation);
        this.f30325a = t66Var;
        this.f30326b = yz4Var;
        this.f30327c = jy7Var;
        this.f30328d = map;
        this.f30329e = qc9Var;
        this.f30330f = t66Var2;
        this.f30331g = t66Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentKt$ReaderContent$2$1(this.f30325a, this.f30326b, this.f30327c, this.f30328d, this.f30329e, this.f30330f, this.f30331g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderContentKt$ReaderContent$2$1 readerContentKt$ReaderContent$2$1 = (ReaderContentKt$ReaderContent$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerContentKt$ReaderContent$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (((Boolean) this.f30325a.getValue()).booleanValue()) {
            Double d = (Double) AbstractC2506c.m9414b(this.f30326b, this.f30327c, this.f30328d).f47624b;
            if (d != null && this.f30329e.m19861h() >= d.doubleValue()) {
                cd4 cd4Var = (cd4) this.f30330f.getValue();
                if (cd4Var != null) {
                    cd4Var.mo4537a(null);
                }
                this.f30331g.setValue(jbb.f45386a);
            }
        }
        return xfa.f68157a;
    }
}
