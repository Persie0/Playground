package p000;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class jgo extends jgq {

    /* JADX INFO: renamed from: a */
    public final int f33971a;

    /* JADX INFO: renamed from: b */
    public final Bundle f33972b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ jgw f33973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected jgo(jgw jgwVar, int i, Bundle bundle) {
        super(jgwVar, true);
        this.f33973c = jgwVar;
        this.f33971a = i;
        this.f33972b = bundle;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo13142a(jcu jcuVar);

    @Override // p000.jgq
    /* JADX INFO: renamed from: b */
    protected final void mo13143b() {
    }

    /* JADX INFO: renamed from: c */
    protected abstract boolean mo13144c();

    @Override // p000.jgq
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ void mo13145d() {
        if (this.f33971a != 0) {
            this.f33973c.m13151K(1, null);
            Bundle bundle = this.f33972b;
            mo13142a(new jcu(this.f33971a, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (mo13144c()) {
                return;
            }
            this.f33973c.m13151K(1, null);
            mo13142a(new jcu(8, null));
        }
    }
}
