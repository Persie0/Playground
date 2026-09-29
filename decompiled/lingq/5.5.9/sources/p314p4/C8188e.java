package p314p4;

import android.database.sqlite.SQLiteStatement;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: p4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8188e extends C8187d implements InterfaceC7920f {

    /* JADX INFO: renamed from: b */
    public final SQLiteStatement f44331b;

    public C8188e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f44331b = sQLiteStatement;
    }

    @Override // p288o4.InterfaceC7920f
    /* JADX INFO: renamed from: A */
    public final int mo15736A() {
        return this.f44331b.executeUpdateDelete();
    }

    @Override // p288o4.InterfaceC7920f
    /* JADX INFO: renamed from: u1 */
    public final long mo15737u1() {
        return this.f44331b.executeInsert();
    }
}
