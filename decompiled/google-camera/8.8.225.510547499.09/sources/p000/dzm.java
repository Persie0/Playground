package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzm implements mrf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f12992a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12993b;

    public dzm(ContentValues contentValues, int i) {
        this.f12993b = i;
        this.f12992a = contentValues;
    }

    public dzm(cem cemVar, int i) {
        this.f12993b = i;
        this.f12992a = cemVar;
    }

    public dzm(List list, int i) {
        this.f12993b = i;
        this.f12992a = list;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    @Override // p000.mrf
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f12993b) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.getClass();
                sQLiteDatabase.replace("type_uri", null, (ContentValues) this.f12992a);
                return null;
            case 1:
                kay kayVar = (kay) obj;
                Object obj2 = this.f12992a;
                if (kayVar == null) {
                    kayVar = kay.CLOCKWISE_0;
                }
                return Integer.valueOf(((cem) obj2).m3567e(kayVar).f35503e);
            default:
                Set set = (Set) obj;
                set.getClass();
                lku.m15613H(set.size() == 1);
                grm grmVar = (grm) mkv.m16513U(set, 0);
                long jMo7248d = grmVar.f26152a.mo7248d();
                grmVar.f26152a.close();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f12992a.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((kpw) it.next()).mo7248d()));
                }
                int iIndexOf = arrayList.indexOf(Long.valueOf(jMo7248d));
                lku.m15613H(iIndexOf >= 0);
                return Integer.valueOf(iIndexOf);
        }
    }
}
