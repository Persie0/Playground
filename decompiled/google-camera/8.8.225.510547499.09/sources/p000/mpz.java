package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum mpz {
    MONOCHROME(1),
    RGB(3);


    /* JADX INFO: renamed from: c */
    public static final Map f41314c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final int f41316d;

    static {
        for (mpz mpzVar : values()) {
            f41314c.put(Integer.valueOf(mpzVar.f41316d), mpzVar);
        }
    }

    mpz(int i) {
        this.f41316d = i;
    }
}
