package com.lingq.feature.reader.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.my5;
import p000.ox7;
import p000.sca;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vqb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$fetchTtsForPage$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1366}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$fetchTtsForPage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$fetchTtsForPage$1(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28662b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$fetchTtsForPage$1(this.f28662b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$fetchTtsForPage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28661a;
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
        C2411m c2411m = this.f28662b;
        ox7 ox7Var = (ox7) c2411m.f29254v.getValue();
        if (ox7Var != null) {
            List list = ox7Var.f55132e;
            vqb vqbVar = c2411m.f29245m;
            String strMo4589b2 = c2411m.f29223b.mo4589b2();
            List<xz7> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (xz7 xz7Var : list2) {
                arrayList.add(new Pair(xz7Var.f69008e, xz7Var.f69013j));
            }
            this.f28661a = 1;
            vqbVar.getClass();
            Set setM22627s1 = u91.m22627s1(my5.m17154h(strMo4589b2, arrayList));
            if (!setM22627s1.isEmpty()) {
                ((sca) vqbVar.f65802b).mo8495y1(setM22627s1);
            }
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
