package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class IterableInAppLocation {
    public static final IterableInAppLocation IN_APP = new C12021();
    public static final IterableInAppLocation INBOX = new C12032();
    private static final /* synthetic */ IterableInAppLocation[] $VALUES = $values();

    private static /* synthetic */ IterableInAppLocation[] $values() {
        return new IterableInAppLocation[]{IN_APP, INBOX};
    }

    public /* synthetic */ IterableInAppLocation(String str, int i, int i2) {
        this(str, i);
    }

    public static IterableInAppLocation valueOf(String str) {
        return (IterableInAppLocation) Enum.valueOf(IterableInAppLocation.class, str);
    }

    public static IterableInAppLocation[] values() {
        return (IterableInAppLocation[]) $VALUES.clone();
    }

    private IterableInAppLocation(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppLocation$1 */
    public final enum C12021 extends IterableInAppLocation {
        public /* synthetic */ C12021() {
            this("IN_APP", 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "in-app";
        }

        private C12021(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppLocation$2 */
    public final enum C12032 extends IterableInAppLocation {
        public /* synthetic */ C12032() {
            this("INBOX", 1);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "inbox";
        }

        private C12032(String str, int i) {
            super(str, i, 0);
        }
    }
}
