package bi;

import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.FastSearch;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: bi.e5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1426e5 extends AbstractC1402b5 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8440a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8441b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8442c = new C1405c0();

    /* JADX INFO: renamed from: bi.e5$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `FastSearch` WHERE `id` = ? AND `type` = ? AND `language` = ? AND `query` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            FastSearch fastSearch = (FastSearch) obj;
            String str = fastSearch.f16973a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = fastSearch.f16976d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = fastSearch.f16974b;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = fastSearch.f16975c;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e5$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `FastSearch` (`id`,`language`,`query`,`type`,`title`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            FastSearch fastSearch = (FastSearch) obj;
            String str = fastSearch.f16973a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = fastSearch.f16974b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = fastSearch.f16975c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = fastSearch.f16976d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            String str5 = fastSearch.f16977e;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str5, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e5$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `FastSearch` SET `id` = ?,`language` = ?,`query` = ?,`type` = ?,`title` = ? WHERE `id` = ? AND `type` = ? AND `language` = ? AND `query` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            FastSearch fastSearch = (FastSearch) obj;
            String str = fastSearch.f16973a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = fastSearch.f16974b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = fastSearch.f16975c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = fastSearch.f16976d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            String str5 = fastSearch.f16977e;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str5, 5);
            }
            String str6 = fastSearch.f16973a;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str6, 6);
            }
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str2, 8);
            }
            if (str3 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str3, 9);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e5$d */
    public class d implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8443a;

        public d(List list) {
            this.f8443a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1426e5 c1426e5 = C1426e5.this;
            RoomDatabase roomDatabase = c1426e5.f8440a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1426e5.f8441b.m1228p(this.f8443a);
                roomDatabase.m4568s();
                return listBuilderM1228p;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    public C1426e5(RoomDatabase roomDatabase) {
        this.f8440a = roomDatabase;
        new a(roomDatabase);
        this.f8441b = new C0322j(new b(roomDatabase), new c(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends FastSearch> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8440a, new d(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1402b5
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo4985k0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT * FROM FastSearch, LibraryData WHERE \n    FastSearch.language = ? AND FastSearch.`query` = ? \n    AND FastSearch.type = \"collection\" AND FastSearch.id = LibraryData.id\n  ", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        CallableC1410c5 callableC1410c5 = new CallableC1410c5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8440a, true, new String[]{"FastSearch", "LibraryData"}, callableC1410c5);
    }

    @Override // bi.AbstractC1402b5
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo4986l0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `language`, `type`, `title` FROM (\n    SELECT * FROM FastSearch \n    WHERE language = ? AND `query` = ? \n    AND type != \"collection\" AND type != \"content\" \n  )", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        CallableC1418d5 callableC1418d5 = new CallableC1418d5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8440a, true, new String[]{"FastSearch"}, callableC1418d5);
    }

    @Override // bi.AbstractC1402b5
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo4987m0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `roseGiven`, `progress`, `listenTimes`, `readTimes`, `isTaken`, `difficulty`, `rosesCount`, `newWordsCount`, `knownWordsCount`, `cardsCount`, `lessonsCount`, `isCompletelyTaken` FROM (\n      SELECT * FROM LibraryCounter WHERE id in (\n        SELECT id FROM FastSearch \n        WHERE FastSearch.language = ? AND FastSearch.`query` = ? \n        AND FastSearch.type = \"content\"\n      )\n    )", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        CallableC1442g5 callableC1442g5 = new CallableC1442g5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8440a, true, new String[]{"LibraryCounter", "FastSearch"}, callableC1442g5);
    }

    @Override // bi.AbstractC1402b5
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo4988n0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT * FROM FastSearch, Lesson WHERE \n    FastSearch.language = ? AND FastSearch.`query` = ? \n    AND FastSearch.type = \"content\" AND FastSearch.id = Lesson.id\n  ", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        CallableC1434f5 callableC1434f5 = new CallableC1434f5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8440a, true, new String[]{"FastSearch", "Lesson"}, callableC1434f5);
    }
}
