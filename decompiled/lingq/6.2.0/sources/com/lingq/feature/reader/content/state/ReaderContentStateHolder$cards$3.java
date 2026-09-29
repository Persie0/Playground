package com.lingq.feature.reader.content.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.ox7;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$cards$3", m4291f = "ReaderContentStateHolder.kt", m4292l = {125}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$cards$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27993b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f27994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2264a f27995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$cards$3(C2264a c2264a, Continuation continuation) {
        super(3, continuation);
        this.f27995d = c2264a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderContentStateHolder$cards$3 readerContentStateHolder$cards$3 = new ReaderContentStateHolder$cards$3(this.f27995d, (Continuation) obj3);
        readerContentStateHolder$cards$3.f27993b = (e83) obj;
        readerContentStateHolder$cards$3.f27994c = (Pair) obj2;
        return readerContentStateHolder$cards$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f27993b;
        Pair pair = this.f27994c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27992a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = (List) pair.f47623a;
            String str = (String) pair.f47624b;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
            }
            kk8 kk8VarM8210a = this.f27995d.f28112a.m8210a(str, arrayList);
            this.f27993b = null;
            this.f27994c = null;
            this.f27992a = 1;
            if (AbstractC3224d.m15537p(e83Var, kk8VarM8210a, this) == coroutineSingletons) {
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
