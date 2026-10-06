package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class mrc implements mrp {
    protected mrc() {
    }

    /* JADX INFO: renamed from: c */
    public static String m16817c(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m16818d(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                break;
            case 1:
                charSequence.charAt(0);
                break;
            case 2:
                charSequence.charAt(0);
                charSequence.charAt(1);
                break;
            default:
                new mqw(charSequence);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16819e(char c, char c2) {
        new mqy(c, c2);
    }

    @Override // p000.mrp
    @Deprecated
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo8324a(Object obj) {
        return mo16816b(((Character) obj).charValue());
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo16816b(char c);
}
