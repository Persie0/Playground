package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.challenge.ChallengeUserProfile;
import com.lingq.shared.uimodel.challenge.ChallengeUserRanking;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.z */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1570z implements Callable<List<ChallengeUserRanking>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f9004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f9005b;

    public CallableC1570z(C1493o c1493o, C6595o c6595o) {
        this.f9005b = c1493o;
        this.f9004a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<ChallengeUserRanking> call() throws Exception {
        C1493o c1493o = this.f9005b;
        RoomDatabase roomDatabase = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f9004a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    C1405c0 c1405c0 = c1493o.f8686h;
                    c1405c0.getClass();
                    C5207g.m11111f(string, "data");
                    Object objM10532b = c1405c0.f8356a.m10563a(ChallengeUserProfile.class).m10532b(string);
                    C5207g.m11108c(objM10532b);
                    arrayList.add(new ChallengeUserRanking(i10, cursorM16698S0.getInt(2), cursorM16698S0.getInt(3), (ChallengeUserProfile) objM10532b));
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
        this.f9004a.m13198q();
    }
}
