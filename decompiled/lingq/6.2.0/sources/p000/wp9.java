package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class wp9 {

    /* JADX INFO: renamed from: d */
    public static final String f67158d = oj5.m18041h("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f67159a;

    /* JADX INFO: renamed from: b */
    public final gr7 f67160b;

    /* JADX INFO: renamed from: c */
    public final boolean f67161c;

    public wp9(Context context, gr7 gr7Var, boolean z) {
        this.f67160b = gr7Var;
        this.f67159a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f67161c = z;
    }
}
