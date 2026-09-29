package p249lo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.C7073a;

/* JADX INFO: renamed from: lo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C7421n implements InterfaceC7415h<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7415h<Object> f41260a;

    public C7421n(C7423p c7423p) {
        this.f41260a = c7423p;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<Object> iterator() {
        List listM14267b3 = C7073a.m14267b3(this.f41260a);
        if (listM14267b3.size() > 1) {
            Collections.sort(listM14267b3);
        }
        return listM14267b3.iterator();
    }
}
