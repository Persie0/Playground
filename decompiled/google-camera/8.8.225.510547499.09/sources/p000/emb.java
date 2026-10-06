package p000;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emb implements ohi {

    /* JADX INFO: renamed from: a */
    private final gtd f14699a;

    public emb(gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14699a = gtdVar;
    }

    /* JADX INFO: renamed from: b */
    public static Window m7512b(gtd gtdVar) {
        Window window = ((Activity) gtdVar.f26334a).getWindow();
        window.getClass();
        return window;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Window get() {
        return m7512b(this.f14699a);
    }
}
