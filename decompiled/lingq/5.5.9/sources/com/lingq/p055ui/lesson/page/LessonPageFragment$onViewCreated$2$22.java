package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.C7832g0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22", m19206f = "LessonPageFragment.kt", m19207l = {817}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$22 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28449e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28450f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1", m19206f = "LessonPageFragment.kt", m19207l = {819, 820}, m19208m = "invokeSuspend")
    public static final class C43581 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28451e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f28452f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonPageFragment f28453g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LessonPageFragment f28454e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28454e = lessonPageFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f28454e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                LessonPageFragment lessonPageFragment = this.f28454e;
                C7570d c7570dM10188o0 = LessonPageFragment.m10188o0(lessonPageFragment);
                if (!C5207g.m11106a(c7570dM10188o0, lessonPageFragment.f28347K0)) {
                    if (c7570dM10188o0.f41725e.length() > 0) {
                        lessonPageFragment.f28347K0 = c7570dM10188o0;
                        lessonPageFragment.m10193t0().m10202p2(c7570dM10188o0.f41721a, c7570dM10188o0.f41722b, false);
                    }
                }
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43581(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43581> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28453g = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43581 c43581 = new C43581(this.f28453g, interfaceC9968c);
            c43581.f28452f = obj;
            return c43581;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43581) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044  */
        /* JADX WARN: Code duplicated, block: B:16:0x0055 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:12:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0072
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final java.lang.Object mo1338x(java.lang.Object r13) {
            /*
                r12 = this;
                r8 = r12
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.f28451e
                r11 = 1
                r11 = 2
                r2 = r11
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1b
                r10 = 7
                java.lang.Object r1 = r8.f28452f
                no.z r1 = (no.InterfaceC7882z) r1
                r10 = 4
                p260m8.C7499b.m14977z0(r13)
                r11 = 6
                r13 = r1
                goto L3b
            L1b:
                r11 = 2
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r0 = r11
                r13.<init>(r0)
                r10 = 3
                throw r13
            L26:
                r10 = 1
                java.lang.Object r1 = r8.f28452f
                r11 = 4
                no.z r1 = (no.InterfaceC7882z) r1
                p260m8.C7499b.m14977z0(r13)
                r10 = 1
                r13 = r1
                r1 = r8
                goto L56
            L33:
                p260m8.C7499b.m14977z0(r13)
                java.lang.Object r13 = r8.f28452f
                no.z r13 = (no.InterfaceC7882z) r13
                r10 = 3
            L3b:
                r1 = r8
            L3c:
                r10 = 1
                boolean r10 = p260m8.C7499b.m14923U(r13)
                r4 = r10
                if (r4 == 0) goto L74
                r11 = 3
                r1.f28452f = r13
                r10 = 4
                r1.f28451e = r3
                r11 = 3
                r4 = 500(0x1f4, double:2.47E-321)
                r10 = 4
                java.lang.Object r10 = no.C7828f.m15567a(r4, r1)
                r4 = r10
                if (r4 != r0) goto L56
                return r0
            L56:
                kotlinx.coroutines.scheduling.b r4 = no.C7832g0.f42930a
                r10 = 7
                no.c1 r4 = kotlinx.coroutines.internal.C7162l.f40438a
                com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1$1 r5 = new com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$22$1$1
                com.lingq.ui.lesson.page.LessonPageFragment r6 = r1.f28453g
                r10 = 4
                r11 = 0
                r7 = r11
                r5.<init>(r6, r7)
                r1.f28452f = r13
                r11 = 5
                r1.f28451e = r2
                r11 = 7
                java.lang.Object r10 = no.C7828f.m15574h(r1, r4, r5)
                r4 = r10
                if (r4 != r0) goto L3c
                r10 = 3
                return r0
            L74:
                r10 = 6
                sl.e r13 = sl.C9072e.f47360a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.lesson.page.LessonPageFragment$onViewCreated$2$22.C43581.mo1338x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$22(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$22> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28450f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$22(this.f28450f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$22) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28449e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ExecutorC7177a executorC7177a = C7832g0.f42931b;
            C43581 c43581 = new C43581(this.f28450f, null);
            this.f28449e = 1;
            if (C7828f.m15574h(this, executorC7177a, c43581) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
