package com.lingq.core.token;

import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.bg9;
import p000.dr3;
import p000.fb2;
import p000.og7;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.token.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1898a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f23710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f23711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fb2 f23712c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dr3 f23713d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f23714e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f23715f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0059a f23716g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23717h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f23718i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f23719j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f23720k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ float f23721l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ float f23722m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ bg9 f23723n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ bg9 f23724o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ t66 f23725p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ t66 f23726q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ t66 f23727r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ vi3 f23728s;

    public C1898a(t66 t66Var, un1 un1Var, fb2 fb2Var, dr3 dr3Var, t66 t66Var2, t66 t66Var3, C0059a c0059a, int i, float f, float f2, float f3, float f4, float f5, bg9 bg9Var, bg9 bg9Var2, t66 t66Var4, t66 t66Var5, t66 t66Var6, vi3 vi3Var) {
        this.f23710a = t66Var;
        this.f23711b = un1Var;
        this.f23712c = fb2Var;
        this.f23713d = dr3Var;
        this.f23714e = t66Var2;
        this.f23715f = t66Var3;
        this.f23716g = c0059a;
        this.f23717h = i;
        this.f23718i = f;
        this.f23719j = f2;
        this.f23720k = f3;
        this.f23721l = f4;
        this.f23722m = f5;
        this.f23723n = bg9Var;
        this.f23724o = bg9Var2;
        this.f23725p = t66Var4;
        this.f23726q = t66Var5;
        this.f23727r = t66Var6;
        this.f23728s = vi3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        if (!AbstractC1899b.m8699h(this.f23710a)) {
            Object objM836k = AbstractC0095c.m836k(og7Var, new TokenPopupContainerKt$TokenPopupContainer$5$1$3$1$1(this.f23711b, this.f23712c, this.f23713d, this.f23714e, this.f23715f, this.f23716g, this.f23717h, this.f23718i, this.f23719j, this.f23720k, this.f23721l, this.f23722m, this.f23723n, this.f23724o, this.f23725p, this.f23726q, this.f23727r, this.f23710a, this.f23728s, null), continuation);
            if (objM836k == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM836k;
            }
        }
        return xfa.f68157a;
    }
}
