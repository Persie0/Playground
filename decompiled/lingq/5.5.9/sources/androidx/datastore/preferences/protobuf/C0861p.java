package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0861p {

    /* JADX INFO: renamed from: a */
    public static final C0859o f5914a = new C0859o();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0857n<?> f5915b;

    static {
        AbstractC0857n<?> abstractC0857n;
        try {
            abstractC0857n = (AbstractC0857n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0857n = null;
        }
        f5915b = abstractC0857n;
    }
}
