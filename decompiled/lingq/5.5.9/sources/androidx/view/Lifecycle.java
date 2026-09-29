package androidx.view;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Object> f6521a = new AtomicReference<>();

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m13365d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a$a */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f6522a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f6522a = iArr;
                }
            }

            /* JADX INFO: renamed from: a */
            public static Event m3886a(State state) {
                C5207g.m11111f(state, "state");
                int i10 = a.f6522a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i10 == 2) {
                    return Event.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            /* JADX INFO: renamed from: b */
            public static Event m3887b(State state) {
                C5207g.m11111f(state, "state");
                int i10 = a.f6522a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_START;
                }
                if (i10 == 2) {
                    return Event.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            /* JADX INFO: renamed from: c */
            public static Event m3888c(State state) {
                C5207g.m11111f(state, "state");
                int i10 = a.f6522a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_CREATE;
                }
                if (i10 == 2) {
                    return Event.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$b */
        public /* synthetic */ class C1009b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6523a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f6523a = iArr;
            }
        }

        public static final Event downFrom(State state) {
            INSTANCE.getClass();
            return Companion.m3886a(state);
        }

        public static final Event downTo(State state) {
            INSTANCE.getClass();
            C5207g.m11111f(state, "state");
            int i10 = Companion.a.f6522a[state.ordinal()];
            if (i10 == 1) {
                return ON_STOP;
            }
            if (i10 == 2) {
                return ON_PAUSE;
            }
            if (i10 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static final Event upFrom(State state) {
            INSTANCE.getClass();
            return Companion.m3887b(state);
        }

        public static final Event upTo(State state) {
            INSTANCE.getClass();
            return Companion.m3888c(state);
        }

        public final State getTargetState() {
            switch (C1009b.f6523a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m13365d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            C5207g.m11111f(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3883a(InterfaceC1050p interfaceC1050p);

    /* JADX INFO: renamed from: b */
    public abstract State mo3884b();

    /* JADX INFO: renamed from: c */
    public abstract void mo3885c(InterfaceC1050p interfaceC1050p);
}
