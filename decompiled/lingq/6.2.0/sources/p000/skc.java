package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class skc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f60963a = new C0282a(1893762595, false, new ce1(22));

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX INFO: renamed from: a */
    public static final long m21440a(yz7 yz7Var, boolean z) {
        int i;
        yz7Var.getClass();
        List list = yz7Var.f70706b;
        if (yz7Var.f70709e || list.isEmpty()) {
            return aa1.f412k;
        }
        if (z) {
            i = list.size() <= 1 ? 0 : 1;
        }
        try {
            return abd.m252h((String) list.get(i));
        } catch (Exception unused) {
            return aa1.f412k;
        }
    }
}
