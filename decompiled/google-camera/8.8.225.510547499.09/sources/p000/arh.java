package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arh {
    /* JADX INFO: renamed from: a */
    public static boolean m1887a() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static final aqy m1888b(nax naxVar, SQLiteDatabase sQLiteDatabase) {
        naxVar.getClass();
        Object obj = naxVar.f41919a;
        if (obj != null) {
            aqy aqyVar = (aqy) obj;
            if (ooc.m18737c(aqyVar.f2161b, sQLiteDatabase)) {
                return aqyVar;
            }
        }
        aqy aqyVar2 = new aqy(sQLiteDatabase);
        naxVar.f41919a = aqyVar2;
        return aqyVar2;
    }
}
