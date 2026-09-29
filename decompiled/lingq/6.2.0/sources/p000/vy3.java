package p000;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class vy3 extends h3d {

    /* JADX INFO: renamed from: c */
    public static final Pattern f66089c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f66090a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f66091b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p000.h3d
    /* JADX INFO: renamed from: b */
    public final ey5 mo13039b(jy5 jy5Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f66091b;
        CharsetDecoder charsetDecoder2 = this.f66090a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new ey5(new xy3(null, null, bArr));
        }
        Matcher matcher = f66089c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM21625f0 = AbstractC3584sr.m21625f0(strGroup);
                strM21625f0.getClass();
                if (strM21625f0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM21625f0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new ey5(new xy3(str, str2, bArr));
    }
}
