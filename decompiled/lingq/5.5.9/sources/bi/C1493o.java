package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.ChallengeProfile;
import com.lingq.entity.ChallengeRanking;
import com.lingq.entity.SocialSettings;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import dm.C5207g;
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
import p367rh.C8788b;
import p367rh.C8789c;
import p367rh.C8790d;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1493o extends AbstractC1486n {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8679a;

    /* JADX INFO: renamed from: b */
    public final l f8680b;

    /* JADX INFO: renamed from: c */
    public final o f8681c;

    /* JADX INFO: renamed from: d */
    public final p f8682d;

    /* JADX INFO: renamed from: e */
    public final q f8683e;

    /* JADX INFO: renamed from: f */
    public final r f8684f;

    /* JADX INFO: renamed from: g */
    public final C0322j f8685g;

    /* JADX INFO: renamed from: h */
    public final C1405c0 f8686h = new C1405c0();

    /* JADX INFO: renamed from: i */
    public final C0322j f8687i;

    /* JADX INFO: renamed from: j */
    public final C0322j f8688j;

    /* JADX INFO: renamed from: k */
    public final C0322j f8689k;

    /* JADX INFO: renamed from: bi.o$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `ChallengeRanking` SET `challengeCode` = ?,`metric` = ?,`rank` = ?,`language` = ?,`profile` = ?,`score` = ?,`scoreBehindLeader` = ?,`isCompleted` = ? WHERE `challengeCode` = ? AND `metric` = ? AND `rank` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            ChallengeRanking challengeRanking = (ChallengeRanking) obj;
            String str = challengeRanking.f16918a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = challengeRanking.f16919b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            long j10 = challengeRanking.f16920c;
            interfaceC7920f.mo13194W(3, j10);
            String str3 = challengeRanking.f16921d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13197h0(C1493o.this.f8686h.f8356a.m10563a(ChallengeProfile.class).m10535e(challengeRanking.f16922e), 5);
            interfaceC7920f.mo13194W(6, challengeRanking.f16923f);
            interfaceC7920f.mo13194W(7, challengeRanking.f16924g);
            interfaceC7920f.mo13194W(8, challengeRanking.f16925h ? 1L : 0L);
            String str4 = challengeRanking.f16918a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str4, 9);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str2, 10);
            }
            interfaceC7920f.mo13194W(11, j10);
            if (str3 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str3, 12);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `ChallengeDetailStats` (`language`,`challengeCode`,`code`,`value`,`title`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8789c c8789c = (C8789c) obj;
            String str = c8789c.f46624a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8789c.f46625b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = c8789c.f46626c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, c8789c.f46627d);
            String str4 = c8789c.f46628e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `ChallengeDetailStats` SET `language` = ?,`challengeCode` = ?,`code` = ?,`value` = ?,`title` = ? WHERE `challengeCode` = ? AND `code` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8789c c8789c = (C8789c) obj;
            String str = c8789c.f46624a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8789c.f46625b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = c8789c.f46626c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            interfaceC7920f.mo13194W(4, c8789c.f46627d);
            String str4 = c8789c.f46628e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str2, 6);
            }
            if (str3 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str3, 7);
            }
            String str5 = c8789c.f46624a;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `ChallengeStats` (`language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8790d c8790d = (C8790d) obj;
            String str = c8790d.f46629a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8790d.f46630b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = c8790d.f46631c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = c8790d.f46632d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13192F0(c8790d.f46633e, 5);
            interfaceC7920f.mo13192F0(c8790d.f46634f, 6);
            interfaceC7920f.mo13192F0(c8790d.f46635g, 7);
        }
    }

    /* JADX INFO: renamed from: bi.o$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `ChallengeStats` SET `language` = ?,`challengeCode` = ?,`code` = ?,`title` = ?,`progress` = ?,`actual` = ?,`target` = ? WHERE `challengeCode` = ? AND `code` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8790d c8790d = (C8790d) obj;
            String str = c8790d.f46629a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8790d.f46630b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = c8790d.f46631c;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            String str4 = c8790d.f46632d;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str4, 4);
            }
            interfaceC7920f.mo13192F0(c8790d.f46633e, 5);
            interfaceC7920f.mo13192F0(c8790d.f46634f, 6);
            interfaceC7920f.mo13192F0(c8790d.f46635g, 7);
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
            String str5 = c8790d.f46629a;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str5, 10);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$f */
    public class f implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChallengeRanking f8691a;

        public f(ChallengeRanking challengeRanking) {
            this.f8691a = challengeRanking;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1493o c1493o = C1493o.this;
            RoomDatabase roomDatabase = c1493o.f8679a;
            roomDatabase.m4552c();
            try {
                c1493o.f8680b.m13169e(this.f8691a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$g */
    public class g implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8693a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8694b;

        public g(String str, String str2) {
            this.f8693a = str;
            this.f8694b = str2;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1493o c1493o = C1493o.this;
            o oVar = c1493o.f8681c;
            InterfaceC7920f interfaceC7920fM4574a = oVar.m4574a();
            String str = this.f8693a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            String str2 = this.f8694b;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 2);
            }
            RoomDatabase roomDatabase = c1493o.f8679a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                oVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                oVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$h */
    public class h implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8696a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8697b;

        public h(String str, String str2) {
            this.f8696a = str;
            this.f8697b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1493o c1493o = C1493o.this;
            p pVar = c1493o.f8682d;
            InterfaceC7920f interfaceC7920fM4574a = pVar.m4574a();
            String str = this.f8696a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            String str2 = this.f8697b;
            if (str2 == null) {
                interfaceC7920fM4574a.mo13193J0(2);
            } else {
                interfaceC7920fM4574a.mo13197h0(str2, 2);
            }
            RoomDatabase roomDatabase = c1493o.f8679a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                pVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                pVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Challenge` WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((C8788b) obj).f46598a);
        }
    }

    /* JADX INFO: renamed from: bi.o$j */
    public class j implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8699a;

        public j(ArrayList arrayList) {
            this.f8699a = arrayList;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1493o c1493o = C1493o.this;
            RoomDatabase roomDatabase = c1493o.f8679a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1493o.f8685g.m1228p(this.f8699a);
                roomDatabase.m4568s();
                return listBuilderM1228p;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$k */
    public class k implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8790d f8701a;

        public k(C8790d c8790d) {
            this.f8701a = c8790d;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1493o c1493o = C1493o.this;
            RoomDatabase roomDatabase = c1493o.f8679a;
            RoomDatabase roomDatabase2 = c1493o.f8679a;
            roomDatabase.m4552c();
            try {
                c1493o.f8689k.m1225m(this.f8701a);
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

    /* JADX INFO: renamed from: bi.o$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `ChallengeRanking` WHERE `challengeCode` = ? AND `metric` = ? AND `rank` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            ChallengeRanking challengeRanking = (ChallengeRanking) obj;
            String str = challengeRanking.f16918a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = challengeRanking.f16919b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, challengeRanking.f16920c);
            String str3 = challengeRanking.f16921d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$m */
    public class m implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8703a;

        public m(C6595o c6595o) {
            this.f8703a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            RoomDatabase roomDatabase = C1493o.this.f8679a;
            C6595o c6595o = this.f8703a;
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

    /* JADX INFO: renamed from: bi.o$n */
    public class n implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8705a;

        public n(C6595o c6595o) {
            this.f8705a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            RoomDatabase roomDatabase = C1493o.this.f8679a;
            C6595o c6595o = this.f8705a;
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

    /* JADX INFO: renamed from: bi.o$o */
    public class o extends SharedSQLiteStatement {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Challenge SET isJoined = 1 WHERE language = ? AND code = ?";
        }
    }

    /* JADX INFO: renamed from: bi.o$p */
    public class p extends SharedSQLiteStatement {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Challenge SET isJoined = 0 WHERE language = ? AND code = ?";
        }
    }

    /* JADX INFO: renamed from: bi.o$q */
    public class q extends SharedSQLiteStatement {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Challenge SET participantsCount = ? WHERE language = ? AND code = ?";
        }
    }

    /* JADX INFO: renamed from: bi.o$r */
    public class r extends SharedSQLiteStatement {
        public r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE ChallengeRanking SET rank = rank - 1 WHERE rank > ? AND language = ? AND challengeCode = ?";
        }
    }

    /* JADX INFO: renamed from: bi.o$s */
    public class s extends AbstractC6583c {
        public s(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Challenge` (`pk`,`code`,`title`,`challengeType`,`description`,`prize`,`startDate`,`endDate`,`language`,`timeLeft`,`isPermanent`,`participantsCount`,`isDisabled`,`isActive`,`badge`,`badgeUrl`,`duration`,`contextParticipants`,`screenTitle`,`socialSettings`,`isCompleted`,`isPast`,`isJoined`,`rank`,`order`,`knownWords`,`challengeLanguage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8788b c8788b = (C8788b) obj;
            interfaceC7920f.mo13194W(1, c8788b.f46598a);
            String str = c8788b.f46599b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = c8788b.f46600c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = c8788b.f46601d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = c8788b.f46602e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = c8788b.f46603f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = c8788b.f46604g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            String str7 = c8788b.f46605h;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str7, 8);
            }
            String str8 = c8788b.f46606i;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str8, 9);
            }
            String str9 = c8788b.f46607j;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str9, 10);
            }
            interfaceC7920f.mo13194W(11, c8788b.f46608k ? 1L : 0L);
            interfaceC7920f.mo13194W(12, c8788b.f46609l);
            interfaceC7920f.mo13194W(13, c8788b.f46610m ? 1L : 0L);
            interfaceC7920f.mo13194W(14, c8788b.f46611n ? 1L : 0L);
            String str10 = c8788b.f46612o;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str10, 15);
            }
            String str11 = c8788b.f46613p;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str11, 16);
            }
            interfaceC7920f.mo13194W(17, c8788b.f46614q);
            interfaceC7920f.mo13194W(18, c8788b.f46615r);
            String str12 = c8788b.f46616s;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(19);
            } else {
                interfaceC7920f.mo13197h0(str12, 19);
            }
            interfaceC7920f.mo13197h0(C1493o.this.f8686h.f8356a.m10563a(SocialSettings.class).m10535e(c8788b.f46617t), 20);
            interfaceC7920f.mo13194W(21, c8788b.f46618u ? 1L : 0L);
            interfaceC7920f.mo13194W(22, c8788b.f46619v ? 1L : 0L);
            interfaceC7920f.mo13194W(23, c8788b.f46620w ? 1L : 0L);
            interfaceC7920f.mo13194W(24, c8788b.f46621x);
            interfaceC7920f.mo13194W(25, c8788b.f46622y);
            interfaceC7920f.mo13194W(26, c8788b.f46623z);
            String str13 = c8788b.f46597A;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(27);
            } else {
                interfaceC7920f.mo13197h0(str13, 27);
            }
        }
    }

    /* JADX INFO: renamed from: bi.o$t */
    public class t extends AbstractC6583c {
        public t(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Challenge` SET `pk` = ?,`code` = ?,`title` = ?,`challengeType` = ?,`description` = ?,`prize` = ?,`startDate` = ?,`endDate` = ?,`language` = ?,`timeLeft` = ?,`isPermanent` = ?,`participantsCount` = ?,`isDisabled` = ?,`isActive` = ?,`badge` = ?,`badgeUrl` = ?,`duration` = ?,`contextParticipants` = ?,`screenTitle` = ?,`socialSettings` = ?,`isCompleted` = ?,`isPast` = ?,`isJoined` = ?,`rank` = ?,`order` = ?,`knownWords` = ?,`challengeLanguage` = ? WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8788b c8788b = (C8788b) obj;
            interfaceC7920f.mo13194W(1, c8788b.f46598a);
            String str = c8788b.f46599b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = c8788b.f46600c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = c8788b.f46601d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = c8788b.f46602e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = c8788b.f46603f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = c8788b.f46604g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            String str7 = c8788b.f46605h;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str7, 8);
            }
            String str8 = c8788b.f46606i;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str8, 9);
            }
            String str9 = c8788b.f46607j;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str9, 10);
            }
            interfaceC7920f.mo13194W(11, c8788b.f46608k ? 1L : 0L);
            interfaceC7920f.mo13194W(12, c8788b.f46609l);
            interfaceC7920f.mo13194W(13, c8788b.f46610m ? 1L : 0L);
            interfaceC7920f.mo13194W(14, c8788b.f46611n ? 1L : 0L);
            String str10 = c8788b.f46612o;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str10, 15);
            }
            String str11 = c8788b.f46613p;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str11, 16);
            }
            interfaceC7920f.mo13194W(17, c8788b.f46614q);
            interfaceC7920f.mo13194W(18, c8788b.f46615r);
            String str12 = c8788b.f46616s;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(19);
            } else {
                interfaceC7920f.mo13197h0(str12, 19);
            }
            interfaceC7920f.mo13197h0(C1493o.this.f8686h.f8356a.m10563a(SocialSettings.class).m10535e(c8788b.f46617t), 20);
            interfaceC7920f.mo13194W(21, c8788b.f46618u ? 1L : 0L);
            interfaceC7920f.mo13194W(22, c8788b.f46619v ? 1L : 0L);
            interfaceC7920f.mo13194W(23, c8788b.f46620w ? 1L : 0L);
            interfaceC7920f.mo13194W(24, c8788b.f46621x);
            interfaceC7920f.mo13194W(25, c8788b.f46622y);
            interfaceC7920f.mo13194W(26, c8788b.f46623z);
            String str13 = c8788b.f46597A;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(27);
            } else {
                interfaceC7920f.mo13197h0(str13, 27);
            }
            interfaceC7920f.mo13194W(28, c8788b.f46598a);
        }
    }

    /* JADX INFO: renamed from: bi.o$u */
    public class u extends AbstractC6583c {
        public u(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `ChallengeRanking` (`challengeCode`,`metric`,`rank`,`language`,`profile`,`score`,`scoreBehindLeader`,`isCompleted`) VALUES (?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            ChallengeRanking challengeRanking = (ChallengeRanking) obj;
            String str = challengeRanking.f16918a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = challengeRanking.f16919b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, challengeRanking.f16920c);
            String str3 = challengeRanking.f16921d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13197h0(C1493o.this.f8686h.f8356a.m10563a(ChallengeProfile.class).m10535e(challengeRanking.f16922e), 5);
            interfaceC7920f.mo13194W(6, challengeRanking.f16923f);
            interfaceC7920f.mo13194W(7, challengeRanking.f16924g);
            interfaceC7920f.mo13194W(8, challengeRanking.f16925h ? 1L : 0L);
        }
    }

    public C1493o(RoomDatabase roomDatabase) {
        this.f8679a = roomDatabase;
        new i(roomDatabase);
        this.f8680b = new l(roomDatabase);
        this.f8681c = new o(roomDatabase);
        this.f8682d = new p(roomDatabase);
        this.f8683e = new q(roomDatabase);
        this.f8684f = new r(roomDatabase);
        this.f8685g = new C0322j(new s(roomDatabase), new t(roomDatabase));
        this.f8687i = new C0322j(new u(roomDatabase), new a(roomDatabase));
        this.f8688j = new C0322j(new b(roomDatabase), new c(roomDatabase));
        this.f8689k = new C0322j(new d(roomDatabase), new e(roomDatabase));
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: A0 */
    public final Object mo5108A0(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new g(str, str2), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: B0 */
    public final Object mo5109B0(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new h(str, str2), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: C0 */
    public final Object mo5110C0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new CallableC1507q(this, i10, str, str2), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: D0 */
    public final Object mo5111D0(int i10, String str, String str2, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8679a, new CallableC1500p(this, i10, str, str2), continuationImpl);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new CallableC1514r(this, (C8788b) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends C8788b> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new j((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: k0 */
    public final Object mo5112k0(ChallengeRanking challengeRanking, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new f(challengeRanking), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5113l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `code`, `title`, `challengeType`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isPast`, `isJoined`, `rank`, `knownWords`, `challengeLanguage` FROM (SELECT * FROM Challenge WHERE language = ? AND isPast = 0 ORDER BY isJoined DESC, `order`)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1542v callableC1542v = new CallableC1542v(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, true, new String[]{"Challenge"}, callableC1542v);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo5114m0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `socialSettings`, `isPast`, `isJoined`, `rank` FROM (SELECT * FROM Challenge WHERE language = ? AND code = ?)", 2);
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
        CallableC1563y callableC1563y = new CallableC1563y(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, false, new String[]{"Challenge"}, callableC1563y);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5115n0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `code`, `value` FROM (SELECT * FROM ChallengeDetailStats WHERE language = ? AND challengeCode = ?)", 2);
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
        CallableC1389a0 callableC1389a0 = new CallableC1389a0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, true, new String[]{"ChallengeDetailStats"}, callableC1389a0);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5116o0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `title`, `progress`, `actual`, `target` FROM (SELECT * FROM ChallengeStats WHERE language = ? AND challengeCode = ?)", 2);
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
        CallableC1397b0 callableC1397b0 = new CallableC1397b0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, true, new String[]{"ChallengeStats"}, callableC1397b0);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: p0 */
    public final C7136q mo5117p0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `socialSettings`, `isPast`, `isJoined`, `rank` FROM (SELECT * FROM Challenge WHERE language = ? AND  (code LIKE  '%_' || ? OR (challengeType = 'monthly_lingqing' OR challengeType = 'ninety_days' OR challengeType = 'streak_days'))  AND isPast = 0  ORDER BY isJoined DESC, `order` LIMIT ?)", 3);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        c6595oM13191l.mo13194W(3, i10);
        return C1185b.m4579a(this.f8679a, true, new String[]{"Challenge"}, new CallableC1556x(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: q0 */
    public final C7136q mo5118q0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `code`, `title`, `challengeType`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isPast`, `isJoined`, `rank`, `knownWords`, `challengeLanguage` FROM (SELECT * FROM Challenge WHERE language = ? AND isPast = 1 ORDER BY `order`)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1549w callableC1549w = new CallableC1549w(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, true, new String[]{"Challenge"}, callableC1549w);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: r0 */
    public final C7136q mo5119r0(String str, String str2, String str3) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `rank`, `profile`, `score`, `scoreBehindLeader` FROM (SELECT * FROM ChallengeRanking WHERE language = ? AND challengeCode = ? AND metric = ? ORDER BY rank)", 3);
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
        CallableC1570z callableC1570z = new CallableC1570z(this, c6595oM13191l);
        return C1185b.m4579a(this.f8679a, true, new String[]{"ChallengeRanking"}, callableC1570z);
    }

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
    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: s0 */
    public final ChallengeDetail mo5120s0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `socialSettings`, `isPast`, `isJoined`, `rank` FROM (SELECT * FROM Challenge WHERE language = ? AND code = ?)", 2);
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
        RoomDatabase roomDatabase = this.f8679a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            ChallengeDetail challengeDetail = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                String string5 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                String string6 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                String string7 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                int i11 = cursorM16698S0.getInt(7);
                String string8 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                if (!cursorM16698S0.isNull(9)) {
                    string = cursorM16698S0.getString(9);
                }
                challengeDetail = new ChallengeDetail(i10, string2, string3, string5, string6, string7, string4, i11, cursorM16698S0.getInt(10) != 0, string8, cursorM16698S0.getInt(11) != 0, cursorM16698S0.getInt(12), this.f8686h.m4998h(string));
            }
            return challengeDetail;
        } finally {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
        }
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: t0 */
    public final Object mo5121t0(String str, String str2, InterfaceC9968c<? super Integer> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `order` FROM Challenge WHERE language = ? AND code = ? LIMIT 1", 2);
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
        return C1185b.m4581c(this.f8679a, false, new CancellationSignal(), new n(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: u0 */
    public final Object mo5122u0(String str, InterfaceC9968c<? super Integer> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `order` FROM Challenge WHERE language = ? ORDER BY `order` DESC LIMIT 1", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8679a, false, new CancellationSignal(), new m(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: v0 */
    public final ArrayList mo5123v0(String str, int i10, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM ChallengeRanking WHERE language = ? AND challengeCode = ? AND profile LIKE '%' ||? || '%'", 3);
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
        c6595oM13191l.mo13194W(3, i10);
        RoomDatabase roomDatabase = this.f8679a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "challengeCode");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "metric");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "rank");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "language");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "profile");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "score");
                int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "scoreBehindLeader");
                int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                    int i11 = cursorM16698S0.getInt(iM16742n2);
                    String string4 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    if (!cursorM16698S0.isNull(iM16742n4)) {
                        string = cursorM16698S0.getString(iM16742n4);
                    }
                    C1405c0 c1405c0 = this.f8686h;
                    c1405c0.getClass();
                    C5207g.m11111f(string, "data");
                    Object objM10532b = c1405c0.f8356a.m10563a(ChallengeProfile.class).m10532b(string);
                    C5207g.m11108c(objM10532b);
                    arrayList.add(new ChallengeRanking(string2, string3, i11, string4, (ChallengeProfile) objM10532b, cursorM16698S0.getInt(iM16742n5), cursorM16698S0.getInt(iM16742n6), cursorM16698S0.getInt(iM16742n7) != 0));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                c6595oM13191l.m13198q();
                roomDatabase.m4563n();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595oM13191l.m13198q();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: w0 */
    public final Object mo5124w0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new CallableC1528t(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: x0 */
    public final Object mo5125x0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new CallableC1521s(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: y0 */
    public final Object mo5126y0(C8790d c8790d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new k(c8790d), interfaceC9968c);
    }

    @Override // bi.AbstractC1486n
    /* JADX INFO: renamed from: z0 */
    public final Object mo5127z0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8679a, new CallableC1535u(this, arrayList), interfaceC9968c);
    }
}
