package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1513q5 implements Callable<List<TextToSpeechTokenUtterance>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1492n5 f8806b;

    public CallableC1513q5(C1492n5 c1492n5, C6595o c6595o) {
        this.f8806b = c1492n5;
        this.f8805a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<TextToSpeechTokenUtterance> call() throws Exception {
        C6595o c6595o = this.f8805a;
        RoomDatabase roomDatabase = this.f8806b.f8662a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "idWithLanguageAndData");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "utteranceId");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "text");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    int i10 = cursorM16698S0.getInt(iM16742n1);
                    String string3 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    if (!cursorM16698S0.isNull(iM16742n3)) {
                        string = cursorM16698S0.getString(iM16742n3);
                    }
                    arrayList.add(new TextToSpeechTokenUtterance(string2, i10, string3, string));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                c6595o.m13198q();
                roomDatabase.m4563n();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }
}
