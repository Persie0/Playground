package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgh implements mrf {

    /* JADX INFO: renamed from: v */
    private final /* synthetic */ int f5606v;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ cgh f5605u = new cgh(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ cgh f5604t = new cgh(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ cgh f5603s = new cgh(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cgh f5602r = new cgh(17);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ cgh f5601q = new cgh(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ cgh f5600p = new cgh(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ cgh f5599o = new cgh(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ cgh f5598n = new cgh(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ cgh f5597m = new cgh(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cgh f5596l = new cgh(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cgh f5595k = new cgh(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ cgh f5594j = new cgh(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cgh f5593i = new cgh(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ cgh f5592h = new cgh(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cgh f5591g = new cgh(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cgh f5590f = new cgh(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cgh f5589e = new cgh(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cgh f5588d = new cgh(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cgh f5587c = new cgh(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cgh f5586b = new cgh(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cgh f5585a = new cgh(0);

    private /* synthetic */ cgh(int i) {
        this.f5606v = i;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ksi] */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.f5606v) {
            case 0:
                return Boolean.valueOf(((Float) obj).floatValue() >= 15.0f);
            case 1:
                return Boolean.valueOf(((cgs) obj) == cgs.ACTIVE);
            case 2:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (zBooleanValue) {
                    return zBooleanValue2 ? cgs.ACTIVE : cgs.INACTIVE_THROTTLED;
                }
                return cgs.INACTIVE;
            case 3:
                return mrm.m16828h(obj);
            case 4:
                return (ckb) obj;
            case 5:
                return ckb.f5963f;
            case 6:
                return ckb.f5961d;
            case 7:
                return ckb.f5961d;
            case 8:
                return cle.m3914a(cle.MAX) == ((Integer) obj).intValue() ? cle.MAX : cle.AUTO;
            case 9:
                return Integer.valueOf(cle.m3914a((cle) obj));
            case 10:
                List list2 = (List) obj;
                ikw ikwVar = (ikw) list2.get(0);
                kmq kmqVar = (kmq) list2.get(1);
                if (ikw.PHOTO.equals(ikwVar) && kmq.f36557a.equals(kmqVar)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                knj knjVar = (knj) obj;
                lku.m15662p(knjVar);
                nxl nxlVarM18137O = mej.f40179e.m18137O();
                long j = knjVar.f36607e;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                mej mejVar = (mej) nxlVarM18137O.f44974b;
                mejVar.f40181a |= 1;
                mejVar.f40184d = j;
                nxl nxlVarM18137O2 = mek.f40185e.m18137O();
                float f = knjVar.f36608f;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                mek mekVar = (mek) nxqVar;
                mekVar.f40187a = 1 | mekVar.f40187a;
                mekVar.f40188b = f;
                float f2 = knjVar.f36609g;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O2.f44974b;
                mek mekVar2 = (mek) nxqVar2;
                mekVar2.f40187a |= 2;
                mekVar2.f40189c = f2;
                float f3 = knjVar.f36610h;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                mek mekVar3 = (mek) nxlVarM18137O2.f44974b;
                mekVar3.f40187a |= 4;
                mekVar3.f40190d = f3;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                mej mejVar2 = (mej) nxlVarM18137O.f44974b;
                mek mekVar4 = (mek) nxlVarM18137O2.mo18103l();
                mekVar4.getClass();
                mejVar2.f40183c = mekVar4;
                mejVar2.f40182b = 4;
                return (mej) nxlVarM18137O.mo18103l();
            case 12:
                djm djmVar = (djm) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(djmVar.f11787a.mo14815a()));
                return Long.valueOf(((SQLiteDatabase) djmVar.f11789c).insertWithOnConflict("session", null, contentValues, 5));
            case 13:
                mxi mxiVarM17132D = mxk.m17132D();
                naz nazVarListIterator = ((mxk) obj).listIterator();
                while (nazVarListIterator.hasNext()) {
                    cow cowVar = (cow) nazVarListIterator.next();
                    if (cowVar.f8505b) {
                        mxiVarM17132D.mo17072d(cowVar.f8504a);
                    }
                }
                return mxiVarM17132D.mo17127f();
            case 14:
                return Boolean.valueOf(((gzn) obj).equals(gzn.EXT_WIRED));
            case 15:
                return Boolean.valueOf(((gzn) obj).equals(gzn.EXT_BLUETOOTH));
            case 16:
                Rect rect = (Rect) obj;
                return new gef(rect, rect, -1.0f);
            case 17:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 18:
                return ((ipq) obj).mo11593a();
            case 19:
                return Boolean.valueOf(((gzn) obj).equals(gzn.EXT_BLUETOOTH));
            default:
                return ((Boolean) obj).booleanValue() ? gfc.AMETHYST_ON : gfc.AMETHYST_OFF;
        }
    }
}
