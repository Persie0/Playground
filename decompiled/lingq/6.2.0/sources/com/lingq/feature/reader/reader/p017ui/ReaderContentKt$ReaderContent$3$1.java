package com.lingq.feature.reader.reader.p017ui;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.jy7;
import p000.ly7;
import p000.qc9;
import p000.sc9;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ui.ReaderContentKt$ReaderContent$3$1", m4291f = "ReaderContent.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentKt$ReaderContent$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz4 f30332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sc9 f30333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ly7 f30334c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jy7 f30335d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f30336e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f30337f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ qc9 f30338g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ un1 f30339h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t66 f30340i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ t66 f30341j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentKt$ReaderContent$3$1(yz4 yz4Var, sc9 sc9Var, ly7 ly7Var, jy7 jy7Var, Map map, t66 t66Var, qc9 qc9Var, un1 un1Var, t66 t66Var2, t66 t66Var3, Continuation continuation) {
        super(2, continuation);
        this.f30332a = yz4Var;
        this.f30333b = sc9Var;
        this.f30334c = ly7Var;
        this.f30335d = jy7Var;
        this.f30336e = map;
        this.f30337f = t66Var;
        this.f30338g = qc9Var;
        this.f30339h = un1Var;
        this.f30340i = t66Var2;
        this.f30341j = t66Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentKt$ReaderContent$3$1(this.f30332a, this.f30333b, this.f30334c, this.f30335d, this.f30336e, this.f30337f, this.f30338g, this.f30339h, this.f30340i, this.f30341j, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderContentKt$ReaderContent$3$1 readerContentKt$ReaderContent$3$1 = (ReaderContentKt$ReaderContent$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerContentKt$ReaderContent$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        yz4 yz4Var = this.f30332a;
        int i = yz4Var.f70680n;
        sc9 sc9Var = this.f30333b;
        if (i != sc9Var.m21222h()) {
            sc9Var.m21223i(yz4Var.f70680n);
            Double d = (Double) AbstractC2506c.m9414b(yz4Var, this.f30335d, this.f30336e).f47623a;
            if (d != null && (this.f30334c.f50310d || ((Boolean) this.f30337f.getValue()).booleanValue())) {
                this.f30338g.m19862i((float) d.doubleValue());
                AbstractC2506c.m9416d(this.f30339h, this.f30340i, this.f30341j, d.doubleValue());
            }
        }
        return xfa.f68157a;
    }
}
