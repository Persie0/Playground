package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.x */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1556x implements Callable<List<ChallengeDetail>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8928b;

    public CallableC1556x(C1493o c1493o, C6595o c6595o) {
        this.f8928b = c1493o;
        this.f8927a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<ChallengeDetail> call() throws Exception {
        C1493o c1493o = this.f8928b;
        RoomDatabase roomDatabase = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8927a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = null;
                    String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string5 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    String string6 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                    String string7 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                    int i11 = cursorM16698S0.getInt(7);
                    String string8 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                    if (!cursorM16698S0.isNull(9)) {
                        string = cursorM16698S0.getString(9);
                    }
                    ChallengeSocialSettings challengeSocialSettingsM4998h = c1493o.f8686h.m4998h(string);
                    arrayList.add(new ChallengeDetail(i10, string2, string3, string5, string6, string7, string4, i11, cursorM16698S0.getInt(10) != 0, string8, cursorM16698S0.getInt(11) != 0, cursorM16698S0.getInt(12), challengeSocialSettingsM4998h));
                    c1493o = c1493o;
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }

    public final void finalize() {
        this.f8927a.m13198q();
    }
}
