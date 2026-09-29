package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: nv */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3386nv implements li4, aj2, ad1, o9a, zc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53274a;

    public /* synthetic */ C3386nv(int i) {
        this.f53274a = i;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17619e() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m17620f(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17621g(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m17622h(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m17623i(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m17624j(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m17625k(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m17626m(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m17627n(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m17628o(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m17629p(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m17630q(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m17631r() {
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m17632s(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m17633t(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m17634u(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m17635v(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m17636w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: a */
    public Constructor m17637a() {
        switch (this.f53274a) {
            case 25:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(hy2.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(hy2.class).getConstructor(null);
        }
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        o02.f53503b.getClass();
        return yq1.f70284a.m4509e((vq1) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p000.ad1
    /* JADX INFO: renamed from: b */
    public List mo275b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // p000.aj2
    /* JADX INFO: renamed from: c */
    public double mo503c(double d) {
        switch (this.f53274a) {
            case 12:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 13:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 14:
                float[] fArr = va1.f65096a;
                return va1.m23209b(va1.f65098c, d);
            case 15:
                float[] fArr2 = va1.f65096a;
                return va1.m23208a(va1.f65098c, d);
            case 16:
                float[] fArr3 = va1.f65096a;
                return va1.m23211d(va1.f65099d, d);
            default:
                float[] fArr4 = va1.f65096a;
                return va1.m23210c(va1.f65099d, d);
        }
    }

    @Override // p000.li4
    /* JADX INFO: renamed from: d */
    public lda mo12755d(co7 co7Var) throws GeneralSecurityException {
        if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            m17626m("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            bp0 bp0VarM4020B = bp0.m4020B((ByteString) co7Var.f10361d, ox2.m18561a());
            if (bp0VarM4020B.m4025z() == 0) {
                return cp0.m9823O(jp0.m14577a((OutputPrefixType) co7Var.f10363f), new or3(yk0.m25164a(bp0VarM4020B.m4024y().m6412j())), (Integer) co7Var.f10364g);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            v63.m23147y("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        Set setMo4927b = co7Var.mo4927b(rp7.m20740a(u40.class));
        qn3 qn3Var = qn3.f57969b;
        if (qn3Var == null) {
            synchronized (qn3.class) {
                try {
                    qn3Var = qn3.f57969b;
                    if (qn3Var == null) {
                        qn3Var = new qn3(0);
                        qn3.f57969b = qn3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new n92(setMo4927b, qn3Var);
    }
}
