package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ki.C6697c;
import p288o4.C7915a;
import p288o4.InterfaceC7919e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1561x4 implements Callable<List<C6697c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7919e f8989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8990b;

    public CallableC1561x4(C1560x3 c1560x3, C7915a c7915a) {
        this.f8990b = c1560x3;
        this.f8989a = c7915a;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6697c> call() throws Exception {
        boolean z10;
        boolean z11;
        RoomDatabase roomDatabase = this.f8990b.f8940a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8989a);
                try {
                    int iM16739m0 = C8573r0.m16739m0(cursorM16698S0, "id");
                    int iM16739m1 = C8573r0.m16739m0(cursorM16698S0, "url");
                    int iM16739m2 = C8573r0.m16739m0(cursorM16698S0, "description");
                    int iM16739m3 = C8573r0.m16739m0(cursorM16698S0, "pos");
                    int iM16739m4 = C8573r0.m16739m0(cursorM16698S0, "originalImageUrl");
                    int iM16739m5 = C8573r0.m16739m0(cursorM16698S0, "imageUrl");
                    int iM16739m6 = C8573r0.m16739m0(cursorM16698S0, "language");
                    int iM16739m7 = C8573r0.m16739m0(cursorM16698S0, "title");
                    int iM16739m8 = C8573r0.m16739m0(cursorM16698S0, "collectionTitle");
                    int iM16739m9 = C8573r0.m16739m0(cursorM16698S0, "collectionId");
                    int iM16739m10 = C8573r0.m16739m0(cursorM16698S0, "listenTimes");
                    int iM16739m11 = C8573r0.m16739m0(cursorM16698S0, "progressDownloaded");
                    int iM16739m12 = C8573r0.m16739m0(cursorM16698S0, "duration");
                    int iM16739m13 = C8573r0.m16739m0(cursorM16698S0, "audioUrl");
                    try {
                        int iM16739m14 = C8573r0.m16739m0(cursorM16698S0, "videoUrl");
                        int iM16739m15 = C8573r0.m16739m0(cursorM16698S0, "playlistLessonOrder");
                        int iM16739m16 = C8573r0.m16739m0(cursorM16698S0, "isCourse");
                        int iM16739m17 = C8573r0.m16739m0(cursorM16698S0, "isCourseLesson");
                        int iM16739m18 = C8573r0.m16739m0(cursorM16698S0, "price");
                        int i10 = iM16739m13;
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            int i11 = iM16739m0 == -1 ? 0 : cursorM16698S0.getInt(iM16739m0);
                            Integer numValueOf = null;
                            String string = (iM16739m1 == -1 || cursorM16698S0.isNull(iM16739m1)) ? null : cursorM16698S0.getString(iM16739m1);
                            String string2 = (iM16739m2 == -1 || cursorM16698S0.isNull(iM16739m2)) ? null : cursorM16698S0.getString(iM16739m2);
                            int i12 = iM16739m3 == -1 ? 0 : cursorM16698S0.getInt(iM16739m3);
                            String string3 = (iM16739m4 == -1 || cursorM16698S0.isNull(iM16739m4)) ? null : cursorM16698S0.getString(iM16739m4);
                            String string4 = (iM16739m5 == -1 || cursorM16698S0.isNull(iM16739m5)) ? null : cursorM16698S0.getString(iM16739m5);
                            String string5 = (iM16739m6 == -1 || cursorM16698S0.isNull(iM16739m6)) ? null : cursorM16698S0.getString(iM16739m6);
                            String string6 = (iM16739m7 == -1 || cursorM16698S0.isNull(iM16739m7)) ? null : cursorM16698S0.getString(iM16739m7);
                            String string7 = (iM16739m8 == -1 || cursorM16698S0.isNull(iM16739m8)) ? null : cursorM16698S0.getString(iM16739m8);
                            int i13 = iM16739m9 == -1 ? 0 : cursorM16698S0.getInt(iM16739m9);
                            Double dValueOf = (iM16739m10 == -1 || cursorM16698S0.isNull(iM16739m10)) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16739m10));
                            Integer numValueOf2 = (iM16739m11 == -1 || cursorM16698S0.isNull(iM16739m11)) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16739m11));
                            int i14 = iM16739m12 == -1 ? 0 : cursorM16698S0.getInt(iM16739m12);
                            int i15 = i10;
                            int i16 = iM16739m0;
                            String string8 = (i15 == -1 || cursorM16698S0.isNull(i15)) ? null : cursorM16698S0.getString(i15);
                            int i17 = iM16739m14;
                            String string9 = (i17 == -1 || cursorM16698S0.isNull(i17)) ? null : cursorM16698S0.getString(i17);
                            int i18 = iM16739m15;
                            if (i18 != -1 && !cursorM16698S0.isNull(i18)) {
                                numValueOf = Integer.valueOf(cursorM16698S0.getInt(i18));
                            }
                            Integer num = numValueOf;
                            boolean z12 = true;
                            iM16739m16 = iM16739m16;
                            if (iM16739m16 == -1) {
                                z10 = false;
                            } else {
                                z10 = cursorM16698S0.getInt(iM16739m16) != 0;
                            }
                            if (iM16739m17 == -1) {
                                z11 = false;
                            } else {
                                if (cursorM16698S0.getInt(iM16739m17) == 0) {
                                    z12 = false;
                                }
                                z11 = z12;
                            }
                            arrayList.add(new C6697c(i11, string, string2, i12, string3, string4, string5, string6, string7, i13, dValueOf, numValueOf2, i14, string8, string9, num, z10, z11, iM16739m18 == -1 ? 0 : cursorM16698S0.getInt(iM16739m18)));
                            iM16739m18 = iM16739m18;
                            iM16739m0 = i16;
                            i10 = i15;
                            iM16739m14 = i17;
                            iM16739m15 = i18;
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
}
