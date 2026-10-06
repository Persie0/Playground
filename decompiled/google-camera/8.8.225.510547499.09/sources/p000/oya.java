package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oya {

    /* JADX INFO: renamed from: a */
    public static final int f46803a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final String m19163a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }
}
