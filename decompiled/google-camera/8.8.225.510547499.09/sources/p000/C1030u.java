package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.Serializable;

/* JADX INFO: renamed from: u */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1030u implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final String f47719a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0841n f47720b;

    /* JADX INFO: renamed from: c */
    public final C0949r f47721c;

    /* JADX INFO: renamed from: d */
    public final C0949r f47722d;

    public C1030u(String str, InterfaceC0841n interfaceC0841n, C0949r c0949r, C0949r c0949r2) {
        this.f47719a = str;
        this.f47720b = interfaceC0841n;
        this.f47721c = c0949r;
        this.f47722d = c0949r2;
    }

    @Deprecated
    public final int hashCode() {
        return this.f47719a.hashCode() ^ this.f47720b.hashCode();
    }

    public final String toString() {
        String str = this.f47719a;
        String string = this.f47720b.toString();
        C0949r c0949r = this.f47721c;
        String strConcat = c0949r == null ? "" : " ".concat(c0949r.toString());
        C0949r c0949r2 = this.f47722d;
        return str + aJFPpVSaoDO.zVQ + string + strConcat + (c0949r2 != null ? " ".concat(c0949r2.toString()) : "");
    }
}
