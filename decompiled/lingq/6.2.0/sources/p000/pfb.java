package p000;

import android.util.Log;
import com.google.android.gms.measurement.internal.C1045d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class pfb {

    /* JADX INFO: renamed from: a */
    public final String f56068a;

    /* JADX INFO: renamed from: b */
    public final int f56069b;

    /* JADX INFO: renamed from: c */
    public Boolean f56070c;

    /* JADX INFO: renamed from: d */
    public Boolean f56071d;

    /* JADX INFO: renamed from: e */
    public Long f56072e;

    /* JADX INFO: renamed from: f */
    public Long f56073f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f56074g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ mhb f56075h;

    /* JADX INFO: renamed from: i */
    public final whb f56076i;

    public pfb(mhb mhbVar, String str, int i, whb whbVar, int i2) {
        this.f56074g = i2;
        this.f56075h = mhbVar;
        this.f56068a = str;
        this.f56069b = i;
        this.f56076i = whbVar;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m19115c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static Boolean m19116d(String str, u7c u7cVar, xcc xccVar) {
        List listM22529x;
        lda.m16130p(u7cVar);
        if (str != null && u7cVar.m22524s() && u7cVar.m22523A() != 1 && (u7cVar.m22523A() != 7 ? u7cVar.m22525t() : u7cVar.m22530y() != 0)) {
            int iM22523A = u7cVar.m22523A();
            boolean zM22528w = u7cVar.m22528w();
            String strM22526u = (zM22528w || iM22523A == 2 || iM22523A == 7) ? u7cVar.m22526u() : u7cVar.m22526u().toUpperCase(Locale.ENGLISH);
            if (u7cVar.m22530y() == 0) {
                listM22529x = null;
            } else {
                listM22529x = u7cVar.m22529x();
                if (!zM22528w) {
                    ArrayList arrayList = new ArrayList(listM22529x.size());
                    Iterator it = listM22529x.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM22529x = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iM22523A == 2 ? strM22526u : null;
            if (iM22523A != 7 ? strM22526u != null : listM22529x != null && !listM22529x.isEmpty()) {
                if (!zM22528w && iM22523A != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM22523A - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zM22528w ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (xccVar != null) {
                                    xccVar.f68083i.m17924b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strM22526u));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strM22526u));
                    case 4:
                        return Boolean.valueOf(str.contains(strM22526u));
                    case 5:
                        return Boolean.valueOf(str.equals(strM22526u));
                    case 6:
                        if (listM22529x != null) {
                            return Boolean.valueOf(listM22529x.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX INFO: renamed from: e */
    public static Boolean m19117e(BigDecimal bigDecimal, w6c w6cVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        lda.m16130p(w6cVar);
        if (w6cVar.m23784s()) {
            if (w6cVar.m23783C() != 1 && (w6cVar.m23783C() != 5 ? w6cVar.m23787v() : w6cVar.m23789x() && w6cVar.m23791z())) {
                int iM23783C = w6cVar.m23783C();
                try {
                    if (w6cVar.m23783C() == 5) {
                        if (dad.m10235h0(w6cVar.m23790y()) && dad.m10235h0(w6cVar.m23782A())) {
                            BigDecimal bigDecimal5 = new BigDecimal(w6cVar.m23790y());
                            bigDecimal4 = new BigDecimal(w6cVar.m23782A());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iM23783C == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iM23783C - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (dad.m10235h0(w6cVar.m23788w())) {
                        bigDecimal2 = new BigDecimal(w6cVar.m23788w());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iM23783C == 5) {
                            i = iM23783C - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iM23783C - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public boolean m19118a(Long l, Long l2, ohc ohcVar, long j, zob zobVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        C3275kv c3275kv;
        Iterator it2;
        Iterator it3;
        u5c u5cVar;
        boolean z2;
        String strM22502z;
        Object obj;
        Boolean boolM19117e;
        Boolean boolM19117e2;
        String str;
        w6c w6cVarM22498v;
        long j2;
        Boolean boolM19117e3;
        fic ficVar;
        Long lValueOf;
        Double dValueOf;
        u5c u5cVar2;
        Boolean boolM19117e4;
        int i;
        mkb.m16883a();
        mhb mhbVar = this.f56075h;
        kjc kjcVar = (kjc) mhbVar.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        xcc xccVar = kjcVar.f47438f;
        rbc rbcVar = kjcVar.f47442j;
        t8c t8cVar = z8c.f71112F0;
        String str2 = this.f56068a;
        boolean zM4869O = cmbVar.m4869O(str2, t8cVar);
        k5c k5cVar = (k5c) this.f56076i;
        long j3 = k5cVar.m14865D() ? zobVar.f71916e : j;
        kjc.m15280l(xccVar);
        occ occVar = xccVar.f68076I;
        occ occVar2 = xccVar.f68083i;
        boolean zIsLoggable = Log.isLoggable(xccVar.m24457N(), 2);
        int i2 = this.f56069b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            kjc.m15280l(xccVar);
            occVar.m17926d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), k5cVar.m14868s() ? Integer.valueOf(k5cVar.m14869t()) : null, rbcVar.m20572a(k5cVar.m14870u()));
            kjc.m15280l(xccVar);
            dad dadVar = mhbVar.f55716b.f12367g;
            C1045d.m5885T(dadVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (k5cVar.m14868s()) {
                i = 0;
                dad.m10233Y(sb, 0, "filter_id", Integer.valueOf(k5cVar.m14869t()));
            } else {
                i = 0;
            }
            dad.m10233Y(sb, i, "event_name", ((kjc) dadVar.f60774a).f47442j.m20572a(k5cVar.m14870u()));
            String strM10229U = dad.m10229U(k5cVar.m14862A(), k5cVar.m14863B(), k5cVar.m14865D());
            if (!strM10229U.isEmpty()) {
                dad.m10233Y(sb, 0, "filter_type", strM10229U);
            }
            if (k5cVar.m14874y()) {
                dad.m10234Z(sb, 1, "event_count_filter", k5cVar.m14875z());
            }
            if (k5cVar.m14872w() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = k5cVar.m14871v().iterator();
                while (it4.hasNext()) {
                    dadVar.m10245R(sb, 2, (u5c) it4.next());
                }
            }
            dad.m10227S(1, sb);
            sb.append("}\n}\n");
            occVar.m17924b(sb.toString(), "Filter definition");
        }
        if (!k5cVar.m14868s() || k5cVar.m14869t() > 256) {
            kjc.m15280l(xccVar);
            occVar2.m17925c("Invalid event filter ID. appId, id", xcc.m24449L(str2), String.valueOf(k5cVar.m14868s() ? Integer.valueOf(k5cVar.m14869t()) : null));
            return false;
        }
        boolean z3 = k5cVar.m14862A() || k5cVar.m14863B() || k5cVar.m14865D();
        if (z && !z3) {
            kjc.m15280l(xccVar);
            occVar.m17925c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), k5cVar.m14868s() ? Integer.valueOf(k5cVar.m14869t()) : null);
            return true;
        }
        String strM18026x = ohcVar.m18026x();
        if (!k5cVar.m14874y()) {
            hashSet = new HashSet();
            it = k5cVar.m14871v().iterator();
            while (true) {
                if (it.hasNext()) {
                    c3275kv = new C3275kv(0);
                    it2 = ohcVar.m18023u().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = k5cVar.m14871v().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zM4869O = zM4869O;
                                    xccVar = xccVar;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                u5cVar = (u5c) it3.next();
                                if (u5cVar.m22499w()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strM22502z = u5cVar.m22502z();
                                if (strM22502z.isEmpty()) {
                                    obj = c3275kv.get(strM22502z);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zM4869O = zM4869O;
                                                xccVar = xccVar;
                                                if (obj == null) {
                                                    kjc.m15280l(xccVar);
                                                    occVar2.m17925c("Unknown param type. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                    break;
                                                }
                                                kjc.m15280l(xccVar);
                                                occVar.m17925c("Missing param for filter. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (u5cVar.m22495s()) {
                                                if (u5cVar.m22497u()) {
                                                    zM4869O = zM4869O;
                                                    xccVar = xccVar;
                                                    kjc.m15280l(xccVar);
                                                    occVar2.m17925c("No filter for String param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (dad.m10235h0(str)) {
                                                    zM4869O = zM4869O;
                                                    xccVar = xccVar;
                                                    kjc.m15280l(xccVar);
                                                    occVar2.m17925c("Invalid param value for number filter. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                    break;
                                                }
                                                w6cVarM22498v = u5cVar.m22498v();
                                                if (dad.m10235h0(str)) {
                                                    zM4869O = zM4869O;
                                                    xccVar = xccVar;
                                                    j2 = 0;
                                                    boolM19117e3 = m19117e(new BigDecimal(str), w6cVarM22498v, 0.0d);
                                                } else {
                                                    boolM19117e3 = null;
                                                }
                                                if (boolM19117e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM19117e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                xccVar = xccVar;
                                                zM4869O = zM4869O;
                                            } else {
                                                u7c u7cVarM22496t = u5cVar.m22496t();
                                                kjc.m15280l(xccVar);
                                                boolM19117e3 = m19116d((String) obj, u7cVarM22496t, xccVar);
                                            }
                                            j2 = 0;
                                            if (boolM19117e3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolM19117e3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            xccVar = xccVar;
                                            zM4869O = zM4869O;
                                        } else if (u5cVar.m22497u()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolM19117e2 = m19117e(new BigDecimal(dDoubleValue), u5cVar.m22498v(), Math.ulp(dDoubleValue));
                                            if (boolM19117e2 != null) {
                                                if (boolM19117e2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            kjc.m15280l(xccVar);
                                            occVar2.m17925c("No number filter for double param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                        }
                                    } else if (u5cVar.m22497u()) {
                                        boolM19117e = m19117e(new BigDecimal(((Long) obj).longValue()), u5cVar.m22498v(), 0.0d);
                                        if (boolM19117e != null) {
                                            if (boolM19117e.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        kjc.m15280l(xccVar);
                                        occVar2.m17925c("No number filter for long param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                    }
                                } else {
                                    kjc.m15280l(xccVar);
                                    occVar2.m17924b(rbcVar.m20572a(strM18026x), "Event has empty param name. event");
                                }
                            }
                        } else {
                            ficVar = (fic) it2.next();
                            if (!hashSet.contains(ficVar.m11877t())) {
                                if (ficVar.m11880w()) {
                                    String strM11877t = ficVar.m11877t();
                                    if (ficVar.m11880w()) {
                                        lValueOf = Long.valueOf(ficVar.m11881x());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c3275kv.put(strM11877t, lValueOf);
                                } else if (ficVar.m11862A()) {
                                    String strM11877t2 = ficVar.m11877t();
                                    if (ficVar.m11862A()) {
                                        dValueOf = Double.valueOf(ficVar.m11863B());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c3275kv.put(strM11877t2, dValueOf);
                                } else if (ficVar.m11878u()) {
                                    c3275kv.put(ficVar.m11877t(), ficVar.m11879v());
                                } else {
                                    kjc.m15280l(xccVar);
                                    occVar2.m17925c("Unknown value for param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(ficVar.m11877t()));
                                }
                            }
                        }
                    }
                } else {
                    u5cVar2 = (u5c) it.next();
                    if (u5cVar2.m22502z().isEmpty()) {
                        kjc.m15280l(xccVar);
                        occVar2.m17924b(rbcVar.m20572a(strM18026x), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(u5cVar2.m22502z());
                    }
                }
                zM4869O = zM4869O;
                xccVar = xccVar;
                break;
            }
        }
        try {
            boolM19117e4 = m19117e(new BigDecimal(j3), k5cVar.m14875z(), 0.0d);
        } catch (NumberFormatException unused) {
            boolM19117e4 = null;
        }
        if (boolM19117e4 != null) {
            if (boolM19117e4.booleanValue()) {
                hashSet = new HashSet();
                it = k5cVar.m14871v().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c3275kv = new C3275kv(0);
                        it2 = ohcVar.m18023u().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = k5cVar.m14871v().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zM4869O = zM4869O;
                                        xccVar = xccVar;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    u5cVar = (u5c) it3.next();
                                    if (u5cVar.m22499w() || !u5cVar.m22500x()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strM22502z = u5cVar.m22502z();
                                    if (strM22502z.isEmpty()) {
                                        obj = c3275kv.get(strM22502z);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zM4869O = zM4869O;
                                                    xccVar = xccVar;
                                                    if (obj == null) {
                                                        kjc.m15280l(xccVar);
                                                        occVar2.m17925c("Unknown param type. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                        break;
                                                    }
                                                    kjc.m15280l(xccVar);
                                                    occVar.m17925c("Missing param for filter. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (u5cVar.m22495s()) {
                                                    if (u5cVar.m22497u()) {
                                                        zM4869O = zM4869O;
                                                        xccVar = xccVar;
                                                        kjc.m15280l(xccVar);
                                                        occVar2.m17925c("No filter for String param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (dad.m10235h0(str)) {
                                                        zM4869O = zM4869O;
                                                        xccVar = xccVar;
                                                        kjc.m15280l(xccVar);
                                                        occVar2.m17925c("Invalid param value for number filter. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                                        break;
                                                    }
                                                    w6cVarM22498v = u5cVar.m22498v();
                                                    if (dad.m10235h0(str)) {
                                                        boolM19117e3 = null;
                                                    } else {
                                                        try {
                                                            zM4869O = zM4869O;
                                                            xccVar = xccVar;
                                                            j2 = 0;
                                                            try {
                                                                boolM19117e3 = m19117e(new BigDecimal(str), w6cVarM22498v, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolM19117e3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zM4869O = zM4869O;
                                                            xccVar = xccVar;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolM19117e3 != null) {
                                                        break;
                                                    }
                                                    if (boolM19117e3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    xccVar = xccVar;
                                                    zM4869O = zM4869O;
                                                } else {
                                                    u7c u7cVarM22496t2 = u5cVar.m22496t();
                                                    kjc.m15280l(xccVar);
                                                    boolM19117e3 = m19116d((String) obj, u7cVarM22496t2, xccVar);
                                                }
                                                j2 = 0;
                                                if (boolM19117e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM19117e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                xccVar = xccVar;
                                                zM4869O = zM4869O;
                                            } else if (u5cVar.m22497u()) {
                                                kjc.m15280l(xccVar);
                                                occVar2.m17925c("No number filter for double param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolM19117e2 = m19117e(new BigDecimal(dDoubleValue2), u5cVar.m22498v(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolM19117e2 = null;
                                                }
                                                if (boolM19117e2 != null) {
                                                    if (boolM19117e2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (u5cVar.m22497u()) {
                                            kjc.m15280l(xccVar);
                                            occVar2.m17925c("No number filter for long param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(strM22502z));
                                        } else {
                                            try {
                                                boolM19117e = m19117e(new BigDecimal(((Long) obj).longValue()), u5cVar.m22498v(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolM19117e = null;
                                            }
                                            if (boolM19117e != null) {
                                                if (boolM19117e.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        kjc.m15280l(xccVar);
                                        occVar2.m17924b(rbcVar.m20572a(strM18026x), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                ficVar = (fic) it2.next();
                                if (!hashSet.contains(ficVar.m11877t())) {
                                    if (ficVar.m11880w()) {
                                        String strM11877t3 = ficVar.m11877t();
                                        if (ficVar.m11880w()) {
                                            lValueOf = Long.valueOf(ficVar.m11881x());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c3275kv.put(strM11877t3, lValueOf);
                                    } else if (ficVar.m11862A()) {
                                        String strM11877t4 = ficVar.m11877t();
                                        if (ficVar.m11862A()) {
                                            dValueOf = Double.valueOf(ficVar.m11863B());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c3275kv.put(strM11877t4, dValueOf);
                                    } else if (ficVar.m11878u()) {
                                        c3275kv.put(ficVar.m11877t(), ficVar.m11879v());
                                    } else {
                                        kjc.m15280l(xccVar);
                                        occVar2.m17925c("Unknown value for param. event, param", rbcVar.m20572a(strM18026x), rbcVar.m20573b(ficVar.m11877t()));
                                    }
                                }
                            }
                        }
                    } else {
                        u5cVar2 = (u5c) it.next();
                        if (u5cVar2.m22502z().isEmpty()) {
                            kjc.m15280l(xccVar);
                            occVar2.m17924b(rbcVar.m20572a(strM18026x), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(u5cVar2.m22502z());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zM4869O = zM4869O;
        xccVar = xccVar;
        break;
        kjc.m15280l(xccVar);
        occVar.m17924b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f56070c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f56071d = bool2;
        if (!z3 || !ohcVar.m18027y()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(ohcVar.m18028z());
        if (k5cVar.m14863B()) {
            if (zM4869O && k5cVar.m14874y()) {
                lValueOf2 = l;
            }
            this.f56073f = lValueOf2;
            return true;
        }
        if (zM4869O && k5cVar.m14874y()) {
            lValueOf2 = l2;
        }
        this.f56072e = lValueOf2;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m19119b(Long l, Long l2, jmc jmcVar, boolean z) {
        boolean z2;
        Boolean boolM19115c;
        Boolean boolM19117e;
        Boolean boolM19117e2;
        Boolean boolM19117e3;
        mkb.m16883a();
        kjc kjcVar = (kjc) this.f56075h.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        rbc rbcVar = kjcVar.f47442j;
        xcc xccVar = kjcVar.f47438f;
        boolean zM4869O = cmbVar.m4869O(this.f56068a, z8c.f71108D0);
        f7c f7cVar = (f7c) this.f56076i;
        boolean zM11586w = f7cVar.m11586w();
        boolean zM11587x = f7cVar.m11587x();
        boolean zM11589z = f7cVar.m11589z();
        boolean z3 = zM11586w || zM11587x || zM11589z;
        if (z && !z3) {
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17925c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f56069b), f7cVar.m11582s() ? Integer.valueOf(f7cVar.m11583t()) : null);
            return true;
        }
        u5c u5cVarM11585v = f7cVar.m11585v();
        boolean zM22500x = u5cVarM11585v.m22500x();
        if (!jmcVar.m14553x()) {
            z2 = zM11589z;
            if (!jmcVar.m14538B()) {
                if (!jmcVar.m14551v()) {
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17924b(rbcVar.m20574c(jmcVar.m14550u()), "User property has no value, property");
                } else if (u5cVarM11585v.m22495s()) {
                    String strM14552w = jmcVar.m14552w();
                    u7c u7cVarM22496t = u5cVarM11585v.m22496t();
                    kjc.m15280l(xccVar);
                    boolM19115c = m19115c(m19116d(strM14552w, u7cVarM22496t, xccVar), zM22500x);
                } else if (!u5cVarM11585v.m22497u()) {
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17924b(rbcVar.m20574c(jmcVar.m14550u()), "No string or number filter defined. property");
                } else if (dad.m10235h0(jmcVar.m14552w())) {
                    String strM14552w2 = jmcVar.m14552w();
                    w6c w6cVarM22498v = u5cVarM11585v.m22498v();
                    if (dad.m10235h0(strM14552w2)) {
                        try {
                            boolM19117e = m19117e(new BigDecimal(strM14552w2), w6cVarM22498v, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolM19117e = null;
                        }
                    } else {
                        boolM19117e = null;
                    }
                    boolM19115c = m19115c(boolM19117e, zM22500x);
                } else {
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17925c("Invalid user property value for Numeric number filter. property, value", rbcVar.m20574c(jmcVar.m14550u()), jmcVar.m14552w());
                }
                boolM19115c = null;
            } else if (u5cVarM11585v.m22497u()) {
                double dM14539C = jmcVar.m14539C();
                try {
                    boolM19117e2 = m19117e(new BigDecimal(dM14539C), u5cVarM11585v.m22498v(), Math.ulp(dM14539C));
                } catch (NumberFormatException unused2) {
                    boolM19117e2 = null;
                }
                boolM19115c = m19115c(boolM19117e2, zM22500x);
            } else {
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(rbcVar.m20574c(jmcVar.m14550u()), "No number filter for double property. property");
                boolM19115c = null;
            }
        } else if (u5cVarM11585v.m22497u()) {
            z2 = zM11589z;
            try {
                boolM19117e3 = m19117e(new BigDecimal(jmcVar.m14554y()), u5cVarM11585v.m22498v(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolM19117e3 = null;
            }
            boolM19115c = m19115c(boolM19117e3, zM22500x);
        } else {
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(rbcVar.m20574c(jmcVar.m14550u()), "No number filter for long property. property");
            z2 = zM11589z;
            boolM19115c = null;
        }
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17924b(boolM19115c == null ? "null" : boolM19115c, "Property filter result");
        if (boolM19115c == null) {
            return false;
        }
        this.f56070c = Boolean.TRUE;
        if (!z2 || boolM19115c.booleanValue()) {
            if (!z || f7cVar.m11586w()) {
                this.f56071d = boolM19115c;
            }
            if (boolM19115c.booleanValue() && z3 && jmcVar.m14548s()) {
                long jM14549t = jmcVar.m14549t();
                if (l != null) {
                    jM14549t = l.longValue();
                }
                if (zM4869O && f7cVar.m11586w() && !f7cVar.m11587x() && l2 != null) {
                    jM14549t = l2.longValue();
                }
                if (f7cVar.m11587x()) {
                    this.f56073f = Long.valueOf(jM14549t);
                } else {
                    this.f56072e = Long.valueOf(jM14549t);
                }
            }
        }
        return true;
    }
}
