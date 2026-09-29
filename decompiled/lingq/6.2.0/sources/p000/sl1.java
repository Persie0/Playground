package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class sl1 {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList f60971a = new SnapshotStateList();

    /* JADX INFO: renamed from: b */
    public static void m21445b(sl1 sl1Var, zi3 zi3Var, C0282a c0282a, ui3 ui3Var, int i) {
        if ((i & 8) != 0) {
            c0282a = null;
        }
        sl1Var.f60971a.add(new C0282a(-1789283891, true, new C3357n2(zi3Var, sl1Var, c0282a, ui3Var)));
    }

    /* JADX INFO: renamed from: a */
    public final void m21446a(rl1 rl1Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-798501095);
        int i2 = (tj3Var.m22120g(rl1Var) ? 4 : 2) | i | (tj3Var.m22120g(this) ? 32 : 16);
        int i3 = 18;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f60971a;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((aj3) snapshotStateList.get(i4)).invoke(rl1Var, tj3Var, Integer.valueOf(i2 & 14));
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(this, i, i3, rl1Var);
        }
    }
}
