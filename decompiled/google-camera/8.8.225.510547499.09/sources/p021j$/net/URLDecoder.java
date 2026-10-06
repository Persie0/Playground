package p021j$.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class URLDecoder {
    static {
        BitSet bitSet = URLEncoder.f32808a;
    }

    /* JADX INFO: renamed from: a */
    public static String m12058a(String str, Charset charset) {
        if (charset == null) {
            throw new NullPointerException("Charset");
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length > 500 ? length / 2 : length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            char c = '%';
            if (cCharAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - " + e.getMessage());
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || cCharAt != c) {
                        break;
                    }
                    int i4 = i + 1;
                    char cCharAt2 = str.charAt(i4);
                    if (('0' <= cCharAt2 && cCharAt2 <= '9') || ('a' <= cCharAt2 && cCharAt2 <= 'f') || ('A' <= cCharAt2 && cCharAt2 <= 'F')) {
                        char cCharAt3 = str.charAt(i3);
                        if (('0' <= cCharAt3 && cCharAt3 <= '9') || ('a' <= cCharAt3 && cCharAt3 <= 'f') || ('A' <= cCharAt3 && cCharAt3 <= 'F')) {
                            int i5 = i + 3;
                            if (i5 - i4 >= 2 && str.charAt(i4) == '+') {
                                int i6 = i4 + 1;
                                if (Character.digit(str.charAt(i6), 16) >= 0) {
                                    i4 = i6;
                                }
                            }
                            int i7 = Integer.parseInt(str.subSequence(i4, i5).toString(), 16);
                            if (i7 < 0) {
                                throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : " + str.substring(i, i5));
                            }
                            int i8 = i2 + 1;
                            bArr[i2] = (byte) i7;
                            if (i5 < length) {
                                cCharAt = str.charAt(i5);
                            }
                            i2 = i8;
                            c = '%';
                            i = i5;
                        }
                    }
                    throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + str.substring(i, i + 3));
                }
                if (i < length && cCharAt == '%') {
                    throw new IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
                }
                sb.append(new String(bArr, 0, i2, charset));
            } else if (cCharAt != '+') {
                sb.append(cCharAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : str;
    }

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return m12058a(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }
}
