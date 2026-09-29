package com.lingq.feature.reader.old;

import android.graphics.Rect;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ay7;
import p000.c32;
import p000.du0;
import p000.fy7;
import p000.gm5;
import p000.u91;
import p000.un1;
import p000.vx7;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$9", m4291f = "ReaderPageFragment.kt", m4292l = {521}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$9 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28583b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$9$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$9$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23561 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23561(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28585b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23561 c23561 = new C23561(this.f28585b, continuation);
            c23561.f28584a = obj;
            return c23561;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23561 c23561 = (C23561) create((fy7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23561.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            xz7 xz7Var;
            xz7 xz7Var2;
            fy7 fy7Var = (fy7) this.f28584a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            TokenType tokenType = fy7Var.f39929b;
            List list = fy7Var.f39930c;
            xz7 xz7Var3 = fy7Var.f39928a;
            int i = ay7.f7671a[tokenType.ordinal()];
            ReaderPageFragment readerPageFragment = this.f28585b;
            if (i == 1) {
                vx7 vx7Var = ReaderPageFragment.Companion;
                C2412n c2412nM9298W0 = readerPageFragment.m9298W0();
                int iM9323d3 = readerPageFragment.m9298W0().m9323d3();
                List listM23604J = list;
                if (listM23604J.isEmpty()) {
                    listM23604J = vz1.m23604J(xz7Var3);
                }
                TokenFragmentData tokenFragmentDataM9324e3 = c2412nM9298W0.m9324e3(iM9323d3, listM23604J);
                C3244l c3244l = readerPageFragment.m9298W0().f29382l1;
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                Rect rectM9295T0 = readerPageFragment.m9295T0(xz7Var3, false);
                C2412n c2412nM9298W1 = readerPageFragment.m9298W0();
                String str = xz7Var3.f69008e;
                int i2 = xz7Var3.f69011h;
                int i3 = xz7Var3.f69010g;
                String strM23609O = vz1.m23609O(str, readerPageFragment.m9299X0().f29223b.mo4589b2());
                TokenType tokenType2 = TokenType.CardType;
                int i4 = rectM9295T0.top;
                int i5 = rectM9295T0.bottom;
                int i6 = rectM9295T0.left;
                int i7 = rectM9295T0.right;
                int i8 = xz7Var3.f69009f;
                TokenTransliteration tokenTransliteration = xz7Var3.f69013j;
                if (xz7Var3.m24798b() && (xz7Var2 = (xz7) u91.m22591I0(list)) != null) {
                    i3 = xz7Var2.f69010g;
                }
                int i9 = i3;
                if (xz7Var3.m24798b() && (xz7Var = (xz7) u91.m22591I0(list)) != null) {
                    i2 = xz7Var.f69011h;
                }
                c2412nM9298W1.f29344c.mo8738E1(new TokenPopupData(str, strM23609O, tokenType2, i4, i5, tokenFragmentDataM9324e3, null, null, null, i8, tokenTransliteration, false, i9, i2, xz7Var3.f69017n, i6, i7, 0, 0, false, null, null, false, 8260032, null));
            } else {
                if (i != 2 && i != 3) {
                    gm5.m12750e();
                    return null;
                }
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                if (readerPageFragment.m9298W0().f29340b.mo4595s1()) {
                    C2412n c2412nM9298W2 = readerPageFragment.m9298W0();
                    int iM9323d4 = readerPageFragment.m9298W0().m9323d3();
                    List listM23604J2 = list;
                    if (listM23604J2.isEmpty()) {
                        listM23604J2 = vz1.m23604J(xz7Var3);
                    }
                    TokenFragmentData tokenFragmentDataM9324e4 = c2412nM9298W2.m9324e3(iM9323d4, listM23604J2);
                    TokenType tokenType3 = fy7Var.f39929b;
                    C3244l c3244l2 = readerPageFragment.m9298W0().f29382l1;
                    Boolean bool2 = Boolean.TRUE;
                    c3244l2.getClass();
                    c3244l2.m15572j(null, bool2);
                    String str2 = xz7Var3.f69008e;
                    Rect rectM9295T1 = readerPageFragment.m9295T0(xz7Var3, false);
                    readerPageFragment.m9298W0().f29344c.mo8738E1(new TokenPopupData(str2, vz1.m23609O(str2, readerPageFragment.m9299X0().f29223b.mo4589b2()), tokenType3, rectM9295T1.top, rectM9295T1.bottom, tokenFragmentDataM9324e4, null, null, null, xz7Var3.f69009f, xz7Var3.f69013j, false, xz7Var3.f69010g, xz7Var3.f69011h, xz7Var3.f69017n, rectM9295T1.left, rectM9295T1.right, 0, 0, false, null, null, false, 8260032, null));
                } else {
                    readerPageFragment.m9296U0();
                    readerPageFragment.m9299X0().f29212Q.m15571i(null);
                    readerPageFragment.m9298W0().mo3737M1(UpgradeReason.LIMIT_WORDS);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$9(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28583b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$9(this.f28583b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$9) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28582a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28583b;
            du0 du0Var = readerPageFragment.m9299X0().f29222a0;
            C23561 c23561 = new C23561(readerPageFragment, null);
            this.f28582a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23561, this) == coroutineSingletons) {
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
