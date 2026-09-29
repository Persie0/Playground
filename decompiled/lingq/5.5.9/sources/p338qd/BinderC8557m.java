package p338qd;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.C3110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p457wd.C9907h;
import p457wd.C9910k;

/* JADX INFO: renamed from: qd.m */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8557m extends BinderC8548j {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3110a f45919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8557m(C3110a c3110a, C9907h c9907h) {
        super(c3110a, c9907h);
        this.f45919c = c3110a;
    }

    @Override // p338qd.BinderC8548j, td.InterfaceC9251a0
    /* JADX INFO: renamed from: L0 */
    public final void mo16653L0(ArrayList arrayList) {
        super.mo16653L0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Bundle bundle = (Bundle) it.next();
            C3110a c3110a = this.f45919c;
            C8561n0 c8561n0 = c3110a.f15891b;
            ArrayList<String> arrayList3 = new ArrayList();
            C8584v c8584v = C8584v.f46020a;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap map = new HashMap();
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                map.put(str, AssetPackState.m8942i(bundle, str, c8561n0, c3110a.f15892c, c8584v));
            }
            for (String str2 : arrayList3) {
                map.put(str2, AssetPackState.m8941h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
            }
            AssetPackState assetPackState = (AssetPackState) new C8522a0(bundle.getLong("total_bytes_to_download"), map).f45788b.values().iterator().next();
            if (assetPackState == null) {
                C3110a.f15888g.m15812m("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int iMo8946d = assetPackState.mo8946d();
            if (iMo8946d != 1 && iMo8946d != 7 && iMo8946d != 2 && iMo8946d != 3) {
                z10 = false;
            }
            if (z10) {
                arrayList2.add(assetPackState.mo8945c());
            }
        }
        C9910k c9910k = this.f45886a.f50541a;
        synchronized (c9910k.f50543a) {
            if (c9910k.f50545c) {
                return;
            }
            c9910k.f50545c = true;
            c9910k.f50546d = arrayList2;
            c9910k.f50544b.m12895c(c9910k);
        }
    }
}
