package com.lingq.feature.review;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.review.data.ReviewActivityType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.db8;
import p000.eb8;
import p000.fb8;
import p000.gb8;
import p000.gxc;
import p000.hb8;
import p000.id8;
import p000.jb8;
import p000.kb8;
import p000.u91;
import p000.un1;
import p000.v0b;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$4", m4291f = "ReviewViewModel.kt", m4292l = {307}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31837a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31838b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$4$1", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26301 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f31839a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f31840b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            C26301 c26301 = new C26301(3, (Continuation) obj3);
            c26301.f31839a = (List) obj;
            c26301.f31840b = zBooleanValue;
            return c26301.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f31839a;
            boolean z = this.f31840b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Pair(list, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$4$2 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$4$2", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26312 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31841a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2758f f31842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26312(C2758f c2758f, Continuation continuation) {
            super(2, continuation);
            this.f31842b = c2758f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26312 c26312 = new C26312(this.f31842b, continuation);
            c26312.f31841a = obj;
            return c26312;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26312 c26312 = (C26312) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26312.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            C2758f c2758f = this.f31842b;
            id8 id8Var = c2758f.f32516l;
            Pair pair = (Pair) this.f31841a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List list2 = (List) pair.f47623a;
            boolean zBooleanValue = ((Boolean) pair.f47624b).booleanValue();
            if (!list2.isEmpty() && !gxc.m12970b(id8Var.f43979b)) {
                Bundle bundle = new Bundle();
                bundle.putString("Review type", gxc.m12971c(id8Var.f43979b));
                bundle.putString("Review location", c2758f.f32517m);
                ((C1240a) c2758f.f32515k).m7025f("Review session started", bundle);
                Random random = new Random();
                boolean z = id8Var.f43979b == ReviewType.Page;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List<v0b> list3 = (List) c2758f.f32519o.getValue();
                for (v0b v0bVar : list3) {
                    linkedHashMap.put(v0bVar, new ArrayList());
                    linkedHashMap2.put(v0bVar.f64672b, 0);
                    int i = z ? 1 : 2;
                    while (i >= 1) {
                        int iNextInt = random.nextInt(ReviewActivityType.getEntries().size());
                        if (c2758f.m9612f3(iNextInt, zBooleanValue) && (((list = (List) linkedHashMap.get(v0bVar)) != null && !list.contains(Integer.valueOf(iNextInt))) || c2758f.m9607a3(zBooleanValue) == 1)) {
                            List list4 = (List) linkedHashMap.get(v0bVar);
                            if (list4 != null) {
                                list4.add(Integer.valueOf(iNextInt));
                            }
                            i--;
                            if (c2758f.m9607a3(zBooleanValue) < 1) {
                                i = 0;
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                List list5 = list3;
                int size = list5.size();
                for (int i2 = 0; i2 < size; i2++) {
                    boolean z2 = false;
                    while (!z2) {
                        int iNextInt2 = random.nextInt(list3.size());
                        if (!arrayList.contains(Integer.valueOf(iNextInt2))) {
                            arrayList.add(Integer.valueOf(iNextInt2));
                            z2 = true;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = list5.size();
                boolean z3 = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    boolean z4 = false;
                    while (!z4) {
                        int iNextInt3 = random.nextInt(list3.size());
                        if (list3.size() <= 1 || z3) {
                            if (!arrayList2.contains(Integer.valueOf(iNextInt3))) {
                                arrayList2.add(Integer.valueOf(iNextInt3));
                                z3 = true;
                                z4 = true;
                            }
                        } else if (((Number) AbstractC3393o1.m17731f(1, arrayList)).intValue() != iNextInt3 && !arrayList2.contains(Integer.valueOf(iNextInt3))) {
                            arrayList2.add(Integer.valueOf(iNextInt3));
                            z3 = true;
                            z4 = true;
                        }
                    }
                }
                ArrayList arrayListM22603U0 = u91.m22603U0(arrayList2, arrayList);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList arrayList3 = new ArrayList();
                int size3 = arrayListM22603U0.size();
                int i4 = 0;
                while (true) {
                    Integer num = null;
                    if (i4 >= size3) {
                        break;
                    }
                    v0b v0bVar2 = (v0b) list3.get(((Number) arrayListM22603U0.get(i4)).intValue());
                    if (linkedHashMap3.get(v0bVar2) == null) {
                        linkedHashMap3.put(v0bVar2, 0);
                    } else {
                        linkedHashMap3.put(v0bVar2, 1);
                    }
                    Integer num2 = (Integer) linkedHashMap3.get(v0bVar2);
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    List list6 = (List) linkedHashMap.get(v0bVar2);
                    if (iIntValue < (list6 != null ? list6.size() : 0)) {
                        List list7 = (List) linkedHashMap.get(v0bVar2);
                        if (list7 != null) {
                            num2.getClass();
                            num = (Integer) list7.get(num2.intValue());
                        }
                        int iOrdinal = ReviewActivityType.FlashcardActivity.ordinal();
                        if (num != null && num.intValue() == iOrdinal) {
                            arrayList3.add(new gb8(v0bVar2));
                        } else {
                            int iOrdinal2 = ReviewActivityType.FlashcardReverseActivity.ordinal();
                            if (num != null && num.intValue() == iOrdinal2) {
                                arrayList3.add(new hb8(v0bVar2));
                            } else {
                                int iOrdinal3 = ReviewActivityType.DictationActivity.ordinal();
                                if (num != null && num.intValue() == iOrdinal3) {
                                    String str = v0bVar2.f64672b;
                                    arrayList3.add(new eb8(v0bVar2, str, c2758f.m9611e3(str)));
                                } else {
                                    int iOrdinal4 = ReviewActivityType.DictationReverseActivity.ordinal();
                                    if (num != null && num.intValue() == iOrdinal4) {
                                        String str2 = ((TokenMeaning) v0bVar2.f64675e.get(0)).f19596c;
                                        arrayList3.add(new fb8(v0bVar2, str2 != null ? str2 : "", c2758f.m9610d3(((TokenMeaning) v0bVar2.f64675e.get(0)).f19596c)));
                                    } else {
                                        int iOrdinal5 = ReviewActivityType.MultiChoiceActivity.ordinal();
                                        if (num != null && num.intValue() == iOrdinal5) {
                                            ArrayList arrayListM9610d3 = c2758f.m9610d3(((TokenMeaning) v0bVar2.f64675e.get(0)).f19596c);
                                            String str3 = ((TokenMeaning) v0bVar2.f64675e.get(0)).f19596c;
                                            arrayList3.add(new jb8(v0bVar2, str3 != null ? str3 : "", arrayListM9610d3));
                                        } else {
                                            int iOrdinal6 = ReviewActivityType.MultiChoiceReverseActivity.ordinal();
                                            if (num != null && num.intValue() == iOrdinal6) {
                                                arrayList3.add(new kb8(v0bVar2, v0bVar2.f64672b, c2758f.m9611e3(v0bVar2.f64672b)));
                                            } else {
                                                int iOrdinal7 = ReviewActivityType.ClozeActivity.ordinal();
                                                if (num != null && num.intValue() == iOrdinal7) {
                                                    arrayList3.add(new db8(v0bVar2, v0bVar2.f64672b));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4++;
                }
                C3244l c3244l = c2758f.f32521q;
                c3244l.getClass();
                c3244l.m15572j(null, arrayList3);
                c2758f.m9613g3();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$4(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31838b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$4(this.f31838b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31837a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31838b;
            C3228h c3228h = new C3228h(c2758f.f32501T, new C3540rl(c2758f.f32490I, 5), new C26301(3, null));
            C26312 c26312 = new C26312(c2758f, null);
            this.f31837a = 1;
            if (AbstractC3224d.m15529h(c3228h, c26312, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
