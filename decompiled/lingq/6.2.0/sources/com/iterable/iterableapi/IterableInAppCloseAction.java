package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class IterableInAppCloseAction {
    public static final IterableInAppCloseAction BACK = new C11961();
    public static final IterableInAppCloseAction LINK = new C11972();
    public static final IterableInAppCloseAction OTHER = new C11983();
    private static final /* synthetic */ IterableInAppCloseAction[] $VALUES = $values();

    private static /* synthetic */ IterableInAppCloseAction[] $values() {
        return new IterableInAppCloseAction[]{BACK, LINK, OTHER};
    }

    public /* synthetic */ IterableInAppCloseAction(String str, int i, int i2) {
        this(str, i);
    }

    public static IterableInAppCloseAction valueOf(String str) {
        return (IterableInAppCloseAction) Enum.valueOf(IterableInAppCloseAction.class, str);
    }

    public static IterableInAppCloseAction[] values() {
        return (IterableInAppCloseAction[]) $VALUES.clone();
    }

    private IterableInAppCloseAction(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppCloseAction$1 */
    public final enum C11961 extends IterableInAppCloseAction {
        public /* synthetic */ C11961() {
            this("BACK", 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "back";
        }

        private C11961(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppCloseAction$2 */
    public final enum C11972 extends IterableInAppCloseAction {
        public /* synthetic */ C11972() {
            this("LINK", 1);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "link";
        }

        private C11972(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.iterable.iterableapi.IterableInAppCloseAction$3 */
    public final enum C11983 extends IterableInAppCloseAction {
        public /* synthetic */ C11983() {
            this("OTHER", 2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "other";
        }

        private C11983(String str, int i) {
            super(str, i, 0);
        }
    }
}
