package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.C0252k0;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.og7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", m4291f = "BasicTooltip.kt", m4292l = {263}, m4293m = "invokeSuspend", m4294v = 1)
final class BasicTooltipKt$handleGestures$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3476a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ og7 f3478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0252k0 f3479d;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1 */
    @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", m4291f = "BasicTooltip.kt", m4292l = {267}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02381 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: b */
        public PointerEventPass f3480b;

        /* JADX INFO: renamed from: c */
        public int f3481c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f3482d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ un1 f3483e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0252k0 f3484f;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name */
        @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", m4291f = "BasicTooltip.kt", m4292l = {272}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f3485a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0252k0 f3486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0252k0 c0252k0, Continuation continuation) {
                super(2, continuation);
                this.f3486b = c0252k0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f3486b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f3485a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.f3485a = 1;
                    if (this.f3486b.m1179c(mutatePriority, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02381(un1 un1Var, C0252k0 c0252k0, Continuation continuation) {
            super(2, continuation);
            this.f3483e = un1Var;
            this.f3484f = c0252k0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C02381 c02381 = new C02381(this.f3483e, this.f3484f, continuation);
            c02381.f3482d = obj;
            return c02381;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02381) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0041  */
        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f3481c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L14
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.f3480b
                java.lang.Object r4 = r7.f3482d
                androidx.compose.ui.input.pointer.f r4 = (androidx.compose.p002ui.input.pointer.C0332f) r4
                kotlin.AbstractC3193b.m15359b(r8)
                goto L31
            L14:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r7)
                return r2
            L1a:
                kotlin.AbstractC3193b.m15359b(r8)
                java.lang.Object r8 = r7.f3482d
                androidx.compose.ui.input.pointer.f r8 = (androidx.compose.p002ui.input.pointer.C0332f) r8
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main
                r4 = r8
            L24:
                r7.f3482d = r4
                r7.f3480b = r1
                r7.f3481c = r3
                java.lang.Object r8 = r4.m1473b(r1, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                fg7 r8 = (p000.fg7) r8
                java.util.List r5 = r8.f39071a
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                kg7 r5 = (p000.kg7) r5
                int r5 = r5.f47243i
                r6 = 2
                if (r5 != r6) goto L24
                int r8 = r8.f39076f
                r5 = 4
                androidx.compose.material3.k0 r6 = r7.f3484f
                if (r8 != r5) goto L54
                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r8 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                r8.<init>(r6, r2)
                r5 = 3
                un1 r6 = r7.f3483e
                p000.wfb.m23926u(r6, r2, r2, r8, r5)
                goto L24
            L54:
                r5 = 5
                if (r8 != r5) goto L24
                r6.getClass()
                r6.m1177a()
                goto L24
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1.C02381.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$2$1(og7 og7Var, C0252k0 c0252k0, Continuation continuation) {
        super(2, continuation);
        this.f3478c = og7Var;
        this.f3479d = c0252k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltipKt$handleGestures$2$1 basicTooltipKt$handleGestures$2$1 = new BasicTooltipKt$handleGestures$2$1(this.f3478c, this.f3479d, continuation);
        basicTooltipKt$handleGestures$2$1.f3477b = obj;
        return basicTooltipKt$handleGestures$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3476a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C02381 c02381 = new C02381((un1) this.f3477b, this.f3479d, null);
            this.f3476a = 1;
            if (((C0333g) this.f3478c).m1479Z0(c02381, this) == coroutineSingletons) {
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
