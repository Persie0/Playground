package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8542h extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f45856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f45857c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f45858d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f45859e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9907h f45860f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3110a f45861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8542h(C3110a c3110a, C9907h c9907h, int i10, String str, String str2, int i11, C9907h c9907h2) {
        super(c9907h);
        this.f45861g = c3110a;
        this.f45856b = i10;
        this.f45857c = str;
        this.f45858d = str2;
        this.f45859e = i11;
        this.f45860f = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C9907h c9907h = this.f45860f;
        int i10 = this.f45856b;
        int i11 = this.f45859e;
        String str = this.f45858d;
        String str2 = this.f45857c;
        C3110a c3110a = this.f45861g;
        try {
            InterfaceC9277y interfaceC9277y = (InterfaceC9277y) c3110a.f15893d.f47965n;
            String str3 = c3110a.f15890a;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str);
            bundle.putInt("chunk_number", i11);
            interfaceC9277y.mo17640k(str3, bundle, C3110a.m8952h(), new BinderC8554l(c3110a, c9907h));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15812m("getChunkFileDescriptor(%s, %s, %d, session=%d)", str2, str, Integer.valueOf(i11), Integer.valueOf(i10));
            c9907h.m18407a(new RuntimeException(e10));
        }
    }
}
