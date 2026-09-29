package com.lingq.feature.reader.video;

import com.lingq.feature.reader.video.state.C2597c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ac7;
import p000.bj3;
import p000.c32;
import p000.e37;
import p000.f00;
import p000.hqa;
import p000.iqa;
import p000.lw8;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoPosition$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeVideoPosition$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31244a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ac7 f31245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeVideoPosition$2(C2583a c2583a, Continuation continuation) {
        super(4, continuation);
        this.f31246c = c2583a;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        ReaderVideoComposeViewModel$observeVideoPosition$2 readerVideoComposeViewModel$observeVideoPosition$2 = new ReaderVideoComposeViewModel$observeVideoPosition$2(this.f31246c, (Continuation) obj4);
        readerVideoComposeViewModel$observeVideoPosition$2.f31244a = (List) obj2;
        readerVideoComposeViewModel$observeVideoPosition$2.f31245b = (ac7) obj3;
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeVideoPosition$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        double d;
        long j;
        Pair pair;
        List list = this.f31244a;
        ac7 ac7Var = this.f31245b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2597c c2597c = this.f31246c.f31376i;
        float f = ac7Var.f486a;
        c2597c.getClass();
        list.getClass();
        C3244l c3244l = c2597c.f31553c;
        hqa hqaVar = (hqa) c3244l.getValue();
        long j2 = hqaVar.f42793a;
        long j3 = hqaVar.f42794b;
        if (!list.isEmpty()) {
            double d2 = 1000.0d;
            double d3 = j2 / 1000.0d;
            Double dValueOf = j3 > 0 ? Double.valueOf(j3 / 1000.0d) : null;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                double d4 = d2;
                List<lw8> list2 = ((e37) obj2).f36654c;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
                for (lw8 lw8Var : list2) {
                    arrayList2.add(new iqa(i, lw8Var.f50212a, lw8Var.f50213b, lw8Var.f50214c));
                    list = list;
                    c3244l = c3244l;
                }
                u91.m22630w0(arrayList2, arrayList);
                i = i2;
                d2 = d4;
            }
            List list3 = list;
            C3244l c3244l2 = c3244l;
            double d5 = d2;
            Object obj3 = null;
            int size = arrayList.size();
            ArrayList arrayList3 = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                arrayList3.add(obj3);
                i3++;
                obj3 = null;
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                Double dValueOf2 = null;
                while (true) {
                    int i4 = size2 - 1;
                    arrayList3.set(size2, dValueOf2);
                    d = 0.0d;
                    if (((iqa) arrayList.get(size2)).f44438c >= 0.0d) {
                        dValueOf2 = Double.valueOf(((iqa) arrayList.get(size2)).f44438c);
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size2 = i4;
                }
            } else {
                d = 0.0d;
            }
            Iterator it = arrayList.iterator();
            Triple triple = null;
            Triple triple2 = null;
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    j = j2;
                    if (triple2 == null) {
                        triple2 = triple;
                    }
                    if (triple2 == null) {
                        pair = new Pair(c2597c.f31562l, c2597c.f31563m);
                        break;
                    }
                    Object obj4 = triple2.f47634b;
                    c2597c.f31562l = (Integer) obj4;
                    Object obj5 = triple2.f47635c;
                    c2597c.f31563m = (Integer) obj5;
                    pair = new Pair(obj4, obj5);
                    break;
                }
                int i6 = i5 + 1;
                iqa iqaVar = (iqa) it.next();
                j = j2;
                double d6 = iqaVar.f44438c;
                double d7 = iqaVar.f44439d;
                int i7 = iqaVar.f44436a;
                int i8 = iqaVar.f44437b;
                if (d6 >= d && (d6 != d || d7 != d)) {
                    Double dValueOf3 = (Double) arrayList3.get(i5);
                    if (d7 > d6) {
                        dValueOf3 = Double.valueOf(d7);
                    } else if (dValueOf3 == null || dValueOf3.doubleValue() <= d6) {
                        dValueOf3 = (dValueOf3 == null && dValueOf != null && dValueOf.doubleValue() > d6 && d6 > d) ? dValueOf : null;
                    }
                    if (dValueOf3 != null) {
                        double dDoubleValue = dValueOf3.doubleValue();
                        if (d3 >= d6 && d3 < dDoubleValue) {
                            c2597c.f31562l = Integer.valueOf(i8);
                            c2597c.f31563m = Integer.valueOf(i7);
                            pair = new Pair(Integer.valueOf(i8), Integer.valueOf(i7));
                            break;
                        }
                        if (d6 <= d3) {
                            if (triple2 == null || d6 > ((Number) triple2.f47633a).doubleValue()) {
                                triple2 = new Triple(Double.valueOf(d6), Integer.valueOf(i8), Integer.valueOf(i7));
                            }
                        } else if (triple == null || d6 < ((Number) triple.f47633a).doubleValue()) {
                            triple = new Triple(Double.valueOf(d6), Integer.valueOf(i8), Integer.valueOf(i7));
                        }
                    } else {
                        continue;
                    }
                }
                i5 = i6;
                j2 = j;
            }
            Integer num = (Integer) pair.f47623a;
            Integer num2 = (Integer) pair.f47624b;
            if (hqaVar.f42795c && (j > 0 || c2597c.f31564n)) {
                if (num == null) {
                    num = c2597c.f31562l;
                }
                if (num2 == null) {
                    num2 = c2597c.f31563m;
                }
                c2597c.f31555e.m15571i(num);
                c2597c.f31557g.m15571i(num2);
                C3244l c3244l3 = c2597c.f31560j;
                hqa hqaVar2 = (hqa) c3244l2.getValue();
                if (!hqaVar2.f42795c || list3.isEmpty()) {
                    c3244l3.m15571i(null);
                } else {
                    double d8 = hqaVar2.f42793a / d5;
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        for (lw8 lw8Var2 : ((e37) it2.next()).f36654c) {
                            double d9 = lw8Var2.f50213b;
                            if (d9 >= d) {
                                double d10 = lw8Var2.f50214c;
                                if (d10 > d9 && d8 >= d9 && d8 < d10) {
                                    long j4 = (long) (d9 * d5);
                                    long j5 = (long) ((d10 - d9) * d5);
                                    if (j5 <= 0) {
                                        c3244l3.m15571i(null);
                                    } else {
                                        f00 f00Var = new f00(lw8Var2.f50212a, j4, j5, System.nanoTime(), hqaVar2.f42793a, f, 0);
                                        c3244l3.getClass();
                                        c3244l3.m15572j(null, f00Var);
                                    }
                                }
                            }
                        }
                    }
                    c3244l3.m15571i(null);
                }
            }
        }
        return xfa.f68157a;
    }
}
