package p000;

import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvr extends LinkConfig.Builder {

    /* JADX INFO: renamed from: A */
    public ByteBuffer f37390A;

    /* JADX INFO: renamed from: B */
    public Boolean f37391B;

    /* JADX INFO: renamed from: C */
    public Boolean f37392C;

    /* JADX INFO: renamed from: D */
    public Boolean f37393D;

    /* JADX INFO: renamed from: E */
    public kwz f37394E;

    /* JADX INFO: renamed from: F */
    public Boolean f37395F;

    /* JADX INFO: renamed from: G */
    public byte f37396G;

    /* JADX INFO: renamed from: H */
    private kwt f37397H;

    /* JADX INFO: renamed from: a */
    public Boolean f37398a;

    /* JADX INFO: renamed from: b */
    public Boolean f37399b;

    /* JADX INFO: renamed from: c */
    public Boolean f37400c;

    /* JADX INFO: renamed from: d */
    public Boolean f37401d;

    /* JADX INFO: renamed from: e */
    public Boolean f37402e;

    /* JADX INFO: renamed from: f */
    public List f37403f;

    /* JADX INFO: renamed from: g */
    public Integer f37404g;

    /* JADX INFO: renamed from: h */
    public Integer f37405h;

    /* JADX INFO: renamed from: i */
    public Boolean f37406i;

    /* JADX INFO: renamed from: j */
    public Integer f37407j;

    /* JADX INFO: renamed from: k */
    public Boolean f37408k;

    /* JADX INFO: renamed from: l */
    public Map f37409l;

    /* JADX INFO: renamed from: m */
    public Boolean f37410m;

    /* JADX INFO: renamed from: n */
    public Boolean f37411n;

    /* JADX INFO: renamed from: o */
    public Boolean f37412o;

    /* JADX INFO: renamed from: p */
    public Boolean f37413p;

    /* JADX INFO: renamed from: q */
    public Integer f37414q;

    /* JADX INFO: renamed from: r */
    public Boolean f37415r;

    /* JADX INFO: renamed from: s */
    public Long f37416s;

    /* JADX INFO: renamed from: t */
    public Boolean f37417t;

    /* JADX INFO: renamed from: u */
    public Boolean f37418u;

    /* JADX INFO: renamed from: v */
    public kwu f37419v;

    /* JADX INFO: renamed from: w */
    public Long f37420w;

    /* JADX INFO: renamed from: x */
    public Boolean f37421x;

    /* JADX INFO: renamed from: y */
    public ByteBuffer f37422y;

    /* JADX INFO: renamed from: z */
    public Boolean f37423z;

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig.Builder
    /* JADX INFO: renamed from: a */
    public final void mo4698a(kwt kwtVar) {
        if (kwtVar == null) {
            throw new NullPointerException("Null dynamicLoadingMode");
        }
        this.f37397H = kwtVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig.Builder
    public final LinkConfig build() {
        kwt kwtVar;
        if (this.f37396G == 3 && (kwtVar = this.f37397H) != null) {
            return new kvs(this.f37398a, this.f37399b, this.f37400c, this.f37401d, this.f37402e, this.f37403f, this.f37404g, this.f37405h, this.f37406i, this.f37407j, this.f37408k, this.f37409l, this.f37410m, this.f37411n, this.f37412o, kwtVar, this.f37413p, this.f37414q, this.f37415r, this.f37416s, this.f37417t, this.f37418u, this.f37419v, this.f37420w, this.f37421x, this.f37422y, this.f37423z, this.f37390A, this.f37391B, this.f37392C, this.f37393D, this.f37394E, this.f37395F);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f37396G & 1) == 0) {
            sb.append(" aiAiShoppingDetectionEnabled");
        }
        if ((this.f37396G & 2) == 0) {
            sb.append(" aiAiTranslateDetectionEnabled");
        }
        if (this.f37397H == null) {
            sb.append(" dynamicLoadingMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
