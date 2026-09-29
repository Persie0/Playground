package p035c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import dm.C5207g;

/* JADX INFO: renamed from: c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1644d extends AbstractC1641a<Intent, ActivityResult> {
    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: a */
    public final Intent mo3677a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        C5207g.m11111f(componentActivity, "context");
        C5207g.m11111f(intent, "input");
        return intent;
    }

    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: c */
    public final Object mo3678c(Intent intent, int i10) {
        return new ActivityResult(intent, i10);
    }
}
