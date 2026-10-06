package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfi {

    /* JADX INFO: renamed from: a */
    private static final nbh f10786a = nbh.m17259h("com/google/android/apps/camera/cameravisionkit/URIEllipsizer");

    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3 A[Catch: URISyntaxException -> 0x01ba, TryCatch #0 {URISyntaxException -> 0x01ba, blocks: (B:71:0x00d7, B:73:0x00dd, B:74:0x00f3, B:78:0x00fb), top: B:121:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX INFO: renamed from: a */
    public static mrm m6055a(URI uri) {
        String str;
        String string;
        boolean z;
        int i;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return mqu.f41450a;
        }
        boolean z2 = mpw.m16770i(scheme, "http") || mpw.m16770i(scheme, "https");
        boolean zM16770i = mpw.m16770i(scheme, "fido");
        boolean zM16770i2 = mpw.m16770i(scheme, "shc");
        String host = uri.getHost();
        String path = uri.getPath();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if ((!z2 || host == null) && !zM16770i && !zM16770i2) {
            return mqu.f41450a;
        }
        if (host != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < host.length(); i3++) {
                if (host.charAt(i3) == '.') {
                    i2++;
                }
            }
            if (i2 >= 2) {
                i = 4;
                if (host.length() > 4 && host.startsWith("www")) {
                    int i4 = 3;
                    while (true) {
                        if (i4 < host.length()) {
                            if (host.charAt(i4) == '.') {
                                i = i4 + 1;
                                break;
                            }
                            if (Character.isDigit(host.charAt(i4))) {
                                i4++;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if ((host.length() <= 4 || !host.startsWith("web.")) && ((host.length() <= 4 || !host.startsWith("ftp.")) && (host.length() <= 4 || !host.startsWith("wap.")))) {
                    i = 5;
                    if (host.length() <= 5 || !host.startsWith(aJFPpVSaoDO.vGqWMQ)) {
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
            host = host.substring(i);
        }
        if (host == null && path == null) {
            try {
                if (uri.getSchemeSpecificPart() != null) {
                    string = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment()).toString();
                } else {
                    if (true != z2) {
                        str = scheme;
                    } else {
                        str = null;
                    }
                    string = new URI(str, uri.getUserInfo(), host, uri.getPort(), path, uri.getQuery(), uri.getFragment()).toString();
                }
            } catch (URISyntaxException e) {
                ((nbe) ((nbe) ((nbe) f10786a.m17251b()).mo17283h(e)).mo17276G((char) 862)).mo17290o("Failed to build intermediate barcode URI");
                return mqu.f41450a;
            }
        } else {
            if (true != z2) {
                str = scheme;
            } else {
                str = null;
            }
            string = new URI(str, uri.getUserInfo(), host, uri.getPort(), path, uri.getQuery(), uri.getFragment()).toString();
        }
        if (string.endsWith(BcwGDRhrTsnlj.NfrMoKA)) {
            string = string.substring(0, string.length() - 1);
        }
        if (string.startsWith("//")) {
            string = string.substring(2);
        }
        if (string.length() <= 25) {
            return mrm.m16829i(string);
        }
        String strM16831a = host != null ? host : path != null ? path : mro.m16831a(schemeSpecificPart);
        if (host != null && path != null && path.length() > 1) {
            strM16831a = strM16831a.concat("/…");
            z = true;
        } else if (!mro.m16832b(uri.getQuery())) {
            strM16831a = strM16831a.concat("?…");
            z = true;
        } else if (mro.m16832b(uri.getFragment())) {
            z = false;
        } else {
            strM16831a = strM16831a.concat("#…");
            z = true;
        }
        String strConcat = z2 ? "" : scheme.concat(":");
        int length = strConcat.length() + strM16831a.length() + (true == z ? 2 : 0);
        if (length > 25) {
            strM16831a = "…".concat(String.valueOf(strM16831a.substring(length - 22)));
        }
        return mrm.m16829i(strConcat.concat(strM16831a));
    }
}
