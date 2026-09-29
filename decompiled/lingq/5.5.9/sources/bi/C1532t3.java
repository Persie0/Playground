package bi;

import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.Notification;
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

/* JADX INFO: renamed from: bi.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1532t3 extends AbstractC1518r3 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8851a;

    /* JADX INFO: renamed from: b */
    public final c f8852b;

    /* JADX INFO: renamed from: c */
    public final C0322j f8853c;

    /* JADX INFO: renamed from: bi.t3$a */
    public class a implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8854a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8855b;

        public a(List list, String str) {
            this.f8854a = list;
            this.f8855b = str;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            StringBuilder sbM771r = C0166e.m771r("UPDATE Notification SET isNew = 0 WHERE language = ? AND pk in (");
            List<Integer> list = this.f8854a;
            C5206f.m11021s0(list.size(), sbM771r);
            sbM771r.append(")");
            String string = sbM771r.toString();
            C1532t3 c1532t3 = C1532t3.this;
            InterfaceC7920f interfaceC7920fM4555f = c1532t3.f8851a.m4555f(string);
            String str = this.f8855b;
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
            RoomDatabase roomDatabase = c1532t3.f8851a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4555f.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.t3$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Notification` WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((Notification) obj).f17334a);
        }
    }

    /* JADX INFO: renamed from: bi.t3$c */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Notification SET isNew = 0 WHERE language = ?";
        }
    }

    /* JADX INFO: renamed from: bi.t3$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Notification` (`pk`,`url`,`language`,`notificationLanguage`,`type`,`title`,`message`,`image`,`isNew`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Notification notification = (Notification) obj;
            interfaceC7920f.mo13194W(1, notification.f17334a);
            String str = notification.f17335b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = notification.f17336c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = notification.f17337d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = notification.f17338e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = notification.f17339f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = notification.f17340g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            String str7 = notification.f17341h;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str7, 8);
            }
            Boolean bool = notification.f17342i;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13194W(9, numValueOf.intValue());
            }
            String str8 = notification.f17343j;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str8, 10);
            }
        }
    }

    /* JADX INFO: renamed from: bi.t3$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Notification` SET `pk` = ?,`url` = ?,`language` = ?,`notificationLanguage` = ?,`type` = ?,`title` = ?,`message` = ?,`image` = ?,`isNew` = ?,`timestamp` = ? WHERE `pk` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Notification notification = (Notification) obj;
            interfaceC7920f.mo13194W(1, notification.f17334a);
            String str = notification.f17335b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = notification.f17336c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = notification.f17337d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = notification.f17338e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = notification.f17339f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = notification.f17340g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            String str7 = notification.f17341h;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str7, 8);
            }
            Boolean bool = notification.f17342i;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13194W(9, numValueOf.intValue());
            }
            String str8 = notification.f17343j;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str8, 10);
            }
            interfaceC7920f.mo13194W(11, notification.f17334a);
        }
    }

    /* JADX INFO: renamed from: bi.t3$f */
    public class f implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8857a;

        public f(String str) {
            this.f8857a = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1532t3 c1532t3 = C1532t3.this;
            c cVar = c1532t3.f8852b;
            InterfaceC7920f interfaceC7920fM4574a = cVar.m4574a();
            String str = this.f8857a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            RoomDatabase roomDatabase = c1532t3.f8851a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                cVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                cVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.t3$g */
    public class g implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8859a;

        public g(ArrayList arrayList) {
            this.f8859a = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1532t3 c1532t3 = C1532t3.this;
            RoomDatabase roomDatabase = c1532t3.f8851a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1532t3.f8853c.m1228p(this.f8859a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    public C1532t3(RoomDatabase roomDatabase) {
        this.f8851a = roomDatabase;
        new b(roomDatabase);
        this.f8852b = new c(roomDatabase);
        this.f8853c = new C0322j(new d(roomDatabase), new e(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Notification> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8851a, new g((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1518r3
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5163k0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pk`, `url`, `notificationLanguage`, `title`, `message`, `image`, `isNew`, `timestamp` FROM (SELECT * FROM Notification WHERE language = ? ORDER BY timestamp DESC LIMIT ?)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8851a, true, new String[]{"Notification"}, new CallableC1525s3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1518r3
    /* JADX INFO: renamed from: l0 */
    public final Object mo5164l0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8851a, new f(str), interfaceC9968c);
    }

    @Override // bi.AbstractC1518r3
    /* JADX INFO: renamed from: m0 */
    public final Object mo5165m0(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8851a, new a(list, str), interfaceC9968c);
    }
}
