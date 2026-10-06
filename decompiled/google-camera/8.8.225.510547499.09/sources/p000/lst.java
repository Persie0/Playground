package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lst implements lsa {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lsx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static final InputStream m15950b(lie lieVar) {
        InputStream inputStreamMo15936d = lieVar.f38295b.mo15936d((Uri) lieVar.f38294a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamMo15936d);
        if (!lieVar.f38296c.isEmpty()) {
            ?? r2 = lieVar.f38296c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                lsz lszVarM15956a = ((ltb) it.next()).m15956a();
                if (lszVarM15956a != null) {
                    arrayList2.add(lszVarM15956a);
                }
            }
            lrx lrxVar = !arrayList2.isEmpty() ? new lrx(inputStreamMo15936d, arrayList2) : null;
            if (lrxVar != null) {
                arrayList.add(lrxVar);
            }
        }
        for (ltc ltcVar : lieVar.f38297d) {
            arrayList.add(ltcVar.m15960c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // p000.lsa
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15928a(lie lieVar) {
        return m15950b(lieVar);
    }
}
