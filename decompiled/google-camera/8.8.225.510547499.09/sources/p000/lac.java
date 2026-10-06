package p000;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lac implements kyz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37802a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37803b;

    public lac(Object obj, int i) {
        this.f37803b = i;
        this.f37802a = obj;
    }

    public lac(Throwable th, int i) {
        this.f37803b = i;
        this.f37802a = th;
    }

    public lac(kzy kzyVar, int i) {
        this.f37803b = i;
        this.f37802a = kzyVar;
    }

    @Override // p000.kyz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo8768a(Object obj) throws Throwable {
        switch (this.f37803b) {
            case 0:
                kzy kzyVar = (kzy) obj;
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(((kzy) this.f37802a).getCause(), kzyVar);
                    break;
                } catch (Exception e) {
                }
                throw ((Throwable) this.f37802a);
            case 1:
                Throwable th = (Throwable) obj;
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, this.f37802a);
                    throw th;
                } catch (Exception e2) {
                    throw th;
                }
            default:
                return Pair.create(this.f37802a, obj);
        }
    }
}
