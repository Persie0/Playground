package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.m83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableDictionaries$1", m4291f = "DictManageViewModel.kt", m4292l = {154}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$fetchAvailableDictionaries$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25692b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableDictionaries$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableDictionaries$1$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20491 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2057b f25693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20491(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25693a = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20491(this.f25693a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20491 c20491 = (C20491) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20491.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25693a.f25800j;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableDictionaries$1$2 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableDictionaries$1$2", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20502 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2057b f25695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20502(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25695b = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20502 c20502 = new C20502(this.f25695b, continuation);
            c20502.f25694a = obj;
            return c20502;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20502 c20502 = (C20502) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20502.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25694a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25695b;
            C3244l c3244l = c2057b.f25800j;
            c2057b.f25799i.m15571i(list);
            if (!list.isEmpty()) {
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            }
            if (list.isEmpty()) {
                Boolean bool2 = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$fetchAvailableDictionaries$1(C2057b c2057b, Continuation continuation) {
        super(1, continuation);
        this.f25692b = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictManageViewModel$fetchAvailableDictionaries$1(this.f25692b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictManageViewModel$fetchAvailableDictionaries$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25691a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25692b;
            c83 c83VarM15544w = AbstractC3224d.m15544w(new m83(((C1292h) c2057b.f25793c).m7200f(c2057b.f25792b.mo4589b2(), (String) c2057b.f25796f.getValue()), new C20491(c2057b, null)), c2057b.f25794d);
            C20502 c20502 = new C20502(c2057b, null);
            this.f25691a = 1;
            if (AbstractC3224d.m15529h(c83VarM15544w, c20502, this) == coroutineSingletons) {
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
