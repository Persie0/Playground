package p000;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.sessions.settings.C1171c;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class r53 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58741a = 1;

    /* JADX INFO: renamed from: b */
    public final qo7 f58742b;

    /* JADX INFO: renamed from: c */
    public final qo7 f58743c;

    /* JADX INFO: renamed from: d */
    public final qo7 f58744d;

    public r53(qo7 qo7Var, qo7 qo7Var2, qo7 qo7Var3) {
        this.f58742b = qo7Var;
        this.f58743c = qo7Var2;
        this.f58744d = qo7Var3;
    }

    @Override // p000.so7
    public final Object get() {
        DataStore dataStoreCreate;
        int i = this.f58741a;
        qo7 qo7Var = this.f58744d;
        qo7 qo7Var2 = this.f58743c;
        qo7 qo7Var3 = this.f58742b;
        switch (i) {
            case 0:
                Context context = (Context) ((wy8) qo7Var).f67529b;
                kn1 kn1Var = (kn1) qo7Var3.get();
                vy8 vy8Var = (vy8) qo7Var2.get();
                context.getClass();
                kn1Var.getClass();
                vy8Var.getClass();
                ReplaceFileCorruptionHandler replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler(new C0011a9(vy8Var, 16));
                vl1 vl1VarM23619a = vz1.m23619a(kn1Var);
                w02 w02Var = new w02(context, 2);
                EmptyList emptyList = EmptyList.f47638a;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    dataStoreCreate = MultiProcessDataStoreFactory.INSTANCE.create(vy8Var, replaceFileCorruptionHandler, emptyList, vl1VarM23619a, w02Var);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    dataStoreCreate = DataStoreFactory.INSTANCE.create(vy8Var, replaceFileCorruptionHandler, emptyList, vl1VarM23619a, w02Var);
                }
                if (dataStoreCreate != null) {
                    return dataStoreCreate;
                }
                C3386nv.m17635v("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new C1171c((kn1) qo7Var3.get(), (r0a) qo7Var2.get(), (DataStore) qo7Var.get());
        }
    }

    public r53(wy8 wy8Var, qo7 qo7Var, qo7 qo7Var2) {
        this.f58744d = wy8Var;
        this.f58742b = qo7Var;
        this.f58743c = qo7Var2;
    }
}
