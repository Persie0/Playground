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
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableLocales$1", m4291f = "DictManageViewModel.kt", m4292l = {186}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$fetchAvailableLocales$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25697b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableLocales$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableLocales$1$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20511 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2057b f25698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20511(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25698a = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20511(this.f25698a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20511 c20511 = (C20511) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20511.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25698a.f25800j;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableLocales$1$2 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchAvailableLocales$1$2", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20522 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25699a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2057b f25700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20522(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25700b = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20522 c20522 = new C20522(this.f25700b, continuation);
            c20522.f25699a = obj;
            return c20522;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20522 c20522 = (C20522) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20522.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25699a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zIsEmpty = list.isEmpty();
            C2057b c2057b = this.f25700b;
            C3244l c3244l = c2057b.f25800j;
            if (zIsEmpty) {
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            } else {
                Boolean bool2 = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool2);
                c2057b.f25797g.m15571i(list);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$fetchAvailableLocales$1(C2057b c2057b, Continuation continuation) {
        super(1, continuation);
        this.f25697b = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictManageViewModel$fetchAvailableLocales$1(this.f25697b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictManageViewModel$fetchAvailableLocales$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25696a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25697b;
            c83 c83VarM15544w = AbstractC3224d.m15544w(new m83(((C1292h) c2057b.f25793c).m7201g(c2057b.f25792b.mo4589b2()), new C20511(c2057b, null)), c2057b.f25794d);
            C20522 c20522 = new C20522(c2057b, null);
            this.f25696a = 1;
            if (AbstractC3224d.m15529h(c83VarM15544w, c20522, this) == coroutineSingletons) {
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
