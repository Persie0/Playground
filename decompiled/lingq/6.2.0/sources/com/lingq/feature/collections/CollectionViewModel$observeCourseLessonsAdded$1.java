package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItemType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bx0;
import p000.c32;
import p000.c61;
import p000.ld0;
import p000.s23;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessonsAdded$1", m4291f = "CollectionViewModel.kt", m4292l = {1221, 1221}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseLessonsAdded$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25444b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseLessonsAdded$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessonsAdded$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20191 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f25445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20191(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25446b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20191 c20191 = new C20191(this.f25446b, continuation);
            c20191.f25445a = ((Boolean) obj).booleanValue();
            return c20191;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C20191 c20191 = (C20191) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20191.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            boolean z = this.f25445a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25446b.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, z, false, false, false, false, false, false, false, false, false, false, false, null, 131055)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseLessonsAdded$1(C2034d c2034d, Continuation continuation) {
        super(1, continuation);
        this.f25444b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourseLessonsAdded$1(this.f25444b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourseLessonsAdded$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h((p000.c83) r11, r1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25443a;
        C2034d c2034d = this.f25444b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        s23 s23Var = c2034d.f25585o;
        int i2 = c2034d.f25567Z;
        this.f25443a = 1;
        C1321i c1321i = ((C1296l) s23Var.f60177a).f16514d;
        String value = LibraryItemType.Content.getValue();
        c1321i.getClass();
        value.getClass();
        obj = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "LibraryCounterEntity", "CoursesAndLessonsJoin"}, new ld0(i2, value, 13)), 14));
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        C20191 c20191 = new C20191(c2034d, null);
        this.f25443a = 2;
    }
}
