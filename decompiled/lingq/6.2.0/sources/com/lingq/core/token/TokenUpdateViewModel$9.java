package com.lingq.core.token;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.br9;
import p000.c32;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$9", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$9 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Triple f23533a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f23535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$9(C1909e c1909e, Continuation continuation) {
        super(3, continuation);
        this.f23535c = c1909e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        TokenUpdateViewModel$9 tokenUpdateViewModel$9 = new TokenUpdateViewModel$9(this.f23535c, (Continuation) obj3);
        tokenUpdateViewModel$9.f23533a = (Triple) obj;
        tokenUpdateViewModel$9.f23534b = zBooleanValue;
        return tokenUpdateViewModel$9.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = this.f23533a;
        boolean z = this.f23534b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) triple.f47633a;
        Collection collection = (List) triple.f47634b;
        boolean zBooleanValue = ((Boolean) triple.f47635c).booleanValue();
        if (!z && zBooleanValue) {
            collection = EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        Collection collection2 = collection;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        Set setM22627s1 = u91.m22627s1(arrayList2);
        ArrayList arrayListM22603U0 = u91.m22603U0(list, collection);
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayListM22603U0, 10));
        Iterator it2 = arrayListM22603U0.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList3.add(lowerCase2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((String) obj2).length() > 0) {
                arrayList4.add(obj2);
            }
        }
        for (String str : u91.m22622n1(u91.m22626r1(arrayList4))) {
            arrayList.add(new br9(str, setM22627s1.contains(str)));
        }
        return arrayList;
    }
}
