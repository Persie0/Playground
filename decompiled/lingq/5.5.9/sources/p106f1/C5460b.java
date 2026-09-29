package p106f1;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5460b extends InterfaceC0500b.c implements InterfaceC5459a {

    /* JADX INFO: renamed from: k */
    public InterfaceC2052l<? super C5461c, Boolean> f34026k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2052l<? super C5461c, Boolean> f34027l = null;

    public C5460b(InterfaceC2052l interfaceC2052l) {
        this.f34026k = interfaceC2052l;
    }

    @Override // p106f1.InterfaceC5459a
    /* JADX INFO: renamed from: B */
    public final boolean mo11699B(C5461c c5461c) {
        InterfaceC2052l<? super C5461c, Boolean> interfaceC2052l = this.f34026k;
        if (interfaceC2052l != null) {
            return interfaceC2052l.mo528n(c5461c).booleanValue();
        }
        return false;
    }

    @Override // p106f1.InterfaceC5459a
    /* JADX INFO: renamed from: i */
    public final boolean mo11700i(C5461c c5461c) {
        InterfaceC2052l<? super C5461c, Boolean> interfaceC2052l = this.f34027l;
        if (interfaceC2052l != null) {
            return interfaceC2052l.mo528n(c5461c).booleanValue();
        }
        return false;
    }
}
