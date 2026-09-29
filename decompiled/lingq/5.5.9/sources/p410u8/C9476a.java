package p410u8;

import androidx.fragment.app.C0987y;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p395t8.C9220b;
import p452w8.InterfaceC9831l;

/* JADX INFO: renamed from: u8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9476a implements InterfaceC9831l {

    /* JADX INFO: renamed from: c */
    public static final String f48585c = C0987y.m3823e("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: d */
    public static final Set<C9220b> f48586d;

    /* JADX INFO: renamed from: e */
    public static final C9476a f48587e;

    /* JADX INFO: renamed from: a */
    public final String f48588a;

    /* JADX INFO: renamed from: b */
    public final String f48589b;

    static {
        String strM3823e = C0987y.m3823e("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM3823e2 = C0987y.m3823e("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f48586d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C9220b("proto"), new C9220b("json"))));
        f48587e = new C9476a(strM3823e, strM3823e2);
    }

    public C9476a(String str, String str2) {
        this.f48588a = str;
        this.f48589b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C9476a m17897a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C9476a(str2, str3);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m17898b() {
        String str = this.f48588a;
        String str2 = this.f48589b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
