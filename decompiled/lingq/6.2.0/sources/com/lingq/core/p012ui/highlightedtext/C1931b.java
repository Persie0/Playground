package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.dr3;
import p000.fb2;
import p000.jt3;
import p000.og7;
import p000.t66;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1931b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jt3 f24133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dr3 f24134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fb2 f24135c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f24136d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f24137e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f24138f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f24139g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f24140h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t66 f24141i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ t66 f24142j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t66 f24143k;

    public C1931b(jt3 jt3Var, dr3 dr3Var, fb2 fb2Var, vi3 vi3Var, vi3 vi3Var2, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5, t66 t66Var6) {
        this.f24133a = jt3Var;
        this.f24134b = dr3Var;
        this.f24135c = fb2Var;
        this.f24136d = vi3Var;
        this.f24137e = vi3Var2;
        this.f24138f = t66Var;
        this.f24139g = t66Var2;
        this.f24140h = t66Var3;
        this.f24141i = t66Var4;
        this.f24142j = t66Var5;
        this.f24143k = t66Var6;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        jt3 jt3Var = this.f24133a;
        if (jt3Var.f46113k) {
            Object objM836k = AbstractC0095c.m836k(og7Var, new HighlightedTextKt$HighlightedText$gestureModifier$2$1$1(jt3Var, this.f24134b, this.f24135c, this.f24136d, this.f24137e, this.f24138f, this.f24139g, this.f24140h, this.f24141i, this.f24142j, this.f24143k, null), continuation);
            if (objM836k == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM836k;
            }
        }
        return xfa.f68157a;
    }
}
