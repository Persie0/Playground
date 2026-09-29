package com.lingq.core.token;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.cd4;
import p000.dr3;
import p000.dt6;
import p000.fb2;
import p000.gq6;
import p000.j4a;
import p000.k4a;
import p000.kg7;
import p000.l70;
import p000.n84;
import p000.s2a;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.x87;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1", m4291f = "TokenPopupContainer.kt", m4292l = {337, 351}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f23345H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ float f23346I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ float f23347J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ float f23348K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ float f23349L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ float f23350M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ bg9 f23351N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ bg9 f23352O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ t66 f23353P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ t66 f23354Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ t66 f23355R;

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ t66 f23356S;

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ vi3 f23357T;

    /* JADX INFO: renamed from: b */
    public kg7 f23358b;

    /* JADX INFO: renamed from: c */
    public cd4 f23359c;

    /* JADX INFO: renamed from: d */
    public int f23360d;

    /* JADX INFO: renamed from: e */
    public int f23361e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f23362f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ un1 f23363g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ fb2 f23364h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dr3 f23365i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ t66 f23366j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t66 f23367k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0059a f23368l;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$1 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$1", m4291f = "TokenPopupContainer.kt", m4292l = {341}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23369a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0332f f23370b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dr3 f23371c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t66 f23372d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t66 f23373e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18841(C0332f c0332f, dr3 dr3Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
            super(2, continuation);
            this.f23370b = c0332f;
            this.f23371c = dr3Var;
            this.f23372d = t66Var;
            this.f23373e = t66Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18841(this.f23370b, this.f23371c, this.f23372d, this.f23373e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18841) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23369a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                long jMo13456b = this.f23370b.m1475f().mo13456b();
                this.f23369a = 1;
                if (AbstractC3208a.m15437d(jMo13456b, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ((x87) this.f23371c).m24403a(16);
            Boolean bool = Boolean.TRUE;
            this.f23372d.setValue(bool);
            this.f23373e.setValue(bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$2 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$2", m4291f = "TokenPopupContainer.kt", m4292l = {388, 416, 442}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18852 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ t66 f23374H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ t66 f23375I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ vi3 f23376J;

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ t66 f23377K;

        /* JADX INFO: renamed from: a */
        public int f23378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0059a f23379b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23380c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f23381d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f23382e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f23383f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f23384g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ float f23385h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ bg9 f23386i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ bg9 f23387j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ t66 f23388k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ t66 f23389l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18852(C0059a c0059a, int i, float f, float f2, float f3, float f4, float f5, bg9 bg9Var, bg9 bg9Var2, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, vi3 vi3Var, t66 t66Var5, Continuation continuation) {
            super(2, continuation);
            this.f23379b = c0059a;
            this.f23380c = i;
            this.f23381d = f;
            this.f23382e = f2;
            this.f23383f = f3;
            this.f23384g = f4;
            this.f23385h = f5;
            this.f23386i = bg9Var;
            this.f23387j = bg9Var2;
            this.f23388k = t66Var;
            this.f23389l = t66Var2;
            this.f23374H = t66Var3;
            this.f23375I = t66Var4;
            this.f23376J = vi3Var;
            this.f23377K = t66Var5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18852(this.f23379b, this.f23380c, this.f23381d, this.f23382e, this.f23383f, this.f23384g, this.f23385h, this.f23386i, this.f23387j, this.f23388k, this.f23389l, this.f23374H, this.f23375I, this.f23376J, this.f23377K, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18852) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
        
            if (androidx.compose.animation.core.C0059a.m744c(r21.f23379b, r2, r21.f23386i, r7, r21, 4) == r6) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
        
            if (androidx.compose.animation.core.C0059a.m744c(r21.f23379b, r5, r3, r3, r21, 4) == r6) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01d5, code lost:
        
            if (androidx.compose.animation.core.C0059a.m744c(r21.f23379b, r0, r3, r3, r21, 4) == r6) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01d7, code lost:
        
            return r6;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            float fIntBitsToFloat;
            long jFloatToRawIntBits;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23378a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                PopupInteractionState popupInteractionState = PopupInteractionState.Idle;
                t66 t66Var = this.f23388k;
                t66Var.setValue(popupInteractionState);
                C0059a c0059a = this.f23379b;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((gq6) ((xc9) c0059a.f1542e).getValue()).f41189a >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (((gq6) ((xc9) c0059a.f1542e).getValue()).f41189a & 4294967295L));
                t66 t66Var2 = this.f23389l;
                gq6 gq6Var = (gq6) t66Var2.getValue();
                float fIntBitsToFloat4 = gq6Var != null ? Float.intBitsToFloat((int) (gq6Var.f41189a >> 32)) : 0.0f;
                gq6 gq6Var2 = (gq6) t66Var2.getValue();
                int i2 = this.f23380c;
                if (gq6Var2 != null) {
                    j = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (gq6Var2.f41189a & 4294967295L));
                } else {
                    j = 4294967295L;
                    fIntBitsToFloat = i2 * 0.7f;
                }
                float f = (int) (((n84) this.f23374H.getValue()).f52482a & j);
                float f2 = this.f23381d;
                boolean z = false;
                boolean z2 = fIntBitsToFloat2 > fIntBitsToFloat4 + f2;
                boolean z3 = fIntBitsToFloat2 < fIntBitsToFloat4 - f2;
                float f3 = this.f23382e + fIntBitsToFloat;
                t66 t66Var3 = this.f23375I;
                boolean z4 = fIntBitsToFloat3 > f3 && !AbstractC1899b.m8699h(t66Var3);
                boolean z5 = fIntBitsToFloat3 < (-f) * 0.3f;
                long j2 = j;
                float fM15944g = l70.m15944g(fIntBitsToFloat / i2, 0.2f, 1.0f);
                float f4 = this.f23383f;
                boolean z6 = !AbstractC1899b.m8699h(t66Var3) && fIntBitsToFloat3 < fIntBitsToFloat - (fM15944g * f4);
                boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
                float f5 = this.f23384g;
                if (zBooleanValue && fIntBitsToFloat3 > f4 + f5) {
                    z = true;
                }
                if (z2 || z3 || z4 || z5) {
                    t66Var.setValue(PopupInteractionState.AnimatingToDismiss);
                } else {
                    t66 t66Var4 = this.f23377K;
                    float f6 = this.f23385h;
                    if (z6) {
                        gq6 gq6Var3 = new gq6((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & j2));
                        j4a j4aVar = new j4a(this.f23385h, this.f23384g, this.f23376J, t66Var, this.f23375I, t66Var4, 0);
                        this.f23378a = 1;
                    } else {
                        bg9 bg9Var = this.f23387j;
                        if (z) {
                            t66Var.setValue(PopupInteractionState.AnimatingToCollapsed);
                            Boolean bool = Boolean.FALSE;
                            t66Var3.setValue(bool);
                            t66Var4.setValue(bool);
                            gq6 gq6Var4 = new gq6((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & j2));
                            k4a k4aVar = new k4a(f6, f5, t66Var);
                            this.f23378a = 2;
                        } else {
                            t66Var.setValue(((Boolean) t66Var3.getValue()).booleanValue() ? PopupInteractionState.AnimatingToExpanded : PopupInteractionState.AnimatingToCollapsed);
                            t66Var4.setValue(Boolean.FALSE);
                            if (((Boolean) t66Var3.getValue()).booleanValue()) {
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & j2);
                            } else {
                                gq6 gq6Var5 = (gq6) t66Var2.getValue();
                                jFloatToRawIntBits = gq6Var5 != null ? gq6Var5.f41189a : 0L;
                            }
                            gq6 gq6Var6 = new gq6(jFloatToRawIntBits);
                            dt6 dt6Var = new dt6(23, t66Var);
                            this.f23378a = 3;
                        }
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$3 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$3", m4291f = "TokenPopupContainer.kt", m4292l = {455}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18863 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23390a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0059a f23391b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23392c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f23393d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bg9 f23394e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vi3 f23395f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ t66 f23396g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ t66 f23397h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ t66 f23398i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18863(C0059a c0059a, float f, float f2, bg9 bg9Var, vi3 vi3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, Continuation continuation) {
            super(2, continuation);
            this.f23391b = c0059a;
            this.f23392c = f;
            this.f23393d = f2;
            this.f23394e = bg9Var;
            this.f23395f = vi3Var;
            this.f23396g = t66Var;
            this.f23397h = t66Var2;
            this.f23398i = t66Var3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18863(this.f23391b, this.f23392c, this.f23393d, this.f23394e, this.f23395f, this.f23396g, this.f23397h, this.f23398i, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18863) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23390a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                gq6 gq6Var = new gq6((((long) Float.floatToRawIntBits(this.f23392c)) << 32) | (((long) Float.floatToRawIntBits(this.f23393d)) & 4294967295L));
                j4a j4aVar = new j4a(this.f23392c, this.f23393d, this.f23395f, this.f23396g, this.f23397h, this.f23398i, 1);
                this.f23390a = 1;
                if (C0059a.m744c(this.f23391b, gq6Var, this.f23394e, j4aVar, this, 4) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$4 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$4", m4291f = "TokenPopupContainer.kt", m4292l = {485}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18874 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23399a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vi3 f23400b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0059a f23401c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f23402d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f23403e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bg9 f23404f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ t66 f23405g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ t66 f23406h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18874(vi3 vi3Var, C0059a c0059a, float f, float f2, bg9 bg9Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
            super(2, continuation);
            this.f23400b = vi3Var;
            this.f23401c = c0059a;
            this.f23402d = f;
            this.f23403e = f2;
            this.f23404f = bg9Var;
            this.f23405g = t66Var;
            this.f23406h = t66Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18874(this.f23400b, this.f23401c, this.f23402d, this.f23403e, this.f23404f, this.f23405g, this.f23406h, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18874) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C18874 c18874;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23399a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                AbstractC1899b.m8702k(this.f23405g, true);
                this.f23400b.invoke(s2a.f60219a);
                gq6 gq6Var = new gq6((((long) Float.floatToRawIntBits(this.f23402d)) << 32) | (((long) Float.floatToRawIntBits(this.f23403e)) & 4294967295L));
                this.f23399a = 1;
                c18874 = this;
                if (C0059a.m744c(this.f23401c, gq6Var, this.f23404f, null, c18874, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                c18874 = this;
            }
            c18874.f23406h.setValue(PopupInteractionState.Idle);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$5 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$5", m4291f = "TokenPopupContainer.kt", m4292l = {532}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18885 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public long f23407a;

        /* JADX INFO: renamed from: b */
        public int f23408b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0059a f23409c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f23410d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f23411e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f23412f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ dr3 f23413g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ t66 f23414h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ t66 f23415i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ t66 f23416j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ t66 f23417k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18885(C0059a c0059a, long j, float f, int i, dr3 dr3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, Continuation continuation) {
            super(2, continuation);
            this.f23409c = c0059a;
            this.f23410d = j;
            this.f23411e = f;
            this.f23412f = i;
            this.f23413g = dr3Var;
            this.f23414h = t66Var;
            this.f23415i = t66Var2;
            this.f23416j = t66Var3;
            this.f23417k = t66Var4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18885(this.f23409c, this.f23410d, this.f23411e, this.f23412f, this.f23413g, this.f23414h, this.f23415i, this.f23416j, this.f23417k, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18885) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23408b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = this.f23409c;
                long jM12825f = gq6.m12825f(((gq6) c0059a.m745d()).f41189a, this.f23410d);
                gq6 gq6Var = new gq6(jM12825f);
                this.f23407a = jM12825f;
                this.f23408b = 1;
                if (c0059a.m747f(gq6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j = jM12825f;
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.f23407a;
                AbstractC3193b.m15359b(obj);
            }
            gq6 gq6Var2 = (gq6) this.f23414h.getValue();
            float fIntBitsToFloat = gq6Var2 != null ? Float.intBitsToFloat((int) (gq6Var2.f41189a & 4294967295L)) : 0.0f;
            boolean z = !AbstractC1899b.m8699h(this.f23415i) && Float.intBitsToFloat((int) (j & 4294967295L)) < fIntBitsToFloat - ((l70.m15944g(fIntBitsToFloat / ((float) this.f23412f), 0.2f, 1.0f) * this.f23411e) * 0.2f);
            t66 t66Var = this.f23416j;
            if (z && !((Boolean) t66Var.getValue()).booleanValue() && !((Boolean) this.f23417k.getValue()).booleanValue()) {
                ((x87) this.f23413g).m24403a(16);
            }
            t66Var.setValue(Boolean.valueOf(z));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$7 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1$7", m4291f = "TokenPopupContainer.kt", m4292l = {557}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18897 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23418a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f23419b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23420c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0059a f23421d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bg9 f23422e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ t66 f23423f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ t66 f23424g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ t66 f23425h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ t66 f23426i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18897(float f, float f2, C0059a c0059a, bg9 bg9Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, Continuation continuation) {
            super(2, continuation);
            this.f23419b = f;
            this.f23420c = f2;
            this.f23421d = c0059a;
            this.f23422e = bg9Var;
            this.f23423f = t66Var;
            this.f23424g = t66Var2;
            this.f23425h = t66Var3;
            this.f23426i = t66Var4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18897(this.f23419b, this.f23420c, this.f23421d, this.f23422e, this.f23423f, this.f23424g, this.f23425h, this.f23426i, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18897) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jFloatToRawIntBits;
            C18897 c18897;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23418a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (AbstractC1899b.m8699h(this.f23423f)) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f23419b)) << 32) | (((long) Float.floatToRawIntBits(this.f23420c)) & 4294967295L);
                } else {
                    gq6 gq6Var = (gq6) this.f23424g.getValue();
                    jFloatToRawIntBits = gq6Var != null ? gq6Var.f41189a : 0L;
                }
                gq6 gq6Var2 = new gq6(jFloatToRawIntBits);
                this.f23418a = 1;
                c18897 = this;
                if (C0059a.m744c(this.f23421d, gq6Var2, this.f23422e, null, c18897, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                c18897 = this;
            }
            c18897.f23425h.setValue(PopupInteractionState.Idle);
            c18897.f23426i.setValue(Boolean.FALSE);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1(un1 un1Var, fb2 fb2Var, dr3 dr3Var, t66 t66Var, t66 t66Var2, C0059a c0059a, int i, float f, float f2, float f3, float f4, float f5, bg9 bg9Var, bg9 bg9Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5, t66 t66Var6, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f23363g = un1Var;
        this.f23364h = fb2Var;
        this.f23365i = dr3Var;
        this.f23366j = t66Var;
        this.f23367k = t66Var2;
        this.f23368l = c0059a;
        this.f23345H = i;
        this.f23346I = f;
        this.f23347J = f2;
        this.f23348K = f3;
        this.f23349L = f4;
        this.f23350M = f5;
        this.f23351N = bg9Var;
        this.f23352O = bg9Var2;
        this.f23353P = t66Var3;
        this.f23354Q = t66Var4;
        this.f23355R = t66Var5;
        this.f23356S = t66Var6;
        this.f23357T = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1 tokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1 = new TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1(this.f23363g, this.f23364h, this.f23365i, this.f23366j, this.f23367k, this.f23368l, this.f23345H, this.f23346I, this.f23347J, this.f23348K, this.f23349L, this.f23350M, this.f23351N, this.f23352O, this.f23353P, this.f23354Q, this.f23355R, this.f23356S, this.f23357T, continuation);
        tokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1.f23362f = obj;
        return tokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:195:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
