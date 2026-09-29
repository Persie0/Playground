package androidx.datastore.core;

import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c83;
import p000.fa4;
import p000.gm5;
import p000.u66;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {
    private final u66 cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        unInitialized.getClass();
        this.cachedValue = AbstractC3352my.m17114d(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        return (State) ((C3244l) this.cachedValue).getValue();
    }

    public final c83 getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    public final State<T> tryUpdate(State<T> state) {
        C3244l c3244l;
        Object value;
        State<T> state2;
        state.getClass();
        u66 u66Var = this.cachedValue;
        do {
            c3244l = (C3244l) u66Var;
            value = c3244l.getValue();
            state2 = (State) value;
            if ((state2 instanceof ReadException) || fa4.m11650l(state2, UnInitialized.INSTANCE)) {
                state2 = state;
            } else if (state2 instanceof Data) {
                if (state.getVersion() > ((Data) state2).getVersion()) {
                    state2 = state;
                }
            } else if (!(state2 instanceof Final)) {
                if (state2 instanceof NoValueDataState) {
                    C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
                    return null;
                }
                gm5.m12750e();
                return null;
            }
        } while (!c3244l.m15570h(value, state2));
        return state2;
    }
}
