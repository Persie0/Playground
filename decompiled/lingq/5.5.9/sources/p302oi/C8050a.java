package p302oi;

import com.lingq.p055ui.MainActivity;
import p020b.InterfaceC1275b;

/* JADX INFO: renamed from: oi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8050a implements InterfaceC1275b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC8051b f43733a;

    public C8050a(AbstractActivityC8051b abstractActivityC8051b) {
        this.f43733a = abstractActivityC8051b;
    }

    @Override // p020b.InterfaceC1275b
    /* JADX INFO: renamed from: a */
    public final void mo812a() {
        AbstractActivityC8051b abstractActivityC8051b = this.f43733a;
        if (abstractActivityC8051b.f43736V) {
            return;
        }
        abstractActivityC8051b.f43736V = true;
        ((InterfaceC8054e) abstractActivityC8051b.mo469d()).mo15084e((MainActivity) abstractActivityC8051b);
    }
}
