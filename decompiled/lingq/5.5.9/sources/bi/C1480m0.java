package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.SharedSQLiteStatement;
import cm.InterfaceC2052l;
import com.lingq.entity.DictionaryData;
import com.lingq.shared.persistent.dao.DictionaryDao;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8794h;
import p367rh.C8796j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480m0 extends DictionaryDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8621a;

    /* JADX INFO: renamed from: b */
    public final j f8622b;

    /* JADX INFO: renamed from: c */
    public final k f8623c;

    /* JADX INFO: renamed from: d */
    public final l f8624d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8625e;

    /* JADX INFO: renamed from: f */
    public final C0322j f8626f;

    /* JADX INFO: renamed from: g */
    public final C0322j f8627g;

    /* JADX INFO: renamed from: bi.m0$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageAvailableDictionaryJoin` SET `code` = ?,`id` = ? WHERE `code` = ? AND `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8796j c8796j = (C8796j) obj;
            String str = c8796j.f46648a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            long j10 = c8796j.f46649b;
            interfaceC7920f.mo13194W(2, j10);
            String str2 = c8796j.f46648a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, j10);
        }
    }

    /* JADX INFO: renamed from: bi.m0$b */
    public class b implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8794h f8628a;

        public b(C8794h c8794h) {
            this.f8628a = c8794h;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1480m0 c1480m0 = C1480m0.this;
            RoomDatabase roomDatabase = c1480m0.f8621a;
            roomDatabase.m4552c();
            try {
                c1480m0.f8622b.m13169e(this.f8628a);
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

    /* JADX INFO: renamed from: bi.m0$c */
    public class c implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8631b;

        public c(int i10, int i11) {
            this.f8630a = i10;
            this.f8631b = i11;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1480m0 c1480m0 = C1480m0.this;
            k kVar = c1480m0.f8623c;
            InterfaceC7920f interfaceC7920fM4574a = kVar.m4574a();
            interfaceC7920fM4574a.mo13194W(1, this.f8630a);
            interfaceC7920fM4574a.mo13194W(2, this.f8631b);
            RoomDatabase roomDatabase = c1480m0.f8621a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                kVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                kVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$d */
    public class d implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8634b;

        public d(int i10, int i11) {
            this.f8633a = i10;
            this.f8634b = i11;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1480m0 c1480m0 = C1480m0.this;
            l lVar = c1480m0.f8624d;
            InterfaceC7920f interfaceC7920fM4574a = lVar.m4574a();
            interfaceC7920fM4574a.mo13194W(1, this.f8633a);
            interfaceC7920fM4574a.mo13194W(2, this.f8634b);
            RoomDatabase roomDatabase = c1480m0.f8621a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                lVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                lVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$e */
    public class e implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8636a;

        public e(List list) {
            this.f8636a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1480m0 c1480m0 = C1480m0.this;
            RoomDatabase roomDatabase = c1480m0.f8621a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1480m0.f8625e.m1228p(this.f8636a);
                roomDatabase.m4568s();
                return listBuilderM1228p;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$f */
    public class f implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8796j f8638a;

        public f(C8796j c8796j) {
            this.f8638a = c8796j;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1480m0 c1480m0 = C1480m0.this;
            RoomDatabase roomDatabase = c1480m0.f8621a;
            RoomDatabase roomDatabase2 = c1480m0.f8621a;
            roomDatabase.m4552c();
            try {
                c1480m0.f8627g.m1225m(this.f8638a);
                roomDatabase2.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase2.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase2.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `DictionaryData` WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((DictionaryData) obj).f16950a);
        }
    }

    /* JADX INFO: renamed from: bi.m0$h */
    public class h implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8640a;

        public h(C6595o c6595o) {
            this.f8640a = c6595o;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            RoomDatabase roomDatabase = C1480m0.this.f8621a;
            C6595o c6595o = this.f8640a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
                cursorM16698S0.close();
                return numValueOf;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$i */
    public class i implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8642a;

        public i(C6595o c6595o) {
            this.f8642a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            RoomDatabase roomDatabase = C1480m0.this.f8621a;
            C6595o c6595o = this.f8642a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
                cursorM16698S0.close();
                c6595o.m13198q();
                return numValueOf;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LanguageActiveDictionaryJoin` WHERE `code` = ? AND `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8794h c8794h = (C8794h) obj;
            String str = c8794h.f46643a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c8794h.f46644b);
        }
    }

    /* JADX INFO: renamed from: bi.m0$k */
    public class k extends SharedSQLiteStatement {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE DictionaryData set `order` = ? where id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.m0$l */
    public class l extends SharedSQLiteStatement {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE DictionaryData SET `order` = ? where id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.m0$m */
    public class m extends AbstractC6583c {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `DictionaryData` (`id`,`name`,`order`,`urlToTransform`,`urlDefinition`,`isPopUpWindow`,`languageTo`,`urlVar1`,`urlVar2`,`urlVar3`,`urlVar4`,`urlVar5`,`overrideUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            DictionaryData dictionaryData = (DictionaryData) obj;
            interfaceC7920f.mo13194W(1, dictionaryData.f16950a);
            String str = dictionaryData.f16951b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, dictionaryData.f16952c);
            String str2 = dictionaryData.f16953d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            String str3 = dictionaryData.f16954e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, dictionaryData.f16955f ? 1L : 0L);
            String str4 = dictionaryData.f16956g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            String str5 = dictionaryData.f16957h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = dictionaryData.f16958i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = dictionaryData.f16959j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = dictionaryData.f16960k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = dictionaryData.f16961l;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = dictionaryData.f16962m;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
        }
    }

    /* JADX INFO: renamed from: bi.m0$n */
    public class n extends AbstractC6583c {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `DictionaryData` SET `id` = ?,`name` = ?,`order` = ?,`urlToTransform` = ?,`urlDefinition` = ?,`isPopUpWindow` = ?,`languageTo` = ?,`urlVar1` = ?,`urlVar2` = ?,`urlVar3` = ?,`urlVar4` = ?,`urlVar5` = ?,`overrideUrl` = ? WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            DictionaryData dictionaryData = (DictionaryData) obj;
            interfaceC7920f.mo13194W(1, dictionaryData.f16950a);
            String str = dictionaryData.f16951b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, dictionaryData.f16952c);
            String str2 = dictionaryData.f16953d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            String str3 = dictionaryData.f16954e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, dictionaryData.f16955f ? 1L : 0L);
            String str4 = dictionaryData.f16956g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            String str5 = dictionaryData.f16957h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = dictionaryData.f16958i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = dictionaryData.f16959j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = dictionaryData.f16960k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = dictionaryData.f16961l;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = dictionaryData.f16962m;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            interfaceC7920f.mo13194W(14, dictionaryData.f16950a);
        }
    }

    /* JADX INFO: renamed from: bi.m0$o */
    public class o extends AbstractC6583c {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageActiveDictionaryJoin` (`code`,`id`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8794h c8794h = (C8794h) obj;
            String str = c8794h.f46643a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c8794h.f46644b);
        }
    }

    /* JADX INFO: renamed from: bi.m0$p */
    public class p extends AbstractC6583c {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageActiveDictionaryJoin` SET `code` = ?,`id` = ? WHERE `code` = ? AND `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8794h c8794h = (C8794h) obj;
            String str = c8794h.f46643a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            long j10 = c8794h.f46644b;
            interfaceC7920f.mo13194W(2, j10);
            String str2 = c8794h.f46643a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, j10);
        }
    }

    /* JADX INFO: renamed from: bi.m0$q */
    public class q extends AbstractC6583c {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageAvailableDictionaryJoin` (`code`,`id`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8796j c8796j = (C8796j) obj;
            String str = c8796j.f46648a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c8796j.f46649b);
        }
    }

    public C1480m0(RoomDatabase roomDatabase) {
        this.f8621a = roomDatabase;
        new g(roomDatabase);
        this.f8622b = new j(roomDatabase);
        this.f8623c = new k(roomDatabase);
        this.f8624d = new l(roomDatabase);
        this.f8625e = new C0322j(new m(roomDatabase), new n(roomDatabase));
        this.f8626f = new C0322j(new o(roomDatabase), new p(roomDatabase));
        this.f8627g = new C0322j(new q(roomDatabase), new a(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends DictionaryData> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8621a, new e(list), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5088k0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM DictionaryLocale\n    INNER JOIN LanguageDictionaryLocaleJoin ON LanguageDictionaryLocaleJoin.language = ?\n    AND LanguageDictionaryLocaleJoin.code = DictionaryLocale.code", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1522s0 callableC1522s0 = new CallableC1522s0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8621a, true, new String[]{"DictionaryLocale", "LanguageDictionaryLocaleJoin"}, callableC1522s0);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5089l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM DictionaryData\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryData.id\n    ORDER BY DictionaryData.`order`", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1494o0 callableC1494o0 = new CallableC1494o0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8621a, true, new String[]{"DictionaryData", "LanguageActiveDictionaryJoin"}, callableC1494o0);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: m0 */
    public final Object mo5090m0(String str, InterfaceC9968c<? super Integer> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT `order` FROM DictionaryData\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryData.id\n    ORDER BY DictionaryData.`order` DESC LIMIT 1", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8621a, false, new CancellationSignal(), new h(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5091n0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT *, LanguageContext.code FROM DictionaryData, LanguageContext\n    INNER JOIN LanguageAvailableDictionaryJoin ON LanguageAvailableDictionaryJoin.code = LanguageContext.code\n    AND LanguageAvailableDictionaryJoin.id = DictionaryData.id\n    WHERE LanguageContext.code = ? ORDER BY DictionaryData.`order`", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1508q0 callableC1508q0 = new CallableC1508q0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8621a, true, new String[]{"DictionaryData", "LanguageContext", "LanguageAvailableDictionaryJoin"}, callableC1508q0);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5092o0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT *, LanguageContext.code FROM DictionaryData, LanguageContext\n    INNER JOIN LanguageAvailableDictionaryJoin ON LanguageAvailableDictionaryJoin.code = LanguageContext.code\n    AND LanguageAvailableDictionaryJoin.id = DictionaryData.id\n    WHERE DictionaryData.languageTo = ? and LanguageContext.code = ? and DictionaryData.`order` = - 1 ORDER BY DictionaryData.name COLLATE NOCASE", 2);
        if (str2 == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str2, 1);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        CallableC1515r0 callableC1515r0 = new CallableC1515r0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8621a, true, new String[]{"DictionaryData", "LanguageContext", "LanguageAvailableDictionaryJoin"}, callableC1515r0);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: p0 */
    public final Object mo5093p0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM DictionaryData\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryData.id\n    ORDER BY DictionaryData.`order` LIMIT 1 OFFSET ? ", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8621a, false, C0141b.m610f(c6595oM13191l, 2, i10), new CallableC1501p0(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: q0 */
    public final Object mo5094q0(int i10, InterfaceC9968c<? super Integer> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `order` FROM DictionaryData WHERE id = ?", 1);
        return C1185b.m4581c(this.f8621a, false, C0141b.m610f(c6595oM13191l, 1, i10), new i(c6595oM13191l), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: r0 */
    public final Object mo5095r0(C8794h c8794h, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8621a, new CallableC1487n0(this, c8794h), continuationImpl);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: s0 */
    public final Object mo5096s0(C8796j c8796j, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8621a, new f(c8796j), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: t0 */
    public final Object mo5097t0(final int i10, final String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return RoomDatabaseKt.m4573a(this.f8621a, new InterfaceC2052l() { // from class: bi.l0
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C1480m0 c1480m0 = this.f8579a;
                c1480m0.getClass();
                return DictionaryDao.m9472u0(c1480m0, i10, str, (InterfaceC9968c) obj);
            }
        }, interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: v0 */
    public final Object mo5098v0(C8794h c8794h, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8621a, new b(c8794h), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: w0 */
    public final Object mo5099w0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8621a, new d(i11, i10), interfaceC9968c);
    }

    @Override // com.lingq.shared.persistent.dao.DictionaryDao
    /* JADX INFO: renamed from: x0 */
    public final Object mo5100x0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8621a, new c(i10, i11), interfaceC9968c);
    }
}
