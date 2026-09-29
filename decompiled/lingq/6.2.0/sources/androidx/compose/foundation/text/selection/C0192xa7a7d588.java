package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.cn2;
import p000.iy5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {437, 313, 324}, m4293m = "invokeSuspend", m4294v = 1)
final class C0192xa7a7d588 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c76 f2978a;

    /* JADX INFO: renamed from: b */
    public C0200a f2979b;

    /* JADX INFO: renamed from: c */
    public int f2980c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0200a f2981d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f2982e;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    @c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {325}, m4293m = "invokeSuspend", m4294v = 1)
    final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2983a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextClassifier f2984b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zi3 f2985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextClassifier textClassifier, zi3 zi3Var, Continuation continuation) {
            super(2, continuation);
            this.f2984b = textClassifier;
            this.f2985c = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f2984b, this.f2985c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2983a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            TextClassifier textClassifier = this.f2984b;
            if (textClassifier == null) {
                return null;
            }
            this.f2983a = 1;
            Object objInvoke = this.f2985c.invoke(textClassifier, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192xa7a7d588(C0200a c0200a, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2981d = c0200a;
        this.f2982e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0192xa7a7d588(this.f2981d, this.f2982e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0192xa7a7d588) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0200a c0200a;
        c76 c76Var;
        c76 c76Var2;
        TextClassifier textClassifier;
        Object objM15447n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2980c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c0200a = this.f2981d;
                c76Var = c0200a.f3065e;
                this.f2978a = c76Var;
                this.f2979b = c0200a;
                this.f2980c = 1;
                if (c76Var.mo4388c(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC3193b.m15359b(obj);
                        return obj;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76Var2 = this.f2978a;
                try {
                    AbstractC3193b.m15359b(obj);
                    textClassifier = (TextClassifier) obj;
                    c76Var = c76Var2;
                    c76Var.mo4387b(null);
                    iy5 iy5Var = cn2.f10315b;
                    long jM17119f0 = AbstractC3352my.m17119f0(200L, DurationUnit.MILLISECONDS);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(textClassifier, this.f2982e, null);
                    this.f2978a = null;
                    this.f2979b = null;
                    this.f2980c = 3;
                    objM15447n = AbstractC3208a.m15447n(AbstractC3208a.m15446m(jM17119f0), anonymousClass1, this);
                    if (objM15447n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objM15447n;
                } catch (Throwable th) {
                    th = th;
                    c76Var2.mo4387b(null);
                    throw th;
                }
            }
            c0200a = this.f2979b;
            c76 c76Var3 = this.f2978a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var3;
            textClassifier = c0200a.f3066f;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                iy5 iy5Var2 = cn2.f10315b;
                long jM17119f1 = AbstractC3352my.m17119f0(300L, DurationUnit.MILLISECONDS);
                C0193x2b917ae1 c0193x2b917ae1 = new C0193x2b917ae1(c0200a, null);
                this.f2978a = c76Var;
                this.f2979b = null;
                this.f2980c = 2;
                Object objM15447n2 = AbstractC3208a.m15447n(AbstractC3208a.m15446m(jM17119f1), c0193x2b917ae1, this);
                if (objM15447n2 != coroutineSingletons) {
                    c76Var2 = c76Var;
                    obj = objM15447n2;
                    textClassifier = (TextClassifier) obj;
                    c76Var = c76Var2;
                    c76Var.mo4387b(null);
                    iy5 iy5Var3 = cn2.f10315b;
                    long jM17119f2 = AbstractC3352my.m17119f0(200L, DurationUnit.MILLISECONDS);
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1(textClassifier, this.f2982e, null);
                    this.f2978a = null;
                    this.f2979b = null;
                    this.f2980c = 3;
                    objM15447n = AbstractC3208a.m15447n(AbstractC3208a.m15446m(jM17119f2), anonymousClass2, this);
                    if (objM15447n == coroutineSingletons) {
                        return objM15447n;
                    }
                }
            } else {
                c76Var.mo4387b(null);
                iy5 iy5Var4 = cn2.f10315b;
                long jM17119f3 = AbstractC3352my.m17119f0(200L, DurationUnit.MILLISECONDS);
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(textClassifier, this.f2982e, null);
                this.f2978a = null;
                this.f2979b = null;
                this.f2980c = 3;
                objM15447n = AbstractC3208a.m15447n(AbstractC3208a.m15446m(jM17119f3), anonymousClass3, this);
                if (objM15447n == coroutineSingletons) {
                    return objM15447n;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            c76Var2 = c76Var;
            c76Var2.mo4387b(null);
            throw th;
        }
    }
}
