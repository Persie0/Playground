package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.d65;
import p000.vi3;
import p000.xfa;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$fetchTranslation$2", m4291f = "ReaderPageViewModel.kt", m4292l = {1329}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$fetchTranslation$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$fetchTranslation$2(C2411m c2411m, int i, Continuation continuation) {
        super(1, continuation);
        this.f28659b = c2411m;
        this.f28660c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderPageViewModel$fetchTranslation$2(this.f28659b, this.f28660c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderPageViewModel$fetchTranslation$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C2411m c2411m = this.f28659b;
        cma cmaVar = c2411m.f29223b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28658a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                d65 d65Var = c2411m.f29233g;
                String strMo4589b2 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                int i2 = this.f28660c;
                int i3 = c2411m.f29249q + 1;
                this.f28658a = 1;
                if (((C1295k) d65Var).m7306z(i2, i3, strMo4589b2, strMo4580K1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            if (e instanceof HttpException) {
                C3244l c3244l = c2411m.f29224b0;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, "Unable to translate sentence. Please try again later."));
            }
        }
        return xfa.f68157a;
    }
}
