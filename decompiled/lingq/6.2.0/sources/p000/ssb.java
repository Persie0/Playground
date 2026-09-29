package p000;

import com.google.android.gms.internal.clearcut.AbstractC0949b;

/* JADX INFO: loaded from: classes2.dex */
public final class ssb implements jyb {

    /* JADX INFO: renamed from: b */
    public static final ssb f61373b = new ssb(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61374a;

    public /* synthetic */ ssb(int i) {
        this.f61374a = i;
    }

    @Override // p000.jyb
    /* JADX INFO: renamed from: a */
    public final z0c mo13548a(Class cls) {
        switch (this.f61374a) {
            case 0:
                if (!AbstractC0949b.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (z0c) AbstractC0949b.m5292d(cls.asSubclass(AbstractC0949b.class)).mo5293a(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.jyb
    /* JADX INFO: renamed from: b */
    public final boolean mo13549b(Class cls) {
        switch (this.f61374a) {
            case 0:
                return AbstractC0949b.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
