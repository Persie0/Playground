package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzg implements dzd {

    /* JADX INFO: renamed from: a */
    private final dzr f12965a;

    public dzg(dzr dzrVar) {
        this.f12965a = dzrVar;
    }

    @Override // p000.dzd
    /* JADX INFO: renamed from: a */
    public final Cursor mo6958a(Uri uri, String[] strArr) {
        long jM6938a = dyv.m6938a(uri);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"special_type_id"});
        mrm mrmVarMo6972a = this.f12965a.mo6972a(jM6938a);
        if (mrmVarMo6972a.mo16813g() && !((dzk) mrmVarMo6972a.mo16809c()).equals(dzk.NONE)) {
            matrixCursor.addRow(new Object[]{((dzk) mrmVarMo6972a.mo16809c()).m6969d()});
        }
        if (mrmVarMo6972a.mo16813g()) {
            mrmVarMo6972a.mo16809c();
        }
        return matrixCursor;
    }
}
