package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.wi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_cwtMeanings$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$_cwtMeanings$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28622b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3244l f28623c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$_cwtMeanings$1$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_cwtMeanings$1$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {157}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23631 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28624a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f28625b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3244l f28626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23631(C3244l c3244l, Continuation continuation) {
            super(2, continuation);
            this.f28626c = c3244l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23631 c23631 = new C23631(this.f28626c, continuation);
            c23631.f28625b = ((Boolean) obj).booleanValue();
            return c23631;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((C23631) create(bool, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28625b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28624a;
            xfa xfaVar = xfa.f68157a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f28625b = z;
            this.f28624a = 1;
            this.f28626c.emit(boolValueOf, this);
            return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$_cwtMeanings$1$1(C2411m c2411m, C3244l c3244l, Continuation continuation) {
        super(2, continuation);
        this.f28622b = c2411m;
        this.f28623c = c3244l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$_cwtMeanings$1$1(this.f28622b, this.f28623c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$_cwtMeanings$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28621a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wi7 wi7Var = ((C1368a) this.f28622b.f29237i).f18467z1;
            C23631 c23631 = new C23631(this.f28623c, null);
            this.f28621a = 1;
            if (AbstractC3224d.m15529h(wi7Var, c23631, this) == coroutineSingletons) {
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
