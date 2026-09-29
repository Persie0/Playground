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

/* JADX INFO: renamed from: bi.f5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1434f5 implements Callable<List<C6332a>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1426e5 f8462b;

    public CallableC1434f5(C1426e5 c1426e5, C6595o c6595o) {
        this.f8462b = c1426e5;
        this.f8461a = c6595o;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:233:0x05d4 A[Catch: all -> 0x0640, TryCatch #0 {all -> 0x0640, blocks: (B:6:0x005f, B:7:0x0172, B:9:0x0178, B:13:0x018f, B:17:0x019e, B:21:0x01ad, B:25:0x01c0, B:29:0x01cf, B:33:0x01de, B:37:0x01f1, B:41:0x0200, B:45:0x0213, B:49:0x0226, B:53:0x0239, B:57:0x0250, B:62:0x0266, B:67:0x0280, B:72:0x029a, B:85:0x02cc, B:90:0x02e4, B:95:0x02fc, B:107:0x0328, B:118:0x035f, B:122:0x037a, B:133:0x03a9, B:137:0x03c4, B:141:0x03db, B:145:0x03f2, B:149:0x0409, B:153:0x0420, B:157:0x0437, B:161:0x044e, B:165:0x0465, B:169:0x047c, B:173:0x0493, B:178:0x04ab, B:182:0x04d1, B:186:0x04ec, B:190:0x0503, B:194:0x051a, B:205:0x0549, B:209:0x056c, B:219:0x0598, B:221:0x059e, B:223:0x05a8, B:230:0x05c9, B:234:0x05dc, B:238:0x05ef, B:242:0x0601, B:243:0x0608, B:241:0x05fc, B:237:0x05e7, B:233:0x05d4, B:215:0x0586, B:218:0x058e, B:212:0x0575, B:208:0x055e, B:200:0x0534, B:204:0x053f, B:197:0x0523, B:193:0x0510, B:189:0x04f9, B:185:0x04de, B:181:0x04c3, B:177:0x04a4, B:172:0x0489, B:168:0x0472, B:164:0x045b, B:160:0x0444, B:156:0x042d, B:152:0x0416, B:148:0x03ff, B:144:0x03e8, B:140:0x03d1, B:136:0x03b6, B:128:0x0394, B:132:0x039f, B:125:0x0383, B:121:0x036c, B:113:0x034a, B:117:0x0355, B:110:0x0339, B:102:0x0318, B:106:0x0323, B:98:0x0305, B:94:0x02f3, B:89:0x02db, B:80:0x02bc, B:84:0x02c7, B:75:0x02a3, B:71:0x028f, B:66:0x0275, B:61:0x025f, B:56:0x0244, B:52:0x022f, B:48:0x021c, B:44:0x0209, B:40:0x01fa, B:36:0x01e7, B:32:0x01d8, B:28:0x01c9, B:24:0x01b6, B:20:0x01a7, B:16:0x0198, B:12:0x0189, B:246:0x0642), top: B:260:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:236:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:237:0x05e7 A[Catch: all -> 0x0640, TryCatch #0 {all -> 0x0640, blocks: (B:6:0x005f, B:7:0x0172, B:9:0x0178, B:13:0x018f, B:17:0x019e, B:21:0x01ad, B:25:0x01c0, B:29:0x01cf, B:33:0x01de, B:37:0x01f1, B:41:0x0200, B:45:0x0213, B:49:0x0226, B:53:0x0239, B:57:0x0250, B:62:0x0266, B:67:0x0280, B:72:0x029a, B:85:0x02cc, B:90:0x02e4, B:95:0x02fc, B:107:0x0328, B:118:0x035f, B:122:0x037a, B:133:0x03a9, B:137:0x03c4, B:141:0x03db, B:145:0x03f2, B:149:0x0409, B:153:0x0420, B:157:0x0437, B:161:0x044e, B:165:0x0465, B:169:0x047c, B:173:0x0493, B:178:0x04ab, B:182:0x04d1, B:186:0x04ec, B:190:0x0503, B:194:0x051a, B:205:0x0549, B:209:0x056c, B:219:0x0598, B:221:0x059e, B:223:0x05a8, B:230:0x05c9, B:234:0x05dc, B:238:0x05ef, B:242:0x0601, B:243:0x0608, B:241:0x05fc, B:237:0x05e7, B:233:0x05d4, B:215:0x0586, B:218:0x058e, B:212:0x0575, B:208:0x055e, B:200:0x0534, B:204:0x053f, B:197:0x0523, B:193:0x0510, B:189:0x04f9, B:185:0x04de, B:181:0x04c3, B:177:0x04a4, B:172:0x0489, B:168:0x0472, B:164:0x045b, B:160:0x0444, B:156:0x042d, B:152:0x0416, B:148:0x03ff, B:144:0x03e8, B:140:0x03d1, B:136:0x03b6, B:128:0x0394, B:132:0x039f, B:125:0x0383, B:121:0x036c, B:113:0x034a, B:117:0x0355, B:110:0x0339, B:102:0x0318, B:106:0x0323, B:98:0x0305, B:94:0x02f3, B:89:0x02db, B:80:0x02bc, B:84:0x02c7, B:75:0x02a3, B:71:0x028f, B:66:0x0275, B:61:0x025f, B:56:0x0244, B:52:0x022f, B:48:0x021c, B:44:0x0209, B:40:0x01fa, B:36:0x01e7, B:32:0x01d8, B:28:0x01c9, B:24:0x01b6, B:20:0x01a7, B:16:0x0198, B:12:0x0189, B:246:0x0642), top: B:260:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:241:0x05fc A[Catch: all -> 0x0640, TryCatch #0 {all -> 0x0640, blocks: (B:6:0x005f, B:7:0x0172, B:9:0x0178, B:13:0x018f, B:17:0x019e, B:21:0x01ad, B:25:0x01c0, B:29:0x01cf, B:33:0x01de, B:37:0x01f1, B:41:0x0200, B:45:0x0213, B:49:0x0226, B:53:0x0239, B:57:0x0250, B:62:0x0266, B:67:0x0280, B:72:0x029a, B:85:0x02cc, B:90:0x02e4, B:95:0x02fc, B:107:0x0328, B:118:0x035f, B:122:0x037a, B:133:0x03a9, B:137:0x03c4, B:141:0x03db, B:145:0x03f2, B:149:0x0409, B:153:0x0420, B:157:0x0437, B:161:0x044e, B:165:0x0465, B:169:0x047c, B:173:0x0493, B:178:0x04ab, B:182:0x04d1, B:186:0x04ec, B:190:0x0503, B:194:0x051a, B:205:0x0549, B:209:0x056c, B:219:0x0598, B:221:0x059e, B:223:0x05a8, B:230:0x05c9, B:234:0x05dc, B:238:0x05ef, B:242:0x0601, B:243:0x0608, B:241:0x05fc, B:237:0x05e7, B:233:0x05d4, B:215:0x0586, B:218:0x058e, B:212:0x0575, B:208:0x055e, B:200:0x0534, B:204:0x053f, B:197:0x0523, B:193:0x0510, B:189:0x04f9, B:185:0x04de, B:181:0x04c3, B:177:0x04a4, B:172:0x0489, B:168:0x0472, B:164:0x045b, B:160:0x0444, B:156:0x042d, B:152:0x0416, B:148:0x03ff, B:144:0x03e8, B:140:0x03d1, B:136:0x03b6, B:128:0x0394, B:132:0x039f, B:125:0x0383, B:121:0x036c, B:113:0x034a, B:117:0x0355, B:110:0x0339, B:102:0x0318, B:106:0x0323, B:98:0x0305, B:94:0x02f3, B:89:0x02db, B:80:0x02bc, B:84:0x02c7, B:75:0x02a3, B:71:0x028f, B:66:0x0275, B:61:0x025f, B:56:0x0244, B:52:0x022f, B:48:0x021c, B:44:0x0209, B:40:0x01fa, B:36:0x01e7, B:32:0x01d8, B:28:0x01c9, B:24:0x01b6, B:20:0x01a7, B:16:0x0198, B:12:0x0189, B:246:0x0642), top: B:260:0x005f }] */
    @Override // java.util.concurrent.Callable
    public final List<C6332a> call() throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        int i10;
        int i11;
        LessonMediaSource lessonMediaSource;
        int i12;
        String string;
        String string2;
        C1426e5 c1426e5 = this.f8462b;
        RoomDatabase roomDatabase = c1426e5.f8440a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8461a);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "type");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "title");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "url");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "pos");
                    int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "description");
                    int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "imageUrl");
                    int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "duration");
                    int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "status");
                    int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "wordCount");
                    int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "uniqueWordCount");
                    int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                    int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                    try {
                        int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                        C1426e5 c1426e6 = c1426e5;
                        int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                        int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                        int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                        int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                        int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                        int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "isRoseGiven");
                        int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "price");
                        int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "opened");
                        int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "percentCompleted");
                        int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "isFavorite");
                        int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "providerId");
                        int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "providerName");
                        int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "providerDescription");
                        int iM16742n27 = C8573r0.m16742n0(cursorM16698S0, "originalImageUrl");
                        int iM16742n28 = C8573r0.m16742n0(cursorM16698S0, "providerImageUrl");
                        int iM16742n29 = C8573r0.m16742n0(cursorM16698S0, "sharedById");
                        int iM16742n30 = C8573r0.m16742n0(cursorM16698S0, "sharedByName");
                        int iM16742n31 = C8573r0.m16742n0(cursorM16698S0, "sharedByImageUrl");
                        int iM16742n32 = C8573r0.m16742n0(cursorM16698S0, "sharedByRole");
                        int iM16742n33 = C8573r0.m16742n0(cursorM16698S0, "level");
                        int iM16742n34 = C8573r0.m16742n0(cursorM16698S0, "tags");
                        int iM16742n35 = C8573r0.m16742n0(cursorM16698S0, "progressDownloaded");
                        int iM16742n36 = C8573r0.m16742n0(cursorM16698S0, "progress");
                        int iM16742n37 = C8573r0.m16742n0(cursorM16698S0, "mediaImageUrl");
                        int iM16742n38 = C8573r0.m16742n0(cursorM16698S0, "mediaTitle");
                        int iM16742n39 = C8573r0.m16742n0(cursorM16698S0, "isPinned");
                        int iM16742n40 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                        int iM16742n41 = C8573r0.m16742n0(cursorM16698S0, "newWords");
                        int iM16742n42 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                        int iM16742n43 = C8573r0.m16742n0(cursorM16698S0, "source_type");
                        int iM16742n44 = C8573r0.m16742n0(cursorM16698S0, "source_name");
                        int iM16742n45 = C8573r0.m16742n0(cursorM16698S0, "source_url");
                        int i13 = iM16742n13;
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            int i14 = cursorM16698S0.getInt(iM16742n0);
                            String string3 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                            String string4 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                            String string5 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                            Integer numValueOf = cursorM16698S0.isNull(iM16742n4) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n4));
                            String string6 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                            String string7 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                            Integer numValueOf2 = cursorM16698S0.isNull(iM16742n7) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n7));
                            String string8 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                            Integer numValueOf3 = cursorM16698S0.isNull(iM16742n9) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n9));
                            Integer numValueOf4 = cursorM16698S0.isNull(iM16742n10) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n10));
                            Integer numValueOf5 = cursorM16698S0.isNull(iM16742n11) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n11));
                            Integer numValueOf6 = cursorM16698S0.isNull(iM16742n12) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n12));
                            String string9 = cursorM16698S0.isNull(i13) ? null : cursorM16698S0.getString(i13);
                            int i15 = iM16742n14;
                            int i16 = iM16742n12;
                            Double dValueOf = cursorM16698S0.isNull(i15) ? null : Double.valueOf(cursorM16698S0.getDouble(i15));
                            int i17 = iM16742n15;
                            Double dValueOf2 = cursorM16698S0.isNull(i17) ? null : Double.valueOf(cursorM16698S0.getDouble(i17));
                            int i18 = iM16742n16;
                            Integer numValueOf7 = cursorM16698S0.isNull(i18) ? null : Integer.valueOf(cursorM16698S0.getInt(i18));
                            if (numValueOf7 == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf7.intValue() != 0);
                            }
                            int i19 = iM16742n17;
                            Integer numValueOf8 = cursorM16698S0.isNull(i19) ? null : Integer.valueOf(cursorM16698S0.getInt(i19));
                            int i20 = iM16742n18;
                            Integer numValueOf9 = cursorM16698S0.isNull(i20) ? null : Integer.valueOf(cursorM16698S0.getInt(i20));
                            int i21 = iM16742n19;
                            Integer numValueOf10 = cursorM16698S0.isNull(i21) ? null : Integer.valueOf(cursorM16698S0.getInt(i21));
                            if (numValueOf10 == null) {
                                boolValueOf2 = null;
                            } else {
                                boolValueOf2 = Boolean.valueOf(numValueOf10.intValue() != 0);
                            }
                            int i22 = iM16742n20;
                            int i23 = cursorM16698S0.getInt(i22);
                            iM16742n21 = iM16742n21;
                            Integer numValueOf11 = cursorM16698S0.isNull(iM16742n21) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n21));
                            if (numValueOf11 == null) {
                                boolValueOf3 = null;
                            } else {
                                boolValueOf3 = Boolean.valueOf(numValueOf11.intValue() != 0);
                            }
                            Double dValueOf3 = cursorM16698S0.isNull(iM16742n22) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n22));
                            Integer numValueOf12 = cursorM16698S0.isNull(iM16742n23) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n23));
                            if (numValueOf12 == null) {
                                boolValueOf4 = null;
                            } else {
                                boolValueOf4 = Boolean.valueOf(numValueOf12.intValue() != 0);
                            }
                            Integer numValueOf13 = cursorM16698S0.isNull(iM16742n24) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n24));
                            String string10 = cursorM16698S0.isNull(iM16742n25) ? null : cursorM16698S0.getString(iM16742n25);
                            String string11 = cursorM16698S0.isNull(iM16742n26) ? null : cursorM16698S0.getString(iM16742n26);
                            String string12 = cursorM16698S0.isNull(iM16742n27) ? null : cursorM16698S0.getString(iM16742n27);
                            String string13 = cursorM16698S0.isNull(iM16742n28) ? null : cursorM16698S0.getString(iM16742n28);
                            String string14 = cursorM16698S0.isNull(iM16742n29) ? null : cursorM16698S0.getString(iM16742n29);
                            String string15 = cursorM16698S0.isNull(iM16742n30) ? null : cursorM16698S0.getString(iM16742n30);
                            String string16 = cursorM16698S0.isNull(iM16742n31) ? null : cursorM16698S0.getString(iM16742n31);
                            String string17 = cursorM16698S0.isNull(iM16742n32) ? null : cursorM16698S0.getString(iM16742n32);
                            String string18 = cursorM16698S0.isNull(iM16742n33) ? null : cursorM16698S0.getString(iM16742n33);
                            String string19 = cursorM16698S0.isNull(iM16742n34) ? null : cursorM16698S0.getString(iM16742n34);
                            C1426e5 c1426e7 = c1426e6;
                            int i24 = iM16742n34;
                            c1426e7.f8442c.getClass();
                            List listM4992l = C1405c0.m4992l(string19);
                            int i25 = iM16742n35;
                            Integer numValueOf14 = cursorM16698S0.isNull(i25) ? null : Integer.valueOf(cursorM16698S0.getInt(i25));
                            Float fValueOf = cursorM16698S0.isNull(iM16742n36) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n36));
                            String string20 = cursorM16698S0.isNull(iM16742n37) ? null : cursorM16698S0.getString(iM16742n37);
                            String string21 = cursorM16698S0.isNull(iM16742n38) ? null : cursorM16698S0.getString(iM16742n38);
                            Integer numValueOf15 = cursorM16698S0.isNull(iM16742n39) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n39));
                            if (numValueOf15 == null) {
                                boolValueOf5 = null;
                            } else {
                                boolValueOf5 = Boolean.valueOf(numValueOf15.intValue() != 0);
                            }
                            double d10 = cursorM16698S0.getDouble(iM16742n40);
                            iM16742n40 = iM16742n40;
                            iM16742n41 = iM16742n41;
                            Integer numValueOf16 = cursorM16698S0.isNull(iM16742n41) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n41));
                            Integer numValueOf17 = cursorM16698S0.isNull(iM16742n42) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n42));
                            if (numValueOf17 == null) {
                                boolValueOf6 = null;
                            } else {
                                boolValueOf6 = Boolean.valueOf(numValueOf17.intValue() != 0);
                            }
                            if (cursorM16698S0.isNull(iM16742n43)) {
                                iM16742n35 = i25;
                                i10 = iM16742n44;
                                if (cursorM16698S0.isNull(i10)) {
                                    iM16742n0 = iM16742n0;
                                    i11 = iM16742n45;
                                    if (cursorM16698S0.isNull(i11)) {
                                        iM16742n43 = iM16742n43;
                                        i10 = i10;
                                        i12 = i11;
                                        lessonMediaSource = null;
                                    } else {
                                        if (cursorM16698S0.isNull(iM16742n43)) {
                                            string = null;
                                        } else {
                                            string = cursorM16698S0.getString(iM16742n43);
                                        }
                                        if (cursorM16698S0.isNull(i10)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorM16698S0.getString(i10);
                                        }
                                        i12 = i11;
                                        lessonMediaSource = new LessonMediaSource(string, string2, cursorM16698S0.isNull(i11) ? null : cursorM16698S0.getString(i11));
                                    }
                                }
                                arrayList.add(new C6332a(i14, string3, string5, numValueOf, string4, string6, string8, string7, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, string9, dValueOf, dValueOf2, boolValueOf, lessonMediaSource, numValueOf8, numValueOf9, boolValueOf2, boolValueOf3, dValueOf3, boolValueOf4, string18, numValueOf14, string20, string21, boolValueOf5, numValueOf16, numValueOf13, string10, string11, string12, string13, string14, string15, string16, string17, d10, fValueOf, boolValueOf6, null, null, listM4992l, i23));
                                iM16742n12 = i16;
                                iM16742n14 = i15;
                                iM16742n15 = i17;
                                iM16742n16 = i18;
                                iM16742n17 = i19;
                                iM16742n18 = i20;
                                iM16742n19 = i21;
                                iM16742n0 = iM16742n0;
                                iM16742n43 = iM16742n43;
                                iM16742n20 = i22;
                                i13 = i13;
                                iM16742n1 = iM16742n1;
                                iM16742n45 = i12;
                                iM16742n44 = i10;
                                iM16742n34 = i24;
                                c1426e6 = c1426e7;
                            } else {
                                iM16742n35 = i25;
                                i10 = iM16742n44;
                            }
                            i11 = iM16742n45;
                            if (cursorM16698S0.isNull(iM16742n43)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n43);
                            }
                            if (cursorM16698S0.isNull(i10)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i10);
                            }
                            i12 = i11;
                            lessonMediaSource = new LessonMediaSource(string, string2, cursorM16698S0.isNull(i11) ? null : cursorM16698S0.getString(i11));
                            arrayList.add(new C6332a(i14, string3, string5, numValueOf, string4, string6, string8, string7, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, string9, dValueOf, dValueOf2, boolValueOf, lessonMediaSource, numValueOf8, numValueOf9, boolValueOf2, boolValueOf3, dValueOf3, boolValueOf4, string18, numValueOf14, string20, string21, boolValueOf5, numValueOf16, numValueOf13, string10, string11, string12, string13, string14, string15, string16, string17, d10, fValueOf, boolValueOf6, null, null, listM4992l, i23));
                            iM16742n12 = i16;
                            iM16742n14 = i15;
                            iM16742n15 = i17;
                            iM16742n16 = i18;
                            iM16742n17 = i19;
                            iM16742n18 = i20;
                            iM16742n19 = i21;
                            iM16742n0 = iM16742n0;
                            iM16742n43 = iM16742n43;
                            iM16742n20 = i22;
                            i13 = i13;
                            iM16742n1 = iM16742n1;
                            iM16742n45 = i12;
                            iM16742n44 = i10;
                            iM16742n34 = i24;
                            c1426e6 = c1426e7;
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
        this.f8461a.m13198q();
    }
}
