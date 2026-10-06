package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jar extends izs {

    /* JADX INFO: renamed from: a */
    public static jar f33616a;

    public jar(izv izvVar) {
        super(izvVar);
    }

    /* JADX INFO: renamed from: C */
    protected static final String m12789C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return obj.toString();
            }
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return obj.toString();
        }
        char cCharAt = obj.toString().charAt(0);
        String strValueOf = String.valueOf(Math.abs(l.longValue()));
        StringBuilder sb = new StringBuilder();
        String str = cCharAt != '-' ? "" : "-";
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length() - 1)));
        sb.append("...");
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d));
        return sb.toString();
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        synchronized (jar.class) {
            f33616a = this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12790b(jao jaoVar, String str) {
        m11940u("Discarding hit. ".concat(str), jaoVar != null ? jaoVar.toString() : "no hit data");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x0176, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000b, B:34:0x0068, B:35:0x0069, B:39:0x0076, B:41:0x00b6, B:42:0x00ba, B:44:0x00c1, B:49:0x00cc, B:51:0x00e2, B:54:0x010e, B:70:0x0175, B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170, B:6:0x000c, B:8:0x0010, B:10:0x001c, B:11:0x0022, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:20:0x0039, B:22:0x003d, B:27:0x0051, B:29:0x0055, B:24:0x0045, B:26:0x004d, B:30:0x0064), top: B:77:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0176, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000b, B:34:0x0068, B:35:0x0069, B:39:0x0076, B:41:0x00b6, B:42:0x00ba, B:44:0x00c1, B:49:0x00cc, B:51:0x00e2, B:54:0x010e, B:70:0x0175, B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170, B:6:0x000c, B:8:0x0010, B:10:0x001c, B:11:0x0022, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:20:0x0039, B:22:0x003d, B:27:0x0051, B:29:0x0055, B:24:0x0045, B:26:0x004d, B:30:0x0064), top: B:77:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[Catch: all -> 0x0176, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000b, B:34:0x0068, B:35:0x0069, B:39:0x0076, B:41:0x00b6, B:42:0x00ba, B:44:0x00c1, B:49:0x00cc, B:51:0x00e2, B:54:0x010e, B:70:0x0175, B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170, B:6:0x000c, B:8:0x0010, B:10:0x001c, B:11:0x0022, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:20:0x0039, B:22:0x003d, B:27:0x0051, B:29:0x0055, B:24:0x0045, B:26:0x004d, B:30:0x0064), top: B:77:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123 A[Catch: all -> 0x0173, TryCatch #0 {, blocks: (B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170), top: B:74:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[Catch: all -> 0x0173, TRY_ENTER, TryCatch #0 {, blocks: (B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170), top: B:74:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015f A[Catch: all -> 0x0173, TryCatch #0 {, blocks: (B:55:0x010f, B:57:0x0123, B:58:0x013e, B:61:0x0141, B:63:0x015f, B:64:0x0166, B:65:0x0170), top: B:74:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m12791c(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        String strSubstring;
        jau jauVar;
        gmc gmcVar;
        long j;
        long leastSignificantBits;
        long j2;
        SharedPreferences.Editor editorEdit;
        jah jahVarM11927g = m11927g();
        if (jahVarM11927g.f33565b != null) {
            if (true != jahVarM11927g.f33565b.booleanValue()) {
                c = 'c';
            } else {
                c = 'C';
            }
            strSubstring = "3" + "01VDIWEA?".charAt(i) + c + izt.f32725a + VzWFSVj.OJSr + m11922l(str, m12789C(obj), m12789C(obj2), m12789C(obj3));
            if (strSubstring.length() > 1024) {
                strSubstring = strSubstring.substring(0, 1024);
            }
            jauVar = this.f32723b.f32733f;
            jauVar = jauVar != null ? null : null;
            if (jauVar != null) {
                gmcVar = jauVar.f33626d;
                if (((jau) gmcVar.f25582b).f33624a.getLong(gmcVar.m9501j(), 0L) == 0) {
                    Object obj4 = gmcVar.f25582b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit2 = ((jau) gmcVar.f25582b).f33624a.edit();
                    editorEdit2.remove(gmcVar.m9500i());
                    editorEdit2.remove(gmcVar.m9502k());
                    editorEdit2.putLong(gmcVar.m9501j(), jCurrentTimeMillis);
                    editorEdit2.commit();
                }
                if (strSubstring == null) {
                    strSubstring = "";
                }
                synchronized (gmcVar) {
                    j = ((jau) gmcVar.f25582b).f33624a.getLong(gmcVar.m9500i(), 0L);
                    if (j <= 0) {
                        SharedPreferences.Editor editorEdit3 = ((jau) gmcVar.f25582b).f33624a.edit();
                        editorEdit3.putString(gmcVar.m9502k(), strSubstring);
                        editorEdit3.putLong(gmcVar.m9500i(), 1L);
                        editorEdit3.apply();
                        return;
                    }
                    leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                    long j3 = j + 1;
                    j2 = Long.MAX_VALUE / j3;
                    editorEdit = ((jau) gmcVar.f25582b).f33624a.edit();
                    if (leastSignificantBits < j2) {
                        editorEdit.putString(gmcVar.m9502k(), strSubstring);
                    }
                    editorEdit.putLong(gmcVar.m9500i(), j3);
                    editorEdit.apply();
                }
            }
            return;
        }
        synchronized (jahVarM11927g) {
            if (jahVarM11927g.f33565b == null) {
                ApplicationInfo applicationInfo = jahVarM11927g.f33564a.f32728a.getApplicationInfo();
                if (jiv.f34143a == null) {
                    jiv.f34143a = Application.getProcessName();
                }
                String str2 = jiv.f34143a;
                if (applicationInfo != null) {
                    String str3 = applicationInfo.processName;
                    jahVarM11927g.f33565b = Boolean.valueOf(str3 != null && str3.equals(str2));
                }
                if ((jahVarM11927g.f33565b == null || !jahVarM11927g.f33565b.booleanValue()) && "com.google.android.gms.analytics".equals(str2)) {
                    jahVarM11927g.f33565b = Boolean.TRUE;
                }
                if (jahVarM11927g.f33565b == null) {
                    jahVarM11927g.f33565b = Boolean.TRUE;
                    jahVarM11927g.f33564a.m11951d().m11933n("My process not in the list of running processes");
                }
            }
        }
        if (true != jahVarM11927g.f33565b.booleanValue()) {
            c = 'c';
        } else {
            c = 'C';
        }
        strSubstring = "3" + "01VDIWEA?".charAt(i) + c + izt.f32725a + VzWFSVj.OJSr + m11922l(str, m12789C(obj), m12789C(obj2), m12789C(obj3));
        if (strSubstring.length() > 1024) {
            strSubstring = strSubstring.substring(0, 1024);
        }
        jauVar = this.f32723b.f32733f;
        if (jauVar != null || !jauVar.m11945B()) {
        }
        if (jauVar != null) {
            gmcVar = jauVar.f33626d;
            if (((jau) gmcVar.f25582b).f33624a.getLong(gmcVar.m9501j(), 0L) == 0) {
                Object obj5 = gmcVar.f25582b;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit4 = ((jau) gmcVar.f25582b).f33624a.edit();
                editorEdit4.remove(gmcVar.m9500i());
                editorEdit4.remove(gmcVar.m9502k());
                editorEdit4.putLong(gmcVar.m9501j(), jCurrentTimeMillis2);
                editorEdit4.commit();
            }
            if (strSubstring == null) {
                strSubstring = "";
            }
            synchronized (gmcVar) {
                j = ((jau) gmcVar.f25582b).f33624a.getLong(gmcVar.m9500i(), 0L);
                if (j <= 0) {
                    SharedPreferences.Editor editorEdit5 = ((jau) gmcVar.f25582b).f33624a.edit();
                    editorEdit5.putString(gmcVar.m9502k(), strSubstring);
                    editorEdit5.putLong(gmcVar.m9500i(), 1L);
                    editorEdit5.apply();
                    return;
                }
                leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j4 = j + 1;
                j2 = Long.MAX_VALUE / j4;
                editorEdit = ((jau) gmcVar.f25582b).f33624a.edit();
                if (leastSignificantBits < j2) {
                    editorEdit.putString(gmcVar.m9502k(), strSubstring);
                }
                editorEdit.putLong(gmcVar.m9500i(), j4);
                editorEdit.apply();
            }
        }
        return;
        throw th;
    }
}
