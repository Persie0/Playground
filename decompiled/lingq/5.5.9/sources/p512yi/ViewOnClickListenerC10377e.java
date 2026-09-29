package p512yi;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import dm.C5207g;

/* JADX INFO: renamed from: yi.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10377e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52141a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CollectionsAdapter.AbstractC3739a.e f52142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CollectionsAdapter f52143c;

    public /* synthetic */ ViewOnClickListenerC10377e(CollectionsAdapter.AbstractC3739a.e eVar, CollectionsAdapter collectionsAdapter) {
        this.f52142b = eVar;
        this.f52143c = collectionsAdapter;
    }

    public /* synthetic */ ViewOnClickListenerC10377e(CollectionsAdapter collectionsAdapter, CollectionsAdapter.AbstractC3739a.e eVar) {
        this.f52143c = collectionsAdapter;
        this.f52142b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10 = this.f52141a;
        CollectionsAdapter.AbstractC3739a.e eVar = this.f52142b;
        CollectionsAdapter collectionsAdapter = this.f52143c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(eVar, "$item");
                collectionsAdapter.f24478f.mo9807g(eVar.f24488a.f24522a);
                break;
            default:
                C5207g.m11111f(eVar, "$item");
                C5207g.m11111f(collectionsAdapter, "this$0");
                LessonMediaSource lessonMediaSource = eVar.f24488a.f24522a.f36612r;
                if (lessonMediaSource != null && (str = lessonMediaSource.f22001c) != null) {
                    collectionsAdapter.f24478f.mo9819s(str);
                    break;
                }
                break;
        }
    }
}
