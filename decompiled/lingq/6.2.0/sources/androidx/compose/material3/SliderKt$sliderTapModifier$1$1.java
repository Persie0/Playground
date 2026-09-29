package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.foundation.gestures.C0108p;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.kj7;
import p000.lj7;
import p000.mj7;
import p000.og7;
import p000.qa9;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", m4291f = "Slider.kt", m4292l = {2730}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$sliderTapModifier$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og7 f3307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v56 f3308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0228e0 f3309d;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1 */
    @c32(m4290c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1", m4291f = "Slider.kt", m4292l = {2737, 2748, 2748}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02161 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f3310a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f3311b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f3312c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ v56 f3313d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0228e0 f3314e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02161(v56 v56Var, C0228e0 c0228e0, Continuation continuation) {
            super(3, continuation);
            this.f3313d = v56Var;
            this.f3314e = c0228e0;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((gq6) obj2).f41189a;
            C02161 c02161 = new C02161(this.f3313d, this.f3314e, (Continuation) obj3);
            c02161.f3311b = (C0108p) obj;
            c02161.f3312c = j;
            return c02161.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            float fM21222h;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f3310a;
            lj7 lj7Var = null;
            v56 v56Var = this.f3313d;
            try {
                if (i != 0) {
                    if (i == 1) {
                        lj7Var = (lj7) this.f3311b;
                        AbstractC3193b.m15359b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.f3311b;
                            AbstractC3193b.m15359b(obj);
                            throw th;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
                AbstractC3193b.m15359b(obj);
                C0108p c0108p = (C0108p) this.f3311b;
                long j = this.f3312c;
                lj7 lj7Var2 = new lj7(j);
                try {
                    v56Var.m23126b(lj7Var2);
                    C0228e0 c0228e0 = this.f3314e;
                    if (c0228e0.f3412m == Orientation.Vertical) {
                        fM21222h = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        fM21222h = c0228e0.f3409j ? c0228e0.f3407h.m21222h() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
                    }
                    c0228e0.f3416q.m19862i(fM21222h - c0228e0.f3415p.m19861h());
                    this.f3311b = lj7Var2;
                    this.f3310a = 1;
                    obj = c0108p.m911f(this);
                    if (obj != coroutineSingletons) {
                        lj7Var = lj7Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    lj7Var = lj7Var2;
                    if (lj7Var == null) {
                        throw th;
                    }
                    kj7 kj7Var = new kj7(lj7Var);
                    this.f3311b = th;
                    this.f3310a = 3;
                    if (v56Var.m23125a(kj7Var, this) != coroutineSingletons) {
                        th = th;
                        throw th;
                    }
                }
                return coroutineSingletons;
                v56Var.m23126b(((Boolean) obj).booleanValue() ? new mj7(lj7Var) : new kj7(lj7Var));
                return xfa.f68157a;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$1$1(og7 og7Var, v56 v56Var, C0228e0 c0228e0, Continuation continuation) {
        super(2, continuation);
        this.f3307b = og7Var;
        this.f3308c = v56Var;
        this.f3309d = c0228e0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderKt$sliderTapModifier$1$1(this.f3307b, this.f3308c, this.f3309d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$sliderTapModifier$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3306a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v56 v56Var = this.f3308c;
            C0228e0 c0228e0 = this.f3309d;
            C02161 c02161 = new C02161(v56Var, c0228e0, null);
            qa9 qa9Var = new qa9(c0228e0, 3);
            this.f3306a = 1;
            if (AbstractC0117w.m942e(this.f3307b, c02161, qa9Var, this, 3) == coroutineSingletons) {
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
