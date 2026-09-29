package p000;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class q53 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57287a;

    /* JADX INFO: renamed from: b */
    public final wy8 f57288b;

    /* JADX INFO: renamed from: c */
    public final qo7 f57289c;

    public q53(qo7 qo7Var, wy8 wy8Var) {
        this.f57287a = 2;
        this.f57289c = qo7Var;
        this.f57288b = wy8Var;
    }

    @Override // p000.so7
    public final Object get() {
        DataStore dataStoreCreate;
        int i = this.f57287a;
        wy8 wy8Var = this.f57288b;
        qo7 qo7Var = this.f57289c;
        switch (i) {
            case 0:
                Context context = (Context) wy8Var.f67529b;
                kn1 kn1Var = (kn1) qo7Var.get();
                context.getClass();
                kn1Var.getClass();
                ho5 ho5Var = ho5.f42706j;
                ReplaceFileCorruptionHandler replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler(new C2951e4(23));
                vl1 vl1VarM23619a = vz1.m23619a(kn1Var);
                w02 w02Var = new w02(context, 1);
                EmptyList emptyList = EmptyList.f47638a;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    dataStoreCreate = MultiProcessDataStoreFactory.INSTANCE.create(ho5Var, replaceFileCorruptionHandler, emptyList, vl1VarM23619a, w02Var);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    dataStoreCreate = DataStoreFactory.INSTANCE.create(ho5Var, replaceFileCorruptionHandler, emptyList, vl1VarM23619a, w02Var);
                }
                if (dataStoreCreate != null) {
                    return dataStoreCreate;
                }
                C3386nv.m17635v("Cannot return null from a non-@Nullable @Provides method");
                return null;
            case 1:
                return new zk7((Context) wy8Var.f67529b, (lna) qo7Var.get());
            default:
                return new q58((C3384nt) qo7Var.get(), (kn1) wy8Var.f67529b);
        }
    }

    public /* synthetic */ q53(wy8 wy8Var, qo7 qo7Var, int i) {
        this.f57287a = i;
        this.f57288b = wy8Var;
        this.f57289c = qo7Var;
    }
}
