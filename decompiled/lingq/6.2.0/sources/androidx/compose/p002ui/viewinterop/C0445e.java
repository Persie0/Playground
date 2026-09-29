package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.relocation.AbstractC0415a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d16;
import p000.e28;
import p000.ui3;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0445e extends d16 {

    /* JADX INFO: renamed from: J */
    public vi3 f5204J;

    /* JADX INFO: renamed from: K */
    public final vi3 f5205K = new vi3() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1 */
        @c32(m4290c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", m4291f = "AndroidViewHolder.android.kt", m4292l = {764}, m4293m = "invokeSuspend", m4294v = 1)
        final class C04401 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f5157a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0445e f5158b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ e28 f5159c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04401(C0445e c0445e, e28 e28Var, Continuation continuation) {
                super(2, continuation);
                this.f5158b = c0445e;
                this.f5159c = e28Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C04401(this.f5158b, this.f5159c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((C04401) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f5157a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    final e28 e28Var = this.f5159c;
                    ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            return e28Var;
                        }
                    };
                    this.f5157a = 1;
                    if (AbstractC0415a.m1826a(this.f5158b, ui3Var, this) == coroutineSingletons) {
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

        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            e28 e28Var = (e28) obj;
            C0445e c0445e = this.f5156b;
            if (c0445e.f34836I) {
                wfb.m23926u(c0445e.m9971N0(), null, null, new C04401(c0445e, e28Var, null), 3);
            }
            return xfa.f68157a;
        }
    };

    public C0445e(vi3 vi3Var) {
        this.f5204J = vi3Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        ((AndroidViewHolder$layoutNode$1$coreModifier$4) this.f5204J).invoke(this.f5205K);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        ((AndroidViewHolder$layoutNode$1$coreModifier$4) this.f5204J).invoke(null);
    }
}
