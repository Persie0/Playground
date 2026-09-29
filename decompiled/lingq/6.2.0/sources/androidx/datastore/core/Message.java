package androidx.datastore.core;

import p000.kn1;
import p000.wb1;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Message<T> {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    public static final class Update<T> extends Message<T> {
        private final wb1 ack;
        private final kn1 callerContext;
        private final State<T> lastState;
        private final zi3 transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(zi3 zi3Var, wb1 wb1Var, State<T> state, kn1 kn1Var) {
            super(null);
            zi3Var.getClass();
            wb1Var.getClass();
            kn1Var.getClass();
            this.transform = zi3Var;
            this.ack = wb1Var;
            this.lastState = state;
            this.callerContext = kn1Var;
        }

        public final wb1 getAck() {
            return this.ack;
        }

        public final kn1 getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final zi3 getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(y52 y52Var) {
        this();
    }

    public abstract State<T> getLastState();

    private Message() {
    }
}
