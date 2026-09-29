package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0867s implements InterfaceC0846h0 {

    /* JADX INFO: renamed from: a */
    public static final C0867s f5926a = new C0867s();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
    /* JADX INFO: renamed from: a */
    public final InterfaceC0843g0 mo3171a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC0843g0) GeneratedMessageLite.m3123l(cls.asSubclass(GeneratedMessageLite.class)).mo3038k(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0846h0
    /* JADX INFO: renamed from: b */
    public final boolean mo3172b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
