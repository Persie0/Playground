package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
class IterableTaskType {
    public static final IterableTaskType API = new C12041();
    private static final /* synthetic */ IterableTaskType[] $VALUES = $values();

    private static /* synthetic */ IterableTaskType[] $values() {
        return new IterableTaskType[]{API};
    }

    public /* synthetic */ IterableTaskType(String str, int i, int i2) {
        this(str, i);
    }

    public static IterableTaskType valueOf(String str) {
        return (IterableTaskType) Enum.valueOf(IterableTaskType.class, str);
    }

    public static IterableTaskType[] values() {
        return (IterableTaskType[]) $VALUES.clone();
    }

    private IterableTaskType(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableTaskType$1 */
    public final enum C12041 extends IterableTaskType {
        public /* synthetic */ C12041() {
            this("API", 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "API";
        }

        private C12041(String str, int i) {
            super(str, i, 0);
        }
    }
}
