package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class al0 {

    /* JADX INFO: renamed from: c */
    public static final String f791c;

    /* JADX INFO: renamed from: d */
    public static final Set f792d;

    /* JADX INFO: renamed from: e */
    public static final al0 f793e;

    /* JADX INFO: renamed from: f */
    public static final al0 f794f;

    /* JADX INFO: renamed from: a */
    public final String f795a;

    /* JADX INFO: renamed from: b */
    public final String f796b;

    static {
        String strM4061l0 = bq1.m4061l0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f791c = strM4061l0;
        String strM4061l1 = bq1.m4061l0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM4061l2 = bq1.m4061l0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f792d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new bs2("proto"), new bs2("json"))));
        f793e = new al0(strM4061l0, null);
        f794f = new al0(strM4061l1, strM4061l2);
    }

    public al0(String str, String str2) {
        this.f795a = str;
        this.f796b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static al0 m533a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            C3386nv.m17626m("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            C3386nv.m17626m("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            C3386nv.m17626m("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new al0(str2, str3.isEmpty() ? null : str3);
    }
}
