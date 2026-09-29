package androidx.lifecycle;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Lifecycle$State {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final boolean isAtLeast(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        return compareTo(lifecycle$State) >= 0;
    }
}
