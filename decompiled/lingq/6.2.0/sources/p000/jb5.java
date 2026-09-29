package p000;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class jb5 {
    /* JADX INFO: renamed from: a */
    public static Lifecycle$Event m14371a(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = ib5.f43895a[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_DESTROY;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle$Event.ON_PAUSE;
    }

    /* JADX INFO: renamed from: b */
    public static Lifecycle$Event m14372b(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = ib5.f43895a[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_START;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return Lifecycle$Event.ON_CREATE;
    }

    /* JADX INFO: renamed from: c */
    public static Lifecycle$Event m14373c(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        int i = ib5.f43895a[lifecycle$State.ordinal()];
        if (i == 1) {
            return Lifecycle$Event.ON_CREATE;
        }
        if (i == 2) {
            return Lifecycle$Event.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle$Event.ON_RESUME;
    }
}
