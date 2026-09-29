package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6613o implements InterfaceC6612n {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37518a;

    /* JADX INFO: renamed from: b */
    public final a f37519b;

    /* JADX INFO: renamed from: k5.o$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C6611m c6611m = (C6611m) obj;
            String str = c6611m.f37516a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c6611m.f37517b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    public C6613o(RoomDatabase roomDatabase) {
        this.f37518a = roomDatabase;
        this.f37519b = new a(roomDatabase);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6612n
    /* JADX INFO: renamed from: a */
    public final void mo13216a(C6611m c6611m) {
        RoomDatabase roomDatabase = this.f37518a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37519b.m13171g(c6611m);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6612n
    /* JADX INFO: renamed from: b */
    public final ArrayList mo13217b(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37518a;
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
}
