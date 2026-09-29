package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.token.TokenCwt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$_tokensCwts$1$invokeSuspend$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_tokensCwts$1$invokeSuspend$$inlined$combine$1$3", m4291f = "ReaderPageViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2365x9f023a3b extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28646a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28647b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f28648c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2411m f28649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2365x9f023a3b(C2411m c2411m, Continuation continuation) {
        super(3, continuation);
        this.f28649d = c2411m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2365x9f023a3b c2365x9f023a3b = new C2365x9f023a3b(this.f28649d, (Continuation) obj3);
        c2365x9f023a3b.f28647b = (e83) obj;
        c2365x9f023a3b.f28648c = (Object[]) obj2;
        return c2365x9f023a3b.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28647b;
        Object[] objArr = this.f28648c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28646a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22587E0 = u91.m22587E0(AbstractC3550rv.m20852t0((TokenCwt[]) objArr));
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayListM22587E0, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj2 : arrayListM22587E0) {
                String str = ((TokenCwt) obj2).f19583a;
                Locale locale = this.f28649d.f29253u;
                locale.getClass();
                linkedHashMap.put(vz1.m23610P(str, locale), obj2);
            }
            this.f28647b = null;
            this.f28648c = null;
            this.f28646a = 1;
            if (e83Var.emit(linkedHashMap, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
