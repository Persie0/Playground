package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gm4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f41007b;

    public /* synthetic */ gm4(int i, ArrayList arrayList) {
        this.f41006a = i;
        this.f41007b = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f41006a;
        ArrayList arrayList = this.f41007b;
        switch (i) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                break;
            case 1:
                arrayList.get(((Number) obj).intValue());
                break;
            default:
                arrayList.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
