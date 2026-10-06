package p000;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhe extends jhf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f34038a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ jft f34039b;

    public jhe(Intent intent, jft jftVar) {
        this.f34038a = intent;
        this.f34039b = jftVar;
    }

    @Override // p000.jhf
    /* JADX INFO: renamed from: a */
    public final void mo13181a() {
        Intent intent = this.f34038a;
        if (intent != null) {
            this.f34039b.startActivityForResult(intent, 2);
        }
    }
}
