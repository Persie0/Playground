package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ki.C6697c;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1433f4 implements Callable<List<C6697c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8460b;

    public CallableC1433f4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8460b = c1560x3;
        this.f8459a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6697c> call() throws Exception {
        RoomDatabase roomDatabase = this.f8460b.f8940a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8459a);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "description");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "pos");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "url");
                    int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "imageUrl");
                    int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "originalImageUrl");
                    int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "price");
                    int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "duration");
                    int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                    int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                    int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "audioUrl");
                    int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "videoUrl");
                    try {
                        int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "language");
                        int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "isCourse");
                        int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "isCourseLesson");
                        int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "playlistLessonOrder");
                        int i10 = iM16742n13;
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            int i11 = cursorM16698S0.getInt(iM16742n0);
                            String string = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                            String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                            int i12 = cursorM16698S0.getInt(iM16742n3);
                            String string3 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                            String string4 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                            String string5 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                            int i13 = cursorM16698S0.getInt(iM16742n7);
                            int i14 = cursorM16698S0.getInt(iM16742n8);
                            int i15 = cursorM16698S0.getInt(iM16742n9);
                            String string6 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                            String string7 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                            Double dValueOf = cursorM16698S0.isNull(iM16742n12) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n12));
                            String string8 = cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10);
                            int i16 = iM16742n14;
                            int i17 = iM16742n0;
                            String string9 = cursorM16698S0.isNull(i16) ? null : cursorM16698S0.getString(i16);
                            int i18 = iM16742n15;
                            boolean z10 = cursorM16698S0.getInt(i18) != 0;
                            int i19 = iM16742n16;
                            boolean z11 = cursorM16698S0.getInt(i19) != 0;
                            int i20 = iM16742n17;
                            arrayList.add(new C6697c(i11, string3, string2, i12, string5, string4, string9, string, string6, i15, dValueOf, null, i14, string7, string8, cursorM16698S0.isNull(i20) ? null : Integer.valueOf(cursorM16698S0.getInt(i20)), z10, z11, i13));
                            iM16742n0 = i17;
                            iM16742n14 = i16;
                            iM16742n15 = i18;
                            iM16742n16 = i19;
                            iM16742n17 = i20;
                            i10 = i10;
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
        this.f8459a.m13198q();
    }
}
