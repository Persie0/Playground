package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import li.C7374a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.j */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1458j implements Callable<List<C7374a>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8507b;

    public CallableC1458j(C1404c c1404c, C6595o c6595o) {
        this.f8507b = c1404c;
        this.f8506a = c6595o;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0203 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:6:0x0061, B:7:0x009c, B:9:0x00a2, B:13:0x00b5, B:17:0x00c8, B:21:0x00df, B:25:0x00ee, B:29:0x00fd, B:33:0x010e, B:37:0x011f, B:41:0x0130, B:45:0x0141, B:49:0x0154, B:51:0x0162, B:53:0x016c, B:55:0x0176, B:57:0x0180, B:59:0x018a, B:68:0x01af, B:72:0x01be, B:76:0x01cd, B:80:0x01dc, B:84:0x01eb, B:88:0x01fa, B:92:0x0208, B:91:0x0203, B:87:0x01f4, B:83:0x01e5, B:79:0x01d6, B:75:0x01c7, B:71:0x01b8, B:93:0x0210, B:44:0x013d, B:40:0x012c, B:36:0x011b, B:32:0x010a, B:28:0x00f7, B:24:0x00e8, B:20:0x00d5, B:16:0x00c2, B:12:0x00af, B:96:0x0234), top: B:110:0x0061 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final List<C7374a> call() throws Exception {
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
        C1404c c1404c = this.f8507b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8506a);
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
                    int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
                    try {
                        int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "hiragana");
                        int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "romaji");
                        int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "pinyin");
                        int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "hant");
                        int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "hans");
                        int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "jyutping");
                        int i19 = iM16742n12;
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            Object lessonStudyTransliteration = null;
                            String string6 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                            int i20 = cursorM16698S0.getInt(iM16742n1);
                            String string7 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                            int i21 = cursorM16698S0.getInt(iM16742n3);
                            Integer numValueOf = cursorM16698S0.isNull(iM16742n4) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n4));
                            String string8 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                            String string9 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                            int i22 = cursorM16698S0.getInt(iM16742n7);
                            List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8));
                            List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9));
                            List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10));
                            List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11));
                            int i23 = i19;
                            boolean z10 = cursorM16698S0.getInt(i23) != 0;
                            int i24 = iM16742n13;
                            C1405c0 c1405c1 = c1405c0;
                            if (cursorM16698S0.isNull(i24)) {
                                i19 = i23;
                                i10 = iM16742n14;
                                if (cursorM16698S0.isNull(i10)) {
                                    i11 = iM16742n0;
                                    i12 = iM16742n15;
                                    if (cursorM16698S0.isNull(i12)) {
                                        i13 = iM16742n1;
                                        i14 = iM16742n16;
                                        if (cursorM16698S0.isNull(i14)) {
                                            i15 = iM16742n2;
                                            i16 = iM16742n17;
                                            if (cursorM16698S0.isNull(i16)) {
                                                i17 = iM16742n3;
                                                i18 = iM16742n18;
                                                if (!cursorM16698S0.isNull(i18)) {
                                                }
                                                arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                                c1405c0 = c1405c1;
                                                iM16742n13 = i24;
                                                iM16742n18 = i18;
                                                iM16742n3 = i17;
                                                iM16742n17 = i16;
                                                iM16742n2 = i15;
                                                iM16742n16 = i14;
                                                iM16742n1 = i13;
                                                iM16742n15 = i12;
                                                iM16742n0 = i11;
                                                iM16742n14 = i10;
                                            }
                                            if (cursorM16698S0.isNull(i24)) {
                                                string = null;
                                            } else {
                                                string = cursorM16698S0.getString(i24);
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
                                            lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                            arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                            c1405c0 = c1405c1;
                                            iM16742n13 = i24;
                                            iM16742n18 = i18;
                                            iM16742n3 = i17;
                                            iM16742n17 = i16;
                                            iM16742n2 = i15;
                                            iM16742n16 = i14;
                                            iM16742n1 = i13;
                                            iM16742n15 = i12;
                                            iM16742n0 = i11;
                                            iM16742n14 = i10;
                                        }
                                        i17 = iM16742n3;
                                        i18 = iM16742n18;
                                        if (cursorM16698S0.isNull(i24)) {
                                            string = null;
                                        } else {
                                            string = cursorM16698S0.getString(i24);
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
                                        lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                        arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                        c1405c0 = c1405c1;
                                        iM16742n13 = i24;
                                        iM16742n18 = i18;
                                        iM16742n3 = i17;
                                        iM16742n17 = i16;
                                        iM16742n2 = i15;
                                        iM16742n16 = i14;
                                        iM16742n1 = i13;
                                        iM16742n15 = i12;
                                        iM16742n0 = i11;
                                        iM16742n14 = i10;
                                    }
                                    i15 = iM16742n2;
                                    i16 = iM16742n17;
                                    i17 = iM16742n3;
                                    i18 = iM16742n18;
                                    if (cursorM16698S0.isNull(i24)) {
                                        string = null;
                                    } else {
                                        string = cursorM16698S0.getString(i24);
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
                                    lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                    arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                    c1405c0 = c1405c1;
                                    iM16742n13 = i24;
                                    iM16742n18 = i18;
                                    iM16742n3 = i17;
                                    iM16742n17 = i16;
                                    iM16742n2 = i15;
                                    iM16742n16 = i14;
                                    iM16742n1 = i13;
                                    iM16742n15 = i12;
                                    iM16742n0 = i11;
                                    iM16742n14 = i10;
                                }
                                i13 = iM16742n1;
                                i14 = iM16742n16;
                                i15 = iM16742n2;
                                i16 = iM16742n17;
                                i17 = iM16742n3;
                                i18 = iM16742n18;
                                if (cursorM16698S0.isNull(i24)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(i24);
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
                                lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                                arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                                c1405c0 = c1405c1;
                                iM16742n13 = i24;
                                iM16742n18 = i18;
                                iM16742n3 = i17;
                                iM16742n17 = i16;
                                iM16742n2 = i15;
                                iM16742n16 = i14;
                                iM16742n1 = i13;
                                iM16742n15 = i12;
                                iM16742n0 = i11;
                                iM16742n14 = i10;
                            } else {
                                i19 = i23;
                                i10 = iM16742n14;
                            }
                            i11 = iM16742n0;
                            i12 = iM16742n15;
                            i13 = iM16742n1;
                            i14 = iM16742n16;
                            i15 = iM16742n2;
                            i16 = iM16742n17;
                            i17 = iM16742n3;
                            i18 = iM16742n18;
                            if (cursorM16698S0.isNull(i24)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(i24);
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
                            lessonStudyTransliteration = new LessonStudyTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(i18) ? null : cursorM16698S0.getString(i18));
                            arrayList.add(new C7374a(string6, listM4992l, listM4992l2, z10, listM5007r, i22, string7, i20, i21, numValueOf, string8, string9, listM4992l3, lessonStudyTransliteration));
                            c1405c0 = c1405c1;
                            iM16742n13 = i24;
                            iM16742n18 = i18;
                            iM16742n3 = i17;
                            iM16742n17 = i16;
                            iM16742n2 = i15;
                            iM16742n16 = i14;
                            iM16742n1 = i13;
                            iM16742n15 = i12;
                            iM16742n0 = i11;
                            iM16742n14 = i10;
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
        this.f8506a.m13198q();
    }
}
