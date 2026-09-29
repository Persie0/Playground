package p000;

import androidx.compose.foundation.lazy.C0127b;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w81 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0127b f66508b;

    public /* synthetic */ w81(C0127b c0127b, int i) {
        this.f66507a = i;
        this.f66508b = c0127b;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i;
        int i2;
        int i3 = this.f66507a;
        C0127b c0127b = this.f66508b;
        switch (i3) {
            case 0:
                return c0127b.m980j();
            case 1:
                return c0127b.m980j();
            case 2:
                List list = c0127b.m980j().f42985k;
                iv4 iv4Var = (iv4) u91.m22591I0(list);
                int i4 = 0;
                if (iv4Var == null || (i = iv4Var.f44648a - 1) < 0) {
                    i = 0;
                }
                iv4 iv4Var2 = (iv4) u91.m22598P0(list);
                if (iv4Var2 != null && (i2 = iv4Var2.f44648a - 1) >= 0) {
                    i4 = i2;
                }
                return new Pair(Integer.valueOf(i), Integer.valueOf(i4));
            default:
                return c0127b.m980j();
        }
    }
}
