package p000;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hk7 {

    /* JADX INFO: renamed from: a */
    public final Object f42534a;

    /* JADX INFO: renamed from: b */
    public final Object f42535b;

    /* JADX INFO: renamed from: c */
    public final byte[] f42536c;

    /* JADX INFO: renamed from: d */
    public final KeyStatusType f42537d;

    /* JADX INFO: renamed from: e */
    public final OutputPrefixType f42538e;

    /* JADX INFO: renamed from: f */
    public final int f42539f;

    /* JADX INFO: renamed from: g */
    public final String f42540g;

    /* JADX INFO: renamed from: h */
    public final lda f42541h;

    public hk7(Object obj, Object obj2, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i, String str, lda ldaVar) {
        this.f42534a = obj;
        this.f42535b = obj2;
        this.f42536c = Arrays.copyOf(bArr, bArr.length);
        this.f42537d = keyStatusType;
        this.f42538e = outputPrefixType;
        this.f42539f = i;
        this.f42540g = str;
        this.f42541h = ldaVar;
    }
}
