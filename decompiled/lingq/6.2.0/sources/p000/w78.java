package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class w78 extends u33 {

    /* JADX INFO: renamed from: e */
    public static final d57 f66487e;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f66488b;

    /* JADX INFO: renamed from: c */
    public final u33 f66489c;

    /* JADX INFO: renamed from: d */
    public final cs4 f66490d;

    static {
        String str = d57.f35013b;
        f66487e = gz8.m12976h("/", false);
    }

    public w78(ClassLoader classLoader) {
        rg4 rg4Var = u33.f63345a;
        rg4Var.getClass();
        this.f66488b = classLoader;
        this.f66489c = rg4Var;
        this.f66490d = AbstractC3192a.m15356a(new y47(this, 3));
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: A */
    public final qg4 mo259A(d57 d57Var) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: J */
    public final t89 mo260J(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: N */
    public final yd9 mo261N(d57 d57Var) throws IOException {
        d57Var.getClass();
        if (!tr3.m22268i(d57Var)) {
            ho2.m13387h(d57Var, "file not found: ");
            return null;
        }
        d57 d57Var2 = f66487e;
        d57Var2.getClass();
        URL resource = this.f66488b.getResource(AbstractC2909d.m9950b(d57Var2, d57Var, false).m10106d(d57Var2).f35014a.m18089r());
        if (resource == null) {
            ho2.m13387h(d57Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return r46.m20369L(inputStream);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: a */
    public final t89 mo262a(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: b */
    public final void mo263b(d57 d57Var, d57 d57Var2) throws IOException {
        d57Var.getClass();
        d57Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: e */
    public final void mo264e(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: n */
    public final void mo265n(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: r */
    public final List mo266r(d57 d57Var) throws FileNotFoundException {
        d57 d57Var2 = f66487e;
        d57Var2.getClass();
        String strM18089r = AbstractC2909d.m9950b(d57Var2, d57Var, true).m10106d(d57Var2).f35014a.m18089r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.f66490d.getValue()) {
            u33 u33Var = (u33) pair.f47623a;
            d57 d57Var3 = (d57) pair.f47624b;
            try {
                List listMo266r = u33Var.mo266r(d57Var3.m10107e(strM18089r));
                ArrayList<d57> arrayList = new ArrayList();
                for (Object obj : listMo266r) {
                    if (tr3.m22268i((d57) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                for (d57 d57Var4 : arrayList) {
                    d57Var4.getClass();
                    String strReplace = vk9.m23398u0(d57Var4.f35014a.m18089r(), d57Var3.f35014a.m18089r()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(d57Var2.m10107e(strReplace));
                }
                u91.m22630w0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return u91.m22622n1(linkedHashSet);
        }
        ho2.m13387h(d57Var, "file not found: ");
        return null;
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: x */
    public final sb2 mo267x(d57 d57Var) {
        d57Var.getClass();
        if (!tr3.m22268i(d57Var)) {
            return null;
        }
        d57 d57Var2 = f66487e;
        d57Var2.getClass();
        String strM18089r = AbstractC2909d.m9950b(d57Var2, d57Var, true).m10106d(d57Var2).f35014a.m18089r();
        for (Pair pair : (List) this.f66490d.getValue()) {
            sb2 sb2VarMo267x = ((u33) pair.f47623a).mo267x(((d57) pair.f47624b).m10107e(strM18089r));
            if (sb2VarMo267x != null) {
                return sb2VarMo267x;
            }
        }
        return null;
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: z */
    public final qg4 mo268z(d57 d57Var) throws FileNotFoundException {
        if (!tr3.m22268i(d57Var)) {
            ho2.m13387h(d57Var, "file not found: ");
            return null;
        }
        d57 d57Var2 = f66487e;
        d57Var2.getClass();
        String strM18089r = AbstractC2909d.m9950b(d57Var2, d57Var, true).m10106d(d57Var2).f35014a.m18089r();
        Iterator it = ((List) this.f66490d.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((u33) pair.f47623a).mo268z(((d57) pair.f47624b).m10107e(strM18089r));
            } catch (FileNotFoundException unused) {
            }
        }
        ho2.m13387h(d57Var, "file not found: ");
        return null;
    }
}
