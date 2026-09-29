package km;

import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: renamed from: km.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6730m {

    /* JADX INFO: renamed from: c */
    public static final C6730m f37941c = new C6730m(null, null);

    /* JADX INFO: renamed from: a */
    public final KVariance f37942a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6728k f37943b;

    /* JADX INFO: renamed from: km.m$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37944a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37944a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6730m(KVariance kVariance, KTypeImpl kTypeImpl) {
        String str;
        this.f37942a = kVariance;
        this.f37943b = kTypeImpl;
        if ((kVariance == null) == (kTypeImpl == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6730m)) {
            return false;
        }
        C6730m c6730m = (C6730m) obj;
        return this.f37942a == c6730m.f37942a && C5207g.m11106a(this.f37943b, c6730m.f37943b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        KVariance kVariance = this.f37942a;
        int iHashCode2 = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        InterfaceC6728k interfaceC6728k = this.f37943b;
        if (interfaceC6728k != null) {
            iHashCode = interfaceC6728k.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        KVariance kVariance = this.f37942a;
        int i10 = kVariance == null ? -1 : a.f37944a[kVariance.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        InterfaceC6728k interfaceC6728k = this.f37943b;
        if (i10 == 1) {
            return String.valueOf(interfaceC6728k);
        }
        if (i10 == 2) {
            return "in " + interfaceC6728k;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + interfaceC6728k;
    }
}
