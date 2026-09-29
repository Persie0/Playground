package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.compose.p002ui.platform.C0395g;
import kotlin.AbstractC3193b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3575si;
import p000.b34;
import p000.b64;
import p000.c32;
import p000.jm9;
import p000.r66;
import p000.ry4;
import p000.tw4;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xn3;
import p000.zi3;
import p000.zw4;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", m4291f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4292l = {125}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2916a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f2918c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0187a f2919d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tw4 f2920e;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1 */
    @c32(m4290c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", m4291f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4292l = {149}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01821 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2921a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f2922b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0395g f2923c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vi3 f2924d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0187a f2925e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tw4 f2926f;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name */
        @c32(m4290c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", m4291f = "LegacyPlatformTextInputServiceAdapter.android.kt", m4292l = {140, 141}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f2927a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0187a f2928b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ b64 f2929c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0187a c0187a, b64 b64Var, Continuation continuation) {
                super(2, continuation);
                this.f2928b = c0187a;
                this.f2929c = b64Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f2928b, this.f2929c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            
                if (kotlinx.coroutines.flow.C3229i.m15548j((kotlinx.coroutines.flow.C3229i) r7, r1, r6) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f2927a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    ry4 ry4Var = new ry4(27);
                    this.f2927a = 1;
                    if (b34.m3250q(getContext()).mo1250e(new xn3(ry4Var, 1), this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                C3386nv.m17631r();
                return null;
                r66 r66VarM1087i = this.f2928b.m1087i();
                if (r66VarM1087i == null) {
                    return xfa.f68157a;
                }
                C3575si c3575si = new C3575si(this.f2929c, 0);
                this.f2927a = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01821(C0395g c0395g, vi3 vi3Var, C0187a c0187a, tw4 tw4Var, Continuation continuation) {
            super(2, continuation);
            this.f2923c = c0395g;
            this.f2924d = vi3Var;
            this.f2925e = c0187a;
            this.f2926f = tw4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C01821 c01821 = new C01821(this.f2923c, this.f2924d, this.f2925e, this.f2926f, continuation);
            c01821.f2922b = obj;
            return c01821;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01821) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2921a;
            C0187a c0187a = this.f2925e;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    un1 un1Var = (un1) this.f2922b;
                    vi3 vi3Var = AbstractC0190d.f2964a;
                    C0395g c0395g = this.f2923c;
                    View view = c0395g.f4766a;
                    ((C0186xe9f87565) vi3Var).getClass();
                    b64 b64Var = new b64(view);
                    zw4 zw4Var = new zw4(c0395g.f4766a, new C0183x8f2ae8f3(this.f2926f), b64Var);
                    if (jm9.f45838a) {
                        wfb.m23926u(un1Var, null, null, new AnonymousClass1(c0187a, b64Var, null), 3);
                    }
                    vi3 vi3Var2 = this.f2924d;
                    if (vi3Var2 != null) {
                        vi3Var2.invoke(zw4Var);
                    }
                    c0187a.f2942c = zw4Var;
                    this.f2921a = 1;
                    if (c0395g.m1797a(zw4Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                c0187a.f2942c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(vi3 vi3Var, C0187a c0187a, tw4 tw4Var, Continuation continuation) {
        super(2, continuation);
        this.f2918c = vi3Var;
        this.f2919d = c0187a;
        this.f2920e = tw4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.f2918c, this.f2919d, this.f2920e, continuation);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.f2917b = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create((C0395g) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2916a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C01821 c01821 = new C01821((C0395g) this.f2917b, this.f2918c, this.f2919d, this.f2920e, null);
            this.f2916a = 1;
            if (vz1.m23649s(c01821, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
