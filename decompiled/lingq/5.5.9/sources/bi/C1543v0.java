package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Language;
import com.lingq.entity.LanguageCardsTags;
import com.lingq.entity.LanguageContext;
import com.lingq.entity.LanguageContextNotification;
import com.lingq.entity.Provider;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import gi.C5803a;
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
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1543v0 extends AbstractC1529t0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8879a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8880b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8881c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f8882d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8883e;

    /* JADX INFO: renamed from: bi.v0$a */
    public class a implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8884a;

        public a(List list) {
            this.f8884a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1543v0 c1543v0 = C1543v0.this;
            RoomDatabase roomDatabase = c1543v0.f8879a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1543v0.f8880b.m1228p(this.f8884a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$b */
    public class b implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LanguageCardsTags f8886a;

        public b(LanguageCardsTags languageCardsTags) {
            this.f8886a = languageCardsTags;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1543v0 c1543v0 = C1543v0.this;
            RoomDatabase roomDatabase = c1543v0.f8879a;
            RoomDatabase roomDatabase2 = c1543v0.f8879a;
            roomDatabase.m4552c();
            try {
                c1543v0.f8882d.m1225m(this.f8886a);
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

    /* JADX INFO: renamed from: bi.v0$c */
    public class c implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LanguageCardsTags f8888a;

        public c(LanguageCardsTags languageCardsTags) {
            this.f8888a = languageCardsTags;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1543v0 c1543v0 = C1543v0.this;
            RoomDatabase roomDatabase = c1543v0.f8879a;
            RoomDatabase roomDatabase2 = c1543v0.f8879a;
            roomDatabase.m4552c();
            try {
                c1543v0.f8882d.m1225m(this.f8888a);
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

    /* JADX INFO: renamed from: bi.v0$d */
    public class d implements Callable<List<UserLanguage>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8890a;

        public d(C6595o c6595o) {
            this.f8890a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<UserLanguage> call() throws Exception {
            C1543v0 c1543v0 = C1543v0.this;
            RoomDatabase roomDatabase = c1543v0.f8879a;
            C1405c0 c1405c0 = c1543v0.f8881c;
            C6595o c6595o = this.f8890a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    int i10 = cursorM16698S0.getInt(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    int i11 = cursorM16698S0.getInt(3);
                    String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    int i12 = cursorM16698S0.getInt(5);
                    String string5 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                    c1405c0.getClass();
                    List listM4992l = C1405c0.m4992l(string5);
                    boolean z10 = cursorM16698S0.getInt(7) != 0;
                    String string6 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                    String string7 = cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9);
                    int i13 = cursorM16698S0.getInt(10);
                    String string8 = cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11);
                    if (!cursorM16698S0.isNull(12)) {
                        string = cursorM16698S0.getString(12);
                    }
                    arrayList.add(new UserLanguage(string2, i10, string3, listM4992l, z10, string6, string7, i13, null, string8, null, string4, i12, i11, null, null, C1405c0.m4992l(string)));
                }
                return arrayList;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LanguageContext` WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((LanguageContext) obj).f16994a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$f */
    public class f implements Callable<List<LanguageToLearn>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8892a;

        public f(C6595o c6595o) {
            this.f8892a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<LanguageToLearn> call() throws Exception {
            RoomDatabase roomDatabase = C1543v0.this.f8879a;
            C6595o c6595o = this.f8892a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    boolean z10 = cursorM16698S0.getInt(1) != 0;
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    int i10 = cursorM16698S0.getInt(4);
                    if (!cursorM16698S0.isNull(5)) {
                        string = cursorM16698S0.getString(5);
                    }
                    arrayList.add(new LanguageToLearn(string2, z10, string3, i10, string, string4));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$g */
    public class g implements Callable<LanguageToLearn> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8894a;

        public g(C6595o c6595o) {
            this.f8894a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LanguageToLearn call() throws Exception {
            RoomDatabase roomDatabase = C1543v0.this.f8879a;
            C6595o c6595o = this.f8894a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                LanguageToLearn languageToLearn = null;
                if (cursorM16698S0.moveToFirst()) {
                    languageToLearn = new LanguageToLearn(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getInt(1) != 0, cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.getInt(4), cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5), cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return languageToLearn;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$h */
    public class h implements Callable<C5803a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8896a;

        public h(C6595o c6595o) {
            this.f8896a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C5803a call() throws Exception {
            C1543v0 c1543v0 = C1543v0.this;
            RoomDatabase roomDatabase = c1543v0.f8879a;
            C6595o c6595o = this.f8896a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "code");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "tags");
                String str = null;
                C5803a c5803a = str;
                if (cursorM16698S0.moveToFirst()) {
                    String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    String string2 = cursorM16698S0.isNull(iM16742n1) ? str : cursorM16698S0.getString(iM16742n1);
                    c1543v0.f8881c.getClass();
                    c5803a = new C5803a(C1405c0.m4992l(string2), string);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return c5803a;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageContext` (`code`,`pk`,`url`,`repetitionLingQs`,`lotdDates`,`isUseFeed`,`intense`,`streakDays`,`tags`,`supported`,`title`,`lastUsed`,`knownWords`,`grammarResourceSlug`,`feedLevels`,`email_lotd`,`email_weekly`,`site_lotd`,`site_weekly`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageContext languageContext = (LanguageContext) obj;
            String str = languageContext.f16994a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, languageContext.f16995b);
            String str2 = languageContext.f16996c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, languageContext.f16997d);
            C1543v0 c1543v0 = C1543v0.this;
            c1543v0.f8881c.getClass();
            String strM4991d = C1405c0.m4991d(languageContext.f16998e);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            Integer numValueOf = null;
            Boolean bool = languageContext.f17001h;
            Integer numValueOf2 = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13194W(6, numValueOf2.intValue());
            }
            String str3 = languageContext.f17002i;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str3, 7);
            }
            interfaceC7920f.mo13194W(8, languageContext.f17003j);
            c1543v0.f8881c.getClass();
            String strM4991d2 = C1405c0.m4991d(languageContext.f17004k);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 9);
            }
            Boolean bool2 = languageContext.f17005l;
            if (bool2 != null) {
                numValueOf = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13194W(10, numValueOf.intValue());
            }
            String str4 = languageContext.f17006m;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str4, 11);
            }
            String str5 = languageContext.f17007n;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str5, 12);
            }
            Integer num = languageContext.f17008o;
            if (num == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13194W(13, num.intValue());
            }
            String str6 = languageContext.f17009p;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str6, 14);
            }
            String strM4991d3 = C1405c0.m4991d(languageContext.f17010q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 15);
            }
            LanguageContextNotification languageContextNotification = languageContext.f16999f;
            if (languageContextNotification != null) {
                String str7 = languageContextNotification.f17021a;
                if (str7 == null) {
                    interfaceC7920f.mo13193J0(16);
                } else {
                    interfaceC7920f.mo13197h0(str7, 16);
                }
                String str8 = languageContextNotification.f17022b;
                if (str8 == null) {
                    interfaceC7920f.mo13193J0(17);
                } else {
                    interfaceC7920f.mo13197h0(str8, 17);
                }
            } else {
                interfaceC7920f.mo13193J0(16);
                interfaceC7920f.mo13193J0(17);
            }
            LanguageContextNotification languageContextNotification2 = languageContext.f17000g;
            if (languageContextNotification2 == null) {
                interfaceC7920f.mo13193J0(18);
                interfaceC7920f.mo13193J0(19);
                return;
            }
            String str9 = languageContextNotification2.f17021a;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(18);
            } else {
                interfaceC7920f.mo13197h0(str9, 18);
            }
            String str10 = languageContextNotification2.f17022b;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(19);
            } else {
                interfaceC7920f.mo13197h0(str10, 19);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageContext` SET `code` = ?,`pk` = ?,`url` = ?,`repetitionLingQs` = ?,`lotdDates` = ?,`isUseFeed` = ?,`intense` = ?,`streakDays` = ?,`tags` = ?,`supported` = ?,`title` = ?,`lastUsed` = ?,`knownWords` = ?,`grammarResourceSlug` = ?,`feedLevels` = ?,`email_lotd` = ?,`email_weekly` = ?,`site_lotd` = ?,`site_weekly` = ? WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageContext languageContext = (LanguageContext) obj;
            String str = languageContext.f16994a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, languageContext.f16995b);
            String str2 = languageContext.f16996c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, languageContext.f16997d);
            C1543v0 c1543v0 = C1543v0.this;
            c1543v0.f8881c.getClass();
            String strM4991d = C1405c0.m4991d(languageContext.f16998e);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            Boolean bool = languageContext.f17001h;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13194W(6, numValueOf.intValue());
            }
            String str3 = languageContext.f17002i;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str3, 7);
            }
            interfaceC7920f.mo13194W(8, languageContext.f17003j);
            c1543v0.f8881c.getClass();
            String strM4991d2 = C1405c0.m4991d(languageContext.f17004k);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 9);
            }
            Boolean bool2 = languageContext.f17005l;
            Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
            if (numValueOf2 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13194W(10, numValueOf2.intValue());
            }
            String str4 = languageContext.f17006m;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str4, 11);
            }
            String str5 = languageContext.f17007n;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str5, 12);
            }
            Integer num = languageContext.f17008o;
            if (num == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13194W(13, num.intValue());
            }
            String str6 = languageContext.f17009p;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str6, 14);
            }
            String strM4991d3 = C1405c0.m4991d(languageContext.f17010q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 15);
            }
            LanguageContextNotification languageContextNotification = languageContext.f16999f;
            if (languageContextNotification != null) {
                String str7 = languageContextNotification.f17021a;
                if (str7 == null) {
                    interfaceC7920f.mo13193J0(16);
                } else {
                    interfaceC7920f.mo13197h0(str7, 16);
                }
                String str8 = languageContextNotification.f17022b;
                if (str8 == null) {
                    interfaceC7920f.mo13193J0(17);
                } else {
                    interfaceC7920f.mo13197h0(str8, 17);
                }
            } else {
                interfaceC7920f.mo13193J0(16);
                interfaceC7920f.mo13193J0(17);
            }
            LanguageContextNotification languageContextNotification2 = languageContext.f17000g;
            if (languageContextNotification2 != null) {
                String str9 = languageContextNotification2.f17021a;
                if (str9 == null) {
                    interfaceC7920f.mo13193J0(18);
                } else {
                    interfaceC7920f.mo13197h0(str9, 18);
                }
                String str10 = languageContextNotification2.f17022b;
                if (str10 == null) {
                    interfaceC7920f.mo13193J0(19);
                } else {
                    interfaceC7920f.mo13197h0(str10, 19);
                }
            } else {
                interfaceC7920f.mo13193J0(18);
                interfaceC7920f.mo13193J0(19);
            }
            String str11 = languageContext.f16994a;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str11, 20);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageCardsTags` (`code`,`tags`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageCardsTags languageCardsTags = (LanguageCardsTags) obj;
            String str = languageCardsTags.f16988a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            C1543v0.this.f8881c.getClass();
            String strM4991d = C1405c0.m4991d(languageCardsTags.f16989b);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageCardsTags` SET `code` = ?,`tags` = ? WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LanguageCardsTags languageCardsTags = (LanguageCardsTags) obj;
            String str = languageCardsTags.f16988a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            C1543v0.this.f8881c.getClass();
            String strM4991d = C1405c0.m4991d(languageCardsTags.f16989b);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 2);
            }
            String str2 = languageCardsTags.f16988a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$m */
    public class m extends AbstractC6583c {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Language` (`code`,`supported`,`title`,`lastUsed`,`knownWords`,`dictionaryLocaleActive`,`grammarResourceSlug`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Language language = (Language) obj;
            String str = language.f16981a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            Boolean bool = language.f16982b;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, numValueOf.intValue());
            }
            String str2 = language.f16983c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = language.f16984d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            Integer num = language.f16985e;
            if (num == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, num.intValue());
            }
            String str4 = language.f16986f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = language.f16987g;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$n */
    public class n extends AbstractC6583c {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Language` SET `code` = ?,`supported` = ?,`title` = ?,`lastUsed` = ?,`knownWords` = ?,`dictionaryLocaleActive` = ?,`grammarResourceSlug` = ? WHERE `code` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Language language = (Language) obj;
            String str = language.f16981a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            Boolean bool = language.f16982b;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, numValueOf.intValue());
            }
            String str2 = language.f16983c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = language.f16984d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            Integer num = language.f16985e;
            if (num == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, num.intValue());
            }
            String str4 = language.f16986f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = language.f16987g;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            String str6 = language.f16981a;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str6, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$o */
    public class o extends AbstractC6583c {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Provider` (`id`,`language`,`description`,`image`,`title`,`url`) VALUES (?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Provider provider = (Provider) obj;
            interfaceC7920f.mo13194W(1, provider.f17361a);
            String str = provider.f17362b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = provider.f17363c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = provider.f17364d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = provider.f17365e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = provider.f17366f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.v0$p */
    public class p extends AbstractC6583c {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Provider` SET `id` = ?,`language` = ?,`description` = ?,`image` = ?,`title` = ?,`url` = ? WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Provider provider = (Provider) obj;
            interfaceC7920f.mo13194W(1, provider.f17361a);
            String str = provider.f17362b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = provider.f17363c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = provider.f17364d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = provider.f17365e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = provider.f17366f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            interfaceC7920f.mo13194W(7, provider.f17361a);
        }
    }

    public C1543v0(RoomDatabase roomDatabase) {
        this.f8879a = roomDatabase;
        new e(roomDatabase);
        this.f8880b = new C0322j(new i(roomDatabase), new j(roomDatabase));
        this.f8882d = new C0322j(new k(roomDatabase), new l(roomDatabase));
        this.f8883e = new C0322j(new m(roomDatabase), new n(roomDatabase));
        new o(roomDatabase);
        new p(roomDatabase);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8879a, new CallableC1536u0(this, (LanguageContext) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends LanguageContext> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8879a, new a(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: k0 */
    public final Object mo5174k0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8879a, new CallableC1406c1(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5175l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `code`, `pk`, `url`, `repetitionLingQs`, `intense`, `streakDays`, `tags`, `supported`, `title`, `lastUsed`, `knownWords`, `grammarResourceSlug`, `feedLevels`, `emailLotd`, `siteLotd` FROM (SELECT *, email_lotd as emailLotd, site_lotd as siteLotd FROM LanguageContext WHERE code = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1571z0 callableC1571z0 = new CallableC1571z0(this, c6595oM13191l);
        return C1185b.m4579a(this.f8879a, false, new String[]{"LanguageContext"}, callableC1571z0);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo5176m0() {
        CallableC1564y0 callableC1564y0 = new CallableC1564y0(this, C6595o.m13191l("SELECT `code`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive` FROM (SELECT * FROM Language)", 0));
        return C1185b.m4579a(this.f8879a, false, new String[]{"Language"}, callableC1564y0);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo5177n0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LanguageCardsTags WHERE code = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1398b1 callableC1398b1 = new CallableC1398b1(this, c6595oM13191l);
        return C1185b.m4579a(this.f8879a, false, new String[]{"LanguageCardsTags"}, callableC1398b1);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5178o0() {
        CallableC1557x0 callableC1557x0 = new CallableC1557x0(this, C6595o.m13191l("SELECT `code`, `pk`, `url`, `repetitionLingQs`, `intense`, `streakDays`, `tags`, `supported`, `title`, `lastUsed`, `knownWords`, `grammarResourceSlug`, `feedLevels` FROM (SELECT * FROM LanguageContext)", 0));
        return C1185b.m4579a(this.f8879a, false, new String[]{"LanguageContext"}, callableC1557x0);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: p0 */
    public final Object mo5179p0(InterfaceC9968c<? super List<LanguageToLearn>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `code`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive` FROM (SELECT * FROM Language)", 0);
        return C1185b.m4581c(this.f8879a, false, new CancellationSignal(), new f(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: q0 */
    public final Object mo5180q0(String str, InterfaceC9968c<? super LanguageToLearn> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `code`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive` FROM (SELECT * FROM Language WHERE code = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8879a, false, new CancellationSignal(), new g(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: r0 */
    public final Object mo5181r0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LanguageContext WHERE code = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8879a, false, new CancellationSignal(), new CallableC1390a1(this, c6595oM13191l), continuationImpl);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: s0 */
    public final Object mo5182s0(String str, InterfaceC9968c<? super C5803a> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LanguageCardsTags WHERE code = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8879a, false, new CancellationSignal(), new h(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: t0 */
    public final Object mo5183t0(InterfaceC9968c<? super List<UserLanguage>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `code`, `pk`, `url`, `repetitionLingQs`, `intense`, `streakDays`, `tags`, `supported`, `title`, `lastUsed`, `knownWords`, `grammarResourceSlug`, `feedLevels` FROM (SELECT * FROM LanguageContext)", 0);
        return C1185b.m4581c(this.f8879a, false, new CancellationSignal(), new d(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: u0 */
    public final Object mo5184u0(List list, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8879a, new CallableC1550w0(this, list), continuationImpl);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: v0 */
    public final Object mo5185v0(LanguageCardsTags languageCardsTags, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8879a, new c(languageCardsTags), interfaceC9968c);
    }

    @Override // bi.AbstractC1529t0
    /* JADX INFO: renamed from: w0 */
    public final Object mo5186w0(LanguageCardsTags languageCardsTags, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8879a, new b(languageCardsTags), interfaceC9968c);
    }
}
