package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6605g implements InterfaceC6603e {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37505a;

    /* JADX INFO: renamed from: b */
    public final C6604f f37506b;

    public C6605g(WorkDatabase workDatabase) {
        this.f37505a = workDatabase;
        this.f37506b = new C6604f(workDatabase);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6603e
    /* JADX INFO: renamed from: a */
    public final Long mo13207a(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT long_value FROM Preference where `key`=?", 1);
        c6595oM13191l.mo13197h0(str, 1);
        RoomDatabase roomDatabase = this.f37505a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            Long lValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Long.valueOf(cursorM16698S0.getLong(0));
            cursorM16698S0.close();
            return lValueOf;
        } finally {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
        }
    }

    @Override // p214k5.InterfaceC6603e
    /* JADX INFO: renamed from: b */
    public final void mo13208b(C6602d c6602d) {
        RoomDatabase roomDatabase = this.f37505a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37506b.m13171g(c6602d);
            roomDatabase.m4568s();
        } finally {
            roomDatabase.m4563n();
        }
    }
}
