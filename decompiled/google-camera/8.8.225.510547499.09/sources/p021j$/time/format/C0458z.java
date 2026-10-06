package p021j$.time.format;

import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0458z {

    /* JADX INFO: renamed from: a */
    public static final C0458z f32996a = new C0458z();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C0458z() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0458z)) {
            return false;
        }
        ((C0458z) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
