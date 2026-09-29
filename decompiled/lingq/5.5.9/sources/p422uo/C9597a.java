package p422uo;

import dm.C5207g;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C6753d;
import kotlin.text.Regex;
import mo.C7661i;
import okhttp3.C8072a;
import okhttp3.C8072a.d;
import okhttp3.Protocol;
import okhttp3.internal.cache.DiskLruCache;
import p124fp.C5617n;
import p467wo.C9990e;
import p493xo.C10263c;
import p493xo.C10265e;
import p493xo.C10266f;
import p493xo.C10267g;
import so.AbstractC9093k;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9085c;
import so.C9095m;
import so.C9096n;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;
import to.C9347b;

/* JADX INFO: renamed from: uo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9597a implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final C8072a f49266a;

    /* JADX INFO: renamed from: uo.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static final C9106x m18068a(C9106x c9106x) {
            if ((c9106x == null ? null : c9106x.f47569g) != null) {
                c9106x.getClass();
                C9106x.a aVar = new C9106x.a(c9106x);
                aVar.f47581g = null;
                c9106x = aVar.m17352a();
            }
            return c9106x;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18069b(String str) {
            return (C7661i.m15249O2("Connection", str) || C7661i.m15249O2("Keep-Alive", str) || C7661i.m15249O2("Proxy-Authenticate", str) || C7661i.m15249O2("Proxy-Authorization", str) || C7661i.m15249O2("TE", str) || C7661i.m15249O2("Trailers", str) || C7661i.m15249O2("Transfer-Encoding", str) || C7661i.m15249O2("Upgrade", str)) ? false : true;
        }
    }

    static {
        new a();
    }

    public C9597a(C8072a c8072a) {
        this.f49266a = c8072a;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02af  */
    /* JADX WARN: Code duplicated, block: B:129:0x02be  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02de  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x030b  */
    /* JADX WARN: Code duplicated, block: B:152:0x030f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0329  */
    /* JADX WARN: Code duplicated, block: B:156:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0331  */
    /* JADX WARN: Code duplicated, block: B:158:0x0334 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0336  */
    /* JADX WARN: Code duplicated, block: B:163:0x035d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0363  */
    /* JADX WARN: Code duplicated, block: B:167:0x0376  */
    /* JADX WARN: Code duplicated, block: B:169:0x0382  */
    /* JADX WARN: Code duplicated, block: B:170:0x0387  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03af  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:185:0x03df  */
    /* JADX WARN: Code duplicated, block: B:189:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:192:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f1 A[Catch: all -> 0x06f6, TRY_LEAVE, TryCatch #3 {, blocks: (B:190:0x03ec, B:193:0x03f1), top: B:373:0x03ec }] */
    /* JADX WARN: Code duplicated, block: B:197:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:198:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:200:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:203:0x0403  */
    /* JADX WARN: Code duplicated, block: B:217:0x0455  */
    /* JADX WARN: Code duplicated, block: B:219:0x0475  */
    /* JADX WARN: Code duplicated, block: B:226:0x0492  */
    /* JADX WARN: Code duplicated, block: B:228:0x0498  */
    /* JADX WARN: Code duplicated, block: B:229:0x049b  */
    /* JADX WARN: Code duplicated, block: B:231:0x049f  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:238:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:253:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:257:0x050b  */
    /* JADX WARN: Code duplicated, block: B:265:0x052c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0575 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:276:0x0584  */
    /* JADX WARN: Code duplicated, block: B:279:0x0594  */
    /* JADX WARN: Code duplicated, block: B:280:0x0595 A[Catch: IOException -> 0x059c, TRY_LEAVE, TryCatch #8 {IOException -> 0x059c, blocks: (B:277:0x0588, B:280:0x0595), top: B:384:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:289:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:292:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:293:0x05be  */
    /* JADX WARN: Code duplicated, block: B:296:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:332:0x066e  */
    /* JADX WARN: Code duplicated, block: B:334:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:348:0x06df  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:367:0x06e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [wo.e] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [so.k$a] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r10v15, types: [okhttp3.a$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [okhttp3.a$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [okhttp3.a$d] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [okhttp3.internal.cache.DiskLruCache$Editor] */
    /* JADX WARN: Type inference failed for: r6v24, types: [okhttp3.internal.cache.DiskLruCache$Editor] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [okhttp3.internal.cache.DiskLruCache$Editor] */
    /* JADX WARN: Type inference failed for: r7v24, types: [okhttp3.internal.cache.DiskLruCache$Editor] */
    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws IOException {
        C9106x c9106xM17352a;
        int iM17718y;
        long jLongValue;
        long jLongValue2;
        Date dateM19222a;
        Date dateM19222a2;
        Date dateM19222a3;
        String str;
        String str2;
        String str3;
        C9600d c9600d;
        String string;
        long j10;
        long jMin;
        long time;
        int i10;
        int i11;
        long millis;
        long millis2;
        String str4;
        String str5;
        String str6;
        C9096n c9096n;
        String str7;
        AbstractC9105w abstractC9105w;
        Map<Class<?>, Object> map;
        LinkedHashMap linkedHashMapM13467T0;
        C9095m.a aVarM17307g;
        Map mapUnmodifiableMap;
        C9600d c9600d2;
        long j11;
        C9106x.a aVar;
        boolean z10;
        int i12;
        ?? dVar;
        C9101s c9101s;
        C9106x c9106x;
        C8072a c8072a;
        ?? r10;
        AbstractC9093k abstractC9093k;
        ?? r11;
        AbstractC9107y abstractC9107y;
        C9106x c9106xM19235c;
        boolean z11;
        C9106x c9106xM17352a2;
        String str8;
        boolean z12;
        ?? M15960l;
        boolean z13;
        AbstractC9107y abstractC9107y2;
        C9095m c9095m;
        C9095m c9095m2;
        C9095m.a aVar2;
        int length;
        int i13;
        int length2;
        int i14;
        C9106x c9106xM17352a3;
        C8072a c8072a2;
        ?? cVar;
        AbstractC9107y abstractC9107y3;
        String strM17306f;
        boolean z14;
        String strM17306f2;
        String strM17309l;
        boolean z15;
        boolean z16;
        AbstractC9107y abstractC9107y4;
        C9085c c9085cM17286b;
        boolean z17;
        AbstractC9107y abstractC9107y5;
        boolean z18;
        boolean z19;
        C9990e c9990e = c10266f.f51697a;
        C8072a c8072a3 = this.f49266a;
        if (c8072a3 == null) {
            c9106xM17352a = null;
        } else {
            C9101s c9101s2 = c10266f.f51701e;
            C5207g.m11111f(c9101s2, "request");
            C9096n c9096n2 = c9101s2.f47542a;
            try {
                DiskLruCache.C8075b c8075bM15961q = c8072a3.f43782a.m15961q(C8072a.b.m15942a(c9096n2));
                if (c8075bM15961q == null) {
                    c9106xM17352a = null;
                } else {
                    try {
                        C8072a.c cVar2 = new C8072a.c(c8075bM15961q.f43855c.get(0));
                        C9095m c9095m3 = cVar2.f43792b;
                        String str9 = cVar2.f43793c;
                        C9096n c9096n3 = cVar2.f43791a;
                        C9095m c9095m4 = cVar2.f43797g;
                        String strM17305a = c9095m4.m17305a("Content-Type");
                        String strM17305a2 = c9095m4.m17305a("Content-Length");
                        C9101s.a aVar3 = new C9101s.a();
                        C5207g.m11111f(c9096n3, "url");
                        aVar3.f47548a = c9096n3;
                        aVar3.m17346d(str9, null);
                        C5207g.m11111f(c9095m3, "headers");
                        aVar3.f47550c = c9095m3.m17307g();
                        C9101s c9101sM17344b = aVar3.m17344b();
                        C9106x.a aVar4 = new C9106x.a();
                        aVar4.f47575a = c9101sM17344b;
                        Protocol protocol = cVar2.f43794d;
                        C5207g.m11111f(protocol, "protocol");
                        aVar4.f47576b = protocol;
                        aVar4.f47577c = cVar2.f43795e;
                        String str10 = cVar2.f43796f;
                        C5207g.m11111f(str10, "message");
                        aVar4.f47578d = str10;
                        aVar4.m17353c(c9095m4);
                        aVar4.f47581g = new C8072a.a(c8075bM15961q, strM17305a, strM17305a2);
                        aVar4.f47579e = cVar2.f43798h;
                        aVar4.f47585k = cVar2.f43799i;
                        aVar4.f47586l = cVar2.f43800j;
                        c9106xM17352a = aVar4.m17352a();
                        if (C5207g.m11106a(c9096n3, c9096n2) && C5207g.m11106a(str9, c9101s2.f47543b)) {
                            Set setM15944c = C8072a.b.m15944c(c9106xM17352a.f47568f);
                            if (!(setM15944c instanceof Collection) || !setM15944c.isEmpty()) {
                                Iterator it = setM15944c.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z18 = true;
                                        z19 = true;
                                        break;
                                    }
                                    String str11 = (String) it.next();
                                    z18 = true;
                                    if (!C5207g.m11106a(c9095m3.m17310m(str11), c9101s2.f47544c.m17310m(str11))) {
                                        z19 = false;
                                        break;
                                    }
                                }
                            } else {
                                z18 = true;
                                z19 = true;
                                break;
                            }
                            z17 = z19 ? z18 : false;
                            if (!z17) {
                                abstractC9107y5 = c9106xM17352a.f47569g;
                                if (abstractC9107y5 != null) {
                                    C9347b.m17697d(abstractC9107y5);
                                }
                                c9106xM17352a = null;
                            }
                        }
                        if (!z17) {
                            abstractC9107y5 = c9106xM17352a.f47569g;
                            if (abstractC9107y5 != null) {
                                C9347b.m17697d(abstractC9107y5);
                            }
                            c9106xM17352a = null;
                        }
                    } catch (IOException unused) {
                        C9347b.m17697d(c8075bM15961q);
                    }
                }
            } catch (IOException unused2) {
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C9101s c9101s3 = c10266f.f51701e;
        C5207g.m11111f(c9101s3, "request");
        if (c9106xM17352a != null) {
            jLongValue = c9106xM17352a.f47573k;
            jLongValue2 = c9106xM17352a.f47574l;
            C9095m c9095m5 = c9106xM17352a.f47568f;
            int length3 = c9095m5.f47452a.length / 2;
            int i15 = 0;
            iM17718y = -1;
            dateM19222a = null;
            dateM19222a2 = null;
            dateM19222a3 = null;
            str = null;
            str2 = null;
            str3 = null;
            while (i15 < length3) {
                int i16 = i15 + 1;
                String strM17306f3 = c9095m5.m17306f(i15);
                String strM17309l2 = c9095m5.m17309l(i15);
                int i17 = length3;
                if (C7661i.m15249O2(strM17306f3, "Date")) {
                    dateM19222a = C10263c.m19222a(strM17309l2);
                    str3 = strM17309l2;
                } else if (C7661i.m15249O2(strM17306f3, "Expires")) {
                    dateM19222a2 = C10263c.m19222a(strM17309l2);
                } else if (C7661i.m15249O2(strM17306f3, "Last-Modified")) {
                    dateM19222a3 = C10263c.m19222a(strM17309l2);
                    str2 = strM17309l2;
                } else if (C7661i.m15249O2(strM17306f3, "ETag")) {
                    str = strM17309l2;
                } else if (C7661i.m15249O2(strM17306f3, "Age")) {
                    iM17718y = C9347b.m17718y(strM17309l2, -1);
                }
                i15 = i16;
                length3 = i17;
            }
        } else {
            iM17718y = -1;
            jLongValue = 0;
            jLongValue2 = 0;
            dateM19222a = null;
            dateM19222a2 = null;
            dateM19222a3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (c9106xM17352a != null) {
            if (!(c9101s3.f47542a.f47464j && c9106xM17352a.f47567e == null) && C9600d.a.m18070a(c9101s3, c9106xM17352a)) {
                C9085c c9085cM17286b2 = c9101s3.f47547f;
                if (c9085cM17286b2 == null) {
                    int i18 = C9085c.f47385n;
                    c9085cM17286b2 = C9085c.b.m17286b(c9101s3.f47544c);
                    c9101s3.f47547f = c9085cM17286b2;
                }
                if (c9085cM17286b2.f47386a) {
                    c9101s3 = c9101s3;
                    c9600d = new C9600d(c9101s3, null);
                } else {
                    if ((c9101s3.f47544c.m17305a("If-Modified-Since") == null && c9101s3.f47544c.m17305a("If-None-Match") == null) ? false : true) {
                        c9101s3 = c9101s3;
                        c9600d = new C9600d(c9101s3, null);
                    } else {
                        C9085c c9085cM17349a = c9106xM17352a.m17349a();
                        long jMax = dateM19222a != null ? Math.max(0L, jLongValue2 - dateM19222a.getTime()) : 0L;
                        if (iM17718y != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(iM17718y));
                        }
                        long j12 = jMax + (jLongValue2 - jLongValue) + (jCurrentTimeMillis - jLongValue2);
                        int i19 = c9106xM17352a.m17349a().f47388c;
                        if (i19 != -1) {
                            time = TimeUnit.SECONDS.toMillis(i19);
                        } else {
                            if (dateM19222a2 != null) {
                                Long lValueOf = dateM19222a == null ? null : Long.valueOf(dateM19222a.getTime());
                                if (lValueOf != null) {
                                    jLongValue2 = lValueOf.longValue();
                                }
                                time = dateM19222a2.getTime() - jLongValue2;
                                if (time > 0) {
                                }
                                i10 = c9085cM17286b2.f47388c;
                                if (i10 != -1) {
                                    jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                                }
                                i11 = c9085cM17286b2.f47394i;
                                if (i11 != -1) {
                                    millis = TimeUnit.SECONDS.toMillis(i11);
                                } else {
                                    millis = j10;
                                }
                                if (!c9085cM17349a.f47392g || (i12 = c9085cM17286b2.f47393h) == -1) {
                                    millis2 = j10;
                                } else {
                                    millis2 = TimeUnit.SECONDS.toMillis(i12);
                                }
                                if (c9085cM17349a.f47386a) {
                                    if (str != null) {
                                        str6 = "If-None-Match";
                                        str5 = str;
                                    } else {
                                        if (dateM19222a3 != null) {
                                            str4 = str2;
                                        } else if (dateM19222a != null) {
                                            str4 = str3;
                                        } else {
                                            c9101s3 = c9101s3;
                                            c9600d = new C9600d(c9101s3, null);
                                        }
                                        str5 = str4;
                                        str6 = "If-Modified-Since";
                                    }
                                    C9095m.a aVarM17307g2 = c9101s3.f47544c.m17307g();
                                    C5207g.m11108c(str5);
                                    aVarM17307g2.m17313c(str6, str5);
                                    new LinkedHashMap();
                                    c9096n = c9101s3.f47542a;
                                    str7 = c9101s3.f47543b;
                                    abstractC9105w = c9101s3.f47545d;
                                    map = c9101s3.f47546e;
                                    if (map.isEmpty()) {
                                        linkedHashMapM13467T0 = new LinkedHashMap();
                                    } else {
                                        linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                    }
                                    c9101s3.f47544c.m17307g();
                                    aVarM17307g = aVarM17307g2.m17314d().m17307g();
                                    if (c9096n != null) {
                                        throw new IllegalStateException("url == null".toString());
                                    }
                                    C9095m c9095mM17314d = aVarM17307g.m17314d();
                                    byte[] bArr = C9347b.f48082a;
                                    if (linkedHashMapM13467T0.isEmpty()) {
                                        mapUnmodifiableMap = C6753d.m13459L0();
                                    } else {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                        C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                    }
                                    c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                    c9600d = c9600d2;
                                } else {
                                    j11 = millis + j12;
                                    if (j11 < millis2 + jMin) {
                                        aVar = new C9106x.a(c9106xM17352a);
                                        if (j11 >= jMin) {
                                            aVar.f47580f.m17311a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (j12 > 86400000) {
                                            if (c9106xM17352a.m17349a().f47388c == -1 || dateM19222a2 != null) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                aVar.f47580f.m17311a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                        }
                                        c9600d = new C9600d(null, aVar.m17352a());
                                        c9101s3 = c9101s3;
                                    } else {
                                        if (str != null) {
                                            str6 = "If-None-Match";
                                            str5 = str;
                                        } else {
                                            if (dateM19222a3 != null) {
                                                str4 = str2;
                                            } else if (dateM19222a != null) {
                                                str4 = str3;
                                            } else {
                                                c9101s3 = c9101s3;
                                                c9600d = new C9600d(c9101s3, null);
                                            }
                                            str5 = str4;
                                            str6 = "If-Modified-Since";
                                        }
                                        C9095m.a aVarM17307g3 = c9101s3.f47544c.m17307g();
                                        C5207g.m11108c(str5);
                                        aVarM17307g3.m17313c(str6, str5);
                                        new LinkedHashMap();
                                        c9096n = c9101s3.f47542a;
                                        str7 = c9101s3.f47543b;
                                        abstractC9105w = c9101s3.f47545d;
                                        map = c9101s3.f47546e;
                                        if (map.isEmpty()) {
                                            linkedHashMapM13467T0 = new LinkedHashMap();
                                        } else {
                                            linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                        }
                                        c9101s3.f47544c.m17307g();
                                        aVarM17307g = aVarM17307g3.m17314d().m17307g();
                                        if (c9096n != null) {
                                            throw new IllegalStateException("url == null".toString());
                                        }
                                        C9095m c9095mM17314d2 = aVarM17307g.m17314d();
                                        byte[] bArr2 = C9347b.f48082a;
                                        if (linkedHashMapM13467T0.isEmpty()) {
                                            mapUnmodifiableMap = C6753d.m13459L0();
                                        } else {
                                            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                            C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                        }
                                        c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d2, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                        c9600d = c9600d2;
                                    }
                                }
                            } else {
                                if (dateM19222a3 != null) {
                                    List<String> list = c9106xM17352a.f47563a.f47542a.f47461g;
                                    if (list == null) {
                                        string = null;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        C9096n.b.m17337f(sb2, list);
                                        string = sb2.toString();
                                    }
                                    if (string == null) {
                                        Long lValueOf2 = dateM19222a == null ? null : Long.valueOf(dateM19222a.getTime());
                                        if (lValueOf2 != null) {
                                            jLongValue = lValueOf2.longValue();
                                        }
                                        long time2 = jLongValue - dateM19222a3.getTime();
                                        j10 = 0;
                                        if (time2 > 0) {
                                            jMin = time2 / ((long) 10);
                                        }
                                    }
                                    jMin = j10;
                                }
                                i10 = c9085cM17286b2.f47388c;
                                if (i10 != -1) {
                                    jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                                }
                                i11 = c9085cM17286b2.f47394i;
                                if (i11 != -1) {
                                    millis = TimeUnit.SECONDS.toMillis(i11);
                                } else {
                                    millis = j10;
                                }
                                if (c9085cM17349a.f47392g) {
                                    millis2 = j10;
                                } else {
                                    millis2 = j10;
                                }
                                if (c9085cM17349a.f47386a) {
                                    j11 = millis + j12;
                                    if (j11 < millis2 + jMin) {
                                        aVar = new C9106x.a(c9106xM17352a);
                                        if (j11 >= jMin) {
                                            aVar.f47580f.m17311a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (j12 > 86400000) {
                                            if (c9106xM17352a.m17349a().f47388c == -1) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                aVar.f47580f.m17311a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                        }
                                        c9600d = new C9600d(null, aVar.m17352a());
                                        c9101s3 = c9101s3;
                                    } else {
                                        if (str != null) {
                                            str6 = "If-None-Match";
                                            str5 = str;
                                        } else {
                                            if (dateM19222a3 != null) {
                                                str4 = str2;
                                            } else if (dateM19222a != null) {
                                                str4 = str3;
                                            } else {
                                                c9101s3 = c9101s3;
                                                c9600d = new C9600d(c9101s3, null);
                                            }
                                            str5 = str4;
                                            str6 = "If-Modified-Since";
                                        }
                                        C9095m.a aVarM17307g4 = c9101s3.f47544c.m17307g();
                                        C5207g.m11108c(str5);
                                        aVarM17307g4.m17313c(str6, str5);
                                        new LinkedHashMap();
                                        c9096n = c9101s3.f47542a;
                                        str7 = c9101s3.f47543b;
                                        abstractC9105w = c9101s3.f47545d;
                                        map = c9101s3.f47546e;
                                        if (map.isEmpty()) {
                                            linkedHashMapM13467T0 = new LinkedHashMap();
                                        } else {
                                            linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                        }
                                        c9101s3.f47544c.m17307g();
                                        aVarM17307g = aVarM17307g4.m17314d().m17307g();
                                        if (c9096n != null) {
                                            throw new IllegalStateException("url == null".toString());
                                        }
                                        C9095m c9095mM17314d3 = aVarM17307g.m17314d();
                                        byte[] bArr3 = C9347b.f48082a;
                                        if (linkedHashMapM13467T0.isEmpty()) {
                                            mapUnmodifiableMap = C6753d.m13459L0();
                                        } else {
                                            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                            C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                        }
                                        c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d3, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                        c9600d = c9600d2;
                                    }
                                } else {
                                    if (str != null) {
                                        str6 = "If-None-Match";
                                        str5 = str;
                                    } else {
                                        if (dateM19222a3 != null) {
                                            str4 = str2;
                                        } else if (dateM19222a != null) {
                                            str4 = str3;
                                        } else {
                                            c9101s3 = c9101s3;
                                            c9600d = new C9600d(c9101s3, null);
                                        }
                                        str5 = str4;
                                        str6 = "If-Modified-Since";
                                    }
                                    C9095m.a aVarM17307g5 = c9101s3.f47544c.m17307g();
                                    C5207g.m11108c(str5);
                                    aVarM17307g5.m17313c(str6, str5);
                                    new LinkedHashMap();
                                    c9096n = c9101s3.f47542a;
                                    str7 = c9101s3.f47543b;
                                    abstractC9105w = c9101s3.f47545d;
                                    map = c9101s3.f47546e;
                                    if (map.isEmpty()) {
                                        linkedHashMapM13467T0 = new LinkedHashMap();
                                    } else {
                                        linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                    }
                                    c9101s3.f47544c.m17307g();
                                    aVarM17307g = aVarM17307g5.m17314d().m17307g();
                                    if (c9096n != null) {
                                        throw new IllegalStateException("url == null".toString());
                                    }
                                    C9095m c9095mM17314d4 = aVarM17307g.m17314d();
                                    byte[] bArr4 = C9347b.f48082a;
                                    if (linkedHashMapM13467T0.isEmpty()) {
                                        mapUnmodifiableMap = C6753d.m13459L0();
                                    } else {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                        C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                    }
                                    c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d4, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                    c9600d = c9600d2;
                                }
                            }
                            j10 = 0;
                            jMin = j10;
                            i10 = c9085cM17286b2.f47388c;
                            if (i10 != -1) {
                                jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                            }
                            i11 = c9085cM17286b2.f47394i;
                            if (i11 != -1) {
                                millis = TimeUnit.SECONDS.toMillis(i11);
                            } else {
                                millis = j10;
                            }
                            if (c9085cM17349a.f47392g) {
                                millis2 = j10;
                            } else {
                                millis2 = j10;
                            }
                            if (c9085cM17349a.f47386a) {
                                j11 = millis + j12;
                                if (j11 < millis2 + jMin) {
                                    aVar = new C9106x.a(c9106xM17352a);
                                    if (j11 >= jMin) {
                                        aVar.f47580f.m17311a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j12 > 86400000) {
                                        if (c9106xM17352a.m17349a().f47388c == -1) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            aVar.f47580f.m17311a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    c9600d = new C9600d(null, aVar.m17352a());
                                    c9101s3 = c9101s3;
                                } else {
                                    if (str != null) {
                                        str6 = "If-None-Match";
                                        str5 = str;
                                    } else {
                                        if (dateM19222a3 != null) {
                                            str4 = str2;
                                        } else if (dateM19222a != null) {
                                            str4 = str3;
                                        } else {
                                            c9101s3 = c9101s3;
                                            c9600d = new C9600d(c9101s3, null);
                                        }
                                        str5 = str4;
                                        str6 = "If-Modified-Since";
                                    }
                                    C9095m.a aVarM17307g6 = c9101s3.f47544c.m17307g();
                                    C5207g.m11108c(str5);
                                    aVarM17307g6.m17313c(str6, str5);
                                    new LinkedHashMap();
                                    c9096n = c9101s3.f47542a;
                                    str7 = c9101s3.f47543b;
                                    abstractC9105w = c9101s3.f47545d;
                                    map = c9101s3.f47546e;
                                    if (map.isEmpty()) {
                                        linkedHashMapM13467T0 = new LinkedHashMap();
                                    } else {
                                        linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                    }
                                    c9101s3.f47544c.m17307g();
                                    aVarM17307g = aVarM17307g6.m17314d().m17307g();
                                    if (c9096n != null) {
                                        throw new IllegalStateException("url == null".toString());
                                    }
                                    C9095m c9095mM17314d5 = aVarM17307g.m17314d();
                                    byte[] bArr5 = C9347b.f48082a;
                                    if (linkedHashMapM13467T0.isEmpty()) {
                                        mapUnmodifiableMap = C6753d.m13459L0();
                                    } else {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                        C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                    }
                                    c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d5, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                    c9600d = c9600d2;
                                }
                            } else {
                                if (str != null) {
                                    str6 = "If-None-Match";
                                    str5 = str;
                                } else {
                                    if (dateM19222a3 != null) {
                                        str4 = str2;
                                    } else if (dateM19222a != null) {
                                        str4 = str3;
                                    } else {
                                        c9101s3 = c9101s3;
                                        c9600d = new C9600d(c9101s3, null);
                                    }
                                    str5 = str4;
                                    str6 = "If-Modified-Since";
                                }
                                C9095m.a aVarM17307g7 = c9101s3.f47544c.m17307g();
                                C5207g.m11108c(str5);
                                aVarM17307g7.m17313c(str6, str5);
                                new LinkedHashMap();
                                c9096n = c9101s3.f47542a;
                                str7 = c9101s3.f47543b;
                                abstractC9105w = c9101s3.f47545d;
                                map = c9101s3.f47546e;
                                if (map.isEmpty()) {
                                    linkedHashMapM13467T0 = new LinkedHashMap();
                                } else {
                                    linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                }
                                c9101s3.f47544c.m17307g();
                                aVarM17307g = aVarM17307g7.m17314d().m17307g();
                                if (c9096n != null) {
                                    throw new IllegalStateException("url == null".toString());
                                }
                                C9095m c9095mM17314d6 = aVarM17307g.m17314d();
                                byte[] bArr6 = C9347b.f48082a;
                                if (linkedHashMapM13467T0.isEmpty()) {
                                    mapUnmodifiableMap = C6753d.m13459L0();
                                } else {
                                    mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                    C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                }
                                c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d6, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                c9600d = c9600d2;
                            }
                        }
                        jMin = time;
                        j10 = 0;
                        i10 = c9085cM17286b2.f47388c;
                        if (i10 != -1) {
                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                        }
                        i11 = c9085cM17286b2.f47394i;
                        if (i11 != -1) {
                            millis = TimeUnit.SECONDS.toMillis(i11);
                        } else {
                            millis = j10;
                        }
                        if (c9085cM17349a.f47392g) {
                            millis2 = j10;
                        } else {
                            millis2 = j10;
                        }
                        if (c9085cM17349a.f47386a) {
                            j11 = millis + j12;
                            if (j11 < millis2 + jMin) {
                                aVar = new C9106x.a(c9106xM17352a);
                                if (j11 >= jMin) {
                                    aVar.f47580f.m17311a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j12 > 86400000) {
                                    if (c9106xM17352a.m17349a().f47388c == -1) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        aVar.f47580f.m17311a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                c9600d = new C9600d(null, aVar.m17352a());
                                c9101s3 = c9101s3;
                            } else {
                                if (str != null) {
                                    str6 = "If-None-Match";
                                    str5 = str;
                                } else {
                                    if (dateM19222a3 != null) {
                                        str4 = str2;
                                    } else if (dateM19222a != null) {
                                        str4 = str3;
                                    } else {
                                        c9101s3 = c9101s3;
                                        c9600d = new C9600d(c9101s3, null);
                                    }
                                    str5 = str4;
                                    str6 = "If-Modified-Since";
                                }
                                C9095m.a aVarM17307g8 = c9101s3.f47544c.m17307g();
                                C5207g.m11108c(str5);
                                aVarM17307g8.m17313c(str6, str5);
                                new LinkedHashMap();
                                c9096n = c9101s3.f47542a;
                                str7 = c9101s3.f47543b;
                                abstractC9105w = c9101s3.f47545d;
                                map = c9101s3.f47546e;
                                if (map.isEmpty()) {
                                    linkedHashMapM13467T0 = new LinkedHashMap();
                                } else {
                                    linkedHashMapM13467T0 = C6753d.m13467T0(map);
                                }
                                c9101s3.f47544c.m17307g();
                                aVarM17307g = aVarM17307g8.m17314d().m17307g();
                                if (c9096n != null) {
                                    throw new IllegalStateException("url == null".toString());
                                }
                                C9095m c9095mM17314d7 = aVarM17307g.m17314d();
                                byte[] bArr7 = C9347b.f48082a;
                                if (linkedHashMapM13467T0.isEmpty()) {
                                    mapUnmodifiableMap = C6753d.m13459L0();
                                } else {
                                    mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                    C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                }
                                c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d7, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                                c9600d = c9600d2;
                            }
                        } else {
                            if (str != null) {
                                str6 = "If-None-Match";
                                str5 = str;
                            } else {
                                if (dateM19222a3 != null) {
                                    str4 = str2;
                                } else if (dateM19222a != null) {
                                    str4 = str3;
                                } else {
                                    c9101s3 = c9101s3;
                                    c9600d = new C9600d(c9101s3, null);
                                }
                                str5 = str4;
                                str6 = "If-Modified-Since";
                            }
                            C9095m.a aVarM17307g9 = c9101s3.f47544c.m17307g();
                            C5207g.m11108c(str5);
                            aVarM17307g9.m17313c(str6, str5);
                            new LinkedHashMap();
                            c9096n = c9101s3.f47542a;
                            str7 = c9101s3.f47543b;
                            abstractC9105w = c9101s3.f47545d;
                            map = c9101s3.f47546e;
                            if (map.isEmpty()) {
                                linkedHashMapM13467T0 = new LinkedHashMap();
                            } else {
                                linkedHashMapM13467T0 = C6753d.m13467T0(map);
                            }
                            c9101s3.f47544c.m17307g();
                            aVarM17307g = aVarM17307g9.m17314d().m17307g();
                            if (c9096n != null) {
                                throw new IllegalStateException("url == null".toString());
                            }
                            C9095m c9095mM17314d8 = aVarM17307g.m17314d();
                            byte[] bArr8 = C9347b.f48082a;
                            if (linkedHashMapM13467T0.isEmpty()) {
                                mapUnmodifiableMap = C6753d.m13459L0();
                            } else {
                                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMapM13467T0));
                                C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                            }
                            c9600d2 = new C9600d(new C9101s(c9096n, str7, c9095mM17314d8, abstractC9105w, mapUnmodifiableMap), c9106xM17352a);
                            c9600d = c9600d2;
                        }
                    }
                }
            } else {
                c9600d2 = new C9600d(c9101s3, null);
            }
            if (c9600d.f49271a == null) {
                dVar = 0;
            } else {
                c9085cM17286b = c9101s3.f47547f;
                if (c9085cM17286b == null) {
                    int i20 = C9085c.f47385n;
                    c9085cM17286b = C9085c.b.m17286b(c9101s3.f47544c);
                    c9101s3.f47547f = c9085cM17286b;
                }
                if (c9085cM17286b.f47395j) {
                    dVar = 0;
                    c9600d = new C9600d(null, null);
                } else {
                    dVar = 0;
                }
            }
            c9101s = c9600d.f49271a;
            c9106x = c9600d.f49272b;
            c8072a = this.f49266a;
            if (c8072a != null) {
                synchronized (c8072a) {
                    if (c9600d.f49271a != null) {
                        C9106x c9106x2 = c9600d.f49272b;
                    }
                }
            }
            if (c9990e instanceof C9990e) {
                r10 = c9990e;
            } else {
                r10 = dVar;
            }
            if (r10 == 0) {
                r11 = dVar;
            } else {
                abstractC9093k = r10.f50778e;
            }
            if (r11 == 0) {
                r11 = abstractC9093k;
                r11 = AbstractC9093k.f47445a;
            }
            if (c9106xM17352a != null && c9106x == null && (abstractC9107y4 = c9106xM17352a.f47569g) != null) {
                C9347b.m17697d(abstractC9107y4);
            }
            if (c9101s != null && c9106x == null) {
                C9106x.a aVar5 = new C9106x.a();
                C9101s c9101s4 = c10266f.f51701e;
                C5207g.m11111f(c9101s4, "request");
                aVar5.f47575a = c9101s4;
                Protocol protocol2 = Protocol.HTTP_1_1;
                C5207g.m11111f(protocol2, "protocol");
                aVar5.f47576b = protocol2;
                aVar5.f47577c = 504;
                aVar5.f47578d = "Unsatisfiable Request (only-if-cached)";
                aVar5.f47581g = C9347b.f48084c;
                aVar5.f47585k = -1L;
                aVar5.f47586l = System.currentTimeMillis();
                C9106x c9106xM17352a4 = aVar5.m17352a();
                r11.getClass();
                C5207g.m11111f(c9990e, "call");
                return c9106xM17352a4;
            }
            if (c9101s == null) {
                C5207g.m11108c(c9106x);
                C9106x.a aVar6 = new C9106x.a(c9106x);
                C9106x c9106xM18068a = a.m18068a(c9106x);
                C9106x.a.m17351b("cacheResponse", c9106xM18068a);
                aVar6.f47583i = c9106xM18068a;
                C9106x c9106xM17352a5 = aVar6.m17352a();
                r11.getClass();
                C5207g.m11111f(c9990e, "call");
                return c9106xM17352a5;
            }
            if (c9106x == null || this.f49266a != null) {
                r11.getClass();
                C5207g.m11111f(c9990e, "call");
            }
            try {
                c9106xM19235c = c10266f.m19235c(c9101s);
                if (c9106x != null) {
                    if (c9106xM19235c.f47566d == 304) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        C9106x.a aVar7 = new C9106x.a(c9106x);
                        c9095m = c9106x.f47568f;
                        c9095m2 = c9106xM19235c.f47568f;
                        aVar2 = new C9095m.a();
                        length = c9095m.f47452a.length / 2;
                        i13 = 0;
                        while (i13 < length) {
                            int i21 = i13 + 1;
                            strM17306f2 = c9095m.m17306f(i13);
                            strM17309l = c9095m.m17309l(i13);
                            if (C7661i.m15249O2("Warning", strM17306f2)) {
                                z15 = false;
                                if (C7661i.m15256V2(strM17309l, "1", false)) {
                                }
                                i13 = i21;
                            } else {
                                z15 = false;
                            }
                            if (!C7661i.m15249O2("Content-Length", strM17306f2) || C7661i.m15249O2("Content-Encoding", strM17306f2) || C7661i.m15249O2("Content-Type", strM17306f2)) {
                                z16 = true;
                            } else {
                                z16 = z15;
                            }
                            if (z16 || !a.m18069b(strM17306f2) || c9095m2.m17305a(strM17306f2) == null) {
                                aVar2.m17313c(strM17306f2, strM17309l);
                            }
                            i13 = i21;
                        }
                        length2 = c9095m2.f47452a.length / 2;
                        i14 = 0;
                        while (i14 < length2) {
                            int i22 = i14 + 1;
                            strM17306f = c9095m2.m17306f(i14);
                            if (!C7661i.m15249O2("Content-Length", strM17306f) || C7661i.m15249O2("Content-Encoding", strM17306f) || C7661i.m15249O2("Content-Type", strM17306f)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14 && a.m18069b(strM17306f)) {
                                aVar2.m17313c(strM17306f, c9095m2.m17309l(i14));
                            }
                            i14 = i22;
                        }
                        aVar7.m17353c(aVar2.m17314d());
                        aVar7.f47585k = c9106xM19235c.f47573k;
                        aVar7.f47586l = c9106xM19235c.f47574l;
                        C9106x c9106xM18068a2 = a.m18068a(c9106x);
                        C9106x.a.m17351b("cacheResponse", c9106xM18068a2);
                        aVar7.f47583i = c9106xM18068a2;
                        C9106x c9106xM18068a3 = a.m18068a(c9106xM19235c);
                        C9106x.a.m17351b("networkResponse", c9106xM18068a3);
                        aVar7.f47582h = c9106xM18068a3;
                        c9106xM17352a3 = aVar7.m17352a();
                        AbstractC9107y abstractC9107y6 = c9106xM19235c.f47569g;
                        C5207g.m11108c(abstractC9107y6);
                        abstractC9107y6.close();
                        c8072a2 = this.f49266a;
                        C5207g.m11108c(c8072a2);
                        synchronized (c8072a2) {
                        }
                        this.f49266a.getClass();
                        cVar = new C8072a.c(c9106xM17352a3);
                        abstractC9107y3 = c9106x.f47569g;
                        if (abstractC9107y3 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                        }
                        DiskLruCache.C8075b c8075b = ((C8072a.a) abstractC9107y3).f43783b;
                        try {
                            dVar = c8075b.f43856d.m15960l(c8075b.f43853a, c8075b.f43854b);
                            if (dVar == 0) {
                                cVar.m15947c(dVar);
                                dVar.m15965b();
                            }
                        } catch (IOException unused3) {
                            if (dVar != 0) {
                                try {
                                    dVar.m15964a();
                                } catch (IOException unused4) {
                                }
                            }
                        }
                        r11.getClass();
                        C5207g.m11111f(c9990e, "call");
                        return c9106xM17352a3;
                    }
                    z11 = false;
                    abstractC9107y2 = c9106x.f47569g;
                    if (abstractC9107y2 != null) {
                        C9347b.m17697d(abstractC9107y2);
                    }
                } else {
                    z11 = false;
                }
                C9106x.a aVar8 = new C9106x.a(c9106xM19235c);
                C9106x c9106xM18068a4 = a.m18068a(c9106x);
                C9106x.a.m17351b("cacheResponse", c9106xM18068a4);
                aVar8.f47583i = c9106xM18068a4;
                C9106x c9106xM18068a5 = a.m18068a(c9106xM19235c);
                C9106x.a.m17351b("networkResponse", c9106xM18068a5);
                aVar8.f47582h = c9106xM18068a5;
                c9106xM17352a2 = aVar8.m17352a();
                if (this.f49266a != null) {
                    if (!C10265e.m19231a(c9106xM17352a2) && C9600d.a.m18070a(c9101s, c9106xM17352a2)) {
                        C8072a c8072a4 = this.f49266a;
                        c8072a4.getClass();
                        C9101s c9101s5 = c9106xM17352a2.f47563a;
                        String str12 = c9101s5.f47543b;
                        C5207g.m11111f(str12, "method");
                        if (C5207g.m11106a(str12, "POST") || C5207g.m11106a(str12, "PATCH") || C5207g.m11106a(str12, "PUT") || C5207g.m11106a(str12, "DELETE") || C5207g.m11106a(str12, "MOVE")) {
                            z11 = true;
                        }
                        try {
                            if (!z11) {
                                if (C5207g.m11106a(str12, "GET") && !C8072a.b.m15944c(c9106xM17352a2.f47568f).contains("*")) {
                                    ?? cVar3 = new C8072a.c(c9106xM17352a2);
                                    try {
                                        DiskLruCache diskLruCache = c8072a4.f43782a;
                                        String strM15942a = C8072a.b.m15942a(c9101s5.f47542a);
                                        Regex regex = DiskLruCache.f43811Q;
                                        M15960l = diskLruCache.m15960l(strM15942a, -1L);
                                        if (M15960l != 0) {
                                            try {
                                                cVar3.m15947c(M15960l);
                                                dVar = c8072a4.new d(M15960l);
                                            } catch (IOException unused5) {
                                                if (M15960l != 0) {
                                                    M15960l.m15964a();
                                                }
                                            }
                                        }
                                    } catch (IOException unused6) {
                                        M15960l = dVar;
                                    }
                                }
                                if (dVar != 0) {
                                    C8072a.d.a aVar9 = dVar.f43803c;
                                    AbstractC9107y abstractC9107y7 = c9106xM17352a2.f47569g;
                                    C5207g.m11108c(abstractC9107y7);
                                    C9598b c9598b = new C9598b(abstractC9107y7.mo13138q(), dVar, C5617n.m11990b(aVar9));
                                    String strM17348b = C9106x.m17348b(c9106xM17352a2, "Content-Type");
                                    long jMo13136b = c9106xM17352a2.f47569g.mo13136b();
                                    C9106x.a aVar10 = new C9106x.a(c9106xM17352a2);
                                    aVar10.f47581g = new C10267g(strM17348b, jMo13136b, C5617n.m11991c(c9598b));
                                    c9106xM17352a2 = aVar10.m17352a();
                                }
                                if (c9106x != null) {
                                    r11.getClass();
                                    C5207g.m11111f(c9990e, "call");
                                }
                                return c9106xM17352a2;
                            }
                            c8072a4.m15941a(c9101s5);
                        } catch (IOException unused7) {
                        }
                        if (dVar != 0) {
                            C8072a.d.a aVar11 = dVar.f43803c;
                            AbstractC9107y abstractC9107y8 = c9106xM17352a2.f47569g;
                            C5207g.m11108c(abstractC9107y8);
                            C9598b c9598b2 = new C9598b(abstractC9107y8.mo13138q(), dVar, C5617n.m11990b(aVar11));
                            String strM17348b2 = C9106x.m17348b(c9106xM17352a2, "Content-Type");
                            long jMo13136b2 = c9106xM17352a2.f47569g.mo13136b();
                            C9106x.a aVar12 = new C9106x.a(c9106xM17352a2);
                            aVar12.f47581g = new C10267g(strM17348b2, jMo13136b2, C5617n.m11991c(c9598b2));
                            c9106xM17352a2 = aVar12.m17352a();
                        }
                        if (c9106x != null) {
                            r11.getClass();
                            C5207g.m11111f(c9990e, "call");
                        }
                        return c9106xM17352a2;
                    }
                    str8 = c9101s.f47543b;
                    C5207g.m11111f(str8, "method");
                    if (!C5207g.m11106a(str8, "POST") || C5207g.m11106a(str8, "PATCH") || C5207g.m11106a(str8, "PUT") || C5207g.m11106a(str8, "DELETE") || C5207g.m11106a(str8, "MOVE")) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        try {
                            this.f49266a.m15941a(c9101s);
                        } catch (IOException unused8) {
                        }
                    }
                }
                return c9106xM17352a2;
            } catch (Throwable th2) {
                if (c9106xM17352a == null || (abstractC9107y = c9106xM17352a.f47569g) == null) {
                    throw th2;
                }
                C9347b.m17697d(abstractC9107y);
                throw th2;
            }
        }
        c9600d2 = new C9600d(c9101s3, null);
        c9101s3 = c9101s3;
        c9600d = c9600d2;
        if (c9600d.f49271a == null) {
            dVar = 0;
        } else {
            c9085cM17286b = c9101s3.f47547f;
            if (c9085cM17286b == null) {
                int i23 = C9085c.f47385n;
                c9085cM17286b = C9085c.b.m17286b(c9101s3.f47544c);
                c9101s3.f47547f = c9085cM17286b;
            }
            if (c9085cM17286b.f47395j) {
                dVar = 0;
                c9600d = new C9600d(null, null);
            } else {
                dVar = 0;
            }
        }
        c9101s = c9600d.f49271a;
        c9106x = c9600d.f49272b;
        c8072a = this.f49266a;
        if (c8072a != null) {
            synchronized (c8072a) {
                if (c9600d.f49271a != null) {
                    C9106x c9106x3 = c9600d.f49272b;
                }
            }
        }
        if (c9990e instanceof C9990e) {
            r10 = c9990e;
        } else {
            r10 = dVar;
        }
        if (r10 == 0) {
            r11 = dVar;
        } else {
            abstractC9093k = r10.f50778e;
        }
        if (r11 == 0) {
            r11 = abstractC9093k;
            r11 = AbstractC9093k.f47445a;
        }
        if (c9106xM17352a != null) {
            C9347b.m17697d(abstractC9107y4);
        }
        if (c9101s != null) {
        }
        if (c9101s == null) {
            C5207g.m11108c(c9106x);
            C9106x.a aVar13 = new C9106x.a(c9106x);
            C9106x c9106xM18068a6 = a.m18068a(c9106x);
            C9106x.a.m17351b("cacheResponse", c9106xM18068a6);
            aVar13.f47583i = c9106xM18068a6;
            C9106x c9106xM17352a6 = aVar13.m17352a();
            r11.getClass();
            C5207g.m11111f(c9990e, "call");
            return c9106xM17352a6;
        }
        if (c9106x == null) {
            r11.getClass();
            C5207g.m11111f(c9990e, "call");
        } else {
            r11.getClass();
            C5207g.m11111f(c9990e, "call");
        }
        c9106xM19235c = c10266f.m19235c(c9101s);
        if (c9106x != null) {
            if (c9106xM19235c.f47566d == 304) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                C9106x.a aVar14 = new C9106x.a(c9106x);
                c9095m = c9106x.f47568f;
                c9095m2 = c9106xM19235c.f47568f;
                aVar2 = new C9095m.a();
                length = c9095m.f47452a.length / 2;
                i13 = 0;
                while (i13 < length) {
                    int i24 = i13 + 1;
                    strM17306f2 = c9095m.m17306f(i13);
                    strM17309l = c9095m.m17309l(i13);
                    if (C7661i.m15249O2("Warning", strM17306f2)) {
                        z15 = false;
                        if (C7661i.m15256V2(strM17309l, "1", false)) {
                        }
                        i13 = i24;
                    } else {
                        z15 = false;
                    }
                    if (C7661i.m15249O2("Content-Length", strM17306f2)) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        aVar2.m17313c(strM17306f2, strM17309l);
                    } else {
                        aVar2.m17313c(strM17306f2, strM17309l);
                    }
                    i13 = i24;
                }
                length2 = c9095m2.f47452a.length / 2;
                i14 = 0;
                while (i14 < length2) {
                    int i25 = i14 + 1;
                    strM17306f = c9095m2.m17306f(i14);
                    if (C7661i.m15249O2("Content-Length", strM17306f)) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                    }
                    i14 = i25;
                }
                aVar14.m17353c(aVar2.m17314d());
                aVar14.f47585k = c9106xM19235c.f47573k;
                aVar14.f47586l = c9106xM19235c.f47574l;
                C9106x c9106xM18068a7 = a.m18068a(c9106x);
                C9106x.a.m17351b("cacheResponse", c9106xM18068a7);
                aVar14.f47583i = c9106xM18068a7;
                C9106x c9106xM18068a8 = a.m18068a(c9106xM19235c);
                C9106x.a.m17351b("networkResponse", c9106xM18068a8);
                aVar14.f47582h = c9106xM18068a8;
                c9106xM17352a3 = aVar14.m17352a();
                AbstractC9107y abstractC9107y9 = c9106xM19235c.f47569g;
                C5207g.m11108c(abstractC9107y9);
                abstractC9107y9.close();
                c8072a2 = this.f49266a;
                C5207g.m11108c(c8072a2);
                synchronized (c8072a2) {
                    this.f49266a.getClass();
                    cVar = new C8072a.c(c9106xM17352a3);
                    abstractC9107y3 = c9106x.f47569g;
                    if (abstractC9107y3 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    }
                    DiskLruCache.C8075b c8075b2 = ((C8072a.a) abstractC9107y3).f43783b;
                    dVar = c8075b2.f43856d.m15960l(c8075b2.f43853a, c8075b2.f43854b);
                    if (dVar == 0) {
                        cVar.m15947c(dVar);
                        dVar.m15965b();
                    }
                    r11.getClass();
                    C5207g.m11111f(c9990e, "call");
                    return c9106xM17352a3;
                }
            }
            z11 = false;
            abstractC9107y2 = c9106x.f47569g;
            if (abstractC9107y2 != null) {
                C9347b.m17697d(abstractC9107y2);
            }
        } else {
            z11 = false;
        }
        C9106x.a aVar15 = new C9106x.a(c9106xM19235c);
        C9106x c9106xM18068a9 = a.m18068a(c9106x);
        C9106x.a.m17351b("cacheResponse", c9106xM18068a9);
        aVar15.f47583i = c9106xM18068a9;
        C9106x c9106xM18068a10 = a.m18068a(c9106xM19235c);
        C9106x.a.m17351b("networkResponse", c9106xM18068a10);
        aVar15.f47582h = c9106xM18068a10;
        c9106xM17352a2 = aVar15.m17352a();
        if (this.f49266a != null) {
            if (!C10265e.m19231a(c9106xM17352a2)) {
            }
            str8 = c9101s.f47543b;
            C5207g.m11111f(str8, "method");
            if (C5207g.m11106a(str8, "POST")) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (z12) {
                this.f49266a.m15941a(c9101s);
            }
        }
        return c9106xM17352a2;
    }
}
