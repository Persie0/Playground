package p214k5;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.C1244b;
import p213k4.AbstractC6583c;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: k5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6616r implements InterfaceC6615q {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37520a;

    /* JADX INFO: renamed from: b */
    public final b f37521b;

    /* JADX INFO: renamed from: c */
    public final c f37522c;

    /* JADX INFO: renamed from: k5.r$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) throws Throwable {
            ((C6614p) obj).getClass();
            interfaceC7920f.mo13193J0(1);
            byte[] bArrM4703f = C1244b.m4703f(null);
            if (bArrM4703f == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13199r0(bArrM4703f, 2);
            }
        }
    }

    /* JADX INFO: renamed from: k5.r$b */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: k5.r$c */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C6616r(RoomDatabase roomDatabase) {
        this.f37520a = roomDatabase;
        new a(roomDatabase);
        this.f37521b = new b(roomDatabase);
        this.f37522c = new c(roomDatabase);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6615q
    /* JADX INFO: renamed from: a */
    public final void mo13218a(String str) {
        RoomDatabase roomDatabase = this.f37520a;
        roomDatabase.m4551b();
        b bVar = this.f37521b;
        InterfaceC7920f interfaceC7920fM4574a = bVar.m4574a();
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
            bVar.m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            bVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6615q
    /* JADX INFO: renamed from: b */
    public final void mo13219b() {
        RoomDatabase roomDatabase = this.f37520a;
        roomDatabase.m4551b();
        c cVar = this.f37522c;
        InterfaceC7920f interfaceC7920fM4574a = cVar.m4574a();
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            cVar.m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            cVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
