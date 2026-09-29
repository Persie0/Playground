package bi;

import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Notice;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.p3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1504p3 extends AbstractC1497o3 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8780a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8781b;

    /* JADX INFO: renamed from: bi.p3$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Notice` WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((Notice) obj).f17323a);
        }
    }

    /* JADX INFO: renamed from: bi.p3$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Notice` (`id`,`language`,`title`,`startDate`,`endDate`,`noticeType`,`isShown`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Notice notice = (Notice) obj;
            interfaceC7920f.mo13194W(1, notice.f17323a);
            String str = notice.f17324b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = notice.f17325c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = notice.f17326d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = notice.f17327e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = notice.f17328f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            interfaceC7920f.mo13194W(7, notice.f17329g ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: bi.p3$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Notice` SET `id` = ?,`language` = ?,`title` = ?,`startDate` = ?,`endDate` = ?,`noticeType` = ?,`isShown` = ? WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Notice notice = (Notice) obj;
            interfaceC7920f.mo13194W(1, notice.f17323a);
            String str = notice.f17324b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = notice.f17325c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = notice.f17326d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = notice.f17327e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = notice.f17328f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            interfaceC7920f.mo13194W(7, notice.f17329g ? 1L : 0L);
            interfaceC7920f.mo13194W(8, notice.f17323a);
        }
    }

    /* JADX INFO: renamed from: bi.p3$d */
    public class d implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8782a;

        public d(ArrayList arrayList) {
            this.f8782a = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1504p3 c1504p3 = C1504p3.this;
            RoomDatabase roomDatabase = c1504p3.f8780a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1504p3.f8781b.m1228p(this.f8782a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p3$e */
    public class e implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8784a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8785b;

        public e(List list, String str) {
            this.f8784a = list;
            this.f8785b = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            StringBuilder sbM771r = C0166e.m771r("UPDATE Notice SET isShown = 1 WHERE language = ? AND id in (");
            List<Integer> list = this.f8784a;
            C5206f.m11021s0(list.size(), sbM771r);
            sbM771r.append(")");
            String string = sbM771r.toString();
            C1504p3 c1504p3 = C1504p3.this;
            InterfaceC7920f interfaceC7920fM4555f = c1504p3.f8780a.m4555f(string);
            String str = this.f8785b;
            if (str == null) {
                interfaceC7920fM4555f.mo13193J0(1);
            } else {
                interfaceC7920fM4555f.mo13197h0(str, 1);
            }
            int i10 = 2;
            for (Integer num : list) {
                if (num == null) {
                    interfaceC7920fM4555f.mo13193J0(i10);
                } else {
                    interfaceC7920fM4555f.mo13194W(i10, num.intValue());
                }
                i10++;
            }
            RoomDatabase roomDatabase = c1504p3.f8780a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4555f.mo15736A();
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    public C1504p3(RoomDatabase roomDatabase) {
        this.f8780a = roomDatabase;
        new a(roomDatabase);
        this.f8781b = new C0322j(new b(roomDatabase), new c(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Notice> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8780a, new d((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1497o3
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5161k0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `startDate`, `endDate`, `noticeType` FROM (SELECT * FROM Notice WHERE language = ? AND noticeType = ? AND isShown = 0 AND ? >= startDate AND ? <= endDate ORDER BY startDate)", 4);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13197h0("monthly_challenges", 2);
        c6595oM13191l.mo13197h0(str2, 3);
        c6595oM13191l.mo13197h0(str2, 4);
        CallableC1511q3 callableC1511q3 = new CallableC1511q3(this, c6595oM13191l);
        return C1185b.m4579a(this.f8780a, true, new String[]{"Notice"}, callableC1511q3);
    }

    @Override // bi.AbstractC1497o3
    /* JADX INFO: renamed from: l0 */
    public final Object mo5162l0(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8780a, new e(list, str), interfaceC9968c);
    }
}
