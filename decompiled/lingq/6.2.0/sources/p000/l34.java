package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class l34 implements fd9, agd {

    /* JADX INFO: renamed from: c */
    public static final l34 f48983c;

    /* JADX INFO: renamed from: d */
    public static final l34 f48984d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48985a;

    /* JADX INFO: renamed from: b */
    public final boolean f48986b;

    static {
        int i = 0;
        f48983c = new l34(i, true);
        f48984d = new l34(i, false);
    }

    public /* synthetic */ l34(int i, boolean z) {
        this.f48985a = i;
        this.f48986b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.agd
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo391b(ny8 ny8Var) throws IOException {
        z3d z3dVarM25449a;
        InputStream inputStreamM11077j = eda.m11077j(ny8Var);
        try {
            int i = 4096;
            if (this.f48986b) {
                if (inputStreamM11077j instanceof bhd) {
                    long length = ((bhd) inputStreamM11077j).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                z3dVarM25449a = z3d.m25449a(ghb.m12663h(inputStreamM11077j, i), true);
            } else {
                z3dVarM25449a = z3d.m25449a(ghb.m12663h(inputStreamM11077j, 4096), false);
            }
            AbstractC3584sr.m21646y(inputStreamM11077j, null);
            return z3dVarM25449a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(inputStreamM11077j, th);
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f48985a) {
            case 0:
                return AbstractC3393o1.m17740o(new StringBuilder("IncorrectFragmentation{expected="), !this.f48986b, "}");
            default:
                return super.toString();
        }
    }
}
