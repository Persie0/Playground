package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.fa4;
import p000.h5a;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.yd7;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$20", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$20(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23514b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$20 tokenUpdateViewModel$20 = new TokenUpdateViewModel$20(this.f23514b, continuation);
        tokenUpdateViewModel$20.f23513a = obj;
        return tokenUpdateViewModel$20;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$20 tokenUpdateViewModel$20 = (TokenUpdateViewModel$20) create((h5a) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$20.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object next;
        h5a h5aVar = (h5a) this.f23513a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = h5aVar.f41816a;
        TokenMeaning tokenMeaning = h5aVar.f41817b;
        List list2 = h5aVar.f41818c;
        String str = h5aVar.f41819d;
        String str2 = (String) u91.m22591I0(h5aVar.f41820e);
        if (str2 == null) {
            str2 = "en";
        }
        Collection collectionM23604J = tokenMeaning != null ? vz1.m23604J(tokenMeaning) : EmptyList.f47638a;
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (!fa4.m11650l(((TokenMeaning) next2).f19596c, tokenMeaning != null ? tokenMeaning.f19596c : null)) {
                arrayList.add(next2);
            }
        }
        List listM22614f1 = u91.m22614f1(arrayList, new yd7(7));
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM22614f1) {
            TokenMeaning tokenMeaning2 = (TokenMeaning) obj2;
            if (hashSet.add(new Pair(new Integer(tokenMeaning2.f19594a), tokenMeaning2.f19596c))) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListM22603U0 = u91.m22603U0(arrayList2, collectionM23604J);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (!fa4.m11650l(((TokenMeaning) obj3).f19596c, tokenMeaning != null ? tokenMeaning.f19596c : null)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayListM22603U1 = u91.m22603U0(arrayList3, collectionM23604J);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (!fa4.m11650l(((TokenMeaning) obj4).f19596c, tokenMeaning != null ? tokenMeaning.f19596c : null)) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList4) {
            TokenMeaning tokenMeaning3 = (TokenMeaning) obj5;
            Iterator it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!fa4.m11650l(((TokenMeaning) next).f19596c, tokenMeaning3.f19596c));
            if (next == null) {
                arrayList5.add(obj5);
            }
        }
        List listM22614f2 = u91.m22614f1(arrayList5, new yd7(8));
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : listM22614f2) {
            TokenMeaning tokenMeaning4 = (TokenMeaning) obj6;
            if (hashSet2.add(new Pair(new Integer(tokenMeaning4.f19594a), tokenMeaning4.f19596c))) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayListM22603U2 = u91.m22603U0(arrayList6, arrayListM22603U1);
        C3244l c3244l = this.f23514b.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, arrayListM22603U0, str2.equals(str) ? arrayListM22603U2 : list2, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -786433, 2097151)));
        return xfa.f68157a;
    }
}
