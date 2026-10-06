package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.MediaStore;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p021j$.util.StringJoiner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cnn implements nol {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6357b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f6358c;

    public /* synthetic */ cnn(cnr cnrVar, List list, int i) {
        this.f6358c = i;
        this.f6356a = cnrVar;
        this.f6357b = list;
    }

    public /* synthetic */ cnn(cnr cnrVar, mrf mrfVar, int i) {
        this.f6358c = i;
        this.f6356a = cnrVar;
        this.f6357b = mrfVar;
    }

    public /* synthetic */ cnn(cot cotVar, List list, int i) {
        this.f6358c = i;
        this.f6356a = cotVar;
        this.f6357b = list;
    }

    public /* synthetic */ cnn(dwc dwcVar, chp chpVar, int i) {
        this.f6358c = i;
        this.f6357b = dwcVar;
        this.f6356a = chpVar;
    }

    public /* synthetic */ cnn(hgs hgsVar, nps npsVar, int i) {
        this.f6358c = i;
        this.f6356a = hgsVar;
        this.f6357b = npsVar;
    }

    public /* synthetic */ cnn(hgx hgxVar, nps npsVar, int i) {
        this.f6358c = i;
        this.f6356a = hgxVar;
        this.f6357b = npsVar;
    }

    public /* synthetic */ cnn(jln jlnVar, mrf mrfVar, int i) {
        this.f6358c = i;
        this.f6356a = jlnVar;
        this.f6357b = mrfVar;
    }

    public /* synthetic */ cnn(llz llzVar, llx[] llxVarArr, int i) {
        this.f6358c = i;
        this.f6356a = llzVar;
        this.f6357b = llxVarArr;
    }

    public /* synthetic */ cnn(lml lmlVar, nxl nxlVar, int i) {
        this.f6358c = i;
        this.f6356a = lmlVar;
        this.f6357b = nxlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [chp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, mrf] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, mrf] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() throws IllegalAccessException, InvocationTargetException {
        int iM15632aa;
        int i = 0;
        switch (this.f6358c) {
            case 0:
                Object obj = this.f6356a;
                ?? r8 = this.f6357b;
                SQLiteDatabase readableDatabase = ((cnr) obj).f6370b.getReadableDatabase();
                try {
                    String[] strArr = new String[r8.size()];
                    String[] strArr2 = {"media_id"};
                    StringJoiner stringJoiner = new StringJoiner(",", "(", ")");
                    for (int i2 = 0; i2 < r8.size(); i2++) {
                        stringJoiner.add("?");
                        strArr[i2] = (String) r8.get(i2);
                    }
                    Cursor cursorQuery = readableDatabase.query(true, "media_record", strArr2, String.format("%s IN %s", "source_id", stringJoiner), strArr, null, null, null, null);
                    try {
                        cursorQuery.getCount();
                        mxi mxiVarM17132D = mxk.m17132D();
                        while (cursorQuery.moveToNext()) {
                            mxiVarM17132D.mo17072d(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("media_id"))));
                        }
                        nps npsVarM14965K = kxk.m14965K(mxiVarM17132D.mo17127f());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return npsVarM14965K;
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    if (readableDatabase == null) {
                        throw th3;
                    }
                    try {
                        readableDatabase.close();
                        throw th3;
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        throw th3;
                    }
                }
            case 1:
                Object obj2 = this.f6356a;
                ?? r2 = this.f6357b;
                SQLiteDatabase writableDatabase = ((cnr) obj2).f6370b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    try {
                        Object objApply = r2.apply(new djm(writableDatabase, ((cnr) obj2).f6371c, ((cnr) obj2).f6372d));
                        writableDatabase.setTransactionSuccessful();
                        nps npsVarM14965K2 = kxk.m14965K(objApply);
                        writableDatabase.endTransaction();
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return npsVarM14965K2;
                    } catch (Throwable th5) {
                        writableDatabase.endTransaction();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    if (writableDatabase == null) {
                        throw th6;
                    }
                    try {
                        writableDatabase.close();
                        throw th6;
                    } catch (Throwable th7) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                        throw th6;
                    }
                }
            case 2:
                Object obj3 = this.f6356a;
                ?? r3 = this.f6357b;
                ContentResolver contentResolver = ((cot) obj3).f8498b.getContentResolver();
                HashMap map = new HashMap();
                String[] strArr3 = new String[r3.size()];
                StringJoiner stringJoiner2 = new StringJoiner(" ");
                stringJoiner2.add("_id");
                if (r3.size() == 1) {
                    stringJoiner2.add("= ?");
                    strArr3[0] = (String) r3.get(0);
                } else {
                    stringJoiner2.add(" IN ");
                    StringJoiner stringJoiner3 = new StringJoiner(",", "(", ")");
                    for (int i3 = 0; i3 < r3.size(); i3++) {
                        stringJoiner3.add("?");
                        strArr3[i3] = (String) r3.get(i3);
                    }
                    stringJoiner2.add(stringJoiner3.toString());
                }
                mrn mrnVarM16830a = mrn.m16830a(stringJoiner2.toString(), strArr3);
                Cursor cursorQuery2 = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cot.f8497a, (String) mrnVarM16830a.f41479a, (String[]) mrnVarM16830a.f41480b, null);
                if (cursorQuery2 != null) {
                    while (cursorQuery2.moveToNext()) {
                        try {
                            String string = cursorQuery2.getString(0);
                            gyo gyoVarM5217a = cow.m5217a();
                            gyoVarM5217a.m9997h(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(string)));
                            gyoVarM5217a.m9995f(false);
                            gyoVarM5217a.m9996g(string);
                            map.put(string, gyoVarM5217a.m9994e());
                        } catch (Throwable th8) {
                            try {
                                cursorQuery2.close();
                                throw th8;
                            } catch (Throwable th9) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                                    throw th8;
                                } catch (Exception e) {
                                    throw th8;
                                }
                            }
                        }
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                return kxk.m14965K(map);
            case 3:
                return ((dwc) this.f6357b).m6803h(this.f6356a);
            case 4:
                Object obj4 = this.f6356a;
                ?? r4 = this.f6357b;
                ArrayList arrayList = new ArrayList();
                mws mwsVar = (mws) r4.get();
                int size = mwsVar.size();
                while (i < size) {
                    ResolveInfo resolveInfo = (ResolveInfo) mwsVar.get(i);
                    arrayList.add(mrn.m16830a(resolveInfo, resolveInfo.loadIcon(((hgs) obj4).f27740k)));
                    i++;
                }
                return kxk.m14965K(arrayList);
            case 5:
                Object obj5 = this.f6356a;
                ?? r5 = this.f6357b;
                ArrayList arrayList2 = new ArrayList();
                mws mwsVar2 = (mws) r5.get();
                int size2 = mwsVar2.size();
                while (i < size2) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) mwsVar2.get(i);
                    arrayList2.add(mrn.m16830a(resolveInfo2, resolveInfo2.loadIcon(((hgx) obj5).f27766k)));
                    i++;
                }
                return kxk.m14965K(arrayList2);
            case 6:
                Object obj6 = this.f6356a;
                ?? r6 = this.f6357b;
                SQLiteDatabase writableDatabase2 = ((jln) obj6).f34320a.getWritableDatabase();
                try {
                    writableDatabase2.beginTransaction();
                    try {
                        Object objApply2 = r6.apply(new djm(writableDatabase2, ((jln) obj6).f34321b, ((jln) obj6).f34322c, (byte[]) null));
                        writableDatabase2.setTransactionSuccessful();
                        nps npsVarM14965K3 = kxk.m14965K(objApply2);
                        writableDatabase2.endTransaction();
                        if (writableDatabase2 != null) {
                            writableDatabase2.close();
                        }
                        return npsVarM14965K3;
                    } catch (Throwable th10) {
                        writableDatabase2.endTransaction();
                        throw th10;
                    }
                } catch (Throwable th11) {
                    if (writableDatabase2 == null) {
                        throw th11;
                    }
                    try {
                        writableDatabase2.close();
                        throw th11;
                    } catch (Throwable th12) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th11, th12);
                        throw th11;
                    }
                }
            case 7:
                Object obj7 = this.f6356a;
                Object obj8 = this.f6357b;
                llz llzVar = (llz) obj7;
                mbl mblVar = llzVar.f38636b;
                lja ljaVarM15522a = ljb.m15522a();
                lly llyVar = (lly) llzVar.f38635a.get();
                nxl nxlVarM18137O = ozr.f47067b.m18137O();
                llx[] llxVarArr = (llx[]) obj8;
                if (llxVarArr.length <= 0) {
                    nxl nxlVarM18137O2 = pat.f47274u.m18137O();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pat patVar = (pat) nxlVarM18137O2.f44974b;
                    ozr ozrVar = (ozr) nxlVarM18137O.mo18103l();
                    ozrVar.getClass();
                    patVar.f47281f = ozrVar;
                    patVar.f47276a |= 32;
                    try {
                        ((lgk) llyVar.f38634b).get();
                        break;
                    } catch (Exception e2) {
                        ((nbe) ((nbe) ((nbe) lly.f38633a.m17252c()).mo17283h(e2)).mo17276G((char) 4541)).mo17290o("Exception while getting network metric extension!");
                    }
                    ljaVarM15522a.m15515e((pat) nxlVarM18137O2.mo18103l());
                    return mblVar.m16298b(ljaVarM15522a.m15511a());
                }
                nxl nxlVarM18137O3 = ozq.f47058g.m18137O();
                llx llxVar = llxVarArr[0];
                int i4 = llxVar.f38626d;
                int i5 = llxVar.f38625c;
                long j = llxVar.f38624b;
                long j2 = llxVar.f38623a;
                int i6 = llxVar.f38629g;
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ozq ozqVar = (ozq) nxlVarM18137O3.f44974b;
                ozqVar.f47060a |= 32;
                ozqVar.f47061b = 0;
                int i7 = llxVarArr[0].f38632j;
                nxl nxlVarM18137O4 = ozs.f47071c.m18137O();
                int i8 = llxVarArr[0].f38632j;
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                ozs ozsVar = (ozs) nxlVarM18137O4.f44974b;
                ozsVar.f47073a |= 1;
                ozsVar.f47074b = 0;
                ozs ozsVar2 = (ozs) nxlVarM18137O4.mo18103l();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ozq ozqVar2 = (ozq) nxlVarM18137O3.f44974b;
                ozsVar2.getClass();
                ozqVar2.f47065f = ozsVar2;
                ozqVar2.f47060a |= 4194304;
                llx llxVar2 = llxVarArr[0];
                String str = llxVar2.f38630h;
                String str2 = llxVar2.f38628f;
                if (!mro.m16832b(null)) {
                    throw null;
                }
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ozq ozqVar3 = (ozq) nxlVarM18137O3.f44974b;
                ozqVar3.f47062c = 0;
                ozqVar3.f47060a |= 256;
                ((lgk) llyVar.f38634b).get();
                llx llxVar3 = llxVarArr[0];
                String str3 = llxVar3.f38627e;
                ozy ozyVar = llxVar3.f38631i;
                throw null;
            default:
                Object obj9 = this.f6356a;
                Object obj10 = this.f6357b;
                lml lmlVar = (lml) obj9;
                if (!lmlVar.f38689d.m16299c(null)) {
                    return npp.f44031a;
                }
                nxl nxlVar = (nxl) obj10;
                ozx ozxVar = (ozx) nxlVar.f44974b;
                int i9 = ozxVar.f47117r;
                int iM15632aa2 = lku.m15632aa(i9);
                if (((iM15632aa2 != 0 && iM15632aa2 == 3) || ((iM15632aa = lku.m15632aa(i9)) != 0 && iM15632aa == 2)) && (ozxVar.f47100a & 16) == 0) {
                    return npp.f44031a;
                }
                lmb lmbVar = (lmb) lmlVar.f38687b.get();
                mrm mrmVar = lmbVar.f38644b;
                nps npsVarM14965K4 = kxk.m14965K(mqu.f41450a);
                mrm mrmVar2 = lmbVar.f38643a;
                nps npsVarM14965K5 = kxk.m14965K(mqu.f41450a);
                return kxk.m14959E(npsVarM14965K4, npsVarM14965K5).m17606b(new ltl(lmlVar, nxlVar, npsVarM14965K4, npsVarM14965K5, 1), not.INSTANCE);
        }
    }
}
