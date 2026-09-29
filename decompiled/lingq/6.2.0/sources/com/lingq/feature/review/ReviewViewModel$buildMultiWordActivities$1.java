package com.lingq.feature.review;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.review.ReviewType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.gb8;
import p000.ib8;
import p000.id8;
import p000.lb8;
import p000.mb8;
import p000.u91;
import p000.un1;
import p000.v0b;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$buildMultiWordActivities$1", m4291f = "ReviewViewModel.kt", m4292l = {736, 745}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$buildMultiWordActivities$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31857a;

    /* JADX INFO: renamed from: b */
    public int f31858b;

    /* JADX INFO: renamed from: c */
    public ArrayList f31859c;

    /* JADX INFO: renamed from: d */
    public Set f31860d;

    /* JADX INFO: renamed from: e */
    public int f31861e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2758f f31862f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f31863g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f31864h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f31865i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f31866j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f31867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$buildMultiWordActivities$1(C2758f c2758f, List list, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.f31862f = c2758f;
        this.f31863g = list;
        this.f31864h = z;
        this.f31865i = z2;
        this.f31866j = z3;
        this.f31867k = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$buildMultiWordActivities$1(this.f31862f, this.f31863g, this.f31864h, this.f31865i, this.f31866j, this.f31867k, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$buildMultiWordActivities$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101 A[LOOP:7: B:36:0x00fb->B:38:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0124 A[LOOP:8: B:40:0x011e->B:42:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0188 A[LOOP:1: B:54:0x0182->B:56:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x01aa A[LOOP:2: B:58:0x01a8->B:59:0x01aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ea A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        ArrayList arrayList;
        int size;
        Object objM7117g;
        int i2;
        Set set;
        ArrayList arrayList2;
        Object objM7117g2;
        Set set2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        Iterator it2;
        Object value;
        Object value2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Iterator it3;
        int i3;
        C2758f c2758f = this.f31862f;
        Locale locale = c2758f.f32518n;
        ao0 ao0Var = c2758f.f32510f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f31861e;
        List list = this.f31863g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            id8 id8Var = c2758f.f32516l;
            int i5 = id8Var.f43978a;
            ReviewType reviewType = id8Var.f43979b;
            i = id8Var.f43982e;
            arrayList = new ArrayList();
            List list2 = list;
            ArrayList arrayList7 = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList7.add(((v0b) it4.next()).f64672b);
            }
            size = (arrayList7.size() + 2) / 3;
            if (this.f31864h && reviewType != ReviewType.IntegratedWord && arrayList7.size() > 2) {
                List listM22625q1 = u91.m22625q1(arrayList7);
                Collections.shuffle(listM22625q1);
                Set setM22627s1 = u91.m22627s1(listM22625q1);
                if (setM22627s1.size() < 3) {
                    this.f31859c = arrayList;
                    this.f31860d = setM22627s1;
                    this.f31857a = i;
                    this.f31858b = size;
                    this.f31861e = 2;
                    objM7117g = ((C1287c) ao0Var).m7117g(i5, this);
                    if (objM7117g != coroutineSingletons) {
                        i2 = i;
                        set = setM22627s1;
                        arrayList2 = arrayList;
                        arrayList5 = new ArrayList();
                        for (Object obj2 : (List) objM7117g) {
                            if (!((LessonCard) obj2).f19183f.isEmpty()) {
                                arrayList5.add(obj2);
                            }
                        }
                        arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
                        it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            String str = ((LessonCard) it3.next()).f19178a;
                            locale.getClass();
                            arrayList6.add(vz1.m23610P(str, locale));
                        }
                        C2758f.m9603W2(c2758f, u91.m22627s1(set), arrayList6, arrayList2);
                        for (i3 = size - 1; i3 > 0; i3--) {
                            C2758f.m9603W2(c2758f, EmptySet.f47640a, arrayList6, arrayList2);
                        }
                        i = i2;
                        arrayList = arrayList2;
                    }
                } else if (size == 1) {
                    arrayList.add(new ib8(u91.m22615g1(setM22627s1, 3)));
                } else {
                    this.f31859c = arrayList;
                    this.f31860d = setM22627s1;
                    this.f31857a = i;
                    this.f31858b = size;
                    this.f31861e = 1;
                    objM7117g2 = ((C1287c) ao0Var).m7117g(i5, this);
                    if (objM7117g2 != coroutineSingletons) {
                        set2 = setM22627s1;
                        arrayList3 = new ArrayList();
                        for (Object obj3 : (List) objM7117g2) {
                            if (!((LessonCard) obj3).f19183f.isEmpty()) {
                                arrayList3.add(obj3);
                            }
                        }
                        arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            String str2 = ((LessonCard) it.next()).f19178a;
                            locale.getClass();
                            arrayList4.add(vz1.m23610P(str2, locale));
                        }
                        it2 = u91.m22632y0(set2, 3).iterator();
                        while (it2.hasNext()) {
                            C2758f.m9603W2(c2758f, u91.m22627s1((List) it2.next()), arrayList4, arrayList);
                        }
                    }
                }
                return coroutineSingletons;
            }
        } else if (i4 == 1) {
            int i6 = this.f31857a;
            set2 = this.f31860d;
            ArrayList arrayList8 = this.f31859c;
            AbstractC3193b.m15359b(obj);
            arrayList = arrayList8;
            i = i6;
            objM7117g2 = obj;
            arrayList3 = new ArrayList();
            while (r3.hasNext()) {
                if (!((LessonCard) obj3).f19183f.isEmpty()) {
                    arrayList3.add(obj3);
                }
            }
            arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                String str3 = ((LessonCard) it.next()).f19178a;
                locale.getClass();
                arrayList4.add(vz1.m23610P(str3, locale));
            }
            it2 = u91.m22632y0(set2, 3).iterator();
            while (it2.hasNext()) {
                C2758f.m9603W2(c2758f, u91.m22627s1((List) it2.next()), arrayList4, arrayList);
            }
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = this.f31858b;
            i2 = this.f31857a;
            set = this.f31860d;
            arrayList2 = this.f31859c;
            AbstractC3193b.m15359b(obj);
            size = i7;
            objM7117g = obj;
            arrayList5 = new ArrayList();
            while (r3.hasNext()) {
                if (!((LessonCard) obj2).f19183f.isEmpty()) {
                    arrayList5.add(obj2);
                }
            }
            arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
            it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                String str4 = ((LessonCard) it3.next()).f19178a;
                locale.getClass();
                arrayList6.add(vz1.m23610P(str4, locale));
            }
            C2758f.m9603W2(c2758f, u91.m22627s1(set), arrayList6, arrayList2);
            while (i3 > 0) {
                C2758f.m9603W2(c2758f, EmptySet.f47640a, arrayList6, arrayList2);
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            List list3 = list;
            list3.getClass();
            List listM22625q2 = u91.m22625q1(list3);
            Collections.shuffle(listM22625q2);
            Iterator it5 = listM22625q2.iterator();
            while (it5.hasNext()) {
                arrayList.add(new gb8((v0b) it5.next()));
            }
        }
        if (this.f31865i) {
            arrayList.add(new mb8(i));
        }
        if (this.f31866j && this.f31867k && !vk9.m23391n0(AbstractC3184kh.m15226t(c2758f.f32506b.mo4589b2()))) {
            arrayList.add(new lb8(i));
        }
        C3244l c3244l = c2758f.f32521q;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, arrayList));
        c2758f.m9613g3();
        C3244l c3244l2 = c2758f.f32528x;
        do {
            value2 = c3244l2.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        return xfa.f68157a;
    }
}
