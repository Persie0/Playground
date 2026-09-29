package com.lingq.feature.search.fastsearch;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$updateSave$1", m4291f = "FastSearchViewModel.kt", m4292l = {292}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$updateSave$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32876c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f32877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$updateSave$1(C2768b c2768b, int i, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f32875b = c2768b;
        this.f32876c = i;
        this.f32877d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FastSearchViewModel$updateSave$1(this.f32875b, this.f32876c, this.f32877d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FastSearchViewModel$updateSave$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2768b c2768b = this.f32875b;
        cma cmaVar = c2768b.f32878b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32874a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3139j9 c3139j9 = c2768b.f32889m;
            Language language = (Language) cmaVar.mo4572B0().getValue();
            int i2 = language != null ? language.f19025b : 0;
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f32874a = 1;
            if (c3139j9.m14347b(i2, this.f32876c, strMo4589b2, this, this.f32877d) == coroutineSingletons) {
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
