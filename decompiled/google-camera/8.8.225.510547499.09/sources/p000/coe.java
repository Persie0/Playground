package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coe implements cof {

    /* JADX INFO: renamed from: a */
    public static final nbh f6427a = nbh.m17259h("com/google/android/apps/camera/brella/examplestorecontroller/BrellaExampleStoreControllerImpl");

    /* JADX INFO: renamed from: b */
    public final cnr f6428b;

    /* JADX INFO: renamed from: c */
    private final Executor f6429c;

    /* JADX INFO: renamed from: d */
    private final ExecutorService f6430d;

    public coe(Executor executor, ExecutorService executorService, cnr cnrVar) {
        this.f6429c = executor;
        this.f6430d = executorService;
        this.f6428b = cnrVar;
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: a */
    public final cnh mo3995a(cny cnyVar, cnw cnwVar) {
        return new cnh(this.f6428b, cnyVar, cnwVar, this.f6430d);
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: b */
    public final nps mo3996b(String str, long j) {
        return this.f6428b.m3993a(new coc(str, j, 0));
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: c */
    public final nps mo3997c() {
        return this.f6428b.m3993a(cgh.f5597m);
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: d */
    public final nps mo3998d(final long j, final String str, final Map map, final byte[] bArr) {
        return this.f6428b.m3993a(new mrf() { // from class: cob
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ksi] */
            @Override // p000.mrf
            public final Object apply(Object obj) {
                String str2 = str;
                long j2 = j;
                Map map2 = map;
                byte[] bArr2 = bArr;
                djm djmVar = (djm) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("media_id", Long.valueOf(j2));
                contentValues.put(aJFPpVSaoDO.WymRMBphr, Long.valueOf(djmVar.f11787a.mo14815a()));
                contentValues.put("value", bArr2);
                for (String str3 : ((mwx) map2).keySet()) {
                    if (map2.get(str3) != null) {
                        contentValues.put(str3, (Integer) map2.get(str3));
                    }
                }
                ((SQLiteDatabase) djmVar.f11789c).insertWithOnConflict(str2, null, contentValues, 5);
                djmVar.m6242q(str2, "media_id");
                return null;
            }
        });
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: e */
    public final nps mo3999e(mxk mxkVar) {
        return this.f6428b.m3993a(new dvz(this, mxkVar, 1));
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: f */
    public final nps mo4000f(long j) {
        return this.f6428b.m3993a(new coc(this, j, 2));
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: g */
    public final nps mo4001g() {
        cnr cnrVar = this.f6428b;
        return kxk.m14970P(new cnm(cnrVar, 0), cnrVar.f6373e);
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: h */
    public final nps mo4002h(List list) {
        cnr cnrVar = this.f6428b;
        return kxk.m14970P(new cnn(cnrVar, list, 0), cnrVar.f6373e);
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: i */
    public final nps mo4003i(long j, byte[] bArr) {
        return this.f6428b.m3993a(new coc(j, bArr, 1));
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: j */
    public final void mo4004j() {
        kxk.m14975U(this.f6428b.m3993a(new ceg(this, 5)), new cod(0), this.f6429c);
    }

    @Override // p000.cof
    /* JADX INFO: renamed from: k */
    public final nps mo4005k() {
        final cnr cnrVar = this.f6428b;
        return kxk.m14970P(new nol() { // from class: cnk

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f6348b = "metadata";

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f6349c = "photo_mode";

            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() throws IllegalAccessException, InvocationTargetException {
                cnr cnrVar2 = cnrVar;
                String str = this.f6348b;
                String str2 = this.f6349c;
                SQLiteDatabase readableDatabase = cnrVar2.f6370b.getReadableDatabase();
                try {
                    Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT " + str2 + ", COUNT(*) FROM " + str + " GROUP BY " + str2, null);
                    try {
                        HashMap map = new HashMap();
                        while (cursorRawQuery.moveToNext()) {
                            map.put(Integer.valueOf(cursorRawQuery.getInt(0)), Integer.valueOf(cursorRawQuery.getInt(1)));
                        }
                        nps npsVarM14965K = kxk.m14965K(map);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return npsVarM14965K;
                    } catch (Throwable th) {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (readableDatabase != null) {
                        try {
                            readableDatabase.close();
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        }
                    }
                    throw th3;
                }
            }
        }, cnrVar.f6373e);
    }
}
