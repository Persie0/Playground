package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Milestone;
import com.lingq.entity.MilestoneMet;
import com.lingq.entity.MilestoneStats;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import p096ei.C5409b;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1476l3 extends AbstractC1469k3 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8586a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8587b;

    /* JADX INFO: renamed from: c */
    public final C0322j f8588c;

    /* JADX INFO: renamed from: d */
    public final C0322j f8589d;

    /* JADX INFO: renamed from: bi.l3$a */
    public class a implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8590a;

        public a(ArrayList arrayList) {
            this.f8590a = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1476l3 c1476l3 = C1476l3.this;
            RoomDatabase roomDatabase = c1476l3.f8586a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1476l3.f8587b.m1228p(this.f8590a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$b */
    public class b implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MilestoneMet f8592a;

        public b(MilestoneMet milestoneMet) {
            this.f8592a = milestoneMet;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1476l3 c1476l3 = C1476l3.this;
            RoomDatabase roomDatabase = c1476l3.f8586a;
            RoomDatabase roomDatabase2 = c1476l3.f8586a;
            roomDatabase.m4552c();
            try {
                c1476l3.f8588c.m1225m(this.f8592a);
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

    /* JADX INFO: renamed from: bi.l3$c */
    public class c implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MilestoneStats f8594a;

        public c(MilestoneStats milestoneStats) {
            this.f8594a = milestoneStats;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1476l3 c1476l3 = C1476l3.this;
            RoomDatabase roomDatabase = c1476l3.f8586a;
            RoomDatabase roomDatabase2 = c1476l3.f8586a;
            roomDatabase.m4552c();
            try {
                c1476l3.f8589d.m1225m(this.f8594a);
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

    /* JADX INFO: renamed from: bi.l3$d */
    public class d implements Callable<C5409b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8596a;

        public d(C6595o c6595o) {
            this.f8596a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final C5409b call() throws Exception {
            RoomDatabase roomDatabase = C1476l3.this.f8586a;
            C6595o c6595o = this.f8596a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "language");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "knownWords");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "lingqs");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "dailyScore");
                C5409b c5409b = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    if (!cursorM16698S0.isNull(iM16742n0)) {
                        string = cursorM16698S0.getString(iM16742n0);
                    }
                    c5409b = new C5409b(string, cursorM16698S0.getInt(iM16742n1), cursorM16698S0.getInt(iM16742n2), cursorM16698S0.getInt(iM16742n3));
                }
                cursorM16698S0.close();
                return c5409b;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Milestone` WHERE `languageAndSlug` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Milestone) obj).f17299a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Milestone` (`languageAndSlug`,`language`,`slug`,`name`,`goal`,`stat`,`date`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Milestone milestone = (Milestone) obj;
            String str = milestone.f17299a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = milestone.f17300b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = milestone.f17301c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = milestone.f17302d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13194W(5, milestone.f17303e);
            String str5 = milestone.f17304f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = milestone.f17305g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Milestone` SET `languageAndSlug` = ?,`language` = ?,`slug` = ?,`name` = ?,`goal` = ?,`stat` = ?,`date` = ? WHERE `languageAndSlug` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Milestone milestone = (Milestone) obj;
            String str = milestone.f17299a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = milestone.f17300b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = milestone.f17301c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = milestone.f17302d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13194W(5, milestone.f17303e);
            String str5 = milestone.f17304f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = milestone.f17305g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            String str7 = milestone.f17299a;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str7, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `MilestoneMet` (`languageAndSlug`,`metAt`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            MilestoneMet milestoneMet = (MilestoneMet) obj;
            String str = milestoneMet.f17311a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = milestoneMet.f17312b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `MilestoneMet` SET `languageAndSlug` = ?,`metAt` = ? WHERE `languageAndSlug` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            MilestoneMet milestoneMet = (MilestoneMet) obj;
            String str = milestoneMet.f17311a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = milestoneMet.f17312b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = milestoneMet.f17311a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l3$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `MilestoneStats` (`language`,`knownWords`,`lingqs`,`dailyScore`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            MilestoneStats milestoneStats = (MilestoneStats) obj;
            String str = milestoneStats.f17315a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, milestoneStats.f17316b);
            interfaceC7920f.mo13194W(3, milestoneStats.f17317c);
            interfaceC7920f.mo13194W(4, milestoneStats.f17318d);
        }
    }

    /* JADX INFO: renamed from: bi.l3$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `MilestoneStats` SET `language` = ?,`knownWords` = ?,`lingqs` = ?,`dailyScore` = ? WHERE `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            MilestoneStats milestoneStats = (MilestoneStats) obj;
            String str = milestoneStats.f17315a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, milestoneStats.f17316b);
            interfaceC7920f.mo13194W(3, milestoneStats.f17317c);
            interfaceC7920f.mo13194W(4, milestoneStats.f17318d);
            String str2 = milestoneStats.f17315a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str2, 5);
            }
        }
    }

    public C1476l3(RoomDatabase roomDatabase) {
        this.f8586a = roomDatabase;
        new e(roomDatabase);
        this.f8587b = new C0322j(new f(roomDatabase), new g(roomDatabase));
        this.f8588c = new C0322j(new h(roomDatabase), new i(roomDatabase));
        this.f8589d = new C0322j(new j(roomDatabase), new k(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Milestone> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8586a, new a((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1469k3
    /* JADX INFO: renamed from: k0 */
    public final Object mo5083k0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `language`, `slug`, `goal`, `stat` FROM (\n        SELECT * FROM Milestone \n        WHERE stat = \"daily_score\" AND goal <= ? AND date = ? AND language = ? AND \n        NOT EXISTS (\n            SELECT 1 FROM MilestoneMet WHERE Milestone.languageAndSlug == MilestoneMet.languageAndSlug\n        )\n        ORDER BY goal\n    )", 3);
        c6595oM13191l.mo13194W(1, i10);
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4581c(this.f8586a, true, new CancellationSignal(), new CallableC1490n3(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1469k3
    /* JADX INFO: renamed from: l0 */
    public final Object mo5084l0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `language`, `slug`, `goal`, `stat` FROM (\n        SELECT * FROM Milestone \n        WHERE stat = \"known_words\" AND goal <= ? AND language = ? AND \n        NOT EXISTS (\n            SELECT 1 FROM MilestoneMet WHERE Milestone.languageAndSlug == MilestoneMet.languageAndSlug\n        ) \n    )", 2);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        return C1185b.m4581c(this.f8586a, true, new CancellationSignal(), new CallableC1483m3(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1469k3
    /* JADX INFO: renamed from: m0 */
    public final Object mo5085m0(String str, InterfaceC9968c<? super C5409b> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM MilestoneStats WHERE language = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8586a, false, new CancellationSignal(), new d(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1469k3
    /* JADX INFO: renamed from: n0 */
    public final Object mo5086n0(MilestoneMet milestoneMet, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8586a, new b(milestoneMet), interfaceC9968c);
    }

    @Override // bi.AbstractC1469k3
    /* JADX INFO: renamed from: o0 */
    public final Object mo5087o0(MilestoneStats milestoneStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8586a, new c(milestoneStats), interfaceC9968c);
    }
}
