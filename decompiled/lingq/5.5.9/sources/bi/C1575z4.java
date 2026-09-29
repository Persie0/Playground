package bi;

import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Referral;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: bi.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1575z4 extends AbstractC1568y4 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f9015a;

    /* JADX INFO: renamed from: b */
    public final C0322j f9016b;

    /* JADX INFO: renamed from: bi.z4$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Referral` WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((Referral) obj).f17379a);
        }
    }

    /* JADX INFO: renamed from: bi.z4$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Referral` (`pk`,`username`,`photo`,`dateJoined`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Referral referral = (Referral) obj;
            interfaceC7920f.mo13194W(1, referral.f17379a);
            String str = referral.f17380b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = referral.f17381c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = referral.f17382d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.z4$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Referral` SET `pk` = ?,`username` = ?,`photo` = ?,`dateJoined` = ? WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Referral referral = (Referral) obj;
            interfaceC7920f.mo13194W(1, referral.f17379a);
            String str = referral.f17380b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = referral.f17381c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = referral.f17382d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, referral.f17379a);
        }
    }

    /* JADX INFO: renamed from: bi.z4$d */
    public class d implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f9017a;

        public d(ArrayList arrayList) {
            this.f9017a = arrayList;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1575z4 c1575z4 = C1575z4.this;
            RoomDatabase roomDatabase = c1575z4.f9015a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1575z4.f9016b.m1228p(this.f9017a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    public C1575z4(RoomDatabase roomDatabase) {
        this.f9015a = roomDatabase;
        new a(roomDatabase);
        this.f9016b = new C0322j(new b(roomDatabase), new c(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Referral> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f9015a, new d((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1568y4
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5240k0() {
        CallableC1394a5 callableC1394a5 = new CallableC1394a5(this, C6595o.m13191l("SELECT `photo` FROM (SELECT * FROM Referral ORDER BY dateJoined DESC LIMIT 5)", 0));
        return C1185b.m4579a(this.f9015a, true, new String[]{"Referral"}, callableC1394a5);
    }
}
