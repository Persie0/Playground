package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.Meaning;
import com.lingq.entity.Readings;
import com.lingq.entity.Word;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1395a6 implements Callable<Word> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1576z5 f8321b;

    public CallableC1395a6(C1576z5 c1576z5, C6595o c6595o) {
        this.f8321b = c1576z5;
        this.f8320a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final Word call() throws Exception {
        C6595o c6595o;
        int i10;
        C1576z5 c1576z5 = this.f8321b;
        RoomDatabase roomDatabase = c1576z5.f9019a;
        C1405c0 c1405c0 = c1576z5.f9021c;
        C6595o c6595o2 = this.f8320a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "termWithLanguage");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "term");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "status");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "importance");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "meanings");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "tags");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "gTags");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "cardId");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "romaji");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "hiragana");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "pinyin");
            c6595o = c6595o2;
            try {
                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "hant");
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "hans");
                Word word = null;
                Readings readings = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                    int i11 = cursorM16698S0.getInt(iM16742n2);
                    String string4 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    int i12 = cursorM16698S0.getInt(iM16742n4);
                    boolean z10 = cursorM16698S0.getInt(iM16742n5) != 0;
                    List<Meaning> listM5002m = c1405c0.m5002m(cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7));
                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8));
                    int i13 = cursorM16698S0.getInt(iM16742n9);
                    if (cursorM16698S0.isNull(iM16742n10) && cursorM16698S0.isNull(iM16742n11) && cursorM16698S0.isNull(iM16742n12)) {
                        i10 = iM16742n13;
                        if (!cursorM16698S0.isNull(i10) || !cursorM16698S0.isNull(iM16742n14)) {
                        }
                        word = new Word(string2, string3, i11, string4, i12, z10, listM5002m, listM4992l, listM4992l2, readings, i13);
                    } else {
                        i10 = iM16742n13;
                    }
                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10));
                    List listM4992l4 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11));
                    List listM4992l5 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12));
                    List listM4992l6 = C1405c0.m4992l(cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10));
                    if (!cursorM16698S0.isNull(iM16742n14)) {
                        string = cursorM16698S0.getString(iM16742n14);
                    }
                    readings = new Readings(listM4992l3, listM4992l4, listM4992l5, listM4992l6, C1405c0.m4992l(string));
                    word = new Word(string2, string3, i11, string4, i12, z10, listM5002m, listM4992l, listM4992l2, readings, i13);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return word;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595o2;
        }
    }
}
