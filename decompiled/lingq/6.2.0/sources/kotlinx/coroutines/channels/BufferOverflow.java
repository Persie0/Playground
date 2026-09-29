package kotlinx.coroutines.channels;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum BufferOverflow {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
