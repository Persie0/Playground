package com.lingq.feature.reader.video;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.aj3;
import p000.c32;
import p000.c65;
import p000.e37;
import p000.n08;
import p000.u91;
import p000.ux5;
import p000.v91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeLessonStudyTracking$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeLessonStudyTracking$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31224a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeLessonStudyTracking$1(C2583a c2583a, Continuation continuation) {
        super(3, continuation);
        this.f31226c = c2583a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$observeLessonStudyTracking$1 readerVideoComposeViewModel$observeLessonStudyTracking$1 = new ReaderVideoComposeViewModel$observeLessonStudyTracking$1(this.f31226c, (Continuation) obj3);
        readerVideoComposeViewModel$observeLessonStudyTracking$1.f31224a = (List) obj;
        readerVideoComposeViewModel$observeLessonStudyTracking$1.f31225b = (Integer) obj2;
        return readerVideoComposeViewModel$observeLessonStudyTracking$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f31224a;
        Integer num = this.f31225b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        int size = 0;
        while (it.hasNext()) {
            size += ((e37) it.next()).f36655d.size();
        }
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it2 = list2.iterator();
        while (true) {
            String strM22988k = null;
            if (!it2.hasNext()) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (((e37) u91.m22592J0(iIntValue, (List) ((C3244l) this.f31226c.f31359R.f9311a).getValue())) != null) {
                        strM22988k = ux5.m22988k(iIntValue, "paragraph:");
                    }
                }
                return new Pair(arrayList, strM22988k);
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            n08 n08Var = C2583a.Companion;
            arrayList.add(new c65(ux5.m22988k(i, "paragraph:"), ((e37) next).f36655d.size(), size));
            i = i2;
        }
    }
}
