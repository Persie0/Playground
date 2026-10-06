package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayc {

    /* JADX INFO: renamed from: a */
    public static final Object f2709a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile ayc f2710b;

    /* JADX INFO: renamed from: a */
    public static ayc m2099a() {
        ayc aycVar;
        synchronized (f2709a) {
            if (f2710b == null) {
                f2710b = new ayc();
            }
            aycVar = f2710b;
        }
        return aycVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m2100b(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
