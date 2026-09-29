package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.og7;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m4291f = "TapGestureDetector.kt", m4292l = {104}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2141a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ og7 f2143c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aj3 f2144d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f2145e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m4291f = "TapGestureDetector.kt", m4292l = {105}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00921 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: b */
        public int f2146b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f2147c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ un1 f2148d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0108p f2149e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ aj3 f2150f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ vi3 f2151g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00921(un1 un1Var, C0108p c0108p, aj3 aj3Var, vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f2148d = un1Var;
            this.f2149e = c0108p;
            this.f2150f = aj3Var;
            this.f2151g = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00921 c00921 = new C00921(this.f2148d, this.f2149e, this.f2150f, this.f2151g, continuation);
            c00921.f2147c = obj;
            return c00921;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00921) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2146b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0332f c0332f = (C0332f) this.f2147c;
                this.f2146b = 1;
                if (AbstractC0117w.m945h(c0332f, this.f2148d, this.f2149e, this.f2150f, this.f2151g, this) == coroutineSingletons) {
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
    public TapGestureDetectorKt$detectTapGestures$2(og7 og7Var, aj3 aj3Var, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2143c = og7Var;
        this.f2144d = aj3Var;
        this.f2145e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.f2143c, this.f2144d, this.f2145e, continuation);
        tapGestureDetectorKt$detectTapGestures$2.f2142b = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2141a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f2142b;
            og7 og7Var = this.f2143c;
            C00921 c00921 = new C00921(un1Var, new C0108p(og7Var), this.f2144d, this.f2145e, null);
            this.f2141a = 1;
            if (AbstractC0095c.m836k(og7Var, c00921, this) == coroutineSingletons) {
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
