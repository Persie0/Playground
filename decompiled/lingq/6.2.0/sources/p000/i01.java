package p000;

import androidx.compose.foundation.text.input.internal.C0187a;
import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i01 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f43275c;

    public /* synthetic */ i01(boolean z, C0187a c0187a) {
        this.f43273a = 2;
        this.f43275c = z;
        this.f43274b = c0187a;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        r66 r66VarM1087i;
        int i = this.f43273a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f43274b;
        boolean z = this.f43275c;
        switch (i) {
            case 0:
                ((vi3) obj).invoke(Boolean.valueOf(!z));
                break;
            case 1:
                ((vi3) obj).invoke(Boolean.valueOf(!z));
                break;
            default:
                C0187a c0187a = (C0187a) obj;
                if (z && (r66VarM1087i = c0187a.m1087i()) != null) {
                    ((C3229i) r66VarM1087i).m15558p(xfaVar);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ i01(int i, vi3 vi3Var, boolean z) {
        this.f43273a = i;
        this.f43274b = vi3Var;
        this.f43275c = z;
    }
}
