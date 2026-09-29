package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$special$$inlined$flatMapLatest$1", m4291f = "ReaderPageViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderPageViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28758a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28759b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28760c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2411m f28761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$special$$inlined$flatMapLatest$1(C2411m c2411m, Continuation continuation) {
        super(3, continuation);
        this.f28761d = c2411m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderPageViewModel$special$$inlined$flatMapLatest$1 readerPageViewModel$special$$inlined$flatMapLatest$1 = new ReaderPageViewModel$special$$inlined$flatMapLatest$1(this.f28761d, (Continuation) obj3);
        readerPageViewModel$special$$inlined$flatMapLatest$1.f28759b = (e83) obj;
        readerPageViewModel$special$$inlined$flatMapLatest$1.f28760c = obj2;
        return readerPageViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28759b;
        Object obj2 = this.f28760c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28758a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = ((ox7) obj2).f55132e;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((xz7) it.next()).f69010g, arrayList);
            }
            List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList));
            C2411m c2411m = this.f28761d;
            d65 d65Var = c2411m.f29233g;
            int i2 = c2411m.f29248p;
            List list2 = listM22622n1;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC3393o1.m17749x(((Number) it2.next()).intValue(), arrayList2);
            }
            c83 c83VarM7254L = ((C1295k) d65Var).m7254L(i2, arrayList2);
            this.f28759b = null;
            this.f28760c = null;
            this.f28758a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7254L, this) == coroutineSingletons) {
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
