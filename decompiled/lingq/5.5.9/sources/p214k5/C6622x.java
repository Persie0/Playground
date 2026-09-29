package p214k5;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6622x implements InterfaceC6621w {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37559a;

    /* JADX INFO: renamed from: b */
    public final a f37560b;

    /* JADX INFO: renamed from: k5.x$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C6620v c6620v = (C6620v) obj;
            String str = c6620v.f37557a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c6620v.f37558b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: k5.x$b */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C6622x(RoomDatabase roomDatabase) {
        this.f37559a = roomDatabase;
        this.f37560b = new a(roomDatabase);
        new b(roomDatabase);
    }

    @Override // p214k5.InterfaceC6621w
    /* JADX INFO: renamed from: a */
    public final ArrayList mo13244a(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        RoomDatabase roomDatabase = this.f37559a;
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

    @Override // p214k5.InterfaceC6621w
    /* JADX INFO: renamed from: b */
    public final void mo13245b(String str, Set<String> set) {
        C5207g.m11111f(set, "tags");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            m13246c(new C6620v((String) it.next(), str));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13246c(C6620v c6620v) {
        RoomDatabase roomDatabase = this.f37559a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            this.f37560b.m13171g(c6620v);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }
}
