package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8533e extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f45824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f45825c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f45826d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f45827e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9907h f45828f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3110a f45829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8533e(C3110a c3110a, C9907h c9907h, int i10, String str, String str2, int i11, C9907h c9907h2) {
        super(c9907h);
        this.f45829g = c3110a;
        this.f45824b = i10;
        this.f45825c = str;
        this.f45826d = str2;
        this.f45827e = i11;
        this.f45828f = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C3110a c3110a = this.f45829g;
        try {
            InterfaceC9277y interfaceC9277y = (InterfaceC9277y) c3110a.f15893d.f47965n;
            String str = c3110a.f15890a;
            int i10 = this.f45824b;
            String str2 = this.f45825c;
            String str3 = this.f45826d;
            int i11 = this.f45827e;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i11);
            interfaceC9277y.mo17636O0(str, bundle, C3110a.m8952h(), new BinderC8551k(c3110a, this.f45828f));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
