package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2020m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.InterfaceC7882z;
import p225kk.C6715l;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/session/magiclink/EmailLoginViewModel;", "Landroidx/lifecycle/h0;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class EmailLoginViewModel extends AbstractC1036h0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f30914d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f30915e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f30916f;

    /* JADX INFO: renamed from: g */
    public final C7135p f30917g;

    /* JADX INFO: renamed from: h */
    public final C7138s f30918h;

    /* JADX INFO: renamed from: i */
    public final C7134o f30919i;

    /* JADX INFO: renamed from: j */
    public final C7138s f30920j;

    /* JADX INFO: renamed from: k */
    public final C7134o f30921k;

    public EmailLoginViewModel(InterfaceC2020m interfaceC2020m, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        this.f30914d = interfaceC2020m;
        this.f30915e = executorC7177a;
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(status);
        this.f30916f = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f30917g = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, status);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30918h = c7138sM10448a;
        this.f30919i = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f30920j = c7138sM10448a2;
        this.f30921k = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
    }
}
