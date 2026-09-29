package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.c83;
import p000.e23;
import p000.l91;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessonDownloads$1", m4291f = "CollectionViewModel.kt", m4292l = {1186}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseLessonDownloads$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25427b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseLessonDownloads$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessonDownloads$1$1", m4291f = "CollectionViewModel.kt", m4292l = {1192}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20161 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f25428a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f25429b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2034d f25430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20161(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25430c = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20161 c20161 = new C20161(this.f25430c, continuation);
            c20161.f25429b = obj;
            return c20161;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C20161) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l91 l91Var;
            C20161 c20161 = this;
            C2034d c2034d = c20161.f25430c;
            C3244l c3244l = c2034d.f25562U;
            List list = (List) c20161.f25429b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = c20161.f25428a;
            xfa xfaVar = xfa.f68157a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boolean.valueOf(((LibraryItemDownload) it.next()).f19473b));
                }
                boolean z = arrayList.size() == ((List) c3244l.getValue()).size() && !((Collection) c3244l.getValue()).isEmpty();
                C3244l c3244l2 = c2034d.f25559R;
                while (true) {
                    Object value = c3244l2.getValue();
                    if (c3244l2.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, z, false, false, false, false, false, false, false, false, false, false, null, 131039))) {
                        break;
                    }
                    c20161 = this;
                }
                if (z && (l91Var = c2034d.f25557P) != null) {
                    e23 e23Var = c2034d.f25591u;
                    String str = l91Var.f49324a;
                    int i2 = c2034d.f25567Z;
                    String value2 = LibraryItemType.Collection.getValue();
                    c20161.f25429b = null;
                    c20161.f25428a = 1;
                    Object objM7322q = ((C1296l) e23Var.f36613a).m7322q(i2, str, value2, c20161, true);
                    if (objM7322q != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM7322q = xfaVar;
                    }
                    if (objM7322q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseLessonDownloads$1(C2034d c2034d, Continuation continuation) {
        super(1, continuation);
        this.f25427b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourseLessonDownloads$1(this.f25427b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourseLessonDownloads$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25426a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25427b;
            e23 e23Var = c2034d.f25588r;
            int i2 = c2034d.f25567Z;
            y95 y95Var = e23Var.f36613a;
            List listM23604J = vz1.m23604J(Integer.valueOf(i2));
            C1296l c1296l = (C1296l) y95Var;
            c1296l.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(C1321i.m7502H0(c1296l.f16514d, listM23604J));
            C20161 c20161 = new C20161(c2034d, null);
            this.f25426a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20161, this) == coroutineSingletons) {
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
