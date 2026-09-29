package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Card;
import com.lingq.entity.LessonTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p264mi.C7566f;
import p288o4.C7915a;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8787a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527s5 extends AbstractC1520r5 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8829a;

    /* JADX INFO: renamed from: b */
    public final C1405c0 f8830b = new C1405c0();

    /* JADX INFO: renamed from: c */
    public final C0322j f8831c;

    /* JADX INFO: renamed from: bi.s5$a */
    public class a implements Callable<List<C7566f>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8832a;

        public a(C6595o c6595o) {
            this.f8832a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<C7566f> call() throws Exception {
            C6595o c6595o = this.f8832a;
            C1527s5 c1527s5 = C1527s5.this;
            RoomDatabase roomDatabase = c1527s5.f8829a;
            C1405c0 c1405c0 = c1527s5.f8830b;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                        int i10 = cursorM16698S0.getInt(1);
                        int i11 = cursorM16698S0.getInt(2);
                        int i12 = cursorM16698S0.getInt(3);
                        String string3 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                        List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                        List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                        if (!cursorM16698S0.isNull(7)) {
                            string = cursorM16698S0.getString(7);
                        }
                        arrayList.add(new C7566f(i10, string2, i11, i12, cursorM16698S0.getInt(8) != 0, listM5007r, null, string3, listM4992l, C1405c0.m4992l(string)));
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

    /* JADX INFO: renamed from: bi.s5$b */
    public class b implements Callable<List<C7566f>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8834a;

        public b(C6595o c6595o) {
            this.f8834a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<C7566f> call() throws Exception {
            C6595o c6595o = this.f8834a;
            C1527s5 c1527s5 = C1527s5.this;
            RoomDatabase roomDatabase = c1527s5.f8829a;
            C1405c0 c1405c0 = c1527s5.f8830b;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                        int i10 = cursorM16698S0.getInt(1);
                        int i11 = cursorM16698S0.getInt(2);
                        int i12 = cursorM16698S0.getInt(3);
                        String string3 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                        List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                        List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                        if (!cursorM16698S0.isNull(7)) {
                            string = cursorM16698S0.getString(7);
                        }
                        arrayList.add(new C7566f(i10, string2, i11, i12, cursorM16698S0.getInt(8) != 0, listM5007r, null, string3, listM4992l, C1405c0.m4992l(string)));
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

    /* JADX INFO: renamed from: bi.s5$c */
    public class c implements Callable<List<C7566f>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8836a;

        public c(C6595o c6595o) {
            this.f8836a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<C7566f> call() throws Exception {
            C6595o c6595o = this.f8836a;
            C1527s5 c1527s5 = C1527s5.this;
            RoomDatabase roomDatabase = c1527s5.f8829a;
            C1405c0 c1405c0 = c1527s5.f8830b;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                        int i10 = cursorM16698S0.getInt(1);
                        int i11 = cursorM16698S0.getInt(2);
                        int i12 = cursorM16698S0.getInt(3);
                        String string3 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                        List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                        List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                        if (!cursorM16698S0.isNull(7)) {
                            string = cursorM16698S0.getString(7);
                        }
                        arrayList.add(new C7566f(i10, string2, i11, i12, cursorM16698S0.getInt(8) != 0, listM5007r, null, string3, listM4992l, C1405c0.m4992l(string)));
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

    /* JADX INFO: renamed from: bi.s5$d */
    public class d implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8838a;

        public d(List list) {
            this.f8838a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            StringBuilder sbM771r = C0166e.m771r("UPDATE Card SET srsDueDate = NULL WHERE id IN (");
            List<Integer> list = this.f8838a;
            C5206f.m11021s0(list.size(), sbM771r);
            sbM771r.append(")");
            String string = sbM771r.toString();
            C1527s5 c1527s5 = C1527s5.this;
            InterfaceC7920f interfaceC7920fM4555f = c1527s5.f8829a.m4555f(string);
            int i10 = 1;
            for (Integer num : list) {
                if (num == null) {
                    interfaceC7920fM4555f.mo13193J0(i10);
                } else {
                    interfaceC7920fM4555f.mo13194W(i10, num.intValue());
                }
                i10++;
            }
            RoomDatabase roomDatabase = c1527s5.f8829a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4555f.mo15736A();
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

    /* JADX INFO: renamed from: bi.s5$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Card` WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Card) obj).f16855b;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.s5$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `Card` SET `id` = ?,`termWithLanguage` = ?,`status` = ?,`extendedStatus` = ?,`tags` = ?,`gTags` = ?,`notes` = ?,`meanings` = ?,`meaningTerms` = ?,`srsDueDate` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8787a c8787a = (C8787a) obj;
            interfaceC7920f.mo13194W(1, c8787a.f46587a);
            String str = c8787a.f46588b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8787a.f46589c);
            Integer num = c8787a.f46590d;
            if (num == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num.intValue());
            }
            C1527s5 c1527s5 = C1527s5.this;
            C1405c0 c1405c0 = c1527s5.f8830b;
            List<String> list = c8787a.f46591e;
            c1405c0.getClass();
            String strM4991d = C1405c0.m4991d(list);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            C1405c0 c1405c1 = c1527s5.f8830b;
            c1405c1.getClass();
            String strM4991d2 = C1405c0.m4991d(c8787a.f46592f);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 6);
            }
            String str2 = c8787a.f46593g;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str2, 7);
            }
            interfaceC7920f.mo13197h0(c1405c1.m4995e(c8787a.f46594h), 8);
            String str3 = c8787a.f46595i;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str3, 9);
            }
            String str4 = c8787a.f46596j;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str4, 10);
            }
            if (str == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str, 11);
            }
        }
    }

    /* JADX INFO: renamed from: bi.s5$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Card` (`term`,`termWithLanguage`,`id`,`url`,`fragment`,`status`,`extendedStatus`,`lastReviewedCorrect`,`srsDueDate`,`notes`,`audio`,`importance`,`meanings`,`meaningTerms`,`tags`,`gTags`,`words`,`isPhrase`,`hiragana`,`romaji`,`pinyin`,`hant`,`hans`,`jyutping`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Card card = (Card) obj;
            String str = card.f16854a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = card.f16855b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, card.f16856c);
            String str3 = card.f16857d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = card.f16858e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            interfaceC7920f.mo13194W(6, card.f16859f);
            Integer num = card.f16860g;
            if (num == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13194W(7, num.intValue());
            }
            String str5 = card.f16861h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = card.f16862i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = card.f16863j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = card.f16864k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            interfaceC7920f.mo13194W(12, card.f16865l);
            C1527s5 c1527s5 = C1527s5.this;
            interfaceC7920f.mo13197h0(c1527s5.f8830b.m4995e(card.f16866m), 13);
            String str9 = card.f16867n;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str9, 14);
            }
            c1527s5.f8830b.getClass();
            String strM4991d = C1405c0.m4991d(card.f16868o);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 15);
            }
            String strM4991d2 = C1405c0.m4991d(card.f16869p);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 16);
            }
            String strM4991d3 = C1405c0.m4991d(card.f16870q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 17);
            }
            interfaceC7920f.mo13194W(18, card.f16872s ? 1L : 0L);
            LessonTransliteration lessonTransliteration = card.f16871r;
            if (lessonTransliteration == null) {
                interfaceC7920f.mo13193J0(19);
                interfaceC7920f.mo13193J0(20);
                interfaceC7920f.mo13193J0(21);
                interfaceC7920f.mo13193J0(22);
                interfaceC7920f.mo13193J0(23);
                interfaceC7920f.mo13193J0(24);
                return;
            }
            String str10 = lessonTransliteration.f17179a;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(19);
            } else {
                interfaceC7920f.mo13197h0(str10, 19);
            }
            String str11 = lessonTransliteration.f17180b;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str11, 20);
            }
            String str12 = lessonTransliteration.f17181c;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(21);
            } else {
                interfaceC7920f.mo13197h0(str12, 21);
            }
            String str13 = lessonTransliteration.f17182d;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(22);
            } else {
                interfaceC7920f.mo13197h0(str13, 22);
            }
            String str14 = lessonTransliteration.f17183e;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(23);
            } else {
                interfaceC7920f.mo13197h0(str14, 23);
            }
            String str15 = lessonTransliteration.f17184f;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13197h0(str15, 24);
            }
        }
    }

    /* JADX INFO: renamed from: bi.s5$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Card` SET `term` = ?,`termWithLanguage` = ?,`id` = ?,`url` = ?,`fragment` = ?,`status` = ?,`extendedStatus` = ?,`lastReviewedCorrect` = ?,`srsDueDate` = ?,`notes` = ?,`audio` = ?,`importance` = ?,`meanings` = ?,`meaningTerms` = ?,`tags` = ?,`gTags` = ?,`words` = ?,`isPhrase` = ?,`hiragana` = ?,`romaji` = ?,`pinyin` = ?,`hant` = ?,`hans` = ?,`jyutping` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Card card = (Card) obj;
            String str = card.f16854a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = card.f16855b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, card.f16856c);
            String str3 = card.f16857d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = card.f16858e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            interfaceC7920f.mo13194W(6, card.f16859f);
            Integer num = card.f16860g;
            if (num == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13194W(7, num.intValue());
            }
            String str5 = card.f16861h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = card.f16862i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = card.f16863j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = card.f16864k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            interfaceC7920f.mo13194W(12, card.f16865l);
            C1527s5 c1527s5 = C1527s5.this;
            interfaceC7920f.mo13197h0(c1527s5.f8830b.m4995e(card.f16866m), 13);
            String str9 = card.f16867n;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str9, 14);
            }
            c1527s5.f8830b.getClass();
            String strM4991d = C1405c0.m4991d(card.f16868o);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 15);
            }
            String strM4991d2 = C1405c0.m4991d(card.f16869p);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 16);
            }
            String strM4991d3 = C1405c0.m4991d(card.f16870q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 17);
            }
            interfaceC7920f.mo13194W(18, card.f16872s ? 1L : 0L);
            LessonTransliteration lessonTransliteration = card.f16871r;
            if (lessonTransliteration != null) {
                String str10 = lessonTransliteration.f17179a;
                if (str10 == null) {
                    interfaceC7920f.mo13193J0(19);
                } else {
                    interfaceC7920f.mo13197h0(str10, 19);
                }
                String str11 = lessonTransliteration.f17180b;
                if (str11 == null) {
                    interfaceC7920f.mo13193J0(20);
                } else {
                    interfaceC7920f.mo13197h0(str11, 20);
                }
                String str12 = lessonTransliteration.f17181c;
                if (str12 == null) {
                    interfaceC7920f.mo13193J0(21);
                } else {
                    interfaceC7920f.mo13197h0(str12, 21);
                }
                String str13 = lessonTransliteration.f17182d;
                if (str13 == null) {
                    interfaceC7920f.mo13193J0(22);
                } else {
                    interfaceC7920f.mo13197h0(str13, 22);
                }
                String str14 = lessonTransliteration.f17183e;
                if (str14 == null) {
                    interfaceC7920f.mo13193J0(23);
                } else {
                    interfaceC7920f.mo13197h0(str14, 23);
                }
                String str15 = lessonTransliteration.f17184f;
                if (str15 == null) {
                    interfaceC7920f.mo13193J0(24);
                } else {
                    interfaceC7920f.mo13197h0(str15, 24);
                }
            } else {
                interfaceC7920f.mo13193J0(19);
                interfaceC7920f.mo13193J0(20);
                interfaceC7920f.mo13193J0(21);
                interfaceC7920f.mo13193J0(22);
                interfaceC7920f.mo13193J0(23);
                interfaceC7920f.mo13193J0(24);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13197h0(str2, 25);
            }
        }
    }

    /* JADX INFO: renamed from: bi.s5$i */
    public class i implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8843a;

        public i(List list) {
            this.f8843a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1527s5 c1527s5 = C1527s5.this;
            RoomDatabase roomDatabase = c1527s5.f8829a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1527s5.f8831c.m1228p(this.f8843a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    public C1527s5(RoomDatabase roomDatabase) {
        this.f8829a = roomDatabase;
        new e(roomDatabase);
        new f(roomDatabase);
        this.f8831c = new C0322j(new g(roomDatabase), new h(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Card> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8829a, new i(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: k0 */
    public final Object mo5166k0(List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8829a, new d(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5167l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT Count(*) FROM Card WHERE termWithLanguage LIKE ? || '\\_%' ESCAPE '\\'", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1534t5 callableC1534t5 = new CallableC1534t5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8829a, true, new String[]{"Card"}, callableC1534t5);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo5168m0(C7915a c7915a) {
        CallableC1555w5 callableC1555w5 = new CallableC1555w5(this, c7915a);
        return C1185b.m4579a(this.f8829a, true, new String[]{"Card"}, callableC1555w5);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5169n0(C7915a c7915a) {
        CallableC1541u5 callableC1541u5 = new CallableC1541u5(this, c7915a);
        return C1185b.m4579a(this.f8829a, true, new String[]{"Card"}, callableC1541u5);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: o0 */
    public final Object mo5170o0(List<String> list, int i10, int i11, InterfaceC9968c<? super List<C7566f>> interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `status`, `extendedStatus`, `srsDueDate`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM Card WHERE termWithLanguage IN (");
        int size = list.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND status BETWEEN ? AND ?)");
        int i12 = size + 2;
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), i12);
        int i13 = 1;
        for (String str : list) {
            if (str == null) {
                c6595oM13191l.mo13193J0(i13);
            } else {
                c6595oM13191l.mo13197h0(str, i13);
            }
            i13++;
        }
        c6595oM13191l.mo13194W(size + 1, i10);
        return C1185b.m4581c(this.f8829a, true, C0141b.m610f(c6595oM13191l, i12, i11), new b(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: p0 */
    public final Object mo5171p0(String str, InterfaceC9968c<? super List<C7566f>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `term`, `id`, `status`, `extendedStatus`, `srsDueDate`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM Card WHERE termWithLanguage LIKE ? || '\\_%' ESCAPE '\\')", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8829a, true, new CancellationSignal(), new a(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: q0 */
    public final Object mo5172q0(List<String> list, int i10, int i11, String str, InterfaceC9968c<? super List<C7566f>> interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `status`, `extendedStatus`, `srsDueDate`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM Card WHERE termWithLanguage IN (");
        int size = list.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND status BETWEEN ? AND ? AND srsDueDate < ?)");
        int i12 = size + 3;
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), i12);
        int i13 = 1;
        for (String str2 : list) {
            if (str2 == null) {
                c6595oM13191l.mo13193J0(i13);
            } else {
                c6595oM13191l.mo13197h0(str2, i13);
            }
            i13++;
        }
        c6595oM13191l.mo13194W(size + 1, i10);
        c6595oM13191l.mo13194W(size + 2, i11);
        c6595oM13191l.mo13197h0(str, i12);
        return C1185b.m4581c(this.f8829a, true, new CancellationSignal(), new c(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1520r5
    /* JADX INFO: renamed from: r0 */
    public final Object mo5173r0(C7915a c7915a, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4581c(this.f8829a, true, new CancellationSignal(), new CallableC1548v5(this, c7915a), interfaceC9968c);
    }
}
