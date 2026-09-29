package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mo2 extends View {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lb0 f51629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo2(lb0 lb0Var, Context context) {
        super(context);
        this.f51629a = lb0Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f51629a.run();
    }
}
