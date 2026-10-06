package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nxg {

    /* JADX INFO: renamed from: a */
    public static final ntw f44908a = new ntw();

    /* JADX INFO: renamed from: b */
    private static final ntw f44909b;

    static {
        ntw ntwVar;
        try {
            ntwVar = (ntw) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            ntwVar = null;
        }
        f44909b = ntwVar;
    }

    /* JADX INFO: renamed from: a */
    static ntw m18015a() {
        ntw ntwVar = f44909b;
        if (ntwVar != null) {
            return ntwVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
