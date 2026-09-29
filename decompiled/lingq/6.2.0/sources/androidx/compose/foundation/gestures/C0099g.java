package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.b62;
import p000.gb0;
import p000.hl2;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0099g implements hl2 {

    /* JADX INFO: renamed from: a */
    public final gb0 f2255a;

    /* JADX INFO: renamed from: b */
    public final b62 f2256b = new b62(this);

    /* JADX INFO: renamed from: c */
    public final C0145m f2257c = new C0145m();

    public C0099g(gb0 gb0Var) {
        this.f2255a = gb0Var;
    }

    @Override // p000.hl2
    /* JADX INFO: renamed from: a */
    public final Object mo861a(MutatePriority mutatePriority, zi3 zi3Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new DefaultDraggableState$drag$2(this, mutatePriority, zi3Var, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
