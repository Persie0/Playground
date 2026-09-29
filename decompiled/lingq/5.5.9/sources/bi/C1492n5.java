package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import com.lingq.entity.TtsUtterance;
import com.lingq.entity.TtsVoice;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import dm.C5206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8795i;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.n5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1492n5 extends AbstractC1485m5 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8662a;

    /* JADX INFO: renamed from: b */
    public final C0322j f8663b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8664c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f8665d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8666e;

    /* JADX INFO: renamed from: bi.n5$a */
    public class a implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8667a;

        public a(List list) {
            this.f8667a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1492n5 c1492n5 = C1492n5.this;
            RoomDatabase roomDatabase = c1492n5.f8662a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1492n5.f8663b.m1228p(this.f8667a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$b */
    public class b implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8669a;

        public b(List list) {
            this.f8669a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1492n5 c1492n5 = C1492n5.this;
            RoomDatabase roomDatabase = c1492n5.f8662a;
            roomDatabase.m4552c();
            try {
                c1492n5.f8665d.m1226n(this.f8669a);
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

    /* JADX INFO: renamed from: bi.n5$c */
    public class c implements Callable<TextToSpeechVoice> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8671a;

        public c(C6595o c6595o) {
            this.f8671a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final TextToSpeechVoice call() throws Exception {
            Boolean boolValueOf;
            C6595o c6595o = this.f8671a;
            C1492n5 c1492n5 = C1492n5.this;
            RoomDatabase roomDatabase = c1492n5.f8662a;
            C1405c0 c1405c0 = c1492n5.f8664c;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "name");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "voicesByApp");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "alternative");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "priority");
                    TextToSpeechVoice textToSpeechVoice = null;
                    String string = null;
                    if (cursorM16698S0.moveToFirst()) {
                        String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                        String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                        List<TextToSpeechAppVoice> listM5006q = c1405c0.m5006q(cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2));
                        Integer numValueOf = cursorM16698S0.isNull(iM16742n3) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n3));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        if (!cursorM16698S0.isNull(iM16742n4)) {
                            string = cursorM16698S0.getString(iM16742n4);
                        }
                        textToSpeechVoice = new TextToSpeechVoice(string2, string3, listM5006q, boolValueOf, C1405c0.m4992l(string));
                    }
                    roomDatabase.m4568s();
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    roomDatabase.m4563n();
                    return textToSpeechVoice;
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

    /* JADX INFO: renamed from: bi.n5$d */
    public class d implements Callable<List<TextToSpeechVoice>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8673a;

        public d(C6595o c6595o) {
            this.f8673a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<TextToSpeechVoice> call() throws Exception {
            Boolean boolValueOf;
            C6595o c6595o = this.f8673a;
            C1492n5 c1492n5 = C1492n5.this;
            RoomDatabase roomDatabase = c1492n5.f8662a;
            C1405c0 c1405c0 = c1492n5.f8664c;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "name");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "voicesByApp");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "alternative");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "priority");
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                        String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                        List<TextToSpeechAppVoice> listM5006q = c1405c0.m5006q(cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2));
                        Integer numValueOf = cursorM16698S0.isNull(iM16742n3) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n3));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        if (!cursorM16698S0.isNull(iM16742n4)) {
                            string = cursorM16698S0.getString(iM16742n4);
                        }
                        arrayList.add(new TextToSpeechVoice(string2, string3, listM5006q, boolValueOf, C1405c0.m4992l(string)));
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

    /* JADX INFO: renamed from: bi.n5$e */
    public class e implements Callable<TextToSpeechTokenUtterance> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8675a;

        public e(C6595o c6595o) {
            this.f8675a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final TextToSpeechTokenUtterance call() throws Exception {
            RoomDatabase roomDatabase = C1492n5.this.f8662a;
            C6595o c6595o = this.f8675a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "idWithLanguageAndData");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "utteranceId");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "text");
                String str = null;
                TextToSpeechTokenUtterance textToSpeechTokenUtterance = str;
                if (cursorM16698S0.moveToFirst()) {
                    textToSpeechTokenUtterance = new TextToSpeechTokenUtterance(cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0), cursorM16698S0.getInt(iM16742n1), cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2), cursorM16698S0.isNull(iM16742n3) ? str : cursorM16698S0.getString(iM16742n3));
                }
                return textToSpeechTokenUtterance;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `TtsVoice` WHERE `name` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((TtsVoice) obj).f17566a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `TtsVoice` (`name`,`title`,`voicesByApp`,`alternative`,`priority`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TtsVoice ttsVoice = (TtsVoice) obj;
            String str = ttsVoice.f17566a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = ttsVoice.f17567b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            C1492n5 c1492n5 = C1492n5.this;
            interfaceC7920f.mo13197h0(c1492n5.f8664c.m5014y(ttsVoice.f17568c), 3);
            Boolean bool = ttsVoice.f17569d;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, numValueOf.intValue());
            }
            c1492n5.f8664c.getClass();
            String strM4991d = C1405c0.m4991d(ttsVoice.f17570e);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `TtsVoice` SET `name` = ?,`title` = ?,`voicesByApp` = ?,`alternative` = ?,`priority` = ? WHERE `name` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TtsVoice ttsVoice = (TtsVoice) obj;
            String str = ttsVoice.f17566a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = ttsVoice.f17567b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            C1492n5 c1492n5 = C1492n5.this;
            interfaceC7920f.mo13197h0(c1492n5.f8664c.m5014y(ttsVoice.f17568c), 3);
            Boolean bool = ttsVoice.f17569d;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, numValueOf.intValue());
            }
            c1492n5.f8664c.getClass();
            String strM4991d = C1405c0.m4991d(ttsVoice.f17570e);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            String str3 = ttsVoice.f17566a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str3, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `TtsUtterance` (`idWithLanguageAndData`,`utteranceId`,`audio`,`text`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TtsUtterance ttsUtterance = (TtsUtterance) obj;
            String str = ttsUtterance.f17559a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, ttsUtterance.f17560b);
            String str2 = ttsUtterance.f17561c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = ttsUtterance.f17562d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `TtsUtterance` SET `idWithLanguageAndData` = ?,`utteranceId` = ?,`audio` = ?,`text` = ? WHERE `idWithLanguageAndData` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TtsUtterance ttsUtterance = (TtsUtterance) obj;
            String str = ttsUtterance.f17559a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, ttsUtterance.f17560b);
            String str2 = ttsUtterance.f17561c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = ttsUtterance.f17562d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = ttsUtterance.f17559a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.n5$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LanguageAndTtsVoicesJoin` (`code`,`name`,`voiceOrder`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8795i c8795i = (C8795i) obj;
            String str = c8795i.f46645a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8795i.f46646b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, c8795i.f46647c);
        }
    }

    /* JADX INFO: renamed from: bi.n5$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LanguageAndTtsVoicesJoin` SET `code` = ?,`name` = ?,`voiceOrder` = ? WHERE `code` = ? AND `name` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8795i c8795i = (C8795i) obj;
            String str = c8795i.f46645a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = c8795i.f46646b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, c8795i.f46647c);
            String str3 = c8795i.f46645a;
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

    public C1492n5(RoomDatabase roomDatabase) {
        this.f8662a = roomDatabase;
        new f(roomDatabase);
        this.f8663b = new C0322j(new g(roomDatabase), new h(roomDatabase));
        this.f8665d = new C0322j(new i(roomDatabase), new j(roomDatabase));
        this.f8666e = new C0322j(new k(roomDatabase), new l(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends TtsVoice> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8662a, new a(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: k0 */
    public final Object mo5101k0(String str, InterfaceC9968c<? super TextToSpeechVoice> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n        SELECT DISTINCT * FROM TtsVoice\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoice.name = LanguageAndTtsVoicesJoin.name\n        ORDER BY voiceOrder ASC LIMIT 1", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8662a, true, new CancellationSignal(), new c(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: l0 */
    public final Object mo5102l0(String str, InterfaceC9968c<? super List<TextToSpeechVoice>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n        SELECT DISTINCT * FROM TtsVoice\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoice.name = LanguageAndTtsVoicesJoin.name AND TtsVoice.alternative is NULL \n        ORDER BY voiceOrder ASC", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8662a, true, new CancellationSignal(), new d(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: m0 */
    public final Object mo5103m0(String str, InterfaceC9968c<? super TextToSpeechTokenUtterance> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM TtsUtterance WHERE idWithLanguageAndData = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8662a, false, new CancellationSignal(), new e(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: n0 */
    public final Object mo5104n0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        StringBuilder sbM771r = C0166e.m771r("SELECT * FROM TtsUtterance WHERE idWithLanguageAndData IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(")");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 0);
        Iterator it = arrayList.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13197h0(str, i10);
            }
            i10++;
        }
        return C1185b.m4581c(this.f8662a, true, new CancellationSignal(), new CallableC1513q5(this, c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo5105o0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("\n        SELECT DISTINCT COUNT(*) FROM TtsVoice\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoice.name = LanguageAndTtsVoicesJoin.name", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1506p5 callableC1506p5 = new CallableC1506p5(this, c6595oM13191l);
        return C1185b.m4579a(this.f8662a, true, new String[]{"TtsVoice", "LanguageAndTtsVoicesJoin"}, callableC1506p5);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: p0 */
    public final Object mo5106p0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8662a, new CallableC1499o5(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1485m5
    /* JADX INFO: renamed from: q0 */
    public final Object mo5107q0(List<TtsUtterance> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8662a, new b(list), interfaceC9968c);
    }
}
