package com.lingq.core.token;

import com.lingq.core.domain.token.C1534b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.ui3;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$playTtsIfApplicable$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {1091}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$playTtsIfApplicable$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f23656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23657c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f23658d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23659e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f23660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$playTtsIfApplicable$2(boolean z, String str, C1909e c1909e, String str2, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f23656b = z;
        this.f23657c = str;
        this.f23658d = c1909e;
        this.f23659e = str2;
        this.f23660f = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$playTtsIfApplicable$2(this.f23656b, this.f23657c, this.f23658d, this.f23659e, this.f23660f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$playTtsIfApplicable$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23655a;
        C1909e c1909e = this.f23658d;
        String str = this.f23657c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!this.f23656b || vk9.m23391n0(str)) {
                this.f23660f.mo0a();
            } else {
                C1534b c1534b = c1909e.f23864B;
                boolean z = c1909e.f23878P.f61864c;
                this.f23655a = 1;
                obj = c1534b.m8212a(z, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((Boolean) obj).booleanValue()) {
            wfb.m23926u(lda.m16103C(c1909e), null, null, new TokenUpdateViewModel$playTts$1(c1909e, this.f23659e, str, null), 3);
        } else {
            this.f23660f.mo0a();
        }
        return xfa.f68157a;
    }
}
