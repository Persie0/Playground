package com.lingq.core.token;

import com.lingq.core.data.repository.C1306v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bq1;
import p000.c32;
import p000.ck6;
import p000.pg9;
import p000.qk9;
import p000.un1;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$fetchCwt$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {1035}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$fetchCwt$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public pg9 f23575a;

    /* JADX INFO: renamed from: b */
    public int f23576b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23577c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f23578d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23579e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f23580f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23581g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23582h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f23583i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23584j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f23585k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ qk9 f23586l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$fetchCwt$3(C1909e c1909e, String str, int i, String str2, int i2, int i3, boolean z, int i4, qk9 qk9Var, Continuation continuation) {
        super(2, continuation);
        this.f23578d = c1909e;
        this.f23579e = str;
        this.f23580f = i;
        this.f23581g = str2;
        this.f23582h = i2;
        this.f23583i = i3;
        this.f23584j = z;
        this.f23585k = i4;
        this.f23586l = qk9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$fetchCwt$3 tokenUpdateViewModel$fetchCwt$3 = new TokenUpdateViewModel$fetchCwt$3(this.f23578d, this.f23579e, this.f23580f, this.f23581g, this.f23582h, this.f23583i, this.f23584j, this.f23585k, this.f23586l, continuation);
        tokenUpdateViewModel$fetchCwt$3.f23577c = obj;
        return tokenUpdateViewModel$fetchCwt$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$fetchCwt$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        pg9 pg9Var;
        Object obj2;
        un1 un1Var = (un1) this.f23577c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23576b;
        qk9 qk9Var = this.f23586l;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1909e c1909e = this.f23578d;
            pg9 pg9VarM23926u = wfb.m23926u(un1Var, null, null, new TokenUpdateViewModel$fetchCwt$3$timeoutJob$1(c1909e, qk9Var, null), 3);
            try {
                ck6 ck6Var = c1909e.f23893g;
                String str = this.f23579e;
                int i2 = this.f23580f;
                String str2 = this.f23581g;
                int i3 = this.f23582h;
                int i4 = this.f23583i;
                boolean z = this.f23584j;
                int i5 = this.f23585k;
                this.f23577c = un1Var;
                this.f23575a = pg9VarM23926u;
                this.f23576b = 1;
                ck6Var.getClass();
                bq1.m4062m0(str2, str);
                Object objM7379e = ((C1306v) ((w3a) ck6Var.f10194b)).m7379e(str, i2, i3, i4, z, i5, this);
                if (objM7379e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = objM7379e;
                pg9Var = pg9VarM23926u;
            } catch (Exception unused) {
                pg9Var = pg9VarM23926u;
                vz1.m23597A(un1Var);
                pg9Var.mo4537a(null);
                qk9Var.mo0a();
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pg9Var = this.f23575a;
            try {
                AbstractC3193b.m15359b(obj);
                obj2 = obj;
            } catch (Exception unused2) {
                vz1.m23597A(un1Var);
                pg9Var.mo4537a(null);
                qk9Var.mo0a();
            }
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        pg9Var.mo4537a(null);
        if (!zBooleanValue) {
            qk9Var.mo0a();
        }
        return xfa.f68157a;
    }
}
