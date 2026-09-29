package p176ib;

import com.google.android.gms.common.api.C2542a;
import java.util.Arrays;

/* JADX INFO: renamed from: ib.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6276k implements C2542a.c {

    /* JADX INFO: renamed from: b */
    public static final C6276k f36471b = new C6276k();

    /* JADX INFO: renamed from: a */
    public final String f36472a = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6276k) {
            return C6268g.m12905a(this.f36472a, ((C6276k) obj).f36472a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36472a});
    }
}
