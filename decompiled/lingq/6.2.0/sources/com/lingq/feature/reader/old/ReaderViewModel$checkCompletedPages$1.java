package com.lingq.feature.reader.old;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lda;
import p000.ox7;
import p000.un1;
import p000.v91;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$checkCompletedPages$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$checkCompletedPages$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2412n f28917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f28918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$checkCompletedPages$1(C2412n c2412n, Map map, Continuation continuation) {
        super(2, continuation);
        this.f28917a = c2412n;
        this.f28918b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$checkCompletedPages$1(this.f28917a, this.f28918b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderViewModel$checkCompletedPages$1 readerViewModel$checkCompletedPages$1 = (ReaderViewModel$checkCompletedPages$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerViewModel$checkCompletedPages$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2412n c2412n = this.f28917a;
        List list = (List) c2412n.f29269D0.getValue();
        if (!list.isEmpty()) {
            Map map = this.f28918b;
            if (!map.isEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ox7) it.next()).f55132e);
                }
                int iM9314W2 = C2412n.m9314W2(c2412n, map, arrayList);
                C3244l c3244l = c2412n.f29342b1;
                Integer num = new Integer(iM9314W2);
                c3244l.getClass();
                c3244l.m15572j(null, num);
                if (iM9314W2 - 1 >= c2412n.m9323d3()) {
                    wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$showSentenceModeTooltip$1(c2412n, null), 3);
                }
            }
        }
        return xfa.f68157a;
    }
}
