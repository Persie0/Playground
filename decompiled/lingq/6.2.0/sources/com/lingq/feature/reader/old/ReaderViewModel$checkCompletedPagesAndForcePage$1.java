package com.lingq.feature.reader.old;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.ox7;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$checkCompletedPagesAndForcePage$1", m4291f = "ReaderViewModel.kt", m4292l = {1798}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$checkCompletedPagesAndForcePage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public List f28919a;

    /* JADX INFO: renamed from: b */
    public int f28920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$checkCompletedPagesAndForcePage$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28921c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$checkCompletedPagesAndForcePage$1(this.f28921c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$checkCompletedPagesAndForcePage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28920b;
        C2412n c2412n = this.f28921c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list2 = (List) c2412n.f29269D0.getValue();
            c18 c18Var = c2412n.f29290K0;
            this.f28919a = list2;
            this.f28920b = 1;
            Object objM15542u = AbstractC3224d.m15542u(c18Var, this);
            if (objM15542u == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM15542u;
            list = list2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f28919a;
            AbstractC3193b.m15359b(obj);
        }
        Map map = (Map) obj;
        if (!list.isEmpty() && map != null && !map.isEmpty()) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((ox7) it.next()).f55132e);
            }
            int iM9314W2 = C2412n.m9314W2(c2412n, map, arrayList);
            C3244l c3244l = c2412n.f29325W;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C3244l c3244l2 = c2412n.f29322V;
            Integer num = new Integer(-1);
            c3244l2.getClass();
            c3244l2.m15572j(null, num);
            C3244l c3244l3 = c2412n.f29342b1;
            Integer num2 = new Integer(iM9314W2);
            c3244l3.getClass();
            c3244l3.m15572j(null, num2);
            if (((Boolean) ((C3244l) c2412n.f29353e0.f9311a).getValue()).booleanValue() && c2412n.m9323d3() > iM9314W2) {
                c2412n.m9341u3(iM9314W2, true);
            }
        }
        return xfa.f68157a;
    }
}
