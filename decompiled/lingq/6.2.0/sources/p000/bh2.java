package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final String f8533a;

    /* JADX INFO: renamed from: b */
    public final long f8534b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f8535c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh2 f8536d;

    public bh2(gh2 gh2Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.f8536d = gh2Var;
        this.f8533a = str;
        this.f8534b = j;
        this.f8535c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f8535c.iterator();
        while (it.hasNext()) {
            icb.m13766b((yd9) it.next());
        }
    }
}
