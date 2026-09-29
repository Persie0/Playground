package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import p026b5.C1309b;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6619u implements InterfaceC6618t {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37546a;

    /* JADX INFO: renamed from: b */
    public final e f37547b;

    /* JADX INFO: renamed from: c */
    public final g f37548c;

    /* JADX INFO: renamed from: d */
    public final h f37549d;

    /* JADX INFO: renamed from: e */
    public final i f37550e;

    /* JADX INFO: renamed from: f */
    public final j f37551f;

    /* JADX INFO: renamed from: g */
    public final k f37552g;

    /* JADX INFO: renamed from: h */
    public final l f37553h;

    /* JADX INFO: renamed from: i */
    public final m f37554i;

    /* JADX INFO: renamed from: j */
    public final a f37555j;

    /* JADX INFO: renamed from: k */
    public final b f37556k;

    /* JADX INFO: renamed from: k5.u$a */
    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$b */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: k5.u$c */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: renamed from: k5.u$d */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) throws Throwable {
            int i10;
            C6617s c6617s = (C6617s) obj;
            String str = c6617s.f37524a;
            int i11 = 1;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, C6623y.m13254h(c6617s.f37525b));
            String str2 = c6617s.f37526c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = c6617s.f37527d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            byte[] bArrM4703f = C1244b.m4703f(c6617s.f37528e);
            if (bArrM4703f == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13199r0(bArrM4703f, 5);
            }
            byte[] bArrM4703f2 = C1244b.m4703f(c6617s.f37529f);
            if (bArrM4703f2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13199r0(bArrM4703f2, 6);
            }
            interfaceC7920f.mo13194W(7, c6617s.f37530g);
            interfaceC7920f.mo13194W(8, c6617s.f37531h);
            interfaceC7920f.mo13194W(9, c6617s.f37532i);
            interfaceC7920f.mo13194W(10, c6617s.f37534k);
            BackoffPolicy backoffPolicy = c6617s.f37535l;
            C5207g.m11111f(backoffPolicy, "backoffPolicy");
            int i12 = C6623y.a.f37562b[backoffPolicy.ordinal()];
            if (i12 == 1) {
                i10 = 0;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 1;
            }
            interfaceC7920f.mo13194W(11, i10);
            interfaceC7920f.mo13194W(12, c6617s.f37536m);
            interfaceC7920f.mo13194W(13, c6617s.f37537n);
            interfaceC7920f.mo13194W(14, c6617s.f37538o);
            interfaceC7920f.mo13194W(15, c6617s.f37539p);
            interfaceC7920f.mo13194W(16, c6617s.f37540q ? 1L : 0L);
            OutOfQuotaPolicy outOfQuotaPolicy = c6617s.f37541r;
            C5207g.m11111f(outOfQuotaPolicy, "policy");
            int i13 = C6623y.a.f37564d[outOfQuotaPolicy.ordinal()];
            if (i13 == 1) {
                i11 = 0;
            } else if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC7920f.mo13194W(17, i11);
            interfaceC7920f.mo13194W(18, c6617s.f37542s);
            interfaceC7920f.mo13194W(19, c6617s.f37543t);
            C1309b c1309b = c6617s.f37533j;
            if (c1309b != null) {
                interfaceC7920f.mo13194W(20, C6623y.m13252f(c1309b.f8046a));
                interfaceC7920f.mo13194W(21, c1309b.f8047b ? 1L : 0L);
                interfaceC7920f.mo13194W(22, c1309b.f8048c ? 1L : 0L);
                interfaceC7920f.mo13194W(23, c1309b.f8049d ? 1L : 0L);
                interfaceC7920f.mo13194W(24, c1309b.f8050e ? 1L : 0L);
                interfaceC7920f.mo13194W(25, c1309b.f8051f);
                interfaceC7920f.mo13194W(26, c1309b.f8052g);
                interfaceC7920f.mo13199r0(C6623y.m13253g(c1309b.f8053h), 27);
                return;
            }
            interfaceC7920f.mo13193J0(20);
            interfaceC7920f.mo13193J0(21);
            interfaceC7920f.mo13193J0(22);
            interfaceC7920f.mo13193J0(23);
            interfaceC7920f.mo13193J0(24);
            interfaceC7920f.mo13193J0(25);
            interfaceC7920f.mo13193J0(26);
            interfaceC7920f.mo13193J0(27);
        }
    }

    /* JADX INFO: renamed from: k5.u$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) throws Throwable {
            int i10;
            C6617s c6617s = (C6617s) obj;
            String str = c6617s.f37524a;
            int i11 = 1;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, C6623y.m13254h(c6617s.f37525b));
            String str2 = c6617s.f37526c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = c6617s.f37527d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            byte[] bArrM4703f = C1244b.m4703f(c6617s.f37528e);
            if (bArrM4703f == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13199r0(bArrM4703f, 5);
            }
            byte[] bArrM4703f2 = C1244b.m4703f(c6617s.f37529f);
            if (bArrM4703f2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13199r0(bArrM4703f2, 6);
            }
            interfaceC7920f.mo13194W(7, c6617s.f37530g);
            interfaceC7920f.mo13194W(8, c6617s.f37531h);
            interfaceC7920f.mo13194W(9, c6617s.f37532i);
            interfaceC7920f.mo13194W(10, c6617s.f37534k);
            BackoffPolicy backoffPolicy = c6617s.f37535l;
            C5207g.m11111f(backoffPolicy, "backoffPolicy");
            int i12 = C6623y.a.f37562b[backoffPolicy.ordinal()];
            if (i12 == 1) {
                i10 = 0;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 1;
            }
            interfaceC7920f.mo13194W(11, i10);
            interfaceC7920f.mo13194W(12, c6617s.f37536m);
            interfaceC7920f.mo13194W(13, c6617s.f37537n);
            interfaceC7920f.mo13194W(14, c6617s.f37538o);
            interfaceC7920f.mo13194W(15, c6617s.f37539p);
            interfaceC7920f.mo13194W(16, c6617s.f37540q ? 1L : 0L);
            OutOfQuotaPolicy outOfQuotaPolicy = c6617s.f37541r;
            C5207g.m11111f(outOfQuotaPolicy, "policy");
            int i13 = C6623y.a.f37564d[outOfQuotaPolicy.ordinal()];
            if (i13 == 1) {
                i11 = 0;
            } else if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC7920f.mo13194W(17, i11);
            interfaceC7920f.mo13194W(18, c6617s.f37542s);
            interfaceC7920f.mo13194W(19, c6617s.f37543t);
            C1309b c1309b = c6617s.f37533j;
            if (c1309b != null) {
                interfaceC7920f.mo13194W(20, C6623y.m13252f(c1309b.f8046a));
                interfaceC7920f.mo13194W(21, c1309b.f8047b ? 1L : 0L);
                interfaceC7920f.mo13194W(22, c1309b.f8048c ? 1L : 0L);
                interfaceC7920f.mo13194W(23, c1309b.f8049d ? 1L : 0L);
                interfaceC7920f.mo13194W(24, c1309b.f8050e ? 1L : 0L);
                interfaceC7920f.mo13194W(25, c1309b.f8051f);
                interfaceC7920f.mo13194W(26, c1309b.f8052g);
                interfaceC7920f.mo13199r0(C6623y.m13253g(c1309b.f8053h), 27);
            } else {
                interfaceC7920f.mo13193J0(20);
                interfaceC7920f.mo13193J0(21);
                interfaceC7920f.mo13193J0(22);
                interfaceC7920f.mo13193J0(23);
                interfaceC7920f.mo13193J0(24);
                interfaceC7920f.mo13193J0(25);
                interfaceC7920f.mo13193J0(26);
                interfaceC7920f.mo13193J0(27);
            }
            String str4 = c6617s.f37524a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(28);
            } else {
                interfaceC7920f.mo13197h0(str4, 28);
            }
        }
    }

    /* JADX INFO: renamed from: k5.u$g */
    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$h */
    public class h extends SharedSQLiteStatement {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$i */
    public class i extends SharedSQLiteStatement {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$j */
    public class j extends SharedSQLiteStatement {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$k */
    public class k extends SharedSQLiteStatement {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$l */
    public class l extends SharedSQLiteStatement {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: k5.u$m */
    public class m extends SharedSQLiteStatement {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public C6619u(RoomDatabase roomDatabase) {
        this.f37546a = roomDatabase;
        this.f37547b = new e(roomDatabase);
        new f(roomDatabase);
        this.f37548c = new g(roomDatabase);
        this.f37549d = new h(roomDatabase);
        this.f37550e = new i(roomDatabase);
        this.f37551f = new j(roomDatabase);
        this.f37552g = new k(roomDatabase);
        this.f37553h = new l(roomDatabase);
        this.f37554i = new m(roomDatabase);
        this.f37555j = new a(roomDatabase);
        this.f37556k = new b(roomDatabase);
        new c(roomDatabase);
        new d(roomDatabase);
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: a */
    public final void mo13223a(String str) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        g gVar = this.f37548c;
        InterfaceC7920f interfaceC7920fM4574a = gVar.m4574a();
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } finally {
            roomDatabase.m4563n();
            gVar.m4576c(interfaceC7920fM4574a);
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: b */
    public final ArrayList mo13224b() throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        c6595oM13191l.mo13194W(1, 200);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                int i10 = iM16742n13;
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j10 = cursorM16698S0.getLong(iM16742n6);
                    long j11 = cursorM16698S0.getLong(iM16742n7);
                    long j12 = cursorM16698S0.getLong(iM16742n8);
                    int i11 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j13 = cursorM16698S0.getLong(iM16742n11);
                    long j14 = cursorM16698S0.getLong(iM16742n12);
                    int i12 = i10;
                    long j15 = cursorM16698S0.getLong(i12);
                    int i13 = iM16742n0;
                    int i14 = iM16742n14;
                    long j16 = cursorM16698S0.getLong(i14);
                    iM16742n14 = i14;
                    iM16742n15 = iM16742n15;
                    boolean z10 = cursorM16698S0.getInt(iM16742n15) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(iM16742n16));
                    iM16742n16 = iM16742n16;
                    int i15 = iM16742n17;
                    int i16 = cursorM16698S0.getInt(i15);
                    iM16742n17 = i15;
                    int i17 = iM16742n18;
                    int i18 = cursorM16698S0.getInt(i17);
                    iM16742n18 = i17;
                    int i19 = iM16742n19;
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(i19));
                    iM16742n19 = i19;
                    iM16742n20 = iM16742n20;
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j17 = cursorM16698S0.getLong(iM16742n24);
                    iM16742n24 = iM16742n24;
                    int i20 = iM16742n25;
                    long j18 = cursorM16698S0.getLong(i20);
                    iM16742n25 = i20;
                    int i21 = iM16742n26;
                    if (!cursorM16698S0.isNull(i21)) {
                        blob = cursorM16698S0.getBlob(i21);
                    }
                    iM16742n26 = i21;
                    arrayList.add(new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j10, j11, j12, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j17, j18, C6623y.m13247a(blob)), i11, backoffPolicyM13248b, j13, j14, j15, j16, z10, outOfQuotaPolicyM13250d, i16, i18));
                    iM16742n0 = i13;
                    i10 = i12;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: c */
    public final void mo13225c(String str) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        i iVar = this.f37550e;
        InterfaceC7920f interfaceC7920fM4574a = iVar.m4574a();
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            iVar.m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            iVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: d */
    public final int mo13226d(String str, long j10) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        a aVar = this.f37555j;
        InterfaceC7920f interfaceC7920fM4574a = aVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, j10);
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        roomDatabase.m4552c();
        try {
            int iMo15736A = interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            return iMo15736A;
        } finally {
            roomDatabase.m4563n();
            aVar.m4576c(interfaceC7920fM4574a);
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: e */
    public final ArrayList mo13227e(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
            while (cursorM16698S0.moveToNext()) {
                arrayList.add(new C6617s.a(C6623y.m13251e(cursorM16698S0.getInt(1)), cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0)));
            }
            return arrayList;
        } finally {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: f */
    public final ArrayList mo13228f(long j10) throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        c6595oM13191l.mo13194W(1, j10);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                int i10 = iM16742n13;
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j11 = cursorM16698S0.getLong(iM16742n6);
                    long j12 = cursorM16698S0.getLong(iM16742n7);
                    long j13 = cursorM16698S0.getLong(iM16742n8);
                    int i11 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j14 = cursorM16698S0.getLong(iM16742n11);
                    long j15 = cursorM16698S0.getLong(iM16742n12);
                    int i12 = i10;
                    long j16 = cursorM16698S0.getLong(i12);
                    int i13 = iM16742n0;
                    int i14 = iM16742n14;
                    long j17 = cursorM16698S0.getLong(i14);
                    iM16742n14 = i14;
                    int i15 = iM16742n15;
                    int i16 = cursorM16698S0.getInt(i15);
                    iM16742n15 = i15;
                    int i17 = iM16742n16;
                    boolean z10 = i16 != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(i17));
                    iM16742n16 = i17;
                    int i18 = iM16742n17;
                    int i19 = cursorM16698S0.getInt(i18);
                    iM16742n17 = i18;
                    int i20 = iM16742n18;
                    int i21 = cursorM16698S0.getInt(i20);
                    iM16742n18 = i20;
                    int i22 = iM16742n19;
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(i22));
                    iM16742n19 = i22;
                    iM16742n20 = iM16742n20;
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j18 = cursorM16698S0.getLong(iM16742n24);
                    iM16742n24 = iM16742n24;
                    int i23 = iM16742n25;
                    long j19 = cursorM16698S0.getLong(i23);
                    iM16742n25 = i23;
                    int i24 = iM16742n26;
                    if (!cursorM16698S0.isNull(i24)) {
                        blob = cursorM16698S0.getBlob(i24);
                    }
                    iM16742n26 = i24;
                    arrayList.add(new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j11, j12, j13, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j18, j19, C6623y.m13247a(blob)), i11, backoffPolicyM13248b, j14, j15, j16, j17, z10, outOfQuotaPolicyM13250d, i19, i21));
                    iM16742n0 = i13;
                    i10 = i12;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: g */
    public final ArrayList mo13229g(int i10) throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c6595oM13191l.mo13194W(1, i10);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                int i11 = iM16742n13;
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j10 = cursorM16698S0.getLong(iM16742n6);
                    long j11 = cursorM16698S0.getLong(iM16742n7);
                    long j12 = cursorM16698S0.getLong(iM16742n8);
                    int i12 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j13 = cursorM16698S0.getLong(iM16742n11);
                    long j14 = cursorM16698S0.getLong(iM16742n12);
                    int i13 = i11;
                    long j15 = cursorM16698S0.getLong(i13);
                    int i14 = iM16742n0;
                    int i15 = iM16742n14;
                    long j16 = cursorM16698S0.getLong(i15);
                    iM16742n14 = i15;
                    iM16742n15 = iM16742n15;
                    boolean z10 = cursorM16698S0.getInt(iM16742n15) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(iM16742n16));
                    iM16742n16 = iM16742n16;
                    int i16 = iM16742n17;
                    int i17 = cursorM16698S0.getInt(i16);
                    iM16742n17 = i16;
                    int i18 = iM16742n18;
                    int i19 = cursorM16698S0.getInt(i18);
                    iM16742n18 = i18;
                    int i20 = iM16742n19;
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(i20));
                    iM16742n19 = i20;
                    iM16742n20 = iM16742n20;
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j17 = cursorM16698S0.getLong(iM16742n24);
                    iM16742n24 = iM16742n24;
                    int i21 = iM16742n25;
                    long j18 = cursorM16698S0.getLong(i21);
                    iM16742n25 = i21;
                    int i22 = iM16742n26;
                    if (!cursorM16698S0.isNull(i22)) {
                        blob = cursorM16698S0.getBlob(i22);
                    }
                    iM16742n26 = i22;
                    arrayList.add(new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j10, j11, j12, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j17, j18, C6623y.m13247a(blob)), i12, backoffPolicyM13248b, j13, j14, j15, j16, z10, outOfQuotaPolicyM13250d, i17, i19));
                    iM16742n0 = i14;
                    i11 = i13;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: h */
    public final int mo13230h(WorkInfo$State workInfo$State, String str) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        h hVar = this.f37549d;
        InterfaceC7920f interfaceC7920fM4574a = hVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, C6623y.m13254h(workInfo$State));
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        roomDatabase.m4552c();
        try {
            int iMo15736A = interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            return iMo15736A;
        } finally {
            roomDatabase.m4563n();
            hVar.m4576c(interfaceC7920fM4574a);
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: i */
    public final ArrayList mo13231i() throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                int i10 = iM16742n13;
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j10 = cursorM16698S0.getLong(iM16742n6);
                    long j11 = cursorM16698S0.getLong(iM16742n7);
                    long j12 = cursorM16698S0.getLong(iM16742n8);
                    int i11 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j13 = cursorM16698S0.getLong(iM16742n11);
                    long j14 = cursorM16698S0.getLong(iM16742n12);
                    int i12 = i10;
                    long j15 = cursorM16698S0.getLong(i12);
                    int i13 = iM16742n0;
                    int i14 = iM16742n14;
                    long j16 = cursorM16698S0.getLong(i14);
                    iM16742n14 = i14;
                    iM16742n15 = iM16742n15;
                    boolean z10 = cursorM16698S0.getInt(iM16742n15) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(iM16742n16));
                    iM16742n16 = iM16742n16;
                    int i15 = iM16742n17;
                    int i16 = cursorM16698S0.getInt(i15);
                    iM16742n17 = i15;
                    int i17 = iM16742n18;
                    int i18 = cursorM16698S0.getInt(i17);
                    iM16742n18 = i17;
                    int i19 = iM16742n19;
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(i19));
                    iM16742n19 = i19;
                    iM16742n20 = iM16742n20;
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j17 = cursorM16698S0.getLong(iM16742n24);
                    iM16742n24 = iM16742n24;
                    int i20 = iM16742n25;
                    long j18 = cursorM16698S0.getLong(i20);
                    iM16742n25 = i20;
                    int i21 = iM16742n26;
                    if (!cursorM16698S0.isNull(i21)) {
                        blob = cursorM16698S0.getBlob(i21);
                    }
                    iM16742n26 = i21;
                    arrayList.add(new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j10, j11, j12, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j17, j18, C6623y.m13247a(blob)), i11, backoffPolicyM13248b, j13, j14, j15, j16, z10, outOfQuotaPolicyM13250d, i16, i18));
                    iM16742n0 = i13;
                    i10 = i12;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: j */
    public final void mo13232j(String str, C1244b c1244b) throws Throwable {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        j jVar = this.f37551f;
        InterfaceC7920f interfaceC7920fM4574a = jVar.m4574a();
        byte[] bArrM4703f = C1244b.m4703f(c1244b);
        if (bArrM4703f == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13199r0(bArrM4703f, 1);
        }
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            jVar.m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            jVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: k */
    public final ArrayList mo13233k() throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE state=1", 0);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                int i10 = iM16742n13;
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j10 = cursorM16698S0.getLong(iM16742n6);
                    long j11 = cursorM16698S0.getLong(iM16742n7);
                    long j12 = cursorM16698S0.getLong(iM16742n8);
                    int i11 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j13 = cursorM16698S0.getLong(iM16742n11);
                    long j14 = cursorM16698S0.getLong(iM16742n12);
                    int i12 = i10;
                    long j15 = cursorM16698S0.getLong(i12);
                    int i13 = iM16742n0;
                    int i14 = iM16742n14;
                    long j16 = cursorM16698S0.getLong(i14);
                    iM16742n14 = i14;
                    iM16742n15 = iM16742n15;
                    boolean z10 = cursorM16698S0.getInt(iM16742n15) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(iM16742n16));
                    iM16742n16 = iM16742n16;
                    int i15 = iM16742n17;
                    int i16 = cursorM16698S0.getInt(i15);
                    iM16742n17 = i15;
                    int i17 = iM16742n18;
                    int i18 = cursorM16698S0.getInt(i17);
                    iM16742n18 = i17;
                    int i19 = iM16742n19;
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(i19));
                    iM16742n19 = i19;
                    iM16742n20 = iM16742n20;
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j17 = cursorM16698S0.getLong(iM16742n24);
                    iM16742n24 = iM16742n24;
                    int i20 = iM16742n25;
                    long j18 = cursorM16698S0.getLong(i20);
                    iM16742n25 = i20;
                    int i21 = iM16742n26;
                    if (!cursorM16698S0.isNull(i21)) {
                        blob = cursorM16698S0.getBlob(i21);
                    }
                    iM16742n26 = i21;
                    arrayList.add(new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j10, j11, j12, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j17, j18, C6623y.m13247a(blob)), i11, backoffPolicyM13248b, j13, j14, j15, j16, z10, outOfQuotaPolicyM13250d, i16, i18));
                    iM16742n0 = i13;
                    i10 = i12;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: l */
    public final boolean mo13234l() {
        boolean z10 = false;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            if (cursorM16698S0.moveToFirst() && cursorM16698S0.getInt(0) != 0) {
                z10 = true;
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return z10;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: m */
    public final ArrayList mo13235m(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
            while (cursorM16698S0.moveToNext()) {
                arrayList.add(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0));
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return arrayList;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: n */
    public final WorkInfo$State mo13236n(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            WorkInfo$State workInfo$StateM13251e = null;
            if (cursorM16698S0.moveToFirst()) {
                Integer numValueOf = cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
                if (numValueOf != null) {
                    workInfo$StateM13251e = C6623y.m13251e(numValueOf.intValue());
                }
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return workInfo$StateM13251e;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: o */
    public final C6617s mo13237o(String str) throws Throwable {
        C6595o c6595o;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "state");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "worker_class_name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "input_merger_class_name");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "input");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "output");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "initial_delay");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "interval_duration");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "flex_duration");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "run_attempt_count");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "backoff_policy");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "backoff_delay_duration");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "last_enqueue_time");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "minimum_retention_duration");
            c6595o = c6595oM13191l;
            try {
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "schedule_requested_at");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "run_in_foreground");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "out_of_quota_policy");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "period_count");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "generation");
                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "required_network_type");
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "requires_charging");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "requires_device_idle");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "requires_battery_not_low");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "requires_storage_not_low");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "trigger_content_update_delay");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "trigger_max_content_delay");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "content_uri_triggers");
                C6617s c6617s = null;
                byte[] blob = null;
                if (cursorM16698S0.moveToFirst()) {
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    WorkInfo$State workInfo$StateM13251e = C6623y.m13251e(cursorM16698S0.getInt(iM16742n1));
                    String string2 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    C1244b c1244bM4702a = C1244b.m4702a(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getBlob(iM16742n4));
                    C1244b c1244bM4702a2 = C1244b.m4702a(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getBlob(iM16742n5));
                    long j10 = cursorM16698S0.getLong(iM16742n6);
                    long j11 = cursorM16698S0.getLong(iM16742n7);
                    long j12 = cursorM16698S0.getLong(iM16742n8);
                    int i10 = cursorM16698S0.getInt(iM16742n9);
                    BackoffPolicy backoffPolicyM13248b = C6623y.m13248b(cursorM16698S0.getInt(iM16742n10));
                    long j13 = cursorM16698S0.getLong(iM16742n11);
                    long j14 = cursorM16698S0.getLong(iM16742n12);
                    long j15 = cursorM16698S0.getLong(iM16742n13);
                    long j16 = cursorM16698S0.getLong(iM16742n14);
                    boolean z10 = cursorM16698S0.getInt(iM16742n15) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyM13250d = C6623y.m13250d(cursorM16698S0.getInt(iM16742n16));
                    int i11 = cursorM16698S0.getInt(iM16742n17);
                    int i12 = cursorM16698S0.getInt(iM16742n18);
                    NetworkType networkTypeM13249c = C6623y.m13249c(cursorM16698S0.getInt(iM16742n19));
                    boolean z11 = cursorM16698S0.getInt(iM16742n20) != 0;
                    boolean z12 = cursorM16698S0.getInt(iM16742n21) != 0;
                    boolean z13 = cursorM16698S0.getInt(iM16742n22) != 0;
                    boolean z14 = cursorM16698S0.getInt(iM16742n23) != 0;
                    long j17 = cursorM16698S0.getLong(iM16742n24);
                    long j18 = cursorM16698S0.getLong(iM16742n25);
                    if (!cursorM16698S0.isNull(iM16742n26)) {
                        blob = cursorM16698S0.getBlob(iM16742n26);
                    }
                    c6617s = new C6617s(string, workInfo$StateM13251e, string2, string3, c1244bM4702a, c1244bM4702a2, j10, j11, j12, new C1309b(networkTypeM13249c, z11, z12, z13, z14, j17, j18, C6623y.m13247a(blob)), i10, backoffPolicyM13248b, j13, j14, j15, j16, z10, outOfQuotaPolicyM13250d, i11, i12);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return c6617s;
            } catch (Throwable th2) {
                th = th2;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6595o = c6595oM13191l;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: p */
    public final int mo13238p(String str) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        m mVar = this.f37554i;
        InterfaceC7920f interfaceC7920fM4574a = mVar.m4574a();
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        roomDatabase.m4552c();
        try {
            int iMo15736A = interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            mVar.m4576c(interfaceC7920fM4574a);
            return iMo15736A;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            mVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: q */
    public final void mo13239q(String str, long j10) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        k kVar = this.f37552g;
        InterfaceC7920f interfaceC7920fM4574a = kVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, j10);
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } finally {
            roomDatabase.m4563n();
            kVar.m4576c(interfaceC7920fM4574a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: r */
    public final ArrayList mo13240r(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
            while (cursorM16698S0.moveToNext()) {
                arrayList.add(C1244b.m4702a(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getBlob(0)));
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return arrayList;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: s */
    public final int mo13241s(String str) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        l lVar = this.f37553h;
        InterfaceC7920f interfaceC7920fM4574a = lVar.m4574a();
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        roomDatabase.m4552c();
        try {
            int iMo15736A = interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            lVar.m4576c(interfaceC7920fM4574a);
            return iMo15736A;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            lVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: t */
    public final void mo13242t(C6617s c6617s) {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37547b.m13171g(c6617s);
            roomDatabase.m4568s();
        } finally {
            roomDatabase.m4563n();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6618t
    /* JADX INFO: renamed from: u */
    public final int mo13243u() {
        RoomDatabase roomDatabase = this.f37546a;
        roomDatabase.m4551b();
        b bVar = this.f37556k;
        InterfaceC7920f interfaceC7920fM4574a = bVar.m4574a();
        roomDatabase.m4552c();
        try {
            int iMo15736A = interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            bVar.m4576c(interfaceC7920fM4574a);
            return iMo15736A;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            bVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
