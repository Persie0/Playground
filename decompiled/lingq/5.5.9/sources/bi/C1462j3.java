package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.DictionaryLocale;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8797k;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: bi.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1462j3 extends AbstractC1440g3 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8554a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8555b;

    /* JADX INFO: renamed from: c */
    public final C0322j f8556c;

    /* JADX INFO: renamed from: bi.j3$a */
    public class a implements Callable<List<UserDictionaryLocale>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8557a;

        public a(C6595o c6595o) {
            this.f8557a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<UserDictionaryLocale> call() throws Exception {
            C6595o c6595o = this.f8557a;
            RoomDatabase roomDatabase = C1462j3.this.f8554a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "code");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                        if (!cursorM16698S0.isNull(iM16742n1)) {
                            string = cursorM16698S0.getString(iM16742n1);
                        }
                        arrayList.add(new UserDictionaryLocale(string2, string));
                    }
                    roomDatabase.m4568s();
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    roomDatabase.m4563n();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase.m4563n();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `DictionaryLocale` WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((DictionaryLocale) obj).f16968a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `DictionaryLocale` (`code`,`title`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            DictionaryLocale dictionaryLocale = (DictionaryLocale) obj;
            String str = dictionaryLocale.f16968a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = dictionaryLocale.f16969b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `DictionaryLocale` SET `code` = ?,`title` = ? WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            DictionaryLocale dictionaryLocale = (DictionaryLocale) obj;
            String str = dictionaryLocale.f16968a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = dictionaryLocale.f16969b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = dictionaryLocale.f16968a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageDictionaryLocaleJoin` (`language`,`code`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8797k c8797k = (C8797k) obj;
            String str = c8797k.f46650a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8797k.f46651b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageDictionaryLocaleJoin` SET `language` = ?,`code` = ? WHERE `language` = ? AND `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8797k c8797k = (C8797k) obj;
            String str = c8797k.f46650a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8797k.f46651b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            String str3 = c8797k.f46650a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str3, 3);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j3$g */
    public class g implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8559a;

        public g(ArrayList arrayList) {
            this.f8559a = arrayList;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1462j3 c1462j3 = C1462j3.this;
            RoomDatabase roomDatabase = c1462j3.f8554a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1462j3.f8555b.m1228p(this.f8559a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    public C1462j3(RoomDatabase roomDatabase) {
        this.f8554a = roomDatabase;
        new b(roomDatabase);
        this.f8555b = new C0322j(new c(roomDatabase), new d(roomDatabase));
        this.f8556c = new C0322j(new e(roomDatabase), new f(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends DictionaryLocale> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8554a, new g((ArrayList) list), interfaceC9968c);
    }

    @Override // bi.AbstractC1440g3
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5039k0() {
        CallableC1455i3 callableC1455i3 = new CallableC1455i3(this, C6595o.m13191l("\n    SELECT DISTINCT * FROM DictionaryLocale", 0));
        return C1185b.m4579a(this.f8554a, true, new String[]{"DictionaryLocale"}, callableC1455i3);
    }

    @Override // bi.AbstractC1440g3
    /* JADX INFO: renamed from: l0 */
    public final Object mo5040l0(InterfaceC9968c<? super List<UserDictionaryLocale>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM DictionaryLocale", 0);
        return C1185b.m4581c(this.f8554a, true, new CancellationSignal(), new a(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1440g3
    /* JADX INFO: renamed from: m0 */
    public final Object mo5041m0(C8797k c8797k, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8554a, new CallableC1448h3(this, c8797k), continuationImpl);
    }
}
