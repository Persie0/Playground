package p479xa;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: renamed from: xa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10131b {
    /* JADX INFO: renamed from: a */
    public static ImmutableList m19007a(InterfaceC2409f.a aVar, ArrayList arrayList) {
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            c3146a.m9055b(aVar.mo7014g(bundle));
        }
        return c3146a.m9068e();
    }
}
