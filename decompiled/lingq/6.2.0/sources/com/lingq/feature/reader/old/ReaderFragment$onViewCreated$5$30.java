package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.feature.reader.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.ca6;
import p000.du0;
import p000.fa4;
import p000.gm5;
import p000.ix7;
import p000.jfa;
import p000.jx7;
import p000.ka6;
import p000.kx7;
import p000.lx7;
import p000.mbd;
import p000.mx7;
import p000.r43;
import p000.r86;
import p000.un1;
import p000.uw7;
import p000.vz1;
import p000.ww7;
import p000.xfa;
import p000.xw7;
import p000.yw7;
import p000.zi3;
import p000.zw7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$30", m4291f = "ReaderFragment.kt", m4292l = {1276}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$30 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28339b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$30$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$30$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22991 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28340a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22991(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28341b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22991 c22991 = new C22991(this.f28341b, continuation);
            c22991.f28340a = obj;
            return c22991;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22991 c22991 = (C22991) create((mx7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22991.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            mx7 mx7Var = (mx7) this.f28340a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zM11650l = fa4.m11650l(mx7Var, ix7.f44737a);
            ReaderFragment readerFragment = this.f28341b;
            if (zM11650l) {
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                readerFragment.m9290W0().mo50y(LqAnalyticsValues$LessonExitPath.LessonComplete);
                vz1.m23640l0(readerFragment);
                yw7 yw7Var = zw7.Companion;
                int iM9332l3 = readerFragment.m9290W0().m9332l3();
                yw7Var.getClass();
                ww7 ww7Var = new ww7(iM9332l3, true);
                r86 r86VarM13127f = b34.m3244j(readerFragment).f63760b.m13127f();
                if (r86VarM13127f == null || r86VarM13127f.f58881b.f57368b != R$id.fragment_reader) {
                    r43 r43VarM20289a = r43.m20289a();
                    r86 r86VarM13127f2 = b34.m3244j(readerFragment).f63760b.m13127f();
                    r43VarM20289a.m20290b(new Exception(AbstractC3393o1.m17734i("Current destination not LessonFragment, instead it is ", r86VarM13127f2 != null ? r86VarM13127f2.mo20443i() : null)));
                } else {
                    jfa.m14428k(b34.m3244j(readerFragment), ww7Var, null);
                }
            } else if (fa4.m11650l(mx7Var, ix7.f44738b)) {
                yw7 yw7Var2 = zw7.Companion;
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                int iM9332l4 = readerFragment.m9290W0().m9332l3();
                yw7Var2.getClass();
                jfa.m14428k(b34.m3244j(readerFragment), new uw7(iM9332l4), null);
            } else if (mx7Var instanceof jx7) {
                mbd.m16755c(readerFragment.m2089Q(), ((jx7) mx7Var).f46360a, null, 30);
            } else if (mx7Var instanceof lx7) {
                lx7 lx7Var = (lx7) mx7Var;
                readerFragment.m9289V0().m23737z(new ka6(false, lx7Var.f50252b, lx7Var.f50253c, lx7Var.f50251a, lx7Var.f50254d, null, null, null, 448));
            } else if (fa4.m11650l(mx7Var, ix7.f44741e)) {
                vz1.m23641m0(readerFragment);
                yw7 yw7Var3 = zw7.Companion;
                bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                int iM9332l5 = readerFragment.m9290W0().m9332l3();
                yw7Var3.getClass();
                jfa.m14428k(b34.m3244j(readerFragment), new xw7(iM9332l5), null);
            } else if (fa4.m11650l(mx7Var, ix7.f44740d)) {
                vz1.m23640l0(readerFragment);
                yw7 yw7Var4 = zw7.Companion;
                bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                int iM9332l6 = readerFragment.m9290W0().m9332l3();
                yw7Var4.getClass();
                ww7 ww7Var2 = new ww7(iM9332l6, false);
                r86 r86VarM13127f3 = b34.m3244j(readerFragment).f63760b.m13127f();
                if (r86VarM13127f3 == null || r86VarM13127f3.f58881b.f57368b != R$id.fragment_reader) {
                    r43 r43VarM20289a2 = r43.m20289a();
                    r86 r86VarM13127f4 = b34.m3244j(readerFragment).f63760b.m13127f();
                    r43VarM20289a2.m20290b(new Exception("Current destination not LessonFragment, instead it is " + (r86VarM13127f4 != null ? new Integer(r86VarM13127f4.f58881b.f57368b) : null)));
                } else {
                    jfa.m14428k(b34.m3244j(readerFragment), ww7Var2, null);
                }
            } else if (!fa4.m11650l(mx7Var, ix7.f44739c)) {
                if (!(mx7Var instanceof kx7)) {
                    gm5.m12750e();
                    return null;
                }
                vz1.m23641m0(readerFragment);
                kx7 kx7Var = (kx7) mx7Var;
                readerFragment.m9289V0().m23737z(new ca6(kx7Var.f48545a, kx7Var.f48546b, kx7Var.f48547c));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$30(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28339b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$30(this.f28339b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$30) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28338a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28339b;
            du0 du0Var = readerFragment.m9290W0().f29408t1;
            C22991 c22991 = new C22991(readerFragment, null);
            this.f28338a = 1;
            if (AbstractC3224d.m15529h(du0Var, c22991, this) == coroutineSingletons) {
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
