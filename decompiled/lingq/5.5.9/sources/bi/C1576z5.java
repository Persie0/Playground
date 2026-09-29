package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.Readings;
import com.lingq.entity.Word;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import dm.C5206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import li.C7378e;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8808v;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1576z5 extends AbstractC1562x5 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f9019a;

    /* JADX INFO: renamed from: b */
    public final e f9020b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f9021c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f9022d;

    /* JADX INFO: renamed from: bi.z5$a */
    public class a implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f9023a;

        public a(List list) {
            this.f9023a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1576z5 c1576z5 = C1576z5.this;
            RoomDatabase roomDatabase = c1576z5.f9019a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1576z5.f9022d.m1228p(this.f9023a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$b */
    public class b implements Callable<C8808v> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f9025a;

        public b(C6595o c6595o) {
            this.f9025a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C8808v call() throws Exception {
            C1576z5 c1576z5 = C1576z5.this;
            RoomDatabase roomDatabase = c1576z5.f9019a;
            C1405c0 c1405c0 = c1576z5.f9021c;
            C6595o c6595o = this.f9025a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                C8808v c8808v = str;
                if (cursorM16698S0.moveToFirst()) {
                    c8808v = new C8808v(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getInt(1), cursorM16698S0.getInt(3), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), C1405c0.m4992l(cursorM16698S0.isNull(5) ? str : cursorM16698S0.getString(5)), c1405c0.m5002m(cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4)));
                }
                return c8808v;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$c */
    public class c implements Callable<C7378e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f9027a;

        public c(C6595o c6595o) {
            this.f9027a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final C7378e call() throws Exception {
            C7378e c7378e;
            TokenReadings tokenReadings;
            C1576z5 c1576z5 = C1576z5.this;
            RoomDatabase roomDatabase = c1576z5.f9019a;
            C1405c0 c1405c0 = c1576z5.f9021c;
            C6595o c6595o = this.f9027a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                if (cursorM16698S0.moveToFirst()) {
                    String string = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    int i10 = cursorM16698S0.getInt(1);
                    String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    int i11 = cursorM16698S0.getInt(3);
                    boolean z10 = cursorM16698S0.getInt(4) != 0;
                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7));
                    if (cursorM16698S0.isNull(8) && cursorM16698S0.isNull(9) && cursorM16698S0.isNull(10) && cursorM16698S0.isNull(11) && cursorM16698S0.isNull(12)) {
                        tokenReadings = null;
                    } else {
                        tokenReadings = new TokenReadings(C1405c0.m4992l(cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8)), C1405c0.m4992l(cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9)), C1405c0.m4992l(cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10)), C1405c0.m4992l(cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11)), C1405c0.m4992l(cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12)), null);
                    }
                    c7378e = new C7378e(string, z10, listM4992l, listM4992l2, listM5007r, i11, i10, string2, tokenReadings);
                } else {
                    c7378e = null;
                }
                return c7378e;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Word` WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Word) obj).f17576a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `Word` SET `termWithLanguage` = ?,`id` = ?,`importance` = ?,`status` = ?,`tags` = ?,`meanings` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8808v c8808v = (C8808v) obj;
            String str = c8808v.f46683a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c8808v.f46684b);
            interfaceC7920f.mo13194W(3, c8808v.f46685c);
            String str2 = c8808v.f46686d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            C1576z5 c1576z5 = C1576z5.this;
            c1576z5.f9021c.getClass();
            String strM4991d = C1405c0.m4991d(c8808v.f46687e);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            interfaceC7920f.mo13197h0(c1576z5.f9021c.m4995e(c8808v.f46688f), 6);
            String str3 = c8808v.f46683a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str3, 7);
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$f */
    public class f extends SharedSQLiteStatement {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM Word WHERE termWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.z5$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Word` (`termWithLanguage`,`term`,`id`,`status`,`importance`,`isPhrase`,`meanings`,`tags`,`gTags`,`cardId`,`romaji`,`hiragana`,`pinyin`,`hant`,`hans`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Word word = (Word) obj;
            String str = word.f17576a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = word.f17577b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, word.f17578c);
            String str3 = word.f17579d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, word.f17580e);
            interfaceC7920f.mo13194W(6, word.f17581f ? 1L : 0L);
            C1576z5 c1576z5 = C1576z5.this;
            interfaceC7920f.mo13197h0(c1576z5.f9021c.m4995e(word.f17582g), 7);
            c1576z5.f9021c.getClass();
            String strM4991d = C1405c0.m4991d(word.f17583h);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 8);
            }
            String strM4991d2 = C1405c0.m4991d(word.f17584i);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 9);
            }
            interfaceC7920f.mo13194W(10, word.f17586k);
            Readings readings = word.f17585j;
            if (readings == null) {
                interfaceC7920f.mo13193J0(11);
                interfaceC7920f.mo13193J0(12);
                interfaceC7920f.mo13193J0(13);
                interfaceC7920f.mo13193J0(14);
                interfaceC7920f.mo13193J0(15);
                return;
            }
            String strM4991d3 = C1405c0.m4991d(readings.f17371a);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 11);
            }
            String strM4991d4 = C1405c0.m4991d(readings.f17372b);
            if (strM4991d4 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(strM4991d4, 12);
            }
            String strM4991d5 = C1405c0.m4991d(readings.f17373c);
            if (strM4991d5 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(strM4991d5, 13);
            }
            String strM4991d6 = C1405c0.m4991d(readings.f17374d);
            if (strM4991d6 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(strM4991d6, 14);
            }
            String strM4991d7 = C1405c0.m4991d(readings.f17375e);
            if (strM4991d7 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d7, 15);
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Word` SET `termWithLanguage` = ?,`term` = ?,`id` = ?,`status` = ?,`importance` = ?,`isPhrase` = ?,`meanings` = ?,`tags` = ?,`gTags` = ?,`cardId` = ?,`romaji` = ?,`hiragana` = ?,`pinyin` = ?,`hant` = ?,`hans` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Word word = (Word) obj;
            String str = word.f17576a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = word.f17577b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, word.f17578c);
            String str3 = word.f17579d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, word.f17580e);
            interfaceC7920f.mo13194W(6, word.f17581f ? 1L : 0L);
            C1576z5 c1576z5 = C1576z5.this;
            interfaceC7920f.mo13197h0(c1576z5.f9021c.m4995e(word.f17582g), 7);
            c1576z5.f9021c.getClass();
            String strM4991d = C1405c0.m4991d(word.f17583h);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 8);
            }
            String strM4991d2 = C1405c0.m4991d(word.f17584i);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 9);
            }
            interfaceC7920f.mo13194W(10, word.f17586k);
            Readings readings = word.f17585j;
            if (readings != null) {
                String strM4991d3 = C1405c0.m4991d(readings.f17371a);
                if (strM4991d3 == null) {
                    interfaceC7920f.mo13193J0(11);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d3, 11);
                }
                String strM4991d4 = C1405c0.m4991d(readings.f17372b);
                if (strM4991d4 == null) {
                    interfaceC7920f.mo13193J0(12);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d4, 12);
                }
                String strM4991d5 = C1405c0.m4991d(readings.f17373c);
                if (strM4991d5 == null) {
                    interfaceC7920f.mo13193J0(13);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d5, 13);
                }
                String strM4991d6 = C1405c0.m4991d(readings.f17374d);
                if (strM4991d6 == null) {
                    interfaceC7920f.mo13193J0(14);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d6, 14);
                }
                String strM4991d7 = C1405c0.m4991d(readings.f17375e);
                if (strM4991d7 == null) {
                    interfaceC7920f.mo13193J0(15);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d7, 15);
                }
            } else {
                interfaceC7920f.mo13193J0(11);
                interfaceC7920f.mo13193J0(12);
                interfaceC7920f.mo13193J0(13);
                interfaceC7920f.mo13193J0(14);
                interfaceC7920f.mo13193J0(15);
            }
            String str4 = word.f17576a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str4, 16);
            }
        }
    }

    /* JADX INFO: renamed from: bi.z5$i */
    public class i implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8808v f9032a;

        public i(C8808v c8808v) {
            this.f9032a = c8808v;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1576z5 c1576z5 = C1576z5.this;
            RoomDatabase roomDatabase = c1576z5.f9019a;
            roomDatabase.m4552c();
            try {
                c1576z5.f9020b.m13169e(this.f9032a);
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

    /* JADX INFO: renamed from: bi.z5$j */
    public class j implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f9034a;

        public j(List list) {
            this.f9034a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1576z5 c1576z5 = C1576z5.this;
            RoomDatabase roomDatabase = c1576z5.f9019a;
            roomDatabase.m4552c();
            try {
                c1576z5.f9020b.m13170f(this.f9034a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    public C1576z5(RoomDatabase roomDatabase) {
        this.f9019a = roomDatabase;
        new d(roomDatabase);
        this.f9020b = new e(roomDatabase);
        new f(roomDatabase);
        this.f9022d = new C0322j(new g(roomDatabase), new h(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f9019a, new CallableC1569y5(this, (Word) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Word> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f9019a, new a(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5229k0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans` FROM (SELECT * FROM Word WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND status = 'new')");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 0);
        Iterator it = arrayList.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13197h0(str, i10);
            }
            i10++;
        }
        return C1185b.m4579a(this.f9019a, true, new String[]{"Word"}, new CallableC1419d6(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5230l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans` FROM (SELECT * FROM Word WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1403b6 callableC1403b6 = new CallableC1403b6(this, c6595oM13191l);
        return C1185b.m4579a(this.f9019a, false, new String[]{"Word"}, callableC1403b6);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo5231m0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT Count(*) FROM Word WHERE termWithLanguage = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1443g6 callableC1443g6 = new CallableC1443g6(this, c6595oM13191l);
        return C1185b.m4579a(this.f9019a, false, new String[]{"Word"}, callableC1443g6);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5232n0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT DISTINCT * FROM Word JOIN LessonsAndWordsJoin ON contentId = ? AND Word.termWithLanguage = LessonsAndWordsJoin.termWithLanguage", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f9019a, true, new String[]{"Word", "LessonsAndWordsJoin"}, new CallableC1435f6(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5233o0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `status`, `meanings`, `tags`, `gTags` FROM (SELECT * FROM Word WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append("))");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 0);
        Iterator it = arrayList.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13197h0(str, i10);
            }
            i10++;
        }
        return C1185b.m4579a(this.f9019a, true, new String[]{"Word"}, new CallableC1411c6(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: p0 */
    public final Object mo5234p0(String str, InterfaceC9968c<? super C7378e> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans` FROM (SELECT * FROM Word WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f9019a, false, new CancellationSignal(), new c(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: q0 */
    public final Object mo5235q0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Word WHERE termWithLanguage = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f9019a, false, new CancellationSignal(), new CallableC1395a6(this, c6595oM13191l), continuationImpl);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: r0 */
    public final Object mo5236r0(String str, InterfaceC9968c<? super C8808v> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `termWithLanguage`, `id`, `status`, `importance`, `meanings`, `tags` FROM (SELECT * FROM Word WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f9019a, false, new CancellationSignal(), new b(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: s0 */
    public final Object mo5237s0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans` FROM (SELECT * FROM Word WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND status = 'new')");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 0);
        Iterator it = arrayList.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13197h0(str, i10);
            }
            i10++;
        }
        return C1185b.m4581c(this.f9019a, true, new CancellationSignal(), new CallableC1427e6(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: t0 */
    public final Object mo5238t0(C8808v c8808v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f9019a, new i(c8808v), interfaceC9968c);
    }

    @Override // bi.AbstractC1562x5
    /* JADX INFO: renamed from: u0 */
    public final Object mo5239u0(List<C8808v> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f9019a, new j(list), interfaceC9968c);
    }
}
