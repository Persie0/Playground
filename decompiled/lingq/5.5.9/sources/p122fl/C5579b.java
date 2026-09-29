package p122fl;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.tonyodev.fetch2core.Downloader;
import dm.C5206f;
import dm.C5207g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import mo.C7660h;
import mo.C7661i;
import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: renamed from: fl.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5579b {
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public static final boolean m11809a(int i10, Map<String, ? extends List<String>> map) {
        String lowerCase;
        String strM11821m = m11821m(map, "Accept-Ranges", "accept-ranges", "AcceptRanges");
        String strM11821m2 = m11821m(map, "Transfer-Encoding", "transfer-encoding", "TransferEncoding");
        long jM11814f = m11814f(map);
        boolean z10 = false;
        boolean z11 = i10 == 206 || C5207g.m11106a(strM11821m, "bytes");
        if (jM11814f > -1 && z11) {
            z10 = true;
        } else if (jM11814f > -1) {
            if (strM11821m2 != null) {
                lowerCase = strM11821m2.toLowerCase();
                C5207g.m11107b(lowerCase, "(this as java.lang.String).toLowerCase()");
            } else {
                lowerCase = null;
            }
            if (!C5207g.m11106a(lowerCase, "chunked")) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public static final long m11810b(long j10, long j11, long j12) {
        if (j11 >= 1 && j10 >= 1 && j12 >= 1) {
            return ((long) Math.abs(Math.ceil((j11 - j10) / j12))) * ((long) 1000);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: c */
    public static final Downloader.C4979a m11811c(Downloader.C4979a c4979a) {
        return new Downloader.C4979a(c4979a.f32521a, c4979a.f32522b, c4979a.f32523c, null, c4979a.f32525e, c4979a.f32526f, c4979a.f32527g, c4979a.f32528h, c4979a.f32529i);
    }

    /* JADX INFO: renamed from: d */
    public static final String m11812d(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb2 = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb2.append(line);
                sb2.append('\n');
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static final void m11813e(File file) {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() == null || file.getParentFile().exists()) {
            if (file.createNewFile()) {
                return;
            }
            throw new FileNotFoundException(file + " file_not_found");
        }
        if (!file.getParentFile().mkdirs()) {
            throw new FileNotFoundException(file + " file_not_found");
        }
        if (file.createNewFile()) {
            return;
        }
        throw new FileNotFoundException(file + " file_not_found");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX INFO: renamed from: f */
    public static final long m11814f(Map map) {
        long jLongValue;
        Long lM15247M2;
        String strM11821m = m11821m(map, "Content-Range", "content-range", "ContentRange");
        Integer numValueOf = strM11821m != null ? Integer.valueOf(C7076b.m14288h3(strM11821m, "/", 6)) : null;
        long jLongValue2 = -1;
        if (numValueOf == null || numValueOf.intValue() == -1 || numValueOf.intValue() >= strM11821m.length()) {
            jLongValue = -1;
        } else {
            String strSubstring = strM11821m.substring(numValueOf.intValue() + 1);
            C5207g.m11107b(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Long lM15247M3 = C7660h.m15247M2(strSubstring);
            if (lM15247M3 != null) {
                jLongValue = lM15247M3.longValue();
            } else {
                jLongValue = -1;
            }
        }
        if (jLongValue != -1) {
            return jLongValue;
        }
        String strM11821m2 = m11821m(map, "content-length", "Content-Length", "ContentLength");
        if (strM11821m2 != null && (lM15247M2 = C7660h.m15247M2(strM11821m2)) != null) {
            jLongValue2 = lM15247M2.longValue();
        }
        return jLongValue2;
    }

    /* JADX INFO: renamed from: g */
    public static final String m11815g(String str) {
        C5207g.m11112g(str, "url");
        String strSubstring = str.substring(C7076b.m14285e3(str, "//", 0, false, 6) + 2, C7076b.m14288h3(str, ":", 6));
        C5207g.m11107b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h */
    public static final int m11816h(String str) {
        C5207g.m11112g(str, "url");
        String strSubstring = str.substring(C7076b.m14288h3(str, ":", 6) + 1, str.length());
        C5207g.m11107b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        int iM14285e3 = C7076b.m14285e3(strSubstring, "/", 0, false, 6);
        if (iM14285e3 == -1) {
            return Integer.parseInt(strSubstring);
        }
        String strSubstring2 = strSubstring.substring(0, iM14285e3);
        C5207g.m11107b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return Integer.parseInt(strSubstring2);
    }

    /* JADX INFO: renamed from: i */
    public static final File m11817i(String str) {
        C5207g.m11112g(str, "filePath");
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() == null || file.getParentFile().exists()) {
                file.createNewFile();
            } else if (file.getParentFile().mkdirs()) {
                file.createNewFile();
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: j */
    public static final String m11818j(String str) {
        C5207g.m11112g(str, "file");
        File file = new File(str);
        try {
            byte[] bArr = new byte[8192];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(file), messageDigest);
            do {
                try {
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(digestInputStream, th2);
                        throw th3;
                    }
                }
            } while (digestInputStream.read(bArr) != -1);
            C9072e c9072e = C9072e.f47360a;
            C5206f.m11032z0(digestInputStream, null);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            C5207g.m11107b(string, "BigInteger(1, md.digest()).toString(16)");
            while (string.length() < 32) {
                string = '0' + string;
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m11819k(Context context) {
        C5207g.m11112g(context, "context");
        StringBuilder sb2 = new StringBuilder();
        File filesDir = context.getFilesDir();
        C5207g.m11107b(filesDir, "context.filesDir");
        sb2.append(filesDir.getAbsoluteFile());
        sb2.append("/_fetchData/temp");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static final Uri m11820l(String str) {
        C5207g.m11112g(str, "path");
        if (m11827s(str)) {
            Uri uri = Uri.parse(str);
            C5207g.m11107b(uri, "Uri.parse(path)");
            return uri;
        }
        Uri uriFromFile = Uri.fromFile(new File(str));
        C5207g.m11107b(uriFromFile, "Uri.fromFile(File(path))");
        return uriFromFile;
    }

    /* JADX INFO: renamed from: m */
    public static final String m11821m(Map<String, ? extends List<String>> map, String... strArr) {
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            String str = null;
            if (i10 >= length) {
                return null;
            }
            List<String> list = map.get(strArr[i10]);
            if (list != null) {
                str = (String) C6752c.m13425S(list);
            }
            if (!(str == null || C7661i.m15250P2(str))) {
                return str;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Long m11822n(String str) {
        C5207g.m11112g(str, "filePath");
        File fileM11817i = m11817i(str);
        if (fileM11817i.exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileM11817i, "r");
            try {
                try {
                    Long lValueOf = Long.valueOf(randomAccessFile.readLong());
                    try {
                        randomAccessFile.close();
                        return lValueOf;
                    } catch (Exception unused) {
                        return lValueOf;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                randomAccessFile.close();
                return null;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused4) {
                }
                throw th2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final String m11823o(String str) {
        C5207g.m11112g(str, "url");
        try {
            Uri uri = Uri.parse(str);
            StringBuilder sb2 = new StringBuilder();
            C5207g.m11107b(uri, "uri");
            sb2.append(uri.getScheme());
            sb2.append("://");
            sb2.append(uri.getAuthority());
            return sb2.toString();
        } catch (Exception unused) {
            return "https://google.com";
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Set<Downloader.FileDownloaderType> m11824p(Downloader.C4980b c4980b, Downloader<?, ?> downloader) {
        C5207g.m11112g(downloader, "downloader");
        Set<Downloader.FileDownloaderType> setM14946j0 = C7499b.m14946j0(Downloader.FileDownloaderType.SEQUENTIAL);
        try {
            Downloader.C4979a c4979aMo10675p = downloader.mo10675p(c4980b, new C0062b());
            if (c4979aMo10675p != null) {
                int i10 = c4979aMo10675p.f32521a;
                Map<String, List<String>> map = c4979aMo10675p.f32527g;
                C5207g.m11112g(map, "headers");
                if (m11809a(i10, map)) {
                    setM14946j0.add(Downloader.FileDownloaderType.PARALLEL);
                }
                downloader.mo10676p0(c4979aMo10675p);
            }
        } catch (Exception unused) {
        }
        return setM14946j0;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m11825q(long j10, long j11, long j12) {
        return TimeUnit.NANOSECONDS.toMillis(j11 - j10) >= j12;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m11826r(String str) {
        C5207g.m11112g(str, "url");
        boolean z10 = false;
        try {
            if (C7661i.m15256V2(str, "fetchlocal://", false)) {
                if ((m11815g(str).length() > 0) && m11816h(str) > -1) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        return z10;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m11827s(String str) {
        C5207g.m11112g(str, "path");
        boolean z10 = true;
        boolean z11 = false;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            if (!C7661i.m15256V2(str, "content://", false)) {
                if (!C7661i.m15256V2(str, "file://", false)) {
                    z10 = false;
                }
            }
            z11 = z10;
        }
        return z11;
    }
}
