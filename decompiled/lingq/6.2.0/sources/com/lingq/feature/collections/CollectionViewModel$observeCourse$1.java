package com.lingq.feature.collections;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.Sort;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.e83;
import p000.fa4;
import p000.g9a;
import p000.l91;
import p000.lda;
import p000.m83;
import p000.nn1;
import p000.r23;
import p000.ux5;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourse$1", m4291f = "CollectionViewModel.kt", m4292l = {931}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25413b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourse$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourse$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2034d f25414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20121(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25414a = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20121(this.f25414a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20121 c20121 = (C20121) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20121.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25414a.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, true, false, false, false, false, false, false, null, 130559)));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourse$1$2 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourse$1$2", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20132 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25415a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20132(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25416b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20132 c20132 = new C20132(this.f25416b, continuation);
            c20132.f25415a = obj;
            return c20132;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20132 c20132 = (C20132) create((LibraryItem) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20132.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            xfa xfaVar;
            Object next;
            Object value;
            C2034d c2034d = this.f25416b;
            C3244l c3244l = c2034d.f25559R;
            nn1 nn1Var = c2034d.f25553L;
            LibraryItem libraryItem = (LibraryItem) this.f25415a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            xfa xfaVar2 = xfa.f68157a;
            if (libraryItem == null) {
                return xfaVar2;
            }
            while (true) {
                Object value2 = c3244l.getValue();
                xfaVar = xfaVar2;
                if (c3244l.m15570h(value2, c61.m4341a((c61) value2, libraryItem, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, 130558))) {
                    break;
                }
                xfaVar2 = xfaVar;
            }
            if (!c2034d.f25572c0) {
                c2034d.f25572c0 = true;
                String str = libraryItem.f19429b0;
                if (str != null) {
                    Iterator<E> it = Sort.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fa4.m11650l(((Sort) next).getValue(), str));
                    Sort sort = (Sort) next;
                    if (sort == null) {
                        sort = Sort.Position;
                    }
                    Sort sort2 = sort;
                    if (sort2 != ((c61) c3244l.getValue()).f9609d) {
                        do {
                            value = c3244l.getValue();
                        } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, sort2, false, false, false, false, false, false, false, false, false, false, false, false, null, 131063)));
                        c2034d.m8950e3();
                    }
                }
            }
            int i = libraryItem.f19426a;
            AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(i, "observeCollectionCourseCounter-"), new CollectionViewModel$observeCourseCounter$1(c2034d, i, null));
            l91 l91Var = c2034d.f25557P;
            if (l91Var != null) {
                c2034d.m8948c3(g9a.m12431h("fetchCollectionCourseCounters-", c2034d.f25567Z, "-", l91Var.f49324a), new CollectionViewModel$fetchCourseCounters$1(c2034d, l91Var, null));
            }
            AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(c2034d.f25567Z, "observeCollectionCourseLessonsAdded-"), new CollectionViewModel$observeCourseLessonsAdded$1(c2034d, null));
            AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(c2034d.f25567Z, "observeCollectionCourseDownloads-"), new CollectionViewModel$observeCourseDownloads$1(c2034d, null));
            AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(c2034d.f25567Z, "observeCollectionCourseLessonDownloads-"), new CollectionViewModel$observeCourseLessonDownloads$1(c2034d, null));
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourse$1(C2034d c2034d, Continuation continuation) {
        super(1, continuation);
        this.f25413b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourse$1(this.f25413b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25412a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25413b;
            r23 r23Var = c2034d.f25577g;
            m83 m83Var = new m83(((C1296l) r23Var.f58517a).m7315j(c2034d.f25567Z), new C20121(c2034d, null));
            C20132 c20132 = new C20132(c2034d, null);
            this.f25412a = 1;
            if (AbstractC3224d.m15529h(m83Var, c20132, this) == coroutineSingletons) {
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
