package fj;

import ae.C0062b;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Triple;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: renamed from: fj.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5548i implements InterfaceC5547h {

    /* JADX INFO: renamed from: a */
    public final C7138s f34287a;

    /* JADX INFO: renamed from: b */
    public final C7134o f34288b;

    /* JADX INFO: renamed from: c */
    public final C7138s f34289c;

    /* JADX INFO: renamed from: d */
    public final C7134o f34290d;

    /* JADX INFO: renamed from: e */
    public final C7138s f34291e;

    /* JADX INFO: renamed from: f */
    public final C7134o f34292f;

    /* JADX INFO: renamed from: g */
    public final C7138s f34293g;

    /* JADX INFO: renamed from: h */
    public final C7134o f34294h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f34295i;

    /* JADX INFO: renamed from: j */
    public final C7135p f34296j;

    /* JADX INFO: renamed from: k */
    public final C7138s f34297k;

    /* JADX INFO: renamed from: l */
    public final C7134o f34298l;

    public C5548i() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f34287a = c7138sM10448a;
        this.f34288b = C0062b.m303R(c7138sM10448a);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f34289c = c7138sM10448a2;
        this.f34290d = C0062b.m303R(c7138sM10448a2);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f34291e = c7138sM10448a3;
        this.f34292f = C0062b.m303R(c7138sM10448a3);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f34293g = c7138sM10448a4;
        this.f34294h = C0062b.m303R(c7138sM10448a4);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(new C5546g(null, 127));
        this.f34295i = stateFlowImplM14379a;
        this.f34296j = C0062b.m306S(stateFlowImplM14379a);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f34297k = c7138sM10448a5;
        this.f34298l = C0062b.m303R(c7138sM10448a5);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: C */
    public final InterfaceC7137r<UserImportDetailType> mo10075C() {
        return this.f34290d;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: F */
    public final InterfaceC7137r<Integer> mo10076F() {
        return this.f34298l;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: K1 */
    public final void mo10077K1() {
        this.f34293g.mo14371k(Boolean.TRUE);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: P0 */
    public final void mo10078P0(Triple<? extends UserImportDetailType, String, Boolean> triple) {
        this.f34291e.mo14371k(triple);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: R */
    public final InterfaceC7137r<Boolean> mo10079R() {
        return this.f34294h;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: T1 */
    public final InterfaceC7142w<C5546g> mo10080T1() {
        return this.f34296j;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: V1 */
    public final void mo10081V1(int i10) {
        this.f34297k.mo14371k(Integer.valueOf(i10));
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7137r<Boolean> mo10082c2() {
        return this.f34288b;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: e */
    public final void mo10083e(UserImportDetailType userImportDetailType) {
        C5207g.m11111f(userImportDetailType, "userImportDetailType");
        this.f34289c.mo14371k(userImportDetailType);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> mo10084o1() {
        return this.f34292f;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: v0 */
    public final void mo10085v0(C5546g c5546g) {
        this.f34295i.setValue(c5546g);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: w */
    public final void mo10086w() {
        this.f34287a.mo14371k(Boolean.TRUE);
    }
}
