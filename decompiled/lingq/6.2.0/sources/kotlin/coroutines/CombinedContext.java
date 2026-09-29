package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.C3598t4;
import p000.fa4;
import p000.in1;
import p000.jn1;
import p000.jx0;
import p000.kn1;
import p000.oh0;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedContext implements kn1, Serializable {

    /* JADX INFO: renamed from: a */
    public final kn1 f47682a;

    /* JADX INFO: renamed from: b */
    public final in1 f47683b;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: a */
        public final kn1[] f47684a;

        public Serialized(kn1[] kn1VarArr) {
            this.f47684a = kn1VarArr;
        }

        private final Object readResolve() {
            kn1[] kn1VarArr = this.f47684a;
            kn1 kn1VarPlus = EmptyCoroutineContext.f47685a;
            for (kn1 kn1Var : kn1VarArr) {
                kn1VarPlus = kn1VarPlus.plus(kn1Var);
            }
            return kn1VarPlus;
        }
    }

    public CombinedContext(in1 in1Var, kn1 kn1Var) {
        kn1Var.getClass();
        in1Var.getClass();
        this.f47682a = kn1Var;
        this.f47683b = in1Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iM15403d = m15403d();
        kn1[] kn1VarArr = new kn1[iM15403d];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(xfa.f68157a, new C3598t4(17, kn1VarArr, ref$IntRef));
        if (ref$IntRef.f47716a == iM15403d) {
            return new Serialized(kn1VarArr);
        }
        C3386nv.m17633t("Check failed.");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m15403d() {
        int i = 2;
        while (true) {
            kn1 kn1Var = this.f47682a;
            this = kn1Var instanceof CombinedContext ? (CombinedContext) kn1Var : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM11650l;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.m15403d() == m15403d()) {
                while (true) {
                    in1 in1Var = this.f47683b;
                    if (!fa4.m11650l(combinedContext.get(in1Var.getKey()), in1Var)) {
                        zM11650l = false;
                        break;
                    }
                    kn1 kn1Var = this.f47682a;
                    if (!(kn1Var instanceof CombinedContext)) {
                        kn1Var.getClass();
                        in1 in1Var2 = (in1) kn1Var;
                        zM11650l = fa4.m11650l(combinedContext.get(in1Var2.getKey()), in1Var2);
                        break;
                    }
                    this = (CombinedContext) kn1Var;
                }
                if (zM11650l) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(this.f47682a.fold(obj, zi3Var), this.f47683b);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        jn1Var.getClass();
        while (true) {
            in1 in1Var = this.f47683b.get(jn1Var);
            if (in1Var != null) {
                return in1Var;
            }
            kn1 kn1Var = this.f47682a;
            if (!(kn1Var instanceof CombinedContext)) {
                return kn1Var.get(jn1Var);
            }
            this = (CombinedContext) kn1Var;
        }
    }

    public final int hashCode() {
        return this.f47683b.hashCode() + this.f47682a.hashCode();
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        jn1Var.getClass();
        in1 in1Var = this.f47683b;
        in1 in1Var2 = in1Var.get(jn1Var);
        kn1 kn1Var = this.f47682a;
        if (in1Var2 != null) {
            return kn1Var;
        }
        kn1 kn1VarMinusKey = kn1Var.minusKey(jn1Var);
        if (kn1VarMinusKey == kn1Var) {
            return this;
        }
        return kn1VarMinusKey == EmptyCoroutineContext.f47685a ? in1Var : new CombinedContext(in1Var, kn1VarMinusKey);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        kn1Var.getClass();
        return kn1Var == EmptyCoroutineContext.f47685a ? this : (kn1) kn1Var.fold(this, new oh0(29));
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("["), (String) fold("", new jx0(9)), ']');
    }
}
