package androidx.compose.p002ui.node;

import java.util.Arrays;
import p000.dd9;
import p000.ed9;
import p000.vi3;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.ui.node.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0364n {

    /* JADX INFO: renamed from: a */
    public final ed9 f4460a;

    /* JADX INFO: renamed from: b */
    public final vi3 f4461b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.f4286b;

    /* JADX INFO: renamed from: c */
    public final vi3 f4462c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f4287b;

    /* JADX INFO: renamed from: d */
    public final vi3 f4463d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.f4288b;

    /* JADX INFO: renamed from: e */
    public final vi3 f4464e = OwnerSnapshotObserver$onCommitAffectingLayout$1.f4282b;

    /* JADX INFO: renamed from: f */
    public final vi3 f4465f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f4283b;

    /* JADX INFO: renamed from: g */
    public final vi3 f4466g = C0350x82674389.f4284b;

    /* JADX INFO: renamed from: h */
    public final vi3 f4467h = OwnerSnapshotObserver$onCommitAffectingLookahead$1.f4285b;

    public C0364n(vi3 vi3Var) {
        this.f4460a = new ed9(vi3Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m1706a() {
        ed9 ed9Var = this.f4460a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = OwnerSnapshotObserver$clearInvalidObservations$1.f4281b;
        synchronized (ed9Var.f37076g) {
            try {
                x66 x66Var = ed9Var.f37075f;
                int i = x66Var.f67832c;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Object[] objArr = x66Var.f67830a;
                    if (i2 < i) {
                        dd9 dd9Var = (dd9) objArr[i2];
                        dd9Var.m10300d(ownerSnapshotObserver$clearInvalidObservations$1);
                        if (!dd9Var.f35459f.m17258j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = x66Var.f67830a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    } else {
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        x66Var.f67832c = i4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
