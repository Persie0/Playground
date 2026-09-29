package com.lingq.core.token;

import androidx.compose.animation.core.C0059a;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gq6;
import p000.r2a;
import p000.s2a;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$2$1", m4291f = "TokenPopupContainer.kt", m4292l = {193}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupContainerKt$TokenPopupContainer$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenPopupAnchor f23322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f23323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f23324d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f23325e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0059a f23326f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TokenMeaning f23327g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f23328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupContainerKt$TokenPopupContainer$2$1(TokenPopupAnchor tokenPopupAnchor, vi3 vi3Var, float f, float f2, C0059a c0059a, TokenMeaning tokenMeaning, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23322b = tokenPopupAnchor;
        this.f23323c = vi3Var;
        this.f23324d = f;
        this.f23325e = f2;
        this.f23326f = c0059a;
        this.f23327g = tokenMeaning;
        this.f23328h = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupContainerKt$TokenPopupContainer$2$1(this.f23322b, this.f23323c, this.f23324d, this.f23325e, this.f23326f, this.f23327g, this.f23328h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenPopupContainerKt$TokenPopupContainer$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23321a;
        vi3 vi3Var = this.f23323c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f23322b == TokenPopupAnchor.Expanded) {
                t66 t66Var = this.f23328h;
                if (!AbstractC1899b.m8699h(t66Var)) {
                    t66Var.setValue(Boolean.TRUE);
                    vi3Var.invoke(s2a.f60219a);
                    gq6 gq6Var = new gq6((((long) Float.floatToRawIntBits(this.f23324d)) << 32) | (((long) Float.floatToRawIntBits(this.f23325e)) & 4294967295L));
                    this.f23321a = 1;
                    if (this.f23326f.m747f(gq6Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        TokenMeaning tokenMeaning = this.f23327g;
        if (tokenMeaning != null) {
            vi3Var.invoke(new r2a(tokenMeaning));
        }
        return xfa.f68157a;
    }
}
