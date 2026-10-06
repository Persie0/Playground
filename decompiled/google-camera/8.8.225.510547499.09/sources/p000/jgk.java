package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jgk implements jgl {

    /* JADX INFO: renamed from: a */
    protected final DataHolder f33965a;

    protected jgk(DataHolder dataHolder) {
        this.f33965a = dataHolder;
    }

    @Override // p000.jgl
    /* JADX INFO: renamed from: b */
    public int mo13134b() {
        throw null;
    }

    @Override // p000.jej
    /* JADX INFO: renamed from: ck */
    public final void mo12970ck() {
        DataHolder dataHolder = this.f33965a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo12970ck();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new onu(this, 1);
    }
}
