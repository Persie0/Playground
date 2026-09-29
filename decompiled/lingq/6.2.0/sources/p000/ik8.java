package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ik8 extends AutoCloseable {
    /* JADX INFO: renamed from: C */
    void mo2874C(int i, String str);

    /* JADX INFO: renamed from: L */
    String mo2875L(int i);

    /* JADX INFO: renamed from: a0 */
    boolean mo2876a0();

    /* JADX INFO: renamed from: g */
    void mo2877g(int i, double d);

    byte[] getBlob(int i);

    default boolean getBoolean() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    /* JADX INFO: renamed from: j */
    void mo2878j(int i, long j);

    /* JADX INFO: renamed from: k */
    void mo2879k(int i, byte[] bArr);

    /* JADX INFO: renamed from: m */
    void mo2880m(int i);

    /* JADX INFO: renamed from: o */
    void mo3998o();

    void reset();
}
