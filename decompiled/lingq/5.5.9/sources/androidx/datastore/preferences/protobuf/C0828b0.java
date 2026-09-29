package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0828b0 {

    /* JADX INFO: renamed from: b */
    public static final a f5819b = new a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC0846h0 f5820a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$a */
    public static class a implements InterfaceC0846h0 {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
        /* JADX INFO: renamed from: a */
        public final InterfaceC0843g0 mo3171a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
        /* JADX INFO: renamed from: b */
        public final boolean mo3172b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$b */
    public static class b implements InterfaceC0846h0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0846h0[] f5821a;

        public b(InterfaceC0846h0... interfaceC0846h0Arr) {
            this.f5821a = interfaceC0846h0Arr;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
        /* JADX INFO: renamed from: a */
        public final InterfaceC0843g0 mo3171a(Class<?> cls) {
            for (InterfaceC0846h0 interfaceC0846h0 : this.f5821a) {
                if (interfaceC0846h0.mo3172b(cls)) {
                    return interfaceC0846h0.mo3171a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
        /* JADX INFO: renamed from: b */
        public final boolean mo3172b(Class<?> cls) {
            for (InterfaceC0846h0 interfaceC0846h0 : this.f5821a) {
                if (interfaceC0846h0.mo3172b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0828b0() {
        InterfaceC0846h0 interfaceC0846h0;
        InterfaceC0846h0[] interfaceC0846h0Arr = new InterfaceC0846h0[2];
        interfaceC0846h0Arr[0] = C0867s.f5926a;
        try {
            interfaceC0846h0 = (InterfaceC0846h0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC0846h0 = f5819b;
        }
        interfaceC0846h0Arr[1] = interfaceC0846h0;
        b bVar = new b(interfaceC0846h0Arr);
        Charset charset = C0871u.f5935a;
        this.f5820a = bVar;
    }
}
