package p014aj;

import ae.C0062b;
import com.lingq.util.C4924a;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;

/* JADX INFO: renamed from: aj.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0101r implements InterfaceC0100q {

    /* JADX INFO: renamed from: a */
    public final C7134o f255a = C0062b.m303R(C4924a.m10448a());

    /* JADX INFO: renamed from: b */
    public final C7138s f256b;

    /* JADX INFO: renamed from: c */
    public final C7134o f257c;

    public C0101r() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f256b = c7138sM10448a;
        this.f257c = C0062b.m303R(c7138sM10448a);
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: c0 */
    public final void mo487c0() {
        this.f256b.mo14371k(Boolean.TRUE);
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: d0 */
    public final InterfaceC7137r<Boolean> mo488d0() {
        return this.f257c;
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: m1 */
    public final InterfaceC7137r<String> mo489m1() {
        return this.f255a;
    }
}
