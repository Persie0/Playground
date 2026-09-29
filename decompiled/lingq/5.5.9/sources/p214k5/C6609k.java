package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import dm.C5207g;
import java.util.ArrayList;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6609k implements InterfaceC6608j {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37510a;

    /* JADX INFO: renamed from: b */
    public final a f37511b;

    /* JADX INFO: renamed from: c */
    public final b f37512c;

    /* JADX INFO: renamed from: d */
    public final c f37513d;

    /* JADX INFO: renamed from: k5.k$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C6607i c6607i = (C6607i) obj;
            String str = c6607i.f37507a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c6607i.f37508b);
            interfaceC7920f.mo13194W(3, c6607i.f37509c);
        }
    }

    /* JADX INFO: renamed from: k5.k$b */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* JADX INFO: renamed from: k5.k$c */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C6609k(RoomDatabase roomDatabase) {
        this.f37510a = roomDatabase;
        this.f37511b = new a(roomDatabase);
        this.f37512c = new b(roomDatabase);
        this.f37513d = new c(roomDatabase);
    }

    @Override // p214k5.InterfaceC6608j
    /* JADX INFO: renamed from: a */
    public final C6607i mo13209a(C6610l c6610l) {
        C5207g.m11111f(c6610l, "id");
        return m13214f(c6610l.f37514a, c6610l.f37515b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6608j
    /* JADX INFO: renamed from: b */
    public final ArrayList mo13210b() {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        RoomDatabase roomDatabase = this.f37510a;
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

    @Override // p214k5.InterfaceC6608j
    /* JADX INFO: renamed from: c */
    public final void mo13211c(C6610l c6610l) {
        m13215g(c6610l.f37514a, c6610l.f37515b);
    }

    @Override // p214k5.InterfaceC6608j
    /* JADX INFO: renamed from: d */
    public final void mo13212d(C6607i c6607i) {
        RoomDatabase roomDatabase = this.f37510a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37511b.m13171g(c6607i);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6608j
    /* JADX INFO: renamed from: e */
    public final void mo13213e(String str) {
        RoomDatabase roomDatabase = this.f37510a;
        roomDatabase.m4551b();
        c cVar = this.f37513d;
        InterfaceC7920f interfaceC7920fM4574a = cVar.m4574a();
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
            cVar.m4576c(interfaceC7920fM4574a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final C6607i m13214f(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        RoomDatabase roomDatabase = this.f37510a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "work_spec_id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "generation");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "system_id");
            String str2 = null;
            C6607i c6607i = str2;
            if (cursorM16698S0.moveToFirst()) {
                c6607i = new C6607i(cursorM16698S0.isNull(iM16742n0) ? str2 : cursorM16698S0.getString(iM16742n0), cursorM16698S0.getInt(iM16742n1), cursorM16698S0.getInt(iM16742n2));
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return c6607i;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13215g(String str, int i10) {
        RoomDatabase roomDatabase = this.f37510a;
        roomDatabase.m4551b();
        b bVar = this.f37512c;
        InterfaceC7920f interfaceC7920fM4574a = bVar.m4574a();
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        interfaceC7920fM4574a.mo13194W(2, i10);
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } finally {
            roomDatabase.m4563n();
            bVar.m4576c(interfaceC7920fM4574a);
        }
    }
}
