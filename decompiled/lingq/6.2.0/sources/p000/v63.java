package p000;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.FeatureManager$Feature;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.C1181b;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v63 implements o9a, bm1, yj7, li4, k13, j69 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64915a;

    public /* synthetic */ v63(co7 co7Var) {
        this.f64915a = 3;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m23127A(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23128b() {
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23129g(int i, Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + i + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m23130h(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23131i(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m23132j(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m23133k(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23134l(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m23135m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m23136n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m23137o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m23138p(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m23139q(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m23140r(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m23141s(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m23142t(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m23143u(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m23144v(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m23145w(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m23146x(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m23147y(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m23148z(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // p000.j69
    /* JADX INFO: renamed from: a */
    public boolean mo14307a() {
        return false;
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        x67 x67Var = (x67) obj;
        x67Var.getClass();
        try {
            int iMo6790h = x67Var.mo6790h(null);
            byte[] bArr = new byte[iMo6790h];
            C1181b c1181b = new C1181b(iMo6790h, bArr);
            x67Var.mo6791i(c1181b);
            if (iMo6790h - c1181b.f13934d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + x67.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // p000.yj7
    /* JADX INFO: renamed from: c */
    public Object mo12754c(lda ldaVar) {
        return new y11();
    }

    @Override // p000.li4
    /* JADX INFO: renamed from: d */
    public lda mo12755d(co7 co7Var) throws GeneralSecurityException {
        if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            C3386nv.m17626m("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            fu3 fu3VarM12143E = fu3.m12143E((ByteString) co7Var.f10361d, ox2.m18561a());
            if (fu3VarM12143E.m12151C() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C3329mb c3329mb = new C3329mb(7);
            c3329mb.m16731h(fu3VarM12143E.m12149A().size());
            c3329mb.f50861c = Integer.valueOf(fu3VarM12143E.m12150B().m18519z());
            c3329mb.f50862d = qu3.m20176a(fu3VarM12143E.m12150B().m18518y());
            c3329mb.f50863e = qu3.m20177b((OutputPrefixType) co7Var.f10363f);
            lu3 lu3VarM16725b = c3329mb.m16725b();
            gv5 gv5Var = new gv5(20, false);
            gv5Var.m12893W(lu3VarM16725b);
            gv5Var.m12887Q(new or3(yk0.m25164a(fu3VarM12143E.m12149A().m6412j())));
            gv5Var.m12886P((Integer) co7Var.f10364g);
            return gv5Var.m12912t();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            m23147y("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) throws IOException {
        Bundle bundle = (Bundle) task.mo5968j();
        if (bundle == null) {
            m23133k("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            m23133k("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            m23133k(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        m23133k("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // p000.k13
    /* JADX INFO: renamed from: f */
    public void mo12756f(boolean z) {
        File[] fileArrListFiles;
        switch (this.f64915a) {
            case 11:
                if (z) {
                    synchronized (kp1.f48273b) {
                        try {
                            sy2 sy2Var = sy2.f61585a;
                            if (ema.m11256c()) {
                                gr7.m12852h();
                            }
                            if (kp1.f48274c != null) {
                                Log.w("kp1", "Already enabled!");
                            } else {
                                kp1 kp1Var = new kp1(Thread.getDefaultUncaughtExceptionHandler());
                                kp1.f48274c = kp1Var;
                                Thread.setDefaultUncaughtExceptionHandler(kp1Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (p13.m18852b(FeatureManager$Feature.CrashShield)) {
                        int i = 1;
                        pk9.f56375t = true;
                        if (ema.m11256c() && !bna.m3941b0()) {
                            File fileM22058q = thb.m22058q();
                            if (fileM22058q == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileM22058q.listFiles(new mp1(5));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                r74 r74VarM11102d = egd.m11102d(file);
                                if (r74VarM11102d.m20432c()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", r74VarM11102d.toString());
                                        String str = mp3.f51688j;
                                        arrayList.add(s46.m21069q(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{sy2.m21767b()}, 1)), jSONObject, new jp1(r74VarM11102d, i)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                op3 op3Var = new op3(arrayList);
                                String str2 = mp3.f51688j;
                                eda.m11072e(op3Var);
                                new np3(op3Var).executeOnExecutor(sy2.m21768c(), new Void[0]);
                            }
                        }
                        lp1.f49972b = true;
                    }
                    p13.m18852b(FeatureManager$Feature.ThreadCheck);
                    return;
                }
                return;
            case 12:
                if (z) {
                    ncd.m17374a();
                    return;
                }
                return;
            default:
                if (z) {
                    AbstractC3317m.m16589a();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v63(int i) {
        this.f64915a = i;
    }
}
