package com.lingq.feature.imports;

import com.lingq.core.domain.model.language.Language;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fa4;
import p000.fv8;
import p000.ika;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.yd7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$2", m4291f = "UserImportSelectionViewModel.kt", m4292l = {290}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26044b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportSelectionViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$2$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20931 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2108e f26046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20931(C2108e c2108e, Continuation continuation) {
            super(2, continuation);
            this.f26046b = c2108e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20931 c20931 = new C20931(this.f26046b, continuation);
            c20931.f26045a = obj;
            return c20931;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20931 c20931 = (C20931) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20931.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f26045a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26046b;
            C3244l c3244l = c2108e.f26167o;
            List<Language> listM22614f1 = u91.m22614f1(list, new yd7(11));
            ArrayList arrayList = new ArrayList(v91.m23189q0(listM22614f1, 10));
            for (Language language : listM22614f1) {
                arrayList.add(new fv8(1, null, AbstractC3352my.m17093L(c2108e.f26156d, language.f19024a), language.f19024a, fa4.m11650l(language.f19024a, ((ika) c2108e.f26154b.mo9014u2().getValue()).f44237a)));
            }
            c3244l.getClass();
            c3244l.m15572j(null, arrayList);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$2(C2108e c2108e, Continuation continuation) {
        super(2, continuation);
        this.f26044b = c2108e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$2(this.f26044b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26043a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26044b;
            eh9 eh9VarMo4573B1 = c2108e.f26155c.mo4573B1();
            C20931 c20931 = new C20931(c2108e, null);
            eh9VarMo4573B1.getClass();
            this.f26043a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4573B1, c20931, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
