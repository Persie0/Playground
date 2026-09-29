package p314p4;

import android.database.sqlite.SQLiteProgram;
import dm.C5207g;
import p288o4.InterfaceC7918d;

/* JADX INFO: renamed from: p4.d */
/* JADX INFO: loaded from: classes.dex */
public class C8187d implements InterfaceC7918d {

    /* JADX INFO: renamed from: a */
    public final SQLiteProgram f44330a;

    public C8187d(SQLiteProgram sQLiteProgram) {
        C5207g.m11111f(sQLiteProgram, "delegate");
        this.f44330a = sQLiteProgram;
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: F0 */
    public final void mo13192F0(double d10, int i10) {
        this.f44330a.bindDouble(i10, d10);
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: J0 */
    public final void mo13193J0(int i10) {
        this.f44330a.bindNull(i10);
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: W */
    public final void mo13194W(int i10, long j10) {
        this.f44330a.bindLong(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44330a.close();
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: h0 */
    public final void mo13197h0(String str, int i10) {
        C5207g.m11111f(str, "value");
        this.f44330a.bindString(i10, str);
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: r0 */
    public final void mo13199r0(byte[] bArr, int i10) {
        this.f44330a.bindBlob(i10, bArr);
    }
}
