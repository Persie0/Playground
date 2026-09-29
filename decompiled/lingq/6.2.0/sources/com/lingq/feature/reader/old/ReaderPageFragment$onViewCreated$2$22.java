package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ph2;
import p000.t62;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22", m4291f = "ReaderPageFragment.kt", m4292l = {713}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$22 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28535b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1", m4291f = "ReaderPageFragment.kt", m4292l = {715, 716}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23441 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28536a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f28537b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReaderPageFragment f28538c;

        /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReaderPageFragment f28539a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReaderPageFragment readerPageFragment, Continuation continuation) {
                super(2, continuation);
                this.f28539a = readerPageFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f28539a, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass1.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                ReaderPageFragment readerPageFragment = this.f28539a;
                xz7 xz7VarM9293R0 = ReaderPageFragment.m9293R0(readerPageFragment);
                if (!xz7VarM9293R0.equals(readerPageFragment.f28451M0) && xz7VarM9293R0.f69008e.length() > 0) {
                    readerPageFragment.f28451M0 = xz7VarM9293R0;
                    readerPageFragment.m9299X0().m9307b3(xz7VarM9293R0.f69004a, xz7VarM9293R0.f69005b, false);
                }
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23441(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28538c = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23441 c23441 = new C23441(this.f28538c, continuation);
            c23441.f28537b = obj;
            return c23441;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23441) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:11:0x001f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f28537b
                un1 r0 = (p000.un1) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r8.f28536a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1c
                if (r2 == r5) goto L18
                if (r2 != r4) goto L12
                goto L1c
            L12:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r8)
                return r3
            L18:
                kotlin.AbstractC3193b.m15359b(r9)
                goto L32
            L1c:
                kotlin.AbstractC3193b.m15359b(r9)
            L1f:
                boolean r9 = p000.vz1.m23603I(r0)
                if (r9 == 0) goto L48
                r8.f28537b = r0
                r8.f28536a = r5
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = kotlinx.coroutines.AbstractC3208a.m15437d(r6, r8)
                if (r9 != r1) goto L32
                goto L47
            L32:
                v72 r9 = p000.ph2.f56212a
                xq3 r9 = p000.dp5.f36000a
                com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1$1 r2 = new com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22$1$1
                com.lingq.feature.reader.old.ReaderPageFragment r6 = r8.f28538c
                r2.<init>(r6, r3)
                r8.f28537b = r0
                r8.f28536a = r4
                java.lang.Object r9 = p000.wfb.m23905G(r2, r9, r8)
                if (r9 != r1) goto L1f
            L47:
                return r1
            L48:
                xfa r8 = p000.xfa.f68157a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$22.C23441.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$22(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28535b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$22(this.f28535b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$22) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28534a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            C23441 c23441 = new C23441(this.f28535b, null);
            this.f28534a = 1;
            if (wfb.m23905G(c23441, t62Var, this) == coroutineSingletons) {
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
