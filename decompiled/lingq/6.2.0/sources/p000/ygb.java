package p000;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ygb extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jgb f69831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygb(jgb jgbVar) {
        super(null);
        this.f69831a = jgbVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        jgb jgbVar = this.f69831a;
        synchronized (jgbVar.f45529d) {
            jgbVar.f45530e = null;
        }
        jgb jgbVar2 = this.f69831a;
        synchronized (jgbVar2.f45531f) {
            try {
                Iterator it = jgbVar2.f45532g.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
