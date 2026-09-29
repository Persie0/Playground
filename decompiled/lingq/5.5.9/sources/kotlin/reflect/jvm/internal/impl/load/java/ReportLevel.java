package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes2.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final C6838a Companion = new Object() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.a
    };
    private final String description;

    ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
