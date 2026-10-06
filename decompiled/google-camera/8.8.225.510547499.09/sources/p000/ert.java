package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ert implements ohi {

    /* JADX INFO: renamed from: a */
    private final C1058va f15266a;

    public ert(C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f15266a = c1058va;
    }

    /* JADX INFO: renamed from: b */
    public static ert m7748b(C1058va c1058va) {
        return new ert(c1058va, null, null, null, null);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bko get() {
        return new bko((Activity) this.f15266a.f47803b);
    }
}
