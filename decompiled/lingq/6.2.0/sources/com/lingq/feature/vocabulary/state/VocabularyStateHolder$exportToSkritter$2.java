package com.lingq.feature.vocabulary.state;

import com.lingq.feature.vocabulary.domain.C2825a;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aya;
import p000.c32;
import p000.dya;
import p000.eya;
import p000.fa4;
import p000.gca;
import p000.gm5;
import p000.q99;
import p000.r99;
import p000.s99;
import p000.t99;
import p000.u99;
import p000.um5;
import p000.un1;
import p000.v99;
import p000.vm5;
import p000.w99;
import p000.wm5;
import p000.x99;
import p000.xfa;
import p000.xm5;
import p000.xxa;
import p000.ym5;
import p000.yxa;
import p000.zi3;
import p000.zxa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$exportToSkritter$2", m4291f = "VocabularyStateHolder.kt", m4292l = {462}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$exportToSkritter$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33752c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f33753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$exportToSkritter$2(C2862d c2862d, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f33751b = c2862d;
        this.f33752c = str;
        this.f33753d = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyStateHolder$exportToSkritter$2(this.f33751b, this.f33752c, this.f33753d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyStateHolder$exportToSkritter$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33750a;
        C2862d c2862d = this.f33751b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2825a c2825a = c2862d.f33800f;
            this.f33750a = 1;
            obj = c2825a.m9746b(this.f33752c, this.f33753d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ym5 ym5Var = (ym5) obj;
        boolean z = ym5Var instanceof xm5;
        Object dyaVar = xxa.f68930a;
        if (z) {
            x99 x99Var = (x99) ((xm5) ym5Var).f68348a;
            int i2 = x99Var.f67980a;
            if (i2 != 0 || x99Var.f67981b != 0) {
                dyaVar = new dya(i2, x99Var.f67981b);
            }
        } else {
            boolean z2 = ym5Var instanceof um5;
            zxa zxaVar = zxa.f72361a;
            if (z2) {
                w99 w99Var = (w99) ((um5) ym5Var).f64075a;
                if (fa4.m11650l(w99Var, t99.f62024a)) {
                    dyaVar = aya.f7674a;
                } else if (fa4.m11650l(w99Var, q99.f57482a)) {
                    dyaVar = yxa.f70622a;
                } else if (!fa4.m11650l(w99Var, s99.f60564a)) {
                    if (fa4.m11650l(w99Var, u99.f63620a)) {
                        dyaVar = eya.f38088a;
                    } else if (!fa4.m11650l(w99Var, v99.f65082a) && !fa4.m11650l(w99Var, r99.f58948a)) {
                        gm5.m12750e();
                        return null;
                    }
                }
            } else if (!(ym5Var instanceof vm5) && !fa4.m11650l(ym5Var, wm5.f67054a)) {
                gm5.m12750e();
                return null;
            }
            dyaVar = zxaVar;
        }
        c2862d.m9773f(new gca(dyaVar, 10));
        return xfa.f68157a;
    }
}
