package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1501p0 implements Callable<UserDictionaryData> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1480m0 f8723b;

    public CallableC1501p0(C1480m0 c1480m0, C6595o c6595o) {
        this.f8723b = c1480m0;
        this.f8722a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final UserDictionaryData call() throws Exception {
        RoomDatabase roomDatabase = this.f8723b.f8621a;
        C6595o c6595o = this.f8722a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "name");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "order");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "urlToTransform");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "urlDefinition");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isPopUpWindow");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "languageTo");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "urlVar1");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "urlVar2");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "urlVar3");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "urlVar4");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "urlVar5");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "overrideUrl");
            UserDictionaryData userDictionaryData = null;
            if (cursorM16698S0.moveToFirst()) {
                userDictionaryData = new UserDictionaryData(cursorM16698S0.getInt(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n2), cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3), cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4), cursorM16698S0.getInt(iM16742n5) != 0, cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6), cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7), cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8), cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9), cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10), cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11), cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12));
            }
            return userDictionaryData;
        } finally {
            cursorM16698S0.close();
            c6595o.m13198q();
        }
    }
}
