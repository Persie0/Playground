package p127g1;

import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p385sf.C9000b;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: renamed from: g1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5659w extends AbstractC0664t0 implements InterfaceC5658v {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<C10022j, C9072e> f34495b;

    /* JADX INFO: renamed from: c */
    public long f34496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5659w(InterfaceC2052l<? super C10022j, C9072e> interfaceC2052l, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l2) {
        super(interfaceC2052l2);
        C5207g.m11111f(interfaceC2052l2, "inspectorInfo");
        this.f34495b = interfaceC2052l;
        this.f34496c = C9000b.m17236a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5659w)) {
            return false;
        }
        return C5207g.m11106a(this.f34495b, ((C5659w) obj).f34495b);
    }

    public final int hashCode() {
        return this.f34495b.hashCode();
    }

    @Override // p127g1.InterfaceC5658v
    /* JADX INFO: renamed from: j */
    public final void mo1438j(long j10) {
        if (C10022j.m18627a(this.f34496c, j10)) {
            return;
        }
        this.f34495b.mo528n(new C10022j(j10));
        this.f34496c = j10;
    }
}
