package com.lingq.core.domain.library;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.ea5;
import p000.fa5;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetShelfContentUseCase$invoke$3$5", m4291f = "GetShelfContentUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetShelfContentUseCase$invoke$3$5 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f18803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f18804b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f18805c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ List f18806d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f18807e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f18808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShelfContentUseCase$invoke$3$5(int i, List list, Continuation continuation) {
        super(5, continuation);
        this.f18807e = list;
        this.f18808f = i;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list = this.f18807e;
        GetShelfContentUseCase$invoke$3$5 getShelfContentUseCase$invoke$3$5 = new GetShelfContentUseCase$invoke$3$5(this.f18808f, list, (Continuation) obj5);
        getShelfContentUseCase$invoke$3$5.f18803a = (List) obj;
        getShelfContentUseCase$invoke$3$5.f18804b = (List) obj2;
        getShelfContentUseCase$invoke$3$5.f18805c = (List) obj3;
        getShelfContentUseCase$invoke$3$5.f18806d = (List) obj4;
        return getShelfContentUseCase$invoke$3$5.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        List list = this.f18803a;
        List list2 = this.f18804b;
        List list3 = this.f18805c;
        List list4 = this.f18806d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayListM22603U0 = u91.m22603U0(list2, list);
        List list5 = this.f18807e;
        HashSet hashSet = new HashSet();
        ArrayList<LibraryItem> arrayList = new ArrayList();
        for (Object obj2 : list5) {
            if (hashSet.add(new Integer(((LibraryItem) obj2).f19426a))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (LibraryItem libraryItem : arrayList) {
            Iterator it = arrayListM22603U0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (libraryItem.f19426a != ((LibraryItemCounter) next).f19455a);
            arrayList2.add(new ea5(libraryItem, (LibraryItemCounter) next));
        }
        return new fa5(arrayList2, list3, list4, this.f18808f == 0);
    }
}
