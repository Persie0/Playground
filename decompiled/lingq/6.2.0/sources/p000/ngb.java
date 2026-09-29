package p000;

import com.google.android.gms.internal.measurement.C0957a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ngb {

    /* JADX INFO: renamed from: b */
    public static final C0957a f52716b = new C0957a();

    /* JADX INFO: renamed from: c */
    public static final ngb f52717c;

    /* JADX INFO: renamed from: a */
    public final mgb f52718a;

    static {
        List list = Collections.EMPTY_LIST;
        f52717c = new ngb(new mgb());
    }

    public ngb(mgb mgbVar) {
        this.f52718a = mgbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ngb) && ((ngb) obj).f52718a.equals(this.f52718a);
    }

    public final int hashCode() {
        return ~this.f52718a.hashCode();
    }

    public final String toString() {
        return this.f52718a.toString();
    }
}
