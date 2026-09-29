package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6601c implements InterfaceC6600b {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37501a;

    /* JADX INFO: renamed from: b */
    public final a f37502b;

    /* JADX INFO: renamed from: k5.c$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C6599a c6599a = (C6599a) obj;
            String str = c6599a.f37499a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c6599a.f37500b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    public C6601c(RoomDatabase roomDatabase) {
        this.f37501a = roomDatabase;
        this.f37502b = new a(roomDatabase);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6600b
    /* JADX INFO: renamed from: a */
    public final ArrayList mo13203a(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37501a;
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
    @Override // p214k5.InterfaceC6600b
    /* JADX INFO: renamed from: b */
    public final boolean mo13204b(String str) {
        boolean z10 = true;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37501a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            boolean z11 = false;
            if (cursorM16698S0.moveToFirst()) {
                if (cursorM16698S0.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return z11;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6600b
    /* JADX INFO: renamed from: c */
    public final boolean mo13205c(String str) {
        boolean z10 = true;
        C6595o c6595oM13191l = C6595o.m13191l("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37501a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            boolean z11 = false;
            if (cursorM16698S0.moveToFirst()) {
                if (cursorM16698S0.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            return z11;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595oM13191l.m13198q();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p214k5.InterfaceC6600b
    /* JADX INFO: renamed from: d */
    public final void mo13206d(C6599a c6599a) {
        RoomDatabase roomDatabase = this.f37501a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37502b.m13171g(c6599a);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }
}
