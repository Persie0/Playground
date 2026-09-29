package p000;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: renamed from: oj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3411oj implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54387b;

    public /* synthetic */ C3411oj(Object obj, int i) {
        this.f54386a = i;
        this.f54387b = obj;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f54386a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f54387b;
        switch (i) {
            case 0:
                C3462pj c3462pj = (C3462pj) obj5;
                wda wdaVarM25018b = ((ya3) c3462pj.f56288e).m25018b((xa3) obj, (bc3) obj2, ((wb3) obj3).f66583a, ((xb3) obj4).f68021a);
                if (wdaVarM25018b instanceof vda) {
                    Object obj6 = ((vda) wdaVarM25018b).f65260a;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                sq5 sq5Var = new sq5(wdaVarM25018b, c3462pj.f56293j);
                c3462pj.f56293j = sq5Var;
                Object obj7 = sq5Var.f61250d;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((ao9) obj5).mo2960z(new bh3(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                aj3 aj3Var = (aj3) obj5;
                ft4 ft4Var = (ft4) obj;
                ((Integer) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 131) != 130)) {
                    aj3Var.invoke(ft4Var, tj3Var, Integer.valueOf(iIntValue & 14));
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            default:
                C0282a c0282a = (C0282a) obj5;
                vv4 vv4Var = (vv4) obj;
                ((Integer) obj2).getClass();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(vv4Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    c0282a.invoke(vv4Var, tj3Var2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
        }
    }
}
