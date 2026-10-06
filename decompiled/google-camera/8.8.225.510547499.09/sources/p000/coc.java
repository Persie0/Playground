package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class coc implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f6423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6424b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f6425c;

    public /* synthetic */ coc(long j, byte[] bArr, int i) {
        this.f6425c = i;
        this.f6423a = j;
        this.f6424b = bArr;
    }

    public /* synthetic */ coc(coe coeVar, long j, int i) {
        this.f6425c = i;
        this.f6424b = coeVar;
        this.f6423a = j;
    }

    public /* synthetic */ coc(String str, long j, int i) {
        this.f6425c = i;
        this.f6424b = str;
        this.f6423a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ksi] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ksi] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, ksi] */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f6425c) {
            case 0:
                Object obj2 = this.f6424b;
                long j = this.f6423a;
                djm djmVar = (djm) obj;
                lku.m15614I(true, "sourceId should be a String.");
                ContentValues contentValues = new ContentValues();
                contentValues.put("session_id", Long.valueOf(j));
                contentValues.put("time", Long.valueOf(djmVar.f11787a.mo14815a()));
                contentValues.put("selection_key", Integer.valueOf(((Random) djmVar.f11788b).nextInt(2147483646) + 1));
                contentValues.put("source_id", (String) obj2);
                long jInsertWithOnConflict = ((SQLiteDatabase) djmVar.f11789c).insertWithOnConflict("media_record", null, contentValues, 5);
                djmVar.m6242q("media_record", "media_id");
                return Long.valueOf(jInsertWithOnConflict);
            case 1:
                long j2 = this.f6423a;
                Object obj3 = this.f6424b;
                djm djmVar2 = (djm) obj;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("time", Long.valueOf(djmVar2.f11787a.mo14815a()));
                contentValues2.put(voNZjxiJou.Yga, (byte[]) obj3);
                ((SQLiteDatabase) djmVar2.f11789c).updateWithOnConflict(CswIK.Kurhpo, contentValues2, "session_id = " + j2, new String[0], 5);
                djmVar2.m6242q("session", "session_id");
                return null;
            default:
                Object obj4 = this.f6424b;
                long j3 = this.f6423a;
                djm djmVar3 = (djm) obj;
                nba it = ((coe) obj4).f6428b.f6375g.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    long jMo14815a = djmVar3.f11787a.mo14815a() - j3;
                    ((SQLiteDatabase) djmVar3.f11789c).delete(str, "time IS NOT NULL AND time < " + jMo14815a, new String[0]);
                    SimpleDateFormat.getDateTimeInstance().format(new Date(jMo14815a));
                }
                return null;
        }
    }
}
