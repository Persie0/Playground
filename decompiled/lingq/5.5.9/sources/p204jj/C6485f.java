package p204jj;

import ae.C0062b;
import com.lingq.util.C4924a;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;

/* JADX INFO: renamed from: jj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6485f implements InterfaceC6484e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f37080a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final C7138s f37081b;

    /* JADX INFO: renamed from: c */
    public final C7134o f37082c;

    /* JADX INFO: renamed from: d */
    public final C7138s f37083d;

    /* JADX INFO: renamed from: e */
    public final C7134o f37084e;

    /* JADX INFO: renamed from: f */
    public final C7138s f37085f;

    /* JADX INFO: renamed from: g */
    public final C7134o f37086g;

    public C6485f() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f37081b = c7138sM10448a;
        this.f37082c = C0062b.m303R(c7138sM10448a);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f37083d = c7138sM10448a2;
        this.f37084e = C0062b.m303R(c7138sM10448a2);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f37085f = c7138sM10448a3;
        this.f37086g = C0062b.m303R(c7138sM10448a3);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC7137r<Boolean> mo10155K0() {
        return this.f37086g;
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC7137r<Pair<Integer, Integer>> mo10156M0() {
        return this.f37084e;
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: T */
    public final void mo10157T(int i10) {
        this.f37080a.add(Integer.valueOf(i10));
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: W0 */
    public final void mo10158W0() {
        this.f37080a.clear();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: Z1 */
    public final List<Integer> mo10159Z1() {
        return C6752c.m13453u0(this.f37080a);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: i */
    public final void mo10160i(int i10, int i11) {
        this.f37083d.mo14371k(new Pair(Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC7137r<Boolean> mo10161m0() {
        return this.f37082c;
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: s0 */
    public final void mo10162s0() {
        this.f37085f.mo14371k(Boolean.TRUE);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: x1 */
    public final void mo10163x1() {
        this.f37081b.mo14371k(Boolean.TRUE);
    }
}
