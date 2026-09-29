package androidx.lifecycle;

import kotlin.enums.AbstractC3201a;
import p000.gm5;
import p000.ib5;
import p000.jb5;
import p000.kb5;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Lifecycle$Event {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final jb5 Companion = new jb5();

    public static final Lifecycle$Event downFrom(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return jb5.m14371a(lifecycle$State);
    }

    public static final Lifecycle$Event downTo(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        lifecycle$State.getClass();
        int i = ib5.f43895a[lifecycle$State.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static final Lifecycle$Event upFrom(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return jb5.m14372b(lifecycle$State);
    }

    public static final Lifecycle$Event upTo(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return jb5.m14373c(lifecycle$State);
    }

    public final Lifecycle$State getTargetState() {
        switch (kb5.f46976a[ordinal()]) {
            case 1:
            case 2:
                return Lifecycle$State.CREATED;
            case 3:
            case 4:
                return Lifecycle$State.STARTED;
            case 5:
                return Lifecycle$State.RESUMED;
            case 6:
                return Lifecycle$State.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                gm5.m12750e();
                return null;
        }
    }
}
