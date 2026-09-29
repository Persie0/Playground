package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p181ii.C6332a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1408c3 implements Callable<List<C6332a>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8362b;

    public CallableC1408c3(C1461j2 c1461j2, C6595o c6595o) {
        this.f8362b = c1461j2;
        this.f8361a = c6595o;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x049b  */
    /* JADX WARN: Code duplicated, block: B:185:0x04a0 A[Catch: all -> 0x051a, TryCatch #1 {all -> 0x051a, blocks: (B:6:0x005f, B:7:0x0132, B:9:0x0138, B:13:0x014d, B:17:0x015c, B:21:0x016b, B:25:0x017e, B:29:0x018d, B:33:0x019c, B:37:0x01af, B:41:0x01be, B:45:0x01cd, B:49:0x01dc, B:53:0x01eb, B:57:0x01fe, B:62:0x0214, B:67:0x022a, B:72:0x0240, B:77:0x0256, B:82:0x0270, B:87:0x028a, B:91:0x02ad, B:95:0x02c8, B:99:0x02e3, B:103:0x02fe, B:107:0x0315, B:119:0x0354, B:124:0x036c, B:128:0x038c, B:132:0x03a7, B:143:0x03d6, B:147:0x03f1, B:151:0x040c, B:162:0x043b, B:172:0x0467, B:174:0x046d, B:176:0x0477, B:182:0x0495, B:186:0x04a8, B:190:0x04bb, B:194:0x04cd, B:195:0x04d4, B:193:0x04c8, B:189:0x04b3, B:185:0x04a0, B:168:0x0455, B:171:0x045d, B:165:0x0444, B:157:0x0426, B:161:0x0431, B:154:0x0415, B:150:0x03fe, B:146:0x03e3, B:138:0x03c1, B:142:0x03cc, B:135:0x03b0, B:131:0x0399, B:127:0x0384, B:123:0x0365, B:114:0x033f, B:118:0x034a, B:110:0x0326, B:106:0x030b, B:102:0x02f0, B:98:0x02d5, B:94:0x02ba, B:90:0x029f, B:86:0x027f, B:81:0x0265, B:76:0x024f, B:71:0x0239, B:66:0x0223, B:61:0x020d, B:56:0x01f6, B:52:0x01e5, B:48:0x01d6, B:44:0x01c7, B:40:0x01b8, B:36:0x01a5, B:32:0x0196, B:28:0x0187, B:24:0x0174, B:20:0x0165, B:16:0x0156, B:12:0x0147, B:198:0x051c), top: B:214:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:188:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:189:0x04b3 A[Catch: all -> 0x051a, TryCatch #1 {all -> 0x051a, blocks: (B:6:0x005f, B:7:0x0132, B:9:0x0138, B:13:0x014d, B:17:0x015c, B:21:0x016b, B:25:0x017e, B:29:0x018d, B:33:0x019c, B:37:0x01af, B:41:0x01be, B:45:0x01cd, B:49:0x01dc, B:53:0x01eb, B:57:0x01fe, B:62:0x0214, B:67:0x022a, B:72:0x0240, B:77:0x0256, B:82:0x0270, B:87:0x028a, B:91:0x02ad, B:95:0x02c8, B:99:0x02e3, B:103:0x02fe, B:107:0x0315, B:119:0x0354, B:124:0x036c, B:128:0x038c, B:132:0x03a7, B:143:0x03d6, B:147:0x03f1, B:151:0x040c, B:162:0x043b, B:172:0x0467, B:174:0x046d, B:176:0x0477, B:182:0x0495, B:186:0x04a8, B:190:0x04bb, B:194:0x04cd, B:195:0x04d4, B:193:0x04c8, B:189:0x04b3, B:185:0x04a0, B:168:0x0455, B:171:0x045d, B:165:0x0444, B:157:0x0426, B:161:0x0431, B:154:0x0415, B:150:0x03fe, B:146:0x03e3, B:138:0x03c1, B:142:0x03cc, B:135:0x03b0, B:131:0x0399, B:127:0x0384, B:123:0x0365, B:114:0x033f, B:118:0x034a, B:110:0x0326, B:106:0x030b, B:102:0x02f0, B:98:0x02d5, B:94:0x02ba, B:90:0x029f, B:86:0x027f, B:81:0x0265, B:76:0x024f, B:71:0x0239, B:66:0x0223, B:61:0x020d, B:56:0x01f6, B:52:0x01e5, B:48:0x01d6, B:44:0x01c7, B:40:0x01b8, B:36:0x01a5, B:32:0x0196, B:28:0x0187, B:24:0x0174, B:20:0x0165, B:16:0x0156, B:12:0x0147, B:198:0x051c), top: B:214:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:193:0x04c8 A[Catch: all -> 0x051a, TryCatch #1 {all -> 0x051a, blocks: (B:6:0x005f, B:7:0x0132, B:9:0x0138, B:13:0x014d, B:17:0x015c, B:21:0x016b, B:25:0x017e, B:29:0x018d, B:33:0x019c, B:37:0x01af, B:41:0x01be, B:45:0x01cd, B:49:0x01dc, B:53:0x01eb, B:57:0x01fe, B:62:0x0214, B:67:0x022a, B:72:0x0240, B:77:0x0256, B:82:0x0270, B:87:0x028a, B:91:0x02ad, B:95:0x02c8, B:99:0x02e3, B:103:0x02fe, B:107:0x0315, B:119:0x0354, B:124:0x036c, B:128:0x038c, B:132:0x03a7, B:143:0x03d6, B:147:0x03f1, B:151:0x040c, B:162:0x043b, B:172:0x0467, B:174:0x046d, B:176:0x0477, B:182:0x0495, B:186:0x04a8, B:190:0x04bb, B:194:0x04cd, B:195:0x04d4, B:193:0x04c8, B:189:0x04b3, B:185:0x04a0, B:168:0x0455, B:171:0x045d, B:165:0x0444, B:157:0x0426, B:161:0x0431, B:154:0x0415, B:150:0x03fe, B:146:0x03e3, B:138:0x03c1, B:142:0x03cc, B:135:0x03b0, B:131:0x0399, B:127:0x0384, B:123:0x0365, B:114:0x033f, B:118:0x034a, B:110:0x0326, B:106:0x030b, B:102:0x02f0, B:98:0x02d5, B:94:0x02ba, B:90:0x029f, B:86:0x027f, B:81:0x0265, B:76:0x024f, B:71:0x0239, B:66:0x0223, B:61:0x020d, B:56:0x01f6, B:52:0x01e5, B:48:0x01d6, B:44:0x01c7, B:40:0x01b8, B:36:0x01a5, B:32:0x0196, B:28:0x0187, B:24:0x0174, B:20:0x0165, B:16:0x0156, B:12:0x0147, B:198:0x051c), top: B:214:0x005f }] */
    @Override // java.util.concurrent.Callable
    public final List<C6332a> call() throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        int i10;
        int i11;
        int i12;
        int i13;
        LessonMediaSource lessonMediaSource;
        String string;
        String string2;
        C1461j2 c1461j2 = this.f8362b;
        RoomDatabase roomDatabase = c1461j2.f8514a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8361a);
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
                    try {
                        int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "sharedByName");
                        C1461j2 c1461j3 = c1461j2;
                        int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "sharedByImageUrl");
                        int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "sharedByRole");
                        int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "level");
                        int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                        int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "lessonsCount");
                        int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "price");
                        int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                        int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                        int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "duration");
                        int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                        int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                        int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                        int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "isAvailable");
                        int iM16742n27 = C8573r0.m16742n0(cursorM16698S0, "tags");
                        int iM16742n28 = C8573r0.m16742n0(cursorM16698S0, "status");
                        int iM16742n29 = C8573r0.m16742n0(cursorM16698S0, "progress");
                        int iM16742n30 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                        int iM16742n31 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                        int iM16742n32 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                        int iM16742n33 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                        int iM16742n34 = C8573r0.m16742n0(cursorM16698S0, "isFavorite");
                        int iM16742n35 = C8573r0.m16742n0(cursorM16698S0, "source_type");
                        int iM16742n36 = C8573r0.m16742n0(cursorM16698S0, "source_name");
                        int iM16742n37 = C8573r0.m16742n0(cursorM16698S0, "source_url");
                        int i14 = iM16742n13;
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            int i15 = cursorM16698S0.getInt(iM16742n0);
                            String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                            String string4 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                            String string5 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                            Integer numValueOf = cursorM16698S0.isNull(iM16742n4) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n4));
                            String string6 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                            String string7 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                            Integer numValueOf2 = cursorM16698S0.isNull(iM16742n7) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n7));
                            String string8 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                            String string9 = cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9);
                            String string10 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                            String string11 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                            String string12 = cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12);
                            String string13 = cursorM16698S0.isNull(i14) ? null : cursorM16698S0.getString(i14);
                            int i16 = iM16742n14;
                            int i17 = iM16742n12;
                            String string14 = cursorM16698S0.isNull(i16) ? null : cursorM16698S0.getString(i16);
                            int i18 = iM16742n15;
                            String string15 = cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18);
                            int i19 = iM16742n16;
                            String string16 = cursorM16698S0.isNull(i19) ? null : cursorM16698S0.getString(i19);
                            int i20 = iM16742n17;
                            Integer numValueOf3 = cursorM16698S0.isNull(i20) ? null : Integer.valueOf(cursorM16698S0.getInt(i20));
                            int i21 = iM16742n18;
                            Integer numValueOf4 = cursorM16698S0.isNull(i21) ? null : Integer.valueOf(cursorM16698S0.getInt(i21));
                            int i22 = iM16742n19;
                            int i23 = cursorM16698S0.getInt(i22);
                            iM16742n20 = iM16742n20;
                            Integer numValueOf5 = cursorM16698S0.isNull(iM16742n20) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n20));
                            Integer numValueOf6 = cursorM16698S0.isNull(iM16742n21) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n21));
                            Integer numValueOf7 = cursorM16698S0.isNull(iM16742n22) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n22));
                            Integer numValueOf8 = cursorM16698S0.isNull(iM16742n23) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n23));
                            String string17 = cursorM16698S0.isNull(iM16742n24) ? null : cursorM16698S0.getString(iM16742n24);
                            double d10 = cursorM16698S0.getDouble(iM16742n25);
                            iM16742n25 = iM16742n25;
                            iM16742n26 = iM16742n26;
                            Integer numValueOf9 = cursorM16698S0.isNull(iM16742n26) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n26));
                            if (numValueOf9 == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf9.intValue() != 0);
                            }
                            String string18 = cursorM16698S0.isNull(iM16742n27) ? null : cursorM16698S0.getString(iM16742n27);
                            C1461j2 c1461j4 = c1461j3;
                            int i24 = iM16742n27;
                            c1461j4.f8522i.getClass();
                            List listM4992l = C1405c0.m4992l(string18);
                            int i25 = iM16742n28;
                            String string19 = cursorM16698S0.isNull(i25) ? null : cursorM16698S0.getString(i25);
                            Float fValueOf = cursorM16698S0.isNull(iM16742n29) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n29));
                            Integer numValueOf10 = cursorM16698S0.isNull(iM16742n30) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n30));
                            if (numValueOf10 == null) {
                                boolValueOf2 = null;
                            } else {
                                boolValueOf2 = Boolean.valueOf(numValueOf10.intValue() != 0);
                            }
                            Double dValueOf = cursorM16698S0.isNull(iM16742n31) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n31));
                            Double dValueOf2 = cursorM16698S0.isNull(iM16742n32) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n32));
                            Integer numValueOf11 = cursorM16698S0.isNull(iM16742n33) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n33));
                            if (numValueOf11 == null) {
                                boolValueOf3 = null;
                            } else {
                                boolValueOf3 = Boolean.valueOf(numValueOf11.intValue() != 0);
                            }
                            Integer numValueOf12 = cursorM16698S0.isNull(iM16742n34) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n34));
                            if (numValueOf12 == null) {
                                boolValueOf4 = null;
                            } else {
                                boolValueOf4 = Boolean.valueOf(numValueOf12.intValue() != 0);
                            }
                            if (cursorM16698S0.isNull(iM16742n35)) {
                                i10 = i25;
                                i11 = iM16742n36;
                                if (cursorM16698S0.isNull(i11)) {
                                    i12 = iM16742n0;
                                    i13 = iM16742n37;
                                    if (cursorM16698S0.isNull(i13)) {
                                        iM16742n35 = iM16742n35;
                                        i11 = i11;
                                        iM16742n37 = i13;
                                        lessonMediaSource = null;
                                    }
                                    arrayList.add(new C6332a(i15, string3, string6, numValueOf, string4, string5, string19, string7, numValueOf7, null, null, numValueOf6, numValueOf8, string17, dValueOf2, dValueOf, boolValueOf3, lessonMediaSource, numValueOf3, numValueOf5, null, null, null, boolValueOf4, string16, null, null, null, null, null, numValueOf2, string8, string9, string10, string11, string12, string13, string14, string15, d10, fValueOf, boolValueOf2, numValueOf4, boolValueOf, listM4992l, i23));
                                    iM16742n27 = i24;
                                    iM16742n12 = i17;
                                    iM16742n14 = i16;
                                    iM16742n15 = i18;
                                    iM16742n16 = i19;
                                    iM16742n17 = i20;
                                    iM16742n18 = i21;
                                    c1461j3 = c1461j4;
                                    iM16742n28 = i10;
                                    iM16742n0 = i12;
                                    iM16742n19 = i22;
                                    i14 = i14;
                                    iM16742n35 = iM16742n35;
                                    iM16742n36 = i11;
                                    iM16742n1 = iM16742n1;
                                }
                                if (cursorM16698S0.isNull(iM16742n35)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(iM16742n35);
                                }
                                if (cursorM16698S0.isNull(i11)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorM16698S0.getString(i11);
                                }
                                iM16742n37 = i13;
                                lessonMediaSource = new LessonMediaSource(string, string2, cursorM16698S0.isNull(i13) ? null : cursorM16698S0.getString(i13));
                                arrayList.add(new C6332a(i15, string3, string6, numValueOf, string4, string5, string19, string7, numValueOf7, null, null, numValueOf6, numValueOf8, string17, dValueOf2, dValueOf, boolValueOf3, lessonMediaSource, numValueOf3, numValueOf5, null, null, null, boolValueOf4, string16, null, null, null, null, null, numValueOf2, string8, string9, string10, string11, string12, string13, string14, string15, d10, fValueOf, boolValueOf2, numValueOf4, boolValueOf, listM4992l, i23));
                                iM16742n27 = i24;
                                iM16742n12 = i17;
                                iM16742n14 = i16;
                                iM16742n15 = i18;
                                iM16742n16 = i19;
                                iM16742n17 = i20;
                                iM16742n18 = i21;
                                c1461j3 = c1461j4;
                                iM16742n28 = i10;
                                iM16742n0 = i12;
                                iM16742n19 = i22;
                                i14 = i14;
                                iM16742n35 = iM16742n35;
                                iM16742n36 = i11;
                                iM16742n1 = iM16742n1;
                            } else {
                                i10 = i25;
                                i11 = iM16742n36;
                            }
                            i12 = iM16742n0;
                            i13 = iM16742n37;
                            if (cursorM16698S0.isNull(iM16742n35)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n35);
                            }
                            if (cursorM16698S0.isNull(i11)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i11);
                            }
                            iM16742n37 = i13;
                            lessonMediaSource = new LessonMediaSource(string, string2, cursorM16698S0.isNull(i13) ? null : cursorM16698S0.getString(i13));
                            arrayList.add(new C6332a(i15, string3, string6, numValueOf, string4, string5, string19, string7, numValueOf7, null, null, numValueOf6, numValueOf8, string17, dValueOf2, dValueOf, boolValueOf3, lessonMediaSource, numValueOf3, numValueOf5, null, null, null, boolValueOf4, string16, null, null, null, null, null, numValueOf2, string8, string9, string10, string11, string12, string13, string14, string15, d10, fValueOf, boolValueOf2, numValueOf4, boolValueOf, listM4992l, i23));
                            iM16742n27 = i24;
                            iM16742n12 = i17;
                            iM16742n14 = i16;
                            iM16742n15 = i18;
                            iM16742n16 = i19;
                            iM16742n17 = i20;
                            iM16742n18 = i21;
                            c1461j3 = c1461j4;
                            iM16742n28 = i10;
                            iM16742n0 = i12;
                            iM16742n19 = i22;
                            i14 = i14;
                            iM16742n35 = iM16742n35;
                            iM16742n36 = i11;
                            iM16742n1 = iM16742n1;
                        }
                        roomDatabase.m4568s();
                        cursorM16698S0.close();
                        roomDatabase.m4563n();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM16698S0.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                roomDatabase.m4563n();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            roomDatabase.m4563n();
            throw th;
        }
    }

    public final void finalize() {
        this.f8361a.m13198q();
    }
}
