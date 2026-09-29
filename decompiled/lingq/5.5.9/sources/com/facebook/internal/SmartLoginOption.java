package com.facebook.internal;

import dm.C5207g;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m13365d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "J", "getValue", "()J", "<init>", "(Ljava/lang/String;IJ)V", "Companion", "a", "None", "Enabled", "RequireConfirm", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<SmartLoginOption> ALL;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final long value;

    /* JADX INFO: renamed from: com.facebook.internal.SmartLoginOption$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static EnumSet m6677a(long j10) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        C5207g.m11110e(enumSetNoneOf, "result");
                        return enumSetNoneOf;
                    }
                    SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                    if ((smartLoginOption.getValue() & j10) != 0) {
                        enumSetNoneOf.add(smartLoginOption);
                    }
                }
            }
        }
    }

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        C5207g.m11110e(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        ALL = enumSetAllOf;
    }

    SmartLoginOption(long j10) {
        this.value = j10;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j10) {
        INSTANCE.getClass();
        return Companion.m6677a(j10);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        SmartLoginOption[] smartLoginOptionArrValuesCustom = values();
        return (SmartLoginOption[]) Arrays.copyOf(smartLoginOptionArrValuesCustom, smartLoginOptionArrValuesCustom.length);
    }

    public final long getValue() {
        return this.value;
    }
}
