package p000;

import android.util.Base64;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lyy {

    /* JADX INFO: renamed from: a */
    private static final ncg f39582a = ncg.m17328i();

    /* JADX INFO: renamed from: a */
    public static final int m16184a(lvi lviVar) {
        lviVar.getClass();
        return lviVar.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public static final String m16185b(lvk lvkVar) {
        if (lvkVar != null) {
            return lvkVar.m16094b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final nut m16186c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(nut.f44692a, bArr, 0, bArr.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            return (nut) nxqVarM18123Q;
        } catch (nyb e) {
            ((ncc) ((ncc) f39582a.m17251b()).mo17283h(e)).mo17290o("Can't parse IndexTokens.");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final ocl m16187d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(ocl.f45478a, bArr, 0, bArr.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            return (ocl) nxqVarM18123Q;
        } catch (nyb e) {
            ((ncc) ((ncc) f39582a.m17251b()).mo17283h(e)).mo17290o("Can't parse Provenance.");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final ocm m16188e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(ocm.f45480b, bArr, 0, bArr.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            return (ocm) nxqVarM18123Q;
        } catch (nyb e) {
            ((ncc) ((ncc) f39582a.m17251b()).mo17283h(e)).mo17290o("Can't parse Relations.");
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final nuw m16189f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(nuw.f44705d, bArr, 0, bArr.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            return (nuw) nxqVarM18123Q;
        } catch (nyb e) {
            ((ncc) ((ncc) f39582a.m17251b()).mo17283h(e)).mo17290o("Can't parse Wipeout.");
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Long m16190g(nxd nxdVar) {
        if (nxdVar == null) {
            return null;
        }
        oao.m18390b(nxdVar);
        return Long.valueOf(kxk.m14994al(kxk.m14995am(nxdVar.f44900a, 1000000000L), nxdVar.f44901b));
    }

    /* JADX INFO: renamed from: h */
    public static final int m16191h(lvl lvlVar) {
        lvlVar.getClass();
        return lvlVar.ordinal();
    }

    /* JADX INFO: renamed from: i */
    public static final String m16192i(List list) {
        return omn.m18680T(list, " ", null, null, null, 62);
    }

    /* JADX INFO: renamed from: j */
    public static final byte[] m16193j(nut nutVar) {
        if (nutVar != null) {
            return nutVar.mo17760J();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final nzw m16194k(Long l) {
        if (l == null) {
            return null;
        }
        l.longValue();
        return oaq.m18392b(l.longValue());
    }

    /* JADX INFO: renamed from: l */
    public static final nxd m16195l(Long l) {
        if (l == null) {
            return null;
        }
        l.longValue();
        long jLongValue = l.longValue();
        return oao.m18389a(jLongValue / 1000000000, (int) (jLongValue % 1000000000));
    }

    /* JADX INFO: renamed from: m */
    public static final lvi m16196m(int i) {
        return lvi.values()[i];
    }

    /* JADX INFO: renamed from: n */
    public static final lwh m16197n(int i) {
        return lwh.values()[i];
    }

    /* JADX INFO: renamed from: o */
    public static final byte[] m16198o(ocl oclVar) {
        if (oclVar != null) {
            return oclVar.mo17760J();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final byte[] m16199p(ocm ocmVar) {
        if (ocmVar != null) {
            return ocmVar.mo17760J();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final lvk m16200q(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 11);
        bArrDecode.getClass();
        lvk lvkVar = new lvk(bArrDecode);
        if (ooc.m18737c(lvkVar.m16094b(), str)) {
            return lvkVar;
        }
        throw new IllegalArgumentException(rgoX.TNIFCpFUNPPp.concat(str));
    }

    /* JADX INFO: renamed from: r */
    public static final List m16201r(String str) {
        str.getClass();
        if (str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return okv.f46215a;
        }
        List<String> listM18764B = ook.m18764B(str, new String[]{xPAWq.sRuzxaCzgnObGYj}, 0);
        ArrayList arrayList = new ArrayList(omn.m18678R(listM18764B));
        for (String str2 : listM18764B) {
            int i = nfc.f42170b;
            lku.m15607B(str2.length() >= 2, "input string (%s) must have at least 2 characters", str2);
            lku.m15607B(str2.length() % 2 == 0, "input string (%s) must have an even number of characters", str2);
            byte[] bArr = new byte[str2.length() / 2];
            for (int i2 = 0; i2 < str2.length(); i2 += 2) {
                bArr[i2 / 2] = (byte) ((nfc.m17440e(str2.charAt(i2)) << 4) + nfc.m17440e(str2.charAt(i2 + 1)));
            }
            arrayList.add(nfc.m17441f(bArr));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static final List m16202s(String str) {
        if (str == null) {
            return okv.f46215a;
        }
        List listM18764B = ook.m18764B(str, new String[]{"/"}, 2);
        if (((CharSequence) listM18764B.get(0)).length() == 0) {
            return okv.f46215a;
        }
        List listM18764B2 = ook.m18764B((CharSequence) listM18764B.get(0), new String[]{"a"}, 0);
        ArrayList arrayList = new ArrayList(omn.m18678R(listM18764B2));
        Iterator it = listM18764B2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        int i = 1;
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            String strSubstring = ((String) listM18764B.get(1)).substring(i, i + iIntValue);
            strSubstring.getClass();
            arrayList2.add(strSubstring);
            i += iIntValue + 1;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: t */
    public static final String m16203t(List list) {
        int size = list.size();
        String strConcat = "";
        for (int i = 0; i < size; i++) {
            strConcat = strConcat + ((String) list.get(i)).length();
            if (i != list.size() - 1) {
                strConcat = strConcat.concat("a");
            }
        }
        Iterator it = list.iterator();
        String strConcat2 = strConcat.concat("/");
        while (it.hasNext()) {
            strConcat2 = strConcat2 + " " + ((String) it.next());
        }
        return strConcat2;
    }

    /* JADX INFO: renamed from: u */
    public static final Long m16204u(nzw nzwVar) {
        if (nzwVar != null) {
            return Long.valueOf(oaq.m18391a(nzwVar));
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final lvl m16205v(int i) {
        return lvl.values()[i];
    }

    /* JADX INFO: renamed from: w */
    public static final int m16206w(lwh lwhVar) {
        lwhVar.getClass();
        return lwhVar.ordinal();
    }

    /* JADX INFO: renamed from: x */
    public static final byte[] m16207x(nuw nuwVar) {
        if (nuwVar != null) {
            return nuwVar.mo17760J();
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final String m16208y(lvn lvnVar) {
        if (lvnVar != null) {
            return lvnVar.m16094b();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final lvn m16209z(String str) {
        if (str != null) {
            return lme.m15716b(str);
        }
        return null;
    }
}
