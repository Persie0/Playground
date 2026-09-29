package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cd4;
import p000.gb0;
import p000.gq6;
import p000.kg7;
import p000.og7;
import p000.pg9;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m4291f = "TapGestureDetector.kt", m4292l = {274}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2120a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ og7 f2122c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aj3 f2123d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gb0 f2124e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0108p f2125f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m4291f = "TapGestureDetector.kt", m4292l = {277, 283}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00911 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: b */
        public pg9 f2126b;

        /* JADX INFO: renamed from: c */
        public int f2127c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f2128d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ un1 f2129e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ aj3 f2130f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gb0 f2131g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C0108p f2132h;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name */
        @c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m4291f = "TapGestureDetector.kt", m4292l = {280}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f2133a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ aj3 f2134b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0108p f2135c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kg7 f2136d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(aj3 aj3Var, C0108p c0108p, kg7 kg7Var, Continuation continuation) {
                super(2, continuation);
                this.f2134b = aj3Var;
                this.f2135c = c0108p;
                this.f2136d = kg7Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f2134b, this.f2135c, this.f2136d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f2133a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    gq6 gq6Var = new gq6(this.f2136d.f47237c);
                    this.f2133a = 1;
                    if (this.f2134b.invoke(this.f2135c, gq6Var, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        @c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m4291f = "TapGestureDetector.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0108p f2137a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0108p c0108p, Continuation continuation) {
                super(2, continuation);
                this.f2137a = c0108p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f2137a, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass2.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                this.f2137a.m908c();
                return xfa.f68157a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        @c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m4291f = "TapGestureDetector.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass3 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0108p f2138a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C0108p c0108p, Continuation continuation) {
                super(2, continuation);
                this.f2138a = c0108p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f2138a, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass3.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                this.f2138a.m909d();
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00911(un1 un1Var, aj3 aj3Var, gb0 gb0Var, C0108p c0108p, Continuation continuation) {
            super(2, continuation);
            this.f2129e = un1Var;
            this.f2130f = aj3Var;
            this.f2131g = gb0Var;
            this.f2132h = c0108p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00911 c00911 = new C00911(this.f2129e, this.f2130f, this.f2131g, this.f2132h, continuation);
            c00911.f2128d = obj;
            return c00911;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00911) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x007d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            pg9 pg9VarM23926u;
            C0332f c0332f;
            cd4 cd4Var;
            kg7 kg7Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2127c;
            un1 un1Var = this.f2129e;
            C0108p c0108p = this.f2132h;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0332f c0332f2 = (C0332f) this.f2128d;
                pg9VarM23926u = wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(c0108p, null), 1);
                this.f2128d = c0332f2;
                this.f2126b = pg9VarM23926u;
                this.f2127c = 1;
                Object objM939b = AbstractC0117w.m939b(c0332f2, false, null, this, 3);
                if (objM939b != coroutineSingletons) {
                    c0332f = c0332f2;
                    obj = objM939b;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                pg9VarM23926u = this.f2126b;
                c0332f = (C0332f) this.f2128d;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cd4Var = (cd4) this.f2128d;
                AbstractC3193b.m15359b(obj);
            }
            kg7Var = (kg7) obj;
            if (kg7Var == null) {
                AbstractC0117w.m944g(un1Var, cd4Var, new AnonymousClass2(c0108p, null));
            } else {
                kg7Var.m15189a();
                AbstractC0117w.m944g(un1Var, cd4Var, new AnonymousClass3(c0108p, null));
                this.f2131g.invoke(new gq6(kg7Var.f47237c));
            }
            return xfa.f68157a;
            kg7 kg7Var2 = (kg7) obj;
            kg7Var2.m15189a();
            aj3 aj3Var = AbstractC0117w.f2373a;
            aj3 aj3Var2 = this.f2130f;
            if (aj3Var2 != aj3Var) {
                AbstractC0117w.m944g(un1Var, pg9VarM23926u, new AnonymousClass1(aj3Var2, c0108p, kg7Var2, null));
            }
            this.f2128d = pg9VarM23926u;
            this.f2126b = null;
            this.f2127c = 2;
            obj = AbstractC0117w.m947j(c0332f, PointerEventPass.Main, this);
            if (obj != coroutineSingletons) {
                cd4Var = pg9VarM23926u;
                kg7Var = (kg7) obj;
                if (kg7Var == null) {
                    AbstractC0117w.m944g(un1Var, cd4Var, new AnonymousClass2(c0108p, null));
                } else {
                    kg7Var.m15189a();
                    AbstractC0117w.m944g(un1Var, cd4Var, new AnonymousClass3(c0108p, null));
                    this.f2131g.invoke(new gq6(kg7Var.f47237c));
                }
                return xfa.f68157a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(og7 og7Var, aj3 aj3Var, gb0 gb0Var, C0108p c0108p, Continuation continuation) {
        super(2, continuation);
        this.f2122c = og7Var;
        this.f2123d = aj3Var;
        this.f2124e = gb0Var;
        this.f2125f = c0108p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f2122c, this.f2123d, this.f2124e, this.f2125f, continuation);
        tapGestureDetectorKt$detectTapAndPress$2.f2121b = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2120a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C00911 c00911 = new C00911((un1) this.f2121b, this.f2123d, this.f2124e, this.f2125f, null);
            this.f2120a = 1;
            if (AbstractC0095c.m836k(this.f2122c, c00911, this) == coroutineSingletons) {
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
