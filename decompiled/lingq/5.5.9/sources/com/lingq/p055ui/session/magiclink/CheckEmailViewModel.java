package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
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
import p032bk.C1604a;
import p225kk.C6715l;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/session/magiclink/CheckEmailViewModel;", "Landroidx/lifecycle/h0;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CheckEmailViewModel extends AbstractC1036h0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f30870d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f30871e;

    /* JADX INFO: renamed from: f */
    public final C1604a f30872f;

    /* JADX INFO: renamed from: g */
    public final StateFlowImpl f30873g;

    /* JADX INFO: renamed from: h */
    public final C7135p f30874h;

    /* JADX INFO: renamed from: i */
    public final C7138s f30875i;

    /* JADX INFO: renamed from: j */
    public final C7134o f30876j;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public CheckEmailViewModel(InterfaceC2020m interfaceC2020m, ExecutorC7177a executorC7177a, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30870d = interfaceC2020m;
        this.f30871e = executorC7177a;
        if (!c1024c0.f6616a.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String str = (String) c1024c0.m3929b("email");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value");
        }
        this.f30872f = new C1604a(str);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(status);
        this.f30873g = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f30874h = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, status);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30875i = c7138sM10448a;
        this.f30876j = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
    }
}
