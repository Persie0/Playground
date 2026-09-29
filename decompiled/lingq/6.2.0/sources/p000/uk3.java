package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class uk3 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC1183d f64018a;

    /* JADX INFO: renamed from: b */
    public AbstractC1183d f64019b;

    public uk3(AbstractC1183d abstractC1183d) {
        this.f64018a = abstractC1183d;
        if (abstractC1183d.m6815n()) {
            C3386nv.m17626m("Default instance must be immutable.");
            throw null;
        }
        this.f64019b = (AbstractC1183d) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public final Object clone() {
        AbstractC1183d abstractC1183d = this.f64018a;
        abstractC1183d.getClass();
        uk3 uk3Var = (uk3) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
        boolean zM6815n = this.f64019b.m6815n();
        AbstractC1183d abstractC1183d2 = this.f64019b;
        if (zM6815n) {
            abstractC1183d2.getClass();
            go7 go7Var = go7.f41083c;
            go7Var.getClass();
            go7Var.m12783a(abstractC1183d2.getClass()).makeImmutable(abstractC1183d2);
            abstractC1183d2.m6816o();
            abstractC1183d2 = this.f64019b;
        }
        uk3Var.f64019b = abstractC1183d2;
        return uk3Var;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1183d m22766g() {
        boolean zM6815n = this.f64019b.m6815n();
        AbstractC1183d abstractC1183d = this.f64019b;
        if (zM6815n) {
            abstractC1183d.getClass();
            go7 go7Var = go7.f41083c;
            go7Var.getClass();
            go7Var.m12783a(abstractC1183d.getClass()).makeImmutable(abstractC1183d);
            abstractC1183d.m6816o();
            abstractC1183d = this.f64019b;
        }
        abstractC1183d.getClass();
        byte bByteValue = ((Byte) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        boolean zIsInitialized = true;
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zIsInitialized = false;
            } else {
                go7 go7Var2 = go7.f41083c;
                go7Var2.getClass();
                zIsInitialized = go7Var2.m12783a(abstractC1183d.getClass()).isInitialized(abstractC1183d);
                abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
            }
        }
        if (zIsInitialized) {
            return abstractC1183d;
        }
        throw new UninitializedMessageException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: h */
    public final void m22767h() {
        if (this.f64019b.m6815n()) {
            return;
        }
        AbstractC1183d abstractC1183d = this.f64018a;
        abstractC1183d.getClass();
        AbstractC1183d abstractC1183d2 = (AbstractC1183d) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
        AbstractC1183d abstractC1183d3 = this.f64019b;
        go7 go7Var = go7.f41083c;
        go7Var.getClass();
        go7Var.m12783a(abstractC1183d2.getClass()).mergeFrom(abstractC1183d2, abstractC1183d3);
        this.f64019b = abstractC1183d2;
    }
}
