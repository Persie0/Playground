package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import java.util.ArrayList;
import java.util.List;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8527c extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f45798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9907h f45799c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3110a f45800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8527c(C3110a c3110a, C9907h c9907h, List list, C9907h c9907h2) {
        super(c9907h);
        this.f45800d = c3110a;
        this.f45798b = list;
        this.f45799c = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C3110a c3110a = this.f45800d;
        List<String> list = this.f45798b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            ((InterfaceC9277y) c3110a.f15893d.f47965n).mo17637V(c3110a.f15890a, arrayList, C3110a.m8952h(), new BinderC8551k(c3110a, this.f45799c));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "cancelDownloads(%s)", list);
        }
    }
}
