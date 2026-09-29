package p000;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class je3 implements ie3 {

    /* JADX INFO: renamed from: a */
    public final String f45464a;

    /* JADX INFO: renamed from: b */
    public final int f45465b;

    /* JADX INFO: renamed from: c */
    public final int f45466c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0638f f45467d;

    public je3(AbstractC0638f abstractC0638f, String str, int i, int i2) {
        this.f45467d = abstractC0638f;
        this.f45464a = str;
        this.f45465b = i;
        this.f45466c = i2;
    }

    @Override // p000.ie3
    /* JADX INFO: renamed from: a */
    public final boolean mo2126a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0638f abstractC0638f = this.f45467d;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = abstractC0638f.f5723A;
        if (abstractComponentCallbacksC0635c != null && this.f45465b < 0 && this.f45464a == null && abstractComponentCallbacksC0635c.m2106h().m2150W(-1, 0)) {
            return false;
        }
        return abstractC0638f.m2151X(arrayList, arrayList2, this.f45464a, this.f45465b, this.f45466c);
    }
}
