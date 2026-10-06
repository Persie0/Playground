package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhd extends jhf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f34035a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f34036b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f34037c;

    public jhd(Intent intent, Activity activity, int i) {
        this.f34035a = intent;
        this.f34036b = activity;
        this.f34037c = i;
    }

    @Override // p000.jhf
    /* JADX INFO: renamed from: a */
    public final void mo13181a() {
        Intent intent = this.f34035a;
        if (intent != null) {
            this.f34036b.startActivityForResult(intent, this.f34037c);
        }
    }
}
