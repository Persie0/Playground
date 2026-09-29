package p000;

import com.google.android.gms.internal.vision.AbstractC1034s;

/* JADX INFO: loaded from: classes2.dex */
public final class aoc implements qtc {

    /* JADX INFO: renamed from: b */
    public static final aoc f7308b = new aoc(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7309a;

    public /* synthetic */ aoc(int i) {
        this.f7309a = i;
    }

    @Override // p000.qtc
    /* JADX INFO: renamed from: a */
    public final awc mo2961a(Class cls) {
        switch (this.f7309a) {
            case 0:
                if (!AbstractC1034s.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (awc) AbstractC1034s.m5740d(cls.asSubclass(AbstractC1034s.class)).mo5699e(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.qtc
    /* JADX INFO: renamed from: b */
    public final boolean mo2962b(Class cls) {
        switch (this.f7309a) {
            case 0:
                return AbstractC1034s.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
