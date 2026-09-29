package p417ui;

import ae.C0062b;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.util.C4924a;
import kotlin.Pair;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;

/* JADX INFO: renamed from: ui.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9531b implements InterfaceC9530a {

    /* JADX INFO: renamed from: a */
    public final C7138s f49065a;

    /* JADX INFO: renamed from: b */
    public final C7134o f49066b;

    /* JADX INFO: renamed from: c */
    public final C7138s f49067c;

    /* JADX INFO: renamed from: d */
    public final C7134o f49068d;

    /* JADX INFO: renamed from: e */
    public final C7138s f49069e;

    /* JADX INFO: renamed from: f */
    public final C7134o f49070f;

    public C9531b() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f49065a = c7138sM10448a;
        this.f49066b = C0062b.m303R(c7138sM10448a);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f49067c = c7138sM10448a2;
        this.f49068d = C0062b.m303R(c7138sM10448a2);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f49069e = c7138sM10448a3;
        this.f49070f = C0062b.m303R(c7138sM10448a3);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: B1 */
    public final void mo9828B1() {
        this.f49065a.mo14371k(Boolean.TRUE);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: Q */
    public final InterfaceC7137r<Pair<FilterType, String>> mo9829Q() {
        return this.f49068d;
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC7137r<Boolean> mo9833g1() {
        return this.f49066b;
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: r1 */
    public final void mo9839r1(Pair<? extends FilterType, String> pair) {
        this.f49067c.mo14371k(pair);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: s1 */
    public final InterfaceC7137r<Boolean> mo9841s1() {
        return this.f49070f;
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: u1 */
    public final void mo9842u1() {
        this.f49069e.mo14371k(Boolean.TRUE);
    }
}
