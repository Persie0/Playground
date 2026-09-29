package p000;

import androidx.sqlite.driver.C0763a;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class ry5 {

    /* JADX INFO: renamed from: a */
    public final int f60039a;

    /* JADX INFO: renamed from: b */
    public final int f60040b;

    public ry5(int i, int i2) {
        this.f60039a = i;
        this.f60040b = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo18937a(xg3 xg3Var) {
        xg3Var.getClass();
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    /* JADX INFO: renamed from: b */
    public void mo16783b(bk8 bk8Var) {
        bk8Var.getClass();
        if (!(bk8Var instanceof C0763a)) {
            throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        mo18937a(((C0763a) bk8Var).f7069a);
    }
}
