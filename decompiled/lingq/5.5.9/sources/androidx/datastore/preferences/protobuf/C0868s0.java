package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0868s0 {

    /* JADX INFO: renamed from: c */
    public static final C0868s0 f5927c = new C0868s0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f5929b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C0828b0 f5928a = new C0828b0();

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final <T> InterfaceC0876w0<T> m3436a(Class<T> cls) {
        C0856m0 c0856m0;
        Class<?> cls2;
        Charset charset = C0871u.f5935a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5929b;
        InterfaceC0876w0<T> interfaceC0876w0M3371w = (InterfaceC0876w0) concurrentHashMap.get(cls);
        if (interfaceC0876w0M3371w == null) {
            C0828b0 c0828b0 = this.f5928a;
            c0828b0.getClass();
            Class<?> cls3 = C0878x0.f5946a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = C0878x0.f5946a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            InterfaceC0843g0 interfaceC0843g0Mo3171a = c0828b0.f5820a.mo3171a(cls);
            if (interfaceC0843g0Mo3171a.mo3168a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    c0856m0 = new C0856m0(C0878x0.f5949d, C0861p.f5914a, interfaceC0843g0Mo3171a.mo3169b());
                } else {
                    AbstractC0829b1<?, ?> abstractC0829b1 = C0878x0.f5947b;
                    AbstractC0857n<?> abstractC0857n = C0861p.f5915b;
                    if (abstractC0857n == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c0856m0 = new C0856m0(abstractC0829b1, abstractC0857n, interfaceC0843g0Mo3171a.mo3169b());
                }
                interfaceC0876w0M3371w = c0856m0;
            } else {
                boolean z10 = true;
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    if (interfaceC0843g0Mo3171a.mo3170c() != ProtoSyntax.PROTO2) {
                        z10 = false;
                    }
                    interfaceC0876w0M3371w = z10 ? C0854l0.m3371w(interfaceC0843g0Mo3171a, C0862p0.f5917b, AbstractC0881z.f5951b, C0878x0.f5949d, C0861p.f5914a, C0840f0.f5844b) : C0854l0.m3371w(interfaceC0843g0Mo3171a, C0862p0.f5917b, AbstractC0881z.f5951b, C0878x0.f5949d, null, C0840f0.f5844b);
                } else {
                    if (interfaceC0843g0Mo3171a.mo3170c() == ProtoSyntax.PROTO2) {
                        InterfaceC0858n0 interfaceC0858n0 = C0862p0.f5916a;
                        AbstractC0881z.a aVar = AbstractC0881z.f5950a;
                        AbstractC0829b1<?, ?> abstractC0829b2 = C0878x0.f5947b;
                        AbstractC0857n<?> abstractC0857n2 = C0861p.f5915b;
                        if (abstractC0857n2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        interfaceC0876w0M3371w = C0854l0.m3371w(interfaceC0843g0Mo3171a, interfaceC0858n0, aVar, abstractC0829b2, abstractC0857n2, C0840f0.f5843a);
                    } else {
                        interfaceC0876w0M3371w = C0854l0.m3371w(interfaceC0843g0Mo3171a, C0862p0.f5916a, AbstractC0881z.f5950a, C0878x0.f5948c, null, C0840f0.f5843a);
                    }
                }
            }
            InterfaceC0876w0<T> interfaceC0876w0 = (InterfaceC0876w0) concurrentHashMap.putIfAbsent(cls, interfaceC0876w0M3371w);
            if (interfaceC0876w0 != null) {
                interfaceC0876w0M3371w = interfaceC0876w0;
            }
        }
        return interfaceC0876w0M3371w;
    }
}
