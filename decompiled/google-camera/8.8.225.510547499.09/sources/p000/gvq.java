package p000;

import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gvq extends KeyguardManager.KeyguardDismissCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f26509a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Intent f26510b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gvr f26511c;

    public gvq(gvr gvrVar, boolean z, Intent intent) {
        this.f26511c = gvrVar;
        this.f26509a = z;
        this.f26510b = intent;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this.f26511c.f26512a);
        if (this.f26509a) {
            gvr gvrVar = this.f26511c;
            Intent intent = new Intent(gvrVar.f26512a, (Class<?>) gvrVar.f26514c);
            intent.setFlags(intent.getFlags() | 67108864).setAction("android.intent.action.MAIN");
            taskStackBuilderCreate.addNextIntent(intent);
        }
        taskStackBuilderCreate.addNextIntent(this.f26510b).startActivities();
    }
}
