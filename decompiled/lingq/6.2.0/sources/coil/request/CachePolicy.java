package coil.request;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum CachePolicy {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final boolean readEnabled;
    private final boolean writeEnabled;

    CachePolicy(boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
