package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class afg implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aew f272a;

    public afg(View view, aew aewVar) {
        this.f272a = aewVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f272a.mo402a(view, ago.m602n(windowInsets, view)).m607e();
    }
}
