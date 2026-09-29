package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.LanguageContext;
import com.lingq.entity.LanguageContextNotification;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1390a1 implements Callable<LanguageContext> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8310b;

    public CallableC1390a1(C1543v0 c1543v0, C6595o c6595o) {
        this.f8310b = c1543v0;
        this.f8309a = c6595o;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01e2 A[Catch: all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:5:0x005e, B:7:0x0096, B:11:0x00a5, B:15:0x00b8, B:19:0x00c9, B:31:0x00f7, B:35:0x0106, B:39:0x0117, B:49:0x013e, B:53:0x014d, B:57:0x015c, B:61:0x0173, B:65:0x0186, B:69:0x0193, B:71:0x019f, B:76:0x01af, B:80:0x01bc, B:84:0x01c9, B:85:0x01d2, B:87:0x01d8, B:100:0x0203, B:91:0x01e2, B:95:0x01ef, B:99:0x01fa, B:98:0x01f6, B:94:0x01eb, B:83:0x01c5, B:79:0x01b8, B:68:0x018f, B:64:0x017e, B:60:0x0167, B:56:0x0156, B:52:0x0147, B:45:0x0131, B:48:0x0138, B:42:0x0124, B:38:0x0113, B:34:0x0100, B:26:0x00e8, B:30:0x00f1, B:22:0x00d9, B:18:0x00c5, B:14:0x00b2, B:10:0x009f), top: B:112:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb A[Catch: all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:5:0x005e, B:7:0x0096, B:11:0x00a5, B:15:0x00b8, B:19:0x00c9, B:31:0x00f7, B:35:0x0106, B:39:0x0117, B:49:0x013e, B:53:0x014d, B:57:0x015c, B:61:0x0173, B:65:0x0186, B:69:0x0193, B:71:0x019f, B:76:0x01af, B:80:0x01bc, B:84:0x01c9, B:85:0x01d2, B:87:0x01d8, B:100:0x0203, B:91:0x01e2, B:95:0x01ef, B:99:0x01fa, B:98:0x01f6, B:94:0x01eb, B:83:0x01c5, B:79:0x01b8, B:68:0x018f, B:64:0x017e, B:60:0x0167, B:56:0x0156, B:52:0x0147, B:45:0x0131, B:48:0x0138, B:42:0x0124, B:38:0x0113, B:34:0x0100, B:26:0x00e8, B:30:0x00f1, B:22:0x00d9, B:18:0x00c5, B:14:0x00b2, B:10:0x009f), top: B:112:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f6 A[Catch: all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:5:0x005e, B:7:0x0096, B:11:0x00a5, B:15:0x00b8, B:19:0x00c9, B:31:0x00f7, B:35:0x0106, B:39:0x0117, B:49:0x013e, B:53:0x014d, B:57:0x015c, B:61:0x0173, B:65:0x0186, B:69:0x0193, B:71:0x019f, B:76:0x01af, B:80:0x01bc, B:84:0x01c9, B:85:0x01d2, B:87:0x01d8, B:100:0x0203, B:91:0x01e2, B:95:0x01ef, B:99:0x01fa, B:98:0x01f6, B:94:0x01eb, B:83:0x01c5, B:79:0x01b8, B:68:0x018f, B:64:0x017e, B:60:0x0167, B:56:0x0156, B:52:0x0147, B:45:0x0131, B:48:0x0138, B:42:0x0124, B:38:0x0113, B:34:0x0100, B:26:0x00e8, B:30:0x00f1, B:22:0x00d9, B:18:0x00c5, B:14:0x00b2, B:10:0x009f), top: B:112:0x005e }] */
    @Override // java.util.concurrent.Callable
    public final LanguageContext call() throws Exception {
        C6595o c6595o;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i10;
        LanguageContextNotification languageContextNotification;
        String string;
        LanguageContextNotification languageContextNotification2;
        C1543v0 c1543v0 = this.f8310b;
        RoomDatabase roomDatabase = c1543v0.f8879a;
        C1405c0 c1405c0 = c1543v0.f8881c;
        C6595o c6595o2 = this.f8309a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "code");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "pk");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "url");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "repetitionLingQs");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "lotdDates");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isUseFeed");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "intense");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "streakDays");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "tags");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "supported");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "title");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "lastUsed");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "knownWords");
            c6595o = c6595o2;
            try {
                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "grammarResourceSlug");
                int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "feedLevels");
                int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "email_lotd");
                int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "email_weekly");
                int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "site_lotd");
                int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "site_weekly");
                LanguageContext languageContext = null;
                String string2 = null;
                if (cursorM16698S0.moveToFirst()) {
                    String string3 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    int i11 = cursorM16698S0.getInt(iM16742n1);
                    String string4 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                    int i12 = cursorM16698S0.getInt(iM16742n3);
                    String string5 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                    c1405c0.getClass();
                    List listM4992l = C1405c0.m4992l(string5);
                    Integer numValueOf = cursorM16698S0.isNull(iM16742n5) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n5));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    String string6 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                    int i13 = cursorM16698S0.getInt(iM16742n7);
                    List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8));
                    Integer numValueOf2 = cursorM16698S0.isNull(iM16742n9) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n9));
                    if (numValueOf2 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    String string7 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                    String string8 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                    Integer numValueOf3 = cursorM16698S0.isNull(iM16742n12) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n12));
                    String string9 = cursorM16698S0.isNull(r17) ? null : cursorM16698S0.getString(iM16742n13);
                    List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(r18) ? null : cursorM16698S0.getString(iM16742n14));
                    if (cursorM16698S0.isNull(iM16742n15)) {
                        i10 = iM16742n16;
                        if (cursorM16698S0.isNull(i10)) {
                            languageContextNotification = null;
                        }
                        if (cursorM16698S0.isNull(r21) || !cursorM16698S0.isNull(iM16742n18)) {
                            if (cursorM16698S0.isNull(r21)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n17);
                            }
                            if (!cursorM16698S0.isNull(iM16742n18)) {
                                string2 = cursorM16698S0.getString(iM16742n18);
                            }
                            languageContextNotification2 = new LanguageContextNotification(string, string2);
                        } else {
                            languageContextNotification2 = null;
                        }
                        languageContext = new LanguageContext(string3, i11, string4, i12, listM4992l, languageContextNotification, languageContextNotification2, boolValueOf, string6, i13, listM4992l2, boolValueOf2, string7, string8, numValueOf3, string9, listM4992l3);
                    } else {
                        i10 = iM16742n16;
                    }
                    languageContextNotification = new LanguageContextNotification(cursorM16698S0.isNull(iM16742n15) ? null : cursorM16698S0.getString(iM16742n15), cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10));
                    if (cursorM16698S0.isNull(r21)) {
                        if (cursorM16698S0.isNull(r21)) {
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(iM16742n17);
                        }
                        if (!cursorM16698S0.isNull(iM16742n18)) {
                            string2 = cursorM16698S0.getString(iM16742n18);
                        }
                        languageContextNotification2 = new LanguageContextNotification(string, string2);
                    } else {
                        if (cursorM16698S0.isNull(r21)) {
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(iM16742n17);
                        }
                        if (!cursorM16698S0.isNull(iM16742n18)) {
                            string2 = cursorM16698S0.getString(iM16742n18);
                        }
                        languageContextNotification2 = new LanguageContextNotification(string, string2);
                    }
                    languageContext = new LanguageContext(string3, i11, string4, i12, listM4992l, languageContextNotification, languageContextNotification2, boolValueOf, string6, i13, listM4992l2, boolValueOf2, string7, string8, numValueOf3, string9, listM4992l3);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return languageContext;
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
