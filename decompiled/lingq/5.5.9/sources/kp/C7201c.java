package kp;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4950l;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import jp.InterfaceC6538f;
import okio.ByteString;
import p124fp.InterfaceC5610g;
import so.AbstractC9107y;

/* JADX INFO: renamed from: kp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7201c<T> implements InterfaceC6538f<AbstractC9107y, T> {

    /* JADX INFO: renamed from: b */
    public static final ByteString f40528b;

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<T> f40529a;

    static {
        ByteString byteString = ByteString.f43897d;
        f40528b = ByteString.C8082a.m16000b("EFBBBF");
    }

    public C7201c(AbstractC4949k<T> abstractC4949k) {
        this.f40529a = abstractC4949k;
    }

    @Override // jp.InterfaceC6538f
    /* JADX INFO: renamed from: a */
    public final Object mo13122a(AbstractC9107y abstractC9107y) throws IOException {
        AbstractC9107y abstractC9107y2 = abstractC9107y;
        InterfaceC5610g interfaceC5610gMo13138q = abstractC9107y2.mo13138q();
        try {
            ByteString byteString = f40528b;
            if (interfaceC5610gMo13138q.mo11955e1(byteString)) {
                interfaceC5610gMo13138q.skip(byteString.data.length);
            }
            C4950l c4950l = new C4950l(interfaceC5610gMo13138q);
            T tMo9385a = this.f40529a.mo9385a(c4950l);
            if (c4950l.mo10505d0() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            abstractC9107y2.close();
            return tMo9385a;
        } catch (Throwable th2) {
            abstractC9107y2.close();
            throw th2;
        }
    }
}
