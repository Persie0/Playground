package p000;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class are implements aqu {

    /* JADX INFO: renamed from: a */
    private final SQLiteProgram f2184a;

    public are(SQLiteProgram sQLiteProgram) {
        this.f2184a = sQLiteProgram;
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: c */
    public final void mo1843c(int i, byte[] bArr) {
        this.f2184a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2184a.close();
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: d */
    public final void mo1844d(int i, double d) {
        this.f2184a.bindDouble(i, d);
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: e */
    public final void mo1845e(int i, long j) {
        this.f2184a.bindLong(i, j);
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: f */
    public final void mo1846f(int i) {
        this.f2184a.bindNull(i);
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: g */
    public final void mo1847g(int i, String str) {
        this.f2184a.bindString(i, str);
    }
}
