package p000;

import android.net.Uri;
import androidx.media3.exoplayer.source.C0717b;
import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class in7 {

    /* JADX INFO: renamed from: a */
    public final Uri f44309a;

    /* JADX INFO: renamed from: b */
    public final e74 f44310b;

    /* JADX INFO: renamed from: c */
    public final gv5 f44311c;

    /* JADX INFO: renamed from: d */
    public final C0717b f44312d;

    /* JADX INFO: renamed from: e */
    public final hg1 f44313e;

    /* JADX INFO: renamed from: g */
    public volatile boolean f44315g;

    /* JADX INFO: renamed from: i */
    public long f44317i;

    /* JADX INFO: renamed from: j */
    public k02 f44318j;

    /* JADX INFO: renamed from: k */
    public n8a f44319k;

    /* JADX INFO: renamed from: l */
    public boolean f44320l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0717b f44321m;

    /* JADX INFO: renamed from: f */
    public final n63 f44314f = new n63();

    /* JADX INFO: renamed from: h */
    public boolean f44316h = true;

    public in7(C0717b c0717b, Uri uri, j02 j02Var, gv5 gv5Var, C0717b c0717b2, hg1 hg1Var) {
        this.f44321m = c0717b;
        this.f44309a = uri;
        this.f44310b = new e74(j02Var);
        this.f44311c = gv5Var;
        this.f44312d = c0717b2;
        this.f44313e = hg1Var;
        eh5.f37255a.getAndIncrement();
        this.f44318j = m14032a(null, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final k02 m14032a(String str, long j) {
        Map mapM6339a = C0717b.f6465l0;
        if (str != null && !str.startsWith("W/")) {
            C1097m c1097mM6295a = ImmutableMap.m6295a();
            c1097mM6295a.m6341c(mapM6339a.entrySet());
            c1097mM6295a.m6340b("If-Range", str);
            mapM6339a = c1097mM6295a.m6339a(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f44309a;
        bna.m3979v(uri, "The uri must be set.");
        return new k02(uri, 1, null, mapM6339a, j, -1L, 6);
    }

    /* JADX WARN: Type inference failed for: r8v27, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m14033b() {
        j02 j02Var;
        hy2 hy2Var;
        int i;
        int iMo110b = 0;
        String str = null;
        while (iMo110b == 0 && !this.f44315g) {
            try {
                long j = this.f44314f.f52394a;
                k02 k02VarM14032a = m14032a(str, j);
                this.f44318j = k02VarM14032a;
                long jMo10000b = this.f44310b.mo10000b(k02VarM14032a);
                if (this.f44315g) {
                    if (iMo110b != 1 && this.f44311c.m12916z() != -1) {
                        this.f44314f.f52394a = this.f44311c.m12916z();
                    }
                    e74 e74Var = this.f44310b;
                    if (e74Var != null) {
                        try {
                            e74Var.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                List list = (List) ((j02) this.f44310b.f36797b).mo10001h().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jMo10000b != -1) {
                    jMo10000b += j;
                    C0717b c0717b = this.f44321m;
                    c0717b.f6470K.post(new gn7(c0717b, 2));
                }
                long j2 = jMo10000b;
                this.f44321m.f6472M = wy3.m24215d(((j02) this.f44310b.f36797b).mo10001h());
                e74 e74Var2 = this.f44310b;
                wy3 wy3Var = this.f44321m.f6472M;
                if (wy3Var == null || (i = wy3Var.f67517f) == -1) {
                    j02Var = e74Var2;
                } else {
                    C2913d3 c2913d3 = new C2913d3();
                    bna.m3969q(i > 0);
                    c2913d3.f34884c = e74Var2;
                    c2913d3.f34882a = i;
                    c2913d3.f34885d = this;
                    c2913d3.f34886e = new byte[1];
                    c2913d3.f34883b = i;
                    n8a n8aVarM2539A = this.f44321m.m2539A(new kn7(0, true));
                    this.f44319k = n8aVarM2539A;
                    n8aVarM2539A.mo2537g(C0717b.f6466m0);
                    j02Var = c2913d3;
                }
                this.f44311c.m12878H(j02Var, this.f44309a, ((j02) this.f44310b.f36797b).mo10001h(), j, j2, this.f44312d);
                if (this.f44321m.f6472M != null && (hy2Var = (hy2) this.f44311c.f41393c) != null && (hy2Var instanceof a46)) {
                    ((a46) hy2Var).f239s = true;
                }
                if (this.f44316h) {
                    gv5 gv5Var = this.f44311c;
                    long j3 = this.f44317i;
                    hy2 hy2Var2 = (hy2) gv5Var.f41393c;
                    hy2Var2.getClass();
                    hy2Var2.mo112d(j, j3);
                    this.f44316h = false;
                }
                while (iMo110b == 0 && !this.f44315g) {
                    try {
                        hg1 hg1Var = this.f44313e;
                        synchronized (hg1Var) {
                            while (!hg1Var.f42318b) {
                                try {
                                    hg1Var.f42317a.getClass();
                                    hg1Var.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        gv5 gv5Var2 = this.f44311c;
                        n63 n63Var = this.f44314f;
                        hy2 hy2Var3 = (hy2) gv5Var2.f41393c;
                        hy2Var3.getClass();
                        h62 h62Var = (h62) gv5Var2.f41394d;
                        h62Var.getClass();
                        iMo110b = hy2Var3.mo110b(h62Var, n63Var);
                        long jM12916z = this.f44311c.m12916z();
                        if (jM12916z > this.f44321m.f6502i + j) {
                            hg1 hg1Var2 = this.f44313e;
                            synchronized (hg1Var2) {
                                hg1Var2.f42318b = false;
                            }
                            C0717b c0717b2 = this.f44321m;
                            c0717b2.f6470K.post(c0717b2.f6469J);
                            j = jM12916z;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (iMo110b == 1) {
                    iMo110b = 0;
                } else if (this.f44311c.m12916z() != -1) {
                    this.f44314f.f52394a = this.f44311c.m12916z();
                }
                e74 e74Var3 = this.f44310b;
                if (e74Var3 != null) {
                    try {
                        e74Var3.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                if (iMo110b != 1 && this.f44311c.m12916z() != -1) {
                    this.f44314f.f52394a = this.f44311c.m12916z();
                }
                e74 e74Var4 = this.f44310b;
                if (e74Var4 != null) {
                    try {
                        e74Var4.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        }
    }
}
