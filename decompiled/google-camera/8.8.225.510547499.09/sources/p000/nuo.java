package p000;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nuo implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final lpe f44672d = lpe.m15803s(BcwGDRhrTsnlj.fhDX);

    /* JADX INFO: renamed from: a */
    public final SQLiteOpenHelper f44673a;

    /* JADX INFO: renamed from: b */
    public final nug f44674b;

    /* JADX INFO: renamed from: c */
    public final mxk f44675c;

    public nuo(Context context, nud nudVar) {
        int size = nudVar.f44639a.size();
        lku.m15672z(size == 1, "schema must contain a single table, found %s", nudVar.f44639a.size());
        nug nugVar = (nug) nudVar.f44639a.get(0);
        this.f44674b = nugVar;
        HashSet hashSetM16750B = mpw.m16750B(nugVar.f44653b.size());
        Iterator it = nugVar.f44653b.iterator();
        while (it.hasNext()) {
            hashSetM16750B.add(((nuc) it.next()).f44636a);
        }
        this.f44675c = mxk.m17134F(hashSetM16750B);
        this.f44673a = new nun(this, context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44673a.close();
    }
}
