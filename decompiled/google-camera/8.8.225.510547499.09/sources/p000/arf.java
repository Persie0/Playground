package p000;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arf extends are implements aqu {

    /* JADX INFO: renamed from: a */
    private final SQLiteStatement f2185a;

    public arf(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2185a = sQLiteStatement;
    }

    /* JADX INFO: renamed from: a */
    public final int m1883a() {
        return this.f2185a.executeUpdateDelete();
    }

    /* JADX INFO: renamed from: b */
    public final void m1884b() {
        this.f2185a.executeInsert();
    }
}
