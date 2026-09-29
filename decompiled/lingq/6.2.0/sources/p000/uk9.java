package p000;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk9 implements oba, zc1, kwa, li4 {

    /* JADX INFO: renamed from: b */
    public static final uk9 f64027b = new uk9(3);

    /* JADX INFO: renamed from: c */
    public static final uk9 f64028c = new uk9(4);

    /* JADX INFO: renamed from: d */
    public static final uk9 f64029d = new uk9(5);

    /* JADX INFO: renamed from: e */
    public static final uk9 f64030e = new uk9(6);

    /* JADX INFO: renamed from: f */
    public static final uk9 f64031f = new uk9(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64032a;

    public /* synthetic */ uk9(int i) {
        this.f64032a = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22770c() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22771e(int i) {
        throw new UnknownFieldException(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22772f(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22773g(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22774h(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m22775i(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m22776j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m22777k(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m22778m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m22779n(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m22780o() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m22781p(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m22782q(String str) throws zzaeh {
        throw new zzaeh(str);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m22783r(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m22784s() {
        throw new NoSuchElementException();
    }

    @Override // p000.kwa
    /* JADX INFO: renamed from: a */
    public n9a mo4329a(C3419on c3419on) {
        return new n9a(c3419on, lq6.f50006a);
    }

    @Override // p000.oba
    /* JADX INFO: renamed from: b */
    public void mo17902b(Exception exc) {
    }

    @Override // p000.li4
    /* JADX INFO: renamed from: d */
    public lda mo12755d(co7 co7Var) throws GeneralSecurityException {
        if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            C3386nv.m17626m("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            s9b s9bVarM21176B = s9b.m21176B((ByteString) co7Var.f10361d, ox2.m18561a());
            if (s9bVarM21176B.m21181z() == 0) {
                return t9b.m21917O(y9b.m24997a((OutputPrefixType) co7Var.f10363f), new or3(yk0.m25164a(s9bVarM21176B.m21180y().m6412j())), (Integer) co7Var.f10364g);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            v63.m23147y("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f64032a) {
            case 9:
                return TransportRegistrar.lambda$getComponents$0(co7Var);
            case 10:
                return TransportRegistrar.lambda$getComponents$1(co7Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(co7Var);
        }
    }
}
