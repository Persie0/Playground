package ca;

import ae.C0062b;
import android.support.v4.media.AbstractC0140a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p482xd.C10170b;
import p529z9.C10463c;

/* JADX INFO: renamed from: ca.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1758a extends AbstractC0140a {

    /* JADX INFO: renamed from: c */
    public static final Pattern f9656c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f9657a = C10170b.f51477c.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f9658b = C10170b.f51476b.newDecoder();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: p */
    public final Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f9658b;
        CharsetDecoder charsetDecoder2 = this.f9657a;
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
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(null, null, bArr));
        }
        Matcher matcher = f9656c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM383p2 = C0062b.m383p2(strGroup);
                strM383p2.getClass();
                if (strM383p2.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM383p2.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(str, str2, bArr));
    }
}
