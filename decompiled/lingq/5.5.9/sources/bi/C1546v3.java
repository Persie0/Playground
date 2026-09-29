package bi;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import p213k4.AbstractC6583c;
import p288o4.InterfaceC7920f;
import p367rh.C8804r;

/* JADX INFO: renamed from: bi.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1546v3 implements InterfaceC1539u3 {

    /* JADX INFO: renamed from: bi.v3$a */
    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM PagingKeys WHERE pagingKey = ?";
        }
    }

    /* JADX INFO: renamed from: bi.v3$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `PagingKeys` (`pagingKey`,`prevKey`,`nextKey`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            ((C8804r) obj).getClass();
            interfaceC7920f.mo13193J0(1);
            interfaceC7920f.mo13193J0(2);
            interfaceC7920f.mo13193J0(3);
        }
    }

    /* JADX INFO: renamed from: bi.v3$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `PagingKeys` SET `pagingKey` = ?,`prevKey` = ?,`nextKey` = ? WHERE `pagingKey` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            ((C8804r) obj).getClass();
            interfaceC7920f.mo13193J0(1);
            interfaceC7920f.mo13193J0(2);
            interfaceC7920f.mo13193J0(3);
            interfaceC7920f.mo13193J0(4);
        }
    }

    public C1546v3(RoomDatabase roomDatabase) {
        new a(roomDatabase);
        new b(roomDatabase);
        new c(roomDatabase);
    }
}
