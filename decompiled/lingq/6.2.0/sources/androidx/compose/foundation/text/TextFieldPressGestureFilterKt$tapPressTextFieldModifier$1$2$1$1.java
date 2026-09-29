package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C0108p;
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
import p000.q84;
import p000.t66;
import p000.un1;
import p000.v56;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m4291f = "TextFieldPressGestureFilter.kt", m4292l = {67}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f2812a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0108p f2813b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f2814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f2815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f2816e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v56 f2817f;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1 */
    @c32(m4290c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m4291f = "TextFieldPressGestureFilter.kt", m4292l = {60, 64}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01631 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public Object f2818a;

        /* JADX INFO: renamed from: b */
        public int f2819b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66 f2820c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f2821d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ v56 f2822e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01631(t66 t66Var, long j, v56 v56Var, Continuation continuation) {
            super(2, continuation);
            this.f2820c = t66Var;
            this.f2821d = j;
            this.f2822e = v56Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01631(this.f2820c, this.f2821d, this.f2822e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01631) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            if (r3.m23125a(r1, r7) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            t66 t66Var;
            lj7 lj7Var;
            lj7 lj7Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2819b;
            v56 v56Var = this.f2822e;
            t66 t66Var2 = this.f2820c;
            if (i != 0) {
                if (i == 1) {
                    t66Var = (t66) this.f2818a;
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lj7Var2 = (lj7) this.f2818a;
                    AbstractC3193b.m15359b(obj);
                }
                lj7Var = lj7Var2;
                t66Var2.setValue(lj7Var);
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            lj7 lj7Var3 = (lj7) t66Var2.getValue();
            if (lj7Var3 == null) {
                lj7Var = new lj7(this.f2821d);
                if (v56Var != null) {
                    this.f2818a = lj7Var;
                    this.f2819b = 2;
                    if (v56Var.m23125a(lj7Var, this) != coroutineSingletons) {
                        lj7Var2 = lj7Var;
                        lj7Var = lj7Var2;
                    }
                }
                t66Var2.setValue(lj7Var);
                return xfa.f68157a;
            }
            kj7 kj7Var = new kj7(lj7Var3);
            if (v56Var != null) {
                this.f2818a = t66Var2;
                this.f2819b = 1;
            }
            t66Var = t66Var2;
            return coroutineSingletons;
            t66Var.setValue(null);
            lj7Var = new lj7(this.f2821d);
            if (v56Var != null) {
                this.f2818a = lj7Var;
                this.f2819b = 2;
                if (v56Var.m23125a(lj7Var, this) != coroutineSingletons) {
                    lj7Var2 = lj7Var;
                    lj7Var = lj7Var2;
                }
                return coroutineSingletons;
            }
            t66Var2.setValue(lj7Var);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2 */
    @c32(m4290c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m4291f = "TextFieldPressGestureFilter.kt", m4292l = {76}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01642 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public t66 f2823a;

        /* JADX INFO: renamed from: b */
        public int f2824b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66 f2825c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f2826d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ v56 f2827e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01642(t66 t66Var, boolean z, v56 v56Var, Continuation continuation) {
            super(2, continuation);
            this.f2825c = t66Var;
            this.f2826d = z;
            this.f2827e = v56Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01642(this.f2825c, this.f2826d, this.f2827e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01642) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            t66 t66Var;
            t66 t66Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2824b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                t66Var = this.f2825c;
                lj7 lj7Var = (lj7) t66Var.getValue();
                if (lj7Var != null) {
                    q84 mj7Var = this.f2826d ? new mj7(lj7Var) : new kj7(lj7Var);
                    v56 v56Var = this.f2827e;
                    if (v56Var != null) {
                        this.f2823a = t66Var;
                        this.f2824b = 1;
                        if (v56Var.m23125a(mj7Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        t66Var2 = t66Var;
                    }
                    t66Var.setValue(null);
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t66Var2 = this.f2823a;
            AbstractC3193b.m15359b(obj);
            t66Var = t66Var2;
            t66Var.setValue(null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(un1 un1Var, t66 t66Var, v56 v56Var, Continuation continuation) {
        super(3, continuation);
        this.f2815d = un1Var;
        this.f2816e = t66Var;
        this.f2817f = v56Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((gq6) obj2).f41189a;
        t66 t66Var = this.f2816e;
        v56 v56Var = this.f2817f;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.f2815d, t66Var, v56Var, (Continuation) obj3);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.f2813b = (C0108p) obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.f2814c = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2812a;
        un1 un1Var = this.f2815d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0108p c0108p = this.f2813b;
            wfb.m23926u(un1Var, null, null, new C01631(this.f2816e, this.f2814c, this.f2817f, null), 3);
            this.f2812a = 1;
            obj = c0108p.m911f(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        wfb.m23926u(un1Var, null, null, new C01642(this.f2816e, ((Boolean) obj).booleanValue(), this.f2817f, null), 3);
        return xfa.f68157a;
    }
}
