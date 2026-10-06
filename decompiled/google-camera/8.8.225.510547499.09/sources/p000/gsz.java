package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsz {
    /* JADX INFO: renamed from: a */
    public static int m9724a(kbc kbcVar, kbc kbcVar2) {
        int iMin = Math.min(kbcVar.f35517a / kbcVar2.f35517a, kbcVar.f35518b / kbcVar2.f35518b);
        if (iMin > 0) {
            while (iMin > 0) {
                if (m9725b(kbcVar.f35517a, iMin) && m9725b(kbcVar.f35518b, iMin)) {
                    return iMin;
                }
                iMin--;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9725b(int i, int i2) {
        return i % (i2 + i2) == 0;
    }
}
