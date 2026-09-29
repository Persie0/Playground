package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class sk3 implements rx5 {

    /* JADX INFO: renamed from: b */
    public static final sk3 f60949b = new sk3(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60950a;

    public /* synthetic */ sk3(int i) {
        this.f60950a = i;
    }

    @Override // p000.rx5
    public final boolean isSupported(Class cls) {
        switch (this.f60950a) {
            case 0:
                return AbstractC0675i.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // p000.rx5
    public final fr7 messageInfoFor(Class cls) {
        switch (this.f60950a) {
            case 0:
                if (!AbstractC0675i.class.isAssignableFrom(cls)) {
                    C3386nv.m17626m("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (fr7) AbstractC0675i.m2378e(cls.asSubclass(AbstractC0675i.class)).mo2383d(GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    ij6.m13958p("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
