package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eme implements ohi {

    /* JADX INFO: renamed from: a */
    private final gtd f14702a;

    public eme(gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14702a = gtdVar;
    }

    /* JADX INFO: renamed from: b */
    public static eme m7516b(gtd gtdVar) {
        return new eme(gtdVar, null, null, null, null);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Intent get() {
        Intent intent = ((Activity) this.f14702a.f26334a).getIntent();
        intent.getClass();
        return intent;
    }
}
