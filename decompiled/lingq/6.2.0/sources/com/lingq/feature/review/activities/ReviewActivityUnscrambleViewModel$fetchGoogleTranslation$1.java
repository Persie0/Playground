package com.lingq.feature.review.activities;

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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {123}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2749d f32258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32259c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f32260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(C2749d c2749d, int i, int i2, Continuation continuation) {
        super(1, continuation);
        this.f32258b = c2749d;
        this.f32259c = i;
        this.f32260d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(this.f32258b, this.f32259c, this.f32260d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2749d c2749d = this.f32258b;
        cma cmaVar = c2749d.f32350b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32257a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                d65 d65Var = c2749d.f32351c;
                String strMo4589b2 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                int i2 = this.f32259c;
                int i3 = this.f32260d + 1;
                this.f32257a = 1;
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
                C3244l c3244l = c2749d.f32359k;
                c3244l.getClass();
                c3244l.m15572j(null, "Unable to translate sentence. Please try again later.");
            }
        }
        return xfa.f68157a;
    }
}
