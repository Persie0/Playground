package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.SharedSQLiteStatement;
import cm.InterfaceC2052l;
import com.lingq.entity.LanguageProgress;
import com.lingq.entity.LanguageProgressChartEntry;
import com.lingq.entity.Streak;
import com.lingq.entity.StudyStats;
import com.lingq.shared.persistent.dao.LanguageStatsDao;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import dm.C5206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1422e1 extends LanguageStatsDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8402a;

    /* JADX INFO: renamed from: b */
    public final m f8403b;

    /* JADX INFO: renamed from: c */
    public final o f8404c;

    /* JADX INFO: renamed from: d */
    public final p f8405d;

    /* JADX INFO: renamed from: e */
    public final q f8406e;

    /* JADX INFO: renamed from: f */
    public final r f8407f;

    /* JADX INFO: renamed from: g */
    public final s f8408g;

    /* JADX INFO: renamed from: h */
    public final C0322j f8409h;

    /* JADX INFO: renamed from: i */
    public final C1405c0 f8410i = new C1405c0();

    /* JADX INFO: renamed from: j */
    public final C0322j f8411j;

    /* JADX INFO: renamed from: k */
    public final C0322j f8412k;

    /* JADX INFO: renamed from: l */
    public final C0322j f8413l;

    /* JADX INFO: renamed from: bi.e1$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageProgressChartEntry` (`metric`,`languageCode`,`period`,`name`,`daily`,`cumulative`,`position`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) obj;
            String str = languageProgressChartEntry.f17050a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = languageProgressChartEntry.f17051b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = languageProgressChartEntry.f17052c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = languageProgressChartEntry.f17053d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13192F0(languageProgressChartEntry.f17054e, 5);
            interfaceC7920f.mo13192F0(languageProgressChartEntry.f17055f, 6);
            interfaceC7920f.mo13194W(7, languageProgressChartEntry.f17056g);
        }
    }

    /* JADX INFO: renamed from: bi.e1$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageProgressChartEntry` SET `metric` = ?,`languageCode` = ?,`period` = ?,`name` = ?,`daily` = ?,`cumulative` = ?,`position` = ? WHERE `languageCode` = ? AND `metric` = ? AND `name` = ? AND `period` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) obj;
            String str = languageProgressChartEntry.f17050a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = languageProgressChartEntry.f17051b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = languageProgressChartEntry.f17052c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = languageProgressChartEntry.f17053d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13192F0(languageProgressChartEntry.f17054e, 5);
            interfaceC7920f.mo13192F0(languageProgressChartEntry.f17055f, 6);
            interfaceC7920f.mo13194W(7, languageProgressChartEntry.f17056g);
            if (str2 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str2, 8);
            }
            String str5 = languageProgressChartEntry.f17050a;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str5, 9);
            }
            if (str4 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str4, 10);
            }
            if (str3 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str3, 11);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `StudyStats` (`code`,`language`,`activityApple`,`notificationsCount`,`dailyGoal`,`streakDays`,`coins`,`knownWords`,`isAvatarUpgraded`,`dailyScores`,`activityLevel`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            StudyStats studyStats = (StudyStats) obj;
            String str = studyStats.f17466a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = studyStats.f17467b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = studyStats.f17468c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, studyStats.f17469d);
            interfaceC7920f.mo13194W(5, studyStats.f17470e);
            interfaceC7920f.mo13194W(6, studyStats.f17471f);
            interfaceC7920f.mo13194W(7, studyStats.f17472g);
            interfaceC7920f.mo13194W(8, studyStats.f17473h);
            interfaceC7920f.mo13194W(9, studyStats.f17474i ? 1L : 0L);
            interfaceC7920f.mo13197h0(C1422e1.this.f8410i.m5009t(studyStats.f17475j), 10);
            interfaceC7920f.mo13194W(11, studyStats.f17476k);
        }
    }

    /* JADX INFO: renamed from: bi.e1$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `StudyStats` SET `code` = ?,`language` = ?,`activityApple` = ?,`notificationsCount` = ?,`dailyGoal` = ?,`streakDays` = ?,`coins` = ?,`knownWords` = ?,`isAvatarUpgraded` = ?,`dailyScores` = ?,`activityLevel` = ? WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            StudyStats studyStats = (StudyStats) obj;
            String str = studyStats.f17466a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = studyStats.f17467b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = studyStats.f17468c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, studyStats.f17469d);
            interfaceC7920f.mo13194W(5, studyStats.f17470e);
            interfaceC7920f.mo13194W(6, studyStats.f17471f);
            interfaceC7920f.mo13194W(7, studyStats.f17472g);
            interfaceC7920f.mo13194W(8, studyStats.f17473h);
            interfaceC7920f.mo13194W(9, studyStats.f17474i ? 1L : 0L);
            interfaceC7920f.mo13197h0(C1422e1.this.f8410i.m5009t(studyStats.f17475j), 10);
            interfaceC7920f.mo13194W(11, studyStats.f17476k);
            String str4 = studyStats.f17466a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str4, 12);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Streak` (`language`,`streakDays`,`coins`,`latestStreakDays`,`isStreakBroken`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Streak streak = (Streak) obj;
            String str = streak.f17456a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            Integer num = streak.f17457b;
            if (num == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, num.intValue());
            }
            Double d10 = streak.f17458c;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 3);
            }
            Integer num2 = streak.f17459d;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num2.intValue());
            }
            Boolean bool = streak.f17460e;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, numValueOf.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Streak` SET `language` = ?,`streakDays` = ?,`coins` = ?,`latestStreakDays` = ?,`isStreakBroken` = ? WHERE `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Streak streak = (Streak) obj;
            String str = streak.f17456a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            Integer num = streak.f17457b;
            if (num == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, num.intValue());
            }
            Double d10 = streak.f17458c;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 3);
            }
            Integer num2 = streak.f17459d;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num2.intValue());
            }
            Boolean bool = streak.f17460e;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, numValueOf.intValue());
            }
            String str2 = streak.f17456a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str2, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$g */
    public class g implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f8416a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8417b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8418c;

        public g(double d10, String str, String str2) {
            this.f8416a = d10;
            this.f8417b = str;
            this.f8418c = str2;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            m mVar = c1422e1.f8403b;
            InterfaceC7920f interfaceC7920fM4574a = mVar.m4574a();
            interfaceC7920fM4574a.mo13192F0(this.f8416a, 1);
            String str = this.f8417b;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 2);
            }
            String str2 = this.f8418c;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(3);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 3);
            }
            RoomDatabase roomDatabase = c1422e1.f8402a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                mVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                mVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LanguageProgress` WHERE `languageCode` = ? AND `interval` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageProgress languageProgress = (LanguageProgress) obj;
            String str = languageProgress.f17031b;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = languageProgress.f17030a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$i */
    public class i implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f8420a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8421b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8422c;

        public i(double d10, String str, String str2) {
            this.f8420a = d10;
            this.f8421b = str;
            this.f8422c = str2;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            q qVar = c1422e1.f8406e;
            InterfaceC7920f interfaceC7920fM4574a = qVar.m4574a();
            interfaceC7920fM4574a.mo13192F0(this.f8420a, 1);
            String str = this.f8421b;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 2);
            }
            String str2 = this.f8422c;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(3);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 3);
            }
            RoomDatabase roomDatabase = c1422e1.f8402a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                qVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                qVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$j */
    public class j implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8424a;

        public j(String str) {
            this.f8424a = str;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            r rVar = c1422e1.f8407f;
            InterfaceC7920f interfaceC7920fM4574a = rVar.m4574a();
            String str = this.f8424a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            RoomDatabase roomDatabase = c1422e1.f8402a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                rVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                rVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$k */
    public class k implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StudyStats f8426a;

        public k(StudyStats studyStats) {
            this.f8426a = studyStats;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            RoomDatabase roomDatabase = c1422e1.f8402a;
            RoomDatabase roomDatabase2 = c1422e1.f8402a;
            roomDatabase.m4552c();
            try {
                c1422e1.f8412k.m1225m(this.f8426a);
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

    /* JADX INFO: renamed from: bi.e1$l */
    public class l implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Streak f8428a;

        public l(Streak streak) {
            this.f8428a = streak;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            RoomDatabase roomDatabase = c1422e1.f8402a;
            RoomDatabase roomDatabase2 = c1422e1.f8402a;
            roomDatabase.m4552c();
            try {
                c1422e1.f8413l.m1225m(this.f8428a);
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

    /* JADX INFO: renamed from: bi.e1$m */
    public class m extends SharedSQLiteStatement {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LanguageProgress SET listeningTime = ? WHERE languageCode = ? AND interval = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$n */
    public class n implements Callable<UserLanguageStudyStats> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8430a;

        public n(C6595o c6595o) {
            this.f8430a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final UserLanguageStudyStats call() throws Exception {
            C1422e1 c1422e1 = C1422e1.this;
            RoomDatabase roomDatabase = c1422e1.f8402a;
            C6595o c6595o = this.f8430a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                UserLanguageStudyStats userLanguageStudyStats = str;
                if (cursorM16698S0.moveToFirst()) {
                    userLanguageStudyStats = new UserLanguageStudyStats(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getInt(1), cursorM16698S0.getInt(2), cursorM16698S0.getInt(3), cursorM16698S0.getInt(4), c1422e1.f8410i.m5008s(cursorM16698S0.isNull(5) ? str : cursorM16698S0.getString(5)), cursorM16698S0.getInt(6));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return userLanguageStudyStats;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.e1$o */
    public class o extends SharedSQLiteStatement {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LanguageProgress SET readWords = ? WHERE languageCode = ? AND interval = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$p */
    public class p extends SharedSQLiteStatement {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LanguageProgress SET writtenWords = ? WHERE languageCode = ? AND interval = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$q */
    public class q extends SharedSQLiteStatement {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LanguageProgress SET speakingTime = ? WHERE languageCode = ? AND interval = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$r */
    public class r extends SharedSQLiteStatement {
        public r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Streak SET isStreakBroken = 0 WHERE language = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$s */
    public class s extends SharedSQLiteStatement {
        public s(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE StudyStats SET streakDays = ? WHERE language = ?";
        }
    }

    /* JADX INFO: renamed from: bi.e1$t */
    public class t extends AbstractC6583c {
        public t(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageProgress` (`interval`,`languageCode`,`writtenWordsGoal`,`speakingTimeGoal`,`totalWordsKnown`,`readWords`,`totalCards`,`activityIndex`,`knownWordsGoal`,`listeningTimeGoal`,`speakingTime`,`cardsCreatedGoal`,`knownWords`,`intervals`,`cardsCreated`,`readWordsGoal`,`listeningTime`,`cardsLearned`,`writtenWords`,`cardsLearnedGoal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageProgress languageProgress = (LanguageProgress) obj;
            String str = languageProgress.f17030a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = languageProgress.f17031b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, languageProgress.f17032c);
            interfaceC7920f.mo13192F0(languageProgress.f17033d, 4);
            interfaceC7920f.mo13194W(5, languageProgress.f17034e);
            interfaceC7920f.mo13192F0(languageProgress.f17035f, 6);
            interfaceC7920f.mo13194W(7, languageProgress.f17036g);
            interfaceC7920f.mo13194W(8, languageProgress.f17037h);
            interfaceC7920f.mo13194W(9, languageProgress.f17038i);
            interfaceC7920f.mo13192F0(languageProgress.f17039j, 10);
            interfaceC7920f.mo13192F0(languageProgress.f17040k, 11);
            interfaceC7920f.mo13194W(12, languageProgress.f17041l);
            interfaceC7920f.mo13194W(13, languageProgress.f17042m);
            C1422e1.this.f8410i.getClass();
            String strM4991d = C1405c0.m4991d(languageProgress.f17043n);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 14);
            }
            interfaceC7920f.mo13194W(15, languageProgress.f17044o);
            interfaceC7920f.mo13194W(16, languageProgress.f17045p);
            interfaceC7920f.mo13192F0(languageProgress.f17046q, 17);
            interfaceC7920f.mo13194W(18, languageProgress.f17047r);
            interfaceC7920f.mo13194W(19, languageProgress.f17048s);
            interfaceC7920f.mo13194W(20, languageProgress.f17049t);
        }
    }

    /* JADX INFO: renamed from: bi.e1$u */
    public class u extends AbstractC6583c {
        public u(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageProgress` SET `interval` = ?,`languageCode` = ?,`writtenWordsGoal` = ?,`speakingTimeGoal` = ?,`totalWordsKnown` = ?,`readWords` = ?,`totalCards` = ?,`activityIndex` = ?,`knownWordsGoal` = ?,`listeningTimeGoal` = ?,`speakingTime` = ?,`cardsCreatedGoal` = ?,`knownWords` = ?,`intervals` = ?,`cardsCreated` = ?,`readWordsGoal` = ?,`listeningTime` = ?,`cardsLearned` = ?,`writtenWords` = ?,`cardsLearnedGoal` = ? WHERE `languageCode` = ? AND `interval` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageProgress languageProgress = (LanguageProgress) obj;
            String str = languageProgress.f17030a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = languageProgress.f17031b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, languageProgress.f17032c);
            interfaceC7920f.mo13192F0(languageProgress.f17033d, 4);
            interfaceC7920f.mo13194W(5, languageProgress.f17034e);
            interfaceC7920f.mo13192F0(languageProgress.f17035f, 6);
            interfaceC7920f.mo13194W(7, languageProgress.f17036g);
            interfaceC7920f.mo13194W(8, languageProgress.f17037h);
            interfaceC7920f.mo13194W(9, languageProgress.f17038i);
            interfaceC7920f.mo13192F0(languageProgress.f17039j, 10);
            interfaceC7920f.mo13192F0(languageProgress.f17040k, 11);
            interfaceC7920f.mo13194W(12, languageProgress.f17041l);
            interfaceC7920f.mo13194W(13, languageProgress.f17042m);
            C1422e1.this.f8410i.getClass();
            String strM4991d = C1405c0.m4991d(languageProgress.f17043n);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 14);
            }
            interfaceC7920f.mo13194W(15, languageProgress.f17044o);
            interfaceC7920f.mo13194W(16, languageProgress.f17045p);
            interfaceC7920f.mo13192F0(languageProgress.f17046q, 17);
            interfaceC7920f.mo13194W(18, languageProgress.f17047r);
            interfaceC7920f.mo13194W(19, languageProgress.f17048s);
            interfaceC7920f.mo13194W(20, languageProgress.f17049t);
            if (str2 == null) {
                interfaceC7920f.mo13193J0(21);
            } else {
                interfaceC7920f.mo13197h0(str2, 21);
            }
            String str3 = languageProgress.f17030a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(22);
            } else {
                interfaceC7920f.mo13197h0(str3, 22);
            }
        }
    }

    public C1422e1(RoomDatabase roomDatabase) {
        this.f8402a = roomDatabase;
        new h(roomDatabase);
        this.f8403b = new m(roomDatabase);
        this.f8404c = new o(roomDatabase);
        this.f8405d = new p(roomDatabase);
        this.f8406e = new q(roomDatabase);
        this.f8407f = new r(roomDatabase);
        this.f8408g = new s(roomDatabase);
        this.f8409h = new C0322j(new t(roomDatabase), new u(roomDatabase));
        this.f8411j = new C0322j(new a(roomDatabase), new b(roomDatabase));
        this.f8412k = new C0322j(new c(roomDatabase), new d(roomDatabase));
        this.f8413l = new C0322j(new e(roomDatabase), new f(roomDatabase));
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: A0 */
    public final Object mo5023A0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new CallableC1438g1(this, i10, str, str2), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new CallableC1453i1(this, (LanguageProgress) obj), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: k0 */
    public final void mo5024k0(String str, String str2, String str3, ArrayList arrayList) {
        RoomDatabase roomDatabase = this.f8402a;
        roomDatabase.m4551b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM LanguageProgressChartEntry WHERE languageCode = ? AND metric = ? AND period = ? AND name NOT IN (");
        C5206f.m11021s0(arrayList.size(), sb2);
        sb2.append(")");
        InterfaceC7920f interfaceC7920fM4555f = roomDatabase.m4555f(sb2.toString());
        if (str == null) {
            interfaceC7920fM4555f.mo13193J0(1);
        } else {
            interfaceC7920fM4555f.mo13197h0(str, 1);
        }
        if (str2 == null) {
            interfaceC7920fM4555f.mo13193J0(2);
        } else {
            interfaceC7920fM4555f.mo13197h0(str2, 2);
        }
        if (str3 == null) {
            interfaceC7920fM4555f.mo13193J0(3);
        } else {
            interfaceC7920fM4555f.mo13197h0(str3, 3);
        }
        Iterator it = arrayList.iterator();
        int i10 = 4;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (str4 == null) {
                interfaceC7920fM4555f.mo13193J0(i10);
            } else {
                interfaceC7920fM4555f.mo13197h0(str4, i10);
            }
            i10++;
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4555f.mo15736A();
            roomDatabase.m4568s();
        } finally {
            roomDatabase.m4563n();
        }
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5025l0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LanguageProgress WHERE languageCode = ? AND interval = ?", 2);
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
        CallableC1467k1 callableC1467k1 = new CallableC1467k1(this, c6595oM13191l);
        return C1185b.m4579a(this.f8402a, false, new String[]{"LanguageProgress"}, callableC1467k1);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo5026m0(String str, String str2, String str3) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `metric`, `languageCode`, `name`, `daily`, `cumulative` FROM (SELECT * FROM LanguageProgressChartEntry WHERE languageCode = ? AND metric = ? AND period = ? ORDER BY position)", 3);
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
        if (str3 == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str3, 3);
        }
        CallableC1481m1 callableC1481m1 = new CallableC1481m1(this, c6595oM13191l);
        return C1185b.m4579a(this.f8402a, true, new String[]{"LanguageProgressChartEntry"}, callableC1481m1);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5027n0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `language`, `coins`, `latestStreakDays`, `isStreakBroken` FROM (SELECT * FROM Streak WHERE language = ? LIMIT 1)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1488n1 callableC1488n1 = new CallableC1488n1(this, c6595oM13191l);
        return C1185b.m4579a(this.f8402a, false, new String[]{"Streak"}, callableC1488n1);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5028o0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `language`, `dailyGoal`, `streakDays`, `coins`, `knownWords`, `dailyScores`, `activityLevel` FROM (SELECT * FROM StudyStats WHERE code = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1474l1 callableC1474l1 = new CallableC1474l1(this, c6595oM13191l);
        return C1185b.m4579a(this.f8402a, false, new String[]{"StudyStats"}, callableC1474l1);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: p0 */
    public final Object mo5029p0(String str, InterfaceC9968c<? super UserLanguageStudyStats> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `language`, `dailyGoal`, `streakDays`, `coins`, `knownWords`, `dailyScores`, `activityLevel` FROM (SELECT * FROM StudyStats WHERE code = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8402a, false, new CancellationSignal(), new n(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: q0 */
    public final Object mo5030q0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new CallableC1460j1(this, arrayList), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: r0 */
    public final Object mo5031r0(StudyStats studyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new k(studyStats), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: s0 */
    public final Object mo5032s0(Streak streak, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new l(streak), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: t0 */
    public final Object mo5033t0(final int i10, final String str, InterfaceC9968c interfaceC9968c) {
        return RoomDatabaseKt.m4573a(this.f8402a, new InterfaceC2052l() { // from class: bi.d1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C1422e1 c1422e1 = this;
                c1422e1.getClass();
                return LanguageStatsDao.m9473u0(c1422e1, str, i10, (InterfaceC9968c) obj);
            }
        }, interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: v0 */
    public final Object mo5034v0(String str, String str2, double d10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new g(d10, str, str2), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: w0 */
    public final Object mo5035w0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new CallableC1430f1(this, i10, str, str2), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: x0 */
    public final Object mo5036x0(String str, String str2, double d10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new i(d10, str, str2), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: y0 */
    public final Object mo5037y0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new j(str), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.LanguageStatsDao
    /* JADX INFO: renamed from: z0 */
    public final Object mo5038z0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8402a, new CallableC1446h1(i10, this, str), interfaceC9968c);
    }
}
