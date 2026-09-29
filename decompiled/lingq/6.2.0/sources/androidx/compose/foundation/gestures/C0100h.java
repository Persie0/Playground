package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import p000.f32;
import p000.f63;
import p000.wfb;
import p000.wn8;
import p000.x63;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0100h implements x63 {

    /* JADX INFO: renamed from: a */
    public f32 f2258a;

    /* JADX INFO: renamed from: b */
    public final f63 f2259b;

    public C0100h(f32 f32Var) {
        f63 f63Var = AbstractC0110r.f2312c;
        this.f2258a = f32Var;
        this.f2259b = f63Var;
    }

    @Override // p000.x63
    /* JADX INFO: renamed from: a */
    public final Object mo862a(wn8 wn8Var, float f, Continuation continuation) {
        return wfb.m23905G(new DefaultFlingBehavior$performFling$2(f, this, wn8Var, null), this.f2259b, continuation);
    }
}
