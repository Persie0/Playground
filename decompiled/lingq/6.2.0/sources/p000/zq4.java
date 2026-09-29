package p000;

import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.node.C0357g;

/* JADX INFO: loaded from: classes.dex */
public final class zq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0339f f71969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71970c;

    public /* synthetic */ zq4(C0339f c0339f, Object obj, int i) {
        this.f71968a = i;
        this.f71969b = c0339f;
        this.f71970c = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m25745a() {
    }

    /* JADX INFO: renamed from: b */
    public sq4 m25746b() {
        C0339f c0339f = this.f71969b;
        C0357g c0357g = (C0357g) c0339f.f4202j.m17255g(this.f71970c);
        if (c0357g != null) {
            return (sq4) c0339f.f4198f.m17255g(c0357g);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25747c() {
        i67 i67Var;
        switch (this.f71968a) {
            case 0:
                return true;
            default:
                sq4 sq4VarM25746b = m25746b();
                if (sq4VarM25746b == null || (i67Var = sq4VarM25746b.f61242f) == null) {
                    return true;
                }
                return i67Var.m13699c();
        }
    }
}
