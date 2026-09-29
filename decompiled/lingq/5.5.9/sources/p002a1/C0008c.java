package p002a1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import p338qd.C8573r0;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0008c implements InterfaceC0007b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<C0006a, Boolean> f5a;

    /* JADX INFO: renamed from: b */
    public final ParcelableSnapshotMutableState f6b;

    public C0008c(int i10, InterfaceC2052l interfaceC2052l) {
        this.f5a = interfaceC2052l;
        this.f6b = C8573r0.m16684L0(new C0006a(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002a1.InterfaceC0007b
    /* JADX INFO: renamed from: a */
    public final int mo15a() {
        return ((C0006a) this.f6b.getValue()).f4a;
    }
}
