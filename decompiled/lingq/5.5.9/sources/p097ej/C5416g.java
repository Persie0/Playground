package p097ej;

import ae.C0062b;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;

/* JADX INFO: renamed from: ej.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5416g implements InterfaceC5415f {

    /* JADX INFO: renamed from: a */
    public final C7138s f33851a;

    /* JADX INFO: renamed from: b */
    public final C7134o f33852b;

    /* JADX INFO: renamed from: c */
    public final C7138s f33853c;

    /* JADX INFO: renamed from: d */
    public final C7134o f33854d;

    /* JADX INFO: renamed from: e */
    public final C7138s f33855e;

    /* JADX INFO: renamed from: f */
    public final C7134o f33856f;

    public C5416g() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f33851a = c7138sM10448a;
        this.f33852b = C0062b.m303R(c7138sM10448a);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f33853c = c7138sM10448a2;
        this.f33854d = C0062b.m303R(c7138sM10448a2);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f33855e = c7138sM10448a3;
        this.f33856f = C0062b.m303R(c7138sM10448a3);
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: Y0 */
    public final void mo10040Y0() {
        this.f33851a.mo14371k(Boolean.TRUE);
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e1 */
    public final void mo10046e1() {
        this.f33855e.mo14371k(Boolean.TRUE);
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e2 */
    public final InterfaceC7137r<Boolean> mo10047e2() {
        return this.f33856f;
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: h1 */
    public final void mo10050h1(FilterType filterType) {
        C5207g.m11111f(filterType, "filterType");
        this.f33853c.mo14371k(filterType);
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: k */
    public final InterfaceC7137r<Boolean> mo10052k() {
        return this.f33852b;
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: n1 */
    public final InterfaceC7137r<FilterType> mo10055n1() {
        return this.f33854d;
    }
}
