package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.Card;
import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.Meaning;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import li.C7374a;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8787a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1404c extends AbstractC1388a {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8337a;

    /* JADX INFO: renamed from: b */
    public final c f8338b;

    /* JADX INFO: renamed from: c */
    public final f f8339c;

    /* JADX INFO: renamed from: d */
    public final C1405c0 f8340d = new C1405c0();

    /* JADX INFO: renamed from: e */
    public final g f8341e;

    /* JADX INFO: renamed from: f */
    public final C0322j f8342f;

    /* JADX INFO: renamed from: bi.c$a */
    public class a implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8343a;

        public a(List list) {
            this.f8343a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1404c c1404c = C1404c.this;
            RoomDatabase roomDatabase = c1404c.f8337a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1404c.f8342f.m1228p(this.f8343a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$b */
    public class b implements Callable<C7374a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8345a;

        public b(C6595o c6595o) {
            this.f8345a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final C7374a call() throws Exception {
            C7374a c7374a;
            String string;
            int i10;
            LessonStudyTransliteration lessonStudyTransliteration;
            C1404c c1404c = C1404c.this;
            RoomDatabase roomDatabase = c1404c.f8337a;
            C1405c0 c1405c0 = c1404c.f8340d;
            C6595o c6595o = this.f8345a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                if (cursorM16698S0.moveToFirst()) {
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    int i11 = cursorM16698S0.getInt(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    int i12 = cursorM16698S0.getInt(3);
                    Integer numValueOf = cursorM16698S0.isNull(4) ? null : Integer.valueOf(cursorM16698S0.getInt(4));
                    String string4 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                    String string5 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                    int i13 = cursorM16698S0.getInt(7);
                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9));
                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10));
                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11));
                    boolean z10 = cursorM16698S0.getInt(12) != 0;
                    if (cursorM16698S0.isNull(13) && cursorM16698S0.isNull(14) && cursorM16698S0.isNull(15) && cursorM16698S0.isNull(16) && cursorM16698S0.isNull(17) && cursorM16698S0.isNull(18)) {
                        lessonStudyTransliteration = null;
                    } else {
                        String string6 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                        String string7 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                        String string8 = cursorM16698S0.isNull(15) ? null : cursorM16698S0.getString(15);
                        String string9 = cursorM16698S0.isNull(16) ? null : cursorM16698S0.getString(16);
                        if (cursorM16698S0.isNull(17)) {
                            i10 = 18;
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(17);
                            i10 = 18;
                        }
                        lessonStudyTransliteration = new LessonStudyTransliteration(string6, string7, string8, string9, string, cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10));
                    }
                    c7374a = new C7374a(string2, listM4992l, listM4992l2, z10, listM5007r, i13, string3, i11, i12, numValueOf, string4, string5, listM4992l3, lessonStudyTransliteration);
                } else {
                    c7374a = null;
                }
                return c7374a;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Card` WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Card) obj).f16855b;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$d */
    public class d implements Callable<List<C7374a>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8347a;

        public d(C6595o c6595o) {
            this.f8347a = c6595o;
        }

        /* JADX WARN: Code duplicated, block: B:72:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:73:0x01bc A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:77:0x01cb A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:81:0x01da A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:85:0x01e9 A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:89:0x01f8 A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x0207 A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:8:0x0063, B:9:0x009e, B:11:0x00a4, B:15:0x00b7, B:19:0x00ca, B:23:0x00e1, B:27:0x00f0, B:31:0x00ff, B:35:0x0110, B:39:0x0121, B:43:0x0132, B:47:0x0143, B:51:0x0158, B:53:0x0166, B:55:0x0170, B:57:0x017a, B:59:0x0184, B:61:0x018e, B:70:0x01b3, B:74:0x01c2, B:78:0x01d1, B:82:0x01e0, B:86:0x01ef, B:90:0x01fe, B:94:0x020c, B:93:0x0207, B:89:0x01f8, B:85:0x01e9, B:81:0x01da, B:77:0x01cb, B:73:0x01bc, B:95:0x0214, B:46:0x013f, B:42:0x012e, B:38:0x011d, B:34:0x010c, B:30:0x00f9, B:26:0x00ea, B:22:0x00d7, B:18:0x00c4, B:14:0x00b1, B:98:0x023c), top: B:117:0x0063 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final List<C7374a> call() throws Exception {
            C6595o c6595o;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            C6595o c6595o2 = this.f8347a;
            C1404c c1404c = C1404c.this;
            RoomDatabase roomDatabase = c1404c.f8337a;
            C1405c0 c1405c0 = c1404c.f8340d;
            roomDatabase.m4552c();
            try {
                try {
                    Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
                    try {
                        int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "term");
                        int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "id");
                        int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "fragment");
                        int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "status");
                        int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "extendedStatus");
                        int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "srsDueDate");
                        int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "notes");
                        int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "importance");
                        int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "meanings");
                        int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "tags");
                        int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "gTags");
                        int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "words");
                        c6595o = c6595o2;
                        try {
                            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
                            try {
                                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "hiragana");
                                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "romaji");
                                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "pinyin");
                                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "hant");
                                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "hans");
                                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "jyutping");
                                int i20 = iM16742n12;
                                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                                while (cursorM16698S0.moveToNext()) {
                                    Object lessonStudyTransliteration = null;
                                    String string6 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                                    int i21 = cursorM16698S0.getInt(iM16742n1);
                                    String string7 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                                    int i22 = cursorM16698S0.getInt(iM16742n3);
                                    Integer numValueOf = cursorM16698S0.isNull(iM16742n4) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n4));
                                    String string8 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                                    String string9 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                                    int i23 = cursorM16698S0.getInt(iM16742n7);
                                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8));
                                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9));
                                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10));
                                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11));
                                    int i24 = i20;
                                    boolean z10 = cursorM16698S0.getInt(i24) != 0;
                                    int i25 = iM16742n13;
                                    C1405c0 c1405c1 = c1405c0;
                                    if (cursorM16698S0.isNull(i25)) {
                                        i10 = iM16742n11;
                                        i11 = iM16742n14;
                                        if (cursorM16698S0.isNull(i11)) {
                                            i12 = i24;
                                            i13 = iM16742n15;
                                            if (cursorM16698S0.isNull(i13)) {
                                                i14 = iM16742n0;
                                                i15 = iM16742n16;
                                                if (cursorM16698S0.isNull(i15)) {
                                                    i16 = iM16742n1;
                                                    i17 = iM16742n17;
                                                    if (cursorM16698S0.isNull(i17)) {
                                                        i18 = iM16742n2;
                                                        i19 = iM16742n18;
                                                        if (!cursorM16698S0.isNull(i19)) {
                                                        }
                                                        arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                                        c1405c0 = c1405c1;
                                                        iM16742n13 = i25;
                                                        iM16742n18 = i19;
                                                        iM16742n2 = i18;
                                                        iM16742n17 = i17;
                                                        iM16742n1 = i16;
                                                        iM16742n16 = i15;
                                                        iM16742n0 = i14;
                                                        iM16742n15 = i13;
                                                        int i26 = i12;
                                                        iM16742n14 = i11;
                                                        iM16742n11 = i10;
                                                        i20 = i26;
                                                    }
                                                    if (cursorM16698S0.isNull(i25)) {
                                                        string = null;
                                                    } else {
                                                        string = cursorM16698S0.getString(i25);
                                                    }
                                                    if (cursorM16698S0.isNull(i11)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursorM16698S0.getString(i11);
                                                    }
                                                    if (cursorM16698S0.isNull(i13)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursorM16698S0.getString(i13);
                                                    }
                                                    if (cursorM16698S0.isNull(i15)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursorM16698S0.getString(i15);
                                                    }
                                                    if (cursorM16698S0.isNull(i17)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursorM16698S0.getString(i17);
                                                    }
                                                    lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19));
                                                    arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                                    c1405c0 = c1405c1;
                                                    iM16742n13 = i25;
                                                    iM16742n18 = i19;
                                                    iM16742n2 = i18;
                                                    iM16742n17 = i17;
                                                    iM16742n1 = i16;
                                                    iM16742n16 = i15;
                                                    iM16742n0 = i14;
                                                    iM16742n15 = i13;
                                                    int i27 = i12;
                                                    iM16742n14 = i11;
                                                    iM16742n11 = i10;
                                                    i20 = i27;
                                                }
                                                i18 = iM16742n2;
                                                i19 = iM16742n18;
                                                if (cursorM16698S0.isNull(i25)) {
                                                    string = null;
                                                } else {
                                                    string = cursorM16698S0.getString(i25);
                                                }
                                                if (cursorM16698S0.isNull(i11)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursorM16698S0.getString(i11);
                                                }
                                                if (cursorM16698S0.isNull(i13)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursorM16698S0.getString(i13);
                                                }
                                                if (cursorM16698S0.isNull(i15)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursorM16698S0.getString(i15);
                                                }
                                                if (cursorM16698S0.isNull(i17)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursorM16698S0.getString(i17);
                                                }
                                                lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19));
                                                arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                                c1405c0 = c1405c1;
                                                iM16742n13 = i25;
                                                iM16742n18 = i19;
                                                iM16742n2 = i18;
                                                iM16742n17 = i17;
                                                iM16742n1 = i16;
                                                iM16742n16 = i15;
                                                iM16742n0 = i14;
                                                iM16742n15 = i13;
                                                int i28 = i12;
                                                iM16742n14 = i11;
                                                iM16742n11 = i10;
                                                i20 = i28;
                                            }
                                            i16 = iM16742n1;
                                            i17 = iM16742n17;
                                            i18 = iM16742n2;
                                            i19 = iM16742n18;
                                            if (cursorM16698S0.isNull(i25)) {
                                                string = null;
                                            } else {
                                                string = cursorM16698S0.getString(i25);
                                            }
                                            if (cursorM16698S0.isNull(i11)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursorM16698S0.getString(i11);
                                            }
                                            if (cursorM16698S0.isNull(i13)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursorM16698S0.getString(i13);
                                            }
                                            if (cursorM16698S0.isNull(i15)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursorM16698S0.getString(i15);
                                            }
                                            if (cursorM16698S0.isNull(i17)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursorM16698S0.getString(i17);
                                            }
                                            lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19));
                                            arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                            c1405c0 = c1405c1;
                                            iM16742n13 = i25;
                                            iM16742n18 = i19;
                                            iM16742n2 = i18;
                                            iM16742n17 = i17;
                                            iM16742n1 = i16;
                                            iM16742n16 = i15;
                                            iM16742n0 = i14;
                                            iM16742n15 = i13;
                                            int i29 = i12;
                                            iM16742n14 = i11;
                                            iM16742n11 = i10;
                                            i20 = i29;
                                        }
                                        i14 = iM16742n0;
                                        i15 = iM16742n16;
                                        i16 = iM16742n1;
                                        i17 = iM16742n17;
                                        i18 = iM16742n2;
                                        i19 = iM16742n18;
                                        if (cursorM16698S0.isNull(i25)) {
                                            string = null;
                                        } else {
                                            string = cursorM16698S0.getString(i25);
                                        }
                                        if (cursorM16698S0.isNull(i11)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorM16698S0.getString(i11);
                                        }
                                        if (cursorM16698S0.isNull(i13)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorM16698S0.getString(i13);
                                        }
                                        if (cursorM16698S0.isNull(i15)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorM16698S0.getString(i15);
                                        }
                                        if (cursorM16698S0.isNull(i17)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorM16698S0.getString(i17);
                                        }
                                        lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19));
                                        arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                        c1405c0 = c1405c1;
                                        iM16742n13 = i25;
                                        iM16742n18 = i19;
                                        iM16742n2 = i18;
                                        iM16742n17 = i17;
                                        iM16742n1 = i16;
                                        iM16742n16 = i15;
                                        iM16742n0 = i14;
                                        iM16742n15 = i13;
                                        int i210 = i12;
                                        iM16742n14 = i11;
                                        iM16742n11 = i10;
                                        i20 = i210;
                                    } else {
                                        i10 = iM16742n11;
                                        i11 = iM16742n14;
                                    }
                                    i12 = i24;
                                    i13 = iM16742n15;
                                    i14 = iM16742n0;
                                    i15 = iM16742n16;
                                    i16 = iM16742n1;
                                    i17 = iM16742n17;
                                    i18 = iM16742n2;
                                    i19 = iM16742n18;
                                    if (cursorM16698S0.isNull(i25)) {
                                        string = null;
                                    } else {
                                        string = cursorM16698S0.getString(i25);
                                    }
                                    if (cursorM16698S0.isNull(i11)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorM16698S0.getString(i11);
                                    }
                                    if (cursorM16698S0.isNull(i13)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorM16698S0.getString(i13);
                                    }
                                    if (cursorM16698S0.isNull(i15)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorM16698S0.getString(i15);
                                    }
                                    if (cursorM16698S0.isNull(i17)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorM16698S0.getString(i17);
                                    }
                                    lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19));
                                    arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i23, string7, i21, i22, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                    c1405c0 = c1405c1;
                                    iM16742n13 = i25;
                                    iM16742n18 = i19;
                                    iM16742n2 = i18;
                                    iM16742n17 = i17;
                                    iM16742n1 = i16;
                                    iM16742n16 = i15;
                                    iM16742n0 = i14;
                                    iM16742n15 = i13;
                                    int i211 = i12;
                                    iM16742n14 = i11;
                                    iM16742n11 = i10;
                                    i20 = i211;
                                }
                                roomDatabase.m4568s();
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                roomDatabase.m4563n();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorM16698S0.close();
                            c6595o.m13198q();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c6595o = c6595o2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    roomDatabase.m4563n();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                roomDatabase.m4563n();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$e */
    public class e implements Callable<List<Card>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8349a;

        public e(C6595o c6595o) {
            this.f8349a = c6595o;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0264  */
        /* JADX WARN: Code duplicated, block: B:101:0x0267 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0273  */
        /* JADX WARN: Code duplicated, block: B:105:0x0276 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0282  */
        /* JADX WARN: Code duplicated, block: B:109:0x0285 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x0294 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0246  */
        /* JADX WARN: Code duplicated, block: B:93:0x0249 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0255  */
        /* JADX WARN: Code duplicated, block: B:97:0x0258 A[Catch: all -> 0x02c7, TryCatch #2 {all -> 0x02c7, blocks: (B:8:0x0063, B:9:0x00c6, B:11:0x00cc, B:15:0x00df, B:19:0x00ee, B:23:0x0101, B:27:0x0110, B:31:0x0127, B:35:0x0136, B:39:0x0145, B:43:0x0154, B:47:0x0163, B:51:0x0174, B:55:0x0197, B:59:0x01a4, B:63:0x01b9, B:67:0x01ce, B:71:0x01e5, B:73:0x01f1, B:75:0x01fb, B:77:0x0205, B:79:0x020f, B:81:0x0219, B:90:0x0240, B:94:0x024f, B:98:0x025e, B:102:0x026d, B:106:0x027c, B:110:0x028b, B:114:0x0299, B:113:0x0294, B:109:0x0285, B:105:0x0276, B:101:0x0267, B:97:0x0258, B:93:0x0249, B:115:0x02a1, B:66:0x01ca, B:62:0x01b5, B:58:0x01a0, B:54:0x018d, B:50:0x0170, B:46:0x015d, B:42:0x014e, B:38:0x013f, B:34:0x0130, B:30:0x011d, B:26:0x010a, B:22:0x00fb, B:18:0x00e8, B:14:0x00d9, B:118:0x02c9), top: B:137:0x0063 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final List<Card> call() throws Exception {
            C6595o c6595o;
            C1405c0 c1405c0;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            C6595o c6595o2 = this.f8349a;
            C1404c c1404c = C1404c.this;
            RoomDatabase roomDatabase = c1404c.f8337a;
            C1405c0 c1405c1 = c1404c.f8340d;
            roomDatabase.m4552c();
            try {
                try {
                    Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
                    try {
                        int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "term");
                        int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "termWithLanguage");
                        int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "id");
                        int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "url");
                        int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "fragment");
                        int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "status");
                        int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "extendedStatus");
                        int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "lastReviewedCorrect");
                        int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "srsDueDate");
                        int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "notes");
                        int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "audio");
                        int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "importance");
                        c6595o = c6595o2;
                        try {
                            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "meanings");
                            try {
                                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "meaningTerms");
                                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "tags");
                                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "gTags");
                                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "words");
                                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
                                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "hiragana");
                                int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "romaji");
                                int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "pinyin");
                                int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "hant");
                                int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "hans");
                                int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "jyutping");
                                C1405c0 c1405c2 = c1405c1;
                                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                                while (cursorM16698S0.moveToNext()) {
                                    Object lessonTransliteration = null;
                                    String string6 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                                    String string7 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                                    int i19 = cursorM16698S0.getInt(iM16742n2);
                                    String string8 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                                    String string9 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                                    int i20 = cursorM16698S0.getInt(iM16742n5);
                                    Integer numValueOf = cursorM16698S0.isNull(iM16742n6) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n6));
                                    String string10 = cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7);
                                    String string11 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                                    String string12 = cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9);
                                    String string13 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                                    int i21 = cursorM16698S0.getInt(iM16742n11);
                                    C1405c0 c1405c3 = c1405c2;
                                    int i22 = iM16742n11;
                                    List<Meaning> listM5002m = c1405c3.m5002m(cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12));
                                    iM16742n13 = iM16742n13;
                                    String string14 = cursorM16698S0.isNull(iM16742n13) ? null : cursorM16698S0.getString(iM16742n13);
                                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n14) ? null : cursorM16698S0.getString(iM16742n14));
                                    iM16742n14 = iM16742n14;
                                    int i23 = iM16742n15;
                                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(i23) ? null : cursorM16698S0.getString(i23));
                                    iM16742n15 = i23;
                                    int i24 = iM16742n16;
                                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(i24) ? null : cursorM16698S0.getString(i24));
                                    iM16742n16 = i24;
                                    int i25 = iM16742n17;
                                    boolean z10 = cursorM16698S0.getInt(i25) != 0;
                                    iM16742n17 = i25;
                                    int i26 = iM16742n18;
                                    if (cursorM16698S0.isNull(i26)) {
                                        c1405c0 = c1405c3;
                                        i10 = iM16742n19;
                                        if (cursorM16698S0.isNull(i10)) {
                                            i11 = iM16742n12;
                                            i12 = iM16742n20;
                                            if (cursorM16698S0.isNull(i12)) {
                                                i13 = iM16742n0;
                                                i14 = iM16742n21;
                                                if (cursorM16698S0.isNull(i14)) {
                                                    i15 = iM16742n1;
                                                    i16 = iM16742n22;
                                                    if (cursorM16698S0.isNull(i16)) {
                                                        i17 = iM16742n2;
                                                        i18 = iM16742n23;
                                                        if (!cursorM16698S0.isNull(i18)) {
                                                        }
                                                        arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                                        int i27 = i11;
                                                        iM16742n19 = i10;
                                                        iM16742n11 = i22;
                                                        c1405c2 = c1405c0;
                                                        iM16742n18 = i26;
                                                        iM16742n23 = i18;
                                                        iM16742n2 = i17;
                                                        iM16742n22 = i16;
                                                        iM16742n1 = i15;
                                                        iM16742n21 = i14;
                                                        iM16742n0 = i13;
                                                        iM16742n20 = i12;
                                                        iM16742n12 = i27;
                                                    }
                                                    if (cursorM16698S0.isNull(i26)) {
                                                        string = null;
                                                    } else {
                                                        string = cursorM16698S0.getString(i26);
                                                    }
                                                    if (cursorM16698S0.isNull(i10)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursorM16698S0.getString(i10);
                                                    }
                                                    if (cursorM16698S0.isNull(i12)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursorM16698S0.getString(i12);
                                                    }
                                                    if (cursorM16698S0.isNull(i14)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursorM16698S0.getString(i14);
                                                    }
                                                    if (cursorM16698S0.isNull(i16)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursorM16698S0.getString(i16);
                                                    }
                                                    lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                                    arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                                    int i28 = i11;
                                                    iM16742n19 = i10;
                                                    iM16742n11 = i22;
                                                    c1405c2 = c1405c0;
                                                    iM16742n18 = i26;
                                                    iM16742n23 = i18;
                                                    iM16742n2 = i17;
                                                    iM16742n22 = i16;
                                                    iM16742n1 = i15;
                                                    iM16742n21 = i14;
                                                    iM16742n0 = i13;
                                                    iM16742n20 = i12;
                                                    iM16742n12 = i28;
                                                }
                                                i17 = iM16742n2;
                                                i18 = iM16742n23;
                                                if (cursorM16698S0.isNull(i26)) {
                                                    string = null;
                                                } else {
                                                    string = cursorM16698S0.getString(i26);
                                                }
                                                if (cursorM16698S0.isNull(i10)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursorM16698S0.getString(i10);
                                                }
                                                if (cursorM16698S0.isNull(i12)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursorM16698S0.getString(i12);
                                                }
                                                if (cursorM16698S0.isNull(i14)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursorM16698S0.getString(i14);
                                                }
                                                if (cursorM16698S0.isNull(i16)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursorM16698S0.getString(i16);
                                                }
                                                lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                                arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                                int i29 = i11;
                                                iM16742n19 = i10;
                                                iM16742n11 = i22;
                                                c1405c2 = c1405c0;
                                                iM16742n18 = i26;
                                                iM16742n23 = i18;
                                                iM16742n2 = i17;
                                                iM16742n22 = i16;
                                                iM16742n1 = i15;
                                                iM16742n21 = i14;
                                                iM16742n0 = i13;
                                                iM16742n20 = i12;
                                                iM16742n12 = i29;
                                            }
                                            i15 = iM16742n1;
                                            i16 = iM16742n22;
                                            i17 = iM16742n2;
                                            i18 = iM16742n23;
                                            if (cursorM16698S0.isNull(i26)) {
                                                string = null;
                                            } else {
                                                string = cursorM16698S0.getString(i26);
                                            }
                                            if (cursorM16698S0.isNull(i10)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursorM16698S0.getString(i10);
                                            }
                                            if (cursorM16698S0.isNull(i12)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursorM16698S0.getString(i12);
                                            }
                                            if (cursorM16698S0.isNull(i14)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursorM16698S0.getString(i14);
                                            }
                                            if (cursorM16698S0.isNull(i16)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursorM16698S0.getString(i16);
                                            }
                                            lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                            arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                            int i210 = i11;
                                            iM16742n19 = i10;
                                            iM16742n11 = i22;
                                            c1405c2 = c1405c0;
                                            iM16742n18 = i26;
                                            iM16742n23 = i18;
                                            iM16742n2 = i17;
                                            iM16742n22 = i16;
                                            iM16742n1 = i15;
                                            iM16742n21 = i14;
                                            iM16742n0 = i13;
                                            iM16742n20 = i12;
                                            iM16742n12 = i210;
                                        }
                                        i13 = iM16742n0;
                                        i14 = iM16742n21;
                                        i15 = iM16742n1;
                                        i16 = iM16742n22;
                                        i17 = iM16742n2;
                                        i18 = iM16742n23;
                                        if (cursorM16698S0.isNull(i26)) {
                                            string = null;
                                        } else {
                                            string = cursorM16698S0.getString(i26);
                                        }
                                        if (cursorM16698S0.isNull(i10)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorM16698S0.getString(i10);
                                        }
                                        if (cursorM16698S0.isNull(i12)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorM16698S0.getString(i12);
                                        }
                                        if (cursorM16698S0.isNull(i14)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorM16698S0.getString(i14);
                                        }
                                        if (cursorM16698S0.isNull(i16)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorM16698S0.getString(i16);
                                        }
                                        lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                        arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                        int i211 = i11;
                                        iM16742n19 = i10;
                                        iM16742n11 = i22;
                                        c1405c2 = c1405c0;
                                        iM16742n18 = i26;
                                        iM16742n23 = i18;
                                        iM16742n2 = i17;
                                        iM16742n22 = i16;
                                        iM16742n1 = i15;
                                        iM16742n21 = i14;
                                        iM16742n0 = i13;
                                        iM16742n20 = i12;
                                        iM16742n12 = i211;
                                    } else {
                                        c1405c0 = c1405c3;
                                        i10 = iM16742n19;
                                    }
                                    i11 = iM16742n12;
                                    i12 = iM16742n20;
                                    i13 = iM16742n0;
                                    i14 = iM16742n21;
                                    i15 = iM16742n1;
                                    i16 = iM16742n22;
                                    i17 = iM16742n2;
                                    i18 = iM16742n23;
                                    if (cursorM16698S0.isNull(i26)) {
                                        string = null;
                                    } else {
                                        string = cursorM16698S0.getString(i26);
                                    }
                                    if (cursorM16698S0.isNull(i10)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorM16698S0.getString(i10);
                                    }
                                    if (cursorM16698S0.isNull(i12)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorM16698S0.getString(i12);
                                    }
                                    if (cursorM16698S0.isNull(i14)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorM16698S0.getString(i14);
                                    }
                                    if (cursorM16698S0.isNull(i16)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorM16698S0.getString(i16);
                                    }
                                    lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                    arrayList.add(new Card(string6, string7, i19, string8, string9, i20, numValueOf, string10, string11, string12, string13, i21, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10));
                                    int i212 = i11;
                                    iM16742n19 = i10;
                                    iM16742n11 = i22;
                                    c1405c2 = c1405c0;
                                    iM16742n18 = i26;
                                    iM16742n23 = i18;
                                    iM16742n2 = i17;
                                    iM16742n22 = i16;
                                    iM16742n1 = i15;
                                    iM16742n21 = i14;
                                    iM16742n0 = i13;
                                    iM16742n20 = i12;
                                    iM16742n12 = i212;
                                }
                                roomDatabase.m4568s();
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                roomDatabase.m4563n();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorM16698S0.close();
                            c6595o.m13198q();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c6595o = c6595o2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    roomDatabase.m4563n();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                roomDatabase.m4563n();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `Card` SET `id` = ?,`termWithLanguage` = ?,`status` = ?,`extendedStatus` = ?,`tags` = ?,`gTags` = ?,`notes` = ?,`meanings` = ?,`meaningTerms` = ?,`srsDueDate` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8787a c8787a = (C8787a) obj;
            interfaceC7920f.mo13194W(1, c8787a.f46587a);
            String str = c8787a.f46588b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8787a.f46589c);
            Integer num = c8787a.f46590d;
            if (num == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13194W(4, num.intValue());
            }
            C1404c c1404c = C1404c.this;
            C1405c0 c1405c0 = c1404c.f8340d;
            List<String> list = c8787a.f46591e;
            c1405c0.getClass();
            String strM4991d = C1405c0.m4991d(list);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 5);
            }
            C1405c0 c1405c1 = c1404c.f8340d;
            c1405c1.getClass();
            String strM4991d2 = C1405c0.m4991d(c8787a.f46592f);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 6);
            }
            String str2 = c8787a.f46593g;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str2, 7);
            }
            interfaceC7920f.mo13197h0(c1405c1.m4995e(c8787a.f46594h), 8);
            String str3 = c8787a.f46595i;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str3, 9);
            }
            String str4 = c8787a.f46596j;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str4, 10);
            }
            if (str == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str, 11);
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$g */
    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM Card WHERE termWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.c$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Card` (`term`,`termWithLanguage`,`id`,`url`,`fragment`,`status`,`extendedStatus`,`lastReviewedCorrect`,`srsDueDate`,`notes`,`audio`,`importance`,`meanings`,`meaningTerms`,`tags`,`gTags`,`words`,`isPhrase`,`hiragana`,`romaji`,`pinyin`,`hant`,`hans`,`jyutping`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Card card = (Card) obj;
            String str = card.f16854a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = card.f16855b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, card.f16856c);
            String str3 = card.f16857d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = card.f16858e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            interfaceC7920f.mo13194W(6, card.f16859f);
            Integer num = card.f16860g;
            if (num == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13194W(7, num.intValue());
            }
            String str5 = card.f16861h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = card.f16862i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = card.f16863j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = card.f16864k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            interfaceC7920f.mo13194W(12, card.f16865l);
            C1404c c1404c = C1404c.this;
            interfaceC7920f.mo13197h0(c1404c.f8340d.m4995e(card.f16866m), 13);
            String str9 = card.f16867n;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str9, 14);
            }
            c1404c.f8340d.getClass();
            String strM4991d = C1405c0.m4991d(card.f16868o);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 15);
            }
            String strM4991d2 = C1405c0.m4991d(card.f16869p);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 16);
            }
            String strM4991d3 = C1405c0.m4991d(card.f16870q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 17);
            }
            interfaceC7920f.mo13194W(18, card.f16872s ? 1L : 0L);
            LessonTransliteration lessonTransliteration = card.f16871r;
            if (lessonTransliteration == null) {
                interfaceC7920f.mo13193J0(19);
                interfaceC7920f.mo13193J0(20);
                interfaceC7920f.mo13193J0(21);
                interfaceC7920f.mo13193J0(22);
                interfaceC7920f.mo13193J0(23);
                interfaceC7920f.mo13193J0(24);
                return;
            }
            String str10 = lessonTransliteration.f17179a;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(19);
            } else {
                interfaceC7920f.mo13197h0(str10, 19);
            }
            String str11 = lessonTransliteration.f17180b;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str11, 20);
            }
            String str12 = lessonTransliteration.f17181c;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(21);
            } else {
                interfaceC7920f.mo13197h0(str12, 21);
            }
            String str13 = lessonTransliteration.f17182d;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(22);
            } else {
                interfaceC7920f.mo13197h0(str13, 22);
            }
            String str14 = lessonTransliteration.f17183e;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(23);
            } else {
                interfaceC7920f.mo13197h0(str14, 23);
            }
            String str15 = lessonTransliteration.f17184f;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13197h0(str15, 24);
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Card` SET `term` = ?,`termWithLanguage` = ?,`id` = ?,`url` = ?,`fragment` = ?,`status` = ?,`extendedStatus` = ?,`lastReviewedCorrect` = ?,`srsDueDate` = ?,`notes` = ?,`audio` = ?,`importance` = ?,`meanings` = ?,`meaningTerms` = ?,`tags` = ?,`gTags` = ?,`words` = ?,`isPhrase` = ?,`hiragana` = ?,`romaji` = ?,`pinyin` = ?,`hant` = ?,`hans` = ?,`jyutping` = ? WHERE `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Card card = (Card) obj;
            String str = card.f16854a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = card.f16855b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, card.f16856c);
            String str3 = card.f16857d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = card.f16858e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            interfaceC7920f.mo13194W(6, card.f16859f);
            Integer num = card.f16860g;
            if (num == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13194W(7, num.intValue());
            }
            String str5 = card.f16861h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str5, 8);
            }
            String str6 = card.f16862i;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = card.f16863j;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = card.f16864k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            interfaceC7920f.mo13194W(12, card.f16865l);
            C1404c c1404c = C1404c.this;
            interfaceC7920f.mo13197h0(c1404c.f8340d.m4995e(card.f16866m), 13);
            String str9 = card.f16867n;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str9, 14);
            }
            c1404c.f8340d.getClass();
            String strM4991d = C1405c0.m4991d(card.f16868o);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 15);
            }
            String strM4991d2 = C1405c0.m4991d(card.f16869p);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 16);
            }
            String strM4991d3 = C1405c0.m4991d(card.f16870q);
            if (strM4991d3 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(strM4991d3, 17);
            }
            interfaceC7920f.mo13194W(18, card.f16872s ? 1L : 0L);
            LessonTransliteration lessonTransliteration = card.f16871r;
            if (lessonTransliteration != null) {
                String str10 = lessonTransliteration.f17179a;
                if (str10 == null) {
                    interfaceC7920f.mo13193J0(19);
                } else {
                    interfaceC7920f.mo13197h0(str10, 19);
                }
                String str11 = lessonTransliteration.f17180b;
                if (str11 == null) {
                    interfaceC7920f.mo13193J0(20);
                } else {
                    interfaceC7920f.mo13197h0(str11, 20);
                }
                String str12 = lessonTransliteration.f17181c;
                if (str12 == null) {
                    interfaceC7920f.mo13193J0(21);
                } else {
                    interfaceC7920f.mo13197h0(str12, 21);
                }
                String str13 = lessonTransliteration.f17182d;
                if (str13 == null) {
                    interfaceC7920f.mo13193J0(22);
                } else {
                    interfaceC7920f.mo13197h0(str13, 22);
                }
                String str14 = lessonTransliteration.f17183e;
                if (str14 == null) {
                    interfaceC7920f.mo13193J0(23);
                } else {
                    interfaceC7920f.mo13197h0(str14, 23);
                }
                String str15 = lessonTransliteration.f17184f;
                if (str15 == null) {
                    interfaceC7920f.mo13193J0(24);
                } else {
                    interfaceC7920f.mo13197h0(str15, 24);
                }
            } else {
                interfaceC7920f.mo13193J0(19);
                interfaceC7920f.mo13193J0(20);
                interfaceC7920f.mo13193J0(21);
                interfaceC7920f.mo13193J0(22);
                interfaceC7920f.mo13193J0(23);
                interfaceC7920f.mo13193J0(24);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13197h0(str2, 25);
            }
        }
    }

    /* JADX INFO: renamed from: bi.c$j */
    public class j implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8354a;

        public j(String str) {
            this.f8354a = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1404c c1404c = C1404c.this;
            g gVar = c1404c.f8341e;
            InterfaceC7920f interfaceC7920fM4574a = gVar.m4574a();
            String str = this.f8354a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            RoomDatabase roomDatabase = c1404c.f8337a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } finally {
                roomDatabase.m4563n();
                gVar.m4576c(interfaceC7920fM4574a);
            }
        }
    }

    public C1404c(RoomDatabase roomDatabase) {
        this.f8337a = roomDatabase;
        this.f8338b = new c(roomDatabase);
        this.f8339c = new f(roomDatabase);
        this.f8341e = new g(roomDatabase);
        this.f8342f = new C0322j(new h(roomDatabase), new i(roomDatabase));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8337a, new CallableC1396b(this, (Card) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends Card> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8337a, new a(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: k0 */
    public final Object mo4972k0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8337a, new j(str), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo4973l0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `term`, `id`, `fragment`, `status`, `extendedStatus`, `srsDueDate`, `notes`, `importance`, `meanings`, `tags`, `gTags`, `words`, `isPhrase`, `hiragana`, `romaji`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM Card WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1428f callableC1428f = new CallableC1428f(this, c6595oM13191l);
        return C1185b.m4579a(this.f8337a, false, new String[]{"Card"}, callableC1428f);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: m0 */
    public final C7136q mo4974m0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM Card JOIN LessonsAndCardsJoin ON contentId = ?\n    AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage\n    AND Card.isPhrase = 1\n    ORDER BY Card.termWithLanguage\n  ", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8337a, true, new String[]{"Card", "LessonsAndCardsJoin"}, new CallableC1465k(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: n0 */
    public final C7136q mo4975n0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM Card JOIN LessonsAndCardsJoin ON contentId = ?\n    AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage\n    ORDER BY Card.termWithLanguage\n  ", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8337a, true, new String[]{"Card", "LessonsAndCardsJoin"}, new CallableC1458j(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: o0 */
    public final C7136q mo4976o0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `id`, `fragment`, `status`, `extendedStatus`, `srsDueDate`, `notes`, `importance`, `meanings`, `tags`, `gTags`, `words`, `isPhrase`, `hiragana`, `romaji`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM Card WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append("))");
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
        return C1185b.m4579a(this.f8337a, true, new String[]{"Card"}, new CallableC1444h(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: p0 */
    public final C7136q mo4977p0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT COUNT(termWithLanguage) FROM Card WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND status < 3");
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
        return C1185b.m4579a(this.f8337a, false, new String[]{"Card"}, new CallableC1451i(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: q0 */
    public final C7136q mo4978q0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `term`, `status`, `extendedStatus`, `srsDueDate`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM Card WHERE termWithLanguage IN (");
        int size = arrayList.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append("))");
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
        return C1185b.m4579a(this.f8337a, true, new String[]{"Card"}, new CallableC1436g(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: r0 */
    public final Object mo4979r0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Card WHERE termWithLanguage = ?", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8337a, false, new CancellationSignal(), new CallableC1412d(this, c6595oM13191l), continuationImpl);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: s */
    public final Object mo604s(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8337a, new CallableC1472l(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: s0 */
    public final Object mo4980s0(String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `termWithLanguage`, `id`, `status`, `extendedStatus`, `srsDueDate`, `notes`, `meanings`, `meaningTerms`, `tags`, `gTags` FROM (SELECT * FROM Card WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8337a, false, new CancellationSignal(), new CallableC1420e(this, c6595oM13191l), continuationImpl);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: t0 */
    public final Object mo4981t0(int i10, InterfaceC9968c<? super List<C7374a>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM Card JOIN LessonsAndCardsJoin ON contentId = ?\n    AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage\n    ORDER BY Card.termWithLanguage\n  ", 1);
        return C1185b.m4581c(this.f8337a, true, C0141b.m610f(c6595oM13191l, 1, i10), new d(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: u0 */
    public final Object mo4982u0(int i10, InterfaceC9968c<? super List<Card>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT * FROM Card JOIN LessonsAndCardsJoin ON contentId = ?\n    AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage\n    ORDER BY Card.termWithLanguage\n  ", 1);
        return C1185b.m4581c(this.f8337a, true, C0141b.m610f(c6595oM13191l, 1, i10), new e(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: v0 */
    public final Object mo4983v0(String str, InterfaceC9968c<? super C7374a> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `term`, `id`, `fragment`, `status`, `extendedStatus`, `srsDueDate`, `notes`, `importance`, `meanings`, `tags`, `gTags`, `words`, `isPhrase`, `hiragana`, `romaji`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM Card WHERE termWithLanguage = ?)", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        return C1185b.m4581c(this.f8337a, false, new CancellationSignal(), new b(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1388a
    /* JADX INFO: renamed from: w0 */
    public final Object mo4984w0(C8787a c8787a, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8337a, new CallableC1479m(this, c8787a), continuationImpl);
    }
}
