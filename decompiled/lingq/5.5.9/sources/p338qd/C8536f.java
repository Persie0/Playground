package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8536f extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f45832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f45833c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9907h f45834d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f45835e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3110a f45836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8536f(C3110a c3110a, C9907h c9907h, int i10, String str, C9907h c9907h2, int i11) {
        super(c9907h);
        this.f45836f = c3110a;
        this.f45832b = i10;
        this.f45833c = str;
        this.f45834d = c9907h2;
        this.f45835e = i11;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        try {
            C3110a c3110a = this.f45836f;
            InterfaceC9277y interfaceC9277y = (InterfaceC9277y) c3110a.f15893d.f47965n;
            String str = c3110a.f15890a;
            int i10 = this.f45832b;
            String str2 = this.f45833c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            interfaceC9277y.mo17641u(str, bundle, C3110a.m8952h(), new BinderC8563o(this.f45836f, this.f45834d, this.f45832b, this.f45833c, this.f45835e));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
