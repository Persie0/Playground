package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.C3386nv;
import p000.c32;
import p000.mq7;
import p000.og7;
import p000.oq7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.xk2;
import p000.zi3;
import p000.zk2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m4291f = "Slider.kt", m4292l = {2774}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$rangeSliderPressDragModifier$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3265a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ og7 f3267c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ oq7 f3268d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mq7 f3269e;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1 */
    @c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m4291f = "Slider.kt", m4292l = {2780, 2798, 2832}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02151 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ un1 f3270H;

        /* JADX INFO: renamed from: b */
        public Ref$BooleanRef f3271b;

        /* JADX INFO: renamed from: c */
        public Object f3272c;

        /* JADX INFO: renamed from: d */
        public Object f3273d;

        /* JADX INFO: renamed from: e */
        public v56 f3274e;

        /* JADX INFO: renamed from: f */
        public float f3275f;

        /* JADX INFO: renamed from: g */
        public float f3276g;

        /* JADX INFO: renamed from: h */
        public long f3277h;

        /* JADX INFO: renamed from: i */
        public int f3278i;

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f3279j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ oq7 f3280k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ mq7 f3281l;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$3, reason: invalid class name */
        @c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$3", m4291f = "Slider.kt", m4292l = {2818}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass3 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f3288a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ v56 f3289b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ xk2 f3290c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(v56 v56Var, xk2 xk2Var, Continuation continuation) {
                super(2, continuation);
                this.f3289b = v56Var;
                this.f3290c = xk2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f3289b, this.f3290c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f3288a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    this.f3288a = 1;
                    if (this.f3289b.m23125a(this.f3290c, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$4, reason: invalid class name */
        @c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$4", m4291f = "Slider.kt", m4292l = {2850}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass4 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f3291a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ v56 f3292b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zk2 f3293c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(v56 v56Var, zk2 zk2Var, Continuation continuation) {
                super(2, continuation);
                this.f3292b = v56Var;
                this.f3293c = zk2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f3292b, this.f3293c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f3291a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    this.f3291a = 1;
                    if (this.f3292b.m23125a(this.f3293c, this) == coroutineSingletons) {
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
        public C02151(oq7 oq7Var, mq7 mq7Var, un1 un1Var, Continuation continuation) {
            super(2, continuation);
            this.f3280k = oq7Var;
            this.f3281l = mq7Var;
            this.f3270H = un1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C02151 c02151 = new C02151(this.f3280k, this.f3281l, this.f3270H, continuation);
            c02151.f3279j = obj;
            return c02151;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02151) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x014f  */
        /* JADX WARN: Code duplicated, block: B:55:0x015d  */
        /* JADX WARN: Code duplicated, block: B:59:0x0172  */
        /* JADX WARN: Code duplicated, block: B:61:0x017b A[Catch: all -> 0x016e, TryCatch #7 {all -> 0x016e, blocks: (B:56:0x0164, B:61:0x017b, B:63:0x017f, B:68:0x0194, B:71:0x01b5, B:101:0x0262, B:104:0x0268, B:112:0x0297), top: B:153:0x0164 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014d -> B:148:0x0151). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 814
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1.C02151.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1(og7 og7Var, oq7 oq7Var, mq7 mq7Var, Continuation continuation) {
        super(2, continuation);
        this.f3267c = og7Var;
        this.f3268d = oq7Var;
        this.f3269e = mq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1$1 sliderKt$rangeSliderPressDragModifier$1$1 = new SliderKt$rangeSliderPressDragModifier$1$1(this.f3267c, this.f3268d, this.f3269e, continuation);
        sliderKt$rangeSliderPressDragModifier$1$1.f3266b = obj;
        return sliderKt$rangeSliderPressDragModifier$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3265a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C02151 c02151 = new C02151(this.f3268d, this.f3269e, (un1) this.f3266b, null);
            this.f3265a = 1;
            if (AbstractC0095c.m836k(this.f3267c, c02151, this) == coroutineSingletons) {
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
