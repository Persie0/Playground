package com.lingq.feature.reader.content.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.a84;
import p000.c32;
import p000.h84;
import p000.i84;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderLippManager$start$2", m4291f = "ReaderLippManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderLippManager$start$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2265b f28092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderLippManager$start$2(C2265b c2265b, Continuation continuation) {
        super(2, continuation);
        this.f28092b = c2265b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderLippManager$start$2 readerLippManager$start$2 = new ReaderLippManager$start$2(this.f28092b, continuation);
        readerLippManager$start$2.f28091a = obj;
        return readerLippManager$start$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderLippManager$start$2 readerLippManager$start$2 = (ReaderLippManager$start$2) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerLippManager$start$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f28091a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        int iIntValue = ((Number) pair.f47624b).intValue();
        if (!list.isEmpty() && iIntValue >= 0 && iIntValue < list.size()) {
            C2265b c2265b = this.f28092b;
            LinkedHashSet linkedHashSet = c2265b.f28140c;
            int i = iIntValue - 2;
            if (i < 0) {
                i = 0;
            }
            int i2 = iIntValue + 3;
            int size = list.size() - 1;
            if (i2 > size) {
                i2 = size;
            }
            i84 i84Var = new i84(i, i2, 1);
            ArrayList arrayList = new ArrayList();
            Iterator it = i84Var.iterator();
            while (((h84) it).f41941c) {
                List list2 = ((ox7) list.get(((a84) it).nextInt())).f55132e;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((xz7) it2.next()).f69010g));
                }
                u91.m22630w0(arrayList2, arrayList);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((Number) obj2).intValue() > 0) {
                    arrayList3.add(obj2);
                }
            }
            List listM22613e1 = u91.m22613e1(u91.m22622n1(u91.m22626r1(arrayList3)));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : listM22613e1) {
                if (!linkedHashSet.contains(Integer.valueOf(((Number) obj3).intValue()))) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                int iIntValue2 = ((Number) u91.m22601S0(arrayList4)).intValue();
                int iIntValue3 = (((Number) u91.m22600R0(arrayList4)).intValue() - iIntValue2) + 1;
                linkedHashSet.addAll(arrayList4);
                wfb.m23926u(c2265b.f28139b, null, null, new ReaderLippManager$fetchLippForPageWindow$1(c2265b, iIntValue2, iIntValue3, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
