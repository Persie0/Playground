package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.ij2;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$invokeSuspend$$inlined$flatMapLatest$1", m4291f = "PlaylistViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2249x3bb99381 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27711a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27712b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27713c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2255e f27714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249x3bb99381(C2255e c2255e, Continuation continuation) {
        super(3, continuation);
        this.f27714d = c2255e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2249x3bb99381 c2249x3bb99381 = new C2249x3bb99381(this.f27714d, (Continuation) obj3);
        c2249x3bb99381.f27712b = (e83) obj;
        c2249x3bb99381.f27713c = obj2;
        return c2249x3bb99381.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f27712b;
        Object obj2 = this.f27713c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27711a;
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
        int iIntValue = ((Number) obj2).intValue();
        C2255e c2255e = this.f27714d;
        c83 c83VarM7358r = ((C1302r) c2255e.f27837n).m7358r(iIntValue, c2255e.f27825b.mo4589b2());
        this.f27712b = null;
        this.f27713c = null;
        this.f27711a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = c83VarM7358r.collect(new ij2(e83Var, iIntValue, 4), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
