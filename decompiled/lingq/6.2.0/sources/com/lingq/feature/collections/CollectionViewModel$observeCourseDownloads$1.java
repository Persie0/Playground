package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c23;
import p000.c32;
import p000.c61;
import p000.c83;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseDownloads$1", m4291f = "CollectionViewModel.kt", m4292l = {1209}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseDownloads$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25423b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseDownloads$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseDownloads$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20151 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25424a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20151(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25425b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20151 c20151 = new C20151(this.f25425b, continuation);
            c20151.f25424a = obj;
            return c20151;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20151 c20151 = (C20151) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20151.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2034d c2034d;
            Object next;
            Object value;
            List list = (List) this.f25424a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            Iterator it = list.iterator();
            do {
                boolean zHasNext = it.hasNext();
                c2034d = this.f25425b;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((LibraryItemDownload) next).f19472a != c2034d.f25567Z);
            LibraryItemDownload libraryItemDownload = (LibraryItemDownload) next;
            boolean z = false;
            if (libraryItemDownload != null && !libraryItemDownload.f19473b) {
                z = true;
            }
            boolean z2 = z;
            C3244l c3244l = c2034d.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, z2, false, false, false, false, false, false, false, false, false, null, 131007)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseDownloads$1(C2034d c2034d, Continuation continuation) {
        super(1, continuation);
        this.f25423b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourseDownloads$1(this.f25423b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourseDownloads$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25422a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25423b;
            c23 c23Var = c2034d.f25589s;
            int i2 = c2034d.f25567Z;
            y95 y95Var = c23Var.f9349a;
            List listM23604J = vz1.m23604J(Integer.valueOf(i2));
            C1296l c1296l = (C1296l) y95Var;
            c1296l.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(C1321i.m7502H0(c1296l.f16514d, listM23604J));
            C20151 c20151 = new C20151(c2034d, null);
            this.f25422a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20151, this) == coroutineSingletons) {
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
