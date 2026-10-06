package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nys {

    /* JADX INFO: renamed from: a */
    public static final ntw f45035a;

    /* JADX INFO: renamed from: b */
    public static final ntw f45036b;

    static {
        ntw ntwVar;
        try {
            ntwVar = (ntw) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            ntwVar = null;
        }
        f45035a = ntwVar;
        f45036b = new ntw();
    }
}
