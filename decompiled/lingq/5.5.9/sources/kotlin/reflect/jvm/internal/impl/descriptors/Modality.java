package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final C6809a Companion = new C6809a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.Modality$a */
    public static final class C6809a {
        /* JADX INFO: renamed from: a */
        public static Modality m13587a(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return Modality.SEALED;
            }
            if (z11) {
                return Modality.ABSTRACT;
            }
            return z12 ? Modality.OPEN : Modality.FINAL;
        }
    }
}
