package com.lingq.p055ui.goals;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import no.InterfaceC7882z;
import p225kk.C6715l;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/goals/InstagramShareViewModel;", "Landroidx/lifecycle/h0;", "Landroidx/lifecycle/c0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/c0;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class InstagramShareViewModel extends AbstractC1036h0 {

    /* JADX INFO: renamed from: d */
    public final String f22648d;

    /* JADX INFO: renamed from: e */
    public final C7138s f22649e;

    /* JADX INFO: renamed from: f */
    public final C7134o f22650f;

    /* JADX INFO: renamed from: g */
    public final C7138s f22651g;

    /* JADX INFO: renamed from: h */
    public final C7134o f22652h;

    public InstagramShareViewModel(C1024c0 c1024c0) {
        C5207g.m11111f(c1024c0, "savedStateHandle");
        String str = (String) c1024c0.m3929b("title");
        this.f22648d = str == null ? "" : str;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f22649e = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f22650f = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f22651g = c7138sM10448a2;
        this.f22652h = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
    }
}
