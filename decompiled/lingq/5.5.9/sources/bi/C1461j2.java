package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.LibraryCounter;
import com.lingq.entity.LibraryData;
import com.lingq.entity.MediaSource;
import com.lingq.entity.Shelf;
import com.lingq.entity.Tab;
import com.lingq.shared.uimodel.lesson.LessonAudio;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryShelf;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8793g;
import p367rh.C8798l;
import p367rh.C8802p;
import p367rh.C8803q;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: renamed from: bi.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1461j2 extends AbstractC1454i2 {

    /* JADX INFO: renamed from: H */
    public final C0322j f8512H;

    /* JADX INFO: renamed from: I */
    public final C0322j f8513I;

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8514a;

    /* JADX INFO: renamed from: b */
    public final r f8515b;

    /* JADX INFO: renamed from: c */
    public final w f8516c;

    /* JADX INFO: renamed from: d */
    public final z f8517d;

    /* JADX INFO: renamed from: e */
    public final c0 f8518e;

    /* JADX INFO: renamed from: f */
    public final g0 f8519f;

    /* JADX INFO: renamed from: g */
    public final a f8520g;

    /* JADX INFO: renamed from: h */
    public final C0322j f8521h;

    /* JADX INFO: renamed from: i */
    public final C1405c0 f8522i = new C1405c0();

    /* JADX INFO: renamed from: j */
    public final C0322j f8523j;

    /* JADX INFO: renamed from: k */
    public final C0322j f8524k;

    /* JADX INFO: renamed from: l */
    public final C0322j f8525l;

    /* JADX INFO: renamed from: bi.j2$a */
    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LibraryDownload";
        }
    }

    /* JADX INFO: renamed from: bi.j2$a0 */
    public class a0 implements Callable<LibraryData> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8526a;

        public a0(C6595o c6595o) {
            this.f8526a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LibraryData call() throws Exception {
            C6595o c6595o;
            Boolean boolValueOf;
            int i10;
            MediaSource mediaSource;
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            C1405c0 c1405c0 = c1461j2.f8522i;
            C6595o c6595o2 = this.f8526a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "type");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "title");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "description");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "pos");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "url");
                int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "imageUrl");
                int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "providerId");
                int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "providerName");
                int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "providerDescription");
                int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "originalImageUrl");
                int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "providerImageUrl");
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "sharedById");
                c6595o = c6595o2;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "sharedByName");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "sharedByImageUrl");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "sharedByRole");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "level");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "lessonsCount");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "owner");
                    int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "price");
                    int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                    int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                    int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "duration");
                    int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                    int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                    int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                    int iM16742n27 = C8573r0.m16742n0(cursorM16698S0, "isAvailable");
                    int iM16742n28 = C8573r0.m16742n0(cursorM16698S0, "tags");
                    int iM16742n29 = C8573r0.m16742n0(cursorM16698S0, "status");
                    int iM16742n30 = C8573r0.m16742n0(cursorM16698S0, "folders");
                    int iM16742n31 = C8573r0.m16742n0(cursorM16698S0, "progress");
                    int iM16742n32 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                    int iM16742n33 = C8573r0.m16742n0(cursorM16698S0, "lessonPreview");
                    int iM16742n34 = C8573r0.m16742n0(cursorM16698S0, "accent");
                    int iM16742n35 = C8573r0.m16742n0(cursorM16698S0, "audioUrl");
                    int iM16742n36 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                    int iM16742n37 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                    int iM16742n38 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                    int iM16742n39 = C8573r0.m16742n0(cursorM16698S0, "isFavorite");
                    int iM16742n40 = C8573r0.m16742n0(cursorM16698S0, "videoUrl");
                    int iM16742n41 = C8573r0.m16742n0(cursorM16698S0, "source_type");
                    int iM16742n42 = C8573r0.m16742n0(cursorM16698S0, "source_name");
                    int iM16742n43 = C8573r0.m16742n0(cursorM16698S0, "source_url");
                    LibraryData libraryData = null;
                    String string = null;
                    if (cursorM16698S0.moveToFirst()) {
                        int i11 = cursorM16698S0.getInt(iM16742n0);
                        String string2 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                        String string3 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                        String string4 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                        int i12 = cursorM16698S0.getInt(iM16742n4);
                        String string5 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                        String string6 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                        Integer numValueOf = cursorM16698S0.isNull(iM16742n7) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n7));
                        String string7 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                        String string8 = cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9);
                        String string9 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                        String string10 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                        String string11 = cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12);
                        String string12 = cursorM16698S0.isNull(iM16742n13) ? null : cursorM16698S0.getString(iM16742n13);
                        String string13 = cursorM16698S0.isNull(r18) ? null : cursorM16698S0.getString(iM16742n14);
                        String string14 = cursorM16698S0.isNull(r19) ? null : cursorM16698S0.getString(iM16742n15);
                        String string15 = cursorM16698S0.isNull(r20) ? null : cursorM16698S0.getString(iM16742n16);
                        int i13 = cursorM16698S0.getInt(iM16742n17);
                        int i14 = cursorM16698S0.getInt(iM16742n18);
                        String string16 = cursorM16698S0.isNull(iM16742n19) ? null : cursorM16698S0.getString(iM16742n19);
                        int i15 = cursorM16698S0.getInt(iM16742n20);
                        int i16 = cursorM16698S0.getInt(iM16742n21);
                        int i17 = cursorM16698S0.getInt(iM16742n22);
                        Integer numValueOf2 = cursorM16698S0.isNull(iM16742n23) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n23));
                        Integer numValueOf3 = cursorM16698S0.isNull(r28) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n24));
                        String string17 = cursorM16698S0.isNull(r29) ? null : cursorM16698S0.getString(iM16742n25);
                        double d10 = cursorM16698S0.getDouble(iM16742n26);
                        boolean z10 = cursorM16698S0.getInt(iM16742n27) != 0;
                        String string18 = cursorM16698S0.isNull(iM16742n28) ? null : cursorM16698S0.getString(iM16742n28);
                        c1405c0.getClass();
                        List listM4992l = C1405c0.m4992l(string18);
                        String string19 = cursorM16698S0.isNull(iM16742n29) ? null : cursorM16698S0.getString(iM16742n29);
                        List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(r34) ? null : cursorM16698S0.getString(iM16742n30));
                        Float fValueOf = cursorM16698S0.isNull(iM16742n31) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n31));
                        Integer numValueOf4 = cursorM16698S0.isNull(r36) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n32));
                        if (numValueOf4 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                        }
                        String string20 = cursorM16698S0.isNull(r37) ? null : cursorM16698S0.getString(iM16742n33);
                        String string21 = cursorM16698S0.isNull(r38) ? null : cursorM16698S0.getString(iM16742n34);
                        String string22 = cursorM16698S0.isNull(r39) ? null : cursorM16698S0.getString(iM16742n35);
                        double d11 = cursorM16698S0.getDouble(iM16742n36);
                        double d12 = cursorM16698S0.getDouble(iM16742n37);
                        boolean z11 = cursorM16698S0.getInt(iM16742n38) != 0;
                        boolean z12 = cursorM16698S0.getInt(iM16742n39) != 0;
                        String string23 = cursorM16698S0.isNull(iM16742n40) ? null : cursorM16698S0.getString(iM16742n40);
                        if (cursorM16698S0.isNull(r45)) {
                            i10 = iM16742n42;
                            if (cursorM16698S0.isNull(i10) && cursorM16698S0.isNull(iM16742n43)) {
                                mediaSource = null;
                            }
                            libraryData = new LibraryData(i11, string2, string3, string4, i12, string5, mediaSource, string6, numValueOf, string7, string8, string9, string10, string11, string12, string13, string14, string15, i13, i14, string16, i15, i16, i17, numValueOf2, numValueOf3, string17, d10, z10, listM4992l, string19, listM4992l2, fValueOf, boolValueOf, string20, string21, string22, d11, d12, z11, z12, string23);
                        } else {
                            i10 = iM16742n42;
                        }
                        String string24 = cursorM16698S0.isNull(r45) ? null : cursorM16698S0.getString(iM16742n41);
                        String string25 = cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10);
                        if (!cursorM16698S0.isNull(iM16742n43)) {
                            string = cursorM16698S0.getString(iM16742n43);
                        }
                        mediaSource = new MediaSource(string24, string25, string);
                        libraryData = new LibraryData(i11, string2, string3, string4, i12, string5, mediaSource, string6, numValueOf, string7, string8, string9, string10, string11, string12, string13, string14, string15, i13, i14, string16, i15, i16, i17, numValueOf2, numValueOf3, string17, d10, z10, listM4992l, string19, listM4992l2, fValueOf, boolValueOf, string20, string21, string22, d11, d12, z11, z12, string23);
                    }
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    return libraryData;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595o2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LibraryData` (`id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`videoUrl`,`source_type`,`source_name`,`source_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = libraryData.f17240c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = libraryData.f17241d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, libraryData.f17242e);
            String str4 = libraryData.f17243f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = libraryData.f17245h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            Integer num = libraryData.f17246i;
            if (num == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13194W(8, num.intValue());
            }
            String str6 = libraryData.f17247j;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = libraryData.f17248k;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = libraryData.f17249l;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = libraryData.f17250m;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = libraryData.f17251n;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            String str11 = libraryData.f17252o;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str11, 14);
            }
            String str12 = libraryData.f17253p;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str12, 15);
            }
            String str13 = libraryData.f17254q;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str13, 16);
            }
            String str14 = libraryData.f17255r;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(str14, 17);
            }
            interfaceC7920f.mo13194W(18, libraryData.f17256s);
            interfaceC7920f.mo13194W(19, libraryData.f17257t);
            String str15 = libraryData.f17258u;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str15, 20);
            }
            interfaceC7920f.mo13194W(21, libraryData.f17259v);
            interfaceC7920f.mo13194W(22, libraryData.f17260w);
            interfaceC7920f.mo13194W(23, libraryData.f17261x);
            Integer num2 = libraryData.f17262y;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num2.intValue());
            }
            Integer num3 = libraryData.f17263z;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num3.intValue());
            }
            String str16 = libraryData.f17222A;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(26);
            } else {
                interfaceC7920f.mo13197h0(str16, 26);
            }
            interfaceC7920f.mo13192F0(libraryData.f17223B, 27);
            interfaceC7920f.mo13194W(28, libraryData.f17224C ? 1L : 0L);
            C1461j2 c1461j2 = C1461j2.this;
            c1461j2.f8522i.getClass();
            String strM4991d = C1405c0.m4991d(libraryData.f17225D);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(29);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 29);
            }
            String str17 = libraryData.f17226E;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(30);
            } else {
                interfaceC7920f.mo13197h0(str17, 30);
            }
            c1461j2.f8522i.getClass();
            String strM4991d2 = C1405c0.m4991d(libraryData.f17227F);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(31);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 31);
            }
            Float f3 = libraryData.f17228G;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 32);
            }
            Boolean bool = libraryData.f17229H;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(33);
            } else {
                interfaceC7920f.mo13194W(33, numValueOf.intValue());
            }
            String str18 = libraryData.f17230I;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(34);
            } else {
                interfaceC7920f.mo13197h0(str18, 34);
            }
            String str19 = libraryData.f17231J;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(35);
            } else {
                interfaceC7920f.mo13197h0(str19, 35);
            }
            String str20 = libraryData.f17232K;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str20, 36);
            }
            interfaceC7920f.mo13192F0(libraryData.f17233L, 37);
            interfaceC7920f.mo13192F0(libraryData.f17234M, 38);
            interfaceC7920f.mo13194W(39, libraryData.f17235N ? 1L : 0L);
            interfaceC7920f.mo13194W(40, libraryData.f17236O ? 1L : 0L);
            String str21 = libraryData.f17237P;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str21, 41);
            }
            MediaSource mediaSource = libraryData.f17244g;
            if (mediaSource == null) {
                interfaceC7920f.mo13193J0(42);
                interfaceC7920f.mo13193J0(43);
                interfaceC7920f.mo13193J0(44);
                return;
            }
            String str22 = mediaSource.f17293a;
            if (str22 == null) {
                interfaceC7920f.mo13193J0(42);
            } else {
                interfaceC7920f.mo13197h0(str22, 42);
            }
            String str23 = mediaSource.f17294b;
            if (str23 == null) {
                interfaceC7920f.mo13193J0(43);
            } else {
                interfaceC7920f.mo13197h0(str23, 43);
            }
            String str24 = mediaSource.f17295c;
            if (str24 == null) {
                interfaceC7920f.mo13193J0(44);
            } else {
                interfaceC7920f.mo13197h0(str24, 44);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$b0 */
    public class b0 implements Callable<List<Integer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8529a;

        public b0(C6595o c6595o) {
            this.f8529a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<Integer> call() throws Exception {
            C6595o c6595o = this.f8529a;
            RoomDatabase roomDatabase = C1461j2.this.f8514a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        arrayList.add(cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0)));
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

    /* JADX INFO: renamed from: bi.j2$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LibraryData` SET `id` = ?,`type` = ?,`title` = ?,`description` = ?,`pos` = ?,`url` = ?,`imageUrl` = ?,`providerId` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`level` = ?,`newWordsCount` = ?,`lessonsCount` = ?,`owner` = ?,`price` = ?,`cardsCount` = ?,`rosesCount` = ?,`duration` = ?,`collectionId` = ?,`collectionTitle` = ?,`difficulty` = ?,`isAvailable` = ?,`tags` = ?,`status` = ?,`folders` = ?,`progress` = ?,`isTaken` = ?,`lessonPreview` = ?,`accent` = ?,`audioUrl` = ?,`listenTimes` = ?,`readTimes` = ?,`isCompleted` = ?,`isFavorite` = ?,`videoUrl` = ?,`source_type` = ?,`source_name` = ?,`source_url` = ? WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = libraryData.f17240c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = libraryData.f17241d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            interfaceC7920f.mo13194W(5, libraryData.f17242e);
            String str4 = libraryData.f17243f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = libraryData.f17245h;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            Integer num = libraryData.f17246i;
            if (num == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13194W(8, num.intValue());
            }
            String str6 = libraryData.f17247j;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str6, 9);
            }
            String str7 = libraryData.f17248k;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str7, 10);
            }
            String str8 = libraryData.f17249l;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = libraryData.f17250m;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = libraryData.f17251n;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            String str11 = libraryData.f17252o;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(14);
            } else {
                interfaceC7920f.mo13197h0(str11, 14);
            }
            String str12 = libraryData.f17253p;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(15);
            } else {
                interfaceC7920f.mo13197h0(str12, 15);
            }
            String str13 = libraryData.f17254q;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str13, 16);
            }
            String str14 = libraryData.f17255r;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(17);
            } else {
                interfaceC7920f.mo13197h0(str14, 17);
            }
            interfaceC7920f.mo13194W(18, libraryData.f17256s);
            interfaceC7920f.mo13194W(19, libraryData.f17257t);
            String str15 = libraryData.f17258u;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str15, 20);
            }
            interfaceC7920f.mo13194W(21, libraryData.f17259v);
            interfaceC7920f.mo13194W(22, libraryData.f17260w);
            interfaceC7920f.mo13194W(23, libraryData.f17261x);
            Integer num2 = libraryData.f17262y;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num2.intValue());
            }
            Integer num3 = libraryData.f17263z;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num3.intValue());
            }
            String str16 = libraryData.f17222A;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(26);
            } else {
                interfaceC7920f.mo13197h0(str16, 26);
            }
            interfaceC7920f.mo13192F0(libraryData.f17223B, 27);
            interfaceC7920f.mo13194W(28, libraryData.f17224C ? 1L : 0L);
            C1461j2 c1461j2 = C1461j2.this;
            c1461j2.f8522i.getClass();
            String strM4991d = C1405c0.m4991d(libraryData.f17225D);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(29);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 29);
            }
            String str17 = libraryData.f17226E;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(30);
            } else {
                interfaceC7920f.mo13197h0(str17, 30);
            }
            c1461j2.f8522i.getClass();
            String strM4991d2 = C1405c0.m4991d(libraryData.f17227F);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(31);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 31);
            }
            Float f3 = libraryData.f17228G;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 32);
            }
            Boolean bool = libraryData.f17229H;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(33);
            } else {
                interfaceC7920f.mo13194W(33, numValueOf.intValue());
            }
            String str18 = libraryData.f17230I;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(34);
            } else {
                interfaceC7920f.mo13197h0(str18, 34);
            }
            String str19 = libraryData.f17231J;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(35);
            } else {
                interfaceC7920f.mo13197h0(str19, 35);
            }
            String str20 = libraryData.f17232K;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str20, 36);
            }
            interfaceC7920f.mo13192F0(libraryData.f17233L, 37);
            interfaceC7920f.mo13192F0(libraryData.f17234M, 38);
            interfaceC7920f.mo13194W(39, libraryData.f17235N ? 1L : 0L);
            interfaceC7920f.mo13194W(40, libraryData.f17236O ? 1L : 0L);
            String str21 = libraryData.f17237P;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str21, 41);
            }
            MediaSource mediaSource = libraryData.f17244g;
            if (mediaSource != null) {
                String str22 = mediaSource.f17293a;
                if (str22 == null) {
                    interfaceC7920f.mo13193J0(42);
                } else {
                    interfaceC7920f.mo13197h0(str22, 42);
                }
                String str23 = mediaSource.f17294b;
                if (str23 == null) {
                    interfaceC7920f.mo13193J0(43);
                } else {
                    interfaceC7920f.mo13197h0(str23, 43);
                }
                String str24 = mediaSource.f17295c;
                if (str24 == null) {
                    interfaceC7920f.mo13193J0(44);
                } else {
                    interfaceC7920f.mo13197h0(str24, 44);
                }
            } else {
                interfaceC7920f.mo13193J0(42);
                interfaceC7920f.mo13193J0(43);
                interfaceC7920f.mo13193J0(44);
            }
            interfaceC7920f.mo13194W(45, libraryData.f17238a);
            if (str == null) {
                interfaceC7920f.mo13193J0(46);
            } else {
                interfaceC7920f.mo13197h0(str, 46);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$c0 */
    public class c0 extends SharedSQLiteStatement {
        public c0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LibraryDownload SET isDownloaded = 1 WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.j2$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Shelf` (`codeWithLanguage`,`language`,`pinned`,`tabs`,`code`,`id`,`title`,`order`,`levels`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Shelf shelf = (Shelf) obj;
            String str = shelf.f17425a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = shelf.f17426b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            Boolean bool = shelf.f17427c;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13194W(3, numValueOf.intValue());
            }
            interfaceC7920f.mo13197h0(C1461j2.this.f8522i.m5010u(shelf.f17428d), 4);
            String str3 = shelf.f17429e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, shelf.f17430f);
            String str4 = shelf.f17431g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            interfaceC7920f.mo13194W(8, shelf.f17432h);
            String str5 = shelf.f17433i;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str5, 9);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$d0 */
    public class d0 implements Callable<List<LessonAudio>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8533a;

        public d0(C6595o c6595o) {
            this.f8533a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<LessonAudio> call() throws Exception {
            C6595o c6595o = this.f8533a;
            RoomDatabase roomDatabase = C1461j2.this.f8514a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "audioUrl");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "videoUrl");
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        arrayList.add(new LessonAudio(cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n0), null, cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2)));
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

    /* JADX INFO: renamed from: bi.j2$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Shelf` SET `codeWithLanguage` = ?,`language` = ?,`pinned` = ?,`tabs` = ?,`code` = ?,`id` = ?,`title` = ?,`order` = ?,`levels` = ? WHERE `codeWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Shelf shelf = (Shelf) obj;
            String str = shelf.f17425a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = shelf.f17426b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            Boolean bool = shelf.f17427c;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13194W(3, numValueOf.intValue());
            }
            interfaceC7920f.mo13197h0(C1461j2.this.f8522i.m5010u(shelf.f17428d), 4);
            String str3 = shelf.f17429e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, shelf.f17430f);
            String str4 = shelf.f17431g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            interfaceC7920f.mo13194W(8, shelf.f17432h);
            String str5 = shelf.f17433i;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str5, 9);
            }
            String str6 = shelf.f17425a;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str6, 10);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$e0 */
    public class e0 implements Callable<LessonInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8536a;

        public e0(C6595o c6595o) {
            this.f8536a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LessonInfo call() throws Exception {
            LessonInfo lessonInfo;
            Boolean boolValueOf;
            LessonMediaSource lessonMediaSource;
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            C6595o c6595o = this.f8536a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                if (cursorM16698S0.moveToFirst()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    Integer numValueOf = cursorM16698S0.isNull(5) ? null : Integer.valueOf(cursorM16698S0.getInt(5));
                    String string5 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                    String string6 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                    String string7 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                    String string8 = cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9);
                    String string9 = cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10);
                    String string10 = cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11);
                    String string11 = cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12);
                    String string12 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                    String string13 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                    int i11 = cursorM16698S0.getInt(15);
                    int i12 = cursorM16698S0.getInt(16);
                    int i13 = cursorM16698S0.getInt(17);
                    int i14 = cursorM16698S0.getInt(18);
                    int i15 = cursorM16698S0.getInt(19);
                    int i16 = cursorM16698S0.getInt(20);
                    String string14 = cursorM16698S0.isNull(21) ? null : cursorM16698S0.getString(21);
                    String string15 = cursorM16698S0.isNull(22) ? null : cursorM16698S0.getString(22);
                    c1461j2.f8522i.getClass();
                    List listM4992l = C1405c0.m4992l(string15);
                    String string16 = cursorM16698S0.isNull(23) ? null : cursorM16698S0.getString(23);
                    String string17 = cursorM16698S0.isNull(24) ? null : cursorM16698S0.getString(24);
                    String string18 = cursorM16698S0.isNull(25) ? null : cursorM16698S0.getString(25);
                    Integer numValueOf2 = cursorM16698S0.isNull(26) ? null : Integer.valueOf(cursorM16698S0.getInt(26));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    String string19 = cursorM16698S0.isNull(27) ? null : cursorM16698S0.getString(27);
                    if (cursorM16698S0.isNull(28) && cursorM16698S0.isNull(29) && cursorM16698S0.isNull(30)) {
                        lessonMediaSource = null;
                    } else {
                        lessonMediaSource = new LessonMediaSource(cursorM16698S0.isNull(28) ? null : cursorM16698S0.getString(28), cursorM16698S0.isNull(29) ? null : cursorM16698S0.getString(29), cursorM16698S0.isNull(30) ? null : cursorM16698S0.getString(30));
                    }
                    lessonInfo = new LessonInfo(i10, string, string2, string4, string18, string16, i15, i16, string14, null, null, boolValueOf, null, null, null, null, i14, i11, i13, null, null, null, numValueOf, string5, string6, string7, string8, string9, string10, string11, string12, null, listM4992l, string17, string3, string13, lessonMediaSource, i12, null, string19);
                } else {
                    lessonInfo = null;
                }
                return lessonInfo;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `CoursesAndLessonsJoin` (`pk`,`contentId`,`courseOrder`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8793g c8793g = (C8793g) obj;
            interfaceC7920f.mo13194W(1, c8793g.f46640a);
            interfaceC7920f.mo13194W(2, c8793g.f46641b);
            interfaceC7920f.mo13194W(3, c8793g.f46642c);
        }
    }

    /* JADX INFO: renamed from: bi.j2$f0 */
    public class f0 implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8538a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8539b;

        public f0(List list, int i10) {
            this.f8538a = list;
            this.f8539b = i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            StringBuilder sbM771r = C0166e.m771r("DELETE FROM CoursesAndLessonsJoin WHERE contentId in (");
            List<Integer> list = this.f8538a;
            int size = list.size();
            C5206f.m11021s0(size, sbM771r);
            sbM771r.append(") AND pk = ?");
            String string = sbM771r.toString();
            C1461j2 c1461j2 = C1461j2.this;
            InterfaceC7920f interfaceC7920fM4555f = c1461j2.f8514a.m4555f(string);
            int i10 = 1;
            for (Integer num : list) {
                if (num == null) {
                    interfaceC7920fM4555f.mo13193J0(i10);
                } else {
                    interfaceC7920fM4555f.mo13194W(i10, num.intValue());
                }
                i10++;
            }
            interfaceC7920fM4555f.mo13194W(size + 1, this.f8539b);
            RoomDatabase roomDatabase = c1461j2.f8514a;
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

    /* JADX INFO: renamed from: bi.j2$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `CoursesAndLessonsJoin` SET `pk` = ?,`contentId` = ?,`courseOrder` = ? WHERE `pk` = ? AND `contentId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8793g c8793g = (C8793g) obj;
            interfaceC7920f.mo13194W(1, c8793g.f46640a);
            long j10 = c8793g.f46641b;
            interfaceC7920f.mo13194W(2, j10);
            interfaceC7920f.mo13194W(3, c8793g.f46642c);
            interfaceC7920f.mo13194W(4, c8793g.f46640a);
            interfaceC7920f.mo13194W(5, j10);
        }
    }

    /* JADX INFO: renamed from: bi.j2$g0 */
    public class g0 extends SharedSQLiteStatement {
        public g0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LibraryShelfAndContentJoin WHERE codeWithLanguage = ?";
        }
    }

    /* JADX INFO: renamed from: bi.j2$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LibraryDownload` (`id`,`language`,`type`,`isDownloaded`,`downloadProgress`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8802p c8802p = (C8802p) obj;
            interfaceC7920f.mo13194W(1, c8802p.f46663a);
            String str = c8802p.f46664b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = c8802p.f46665c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, c8802p.f46666d ? 1L : 0L);
            Integer num = c8802p.f46667e;
            if (num == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$h0 */
    public class h0 extends SharedSQLiteStatement {
        public h0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM Lesson";
        }
    }

    /* JADX INFO: renamed from: bi.j2$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LibraryDownload` SET `id` = ?,`language` = ?,`type` = ?,`isDownloaded` = ?,`downloadProgress` = ? WHERE `id` = ? AND `language` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8802p c8802p = (C8802p) obj;
            interfaceC7920f.mo13194W(1, c8802p.f46663a);
            String str = c8802p.f46664b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = c8802p.f46665c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, c8802p.f46666d ? 1L : 0L);
            Integer num = c8802p.f46667e;
            if (num == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13194W(5, num.intValue());
            }
            interfaceC7920f.mo13194W(6, c8802p.f46663a);
            if (str == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str, 7);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str2, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$i0 */
    public class i0 extends SharedSQLiteStatement {
        public i0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LibraryData";
        }
    }

    /* JADX INFO: renamed from: bi.j2$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonAudioDownload` (`id`,`language`,`isDownloaded`,`downloadProgress`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
        }
    }

    /* JADX INFO: renamed from: bi.j2$j0 */
    public class j0 extends SharedSQLiteStatement {
        public j0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM Shelf";
        }
    }

    /* JADX INFO: renamed from: bi.j2$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `LibraryData` WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryData libraryData = (LibraryData) obj;
            interfaceC7920f.mo13194W(1, libraryData.f17238a);
            String str = libraryData.f17239b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonAudioDownload` SET `id` = ?,`language` = ?,`isDownloaded` = ?,`downloadProgress` = ? WHERE `id` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
            interfaceC7920f.mo13194W(5, c8798l.f46652a);
            if (str == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$m */
    public class m extends AbstractC6583c {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LibraryShelfAndContentJoin` (`codeWithLanguage`,`id`,`type`,`order`,`ofQuery`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8803q c8803q = (C8803q) obj;
            String str = c8803q.f46668a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            interfaceC7920f.mo13194W(2, c8803q.f46669b);
            String str2 = c8803q.f46670c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, c8803q.f46671d);
            String str3 = c8803q.f46672e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$n */
    public class n extends AbstractC6583c {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LibraryShelfAndContentJoin` SET `codeWithLanguage` = ?,`id` = ?,`type` = ?,`order` = ?,`ofQuery` = ? WHERE `codeWithLanguage` = ? AND `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8803q c8803q = (C8803q) obj;
            String str = c8803q.f46668a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            long j10 = c8803q.f46669b;
            interfaceC7920f.mo13194W(2, j10);
            String str2 = c8803q.f46670c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, c8803q.f46671d);
            String str3 = c8803q.f46672e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            String str4 = c8803q.f46668a;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            interfaceC7920f.mo13194W(7, j10);
            if (str2 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str2, 8);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$o */
    public class o extends AbstractC6583c {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LibraryCounter` (`id`,`type`,`roseGiven`,`progress`,`listenTimes`,`readTimes`,`isTaken`,`difficulty`,`rosesCount`,`newWordsCount`,`knownWordsCount`,`cardsCount`,`lessonsCount`,`isCompletelyTaken`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryCounter libraryCounter = (LibraryCounter) obj;
            interfaceC7920f.mo13194W(1, libraryCounter.f17200a);
            String str = libraryCounter.f17201b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, libraryCounter.f17202c ? 1L : 0L);
            Float f3 = libraryCounter.f17203d;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 4);
            }
            Double d10 = libraryCounter.f17204e;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 5);
            }
            Double d11 = libraryCounter.f17205f;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 6);
            }
            interfaceC7920f.mo13194W(7, libraryCounter.f17206g ? 1L : 0L);
            interfaceC7920f.mo13192F0(libraryCounter.f17207h, 8);
            interfaceC7920f.mo13194W(9, libraryCounter.f17208i);
            interfaceC7920f.mo13194W(10, libraryCounter.f17209j);
            interfaceC7920f.mo13194W(11, libraryCounter.f17210k);
            interfaceC7920f.mo13194W(12, libraryCounter.f17211l);
            interfaceC7920f.mo13194W(13, libraryCounter.f17212m);
            interfaceC7920f.mo13194W(14, libraryCounter.f17213n ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: bi.j2$p */
    public class p extends AbstractC6583c {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LibraryCounter` SET `id` = ?,`type` = ?,`roseGiven` = ?,`progress` = ?,`listenTimes` = ?,`readTimes` = ?,`isTaken` = ?,`difficulty` = ?,`rosesCount` = ?,`newWordsCount` = ?,`knownWordsCount` = ?,`cardsCount` = ?,`lessonsCount` = ?,`isCompletelyTaken` = ? WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryCounter libraryCounter = (LibraryCounter) obj;
            interfaceC7920f.mo13194W(1, libraryCounter.f17200a);
            String str = libraryCounter.f17201b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, libraryCounter.f17202c ? 1L : 0L);
            Float f3 = libraryCounter.f17203d;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 4);
            }
            Double d10 = libraryCounter.f17204e;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 5);
            }
            Double d11 = libraryCounter.f17205f;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 6);
            }
            interfaceC7920f.mo13194W(7, libraryCounter.f17206g ? 1L : 0L);
            interfaceC7920f.mo13192F0(libraryCounter.f17207h, 8);
            interfaceC7920f.mo13194W(9, libraryCounter.f17208i);
            interfaceC7920f.mo13194W(10, libraryCounter.f17209j);
            interfaceC7920f.mo13194W(11, libraryCounter.f17210k);
            interfaceC7920f.mo13194W(12, libraryCounter.f17211l);
            interfaceC7920f.mo13194W(13, libraryCounter.f17212m);
            interfaceC7920f.mo13194W(14, libraryCounter.f17213n ? 1L : 0L);
            interfaceC7920f.mo13194W(15, libraryCounter.f17200a);
            if (str == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str, 16);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$q */
    public class q implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8541a;

        public q(int i10) {
            this.f8541a = i10;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            c0 c0Var = c1461j2.f8518e;
            InterfaceC7920f interfaceC7920fM4574a = c0Var.m4574a();
            interfaceC7920fM4574a.mo13194W(1, this.f8541a);
            RoomDatabase roomDatabase = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                c0Var.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                c0Var.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$r */
    public class r extends AbstractC6583c {
        public r(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Shelf` WHERE `codeWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((Shelf) obj).f17425a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$s */
    public class s implements Callable<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8543a;

        public s(String str) {
            this.f8543a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            g0 g0Var = c1461j2.f8519f;
            InterfaceC7920f interfaceC7920fM4574a = g0Var.m4574a();
            String str = this.f8543a;
            if (str == null) {
                interfaceC7920fM4574a.mo13193J0(1);
            } else {
                interfaceC7920fM4574a.mo13197h0(str, 1);
            }
            RoomDatabase roomDatabase = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                Integer numValueOf = Integer.valueOf(interfaceC7920fM4574a.mo15736A());
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return numValueOf;
            } finally {
                roomDatabase.m4563n();
                g0Var.m4576c(interfaceC7920fM4574a);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$t */
    public class t implements Callable<C9072e> {
        public t() {
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            a aVar = c1461j2.f8520g;
            InterfaceC7920f interfaceC7920fM4574a = aVar.m4574a();
            RoomDatabase roomDatabase = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4574a.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                aVar.m4576c(interfaceC7920fM4574a);
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                aVar.m4576c(interfaceC7920fM4574a);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$u */
    public class u implements Callable<List<Long>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8546a;

        public u(List list) {
            this.f8546a = list;
        }

        @Override // java.util.concurrent.Callable
        public final List<Long> call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                ListBuilder listBuilderM1228p = c1461j2.f8521h.m1228p(this.f8546a);
                roomDatabase.m4568s();
                roomDatabase.m4563n();
                return listBuilderM1228p;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$v */
    public class v implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8802p f8548a;

        public v(C8802p c8802p) {
            this.f8548a = c8802p;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            RoomDatabase roomDatabase2 = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                c1461j2.f8525l.m1225m(this.f8548a);
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

    /* JADX INFO: renamed from: bi.j2$w */
    public class w extends AbstractC6583c {
        public w(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `LibraryCounter` SET `id` = ?,`type` = ?,`roseGiven` = ?,`progress` = ?,`listenTimes` = ?,`readTimes` = ?,`isTaken` = ?,`difficulty` = ?,`rosesCount` = ?,`newWordsCount` = ?,`knownWordsCount` = ?,`cardsCount` = ?,`lessonsCount` = ?,`isCompletelyTaken` = ? WHERE `id` = ? AND `type` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LibraryCounter libraryCounter = (LibraryCounter) obj;
            interfaceC7920f.mo13194W(1, libraryCounter.f17200a);
            String str = libraryCounter.f17201b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, libraryCounter.f17202c ? 1L : 0L);
            Float f3 = libraryCounter.f17203d;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 4);
            }
            Double d10 = libraryCounter.f17204e;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 5);
            }
            Double d11 = libraryCounter.f17205f;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 6);
            }
            interfaceC7920f.mo13194W(7, libraryCounter.f17206g ? 1L : 0L);
            interfaceC7920f.mo13192F0(libraryCounter.f17207h, 8);
            interfaceC7920f.mo13194W(9, libraryCounter.f17208i);
            interfaceC7920f.mo13194W(10, libraryCounter.f17209j);
            interfaceC7920f.mo13194W(11, libraryCounter.f17210k);
            interfaceC7920f.mo13194W(12, libraryCounter.f17211l);
            interfaceC7920f.mo13194W(13, libraryCounter.f17212m);
            interfaceC7920f.mo13194W(14, libraryCounter.f17213n ? 1L : 0L);
            interfaceC7920f.mo13194W(15, libraryCounter.f17200a);
            if (str == null) {
                interfaceC7920f.mo13193J0(16);
            } else {
                interfaceC7920f.mo13197h0(str, 16);
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$x */
    public class x implements Callable<LibraryShelf> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8550a;

        public x(C6595o c6595o) {
            this.f8550a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final LibraryShelf call() throws Exception {
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            C6595o c6595o = this.f8550a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                LibraryShelf libraryShelf = str;
                if (cursorM16698S0.moveToFirst()) {
                    libraryShelf = new LibraryShelf(cursorM16698S0.getInt(0) != 0, c1461j2.f8522i.m5001k(cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1)), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.getInt(3), cursorM16698S0.isNull(4) ? str : cursorM16698S0.getString(4), cursorM16698S0.getInt(5));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return libraryShelf;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.j2$y */
    public class y implements Callable<List<Shelf>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8552a;

        public y(C6595o c6595o) {
            this.f8552a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<Shelf> call() throws Exception {
            Boolean boolValueOf;
            C6595o c6595o = this.f8552a;
            C1461j2 c1461j2 = C1461j2.this;
            RoomDatabase roomDatabase = c1461j2.f8514a;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "codeWithLanguage");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "language");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "pinned");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "tabs");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "code");
                    int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "title");
                    int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "order");
                    int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "levels");
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                        String string2 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                        Integer numValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n2));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                        C1405c0 c1405c0 = c1461j2.f8522i;
                        c1405c0.getClass();
                        C1461j2 c1461j3 = c1461j2;
                        C5207g.m11111f(string3, "data");
                        int i10 = iM16742n0;
                        Object objM10532b = c1405c0.f8356a.m10564b(C9312p.m17659d(List.class, Tab.class)).m10532b(string3);
                        C5207g.m11108c(objM10532b);
                        arrayList.add(new Shelf(string, string2, boolValueOf, (List) objM10532b, cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4), cursorM16698S0.getInt(iM16742n5), cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6), cursorM16698S0.getInt(iM16742n7), cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8)));
                        c1461j2 = c1461j3;
                        iM16742n0 = i10;
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

    /* JADX INFO: renamed from: bi.j2$z */
    public class z extends SharedSQLiteStatement {
        public z(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM LibraryShelfAndContentJoin WHERE id = ? AND LibraryShelfAndContentJoin.codeWithLanguage LIKE ? || '%' AND LibraryShelfAndContentJoin.type = ?";
        }
    }

    public C1461j2(RoomDatabase roomDatabase) {
        this.f8514a = roomDatabase;
        new k(roomDatabase);
        this.f8515b = new r(roomDatabase);
        this.f8516c = new w(roomDatabase);
        this.f8517d = new z(roomDatabase);
        this.f8518e = new c0(roomDatabase);
        this.f8519f = new g0(roomDatabase);
        new h0(roomDatabase);
        new i0(roomDatabase);
        new j0(roomDatabase);
        this.f8520g = new a(roomDatabase);
        this.f8521h = new C0322j(new b(roomDatabase), new c(roomDatabase));
        this.f8523j = new C0322j(new d(roomDatabase), new e(roomDatabase));
        this.f8524k = new C0322j(new f(roomDatabase), new g(roomDatabase));
        this.f8525l = new C0322j(new h(roomDatabase), new i(roomDatabase));
        new j(roomDatabase);
        new l(roomDatabase);
        this.f8512H = new C0322j(new m(roomDatabase), new n(roomDatabase));
        this.f8513I = new C0322j(new o(roomDatabase), new p(roomDatabase));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: A0 */
    public final Object mo5050A0(String str, String str2, InterfaceC9968c<? super LibraryShelf> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pinned`, `tabs`, `code`, `id`, `title`, `order` FROM (SELECT * FROM Shelf WHERE language = ? AND code = ?)", 2);
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
        return C1185b.m4581c(this.f8514a, false, new CancellationSignal(), new x(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: B0 */
    public final Object mo5051B0(String str, String str2, InterfaceC9968c<? super List<Shelf>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Shelf WHERE language = ? AND levels = ? ORDER BY Shelf.`order` ASC", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13197h0(str2, 2);
        return C1185b.m4581c(this.f8514a, true, new CancellationSignal(), new y(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: C0 */
    public final C7136q mo5052C0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title` FROM (\n    SELECT DISTINCT LibraryData.* FROM LibraryData\n    INNER JOIN LibraryShelfAndContentJoin ON LibraryData.id = LibraryShelfAndContentJoin.id\n    WHERE LibraryShelfAndContentJoin.codeWithLanguage = ? AND LibraryData.type = ?\n    ORDER BY LibraryShelfAndContentJoin.`order` ASC \n    LIMIT ?\n  )", 3);
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
        c6595oM13191l.mo13194W(3, 50);
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "LibraryShelfAndContentJoin"}, new CallableC1416d3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: D0 */
    public final Object mo5053D0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1489n2(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: E0 */
    public final Object mo5054E0(List list, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8514a, new CallableC1510q2(this, list), continuationImpl);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: F0 */
    public final Object mo5055F0(C8802p c8802p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new v(c8802p), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: G0 */
    public final Object mo5056G0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1496o2(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: H0 */
    public final Object mo5057H0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1503p2(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: I0 */
    public final C7136q mo5058I0(List list, String str) {
        StringBuilder sbM771r = C0166e.m771r("\n            SELECT DISTINCT LibraryData.id, Count(*) as downloadProgress, LibraryDownload.isDownloaded\n            FROM LibraryData, LibraryDownload\n            INNER JOIN CoursesAndLessonsJoin ON LibraryData.collectionId = CoursesAndLessonsJoin.pk AND LibraryData.id = CoursesAndLessonsJoin.contentId \n            WHERE LibraryDownload.id = LibraryData.id AND LibraryDownload.isDownloaded = 1 AND LibraryData.collectionId in (");
        int size = list.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND LibraryData.type = ? AND LibraryDownload.type = ?\n            GROUP BY LibraryData.id\n    ");
        int i10 = size + 2;
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), i10);
        Iterator it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c6595oM13191l.mo13193J0(i11);
            } else {
                c6595oM13191l.mo13194W(i11, num.intValue());
            }
            i11++;
        }
        int i12 = size + 1;
        if (str == null) {
            c6595oM13191l.mo13193J0(i12);
        } else {
            c6595oM13191l.mo13197h0(str, i12);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(i10);
        } else {
            c6595oM13191l.mo13197h0(str, i10);
        }
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "LibraryDownload", "CoursesAndLessonsJoin"}, new CallableC1559x2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: J0 */
    public final C7136q mo5059J0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT COUNT(LibraryCounter.id)\n    FROM LibraryData, LibraryCounter\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId AND LibraryCounter.id = CoursesAndLessonsJoin.contentId \n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ? AND LibraryCounter.isTaken = 1 AND LibraryCounter.type = ?", 4);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(4);
        } else {
            c6595oM13191l.mo13197h0(str, 4);
        }
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "LibraryCounter", "CoursesAndLessonsJoin"}, new CallableC1392a3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: K0 */
    public final C7136q mo5060K0(List list) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownload WHERE id IN (");
        int size = list.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append("))");
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), size + 0);
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c6595oM13191l.mo13193J0(i10);
            } else {
                c6595oM13191l.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        return C1185b.m4579a(this.f8514a, true, new String[]{"LessonAudioDownload"}, new CallableC1573z2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: L0 */
    public final C7136q mo5061L0(ArrayList arrayList) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `id`, `roseGiven`, `progress`, `listenTimes`, `readTimes`, `isTaken`, `difficulty`, `rosesCount`, `newWordsCount`, `knownWordsCount`, `cardsCount`, `lessonsCount`, `isCompletelyTaken` FROM (SELECT DISTINCT LibraryCounter.*, LibraryCounter.id || LibraryCounter.type AS idWithType FROM LibraryCounter WHERE idWithType IN (");
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
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryCounter"}, new CallableC1538u2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: M0 */
    public final C7136q mo5062M0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `type`, `title`, `description`, `pos`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `lessonsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `difficulty`, `isAvailable`, `tags`, `status`, `progress`, `isTaken`, `listenTimes`, `readTimes`, `isCompleted`, `isFavorite`, `source_type`, `source_name`, `source_url` FROM (SELECT * FROM LibraryData WHERE id = ? AND type = 'collection')", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8514a, false, new String[]{"LibraryData"}, new CallableC1524s2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: N0 */
    public final C7136q mo5063N0(List list, String str) {
        StringBuilder sbM771r = C0166e.m771r("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LibraryDownload WHERE id IN (");
        int size = list.size();
        C5206f.m11021s0(size, sbM771r);
        sbM771r.append(") AND type = ?)");
        int i10 = size + 1;
        C6595o c6595oM13191l = C6595o.m13191l(sbM771r.toString(), i10);
        Iterator it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c6595oM13191l.mo13193J0(i11);
            } else {
                c6595oM13191l.mo13194W(i11, num.intValue());
            }
            i11++;
        }
        if (str == null) {
            c6595oM13191l.mo13193J0(i10);
        } else {
            c6595oM13191l.mo13197h0(str, i10);
        }
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryDownload"}, new CallableC1566y2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: O0 */
    public final C7136q mo5064O0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `type`, `title`, `description`, `pos`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `lessonsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `difficulty`, `isAvailable`, `tags`, `status`, `progress`, `isTaken`, `listenTimes`, `readTimes`, `isCompleted`, `isFavorite`, `source_type`, `source_name`, `source_url` FROM (\n            SELECT DISTINCT LibraryData.* FROM LibraryData\n            INNER JOIN LibraryShelfAndContentJoin ON LibraryData.id = LibraryShelfAndContentJoin.id\n            WHERE LibraryShelfAndContentJoin.codeWithLanguage = ?\n            ORDER BY LibraryShelfAndContentJoin.`order`ASC \n            LIMIT ?\n        )", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "LibraryShelfAndContentJoin"}, new CallableC1545v2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: P0 */
    public final C7136q mo5065P0(String str, int i10, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `type`, `title`, `description`, `pos`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `lessonsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `difficulty`, `isAvailable`, `tags`, `status`, `progress`, `isTaken`, `listenTimes`, `readTimes`, `isCompleted`, `isFavorite`, `source_type`, `source_name`, `source_url` FROM (\n            SELECT DISTINCT LibraryData.* FROM LibraryData\n            INNER JOIN LibraryShelfAndContentJoin ON LibraryData.id = LibraryShelfAndContentJoin.id\n            WHERE LibraryShelfAndContentJoin.codeWithLanguage = ? AND (LibraryShelfAndContentJoin.ofQuery = ? OR LibraryData.title LIKE ?)\n            ORDER BY LibraryShelfAndContentJoin.`order`ASC \n            LIMIT ?\n        )", 4);
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
        if (str2 == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str2, 3);
        }
        c6595oM13191l.mo13194W(4, i10);
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "LibraryShelfAndContentJoin"}, new CallableC1552w2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: Q0 */
    public final Object mo5066Q0(LibraryCounter libraryCounter, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8514a, new CallableC1475l2(this, libraryCounter), continuationImpl);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: R0 */
    public final Object mo5067R0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new q(i10), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1482m2(this, (LibraryData) obj), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i0 */
    public final Object mo599i0(List<? extends LibraryData> list, InterfaceC9968c<? super List<Long>> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new u(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: k0 */
    public final Object mo5068k0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new t(), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: l0 */
    public final Object mo5069l0(String str, InterfaceC9968c<? super Integer> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new s(str), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: m0 */
    public final void mo5070m0(String str, int i10, String str2) {
        RoomDatabase roomDatabase = this.f8514a;
        roomDatabase.m4551b();
        z zVar = this.f8517d;
        InterfaceC7920f interfaceC7920fM4574a = zVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, i10);
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        if (str2 == null) {
            interfaceC7920fM4574a.mo13193J0(3);
        } else {
            interfaceC7920fM4574a.mo13197h0(str2, 3);
        }
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } finally {
            roomDatabase.m4563n();
            zVar.m4576c(interfaceC7920fM4574a);
        }
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: n0 */
    public final Object mo5071n0(int i10, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new f0(list, i10), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: o0 */
    public final Object mo5072o0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1432f3(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: p0 */
    public final Object mo5073p0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8514a, new CallableC1468k2(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: q0 */
    public final C7136q mo5074q0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `type`, `title`, `description`, `pos`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `lessonsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `difficulty`, `isAvailable`, `tags`, `status`, `progress`, `isTaken`, `listenTimes`, `readTimes`, `isCompleted`, `isFavorite`, `source_type`, `source_name`, `source_url` FROM (\n    SELECT DISTINCT LibraryData.* FROM LibraryData\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ?\n    ORDER BY courseOrder ASC\n    )", 3);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4579a(this.f8514a, true, new String[]{"LibraryData", "CoursesAndLessonsJoin"}, new CallableC1408c3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: r0 */
    public final C7136q mo5075r0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `description`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `tags`, `status`, `lessonPreview`, `audioUrl`, `isCompleted`, `videoUrl`, `source_type`, `source_name`, `source_url` FROM (SELECT * FROM LibraryData WHERE id = ?)", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8514a, false, new String[]{"LibraryData"}, new CallableC1424e3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: s0 */
    public final C7136q mo5076s0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `pinned`, `tabs`, `code`, `id`, `title`, `order` FROM (SELECT * FROM Shelf WHERE language = ? AND levels = ? ORDER BY Shelf.`order` ASC)", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13197h0(str2, 2);
        CallableC1517r2 callableC1517r2 = new CallableC1517r2(this, c6595oM13191l);
        return C1185b.m4579a(this.f8514a, true, new String[]{"Shelf"}, callableC1517r2);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: t0 */
    public final Object mo5077t0(int i10, String str, InterfaceC9968c<? super List<LessonAudio>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `audioUrl`, `videoUrl` FROM (\n    SELECT DISTINCT LibraryData.* FROM LibraryData\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ?\n    ORDER BY courseOrder ASC)", 3);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4581c(this.f8514a, true, new CancellationSignal(), new d0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: u0 */
    public final Object mo5078u0(int i10, String str, InterfaceC9968c<? super List<Integer>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("\n    SELECT DISTINCT LibraryData.id FROM LibraryData\n    INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryData.collectionId = ? AND LibraryData.type = ?\n    ORDER BY courseOrder ASC", 3);
        long j10 = i10;
        c6595oM13191l.mo13194W(1, j10);
        c6595oM13191l.mo13194W(2, j10);
        if (str == null) {
            c6595oM13191l.mo13193J0(3);
        } else {
            c6595oM13191l.mo13197h0(str, 3);
        }
        return C1185b.m4581c(this.f8514a, true, new CancellationSignal(), new b0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: w0 */
    public final Object mo5079w0(int i10, InterfaceC9968c<? super LibraryData> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM LibraryData WHERE id = ?", 1);
        return C1185b.m4581c(this.f8514a, false, C0141b.m610f(c6595oM13191l, 1, i10), new a0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: x0 */
    public final Object mo5080x0(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `description`, `url`, `imageUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `level`, `newWordsCount`, `price`, `cardsCount`, `rosesCount`, `duration`, `collectionId`, `collectionTitle`, `tags`, `status`, `lessonPreview`, `audioUrl`, `isCompleted`, `videoUrl`, `source_type`, `source_name`, `source_url` FROM (SELECT * FROM LibraryData WHERE id = ?)", 1);
        return C1185b.m4581c(this.f8514a, false, C0141b.m610f(c6595oM13191l, 1, i10), new e0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: y0 */
    public final C7136q mo5081y0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `imageUrl`, `collectionTitle`, `audioUrl`, `videoUrl` FROM (SELECT * FROM LibraryData WHERE id = ?)", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8514a, false, new String[]{"LibraryData"}, new CallableC1400b3(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1454i2
    /* JADX INFO: renamed from: z0 */
    public final Object mo5082z0(int i10, String str, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT DISTINCT * FROM LibraryCounter WHERE id = ? AND type = ?", 2);
        c6595oM13191l.mo13194W(1, i10);
        if (str == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str, 2);
        }
        return C1185b.m4581c(this.f8514a, false, new CancellationSignal(), new CallableC1531t2(this, c6595oM13191l), continuationImpl);
    }
}
