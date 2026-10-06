package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kod {

    /* JADX INFO: renamed from: a */
    public static final kod f36676a = new kod(new Object[0]);

    /* JADX INFO: renamed from: b */
    public final Object[] f36677b;

    /* JADX INFO: renamed from: c */
    private final int f36678c;

    private kod(Object[] objArr) {
        this.f36677b = objArr;
        this.f36678c = Arrays.hashCode(objArr);
    }

    /* JADX INFO: renamed from: a */
    public static kod m14618a(Object... objArr) {
        return objArr.length == 0 ? f36676a : new kod(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kod)) {
            return false;
        }
        kod kodVar = (kod) obj;
        return this.f36678c == kodVar.f36678c && Arrays.equals(this.f36677b, kodVar.f36677b);
    }

    public final int hashCode() {
        return this.f36678c;
    }

    public final String toString() {
        return Arrays.toString(this.f36677b);
    }
}
