package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.aj3;
import p000.b91;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.fa4;
import p000.gy7;
import p000.iy7;
import p000.je9;
import p000.v91;
import p000.vs3;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$special$$inlined$combineTransform$1", m4291f = "ReaderPageViewModel.kt", m4292l = {247}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderPageViewModel$special$$inlined$combineTransform$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28750a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f28752c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2411m f28753d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$special$$inlined$combineTransform$1$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$special$$inlined$combineTransform$1$2", m4291f = "ReaderPageViewModel.kt", m4292l = {342}, m4293m = "invokeSuspend", m4294v = 2)
    public final class C23692 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f28754a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28755b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f28756c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C2411m f28757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23692(C2411m c2411m, Continuation continuation) {
            super(3, continuation);
            this.f28757d = c2411m;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C23692 c23692 = new C23692(this.f28757d, (Continuation) obj3);
            c23692.f28755b = (e83) obj;
            c23692.f28756c = (Object[]) obj2;
            return c23692.invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? arrayList;
            Object next;
            je9 je9Var;
            Object next2;
            je9 je9Var2;
            List<xz7> list;
            C2411m c2411m = this.f28757d;
            Locale locale = c2411m.f29253u;
            e83 e83Var = this.f28755b;
            Object[] objArr = this.f28756c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28754a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                ?? arrayList2 = EmptyList.f47638a;
                if (list2 == null) {
                    arrayList = arrayList2;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(obj3 instanceof je9)) {
                            obj3 = null;
                        }
                        je9 je9Var3 = (je9) obj3;
                        if (je9Var3 != null) {
                            arrayList.add(je9Var3);
                        }
                    }
                }
                Object obj4 = objArr[1];
                List list3 = obj4 instanceof List ? (List) obj4 : null;
                if (list3 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj5 : list3) {
                        if (!(obj5 instanceof je9)) {
                            obj5 = null;
                        }
                        je9 je9Var4 = (je9) obj5;
                        if (je9Var4 != null) {
                            arrayList2.add(je9Var4);
                        }
                    }
                }
                xz7 xz7Var = (xz7) objArr[2];
                xz7 xz7Var2 = (xz7) objArr[3];
                Object obj6 = objArr[4];
                List list4 = obj6 instanceof List ? (List) obj6 : null;
                if (list4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj7 : list4) {
                        if (!(obj7 instanceof je9)) {
                            obj7 = null;
                        }
                        je9 je9Var5 = (je9) obj7;
                        if (je9Var5 != null) {
                            arrayList3.add(je9Var5);
                        }
                    }
                }
                Object obj8 = objArr[5];
                obj8.getClass();
                TextHighlightStyle textHighlightStyle = (TextHighlightStyle) obj8;
                Object obj9 = objArr[6];
                obj9.getClass();
                int iIntValue = ((Integer) obj9).intValue();
                Object obj10 = objArr[7];
                obj10.getClass();
                vs3 vs3Var = (vs3) obj10;
                ArrayList arrayList4 = new ArrayList();
                iy7 iy7Var = c2411m.f29252t;
                if (iy7Var != null && (list = iy7Var.f44782d) != null) {
                    for (xz7 xz7Var3 : list) {
                        Iterator it = ((Iterable) arrayList2).iterator();
                        while (it.hasNext()) {
                            if (fa4.m11650l(xz7Var3, ((je9) it.next()).f45484e)) {
                                Map map = (Map) c2411m.f29196A.getValue();
                                String str = xz7Var3.f69008e;
                                locale.getClass();
                                LessonCard lessonCard = (LessonCard) map.get(vz1.m23610P(str, locale));
                                if (lessonCard != null) {
                                    arrayList4.add(c2411m.m9308c3(vs3Var, xz7Var3, lessonCard, true));
                                }
                            }
                        }
                        Iterator it2 = ((Iterable) arrayList).iterator();
                        while (it2.hasNext()) {
                            if (fa4.m11650l(xz7Var3, ((je9) it2.next()).f45484e)) {
                                Map map2 = (Map) c2411m.f29197B.getValue();
                                String str2 = xz7Var3.f69008e;
                                locale.getClass();
                                LessonWord lessonWord = (LessonWord) map2.get(vz1.m23610P(str2, locale));
                                if (lessonWord != null) {
                                    arrayList4.add(c2411m.m9310e3(vs3Var, xz7Var3, lessonWord, true));
                                }
                            }
                        }
                    }
                }
                Iterable<je9> iterable = (Iterable) arrayList;
                ArrayList arrayList5 = new ArrayList(v91.m23189q0(iterable, 10));
                for (je9 je9Var6 : iterable) {
                    Iterator it3 = arrayList4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        je9Var2 = (je9) next2;
                    } while (!fa4.m11650l(je9Var2 != null ? je9Var2.f45484e : null, je9Var6.f45484e));
                    je9 je9Var7 = (je9) next2;
                    if (je9Var7 != null) {
                        je9Var6 = je9Var7;
                    }
                    arrayList5.add(je9Var6);
                }
                Iterable<je9> iterable2 = (Iterable) arrayList2;
                ArrayList arrayList6 = new ArrayList(v91.m23189q0(iterable2, 10));
                for (je9 je9Var8 : iterable2) {
                    Iterator it4 = arrayList4.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        je9Var = (je9) next;
                    } while (!fa4.m11650l(je9Var != null ? je9Var.f45484e : null, je9Var8.f45484e));
                    je9 je9Var9 = (je9) next;
                    if (je9Var9 != null) {
                        je9Var8 = je9Var9;
                    }
                    arrayList6.add(je9Var8);
                }
                iy7 iy7Var2 = c2411m.f29252t;
                gy7 gy7Var = new gy7(arrayList5, arrayList6, xz7Var, fa4.m11650l(xz7Var2, iy7Var2 != null ? iy7Var2.f44779a : null) ? xz7Var2 : null, textHighlightStyle, iIntValue);
                this.f28755b = null;
                this.f28756c = null;
                this.f28754a = 1;
                if (e83Var.emit(gy7Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$special$$inlined$combineTransform$1(c83[] c83VarArr, Continuation continuation, C2411m c2411m) {
        super(2, continuation);
        this.f28752c = c83VarArr;
        this.f28753d = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderPageViewModel$special$$inlined$combineTransform$1 readerPageViewModel$special$$inlined$combineTransform$1 = new ReaderPageViewModel$special$$inlined$combineTransform$1(this.f28752c, continuation, this.f28753d);
        readerPageViewModel$special$$inlined$combineTransform$1.f28751b = obj;
        return readerPageViewModel$special$$inlined$combineTransform$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$special$$inlined$combineTransform$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f28751b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28750a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83[] c83VarArr = this.f28752c;
            b91 b91Var = new b91(c83VarArr, 9);
            C23692 c23692 = new C23692(this.f28753d, null);
            this.f28751b = null;
            this.f28750a = 1;
            if (AbstractC3238h.m15568a(e83Var, b91Var, c23692, this, c83VarArr) == coroutineSingletons) {
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
