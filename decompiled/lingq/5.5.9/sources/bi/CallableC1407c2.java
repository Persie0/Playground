package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.Translation;
import com.lingq.entity.TranslationSentence;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;
import tk.C9312p;

/* JADX INFO: renamed from: bi.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1407c2 implements Callable<TranslationSentence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8360b;

    public CallableC1407c2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8360b = c1502p1;
        this.f8359a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final TranslationSentence call() throws Exception {
        C1502p1 c1502p1 = this.f8360b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        C6595o c6595o = this.f8359a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "index");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "lessonId");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "audioEnd");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "text");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "translations");
            TranslationSentence translationSentence = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(iM16742n0);
                int i11 = cursorM16698S0.getInt(iM16742n1);
                Double dValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n2));
                Double dValueOf2 = cursorM16698S0.isNull(iM16742n3) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n3));
                String string2 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                if (!cursorM16698S0.isNull(iM16742n5)) {
                    string = cursorM16698S0.getString(iM16742n5);
                }
                C1405c0 c1405c0 = c1502p1.f8727c;
                c1405c0.getClass();
                C5207g.m11111f(string, "data");
                Object objM10532b = c1405c0.f8356a.m10564b(C9312p.m17659d(List.class, Translation.class)).m10532b(string);
                C5207g.m11108c(objM10532b);
                translationSentence = new TranslationSentence(i10, i11, dValueOf, dValueOf2, string2, (List) objM10532b);
            }
            return translationSentence;
        } finally {
            cursorM16698S0.close();
            c6595o.m13198q();
        }
    }
}
