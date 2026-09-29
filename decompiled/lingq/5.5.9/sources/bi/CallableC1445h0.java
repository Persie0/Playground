package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.LibraryData;
import com.lingq.entity.MediaSource;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1445h0 implements Callable<LibraryData> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421e0 f8484b;

    public CallableC1445h0(C1421e0 c1421e0, C6595o c6595o) {
        this.f8484b = c1421e0;
        this.f8483a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final LibraryData call() throws Exception {
        C6595o c6595o;
        Boolean boolValueOf;
        int i10;
        MediaSource mediaSource;
        C1421e0 c1421e0 = this.f8484b;
        RoomDatabase roomDatabase = c1421e0.f8386a;
        C1405c0 c1405c0 = c1421e0.f8388c;
        C6595o c6595o2 = this.f8483a;
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
