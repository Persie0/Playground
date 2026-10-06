package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class omr {

    /* JADX INFO: renamed from: a */
    public static final Integer f46320a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable th) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f46320a = num2;
    }
}
