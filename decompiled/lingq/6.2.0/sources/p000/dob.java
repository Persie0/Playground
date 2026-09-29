package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dob implements Callable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dob f35975b = new dob(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dob f35976c = new dob(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35977a;

    public /* synthetic */ dob(int i) {
        this.f35977a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f35977a) {
            case 0:
                mp2 mp2Var = k06.f46482e;
                return null;
            default:
                p3d p3dVar = new p3d("internal.platform", 4);
                p3dVar.f65550b.put("getVersion", new p3d("getVersion", 3));
                return p3dVar;
        }
    }
}
