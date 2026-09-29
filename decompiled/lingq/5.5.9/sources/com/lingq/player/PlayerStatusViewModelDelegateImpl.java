package com.lingq.player;

import ae.C0062b;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.shared.repository.InterfaceC3324a;
import dm.C5207g;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerStatusViewModelDelegateImpl implements InterfaceC3301f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7882z f17724a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f17725b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3324a f17726c;

    /* JADX INFO: renamed from: d */
    public final StateFlowImpl f17727d;

    /* JADX INFO: renamed from: e */
    public final C7135p f17728e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f17729f;

    /* JADX INFO: renamed from: g */
    public final StateFlowImpl f17730g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f17731h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f17732i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f17733j;

    public PlayerStatusViewModelDelegateImpl(InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a, InterfaceC3324a interfaceC3324a) {
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        this.f17724a = interfaceC7882z;
        this.f17725b = executorC7177a;
        this.f17726c = interfaceC3324a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(EmptyList.f38032a);
        this.f17727d = stateFlowImplM14379a;
        this.f17728e = C0062b.m306S(stateFlowImplM14379a);
        this.f17729f = C7120g.m14379a(new C3297b(0));
        this.f17730g = C7120g.m14379a(new C3300e(0));
        this.f17731h = C7120g.m14379a(new C3296a(0));
        this.f17732i = C7120g.m14379a(AbstractC4267a.a.f27840a);
        this.f17733j = C7120g.m14379a(new Triple(null, Boolean.FALSE, 0));
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f17728e;
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f17732i;
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f17731h;
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f17727d.setValue(list);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        C7828f.m15570d(this.f17724a, this.f17725b, null, new PlayerStatusViewModelDelegateImpl$updateListenStat$1(this, str, i10, d10, null), 2);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f17729f;
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f17730g;
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f17733j;
    }
}
