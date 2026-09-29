package kotlin.text;

import kotlin.enums.AbstractC3201a;
import p000.y52;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum RegexOption {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int mask;
    private final int value;

    /* synthetic */ RegexOption(int i, int i2, int i3, y52 y52Var) {
        this(i, (i3 & 2) != 0 ? i : i2);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    RegexOption(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }
}
