package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1494o0 implements Callable<List<UserDictionaryData>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1480m0 f8711b;

    public CallableC1494o0(C1480m0 c1480m0, C6595o c6595o) {
        this.f8711b = c1480m0;
        this.f8710a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserDictionaryData> call() throws Exception {
        RoomDatabase roomDatabase = this.f8711b.f8621a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8710a);
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
                    try {
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            arrayList.add(new UserDictionaryData(cursorM16698S0.getInt(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n2), cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3), cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4), cursorM16698S0.getInt(iM16742n5) != 0, cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6), cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7), cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8), cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9), cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10), cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11), cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12)));
                        }
                        roomDatabase.m4568s();
                        cursorM16698S0.close();
                        roomDatabase.m4563n();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM16698S0.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                roomDatabase.m4563n();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            roomDatabase.m4563n();
            throw th;
        }
    }

    public final void finalize() {
        this.f8710a.m13198q();
    }
}
