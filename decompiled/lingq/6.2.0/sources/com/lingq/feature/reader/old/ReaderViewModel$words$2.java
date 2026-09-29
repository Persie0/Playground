package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1310z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.aj3;
import p000.b91;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$words$2", m4291f = "ReaderViewModel.kt", m4292l = {394}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$words$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29167a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29168b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f29169c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$words$2(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29170d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$words$2 readerViewModel$words$2 = new ReaderViewModel$words$2(this.f29170d, (Continuation) obj3);
        readerViewModel$words$2.f29168b = (e83) obj;
        readerViewModel$words$2.f29169c = (List) obj2;
        return readerViewModel$words$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n;
        e83 e83Var = this.f29168b;
        List list = this.f29169c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29167a;
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
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((xz7) it2.next()).f69008e);
        }
        ArrayList arrayListM22632y0 = u91.m22632y0(u91.m22622n1(u91.m22626r1(arrayList2)), 200);
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayListM22632y0, 10));
        Iterator it3 = arrayListM22632y0.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            c2412n = this.f29170d;
            if (!zHasNext) {
                break;
            }
            arrayList3.add(((C1310z) c2412n.f29403s).m7428g(c2412n.f29340b.mo4589b2(), (List) it3.next()));
        }
        c83[] c83VarArr = (c83[]) u91.m22622n1(arrayList3).toArray(new c83[0]);
        this.f29168b = null;
        this.f29169c = null;
        this.f29167a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 13), new ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3(c2412n, null), this, c83VarArr);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15568a != coroutineSingletons2) {
            objM15568a = xfaVar;
        }
        if (objM15568a != coroutineSingletons2) {
            objM15568a = xfaVar;
        }
        return objM15568a == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
