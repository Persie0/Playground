package com.lingq.core.domain.playlist;

import com.google.android.gms.internal.vision.C1041z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.cd7;
import p000.jl9;
import p000.te7;
import p000.u91;
import p000.ud7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetPlaylistLessonsUseCase$invoke$structureFlow$1", m4291f = "GetPlaylistLessonsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPlaylistLessonsUseCase$invoke$structureFlow$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f19927a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f19928b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f19929c;

    public GetPlaylistLessonsUseCase$invoke$structureFlow$1() {
        super(4, null);
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        GetPlaylistLessonsUseCase$invoke$structureFlow$1 getPlaylistLessonsUseCase$invoke$structureFlow$1 = new GetPlaylistLessonsUseCase$invoke$structureFlow$1(4, (Continuation) obj4);
        getPlaylistLessonsUseCase$invoke$structureFlow$1.f19927a = (List) obj;
        getPlaylistLessonsUseCase$invoke$structureFlow$1.f19928b = (List) obj2;
        getPlaylistLessonsUseCase$invoke$structureFlow$1.f19929c = (List) obj3;
        return getPlaylistLessonsUseCase$invoke$structureFlow$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f19927a;
        List list2 = this.f19928b;
        List list3 = this.f19929c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            ud7 ud7VarM5824b = C1041z.m5824b((ud7) it.next(), true);
            Integer numValueOf = Integer.valueOf(ud7VarM5824b.f63776j);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(ud7VarM5824b);
            linkedHashSet.add(Integer.valueOf(ud7VarM5824b.f63767a));
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= list.size() && i2 >= list2.size()) {
                return new te7(arrayList2, linkedHashSet);
            }
            ud7 ud7Var = (ud7) u91.m22592J0(i, list);
            cd7 cd7Var = (cd7) u91.m22592J0(i2, list2);
            Integer num = ud7Var != null ? ud7Var.f63781o : null;
            int i3 = cd7Var != null ? cd7Var.f9935c : Integer.MAX_VALUE;
            if (ud7Var != null) {
                if (cd7Var == null) {
                    ud7 ud7VarM5824b2 = C1041z.m5824b(ud7Var, false);
                    arrayList2.add(new jl9(ud7VarM5824b2));
                    linkedHashSet.add(Integer.valueOf(ud7VarM5824b2.f63767a));
                } else if (num != null) {
                    if (i3 <= num.intValue()) {
                        arrayList2.add(C1041z.m5825c(cd7Var, linkedHashMap));
                    } else {
                        ud7 ud7VarM5824b3 = C1041z.m5824b(ud7Var, false);
                        arrayList2.add(new jl9(ud7VarM5824b3));
                        linkedHashSet.add(Integer.valueOf(ud7VarM5824b3.f63767a));
                    }
                }
                i++;
            } else {
                if (cd7Var == null) {
                    C3386nv.m17626m("Required value was null.");
                    return null;
                }
                arrayList2.add(C1041z.m5825c(cd7Var, linkedHashMap));
            }
            i2++;
        }
    }
}
