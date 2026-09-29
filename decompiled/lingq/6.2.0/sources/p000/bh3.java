package p000;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class bh3 implements zn9 {

    /* JADX INFO: renamed from: a */
    public final SQLiteProgram f8537a;

    public bh3(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f8537a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8537a.close();
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: g */
    public final void mo3711g(int i, double d) {
        this.f8537a.bindDouble(i, d);
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: j */
    public final void mo3712j(int i, long j) {
        this.f8537a.bindLong(i, j);
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: k */
    public final void mo3713k(int i, byte[] bArr) {
        this.f8537a.bindBlob(i, bArr);
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: m */
    public final void mo3714m(int i) {
        this.f8537a.bindNull(i);
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: o */
    public final void mo3715o() {
        this.f8537a.clearBindings();
    }

    @Override // p000.zn9
    /* JADX INFO: renamed from: t */
    public final void mo3716t(int i, String str) {
        str.getClass();
        this.f8537a.bindString(i, str);
    }
}
