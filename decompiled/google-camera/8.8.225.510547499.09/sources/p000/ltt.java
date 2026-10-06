package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltt implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39198a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39199b;

    public /* synthetic */ ltt(IOException iOException, int i) {
        this.f39199b = i;
        this.f39198a = iOException;
    }

    public /* synthetic */ ltt(mrf mrfVar, int i) {
        this.f39199b = i;
        this.f39198a = mrfVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mrf] */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) throws Throwable {
        switch (this.f39199b) {
            case 0:
                Object obj2 = this.f39198a;
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(obj2, (IOException) obj);
                    break;
                } catch (Exception e) {
                }
                throw ((Throwable) obj2);
            default:
                return kxk.m14965K(this.f39198a.apply(obj));
        }
    }
}
