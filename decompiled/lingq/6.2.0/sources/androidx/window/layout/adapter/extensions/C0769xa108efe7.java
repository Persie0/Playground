package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0769xa108efe7 extends FunctionReferenceImpl implements vi3 {
    public C0769xa108efe7(MulticastConsumer multicastConsumer) {
        super(1, multicastConsumer, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.f47704b).accept(windowLayoutInfo);
        return xfa.f68157a;
    }
}
