package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.SharedSQLiteStatement;
import cm.InterfaceC2052l;
import com.lingq.entity.LibraryData;
import com.lingq.entity.MediaSource;
import com.lingq.entity.Playlist;
import com.lingq.shared.persistent.dao.PlaylistDao;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import dm.C5206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import ki.C6698d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.C7915a;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8798l;
import p367rh.C8801o;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560x3 extends PlaylistDao {

    /* JADX INFO: renamed from: H */
    public final d f8935H;

    /* JADX INFO: renamed from: I */
    public final C0322j f8936I;

    /* JADX INFO: renamed from: J */
    public final C0322j f8937J;

    /* JADX INFO: renamed from: K */
    public final C0322j f8938K;

    /* JADX INFO: renamed from: L */
    public final C1405c0 f8939L = new C1405c0();

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8940a;

    /* JADX INFO: renamed from: b */
    public final k f8941b;

    /* JADX INFO: renamed from: c */
    public final q f8942c;

    /* JADX INFO: renamed from: d */
    public final z f8943d;

    /* JADX INFO: renamed from: e */
    public final c0 f8944e;

    /* JADX INFO: renamed from: f */
    public final g0 f8945f;

    /* JADX INFO: renamed from: g */
    public final h0 f8946g;

    /* JADX INFO: renamed from: h */
    public final i0 f8947h;

    /* JADX INFO: renamed from: i */
    public final j0 f8948i;

    /* JADX INFO: renamed from: j */
    public final a f8949j;

    /* JADX INFO: renamed from: k */
    public final b f8950k;

    /* JADX INFO: renamed from: l */
    public final c f8951l;

    /* JADX INFO: renamed from: bi.x3$a */
    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$a0 */
    public class a0 implements Callable<UserPlaylist> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8952a;

        public a0(C6595o c6595o) {
            this.f8952a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final UserPlaylist call() throws Exception {
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            C6595o c6595o = this.f8952a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                UserPlaylist userPlaylist = str;
                if (cursorM16698S0.moveToFirst()) {
                    userPlaylist = new UserPlaylist(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? str : cursorM16698S0.getString(2), cursorM16698S0.getInt(3), cursorM16698S0.getInt(4) != 0, cursorM16698S0.getInt(5) != 0);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return userPlaylist;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$b */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId = ? AND isCourse = 0";
        }
    }

    /* JADX INFO: renamed from: bi.x3$b0 */
    public class b0 implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8954a;

        public b0(C6595o c6595o) {
            this.f8954a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            C6595o c6595o = this.f8954a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
                cursorM16698S0.close();
                c6595o.m13198q();
                return numValueOf;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$c */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM PlaylistAndLessonsJoin WHERE language = ? AND contentId = ? AND isCourse = 1";
        }
    }

    /* JADX INFO: renamed from: bi.x3$c0 */
    public class c0 extends SharedSQLiteStatement {
        public c0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR REPLACE PlaylistAndLessonsJoin SET nameWithLanguage = ? WHERE nameWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$d */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId = ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$d0 */
    public class d0 implements Callable<UserPlaylist> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8956a;

        public d0(C6595o c6595o) {
            this.f8956a = c6595o;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final UserPlaylist call() throws Exception {
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            C6595o c6595o = this.f8956a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                UserPlaylist userPlaylist = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    String string3 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    if (!cursorM16698S0.isNull(2)) {
                        string = cursorM16698S0.getString(2);
                    }
                    userPlaylist = new UserPlaylist(string2, string3, string, cursorM16698S0.getInt(3), cursorM16698S0.getInt(4) != 0, cursorM16698S0.getInt(5) != 0);
                }
                return userPlaylist;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Playlist` (`nameWithLanguage`,`language`,`name`,`pk`,`isDefault`,`isFeatured`,`order`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Playlist playlist = (Playlist) obj;
            String str = playlist.f17349a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = playlist.f17350b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = playlist.f17351c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, playlist.f17352d);
            interfaceC7920f.mo13194W(5, playlist.f17353e ? 1L : 0L);
            interfaceC7920f.mo13194W(6, playlist.f17354f ? 1L : 0L);
            interfaceC7920f.mo13194W(7, playlist.f17355g);
        }
    }

    /* JADX INFO: renamed from: bi.x3$e0 */
    public class e0 implements Callable<UserPlaylist> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8958a;

        public e0(C6595o c6595o) {
            this.f8958a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final UserPlaylist call() throws Exception {
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            C6595o c6595o = this.f8958a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                UserPlaylist userPlaylist = str;
                if (cursorM16698S0.moveToFirst()) {
                    userPlaylist = new UserPlaylist(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? str : cursorM16698S0.getString(2), cursorM16698S0.getInt(3), cursorM16698S0.getInt(4) != 0, cursorM16698S0.getInt(5) != 0);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return userPlaylist;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Playlist` SET `nameWithLanguage` = ?,`language` = ?,`name` = ?,`pk` = ?,`isDefault` = ?,`isFeatured` = ?,`order` = ? WHERE `nameWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Playlist playlist = (Playlist) obj;
            String str = playlist.f17349a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = playlist.f17350b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = playlist.f17351c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, playlist.f17352d);
            interfaceC7920f.mo13194W(5, playlist.f17353e ? 1L : 0L);
            interfaceC7920f.mo13194W(6, playlist.f17354f ? 1L : 0L);
            interfaceC7920f.mo13194W(7, playlist.f17355g);
            String str4 = playlist.f17349a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str4, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$f0 */
    public class f0 implements Callable<List<C6698d>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8960a;

        public f0(C6595o c6595o) {
            this.f8960a = c6595o;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<C6698d> call() throws Exception {
            C6595o c6595o = this.f8960a;
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        boolean z10 = false;
                        int i10 = cursorM16698S0.getInt(0);
                        if (cursorM16698S0.getInt(1) != 0) {
                            z10 = true;
                        }
                        arrayList.add(new C6698d(i10, cursorM16698S0.getInt(2), z10));
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

    /* JADX INFO: renamed from: bi.x3$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `PlaylistAndLessonsJoin` (`nameWithLanguage`,`language`,`contentId`,`order`,`isCourse`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8805s c8805s = (C8805s) obj;
            String str = c8805s.f46673a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8805s.f46674b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, c8805s.f46675c);
            Integer num = c8805s.f46676d;
            if (num == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num.intValue());
            }
            interfaceC7920f.mo13194W(5, c8805s.f46677e ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: bi.x3$g0 */
    public class g0 extends SharedSQLiteStatement {
        public g0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR REPLACE Playlist SET nameWithLanguage = ?, name = ? WHERE nameWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `PlaylistAndLessonsJoin` SET `nameWithLanguage` = ?,`language` = ?,`contentId` = ?,`order` = ?,`isCourse` = ? WHERE `nameWithLanguage` = ? AND `contentId` = ? AND `isCourse` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8805s c8805s = (C8805s) obj;
            String str = c8805s.f46673a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8805s.f46674b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            long j10 = c8805s.f46675c;
            interfaceC7920f.mo13194W(3, j10);
            Integer num = c8805s.f46676d;
            if (num == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num.intValue());
            }
            long j11 = c8805s.f46677e ? 1L : 0L;
            interfaceC7920f.mo13194W(5, j11);
            String str3 = c8805s.f46673a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str3, 6);
            }
            interfaceC7920f.mo13194W(7, j10);
            interfaceC7920f.mo13194W(8, j11);
        }
    }

    /* JADX INFO: renamed from: bi.x3$h0 */
    public class h0 extends SharedSQLiteStatement {
        public h0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Playlist SET pk = ? WHERE nameWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonAudioDownload` (`id`,`language`,`isDownloaded`,`downloadProgress`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
        }
    }

    /* JADX INFO: renamed from: bi.x3$i0 */
    public class i0 extends SharedSQLiteStatement {
        public i0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE PlaylistAndLessonsJoin SET `order` = (`order` - 1) WHERE `order` > ? AND nameWithLanguage= ?";
        }
    }

    /* JADX INFO: renamed from: bi.x3$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonAudioDownload` SET `id` = ?,`language` = ?,`isDownloaded` = ?,`downloadProgress` = ? WHERE `id` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
            interfaceC7920f.mo13194W(5, c8798l.f46652a);
            if (str == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$j0 */
    public class j0 extends SharedSQLiteStatement {
        public j0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LessonAudioDownload";
        }
    }

    /* JADX INFO: renamed from: bi.x3$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR REPLACE INTO `Playlist` (`nameWithLanguage`,`language`,`name`,`pk`,`isDefault`,`isFeatured`,`order`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Playlist playlist = (Playlist) obj;
            String str = playlist.f17349a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = playlist.f17350b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = playlist.f17351c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, playlist.f17352d);
            interfaceC7920f.mo13194W(5, playlist.f17353e ? 1L : 0L);
            interfaceC7920f.mo13194W(6, playlist.f17354f ? 1L : 0L);
            interfaceC7920f.mo13194W(7, playlist.f17355g);
        }
    }

    /* JADX INFO: renamed from: bi.x3$l */
    public class l implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Playlist f8962a;

        public l(Playlist playlist) {
            this.f8962a = playlist;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                c1560x3.f8941b.m13171g(this.f8962a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$m */
    public class m implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Playlist f8964a;

        public m(Playlist playlist) {
            this.f8964a = playlist;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                c1560x3.f8942c.m13169e(this.f8964a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$n */
    public class n implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8966a;

        public n(List list) {
            this.f8966a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                c1560x3.f8943d.m13170f(this.f8966a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$o */
    public class o implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8968a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8969b;

        public o(String str, String str2) {
            this.f8968a = str;
            this.f8969b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            c0 c0Var = c1560x3.f8944e;
            InterfaceC7920f interfaceC7920fM4574a = c0Var.m4574a();
            String str = this.f8968a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            String str2 = this.f8969b;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 2);
            }
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                c0Var.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                c0Var.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$p */
    public class p implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8971a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8972b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8973c;

        public p(String str, String str2, String str3) {
            this.f8971a = str;
            this.f8972b = str2;
            this.f8973c = str3;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            g0 g0Var = c1560x3.f8945f;
            InterfaceC7920f interfaceC7920fM4574a = g0Var.m4574a();
            String str = this.f8971a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            String str2 = this.f8972b;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 2);
            }
            String str3 = this.f8973c;
            if (str3 == null) {
                interfaceC7920fM4574a.mo13193J0(3);
            } else {
                interfaceC7920fM4574a.mo13197h0(str3, 3);
            }
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } finally {
                roomDatabase.m4563n();
                g0Var.m4576c(interfaceC7920fM4574a);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$q */
    public class q extends AbstractC6583c {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Playlist` WHERE `nameWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Playlist) obj).f17349a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$r */
    public class r implements Callable<C9072e> {
        public r() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            j0 j0Var = c1560x3.f8948i;
            InterfaceC7920f interfaceC7920fM4574a = j0Var.m4574a();
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
                j0Var.m4576c(interfaceC7920fM4574a);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$s */
    public class s implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8976a;

        public s(String str) {
            this.f8976a = str;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            a aVar = c1560x3.f8949j;
            InterfaceC7920f interfaceC7920fM4574a = aVar.m4574a();
            String str = this.f8976a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                aVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                aVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$t */
    public class t implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8979b;

        public t(int i10, int i11) {
            this.f8978a = i10;
            this.f8979b = i11;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            d dVar = c1560x3.f8935H;
            InterfaceC7920f interfaceC7920fM4574a = dVar.m4574a();
            interfaceC7920fM4574a.mo13194W(1, this.f8978a);
            interfaceC7920fM4574a.mo13194W(2, this.f8979b);
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } finally {
                roomDatabase.m4563n();
                dVar.m4576c(interfaceC7920fM4574a);
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$u */
    public class u implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8981a;

        public u(List list) {
            this.f8981a = list;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                c1560x3.f8937J.m1226n(this.f8981a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$v */
    public class v extends AbstractC6583c {
        public v(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LessonsWithPlaylistJoin` WHERE `playlistId` = ? AND `contentId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8801o c8801o = (C8801o) obj;
            interfaceC7920f.mo13194W(1, c8801o.f46660a);
            interfaceC7920f.mo13194W(2, c8801o.f46661b);
        }
    }

    /* JADX INFO: renamed from: bi.x3$w */
    public class w implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8798l f8983a;

        public w(C8798l c8798l) {
            this.f8983a = c8798l;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            RoomDatabase roomDatabase2 = c1560x3.f8940a;
            roomDatabase.m4552c();
            try {
                c1560x3.f8938K.m1225m(this.f8983a);
                roomDatabase2.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase2.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase2.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$x */
    public class x implements Callable<LibraryData> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8985a;

        public x(C6595o c6595o) {
            this.f8985a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LibraryData call() throws Exception {
            C6595o c6595o;
            Boolean boolValueOf;
            int i10;
            MediaSource mediaSource;
            C6595o c6595o2 = this.f8985a;
            C1560x3 c1560x3 = C1560x3.this;
            RoomDatabase roomDatabase = c1560x3.f8940a;
            C1405c0 c1405c0 = c1560x3.f8939L;
            roomDatabase.m4552c();
            try {
                try {
                    Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
                    try {
                        int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                        int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "type");
                        int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "title");
                        int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "description");
                        int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "pos");
                        int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "url");
                        int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "imageUrl");
                        int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "providerId");
                        int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "providerName");
                        int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "providerDescription");
                        int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "originalImageUrl");
                        int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "providerImageUrl");
                        c6595o = c6595o2;
                        try {
                            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "sharedById");
                            try {
                                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "sharedByName");
                                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "sharedByImageUrl");
                                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "sharedByRole");
                                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "level");
                                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "lessonsCount");
                                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "owner");
                                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "price");
                                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "duration");
                                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                                int iM16742n27 = C8573r0.m16742n0(cursorM16698S0, "isAvailable");
                                int iM16742n28 = C8573r0.m16742n0(cursorM16698S0, "tags");
                                int iM16742n29 = C8573r0.m16742n0(cursorM16698S0, "status");
                                int iM16742n30 = C8573r0.m16742n0(cursorM16698S0, "folders");
                                int iM16742n31 = C8573r0.m16742n0(cursorM16698S0, "progress");
                                int iM16742n32 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                                int iM16742n33 = C8573r0.m16742n0(cursorM16698S0, "lessonPreview");
                                int iM16742n34 = C8573r0.m16742n0(cursorM16698S0, "accent");
                                int iM16742n35 = C8573r0.m16742n0(cursorM16698S0, "audioUrl");
                                int iM16742n36 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                                int iM16742n37 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                                int iM16742n38 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                                int iM16742n39 = C8573r0.m16742n0(cursorM16698S0, "isFavorite");
                                int iM16742n40 = C8573r0.m16742n0(cursorM16698S0, "videoUrl");
                                int iM16742n41 = C8573r0.m16742n0(cursorM16698S0, "source_type");
                                int iM16742n42 = C8573r0.m16742n0(cursorM16698S0, "source_name");
                                int iM16742n43 = C8573r0.m16742n0(cursorM16698S0, "source_url");
                                LibraryData libraryData = null;
                                String string = null;
                                if (cursorM16698S0.moveToFirst()) {
                                    int i11 = cursorM16698S0.getInt(iM16742n0);
                                    String string2 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                                    String string3 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                                    String string4 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                                    int i12 = cursorM16698S0.getInt(iM16742n4);
                                    String string5 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                                    String string6 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                                    Integer numValueOf = cursorM16698S0.isNull(iM16742n7) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n7));
                                    String string7 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                                    String string8 = cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9);
                                    String string9 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                                    String string10 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                                    String string11 = cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12);
                                    String string12 = cursorM16698S0.isNull(iM16742n13) ? null : cursorM16698S0.getString(iM16742n13);
                                    String string13 = cursorM16698S0.isNull(r19) ? null : cursorM16698S0.getString(iM16742n14);
                                    String string14 = cursorM16698S0.isNull(r20) ? null : cursorM16698S0.getString(iM16742n15);
                                    String string15 = cursorM16698S0.isNull(r21) ? null : cursorM16698S0.getString(iM16742n16);
                                    int i13 = cursorM16698S0.getInt(iM16742n17);
                                    int i14 = cursorM16698S0.getInt(iM16742n18);
                                    String string16 = cursorM16698S0.isNull(iM16742n19) ? null : cursorM16698S0.getString(iM16742n19);
                                    int i15 = cursorM16698S0.getInt(iM16742n20);
                                    int i16 = cursorM16698S0.getInt(iM16742n21);
                                    int i17 = cursorM16698S0.getInt(iM16742n22);
                                    Integer numValueOf2 = cursorM16698S0.isNull(iM16742n23) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n23));
                                    Integer numValueOf3 = cursorM16698S0.isNull(r29) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n24));
                                    String string17 = cursorM16698S0.isNull(r30) ? null : cursorM16698S0.getString(iM16742n25);
                                    double d10 = cursorM16698S0.getDouble(iM16742n26);
                                    boolean z10 = cursorM16698S0.getInt(iM16742n27) != 0;
                                    String string18 = cursorM16698S0.isNull(iM16742n28) ? null : cursorM16698S0.getString(iM16742n28);
                                    c1405c0.getClass();
                                    List listM4992l = C1405c0.m4992l(string18);
                                    String string19 = cursorM16698S0.isNull(iM16742n29) ? null : cursorM16698S0.getString(iM16742n29);
                                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(r35) ? null : cursorM16698S0.getString(iM16742n30));
                                    Float fValueOf = cursorM16698S0.isNull(iM16742n31) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n31));
                                    Integer numValueOf4 = cursorM16698S0.isNull(r37) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n32));
                                    if (numValueOf4 == null) {
                                        boolValueOf = null;
                                    } else {
                                        boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                                    }
                                    String string20 = cursorM16698S0.isNull(r38) ? null : cursorM16698S0.getString(iM16742n33);
                                    String string21 = cursorM16698S0.isNull(r39) ? null : cursorM16698S0.getString(iM16742n34);
                                    String string22 = cursorM16698S0.isNull(r40) ? null : cursorM16698S0.getString(iM16742n35);
                                    double d11 = cursorM16698S0.getDouble(iM16742n36);
                                    double d12 = cursorM16698S0.getDouble(iM16742n37);
                                    boolean z11 = cursorM16698S0.getInt(iM16742n38) != 0;
                                    boolean z12 = cursorM16698S0.getInt(iM16742n39) != 0;
                                    String string23 = cursorM16698S0.isNull(iM16742n40) ? null : cursorM16698S0.getString(iM16742n40);
                                    if (cursorM16698S0.isNull(r46)) {
                                        i10 = iM16742n42;
                                        if (cursorM16698S0.isNull(i10) && cursorM16698S0.isNull(iM16742n43)) {
                                            mediaSource = null;
                                        }
                                        libraryData = new LibraryData(i11, string2, string3, string4, i12, string5, mediaSource, string6, numValueOf, string7, string8, string9, string10, string11, string12, string13, string14, string15, i13, i14, string16, i15, i16, i17, numValueOf2, numValueOf3, string17, d10, z10, listM4992l, string19, listM4992l2, fValueOf, boolValueOf, string20, string21, string22, d11, d12, z11, z12, string23);
                                    } else {
                                        i10 = iM16742n42;
                                    }
                                    String string24 = cursorM16698S0.isNull(r46) ? null : cursorM16698S0.getString(iM16742n41);
                                    String string25 = cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10);
                                    if (!cursorM16698S0.isNull(iM16742n43)) {
                                        string = cursorM16698S0.getString(iM16742n43);
                                    }
                                    mediaSource = new MediaSource(string24, string25, string);
                                    libraryData = new LibraryData(i11, string2, string3, string4, i12, string5, mediaSource, string6, numValueOf, string7, string8, string9, string10, string11, string12, string13, string14, string15, i13, i14, string16, i15, i16, i17, numValueOf2, numValueOf3, string17, d10, z10, listM4992l, string19, listM4992l2, fValueOf, boolValueOf, string20, string21, string22, d11, d12, z11, z12, string23);
                                }
                                roomDatabase.m4568s();
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                roomDatabase.m4563n();
                                return libraryData;
                            } catch (Throwable th2) {
                                th = th2;
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorM16698S0.close();
                            c6595o.m13198q();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c6595o = c6595o2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    roomDatabase.m4563n();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                roomDatabase.m4563n();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: bi.x3$y */
    public class y implements Callable<List<C8805s>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8987a;

        public y(C6595o c6595o) {
            this.f8987a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<C8805s> call() throws Exception {
            C6595o c6595o = this.f8987a;
            RoomDatabase roomDatabase = C1560x3.this.f8940a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "nameWithLanguage");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "language");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "contentId");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "order");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "isCourse");
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        arrayList.add(new C8805s(cursorM16698S0.getInt(iM16742n2), cursorM16698S0.isNull(iM16742n3) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n3)), cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n4) != 0));
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

    /* JADX INFO: renamed from: bi.x3$z */
    public class z extends AbstractC6583c {
        public z(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `PlaylistAndLessonsJoin` SET `nameWithLanguage` = ?,`language` = ?,`contentId` = ?,`order` = ?,`isCourse` = ? WHERE `nameWithLanguage` = ? AND `contentId` = ? AND `isCourse` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8805s c8805s = (C8805s) obj;
            String str = c8805s.f46673a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8805s.f46674b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            long j10 = c8805s.f46675c;
            interfaceC7920f.mo13194W(3, j10);
            Integer num = c8805s.f46676d;
            if (num == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num.intValue());
            }
            long j11 = c8805s.f46677e ? 1L : 0L;
            interfaceC7920f.mo13194W(5, j11);
            String str3 = c8805s.f46673a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str3, 6);
            }
            interfaceC7920f.mo13194W(7, j10);
            interfaceC7920f.mo13194W(8, j11);
        }
    }

    public C1560x3(RoomDatabase roomDatabase) {
        this.f8940a = roomDatabase;
        this.f8941b = new k(roomDatabase);
        this.f8942c = new q(roomDatabase);
        new v(roomDatabase);
        this.f8943d = new z(roomDatabase);
        this.f8944e = new c0(roomDatabase);
        this.f8945f = new g0(roomDatabase);
        this.f8946g = new h0(roomDatabase);
        this.f8947h = new i0(roomDatabase);
        this.f8948i = new j0(roomDatabase);
        this.f8949j = new a(roomDatabase);
        this.f8950k = new b(roomDatabase);
        this.f8951l = new c(roomDatabase);
        this.f8935H = new d(roomDatabase);
        this.f8936I = new C0322j(new e(roomDatabase), new f(roomDatabase));
        this.f8937J = new C0322j(new g(roomDatabase), new h(roomDatabase));
        this.f8938K = new C0322j(new i(roomDatabase), new j(roomDatabase));
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: A0 */
    public final Object mo5187A0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `order` FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? ORDER BY `order` DESC LIMIT 1", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new CallableC1519r4(this, c6595oM13191l), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: B0 */
    public final Object mo5188B0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownload WHERE language = ? AND id = ?)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, C0141b.m610f(c6595oM13191l, 2, i10), new CallableC1547v4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: C0 */
    public final Object mo5189C0(String str, InterfaceC9968c<? super List<C6698d>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownload WHERE language = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, true, new CancellationSignal(), new f0(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: D0 */
    public final Object mo5190D0(String str, ArrayList arrayList, String str2, InterfaceC9968c interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(")");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 2);
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
        Iterator it = arrayList.iterator();
        int i10 = 3;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        return C1185b.m4581c(this.f8940a, true, new CancellationSignal(), new CallableC1441g4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: E0 */
    public final Object mo5191E0(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE language = ? AND pk NOT IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append("))");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        return C1185b.m4581c(this.f8940a, true, new CancellationSignal(), new CallableC1491n4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: F0 */
    public final Object mo5192F0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Playlist WHERE language = ? AND pk = ?", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, C0141b.m610f(c6595oM13191l, 2, i10), new CallableC1512q4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: G0 */
    public final Object mo5193G0(int i10, InterfaceC9968c<? super UserPlaylist> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE Playlist.pk = ?)", 1);
        return C1185b.m4581c(this.f8940a, false, C0141b.m610f(c6595oM13191l, 1, i10), new d0(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: H0 */
    public final Object mo5194H0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Playlist WHERE nameWithLanguage = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new CallableC1505p4(this, c6595oM13191l), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: I0 */
    public final Object mo5195I0(int i10, String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM PlaylistAndLessonsJoin WHERE contentId = ? AND nameWithLanguage = ? AND isCourse = 1", 2);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        return C1185b.m4581c(this.f8940a, true, new CancellationSignal(), new CallableC1425e4(this, c6595oM13191l), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: J0 */
    public final Object mo5196J0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (\n    SELECT Playlist.* FROM Playlist, LessonsWithPlaylistJoin \n    WHERE Playlist.pk == LessonsWithPlaylistJoin.playlistId \n    AND LessonsWithPlaylistJoin.contentId = ? AND Playlist.language =  ?)", 2);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new CallableC1498o4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: K0 */
    public final Object mo5197K0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT Playlist.pk FROM Playlist, LessonsWithPlaylistJoin \n    WHERE Playlist.pk == LessonsWithPlaylistJoin.playlistId \n    AND LessonsWithPlaylistJoin.contentId = ? AND Playlist.language =  ? AND Playlist.nameWithLanguage = ?", 3);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str2, 3);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new CallableC1463j4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: L0 */
    public final Object mo5198L0(int i10, InterfaceC9968c<? super LibraryData> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LibraryData WHERE id = ? AND LibraryData.type = 'content'", 1);
        return C1185b.m4581c(this.f8940a, true, C0141b.m610f(c6595oM13191l, 1, i10), new x(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: M0 */
    public final Object mo5199M0(int i10, String str, InterfaceC9968c<? super List<C8805s>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM PlaylistAndLessonsJoin WHERE `order` = ? AND nameWithLanguage = ?", 2);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        return C1185b.m4581c(this.f8940a, true, new CancellationSignal(), new y(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: N0 */
    public final Object mo5200N0(InterfaceC9968c<? super Integer> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `order` FROM Playlist ORDER BY `order` DESC LIMIT 1", 0);
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new b0(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: O0 */
    public final Object mo5201O0(String str, InterfaceC9968c<? super UserPlaylist> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE nameWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new e0(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: P0 */
    public final Object mo5202P0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE language = ? AND pk = ?)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, C0141b.m610f(c6595oM13191l, 2, i10), new CallableC1526s4(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: Q0 */
    public final Object mo5203Q0(Playlist playlist, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new l(playlist), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: R0 */
    public final Object mo5204R0(C8805s c8805s, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8940a, new CallableC1417d4(this, c8805s), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: S0 */
    public final Object mo5205S0(C8798l c8798l, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new w(c8798l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: T0 */
    public final Object mo5206T0(List<C8805s> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new u(list), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: U0 */
    public final Object mo5207U0(int i10, String str, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8940a, new CallableC1574z3(i10, this, str), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: V0 */
    public final Object mo5208V0(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new p(str, str3, str2), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: W0 */
    public final Object mo5209W0(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new o(str, str2), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: X0 */
    public final Object mo5210X0(List<C8805s> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new n(list), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: Y0 */
    public final Object mo5211Y0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new CallableC1567y3(i10, this, str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: Z0 */
    public final Object mo5212Z0(final String str, final String str2, final String str3, ContinuationImpl continuationImpl) {
        return RoomDatabaseKt.m4573a(this.f8940a, new InterfaceC2052l() { // from class: bi.w3
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C1560x3 c1560x3 = this.f8918a;
                c1560x3.getClass();
                return PlaylistDao.m9474a1(c1560x3, str, str2, str3, (InterfaceC9968c) obj);
            }
        }, continuationImpl);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new CallableC1409c4(this, (Playlist) obj), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: k0 */
    public final Object mo5213k0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new r(), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: l0 */
    public final Object mo5214l0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new t(i10, i11), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: m0 */
    public final Object mo5215m0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new CallableC1401b4(i10, this, str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: n0 */
    public final Object mo5216n0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new CallableC1393a4(i10, this, str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: o0 */
    public final Object mo5217o0(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new CallableC1554w4(this, arrayList, str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: p0 */
    public final Object mo5218p0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new s(str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: q0 */
    public final C7136q mo5219q0(C7915a c7915a) {
        CallableC1561x4 callableC1561x4 = new CallableC1561x4(this, c7915a);
        return C1185b.m4579a(this.f8940a, true, new String[]{"LibraryData"}, callableC1561x4);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: r */
    public final Object mo603r(Playlist playlist, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8940a, new m(playlist), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: r0 */
    public final C7136q mo5220r0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownload WHERE language = ? AND id = ?)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8940a, false, new String[]{"LessonAudioDownload"}, new CallableC1540u4(this, c6595oM13191l));
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: s0 */
    public final C7136q mo5221s0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownload WHERE language = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1533t4 callableC1533t4 = new CallableC1533t4(this, c6595oM13191l);
        return C1185b.m4579a(this.f8940a, true, new String[]{"LessonAudioDownload"}, callableC1533t4);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: t0 */
    public final C7136q mo5222t0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (\n    SELECT Playlist.* FROM LessonsWithPlaylistJoin, Playlist \n    WHERE Playlist.pk =  LessonsWithPlaylistJoin.playlistId\n    AND Playlist.language = ? AND LessonsWithPlaylistJoin.contentId = ?)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8940a, true, new String[]{"LessonsWithPlaylistJoin", "Playlist"}, new CallableC1477l4(this, c6595oM13191l));
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: u0 */
    public final C7136q mo5223u0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `description`, `pos`, `url`, `imageUrl`, `originalImageUrl`, `price`, `duration`, `collectionId`, `collectionTitle`, `audioUrl`, `listenTimes`, `videoUrl`, `language`, `isCourse`, `isCourseLesson`, `playlistLessonOrder` FROM (\n    SELECT DISTINCT LibraryData.*, PlaylistAndLessonsJoin.*, 0 as isCourseLesson,\n    PlaylistAndLessonsJoin.`order` as playlistLessonOrder FROM LibraryData, Playlist\n    INNER JOIN PlaylistAndLessonsJoin ON LibraryData.id = PlaylistAndLessonsJoin.contentId\n    AND Playlist.nameWithLanguage = PlaylistAndLessonsJoin.nameWithLanguage\n    WHERE Playlist.nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 0 AND LibraryData.type = 'content'\n    ORDER BY playlistLessonOrder\n    )", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1433f4 callableC1433f4 = new CallableC1433f4(this, c6595oM13191l);
        return C1185b.m4579a(this.f8940a, true, new String[]{"LibraryData", "Playlist", "PlaylistAndLessonsJoin"}, callableC1433f4);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: v0 */
    public final C7136q mo5224v0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT contentId FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 1", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1456i4 callableC1456i4 = new CallableC1456i4(this, c6595oM13191l);
        return C1185b.m4579a(this.f8940a, true, new String[]{"PlaylistAndLessonsJoin"}, callableC1456i4);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: w0 */
    public final C7136q mo5225w0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT LibraryData.id, LibraryData.title, PlaylistAndLessonsJoin.`order` FROM Playlist, LibraryData\n    INNER JOIN PlaylistAndLessonsJoin ON LibraryData.id = PlaylistAndLessonsJoin.contentId\n    AND Playlist.nameWithLanguage = PlaylistAndLessonsJoin.nameWithLanguage\n    WHERE Playlist.nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 1 AND LibraryData.type = 'collection'\n    ORDER BY PlaylistAndLessonsJoin.`order` ASC", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1449h4 callableC1449h4 = new CallableC1449h4(this, c6595oM13191l);
        return C1185b.m4579a(this.f8940a, true, new String[]{"Playlist", "LibraryData", "PlaylistAndLessonsJoin"}, callableC1449h4);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: x0 */
    public final C7136q mo5226x0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT COUNT(*) FROM LessonsWithPlaylistJoin WHERE language = ? AND contentId = ?", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8940a, false, new String[]{"LessonsWithPlaylistJoin"}, new CallableC1470k4(this, c6595oM13191l));
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: y0 */
    public final C7136q mo5227y0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE language = ? ORDER BY `order`)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1484m4 callableC1484m4 = new CallableC1484m4(this, c6595oM13191l);
        return C1185b.m4579a(this.f8940a, true, new String[]{"Playlist"}, callableC1484m4);
    }

    @Override // com.lingq.shared.persistent.dao.PlaylistDao
    /* JADX INFO: renamed from: z0 */
    public final Object mo5228z0(String str, InterfaceC9968c<? super UserPlaylist> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM Playlist WHERE language = ? AND isDefault = 1 ORDER BY `order` LIMIT 1)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8940a, false, new CancellationSignal(), new a0(c6595oM13191l), interfaceC9968c);
    }
}
