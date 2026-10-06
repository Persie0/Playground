package p000;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lim {

    /* JADX INFO: renamed from: b */
    private static final msa f38320b = msa.m16846b('/');

    /* JADX INFO: renamed from: c */
    private static final Pattern f38321c = Pattern.compile("^(\\*[a-z]+\\*).*");

    /* JADX INFO: renamed from: a */
    final ConcurrentHashMap f38322a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    static String m15464a(String str) {
        List listM16851f = f38320b.m16851f(str);
        return listM16851f.size() != 3 ? "MALFORMED" : (String) listM16851f.get(0);
    }

    /* JADX INFO: renamed from: b */
    final ozi m15465b(ozi oziVar) {
        ozd ozdVar = oziVar.f46958d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        if ((ozdVar.f46926a & 1) == 0) {
            return oziVar;
        }
        ozd ozdVar2 = oziVar.f46958d;
        if (ozdVar2 == null) {
            ozdVar2 = ozd.f46924d;
        }
        nxl nxlVar = (nxl) ozdVar2.m18143ad(5);
        nxlVar.m18108s(ozdVar2);
        Long l = (Long) this.f38322a.get(Long.valueOf(((ozd) nxlVar.f44974b).f46927b));
        l.getClass();
        nxl nxlVar2 = (nxl) oziVar.m18143ad(5);
        nxlVar2.m18108s(oziVar);
        long jLongValue = l.longValue();
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        ozd ozdVar3 = (ozd) nxlVar.f44974b;
        ozdVar3.f46926a |= 1;
        ozdVar3.f46927b = jLongValue;
        if (!nxlVar2.f44974b.m18142ac()) {
            nxlVar2.mo18106p();
        }
        ozi oziVar2 = (ozi) nxlVar2.f44974b;
        ozd ozdVar4 = (ozd) nxlVar.mo18103l();
        ozdVar4.getClass();
        oziVar2.f46958d = ozdVar4;
        oziVar2.f46955a |= 4;
        return (ozi) nxlVar2.mo18103l();
    }

    /* JADX INFO: renamed from: c */
    final ozi m15466c(int i, ozi oziVar) {
        ozd ozdVar = oziVar.f46958d;
        if (ozdVar == null) {
            ozdVar = ozd.f46924d;
        }
        if ((ozdVar.f46926a & 2) == 0) {
            return oziVar;
        }
        ozd ozdVar2 = oziVar.f46958d;
        if (ozdVar2 == null) {
            ozdVar2 = ozd.f46924d;
        }
        nxl nxlVar = (nxl) ozdVar2.m18143ad(5);
        nxlVar.m18108s(ozdVar2);
        nxl nxlVar2 = (nxl) oziVar.m18143ad(5);
        nxlVar2.m18108s(oziVar);
        String strGroup = ((ozd) nxlVar.f44974b).f46928c;
        Long lM17625a = nqp.m17625a(strGroup);
        lM17625a.getClass();
        long jLongValue = lM17625a.longValue();
        ConcurrentHashMap concurrentHashMap = this.f38322a;
        Long lValueOf = Long.valueOf(jLongValue);
        if (!concurrentHashMap.containsKey(lValueOf)) {
            switch (i - 1) {
                case 0:
                    Matcher matcher = f38321c.matcher(strGroup);
                    if (matcher.matches()) {
                        strGroup = !strGroup.startsWith("*sync*/") ? matcher.group(1) : "*sync*/".concat(String.valueOf(m15464a(strGroup.substring(7))));
                    }
                    break;
                case 1:
                    strGroup = m15464a(strGroup);
                    break;
                case 2:
                    strGroup = "--";
                    break;
            }
            Long lM17625a2 = nqp.m17625a(strGroup);
            if (lM17625a2 != null) {
                this.f38322a.putIfAbsent(lValueOf, lM17625a2);
            }
        }
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nxq nxqVar = nxlVar.f44974b;
        ozd ozdVar3 = (ozd) nxqVar;
        ozdVar3.f46926a |= 1;
        ozdVar3.f46927b = jLongValue;
        if (!nxqVar.m18142ac()) {
            nxlVar.mo18106p();
        }
        ozd ozdVar4 = (ozd) nxlVar.f44974b;
        ozdVar4.f46926a &= -3;
        ozdVar4.f46928c = ozd.f46924d.f46928c;
        if (!nxlVar2.f44974b.m18142ac()) {
            nxlVar2.mo18106p();
        }
        ozi oziVar2 = (ozi) nxlVar2.f44974b;
        ozd ozdVar5 = (ozd) nxlVar.mo18103l();
        ozdVar5.getClass();
        oziVar2.f46958d = ozdVar5;
        oziVar2.f46955a |= 4;
        return (ozi) nxlVar2.mo18103l();
    }
}
