package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.CourseForImport;
import com.lingq.entity.LibraryData;
import com.lingq.entity.MediaSource;
import com.lingq.shared.uimodel.language.UserCourseForImport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8791e;
import p367rh.C8792f;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1421e0 extends AbstractC1413d0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8386a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8387b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8388c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f8389d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8390e;

    /* JADX INFO: renamed from: f */
    public final C0322j f8391f;

    /* JADX INFO: renamed from: bi.e0$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `CourseForImport` SET `language` = ?,`pk` = ?,`title` = ? WHERE `language` = ? AND `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            CourseForImport courseForImport = (CourseForImport) obj;
            String str = courseForImport.f16944a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            long j10 = courseForImport.f16945b;
            interfaceC7920f.mo13194W(2, j10);
            String str2 = courseForImport.f16946c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = courseForImport.f16944a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, j10);
        }
    }

    /* JADX INFO: renamed from: bi.e0$b */
    public class b implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8392a;

        public b(ArrayList arrayList) {
            this.f8392a = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1421e0 c1421e0 = C1421e0.this;
            RoomDatabase roomDatabase = c1421e0.f8386a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1421e0.f8387b.m1228p(this.f8392a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$c */
    public class c implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8394a;

        public c(List list) {
            this.f8394a = list;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1421e0 c1421e0 = C1421e0.this;
            RoomDatabase roomDatabase = c1421e0.f8386a;
            roomDatabase.m4552c();
            try {
                c1421e0.f8389d.m1226n(this.f8394a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$d */
    public class d implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8396a;

        public d(List list) {
            this.f8396a = list;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1421e0 c1421e0 = C1421e0.this;
            RoomDatabase roomDatabase = c1421e0.f8386a;
            roomDatabase.m4552c();
            try {
                c1421e0.f8390e.m1226n(this.f8396a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LibraryData` WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$f */
    public class f implements Callable<List<UserCourseForImport>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8398a;

        public f(C6595o c6595o) {
            this.f8398a = c6595o;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<UserCourseForImport> call() throws Exception {
            RoomDatabase roomDatabase = C1421e0.this.f8386a;
            C6595o c6595o = this.f8398a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "language");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "pk");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "title");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    int i10 = cursorM16698S0.getInt(iM16742n1);
                    if (!cursorM16698S0.isNull(iM16742n2)) {
                        string = cursorM16698S0.getString(iM16742n2);
                    }
                    arrayList.add(new UserCourseForImport(string2, i10, string));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$g */
    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LibraryData WHERE id = ? AND type = 'collection'";
        }
    }

    /* JADX INFO: renamed from: bi.e0$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LibraryData` (`id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`videoUrl`,`source_type`,`source_name`,`source_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = libraryData.f17240c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = libraryData.f17241d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, libraryData.f17242e);
            String str4 = libraryData.f17243f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = libraryData.f17245h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            Integer num = libraryData.f17246i;
            if (num == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13194W(8, num.intValue());
            }
            String str6 = libraryData.f17247j;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = libraryData.f17248k;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = libraryData.f17249l;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = libraryData.f17250m;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = libraryData.f17251n;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            String str11 = libraryData.f17252o;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str11, 14);
            }
            String str12 = libraryData.f17253p;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str12, 15);
            }
            String str13 = libraryData.f17254q;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str13, 16);
            }
            String str14 = libraryData.f17255r;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(str14, 17);
            }
            interfaceC7920f.mo13194W(18, libraryData.f17256s);
            interfaceC7920f.mo13194W(19, libraryData.f17257t);
            String str15 = libraryData.f17258u;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str15, 20);
            }
            interfaceC7920f.mo13194W(21, libraryData.f17259v);
            interfaceC7920f.mo13194W(22, libraryData.f17260w);
            interfaceC7920f.mo13194W(23, libraryData.f17261x);
            Integer num2 = libraryData.f17262y;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num2.intValue());
            }
            Integer num3 = libraryData.f17263z;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num3.intValue());
            }
            String str16 = libraryData.f17222A;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(26);
            } else {
                interfaceC7920f.mo13197h0(str16, 26);
            }
            interfaceC7920f.mo13192F0(libraryData.f17223B, 27);
            interfaceC7920f.mo13194W(28, libraryData.f17224C ? 1L : 0L);
            C1421e0 c1421e0 = C1421e0.this;
            c1421e0.f8388c.getClass();
            String strM4991d = C1405c0.m4991d(libraryData.f17225D);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(29);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 29);
            }
            String str17 = libraryData.f17226E;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(30);
            } else {
                interfaceC7920f.mo13197h0(str17, 30);
            }
            c1421e0.f8388c.getClass();
            String strM4991d2 = C1405c0.m4991d(libraryData.f17227F);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(31);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 31);
            }
            Float f3 = libraryData.f17228G;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 32);
            }
            Boolean bool = libraryData.f17229H;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(33);
            } else {
                interfaceC7920f.mo13194W(33, numValueOf.intValue());
            }
            String str18 = libraryData.f17230I;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(34);
            } else {
                interfaceC7920f.mo13197h0(str18, 34);
            }
            String str19 = libraryData.f17231J;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(35);
            } else {
                interfaceC7920f.mo13197h0(str19, 35);
            }
            String str20 = libraryData.f17232K;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str20, 36);
            }
            interfaceC7920f.mo13192F0(libraryData.f17233L, 37);
            interfaceC7920f.mo13192F0(libraryData.f17234M, 38);
            interfaceC7920f.mo13194W(39, libraryData.f17235N ? 1L : 0L);
            interfaceC7920f.mo13194W(40, libraryData.f17236O ? 1L : 0L);
            String str21 = libraryData.f17237P;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str21, 41);
            }
            MediaSource mediaSource = libraryData.f17244g;
            if (mediaSource == null) {
                interfaceC7920f.mo13193J0(42);
                interfaceC7920f.mo13193J0(43);
                interfaceC7920f.mo13193J0(44);
                return;
            }
            String str22 = mediaSource.f17293a;
            if (str22 == null) {
                interfaceC7920f.mo13193J0(42);
            } else {
                interfaceC7920f.mo13197h0(str22, 42);
            }
            String str23 = mediaSource.f17294b;
            if (str23 == null) {
                interfaceC7920f.mo13193J0(43);
            } else {
                interfaceC7920f.mo13197h0(str23, 43);
            }
            String str24 = mediaSource.f17295c;
            if (str24 == null) {
                interfaceC7920f.mo13193J0(44);
            } else {
                interfaceC7920f.mo13197h0(str24, 44);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LibraryData` SET `id` = ?,`type` = ?,`title` = ?,`description` = ?,`pos` = ?,`url` = ?,`imageUrl` = ?,`providerId` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`level` = ?,`newWordsCount` = ?,`lessonsCount` = ?,`owner` = ?,`price` = ?,`cardsCount` = ?,`rosesCount` = ?,`duration` = ?,`collectionId` = ?,`collectionTitle` = ?,`difficulty` = ?,`isAvailable` = ?,`tags` = ?,`status` = ?,`folders` = ?,`progress` = ?,`isTaken` = ?,`lessonPreview` = ?,`accent` = ?,`audioUrl` = ?,`listenTimes` = ?,`readTimes` = ?,`isCompleted` = ?,`isFavorite` = ?,`videoUrl` = ?,`source_type` = ?,`source_name` = ?,`source_url` = ? WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = libraryData.f17240c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = libraryData.f17241d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, libraryData.f17242e);
            String str4 = libraryData.f17243f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = libraryData.f17245h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            Integer num = libraryData.f17246i;
            if (num == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13194W(8, num.intValue());
            }
            String str6 = libraryData.f17247j;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = libraryData.f17248k;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = libraryData.f17249l;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = libraryData.f17250m;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = libraryData.f17251n;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            String str11 = libraryData.f17252o;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str11, 14);
            }
            String str12 = libraryData.f17253p;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str12, 15);
            }
            String str13 = libraryData.f17254q;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str13, 16);
            }
            String str14 = libraryData.f17255r;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(str14, 17);
            }
            interfaceC7920f.mo13194W(18, libraryData.f17256s);
            interfaceC7920f.mo13194W(19, libraryData.f17257t);
            String str15 = libraryData.f17258u;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str15, 20);
            }
            interfaceC7920f.mo13194W(21, libraryData.f17259v);
            interfaceC7920f.mo13194W(22, libraryData.f17260w);
            interfaceC7920f.mo13194W(23, libraryData.f17261x);
            Integer num2 = libraryData.f17262y;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num2.intValue());
            }
            Integer num3 = libraryData.f17263z;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num3.intValue());
            }
            String str16 = libraryData.f17222A;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(26);
            } else {
                interfaceC7920f.mo13197h0(str16, 26);
            }
            interfaceC7920f.mo13192F0(libraryData.f17223B, 27);
            interfaceC7920f.mo13194W(28, libraryData.f17224C ? 1L : 0L);
            C1421e0 c1421e0 = C1421e0.this;
            c1421e0.f8388c.getClass();
            String strM4991d = C1405c0.m4991d(libraryData.f17225D);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(29);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 29);
            }
            String str17 = libraryData.f17226E;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(30);
            } else {
                interfaceC7920f.mo13197h0(str17, 30);
            }
            c1421e0.f8388c.getClass();
            String strM4991d2 = C1405c0.m4991d(libraryData.f17227F);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(31);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 31);
            }
            Float f3 = libraryData.f17228G;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 32);
            }
            Boolean bool = libraryData.f17229H;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(33);
            } else {
                interfaceC7920f.mo13194W(33, numValueOf.intValue());
            }
            String str18 = libraryData.f17230I;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(34);
            } else {
                interfaceC7920f.mo13197h0(str18, 34);
            }
            String str19 = libraryData.f17231J;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(35);
            } else {
                interfaceC7920f.mo13197h0(str19, 35);
            }
            String str20 = libraryData.f17232K;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str20, 36);
            }
            interfaceC7920f.mo13192F0(libraryData.f17233L, 37);
            interfaceC7920f.mo13192F0(libraryData.f17234M, 38);
            interfaceC7920f.mo13194W(39, libraryData.f17235N ? 1L : 0L);
            interfaceC7920f.mo13194W(40, libraryData.f17236O ? 1L : 0L);
            String str21 = libraryData.f17237P;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str21, 41);
            }
            MediaSource mediaSource = libraryData.f17244g;
            if (mediaSource != null) {
                String str22 = mediaSource.f17293a;
                if (str22 == null) {
                    interfaceC7920f.mo13193J0(42);
                } else {
                    interfaceC7920f.mo13197h0(str22, 42);
                }
                String str23 = mediaSource.f17294b;
                if (str23 == null) {
                    interfaceC7920f.mo13193J0(43);
                } else {
                    interfaceC7920f.mo13197h0(str23, 43);
                }
                String str24 = mediaSource.f17295c;
                if (str24 == null) {
                    interfaceC7920f.mo13193J0(44);
                } else {
                    interfaceC7920f.mo13197h0(str24, 44);
                }
            } else {
                interfaceC7920f.mo13193J0(42);
                interfaceC7920f.mo13193J0(43);
                interfaceC7920f.mo13193J0(44);
            }
            interfaceC7920f.mo13194W(45, libraryData.f17238a);
            if (str == null) {
                interfaceC7920f.mo13193J0(46);
            } else {
                interfaceC7920f.mo13197h0(str, 46);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `CoursesAndLanguageJoin` (`pk`,`language`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8792f c8792f = (C8792f) obj;
            interfaceC7920f.mo13194W(1, c8792f.f46638a);
            String str = c8792f.f46639b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `CoursesAndLanguageJoin` SET `pk` = ?,`language` = ? WHERE `pk` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8792f c8792f = (C8792f) obj;
            interfaceC7920f.mo13194W(1, c8792f.f46638a);
            String str = c8792f.f46639b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8792f.f46638a);
            if (str == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `CourseAndCardsJoin` (`pk`,`termWithLanguage`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8791e c8791e = (C8791e) obj;
            interfaceC7920f.mo13194W(1, c8791e.f46636a);
            String str = c8791e.f46637b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$m */
    public class m extends AbstractC6583c {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `CourseAndCardsJoin` SET `pk` = ?,`termWithLanguage` = ? WHERE `pk` = ? AND `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8791e c8791e = (C8791e) obj;
            interfaceC7920f.mo13194W(1, c8791e.f46636a);
            String str = c8791e.f46637b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8791e.f46636a);
            if (str == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e0$n */
    public class n extends AbstractC6583c {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `CourseForImport` (`language`,`pk`,`title`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            CourseForImport courseForImport = (CourseForImport) obj;
            String str = courseForImport.f16944a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, courseForImport.f16945b);
            String str2 = courseForImport.f16946c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
        }
    }

    public C1421e0(RoomDatabase roomDatabase) {
        this.f8386a = roomDatabase;
        new e(roomDatabase);
        new g(roomDatabase);
        this.f8387b = new C0322j(new h(roomDatabase), new i(roomDatabase));
        this.f8389d = new C0322j(new j(roomDatabase), new k(roomDatabase));
        this.f8390e = new C0322j(new l(roomDatabase), new m(roomDatabase));
        this.f8391f = new C0322j(new n(roomDatabase), new a(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8386a, new CallableC1429f0(this, (LibraryData) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends LibraryData> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8386a, new b((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: k0 */
    public final Object mo5015k0(int i10, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LibraryData WHERE id = ? AND type = 'collection'", 1);
        return C1185b.m4581c(this.f8386a, false, C0141b.m610f(c6595oM13191l, 1, i10), new CallableC1445h0(this, c6595oM13191l), continuationImpl);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5016l0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT LibraryData.id, LibraryData.title\n    FROM LibraryData\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId \n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ?\n    ORDER BY courseOrder ASC", 3);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4579a(this.f8386a, true, new String[]{"LibraryData", "CoursesAndLessonsJoin"}, new CallableC1459j0(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: m0 */
    public final Object mo5017m0(String str, InterfaceC9968c<? super List<UserCourseForImport>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM CourseForImport WHERE language = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8386a, false, new CancellationSignal(), new f(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5018n0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `description`, `pos`, `url`, `imageUrl`, `originalImageUrl`, `price`, `duration`, `collectionId`, `collectionTitle`, `audioUrl`, `listenTimes`, `videoUrl`, `isCourse`, `isCourseLesson` FROM (\n    SELECT DISTINCT LibraryData.*, 0 as isCourse, 1 as isCourseLesson\n    FROM LibraryData\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ?\n    ORDER BY courseOrder ASC)", 3);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4579a(this.f8386a, true, new String[]{"LibraryData", "CoursesAndLessonsJoin"}, new CallableC1466k0(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5019o0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title` FROM (\n        SELECT LibraryData.* FROM LibraryData\n        INNER JOIN CoursesAndLanguageJoin ON CoursesAndLanguageJoin.pk = LibraryData.id\n        WHERE LibraryData.type = ? AND CoursesAndLanguageJoin.language = ?\n        )", 2);
        if (str2 == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str2, 1);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        CallableC1452i0 callableC1452i0 = new CallableC1452i0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8386a, true, new String[]{"LibraryData", "CoursesAndLanguageJoin"}, callableC1452i0);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: p0 */
    public final Object mo5020p0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8386a, new CallableC1437g0(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: q0 */
    public final Object mo5021q0(List<C8791e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8386a, new d(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1413d0
    /* JADX INFO: renamed from: r0 */
    public final Object mo5022r0(List<C8792f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8386a, new c(list), interfaceC9968c);
    }
}
