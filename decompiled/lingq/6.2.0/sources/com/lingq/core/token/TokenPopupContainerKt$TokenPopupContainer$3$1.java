package com.lingq.core.token;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.fa4;
import p000.fb2;
import p000.gq6;
import p000.n84;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupContainer$3$1", m4291f = "TokenPopupContainer.kt", m4292l = {267, 269}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupContainerKt$TokenPopupContainer$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ float f23329H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f23330I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ t66 f23331J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ t66 f23332K;

    /* JADX INFO: renamed from: a */
    public long f23333a;

    /* JADX INFO: renamed from: b */
    public boolean f23334b;

    /* JADX INFO: renamed from: c */
    public int f23335c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f5a f23336d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fb2 f23337e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f23338f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f23339g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0059a f23340h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t66 f23341i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ t66 f23342j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f23343k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ float f23344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupContainerKt$TokenPopupContainer$3$1(f5a f5aVar, fb2 fb2Var, float f, float f2, C0059a c0059a, t66 t66Var, t66 t66Var2, int i, float f3, float f4, int i2, t66 t66Var3, t66 t66Var4, Continuation continuation) {
        super(2, continuation);
        this.f23336d = f5aVar;
        this.f23337e = fb2Var;
        this.f23338f = f;
        this.f23339g = f2;
        this.f23340h = c0059a;
        this.f23341i = t66Var;
        this.f23342j = t66Var2;
        this.f23343k = i;
        this.f23344l = f3;
        this.f23329H = f4;
        this.f23330I = i2;
        this.f23331J = t66Var3;
        this.f23332K = t66Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupContainerKt$TokenPopupContainer$3$1(this.f23336d, this.f23337e, this.f23338f, this.f23339g, this.f23340h, this.f23341i, this.f23342j, this.f23343k, this.f23344l, this.f23329H, this.f23330I, this.f23331J, this.f23332K, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenPopupContainerKt$TokenPopupContainer$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
    
        if (r8.m747f(r3, r24) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        r1 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0168, code lost:
    
        if (r8.m747f(r5, r24) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fMo912g0;
        boolean z;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23335c;
        t66 t66Var = this.f23341i;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            f5a f5aVar = this.f23336d;
            TokenPopupData tokenPopupData = f5aVar.f38475g;
            TokenPopupData tokenPopupData2 = f5aVar.f38475g;
            if (tokenPopupData != null && tokenPopupData.f23441O) {
                t66Var.setValue(new gq6((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
            } else if (tokenPopupData != null && ((gq6) t66Var.getValue()) == null) {
                t66 t66Var2 = this.f23342j;
                if (!n84.m17279a(((n84) t66Var2.getValue()).f52482a, 0L)) {
                    float f = tokenPopupData2.f23449e;
                    float f2 = tokenPopupData2.f23448d;
                    float f3 = (int) (((n84) t66Var2.getValue()).f52482a & 4294967295L);
                    fb2 fb2Var = this.f23337e;
                    float fMo912g1 = fb2Var.mo912g0(16.0f);
                    float f4 = f + fMo912g1;
                    float f5 = f4 + f3;
                    float f6 = (f2 - f3) - fMo912g1;
                    float f7 = this.f23343k;
                    float f8 = this.f23344l;
                    float f9 = f7 - f8;
                    boolean z2 = f5 <= f9;
                    float f10 = this.f23329H;
                    boolean z3 = f6 >= f10;
                    if (!z2 && (z3 || f9 - f4 <= (f2 - fMo912g1) - f10)) {
                        f4 = f6;
                    }
                    float f11 = (f7 - f3) - f8;
                    if (f4 > f11) {
                        f4 = f11;
                    }
                    if (f4 >= f10) {
                        f10 = f4;
                    }
                    float f12 = tokenPopupData2.f23438L;
                    float f13 = tokenPopupData2.f23437K;
                    float f14 = (int) (((n84) t66Var2.getValue()).f52482a >> 32);
                    float fMo912g2 = fb2Var.mo912g0(16.0f);
                    float fMo912g3 = fb2Var.mo912g0(16.0f);
                    int i2 = this.f23330I;
                    if (f12 <= 0.0f || f12 >= (i2 - f14) - fMo912g3) {
                        fMo912g0 = f13 > f14 + fMo912g2 ? (f13 - f14) - fMo912g2 : ((i2 - f14) - fMo912g3) - fb2Var.mo912g0(20.0f);
                    } else {
                        fMo912g0 = f12 + fMo912g3;
                    }
                    float f15 = (i2 - f14) - fMo912g3;
                    if (fMo912g0 > f15) {
                        fMo912g0 = f15;
                    }
                    if (fMo912g0 >= fMo912g2) {
                        fMo912g2 = fMo912g0;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo912g2)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                    boolean zM11650l = fa4.m11650l(tokenPopupData2.f23451g, TokenViewState.Expanded.f23709a);
                    C0059a c0059a = this.f23340h;
                    if (zM11650l) {
                        gq6 gq6Var = new gq6((((long) Float.floatToRawIntBits(this.f23338f)) << 32) | (((long) Float.floatToRawIntBits(this.f23339g)) & 4294967295L));
                        this.f23333a = jFloatToRawIntBits;
                        this.f23334b = zM11650l;
                        this.f23335c = 1;
                    } else {
                        gq6 gq6Var2 = new gq6(jFloatToRawIntBits);
                        this.f23333a = jFloatToRawIntBits;
                        this.f23334b = zM11650l;
                        this.f23335c = 2;
                    }
                }
            }
            return xfa.f68157a;
        }
        if (i != 1 && i != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = this.f23334b;
        j = this.f23333a;
        AbstractC3193b.m15359b(obj);
        AbstractC1899b.m8702k(this.f23331J, z);
        t66Var.setValue(new gq6(j));
        this.f23332K.setValue(PopupInteractionState.Idle);
        return xfa.f68157a;
    }
}
