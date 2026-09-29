package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.Card;
import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.Meaning;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.d */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1412d implements Callable<Card> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8370b;

    public CallableC1412d(C1404c c1404c, C6595o c6595o) {
        this.f8370b = c1404c;
        this.f8369a = c6595o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022c A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:104:0x023a A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0248 A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0202 A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0210 A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x021b  */
    /* JADX WARN: Code duplicated, block: B:96:0x021e A[Catch: all -> 0x025d, TryCatch #1 {all -> 0x025d, blocks: (B:5:0x005e, B:7:0x00bc, B:11:0x00cb, B:15:0x00da, B:19:0x00ed, B:23:0x00fc, B:27:0x0113, B:31:0x0122, B:35:0x0131, B:39:0x0140, B:43:0x014f, B:47:0x0160, B:51:0x0179, B:55:0x0186, B:59:0x0199, B:63:0x01ac, B:67:0x01bc, B:69:0x01c6, B:71:0x01ce, B:73:0x01d6, B:75:0x01de, B:77:0x01e6, B:110:0x0255, B:85:0x01f9, B:89:0x0207, B:93:0x0215, B:97:0x0223, B:101:0x0231, B:105:0x023f, B:109:0x024d, B:108:0x0248, B:104:0x023a, B:100:0x022c, B:96:0x021e, B:92:0x0210, B:88:0x0202, B:62:0x01a8, B:58:0x0195, B:54:0x0182, B:50:0x0171, B:46:0x015c, B:42:0x0149, B:38:0x013a, B:34:0x012b, B:30:0x011c, B:26:0x0109, B:22:0x00f6, B:18:0x00e7, B:14:0x00d4, B:10:0x00c5), top: B:122:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0229  */
    @Override // java.util.concurrent.Callable
    public final Card call() throws Exception {
        C6595o c6595o;
        int i10;
        int i11;
        int i12;
        int i13;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C1404c c1404c = this.f8370b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        C6595o c6595o2 = this.f8369a;
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
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "meanings");
            c6595o = c6595o2;
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
                Card card = null;
                LessonTransliteration lessonTransliteration = null;
                if (cursorM16698S0.moveToFirst()) {
                    String string6 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    String string7 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                    int i14 = cursorM16698S0.getInt(iM16742n2);
                    String string8 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    String string9 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                    int i15 = cursorM16698S0.getInt(iM16742n5);
                    Integer numValueOf = cursorM16698S0.isNull(iM16742n6) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n6));
                    String string10 = cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7);
                    String string11 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                    String string12 = cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9);
                    String string13 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                    int i16 = cursorM16698S0.getInt(iM16742n11);
                    List<Meaning> listM5002m = c1405c0.m5002m(cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12));
                    String string14 = cursorM16698S0.isNull(iM16742n13) ? null : cursorM16698S0.getString(iM16742n13);
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(r18) ? null : cursorM16698S0.getString(iM16742n14));
                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n15) ? null : cursorM16698S0.getString(iM16742n15));
                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n16) ? null : cursorM16698S0.getString(iM16742n16));
                    boolean z10 = cursorM16698S0.getInt(iM16742n17) != 0;
                    if (cursorM16698S0.isNull(iM16742n18)) {
                        i10 = iM16742n19;
                        if (cursorM16698S0.isNull(i10)) {
                            i11 = iM16742n20;
                            if (cursorM16698S0.isNull(i11)) {
                                i12 = iM16742n21;
                                if (cursorM16698S0.isNull(i12)) {
                                    i13 = iM16742n22;
                                    if (!cursorM16698S0.isNull(i13) || !cursorM16698S0.isNull(iM16742n23)) {
                                    }
                                    card = new Card(string6, string7, i14, string8, string9, i15, numValueOf, string10, string11, string12, string13, i16, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10);
                                }
                                if (cursorM16698S0.isNull(iM16742n18)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(iM16742n18);
                                }
                                if (cursorM16698S0.isNull(i10)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorM16698S0.getString(i10);
                                }
                                if (cursorM16698S0.isNull(i11)) {
                                    string3 = null;
                                } else {
                                    string3 = cursorM16698S0.getString(i11);
                                }
                                if (cursorM16698S0.isNull(i12)) {
                                    string4 = null;
                                } else {
                                    string4 = cursorM16698S0.getString(i12);
                                }
                                if (cursorM16698S0.isNull(i13)) {
                                    string5 = null;
                                } else {
                                    string5 = cursorM16698S0.getString(i13);
                                }
                                lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(iM16742n23) ? null : cursorM16698S0.getString(iM16742n23));
                                card = new Card(string6, string7, i14, string8, string9, i15, numValueOf, string10, string11, string12, string13, i16, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10);
                            }
                            i13 = iM16742n22;
                            if (cursorM16698S0.isNull(iM16742n18)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n18);
                            }
                            if (cursorM16698S0.isNull(i10)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i10);
                            }
                            if (cursorM16698S0.isNull(i11)) {
                                string3 = null;
                            } else {
                                string3 = cursorM16698S0.getString(i11);
                            }
                            if (cursorM16698S0.isNull(i12)) {
                                string4 = null;
                            } else {
                                string4 = cursorM16698S0.getString(i12);
                            }
                            if (cursorM16698S0.isNull(i13)) {
                                string5 = null;
                            } else {
                                string5 = cursorM16698S0.getString(i13);
                            }
                            lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(iM16742n23) ? null : cursorM16698S0.getString(iM16742n23));
                            card = new Card(string6, string7, i14, string8, string9, i15, numValueOf, string10, string11, string12, string13, i16, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10);
                        }
                        i12 = iM16742n21;
                        i13 = iM16742n22;
                        if (cursorM16698S0.isNull(iM16742n18)) {
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(iM16742n18);
                        }
                        if (cursorM16698S0.isNull(i10)) {
                            string2 = null;
                        } else {
                            string2 = cursorM16698S0.getString(i10);
                        }
                        if (cursorM16698S0.isNull(i11)) {
                            string3 = null;
                        } else {
                            string3 = cursorM16698S0.getString(i11);
                        }
                        if (cursorM16698S0.isNull(i12)) {
                            string4 = null;
                        } else {
                            string4 = cursorM16698S0.getString(i12);
                        }
                        if (cursorM16698S0.isNull(i13)) {
                            string5 = null;
                        } else {
                            string5 = cursorM16698S0.getString(i13);
                        }
                        lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(iM16742n23) ? null : cursorM16698S0.getString(iM16742n23));
                        card = new Card(string6, string7, i14, string8, string9, i15, numValueOf, string10, string11, string12, string13, i16, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10);
                    } else {
                        i10 = iM16742n19;
                    }
                    i11 = iM16742n20;
                    i12 = iM16742n21;
                    i13 = iM16742n22;
                    if (cursorM16698S0.isNull(iM16742n18)) {
                        string = null;
                    } else {
                        string = cursorM16698S0.getString(iM16742n18);
                    }
                    if (cursorM16698S0.isNull(i10)) {
                        string2 = null;
                    } else {
                        string2 = cursorM16698S0.getString(i10);
                    }
                    if (cursorM16698S0.isNull(i11)) {
                        string3 = null;
                    } else {
                        string3 = cursorM16698S0.getString(i11);
                    }
                    if (cursorM16698S0.isNull(i12)) {
                        string4 = null;
                    } else {
                        string4 = cursorM16698S0.getString(i12);
                    }
                    if (cursorM16698S0.isNull(i13)) {
                        string5 = null;
                    } else {
                        string5 = cursorM16698S0.getString(i13);
                    }
                    lessonTransliteration = new LessonTransliteration(string, string2, string3, string4, string5, cursorM16698S0.isNull(iM16742n23) ? null : cursorM16698S0.getString(iM16742n23));
                    card = new Card(string6, string7, i14, string8, string9, i15, numValueOf, string10, string11, string12, string13, i16, listM5002m, string14, listM4992l, listM4992l2, listM4992l3, lessonTransliteration, z10);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return card;
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
