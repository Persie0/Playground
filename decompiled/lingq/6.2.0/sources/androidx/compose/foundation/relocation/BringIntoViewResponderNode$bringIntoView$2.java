package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C0098f;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.relocation.AbstractC0415a;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3704w;
import p000.c32;
import p000.e28;
import p000.ea4;
import p000.i84;
import p000.ii0;
import p000.l70;
import p000.r60;
import p000.sm0;
import p000.ui3;
import p000.un1;
import p000.vk1;
import p000.wfb;
import p000.x66;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", m4291f = "BringIntoViewResponder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0155b f2707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0362l f2708c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f2709d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r60 f2710e;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1 */
    @c32(m4290c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", m4291f = "BringIntoViewResponder.kt", m4292l = {183}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01521 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2711a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0155b f2712b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0362l f2713c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ui3 f2714d;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ui3 {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C0155b f2715i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ AbstractC0362l f2716j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ ui3 f2717k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0155b c0155b, AbstractC0362l abstractC0362l, ui3 ui3Var) {
                super(0, ea4.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f2715i = c0155b;
                this.f2716j = abstractC0362l;
                this.f2717k = ui3Var;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return C0155b.m1047Z0(this.f2715i, this.f2716j, this.f2717k);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01521(C0155b c0155b, AbstractC0362l abstractC0362l, ui3 ui3Var, Continuation continuation) {
            super(2, continuation);
            this.f2712b = c0155b;
            this.f2713c = abstractC0362l;
            this.f2714d = ui3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01521(this.f2712b, this.f2713c, this.f2714d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01521) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM21466r;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2711a;
            xfa xfaVar = xfa.f68157a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C0155b c0155b = this.f2712b;
            C0098f c0098f = c0155b.f2722J;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c0155b, this.f2713c, this.f2714d);
            this.f2711a = 1;
            c0098f.getClass();
            e28 e28Var = (e28) anonymousClass1.mo0a();
            if (e28Var == null || C0098f.m856b1(c0098f, e28Var, 0L, 0L, 3)) {
                objM21466r = xfaVar;
            } else {
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(this));
                sm0Var.m21468u();
                vk1 vk1Var = new vk1(anonymousClass1, sm0Var);
                ii0 ii0Var = c0098f.f2251O;
                x66 x66Var = ii0Var.f44131a;
                e28 e28Var2 = (e28) anonymousClass1.mo0a();
                if (e28Var2 == null) {
                    sm0Var.resumeWith(xfaVar);
                } else {
                    sm0Var.m21470w(new C3704w(7, ii0Var, vk1Var));
                    i84 i84VarM15922M = l70.m15922M(0, x66Var.f67832c);
                    int i2 = i84VarM15922M.f40379a;
                    int i3 = i84VarM15922M.f40380b;
                    if (i2 > i3) {
                        x66Var.m24304b(0, vk1Var);
                        break;
                    }
                    while (true) {
                        e28 e28Var3 = (e28) ((AnonymousClass1) ((vk1) x66Var.f67830a[i3]).f65528a).mo0a();
                        if (e28Var3 != null) {
                            e28 e28VarM10806g = e28Var2.m10806g(e28Var3);
                            if (!e28VarM10806g.equals(e28Var2)) {
                                if (!e28VarM10806g.equals(e28Var3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i4 = x66Var.f67832c - 1;
                                    if (i4 <= i3) {
                                        while (true) {
                                            ((vk1) x66Var.f67830a[i3]).f65529b.mo10141l(cancellationException);
                                            if (i4 == i3) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                }
                            } else {
                                x66Var.m24304b(i3 + 1, vk1Var);
                                break;
                            }
                        }
                        if (i3 == i2) {
                            x66Var.m24304b(0, vk1Var);
                            break;
                        }
                        i3--;
                    }
                    if (!c0098f.f2254R) {
                        c0098f.m859c1(0L);
                    }
                }
                objM21466r = sm0Var.m21466r();
                if (objM21466r != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM21466r = xfaVar;
                }
            }
            return objM21466r == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2 */
    @c32(m4290c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", m4291f = "BringIntoViewResponder.kt", m4292l = {191}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01532 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2718a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0155b f2719b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ r60 f2720c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01532(C0155b c0155b, r60 r60Var, Continuation continuation) {
            super(2, continuation);
            this.f2719b = c0155b;
            this.f2720c = r60Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01532(this.f2719b, this.f2720c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01532) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2718a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f2718a = 1;
                if (AbstractC0415a.m1826a(this.f2719b, this.f2720c, this) == coroutineSingletons) {
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
    public BringIntoViewResponderNode$bringIntoView$2(C0155b c0155b, AbstractC0362l abstractC0362l, ui3 ui3Var, r60 r60Var, Continuation continuation) {
        super(2, continuation);
        this.f2707b = c0155b;
        this.f2708c = abstractC0362l;
        this.f2709d = ui3Var;
        this.f2710e = r60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.f2707b, this.f2708c, this.f2709d, this.f2710e, continuation);
        bringIntoViewResponderNode$bringIntoView$2.f2706a = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f2706a;
        AbstractC0362l abstractC0362l = this.f2708c;
        ui3 ui3Var = this.f2709d;
        C0155b c0155b = this.f2707b;
        wfb.m23926u(un1Var, null, null, new C01521(c0155b, abstractC0362l, ui3Var, null), 3);
        return wfb.m23926u(un1Var, null, null, new C01532(c0155b, this.f2710e, null), 3);
    }
}
