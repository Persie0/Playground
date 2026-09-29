package androidx.compose.material3.internal;

import androidx.compose.material3.C0252k0;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0242d implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0252k0 f3500b;

    public /* synthetic */ C0242d(C0252k0 c0252k0, int i) {
        this.f3499a = i;
        this.f3500b = c0252k0;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        int i = this.f3499a;
        xfa xfaVar = xfa.f68157a;
        C0252k0 c0252k0 = this.f3500b;
        switch (i) {
            case 0:
                Object objM23649s = vz1.m23649s(new BasicTooltipKt$handleGestures$1$1(og7Var, c0252k0, null), continuation);
                return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfaVar;
            default:
                Object objM23649s2 = vz1.m23649s(new BasicTooltipKt$handleGestures$2$1(og7Var, c0252k0, null), continuation);
                return objM23649s2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s2 : xfaVar;
        }
    }
}
