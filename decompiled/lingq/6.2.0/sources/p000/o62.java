package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o62 implements li7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53888a;

    @Override // p000.li7
    public final boolean apply(Object obj) {
        switch (this.f53888a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
