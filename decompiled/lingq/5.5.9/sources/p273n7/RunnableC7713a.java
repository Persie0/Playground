package p273n7;

import java.io.File;
import p216k7.C6626a;

/* JADX INFO: renamed from: n7.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7713a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42242b;

    public RunnableC7713a(String str, int i10) {
        this.f42241a = i10;
        this.f42242b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6626a.f37566f.m13255a().remove(this.f42241a);
        File file = new File(this.f42242b);
        if (file.exists()) {
            file.delete();
        }
    }
}
