package androidx.compose.foundation.pager;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.pager.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0147a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0150d f2660a;

    public C0147a(AbstractC0150d abstractC0150d) {
        this.f2660a = abstractC0150d;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new LazyLayoutPagerKt$dragDirectionDetector$1$1(og7Var, this.f2660a, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
