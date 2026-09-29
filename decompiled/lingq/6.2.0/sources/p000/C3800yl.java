package p000;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: yl */
/* JADX INFO: loaded from: classes2.dex */
public final class C3800yl implements InterfaceC2969em, lp3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f69968a;

    public /* synthetic */ C3800yl(ArrayList arrayList) {
        this.f69968a = arrayList;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: a */
    public m90 mo550a() {
        ArrayList arrayList = this.f69968a;
        return ((kj4) arrayList.get(0)).m15271c() ? new bp3(1, arrayList) : new j57(arrayList);
    }

    @Override // p000.lp3
    /* JADX INFO: renamed from: b */
    public void mo12678b(String str, String str2) {
        str2.getClass();
        this.f69968a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2)));
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: c */
    public List mo551c() {
        return this.f69968a;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: d */
    public boolean mo552d() {
        ArrayList arrayList = this.f69968a;
        return arrayList.size() == 1 && ((kj4) arrayList.get(0)).m15271c();
    }
}
