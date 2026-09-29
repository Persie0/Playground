package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.Translations;
import com.lingq.shared.uimodel.token.TokenTranslations;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8806t;
import p367rh.C8807u;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.l5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1478l5 extends AbstractC1450h5 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8600a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8601b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8602c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f8603d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8604e;

    /* JADX INFO: renamed from: bi.l5$a */
    public class a implements Callable<TokenTranslations> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8605a;

        public a(C6595o c6595o) {
            this.f8605a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public final TokenTranslations call() throws Exception {
            C6595o c6595o = this.f8605a;
            C1478l5 c1478l5 = C1478l5.this;
            RoomDatabase roomDatabase = c1478l5.f8600a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "termWithLanguageAndTarget");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "translations");
                    String str = null;
                    TokenTranslations tokenTranslations = str;
                    if (cursorM16698S0.moveToFirst()) {
                        tokenTranslations = new TokenTranslations(c1478l5.f8602c.m5005p(cursorM16698S0.isNull(iM16742n1) ? str : cursorM16698S0.getString(iM16742n1)), cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0));
                    }
                    roomDatabase.m4568s();
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    roomDatabase.m4563n();
                    return tokenTranslations;
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

    /* JADX INFO: renamed from: bi.l5$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Translations` (`termWithLanguageAndTarget`,`translations`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Translations translations = (Translations) obj;
            String str = translations.f17549a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m5012w(translations.f17550b), 2);
        }
    }

    /* JADX INFO: renamed from: bi.l5$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Translations` SET `termWithLanguageAndTarget` = ?,`translations` = ? WHERE `termWithLanguageAndTarget` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Translations translations = (Translations) obj;
            String str = translations.f17549a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m5012w(translations.f17550b), 2);
            String str2 = translations.f17549a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l5$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `TokenAndPopularMeanings` (`termWithLanguage`,`locale`,`popularMeanings`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8806t c8806t = (C8806t) obj;
            String str = c8806t.f46678a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8806t.f46679b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m4995e(c8806t.f46680c), 3);
        }
    }

    /* JADX INFO: renamed from: bi.l5$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `TokenAndPopularMeanings` SET `termWithLanguage` = ?,`locale` = ?,`popularMeanings` = ? WHERE `termWithLanguage` = ? AND `locale` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8806t c8806t = (C8806t) obj;
            String str = c8806t.f46678a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8806t.f46679b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m4995e(c8806t.f46680c), 3);
            String str3 = c8806t.f46678a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str2, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l5$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `TokenAndRelatedPhrases` (`termWithLanguage`,`relatedPhrases`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8807u c8807u = (C8807u) obj;
            String str = c8807u.f46681a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m4996f(c8807u.f46682b), 2);
        }
    }

    /* JADX INFO: renamed from: bi.l5$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `TokenAndRelatedPhrases` SET `termWithLanguage` = ?,`relatedPhrases` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8807u c8807u = (C8807u) obj;
            String str = c8807u.f46681a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13197h0(C1478l5.this.f8602c.m4996f(c8807u.f46682b), 2);
            String str2 = c8807u.f46681a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.l5$h */
    public class h implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Translations f8613a;

        public h(Translations translations) {
            this.f8613a = translations;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1478l5 c1478l5 = C1478l5.this;
            RoomDatabase roomDatabase = c1478l5.f8600a;
            RoomDatabase roomDatabase2 = c1478l5.f8600a;
            roomDatabase.m4552c();
            try {
                c1478l5.f8601b.m1225m(this.f8613a);
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

    /* JADX INFO: renamed from: bi.l5$i */
    public class i implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8806t f8615a;

        public i(C8806t c8806t) {
            this.f8615a = c8806t;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1478l5 c1478l5 = C1478l5.this;
            RoomDatabase roomDatabase = c1478l5.f8600a;
            RoomDatabase roomDatabase2 = c1478l5.f8600a;
            roomDatabase.m4552c();
            try {
                c1478l5.f8603d.m1225m(this.f8615a);
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

    /* JADX INFO: renamed from: bi.l5$j */
    public class j implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8807u f8617a;

        public j(C8807u c8807u) {
            this.f8617a = c8807u;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1478l5 c1478l5 = C1478l5.this;
            RoomDatabase roomDatabase = c1478l5.f8600a;
            RoomDatabase roomDatabase2 = c1478l5.f8600a;
            roomDatabase.m4552c();
            try {
                c1478l5.f8604e.m1225m(this.f8617a);
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

    public C1478l5(RoomDatabase roomDatabase) {
        this.f8600a = roomDatabase;
        this.f8601b = new C0322j(new b(roomDatabase), new c(roomDatabase));
        this.f8603d = new C0322j(new d(roomDatabase), new e(roomDatabase));
        this.f8604e = new C0322j(new f(roomDatabase), new g(roomDatabase));
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: a */
    public final C7136q mo5042a(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT popularMeanings FROM TokenAndPopularMeanings WHERE termWithLanguage = ? AND locale = ?", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        CallableC1464j5 callableC1464j5 = new CallableC1464j5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8600a, true, new String[]{"TokenAndPopularMeanings"}, callableC1464j5);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: b */
    public final C7136q mo5043b(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT relatedPhrases FROM TokenAndRelatedPhrases WHERE termWithLanguage = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1457i5 callableC1457i5 = new CallableC1457i5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8600a, true, new String[]{"TokenAndRelatedPhrases"}, callableC1457i5);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: c */
    public final C7136q mo5044c(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Translations WHERE termWithLanguageAndTarget = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1471k5 callableC1471k5 = new CallableC1471k5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8600a, true, new String[]{"Translations"}, callableC1471k5);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: d */
    public final Object mo5045d(String str, InterfaceC9968c<? super TokenTranslations> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Translations WHERE termWithLanguageAndTarget = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8600a, true, new CancellationSignal(), new a(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: e */
    public final Object mo5046e(Translations translations, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8600a, new h(translations), interfaceC9968c);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: f */
    public final Object mo5047f(C8806t c8806t, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8600a, new i(c8806t), interfaceC9968c);
    }

    @Override // bi.AbstractC1450h5
    /* JADX INFO: renamed from: g */
    public final Object mo5048g(C8807u c8807u, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8600a, new j(c8807u), interfaceC9968c);
    }
}
