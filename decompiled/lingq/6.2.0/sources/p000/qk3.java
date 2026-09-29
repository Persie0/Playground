package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class qk3 implements px5 {

    /* JADX INFO: renamed from: b */
    public static final qk3 f57866b = new qk3(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57867a;

    public /* synthetic */ qk3(int i) {
        this.f57867a = i;
    }

    @Override // p000.px5
    public final boolean isSupported(Class cls) {
        switch (this.f57867a) {
            case 0:
                return AbstractC1134i.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // p000.px5
    public final dr7 messageInfoFor(Class cls) {
        switch (this.f57867a) {
            case 0:
                if (!AbstractC1134i.class.isAssignableFrom(cls)) {
                    C3386nv.m17626m("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (dr7) AbstractC1134i.m6539i(cls.asSubclass(AbstractC1134i.class)).mo441h(GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    ij6.m13958p("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
