package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class IterableInAppDeleteActionType {
    public static final IterableInAppDeleteActionType INBOX_SWIPE = new C11991();
    public static final IterableInAppDeleteActionType DELETE_BUTTON = new C12002();
    public static final IterableInAppDeleteActionType OTHER = new C12013();
    private static final /* synthetic */ IterableInAppDeleteActionType[] $VALUES = $values();

    private static /* synthetic */ IterableInAppDeleteActionType[] $values() {
        return new IterableInAppDeleteActionType[]{INBOX_SWIPE, DELETE_BUTTON, OTHER};
    }

    public /* synthetic */ IterableInAppDeleteActionType(String str, int i, int i2) {
        this(str, i);
    }

    public static IterableInAppDeleteActionType valueOf(String str) {
        return (IterableInAppDeleteActionType) Enum.valueOf(IterableInAppDeleteActionType.class, str);
    }

    public static IterableInAppDeleteActionType[] values() {
        return (IterableInAppDeleteActionType[]) $VALUES.clone();
    }

    private IterableInAppDeleteActionType(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppDeleteActionType$1 */
    public final enum C11991 extends IterableInAppDeleteActionType {
        public /* synthetic */ C11991() {
            this("INBOX_SWIPE", 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "inbox-swipe";
        }

        private C11991(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppDeleteActionType$2 */
    public final enum C12002 extends IterableInAppDeleteActionType {
        public /* synthetic */ C12002() {
            this("DELETE_BUTTON", 1);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "delete-button";
        }

        private C12002(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppDeleteActionType$3 */
    public final enum C12013 extends IterableInAppDeleteActionType {
        public /* synthetic */ C12013() {
            this("OTHER", 2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "other";
        }

        private C12013(String str, int i) {
            super(str, i, 0);
        }
    }
}
