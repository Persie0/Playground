package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p021j$.util.StringJoiner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cno {

    /* JADX INFO: renamed from: c */
    private static final String f6359c = "SELECT " + m3989a("a", "media_id") + "," + m3989a("a", "selection_key") + "," + m3989a("a", "time") + gBCSQzBeB.rauPkgUkYxSFsEJ;

    /* JADX INFO: renamed from: d */
    private static final char[] f6360d = "bcdefghijklmnopqrstuvwxyz".toCharArray();

    /* JADX INFO: renamed from: b */
    public final String f6362b;

    /* JADX INFO: renamed from: a */
    public final Map f6361a = new HashMap();

    /* JADX INFO: renamed from: e */
    private final ArrayList f6363e = new ArrayList();

    public cno(cny cnyVar, cnw cnwVar, int i, Random random) {
        String str;
        StringBuilder sb;
        long millis;
        long millis2;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        StringJoiner stringJoiner = new StringJoiner(",");
        String str4 = " ";
        StringJoiner stringJoiner2 = new StringJoiner(" ");
        String str5 = " AND ";
        StringJoiner stringJoiner3 = new StringJoiner(" AND ");
        String str6 = "media_id";
        String strM3989a = m3989a("a", "media_id");
        Iterator it = cnyVar.f6409h.iterator();
        int i2 = 0;
        while (true) {
            String str7 = "selection_key";
            str = str4;
            if (!it.hasNext()) {
                break;
            }
            coa coaVar = (coa) it.next();
            int i3 = i2 + 1;
            char c = f6360d[i2];
            Iterator it2 = it;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c);
            String string = sb3.toString();
            String str8 = coaVar.f6416a;
            String str9 = str5;
            this.f6361a.put(str8, string);
            StringBuilder sb4 = sb2;
            stringJoiner.add(String.format("%s as %s_%s", m3989a(string, "value"), string, "value"));
            stringJoiner2.add(String.format("INNER JOIN %s %s ON %s=%s", str8, string, strM3989a, m3989a(string, str6)));
            strM3989a = m3989a(string, str6);
            Iterator it3 = Collections.unmodifiableMap(coaVar.f6417b).keySet().iterator();
            while (it3.hasNext()) {
                String str10 = (String) it3.next();
                String strM3989a2 = m3989a(string, str10);
                Iterator it4 = it3;
                cnt cntVar = (cnt) Collections.unmodifiableMap(coaVar.f6417b).get(str10);
                cntVar.getClass();
                ArrayList arrayList = this.f6363e;
                coa coaVar2 = coaVar;
                String str11 = str6;
                nxy nxyVar = (cntVar.f6385a == 1 ? (cnv) cntVar.f6386b : cnv.f6392b).f6394a;
                StringBuilder sb5 = new StringBuilder();
                String str12 = " ( ";
                sb5.append(" ( ");
                Iterator it5 = nxyVar.iterator();
                boolean z = false;
                while (it5.hasNext()) {
                    it5 = it5;
                    cnu cnuVar = (cnu) it5.next();
                    if (z) {
                        sb5.append(" OR ");
                    }
                    if ((cnuVar.f6389a & 1) != 0) {
                        str2 = string;
                        if (cnuVar.f6391c < 100) {
                            sb5.append(str12);
                            sb5.append(strM3989a2);
                            sb5.append(" = ? AND ((");
                            sb5.append(m3989a("a", str7));
                            sb5.append(" % 100) IN ( ");
                            String str13 = str7;
                            arrayList.add(Long.toString(cnuVar.f6390b));
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i4 = 0;
                            while (true) {
                                str3 = str12;
                                if (i4 >= cnuVar.f6391c) {
                                    break;
                                }
                                if (i4 > 0) {
                                    sb5.append(" , ");
                                }
                                sb5.append("CAST(? as INTEGER)");
                                Integer numValueOf = Integer.valueOf(random.nextInt(100) + 1);
                                while (linkedHashSet.contains(numValueOf)) {
                                    numValueOf = Integer.valueOf(random.nextInt(100) + 1);
                                }
                                linkedHashSet.add(numValueOf);
                                arrayList.add(numValueOf.toString());
                                i4++;
                                str12 = str3;
                            }
                            sb5.append(" ))) ");
                            str7 = str13;
                            string = str2;
                            str12 = str3;
                            z = true;
                        }
                    } else {
                        str2 = string;
                    }
                    sb5.append(strM3989a2);
                    sb5.append(" = ? ");
                    arrayList.add(Long.toString(cnuVar.f6390b));
                    str7 = str7;
                    string = str2;
                    str12 = str12;
                    z = true;
                }
                sb5.append(" ) ");
                stringJoiner3.add(sb5.toString());
                it3 = it4;
                coaVar = coaVar2;
                strM3989a = strM3989a;
                str6 = str11;
            }
            i2 = i3;
            str4 = str;
            it = it2;
            str5 = str9;
            sb2 = sb4;
        }
        StringBuilder sb6 = sb2;
        String str14 = str5;
        String str15 = str6;
        int i5 = cnyVar.f6405d;
        int iM6059d = dfm.m6059d(i5);
        iM6059d = iM6059d == 0 ? 1 : iM6059d;
        int iM6059d2 = dfm.m6059d(i5);
        long jLongValue = (iM6059d2 != 0 && iM6059d2 == 2) ? cnwVar.f6397a == 2 ? ((Long) cnwVar.f6398b).longValue() : 0L : cnwVar.f6397a == 1 ? ((Long) cnwVar.f6398b).longValue() : 0L;
        if (stringJoiner3.length() > 0) {
            sb = sb6;
            sb.append(stringJoiner3);
            sb.append(str14);
        } else {
            sb = sb6;
        }
        String str16 = iM6059d != 2 ? str15 : "selection_key";
        sb.append(m3989a("a", str16));
        int iM6059d3 = dfm.m6059d(cnyVar.f6405d);
        if (iM6059d3 != 0 && iM6059d3 == 4 && jLongValue > 0) {
            sb.append(" < ?");
        } else {
            sb.append(" > ?");
        }
        this.f6363e.add(Long.toString(jLongValue));
        if (cnyVar.f6402a > 0) {
            sb.append(" AND ((");
            sb.append(m3989a("a", "selection_key"));
            sb.append(" % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
            this.f6363e.add(String.valueOf(cnyVar.f6402a));
            this.f6363e.add(String.valueOf(cnyVar.f6403b));
            this.f6363e.add(String.valueOf(cnyVar.f6404c));
        }
        nzw nzwVar = cnyVar.f6406e;
        long j = (nzwVar == null ? nzw.f45101c : nzwVar).f45103a;
        nzw nzwVar2 = cnyVar.f6407f;
        long j2 = (nzwVar2 == null ? nzw.f45101c : nzwVar2).f45103a;
        if (j == 0) {
            millis = 0;
        } else {
            long millis3 = TimeUnit.SECONDS.toMillis(j);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            nzw nzwVar3 = cnyVar.f6406e;
            millis = millis3 + timeUnit.toMillis((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b);
        }
        if (j2 == 0) {
            millis2 = Long.MAX_VALUE;
        } else {
            long millis4 = TimeUnit.SECONDS.toMillis(j2);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            nzw nzwVar4 = cnyVar.f6407f;
            millis2 = millis4 + timeUnit2.toMillis((nzwVar4 == null ? nzw.f45101c : nzwVar4).f45104b);
        }
        sb.append(NptsKnlVczSZ.hHrcCbe);
        sb.append(m3989a("a", "time"));
        sb.append(" BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
        this.f6363e.add(String.valueOf(millis));
        this.f6363e.add(String.valueOf(millis2));
        sb.append(" ORDER BY ");
        sb.append(m3989a("a", str16));
        sb.append(str);
        int iM6059d4 = dfm.m6059d(cnyVar.f6405d);
        sb.append((iM6059d4 == 0 ? 1 : iM6059d4) != 4 ? "ASC" : "DESC");
        sb.append(" LIMIT ?");
        this.f6363e.add(String.valueOf(i));
        this.f6362b = String.format("%s %s %s WHERE %s", String.format(f6359c, stringJoiner), "FROM media_record a", stringJoiner2, sb);
    }

    /* JADX INFO: renamed from: a */
    static String m3989a(String str, String str2) {
        return String.format("%s.%s", str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final String[] m3990b() {
        return (String[]) this.f6363e.toArray(new String[0]);
    }
}
