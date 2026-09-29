package om;

import cm.InterfaceC2041a;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;

/* JADX INFO: renamed from: om.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8089f implements InterfaceC2041a<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6829c f43906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC6795c f43907b;

    public C8089f(JvmBuiltIns jvmBuiltIns, C6829c c6829c) {
        this.f43907b = jvmBuiltIns;
        this.f43906a = c6829c;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Void mo807E() {
        AbstractC6795c abstractC6795c = this.f43907b;
        C6829c c6829c = abstractC6795c.f38323a;
        C6829c c6829c2 = this.f43906a;
        if (c6829c == null) {
            abstractC6795c.f38323a = c6829c2;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + abstractC6795c.f38323a + " (attempting to reset to " + c6829c2 + ")");
    }
}
