package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbh {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f47326a = 0;

    static {
        lku.m15626U("0123456789abcdef");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m19296a(pbd pbdVar, int i, byte[] bArr, int i2) {
        pbdVar.getClass();
        bArr.getClass();
        int i3 = pbdVar.f47316c;
        byte[] bArr2 = pbdVar.f47314a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                pbdVar = pbdVar.f47319f;
                pbdVar.getClass();
                byte[] bArr3 = pbdVar.f47314a;
                bArr2 = bArr3;
                i = pbdVar.f47315b;
                i3 = pbdVar.f47316c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
