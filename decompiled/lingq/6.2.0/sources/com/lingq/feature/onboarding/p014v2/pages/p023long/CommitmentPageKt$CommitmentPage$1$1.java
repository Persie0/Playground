package com.lingq.feature.onboarding.p014v2.pages.p023long;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dr3;
import p000.fda;
import p000.io2;
import p000.ss5;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.x87;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.long.CommitmentPageKt$CommitmentPage$1$1", m4291f = "CommitmentPage.kt", m4292l = {77, 84}, m4293m = "invokeSuspend", m4294v = 2)
final class CommitmentPageKt$CommitmentPage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f27507b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dr3 f27508c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f27509d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f27510e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f27511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommitmentPageKt$CommitmentPage$1$1(C0059a c0059a, dr3 dr3Var, ui3 ui3Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f27507b = c0059a;
        this.f27508c = dr3Var;
        this.f27509d = ui3Var;
        this.f27510e = t66Var;
        this.f27511f = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommitmentPageKt$CommitmentPage$1$1(this.f27507b, this.f27508c, this.f27509d, this.f27510e, this.f27511f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CommitmentPageKt$CommitmentPage$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r11.f27507b, r1, r2, null, r11, 12) == r6) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27506a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f27510e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!((Boolean) t66Var.getValue()).booleanValue()) {
                boolean zBooleanValue = ((Boolean) this.f27511f.getValue()).booleanValue();
                C0059a c0059a = this.f27507b;
                if (zBooleanValue) {
                    int iFloatValue = (int) ((1.0f - ((Number) c0059a.m745d()).floatValue()) * 1500.0f);
                    if (iFloatValue < 1) {
                        iFloatValue = 1;
                    }
                    Float f = new Float(1.0f);
                    fda fdaVarM21703b0 = ss5.m21703b0(iFloatValue, 0, io2.f44352d, 2);
                    this.f27506a = 1;
                } else {
                    Float f2 = new Float(0.0f);
                    fda fdaVarM21703b1 = ss5.m21703b0(300, 0, null, 6);
                    this.f27506a = 2;
                    if (C0059a.m744c(c0059a, f2, fdaVarM21703b1, null, this, 12) == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((Number) this.f27507b.m745d()).floatValue() >= 1.0f) {
            t66Var.setValue(Boolean.TRUE);
            ((x87) this.f27508c).m24403a(0);
            this.f27509d.mo0a();
            return xfaVar;
        }
        return xfaVar;
    }
}
