package p000;

import android.content.Context;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aey {
    /* JADX INFO: renamed from: a */
    static PointerIcon m405a(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static PointerIcon m406b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* JADX INFO: renamed from: c */
    static PointerIcon m407c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }

    /* JADX INFO: renamed from: d */
    public static final void m408d(aqp aqpVar) throws IOException {
        List<String> listM18665E = omn.m18665E();
        Cursor cursorMo1863b = aqpVar.mo1863b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorMo1863b.moveToNext()) {
            try {
                listM18665E.add(cursorMo1863b.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    omn.m18709n(cursorMo1863b, th);
                    throw th2;
                }
            }
        }
        omn.m18709n(cursorMo1863b, null);
        omn.m18681U(listM18665E);
        for (String str : listM18665E) {
            str.getClass();
            if (ook.m18766D(str, "room_fts_content_sync_")) {
                aqpVar.mo1868g("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Cursor m409e(apt aptVar, aqv aqvVar, boolean z) {
        Cursor cursorM1833u = aptVar.m1833u(aqvVar);
        if (z && (cursorM1833u instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM1833u;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorM1833u.getColumnNames(), cursorM1833u.getCount());
                    while (cursorM1833u.moveToNext()) {
                        Object[] objArr = new Object[cursorM1833u.getColumnCount()];
                        int columnCount = cursorM1833u.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            switch (cursorM1833u.getType(i)) {
                                case 0:
                                    objArr[i] = null;
                                    break;
                                case 1:
                                    objArr[i] = Long.valueOf(cursorM1833u.getLong(i));
                                    break;
                                case 2:
                                    objArr[i] = Double.valueOf(cursorM1833u.getDouble(i));
                                    break;
                                case 3:
                                    objArr[i] = cursorM1833u.getString(i);
                                    break;
                                case 4:
                                    objArr[i] = cursorM1833u.getBlob(i);
                                    break;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    omn.m18709n(cursorM1833u, null);
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        omn.m18709n(cursorM1833u, th);
                        throw th2;
                    }
                }
            }
        }
        return cursorM1833u;
    }
}
