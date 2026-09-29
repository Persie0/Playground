package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class rk3 implements qx5 {

    /* JADX INFO: renamed from: b */
    public static final rk3 f59426b = new rk3(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59427a;

    public /* synthetic */ rk3(int i) {
        this.f59427a = i;
    }

    @Override // p000.qx5
    public final boolean isSupported(Class cls) {
        switch (this.f59427a) {
            case 0:
                return AbstractC1183d.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // p000.qx5
    public final er7 messageInfoFor(Class cls) {
        switch (this.f59427a) {
            case 0:
                if (!AbstractC1183d.class.isAssignableFrom(cls)) {
                    C3386nv.m17626m("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (er7) AbstractC1183d.m6810l(cls.asSubclass(AbstractC1183d.class)).mo454k(GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    ij6.m13958p("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
