package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
class IterableApiRequest$ProcessorType {
    public static final IterableApiRequest$ProcessorType ONLINE = new C11941();
    public static final IterableApiRequest$ProcessorType OFFLINE = new C11952();
    private static final /* synthetic */ IterableApiRequest$ProcessorType[] $VALUES = $values();

    private static /* synthetic */ IterableApiRequest$ProcessorType[] $values() {
        return new IterableApiRequest$ProcessorType[]{ONLINE, OFFLINE};
    }

    public /* synthetic */ IterableApiRequest$ProcessorType(String str, int i, int i2) {
        this(str, i);
    }

    public static IterableApiRequest$ProcessorType valueOf(String str) {
        return (IterableApiRequest$ProcessorType) Enum.valueOf(IterableApiRequest$ProcessorType.class, str);
    }

    public static IterableApiRequest$ProcessorType[] values() {
        return (IterableApiRequest$ProcessorType[]) $VALUES.clone();
    }

    private IterableApiRequest$ProcessorType(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableApiRequest$ProcessorType$1 */
    public final enum C11941 extends IterableApiRequest$ProcessorType {
        public /* synthetic */ C11941() {
            this("ONLINE", 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Online";
        }

        private C11941(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableApiRequest$ProcessorType$2 */
    public final enum C11952 extends IterableApiRequest$ProcessorType {
        public /* synthetic */ C11952() {
            this("OFFLINE", 1);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Offline";
        }

        private C11952(String str, int i) {
            super(str, i, 0);
        }
    }
}
