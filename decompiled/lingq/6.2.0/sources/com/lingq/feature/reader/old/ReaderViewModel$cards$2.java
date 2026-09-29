package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1287c;
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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$cards$2", m4291f = "ReaderViewModel.kt", m4292l = {385}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$cards$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28907a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28908b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f28909c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f28910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$cards$2(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f28910d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$cards$2 readerViewModel$cards$2 = new ReaderViewModel$cards$2(this.f28910d, (Continuation) obj3);
        readerViewModel$cards$2.f28908b = (e83) obj;
        readerViewModel$cards$2.f28909c = (List) obj2;
        return readerViewModel$cards$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n;
        e83 e83Var = this.f28908b;
        List list = this.f28909c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28907a;
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
            c2412n = this.f28910d;
            if (!zHasNext) {
                break;
            }
            arrayList3.add(((C1287c) c2412n.f29400r).m7122l(c2412n.f29340b.mo4589b2(), (List) it3.next()));
        }
        c83[] c83VarArr = (c83[]) u91.m22622n1(arrayList3).toArray(new c83[0]);
        this.f28908b = null;
        this.f28909c = null;
        this.f28907a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 11), new ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3(c2412n, null), this, c83VarArr);
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
