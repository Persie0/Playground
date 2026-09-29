package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.kg7;
import p000.og7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", m4291f = "LazyLayoutPager.kt", m4292l = {289}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutPagerKt$dragDirectionDetector$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og7 f2624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0150d f2625c;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1 */
    @c32(m4290c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", m4291f = "LazyLayoutPager.kt", m4292l = {291, 295}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01461 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: b */
        public kg7 f2626b;

        /* JADX INFO: renamed from: c */
        public kg7 f2627c;

        /* JADX INFO: renamed from: d */
        public int f2628d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f2629e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AbstractC0150d f2630f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01461(AbstractC0150d abstractC0150d, Continuation continuation) {
            super(2, continuation);
            this.f2630f = abstractC0150d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C01461 c01461 = new C01461(this.f2630f, continuation);
            c01461.f2629e = obj;
            return c01461;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01461) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:0: B:20:0x0073->B:24:0x0084, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x0087 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:19:0x0067). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.f2628d
                r2 = 0
                androidx.compose.foundation.pager.d r3 = r12.f2630f
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L22
                if (r1 != r4) goto L1c
                kg7 r1 = r12.f2627c
                kg7 r2 = r12.f2626b
                java.lang.Object r6 = r12.f2629e
                androidx.compose.ui.input.pointer.f r6 = (androidx.compose.p002ui.input.pointer.C0332f) r6
                kotlin.AbstractC3193b.m15359b(r13)
                goto L67
            L1c:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r12)
                return r2
            L22:
                java.lang.Object r1 = r12.f2629e
                androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
                kotlin.AbstractC3193b.m15359b(r13)
                goto L3f
            L2a:
                kotlin.AbstractC3193b.m15359b(r13)
                java.lang.Object r13 = r12.f2629e
                r1 = r13
                androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
                androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
                r12.f2629e = r1
                r12.f2628d = r6
                java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0117w.m938a(r1, r5, r13, r12)
                if (r13 != r0) goto L3f
                goto L62
            L3f:
                kg7 r13 = (p000.kg7) r13
                t66 r6 = r3.f2673c
                gq6 r7 = new gq6
                r8 = 0
                r7.<init>(r8)
                xc9 r6 = (p000.xc9) r6
                r6.setValue(r7)
                r6 = r1
            L50:
                if (r2 != 0) goto L93
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
                r12.f2629e = r6
                r12.f2626b = r13
                r12.f2627c = r2
                r12.f2628d = r4
                java.lang.Object r1 = r6.m1473b(r1, r12)
                if (r1 != r0) goto L63
            L62:
                return r0
            L63:
                r11 = r2
                r2 = r13
                r13 = r1
                r1 = r11
            L67:
                fg7 r13 = (p000.fg7) r13
                java.util.List r7 = r13.f39071a
                r8 = r7
                java.util.Collection r8 = (java.util.Collection) r8
                int r8 = r8.size()
                r9 = r5
            L73:
                if (r9 >= r8) goto L87
                java.lang.Object r10 = r7.get(r9)
                kg7 r10 = (p000.kg7) r10
                boolean r10 = p000.ci8.m4724i(r10)
                if (r10 != 0) goto L84
                r13 = r2
                r2 = r1
                goto L50
            L84:
                int r9 = r9 + 1
                goto L73
            L87:
                java.util.List r13 = r13.f39071a
                java.lang.Object r13 = r13.get(r5)
                kg7 r13 = (p000.kg7) r13
                r11 = r2
                r2 = r13
                r13 = r11
                goto L50
            L93:
                long r0 = r2.f47237c
                long r12 = r13.f47237c
                long r12 = p000.gq6.m12824e(r0, r12)
                t66 r0 = r3.f2673c
                gq6 r1 = new gq6
                r1.<init>(r12)
                xc9 r0 = (p000.xc9) r0
                r0.setValue(r1)
                xfa r12 = p000.xfa.f68157a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1.C01461.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1(og7 og7Var, AbstractC0150d abstractC0150d, Continuation continuation) {
        super(2, continuation);
        this.f2624b = og7Var;
        this.f2625c = abstractC0150d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutPagerKt$dragDirectionDetector$1$1(this.f2624b, this.f2625c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2623a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C01461 c01461 = new C01461(this.f2625c, null);
            this.f2623a = 1;
            if (AbstractC0095c.m836k(this.f2624b, c01461, this) == coroutineSingletons) {
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
